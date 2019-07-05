package kz.btsd.messenger.bot.api.model.command

import kz.btsd.messenger.bot.api.helpers.duplicate
import kz.btsd.messenger.bot.api.helpers.randomUuid
import kz.btsd.messenger.bot.api.helpers.timeUuid
import kz.btsd.messenger.bot.api.model.peer.PeerUser
import kz.btsd.messenger.bot.api.validation.LocalId
import kz.btsd.messenger.bot.api.validation.TimeUuid
import org.junit.jupiter.api.Test

class ForwardMessageTest : ValidatorTest() {
    @Test
    fun `messageId should be valid timeuuid`() {
        message().copy(
            messageId = "dd"
        ).violates(TimeUuid::class)
    }

    @Test
    fun `messageId should not be empty`() {
        message().copy(
            messageId = ""
        ).violates(TimeUuid::class)
    }

    @Test
    fun `localId size should not be above 255`() {
        message().copy(
            localId = 'q'.duplicate(256)
        ).violates(LocalId::class)
    }

    @Test
    fun `valid message`() {
        message().copy(
            localId = 'q'.duplicate(255)
        ).noViolations()
    }

    private fun message() = ForwardMessage(
        messageId = timeUuid(),
        fromDialog = PeerUser(id = randomUuid()),
        toDialog = PeerUser(id = randomUuid())
    )
}
