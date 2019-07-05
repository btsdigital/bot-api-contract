package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.validation.UUID

@ApiModel(description = "Change group description", parent = Command::class)
data class ChangeGroupDescription(
    @ApiModelProperty(
        notes = "GroupId",
        required = true
    )
    @get:UUID(attributeName = "groupId")
    val groupId: String,
    @ApiModelProperty(
        notes = "New description",
        required = true
    )
    val description: String
) : Command("ChangeGroupDescription")
