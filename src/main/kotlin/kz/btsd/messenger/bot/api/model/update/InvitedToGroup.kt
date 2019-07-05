package kz.btsd.messenger.bot.api.model.update

import io.swagger.annotations.ApiModel

@ApiModel(parent = Update::class)
data class InvitedToGroup(
    override val updateId: String,
    val groupId: String
) : Update(updateId, "InvitedToGroup")
