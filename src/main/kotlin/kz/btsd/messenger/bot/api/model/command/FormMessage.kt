package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModelProperty

data class FormMessage(
    @ApiModelProperty(
        notes = "JSON that defines markup of UI form",
        required = false
    )
    val jsonForm: String? = null
)
