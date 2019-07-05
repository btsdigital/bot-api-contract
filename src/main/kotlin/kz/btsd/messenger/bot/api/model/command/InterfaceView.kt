package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModelProperty

data class InterfaceView(
    @ApiModelProperty(
        notes = "JSON that defines markup of UI view",
        required = false
    )
    val jsonView: String? = null
)
