package kz.btsd.messenger.bot.api.model.command

import kz.btsd.messenger.bot.api.helpers.invalidQuickButtonCommand
import kz.btsd.messenger.bot.api.helpers.invalidReplyCommand
import kz.btsd.messenger.bot.api.helpers.validQuickButtonCommand
import org.junit.jupiter.api.Test
import javax.validation.constraints.Size

internal class UiStateTest : ValidatorTest() {
    @Test
    fun `max size of quickButtonCommands is 25`() {
        uiState().copy(
            quickButtonCommands = List(26) { validQuickButtonCommand() }
        ).violates(Size::class)
    }

    @Test
    fun `valid uiState`() {
        uiState().noViolations()
    }

    @Test
    fun `reply command is validated`() {
        val (command, error) = invalidReplyCommand()
        uiState().copy(
            replyKeyboard = listOf(command)
        ).violates(error)
    }

    @Test
    fun `quickButtonCommand is validated`() {
        val (command, error) = invalidQuickButtonCommand()
        uiState().copy(
            quickButtonCommands = listOf(command)
        ).violates(error)
    }

    private fun uiState() = UiState(
        quickButtonCommands = List(25) { validQuickButtonCommand() }
    )
}
