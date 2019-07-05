package kz.btsd.messenger.bot.api.model.media

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.annotations.ApiModel

@ApiModel(
    description = "Input contact media type",
    discriminator = "contactType",
    subTypes = [InputRegisteredContact::class, InputUnregisteredContact::class]
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "contactType", visible = true)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = InputRegisteredContact::class, name = "InputRegisteredContact"),
    JsonSubTypes.Type(value = InputUnregisteredContact::class, name = "InputUnregisteredContact")
])
sealed class InputContact(
    val contactType: String
)

@ApiModel(parent = InputContact::class)
class InputRegisteredContact(
    val userId: String,
    val firstName: String? = null,
    val lastName: String? = null,
    val phoneNumber: String? = null
) : InputContact("InputRegisteredContact")

@ApiModel(parent = InputContact::class)
class InputUnregisteredContact(
    val firstName: String? = null,
    val lastName: String? = null,
    val phoneNumber: String? = null
) : InputContact("InputUnregisteredContact")
