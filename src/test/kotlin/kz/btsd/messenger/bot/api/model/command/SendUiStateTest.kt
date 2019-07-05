package kz.btsd.messenger.bot.api.model.command

import kz.btsd.messenger.bot.api.helpers.invalidUiState
import kz.btsd.messenger.bot.api.helpers.randomUuid
import kz.btsd.messenger.bot.api.model.peer.PeerUser
import org.junit.jupiter.api.Test

internal class SendUiStateTest : ValidatorTest() {
    @Test
    fun `uiState is validated`() {
        val (uiState, error) = invalidUiState()
        SendUiState(
            recipient = PeerUser(id = randomUuid()),
            uiState = uiState
        ).violates(error)
    }
}
