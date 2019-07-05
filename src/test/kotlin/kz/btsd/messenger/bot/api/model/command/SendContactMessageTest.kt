package kz.btsd.messenger.bot.api.model.command

import kz.btsd.messenger.bot.api.helpers.duplicate
import kz.btsd.messenger.bot.api.helpers.randomUuid
import kz.btsd.messenger.bot.api.model.media.InputRegisteredContact
import kz.btsd.messenger.bot.api.model.peer.PeerUser
import kz.btsd.messenger.bot.api.validation.LocalId
import org.junit.jupiter.api.Test

class SendContactMessageTest : ValidatorTest() {

    @Test
    fun `localId length should not be above 255`() {
        message().copy(localId = 'q'.duplicate(256)).violates(LocalId::class)
    }

    @Test
    fun `valid message`() {
        message().copy(localId = 'q'.duplicate(255)).noViolations()
    }

    private fun message() = SendContactMessage(
        recipient = PeerUser(id = randomUuid()),
        inputMedia = InputRegisteredContact(
            userId = randomUuid()
        )
    )
}
