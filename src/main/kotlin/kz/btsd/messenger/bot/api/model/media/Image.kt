package kz.btsd.messenger.bot.api.model.media

import io.swagger.annotations.ApiModel

@ApiModel(parent = Media::class)
data class Image(
    val fileId: String,
    val mimeType: String,
    val name: String,
    val size: Int,
    val width: Int,
    val height: Int
) : Media("Image")
