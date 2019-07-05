package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.validation.UUID

@ApiModel(description = "Change group title", parent = Command::class)
data class ChangeGroupTitle(
    @ApiModelProperty(
        notes = "GroupId",
        required = true
    )
    @get:UUID(attributeName = "groupId")
    val groupId: String,
    @ApiModelProperty(
        notes = "New title",
        required = true
    )
    val title: String
) : Command("ChangeGroupTitle")
