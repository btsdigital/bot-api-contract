package kz.btsd.messenger.bot.api.model.command

import kz.btsd.messenger.bot.api.helpers.duplicate
import kz.btsd.messenger.bot.api.validation.CommandCaption
import kz.btsd.messenger.bot.api.validation.CommandMetadata
import org.junit.jupiter.api.Test

internal class QuickButtonCommandTest : ValidatorTest() {
    @Test
    fun `caption max size is 32`() {
        command().copy(caption = 'q'.duplicate(33)).violates(CommandCaption::class)
    }

    @Test
    fun `metadata max length is 255`() {
        command().copy(metadata = 'q'.duplicate(256)).violates(CommandMetadata::class)
    }

    @Test
    fun `valid command`() {
        command().noViolations()
    }

    private fun command() = QuickButtonCommand(
        caption = 'c'.duplicate(32),
        action = QuickButtonCommand.QuickButtonAction.QUICK_FORM_ACTION,
        metadata = 'q'.duplicate(255)
    )
}
