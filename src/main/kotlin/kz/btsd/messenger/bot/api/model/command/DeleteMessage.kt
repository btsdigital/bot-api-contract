package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.model.peer.Peer
import kz.btsd.messenger.bot.api.validation.TimeUuid
import javax.validation.Valid

@ApiModel(description = "Delete message", parent = Command::class)
data class DeleteMessage(
    @ApiModelProperty(
        notes = "Message ID received as the response to sent message, which bot wants to delete",
        example = "804d1bbd-901f-470a-b1b8-1859277a7803",
        required = true
    )
    @get:TimeUuid(attributeName = "messageId")
    val messageId: String,
    @ApiModelProperty(
        notes = "Peer this message was sent to",
        required = true
    )
    @get:Valid
    val dialog: Peer
) : Command("DeleteMessage")
