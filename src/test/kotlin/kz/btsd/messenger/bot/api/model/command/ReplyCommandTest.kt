package kz.btsd.messenger.bot.api.model.command

import kz.btsd.messenger.bot.api.helpers.duplicate
import kz.btsd.messenger.bot.api.validation.CommandCaption
import org.junit.jupiter.api.Test

internal class ReplyCommandTest : ValidatorTest() {
    @Test
    fun `max caption size is 32`() {
        ReplyCommand(caption = 'q'.duplicate(33)).violates(CommandCaption::class)
    }

    @Test
    fun `caption size of 32 is ok`() {
        ReplyCommand(caption = 'q'.duplicate(32)).noViolations()
    }

    @Test
    fun `empty caption is valid`() {
        ReplyCommand(caption = "").noViolations()
    }
}
