package kz.btsd.messenger.bot.api.model.update

import kz.btsd.messenger.bot.api.model.peer.Peer

data class FormClosed(
    override val updateId: String,
    override val formId: String,
    override val dialog: Peer,
    override val sender: Peer
) : FormUpdate(updateId, formId, dialog, sender, "FormClosed")
