package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import javax.validation.Valid
import javax.validation.constraints.Size

@ApiModel(description = "Class for holding Bot UI State")
data class UiState(
    @ApiModelProperty(notes = "Flag which is used for checking that the user is able to write text in the dialog or not")
    val canWriteText: Boolean = true,

    @ApiModelProperty(notes = "Flag indicating is there need to show to the user camera button or not")
    val showCameraButton: Boolean = true,

    @ApiModelProperty(notes = "Flag indicating is there need to show to the user share contact button or not")
    val showShareContactButton: Boolean = true,

    @ApiModelProperty(notes = "Flag indicating is there need to show to the user record audio button or not")
    val showRecordAudioButton: Boolean = true,

    @ApiModelProperty(notes = "Flag indicating is there need to show to the user gallery button or not")
    val showGalleryButton: Boolean = true,

    @ApiModelProperty(notes = "Flag indicating is there need to show to the user speech to text button or not")
    val showSpeechToTextButton: Boolean = false,

    @ApiModelProperty(notes = "List of commands that will be displayed on Messenger UI as reply keyboard")
    @get:Valid
    val replyKeyboard: List<ReplyCommand>? = null,

    @ApiModelProperty(notes = "List of quick buttons that will be displayed on Messenger UI below the message as quick buttons")
    @get:Size(max = 25, message = "Size of quickButtonCommands should be <= {max}")
    @get:Valid
    val quickButtonCommands: List<QuickButtonCommand>? = null,

    @ApiModelProperty(notes = "Form message contains JSON that defines markup of UI form")
    val formMessage: FormMessage = FormMessage()
)
