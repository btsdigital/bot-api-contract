package kz.btsd.messenger.bot.api.model.command

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(
    description = "Send a command into Messenger. Command can be any action - send a message to user, group, etc.",
    discriminator = "type",
    subTypes = [SendMessage::class, EditMessage::class, SendContactMessage::class, SendUiState::class,
        ForwardMessage::class, DeleteMessage::class, KickFromGroup::class, ChangeGroupTitle::class,
        ChangeGroupAvatar::class,
        DeleteGroupAvatar::class,
        ChangeGroupDescription::class,
        EditContainerMessage::class,
        SendContainerMessage::class]
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = SendMessage::class, name = "SendMessage"),
    JsonSubTypes.Type(value = EditMessage::class, name = "EditMessage"),
    JsonSubTypes.Type(value = DeleteMessage::class, name = "DeleteMessage"),
    JsonSubTypes.Type(value = SendContactMessage::class, name = "SendContactMessage"),
    JsonSubTypes.Type(value = SendUiState::class, name = "SendUiState"),
    JsonSubTypes.Type(value = ForwardMessage::class, name = "ForwardMessage"),
    JsonSubTypes.Type(value = KickFromGroup::class, name = "KickFromGroup"),
    JsonSubTypes.Type(value = ChangeGroupTitle::class, name = "ChangeGroupTitle"),
    JsonSubTypes.Type(value = ChangeGroupAvatar::class, name = "ChangeGroupAvatar"),
    JsonSubTypes.Type(value = DeleteGroupAvatar::class, name = "DeleteGroupAvatar"),
    JsonSubTypes.Type(value = ChangeGroupDescription::class, name = "ChangeGroupDescription"),
    JsonSubTypes.Type(value = EditContainerMessage::class, name = "EditContainerMessage"),
    JsonSubTypes.Type(value = SendContainerMessage::class, name = "SendContainerMessage")
])
abstract class Command(
    @ApiModelProperty(
        notes = "Payload type. Payload will be deserialized based on this property",
        required = true
    )
    val type: String
)
