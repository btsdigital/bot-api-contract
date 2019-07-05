package kz.btsd.messenger.bot.api.model.update

import io.swagger.annotations.ApiModel
import kz.btsd.messenger.bot.api.model.peer.Peer

@ApiModel(parent = Update::class)
data class MessageIdAssigned(
    override val updateId: String,
    val localId: String,
    val dialog: Peer,
    val id: String
) : Update(updateId, "MessageIdAssigned")
