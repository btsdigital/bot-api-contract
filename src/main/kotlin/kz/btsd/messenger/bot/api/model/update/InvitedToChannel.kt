package kz.btsd.messenger.bot.api.model.update

import io.swagger.annotations.ApiModel

@ApiModel(parent = Update::class)
data class InvitedToChannel(
    override val updateId: String,
    val channelId: String
) : Update(updateId, "InvitedToChannel")
