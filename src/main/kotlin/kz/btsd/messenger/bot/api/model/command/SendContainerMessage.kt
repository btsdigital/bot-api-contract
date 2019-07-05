package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.model.peer.Peer
import kz.btsd.messenger.bot.api.validation.LocalId
import javax.validation.Valid
import javax.validation.constraints.Size

@ApiModel(description = "Send container message", parent = Command::class)
data class SendContainerMessage(
    @ApiModelProperty(
        notes = "Message ID generated by Bot. Can be any string. Bot will receive MessageIdAssigned update with localId - messageId match",
        example = "804d1bbd-901f-470a-b1b8-1859277a7803"
    )
    @get:LocalId
    val localId: String? = null,

    @ApiModelProperty(
        notes = "Peer to send this message to",
        required = true
    )
    @get:Valid
    val recipient: Peer,

    @ApiModelProperty(
        notes = "Content of the container message",
        required = true
    )
    @get:Size(max = 20000, message = "Size of containerMessage.Content should be <= {max}")
    val content: String
) : Command("SendContainerMessage")
