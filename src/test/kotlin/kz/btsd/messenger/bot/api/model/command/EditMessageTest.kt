package kz.btsd.messenger.bot.api.model.command

import kz.btsd.messenger.bot.api.helpers.duplicate
import kz.btsd.messenger.bot.api.helpers.invalidInlineCommand
import kz.btsd.messenger.bot.api.helpers.randomUuid
import kz.btsd.messenger.bot.api.helpers.validEditMessage
import kz.btsd.messenger.bot.api.helpers.validInlineCommand
import kz.btsd.messenger.bot.api.helpers.validInputMedia
import kz.btsd.messenger.bot.api.model.peer.PeerUser
import kz.btsd.messenger.bot.api.validation.Content
import kz.btsd.messenger.bot.api.validation.InlineCommandTableSize
import kz.btsd.messenger.bot.api.validation.InlineCommandsSize
import kz.btsd.messenger.bot.api.validation.MediaList
import kz.btsd.messenger.bot.api.validation.TimeUuid
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import javax.validation.Valid

internal class EditMessageTest : ValidatorTest() {

    @Test
    fun `messageId must not be empty`() {
        EditMessage(
            messageId = "",
            recipient = PeerUser(id = randomUuid())
        ).violates(TimeUuid::class)
    }

    @Test
    fun `messageId must be timeuuid`() {
        message().copy(messageId = "id").violates(TimeUuid::class)
    }

    @Test
    fun `messageId max size is 255`() {
        EditMessage(
            messageId = 'd'.duplicate(256),
            recipient = PeerUser(id = randomUuid())
        ).violates(TimeUuid::class)
    }

    @Test
    fun `content max size is 4096`() {
        message().copy(
            content = 'c'.duplicate(4097)
        ).violates(Content::class)
    }

    @Test
    fun `max size of inline commands is 25`() {
        message().copy(
            inlineCommands = List(26) { validInlineCommand() }
        ).violates(InlineCommandsSize::class)
    }

    @Test
    fun `max number of inline rows is 25`() {
        val rows = List(26) { listOf(validInlineCommand()) }
        message().copy(inlineCommandRows = rows).violates(InlineCommandTableSize::class)
    }

    @Test
    fun `max size of inline rows is 10`() {
        val rows = listOf(List(11) { validInlineCommand() })
        message().copy(inlineCommandRows = rows).violates(InlineCommandTableSize::class)
    }

    @Test
    fun `each inline command is validated`() {
        val (cmd, err) = invalidInlineCommand()
        val rows = listOf(listOf(cmd), listOf(cmd), listOf(cmd))
        message().copy(inlineCommandRows = rows).violates(err)
    }

    @Test
    fun `max size of medialist is 10`() {
        message().copy(
            mediaList = List(101) { validInputMedia() }
        ).violates(MediaList::class)
    }

    @Test
    fun `valid message`() {
        message().copy(
            inlineCommands = List(25) { validInlineCommand() },
            content = 'c'.duplicate(4096),
            mediaList = List(100) { validInputMedia() }
        ).noViolations()
    }

    @Test
    fun `validate a method with message as a param`() {
        val msg = message().copy(messageId = "id")

        val method = EditMessageController::class.java.getMethod("process", EditMessage::class.java, String::class.java)
        val violations = validator.forExecutables().validateParameters(
            EditMessageController(),
            method,
            arrayOf(msg, "")
        )
        assertThat(violations).isNotEmpty
    }

    @Test
    fun `inline commands are validated`() {
        val (command, error) = invalidInlineCommand()
        message().copy(inlineCommands = listOf(command)).violates(error)
    }

    private fun message() = validEditMessage()
}

@Suppress("UNUSED_PARAMETER")
private class EditMessageController {
    fun process(@Valid message: EditMessage, another: String) {
    }
}
