package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.validation.CommandCaption
import kz.btsd.messenger.bot.api.validation.CommandMetadata

@ApiModel(description = "Quick Button Command in the bottom of the screen")
data class QuickButtonCommand(
    @ApiModelProperty(
        notes = "Caption of a button displayed on UI",
        required = true,
        example = "Press Me"
    )
    @get:CommandCaption
    val caption: String,

    @ApiModelProperty(
        notes = "Some Action",
        required = true,
        example = "Default Action"
    )
    val action: QuickButtonAction,

    @ApiModelProperty(
        notes = "Messenger will send this to Bot as 'metadata' parameter when user clicks on this button. " +
            "Can be a string representation of anything (plain text, query params, JSON)",
        required = true,
        example = "/giveMeFormWithId?id=converterForm"
    )
    @get:CommandMetadata
    val metadata: String? = null
) {
    enum class QuickButtonAction {
        QUICK_REQUEST,
        QUICK_FORM_ACTION
    }
}
