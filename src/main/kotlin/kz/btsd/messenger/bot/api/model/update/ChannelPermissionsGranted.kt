package kz.btsd.messenger.bot.api.model.update

import io.swagger.annotations.ApiModel
import kz.btsd.messenger.bot.api.model.peer.PeerChannel

@ApiModel(parent = Update::class)
data class ChannelPermissionsGranted(
    override val updateId: String,
    val channel: PeerChannel,
    val permissions: List<String>
) : Update(updateId, "ChannelPermissionsGranted")
