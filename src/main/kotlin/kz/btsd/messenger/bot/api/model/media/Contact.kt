package kz.btsd.messenger.bot.api.model.media

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.annotations.ApiModel
import kz.btsd.messenger.bot.api.model.user.User

@ApiModel(
    parent = Media::class,
    description = "Contact media type",
    discriminator = "type",
    subTypes = [RegisteredContact::class, UnregisteredContact::class]
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = RegisteredContact::class, name = "RegisteredContact"),
    JsonSubTypes.Type(value = UnregisteredContact::class, name = "UnregisteredContact")
])
sealed class Contact(
    override val type: String
) : Media(type)

@ApiModel(parent = Contact::class)
class RegisteredContact(
    val user: User
) : Contact("RegisteredContact")

@ApiModel(parent = Contact::class)
class UnregisteredContact(
    val firstName: String? = null,
    val lastName: String? = null,
    val phoneNumber: String? = null
) : Contact("UnregisteredContact")
