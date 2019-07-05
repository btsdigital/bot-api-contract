package kz.btsd.messenger.bot.api.model.update

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel
data class UpdateResponse(
    @ApiModelProperty(
        notes = "List of Updates"
    )
    val updates: List<Update>
)
