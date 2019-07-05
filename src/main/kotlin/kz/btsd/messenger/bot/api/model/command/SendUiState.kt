package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.model.peer.Peer
import javax.validation.Valid

@ApiModel(description = "Send message with ability update current UI state", parent = Command::class)
data class SendUiState(

    @ApiModelProperty(
        notes = "Peer to send this message to"
    )
    @get:Valid
    val recipient: Peer,

    @ApiModelProperty(
        notes = "Dialog where recipient is"
    )
    @get:Valid
    val dialog: Peer = recipient,

    @ApiModelProperty(notes = "Bot Ui State buttons with ReplyKeyboard and QuickButtons")
    @get:Valid
    val uiState: UiState
) : Command("SendUiState")
