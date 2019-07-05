package kz.btsd.messenger.bot.api.model.update

import io.swagger.annotations.ApiModel
import kz.btsd.messenger.bot.api.model.peer.Peer

@ApiModel(parent = Update::class)
class MessageEdited(
    override val updateId: String,
    val messageId: String,
    val author: Peer,
    val dialog: Peer,
    val content: String
) : Update(updateId, "MessageEdited")
