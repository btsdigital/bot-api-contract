package kz.btsd.messenger.bot.api.model.update

import kz.btsd.messenger.bot.api.model.peer.Peer

data class MessageForwardMetadata(
    val sender: Peer
)
