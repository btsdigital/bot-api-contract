package kz.btsd.messenger.bot.api.model.upload

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(description = "Uploaded file info")
data class UploadedFile(
    @ApiModelProperty(notes = "ID assigned to uploaded file")
    val fileId: String,

    @ApiModelProperty(notes = "Uploaded file's name")
    val fileName: String
)
