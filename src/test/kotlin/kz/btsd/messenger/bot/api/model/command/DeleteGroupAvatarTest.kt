package kz.btsd.messenger.bot.api.model.command

import kz.btsd.messenger.bot.api.helpers.randomUuid
import kz.btsd.messenger.bot.api.validation.UUID
import org.junit.jupiter.api.Test

internal class DeleteGroupAvatarTest : ValidatorTest() {
    @Test
    fun `groupId should be uuid`() {
        deleteAvatar().copy(groupId = "groupId").violates(UUID::class)
    }

    @Test
    fun `valid object`() {
        deleteAvatar().noViolations()
    }

    private fun deleteAvatar() = DeleteGroupAvatar(randomUuid())
}
