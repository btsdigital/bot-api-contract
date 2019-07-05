package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.validation.UUID

@ApiModel(description = "Change group avatar", parent = Command::class)
data class ChangeGroupAvatar(
    @ApiModelProperty(
        notes = "group id",
        required = true
    )
    @get:UUID(attributeName = "groupId")
    val groupId: String,

    @ApiModelProperty(
        notes = "file id of the avatar",
        required = true
    )
    val fileId: String
) : Command("ChangeGroupAvatar")
