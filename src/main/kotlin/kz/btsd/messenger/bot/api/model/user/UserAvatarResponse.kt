package kz.btsd.messenger.bot.api.model.user

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(description = "Response containing user avatar")
data class UserAvatarResponse(
    @ApiModelProperty(
        notes = "User avatar, null if user doesn't have one",
        required = false
    )
    val avatar: Avatar?
)
