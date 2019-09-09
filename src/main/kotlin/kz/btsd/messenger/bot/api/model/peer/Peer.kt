package kz.btsd.messenger.bot.api.model.peer

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.validation.UUID

@ApiModel(description = "Party that participates in the conversation", discriminator = "type", subTypes = [
    PeerUser::class,
    PeerGroup::class,
    PeerBot::class,
    PeerChannel::class
])
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = PeerUser::class, name = "USER"),
    JsonSubTypes.Type(value = PeerGroup::class, name = "GROUP"),
    JsonSubTypes.Type(value = PeerChannel::class, name = "CHANNEL"),
    JsonSubTypes.Type(value = PeerBot::class, name = "BOT")
])
sealed class Peer(
    @ApiModelProperty(
        allowableValues = "USER,GROUP,BOT,CHANNEL",
        required = true,
        example = "USER"
    )
    val type: Type,
    @ApiModelProperty(
        notes = "String that uniquely identifies this particular peer",
        required = true,
        example = "c7d01753-8890-4188-a516-adcd2e9a5abe"
    )
    @get:UUID(attributeName = "id")
    open val id: String
) {
    enum class Type {
        USER, GROUP, BOT, CHANNEL
    }
}

@ApiModel(parent = Peer::class)
data class PeerUser(
    override val id: String,
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    val username: String? = null,
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    val lastName: String? = null,
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    val firstName: String? = null
) : Peer(Type.USER, id)

@ApiModel(parent = Peer::class)
data class PeerBot(
    override val id: String,
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    val name: String? = null
) : Peer(Type.BOT, id)

@ApiModel(parent = Peer::class)
data class PeerGroup(
    override val id: String,
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    val name: String? = null
) : Peer(Type.GROUP, id)

@ApiModel(parent = Peer::class)
data class PeerChannel(
    override val id: String,
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    val name: String? = null,
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    val username: String? = null
) : Peer(Type.CHANNEL, id)
