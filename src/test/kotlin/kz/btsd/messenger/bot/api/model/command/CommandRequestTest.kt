package kz.btsd.messenger.bot.api.model.command

import kz.btsd.messenger.bot.api.helpers.invalidEditMessage
import kz.btsd.messenger.bot.api.helpers.validEditMessage
import org.junit.jupiter.api.Test
import javax.validation.constraints.Size

class CommandRequestTest : ValidatorTest() {
    @Test
    fun `valid request`() {
        CommandRequest(List(10) { validEditMessage() })
            .noViolations()
    }

    @Test
    fun `max commands size if 5`() {
        CommandRequest(List(11) { validEditMessage() })
            .violates(Size::class)
    }

    @Test
    fun `commands are validated`() {
        val (msg, error) = invalidEditMessage()
        CommandRequest(listOf(msg)).violates(error)
    }
}
