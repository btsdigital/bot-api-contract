package kz.btsd.messenger.bot.api.model.update

import kz.btsd.messenger.bot.api.model.peer.Peer

data class NewChannelSubscriber(
    override val updateId: String,
    val peer: Peer,
    val channelId: String
) : Update(updateId, "NewChannelSubscriber")
