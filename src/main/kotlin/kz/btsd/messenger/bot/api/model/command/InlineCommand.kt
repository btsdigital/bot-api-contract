package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.validation.CommandCaption
import kz.btsd.messenger.bot.api.validation.CommandMetadata

@ApiModel(description = "Command inside message body")
data class InlineCommand(
    @ApiModelProperty(
        notes = "Caption of a button displayed on UI",
        required = true,
        example = "Press Me"
    )
    @get:CommandCaption
    val caption: String,

    @ApiModelProperty(
        notes = "Messenger will send this to Bot as 'metadata' parameter when user clicks on this button. " +
            "Can be a string representation of anything (plain text, query params, JSON)",
        required = true,
        example = "poll?pollId=123456&selectedOption=4"
    )
    @get:CommandMetadata
    val metadata: String
)
