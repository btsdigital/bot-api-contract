package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.validation.UUID

@ApiModel(description = "Delete group avatar", parent = Command::class)
data class DeleteGroupAvatar(
    @ApiModelProperty(
        notes = "group id",
        required = true
    )
    @get:UUID(attributeName = "groupId")
    val groupId: String
) : Command("DeleteGroupAvatar")
