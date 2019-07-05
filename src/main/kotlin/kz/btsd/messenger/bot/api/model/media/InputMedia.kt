package kz.btsd.messenger.bot.api.model.media

import io.swagger.annotations.ApiModel

@ApiModel(description = "Input media to send uploaded files")
class InputMedia(
    val fileId: String,
    val name: String,
    val mediaType: InputMediaType
) {
    enum class InputMediaType {
        DOCUMENT, IMAGE, VIDEO, AUDIO
    }
}
