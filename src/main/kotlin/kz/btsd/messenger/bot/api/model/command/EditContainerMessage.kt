package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.model.peer.Peer
import kz.btsd.messenger.bot.api.validation.TimeUuid
import javax.validation.Valid
import javax.validation.constraints.Size

@ApiModel(description = "Edit previously sent container message", parent = Command::class)
data class EditContainerMessage(
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
    @ApiModelProperty(
        notes = "Content of the container message",
        required = true
    )
    @get:Size(max = 20000, message = "Size of containerMessage.Content should be <= {max}")
    val content: String
) : Command("EditContainerMessage")
