package kz.btsd.messenger.bot.api.model.media

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(
    description = "Media represents media file of video, audio, image, e.t.c",
    discriminator = "type",
    subTypes = [Video::class, Audio::class, Image::class, Document::class, Contact::class, Music::class, Gif::class]
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = Video::class, name = "Video"),
    JsonSubTypes.Type(value = Audio::class, name = "Audio"),
    JsonSubTypes.Type(value = Image::class, name = "Image"),
    JsonSubTypes.Type(value = Document::class, name = "Document"),
    JsonSubTypes.Type(value = Contact::class, name = "Contact"),
    JsonSubTypes.Type(value = Music::class, name = "Music"),
    JsonSubTypes.Type(value = Gif::class, name = "Gif")
])
open class Media(
    @ApiModelProperty(
        notes = "Payload type. Payload will be deserialized based on this property",
        required = true
    )
    open val type: String
)
