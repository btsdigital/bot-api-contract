package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.validation.CommandCaption

@ApiModel(description = "A single command in Reply keyboard displayed on Messenger UI")
data class ReplyCommand(
    @ApiModelProperty(
        notes = "This caption will be displayed on Messenger UI and sent to bot as a message"
    )
    @get:CommandCaption
    val caption: String
)
