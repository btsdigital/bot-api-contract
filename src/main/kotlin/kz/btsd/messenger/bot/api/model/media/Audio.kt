package kz.btsd.messenger.bot.api.model.media

import io.swagger.annotations.ApiModel

@ApiModel(parent = Media::class)
data class Audio(
    val fileId: String,
    val name: String,
    val mimeType: String,
    val size: Int
) : Media("Audio")
