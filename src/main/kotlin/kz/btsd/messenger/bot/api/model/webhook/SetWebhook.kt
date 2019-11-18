package kz.btsd.messenger.bot.api.model.webhook

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import javax.validation.constraints.Size

@ApiModel(description = "Set bot webhook")
data class SetWebhook(
    @ApiModelProperty(
        notes = "Webhook url"
    )
    @get:Size(max = 200, message = "Size of url should be <= {max}")
    val url: String
)
