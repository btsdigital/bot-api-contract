package kz.btsd.messenger.bot.api.model.command

import kz.btsd.messenger.bot.api.helpers.randomUuid
import kz.btsd.messenger.bot.api.validation.UUID
import org.junit.jupiter.api.Test

internal class ChangeGroupAvatarTest : ValidatorTest() {
    @Test
    fun `groupId should be uuid`() {
        changeAvatar().copy(groupId = "groupId").violates(UUID::class)
    }

    @Test
    fun `valid object`() {
        changeAvatar().noViolations()
    }

    private fun changeAvatar() = ChangeGroupAvatar(
        groupId = randomUuid(),
        fileId = randomUuid()
    )
}
