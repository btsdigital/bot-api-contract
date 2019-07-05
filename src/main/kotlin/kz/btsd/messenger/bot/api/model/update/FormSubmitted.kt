package kz.btsd.messenger.bot.api.model.update

import kz.btsd.messenger.bot.api.model.peer.Peer

data class FormSubmitted(
    override val updateId: String,
    override val formId: String,
    override val dialog: Peer,
    override val sender: Peer,
    val metadata: String,
    val additionalMetadata: String
) : FormUpdate(updateId, formId, dialog, sender, "FormSubmitted")
