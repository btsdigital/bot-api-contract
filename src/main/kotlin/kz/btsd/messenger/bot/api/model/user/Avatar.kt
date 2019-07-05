package kz.btsd.messenger.bot.api.model.user

import io.swagger.annotations.ApiModel
import kz.btsd.messenger.bot.api.model.media.Image

@ApiModel(description = "User avatar image")
data class Avatar(
    val full: Image,
    val small: Image
)
