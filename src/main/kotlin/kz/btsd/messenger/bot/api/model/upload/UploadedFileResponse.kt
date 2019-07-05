package kz.btsd.messenger.bot.api.model.upload

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel
data class UploadedFileResponse(
    @ApiModelProperty(notes = "List of uploaded files' info")
    val uploadedFiles: List<UploadedFile>
)
