package kz.btsd.messenger.bot.api.model.update

import io.swagger.annotations.ApiModel
import kz.btsd.messenger.bot.api.model.peer.Peer

@ApiModel(parent = Update::class)
data class InlineCommandSelected(
    override val updateId: String,
    val messageId: String,
    val dialog: Peer,
    val sender: Peer,
    val metadata: String,
    val content: String
) : Update(updateId, "InlineCommandSelected")
