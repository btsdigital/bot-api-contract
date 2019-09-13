package kz.btsd.messenger.bot.api.model.channel

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.model.peer.PeerChannel

@ApiModel(description = "Channel info")
data class ChannelInfoResponse(
    @ApiModelProperty(notes = "Requested channel info")
    val channel: PeerChannel
)
