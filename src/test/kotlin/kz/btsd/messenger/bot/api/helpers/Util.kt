package kz.btsd.messenger.bot.api.helpers

import com.fasterxml.uuid.Generators
import kz.btsd.messenger.bot.api.model.command.EditMessage
import kz.btsd.messenger.bot.api.model.command.InlineCommand
import kz.btsd.messenger.bot.api.model.command.QuickButtonCommand
import kz.btsd.messenger.bot.api.model.command.ReplyCommand
import kz.btsd.messenger.bot.api.model.command.UiState
import kz.btsd.messenger.bot.api.model.media.InputMedia
import kz.btsd.messenger.bot.api.model.peer.PeerUser
import kz.btsd.messenger.bot.api.validation.CommandCaption
import kz.btsd.messenger.bot.api.validation.CommandMetadata
import kz.btsd.messenger.bot.api.validation.MAX_INLINE_CMD_ROWS
import kz.btsd.messenger.bot.api.validation.MAX_INLINE_CMD_ROW_SIZE
import kz.btsd.messenger.bot.api.validation.TimeUuid
import java.util.UUID

private val uuidGen = Generators.timeBasedGenerator()
internal fun timeUuid() = uuidGen.generate().toString()
internal fun randomUuid() = UUID.randomUUID().toString()

internal fun Char.duplicate(length: Int): String = buildString(length) {
    repeat(length) {
        append(this@duplicate)
    }
}

internal fun invalidInlineCommand() = InlineCommand('q'.duplicate(300), "metadata") to CommandCaption::class
internal fun validInlineCommand() = InlineCommand("command", "poll?pollId=123456&selectedOption=4")

internal fun validQuickButtonCommand() = QuickButtonCommand("press me", QuickButtonCommand.QuickButtonAction.QUICK_FORM_ACTION)
internal fun invalidQuickButtonCommand() =
    validQuickButtonCommand().copy(metadata = 'q'.duplicate(256)) to CommandMetadata::class

internal fun invalidReplyCommand() =
    ReplyCommand('q'.duplicate(33)) to CommandCaption::class

internal fun validInputMedia() = InputMedia(randomUuid(), "media", InputMedia.InputMediaType.DOCUMENT)

internal fun invalidUiState() = invalidReplyCommand().let { (replyCommand, error) ->
    UiState(replyKeyboard = listOf(replyCommand)) to error
}

internal fun invalidEditMessage() =
    validEditMessage().copy(messageId = "id") to TimeUuid::class

internal fun validInlineCommandTable() = List(MAX_INLINE_CMD_ROWS) { List(MAX_INLINE_CMD_ROW_SIZE) { validInlineCommand() } }
internal fun validInlineCommands() = List(25) { validInlineCommand() }

internal fun validEditMessage() = EditMessage(
    messageId = timeUuid(),
    inlineCommands = validInlineCommands(),
    inlineCommandRows = validInlineCommandTable(),
    recipient = PeerUser(id = randomUuid())
)

internal const val UUID_V4 = "b1cccef5-58a2-4a03-b8a9-7966f5718c17"
internal const val SOME_RANDOM_STRING = "some random string"
internal const val NOT_COMPLETE_UUID = "47122222-bdaf-11e9-442e-1"
