package kz.btsd.messenger.bot.api.model.update

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.annotations.ApiModel
import kz.btsd.messenger.bot.api.model.peer.Peer

@ApiModel(discriminator = "type", subTypes = [
    FormClosed::class,
    FormMessageSent::class,
    FormSubmitted::class
])
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = FormClosed::class, name = "FormClosed"),
    JsonSubTypes.Type(value = FormSubmitted::class, name = "FormSubmitted"),
    JsonSubTypes.Type(value = FormMessageSent::class, name = "FormMessageSent")
])
abstract class FormUpdate(
    override val updateId: String,
    open val formId: String,
    open val dialog: Peer,
    open val sender: Peer,
    override val type: String
) : Update(updateId, type)
