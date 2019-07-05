package kz.btsd.messenger.bot.api.model.command

import kz.btsd.messenger.bot.api.helpers.duplicate
import kz.btsd.messenger.bot.api.validation.CommandCaption
import kz.btsd.messenger.bot.api.validation.CommandMetadata
import org.junit.jupiter.api.Test

class InlineCommandTest : ValidatorTest() {

    @Test
    fun `caption length cannot be more than 32`() {
        command().copy(caption = 'c'.duplicate(33)).violates(CommandCaption::class)
    }

    @Test
    fun `metadata length cannot be more than 255`() {
        command().copy(metadata = 'c'.duplicate(256)).violates(CommandMetadata::class)
    }

    @Test
    fun `valid command`() {
        command().noViolations()
    }

    private fun command() = InlineCommand(
        caption = 'q'.duplicate(32),
        metadata = 'q'.duplicate(255)
    )
}
