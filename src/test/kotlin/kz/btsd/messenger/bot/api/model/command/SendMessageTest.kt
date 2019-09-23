package kz.btsd.messenger.bot.api.model.command

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import kz.btsd.messenger.bot.api.helpers.duplicate
import kz.btsd.messenger.bot.api.helpers.invalidInlineCommand
import kz.btsd.messenger.bot.api.helpers.invalidUiState
import kz.btsd.messenger.bot.api.helpers.randomUuid
import kz.btsd.messenger.bot.api.helpers.validInlineCommand
import kz.btsd.messenger.bot.api.helpers.validInlineCommandTable
import kz.btsd.messenger.bot.api.helpers.validInlineCommands
import kz.btsd.messenger.bot.api.helpers.validInputMedia
import kz.btsd.messenger.bot.api.model.peer.PeerUser
import kz.btsd.messenger.bot.api.validation.Content
import kz.btsd.messenger.bot.api.validation.InlineCommandTableSize
import kz.btsd.messenger.bot.api.validation.InlineCommandsSize
import kz.btsd.messenger.bot.api.validation.LocalId
import kz.btsd.messenger.bot.api.validation.MediaList
import kz.btsd.messenger.bot.api.validation.TimeUuid
import kz.btsd.messenger.bot.api.validation.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SendMessageTest : ValidatorTest() {

    @Test
    fun `localId can be null`() {
        message().copy(localId = null).noViolations()
    }

    @Test
    fun `localId cannot be longer than 255`() {
        message().copy(localId = 'q'.duplicate(256)).violates(LocalId::class)
    }

    @Test
    fun `replyId must be timeuuid`() {
        message().copy(replyToMessageId = "id").violates(TimeUuid::class)
    }

    @Test
    fun `replyId can be null`() {
        message().copy(replyToMessageId = null).noViolations()
    }

    @Test
    fun `replyId cannot be empty`() {
        message().copy(replyToMessageId = "").violates(TimeUuid::class)
    }

    @Test
    fun `content length cannot be over 4096`() {
        message().copy(content = 'c'.duplicate(4097)).violates(Content::class)
    }

    @Test
    fun `inline commands are validated`() {
        val (command, error) = invalidInlineCommand()
        message().copy(inlineCommands = listOf(command)).violates(error)
    }

    @Test
    fun `max size of inline commands is 8`() {
        message().copy(
            inlineCommands = List(9) { validInlineCommand() }
        ).violates(InlineCommandsSize::class)
    }

    @Test
    fun `max number of inline rows is 8`() {
        val rows = List(9) { listOf(validInlineCommand()) }
        message().copy(
            inlineCommandRows = rows
        ).violates(InlineCommandTableSize::class)
    }

    @Test
    fun `max size of inline rows is 8`() {
        val rows = listOf(List(9) { validInlineCommand() })
        message().copy(
            inlineCommandRows = rows
        ).violates(InlineCommandTableSize::class)
    }

    @Test
    fun `each inline command is validated`() {
        val (cmd, err) = invalidInlineCommand()
        val rows = listOf(listOf(cmd), listOf(cmd), listOf(cmd))
        message().copy(
            inlineCommandRows = rows
        ).violates(err)
    }

    @Test
    fun `unmarshalls json with inline command rows`() {
        val table = listOf(
            listOf(validInlineCommand(), validInlineCommand()),
            listOf(validInlineCommand(), validInlineCommand())
        )
        val jsonObject = mapOf(
            "type" to "SendMessage",
            "recipient" to PeerUser(randomUuid()),
            "content" to "",
            "inlineCommandRows" to table
        )
        val json = jacksonObjectMapper().writeValueAsString(jsonObject)
        val msg = jacksonObjectMapper().readValue(json, SendMessage::class.java)

        assertThat(msg.inlineCommandRows).isEqualTo(table)
    }

    @Test
    fun `uiState is validated`() {
        val (uiState, error) = invalidUiState()
        message().copy(uiState = uiState).violates(error)
    }

    @Test
    fun `mediaList max size is 100`() {
        message().copy(mediaList = List(101) { validInputMedia() })
            .violates(MediaList::class)
    }

    @Test
    fun `peerUserId is inccorect`() {
        message().copy(recipient = PeerUser("someWrongId"))
            .violates(UUID::class)
    }

    private fun message() = SendMessage(
        localId = 'e'.duplicate(255),
        recipient = PeerUser(randomUuid()),
        inlineCommands = validInlineCommands(),
        inlineCommandRows = validInlineCommandTable(),
        mediaList = List(100) { validInputMedia() },
        content = 'h'.duplicate(4096)
    )
}
