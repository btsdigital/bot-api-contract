package kz.btsd.messenger.bot.api.model.user

import io.swagger.annotations.ApiModel

@ApiModel(description = "User info")
data class User(
    val id: String,
    val firstName: String? = null,
    val lastName: String? = null,
    val phoneNumber: String? = null,
    val userName: String,
    val avatar: Avatar? = null
)
