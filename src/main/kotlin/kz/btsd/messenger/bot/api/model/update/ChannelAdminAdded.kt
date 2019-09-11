package kz.btsd.messenger.bot.api.model.update

import io.swagger.annotations.ApiModel
import kz.btsd.messenger.bot.api.model.peer.Peer

@ApiModel(parent = Update::class)
data class ChannelAdminAdded(
    override val updateId: String,
    val channelId: String,
    val admin: Peer
) : Update(updateId, "ChannelAdminAdded")
