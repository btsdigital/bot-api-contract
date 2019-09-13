package kz.btsd.messenger.bot.api.model.channel

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.model.peer.Peer

@ApiModel(description = "Channel admins")
data class ChannelAdminsResponse(
    @ApiModelProperty(notes = "Requested channel admins")
    val admins: List<Peer>
)
