package kz.btsd.messenger.bot.api.model.command

import kz.btsd.messenger.bot.api.helpers.duplicate
import kz.btsd.messenger.bot.api.helpers.randomUuid
import kz.btsd.messenger.bot.api.model.peer.PeerUser
import kz.btsd.messenger.bot.api.validation.LocalId
import org.junit.jupiter.api.Test
import javax.validation.constraints.Size

class SendContainerMessageTest : ValidatorTest() {

    @Test
    fun `valid message`() {
        message().noViolations()
    }

    @Test
    fun `invalid content`() {
        message().copy(content = 'q'.duplicate(20001)).violates(Size::class)
    }

    @Test
    fun `invalid localId`() {
        message().copy(localId = 'q'.duplicate(256)).violates(LocalId::class)
    }

    private fun message() = SendContainerMessage(
        recipient = PeerUser(id = randomUuid()),
        content = "someContent"
    )
}
