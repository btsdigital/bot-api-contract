package kz.btsd.messenger.bot.api.model.command

import kz.btsd.messenger.bot.api.helpers.duplicate
import kz.btsd.messenger.bot.api.helpers.randomUuid
import kz.btsd.messenger.bot.api.helpers.timeUuid
import kz.btsd.messenger.bot.api.model.peer.PeerUser
import kz.btsd.messenger.bot.api.validation.TimeUuid
import org.junit.jupiter.api.Test
import javax.validation.constraints.Size

class EditContainerMessageTest : ValidatorTest() {

    @Test
    fun `valid message`() {
        message().noViolations()
    }

    @Test
    fun `invalid content`() {
        message().copy(content = 'q'.duplicate(20001)).violates(Size::class)
    }

    @Test
    fun `invalid messageId`() {
        message().copy(messageId = "---").violates(TimeUuid::class)
    }

    private fun message() = EditContainerMessage(
        recipient = PeerUser(id = randomUuid()),
        content = "someContent",
        messageId = timeUuid()
    )
}
