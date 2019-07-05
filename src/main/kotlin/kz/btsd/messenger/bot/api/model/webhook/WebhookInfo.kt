package kz.btsd.messenger.bot.api.model.webhook

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(description = "Bot webhook info")
data class WebhookInfo(
    @ApiModelProperty(
        notes = "Bot webhook url"
    )
    val url: String
)
