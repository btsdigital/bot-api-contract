package kz.btsd.messenger.bot.api.model.upload

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(description = "Uploaded avatar info")
data class UploadedAvatarResponse(
    @ApiModelProperty(notes = "ID assigned to uploaded avatar image")
    val fileId: String
)
