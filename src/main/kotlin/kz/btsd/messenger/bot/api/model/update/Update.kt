package kz.btsd.messenger.bot.api.model.update

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.annotations.ApiModel

@ApiModel(discriminator = "type", subTypes = [
    Message::class,
    MessageIdAssigned::class,
    InlineCommandSelected::class,
    QuickButtonSelected::class,
    FormUpdate::class,
    NewChannelSubscriber::class,
    InvitedToGroup::class,
    KickedFromGroup::class,
    MessageEdited::class,
    InvitedToChannel::class,
    ChannelPermissionsGranted::class,
    ChannelPermissionsRevoked::class,
    KickedFromChannel::class,
    ChannelAdminAdded::class,
    ChannelAdminDeleted::class
])
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = Message::class, name = "Message"),
    JsonSubTypes.Type(value = MessageIdAssigned::class, name = "MessageIdAssigned"),
    JsonSubTypes.Type(value = InlineCommandSelected::class, name = "InlineCommandSelected"),
    JsonSubTypes.Type(value = QuickButtonSelected::class, name = "QuickButtonSelected"),
    JsonSubTypes.Type(value = FormUpdate::class, name = "FormUpdate"),
    JsonSubTypes.Type(value = NewChannelSubscriber::class, name = "NewChannelSubscriber"),
    JsonSubTypes.Type(value = InvitedToGroup::class, name = "InvitedToGroup"),
    JsonSubTypes.Type(value = KickedFromGroup::class, name = "KickedFromGroup"),
    JsonSubTypes.Type(value = MessageEdited::class, name = "MessageEdited"),
    JsonSubTypes.Type(value = InvitedToChannel::class, name = "InvitedToChannel"),
    JsonSubTypes.Type(value = ChannelPermissionsGranted::class, name = "ChannelPermissionsGranted"),
    JsonSubTypes.Type(value = ChannelPermissionsRevoked::class, name = "ChannelPermissionsRevoked"),
    JsonSubTypes.Type(value = KickedFromChannel::class, name = "KickedFromChannel"),
    JsonSubTypes.Type(value = ChannelAdminAdded::class, name = "ChannelAdminAdded"),
    JsonSubTypes.Type(value = ChannelAdminDeleted::class, name = "ChannelAdminDeleted")
])
abstract class Update(
    open val updateId: String,
    open val type: String
)
