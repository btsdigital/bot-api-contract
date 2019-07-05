package kz.btsd.messenger.bot.api.model.getme

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(description = "Bot description")
data class GetMeResponse(
    @ApiModelProperty(
        notes = "Bot id"
    )
    val botId: String,
    @ApiModelProperty(
        notes = "Bot name"
    )
    val name: String,
    @ApiModelProperty(
        notes = "Bot username"
    )
    val username: String
)
