package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.model.media.InputMedia
import kz.btsd.messenger.bot.api.model.peer.Peer
import kz.btsd.messenger.bot.api.validation.Content
import kz.btsd.messenger.bot.api.validation.InlineCommandTableSize
import kz.btsd.messenger.bot.api.validation.InlineCommandsSize
import kz.btsd.messenger.bot.api.validation.MediaList
import kz.btsd.messenger.bot.api.validation.TimeUuid
import javax.validation.Valid

@ApiModel(description = "Edit previously sent message", parent = Command::class)
data class EditMessage(
    @ApiModelProperty(
        notes = "Message ID received as the response to sent message, which bot wants to edit",
        example = "804d1bbd-901f-470a-b1b8-1859277a7803",
        required = true
    )
    @get:TimeUuid(attributeName = "messageId")
    val messageId: String,

    @ApiModelProperty(
        notes = "Peer this message was sent to"
    )
    @get:Valid
    val recipient: Peer,

    @ApiModelProperty(notes = "Message text")
    @get:Content
    val content: String? = null,

    @ApiModelProperty(notes = "List of buttons that will be displayed on Messenger UI inside the message")
    @get:InlineCommandsSize
    @get:Valid
    @Deprecated("use inlineCommandRows instead")
    val inlineCommands: List<InlineCommand>? = null,

    @ApiModelProperty(notes = "Table of buttons that will be displayed on Messenger UI inside the message")
    @get:InlineCommandTableSize
    @get:Valid
    val inlineCommandRows: List<List<InlineCommand>>? = null,

    @ApiModelProperty(notes = "List of media")
    @get:MediaList
    val mediaList: List<InputMedia>? = null
) : Command("EditMessage") {
    @get:Valid
    val flatCommandRows: List<InlineCommand>
        get() = inlineCommandRows?.flatten() ?: emptyList()
}
