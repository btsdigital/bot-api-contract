package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import javax.validation.Valid
import javax.validation.constraints.Size

@ApiModel
data class CommandRequest(
    @ApiModelProperty(
        notes = "List of Commands",
        example = """
[
        {
                "type": "SendMessage",
                "localId": "another id",
                "recipient": {
                        "type": "USER",
                        "id": "some rec id"
                },
                "content": "some text",
                "inlineCommands": [
                        {
                                "caption": "Command 1",
                                "metadata": "property1=asfddsaf&property2=asdfsadf"
                        }
                ],
                "uiState": {
                    "quickButtonCommands" : [
                        {
                            "caption": "Нажми меня",
                            "action": "quickRequest",
                            "metadata": "/giveMeFormWithId?id=converterForm"
                        }
                    ]
                }
        },
        {
            "type" : "SendUiState",
            "recipient" : {
                "type" : "USER",
                "id" : "some rec id"
            },
            "uiState" : {
                "canWriteText": true,
                "showCameraButton": true,
                "showShareContactButton": true,
                "showRecordAudioButton": false,
                "showGalleryButton": false,
                "replyKeyboard": [
                    {
                        "caption": "Нажми меня",
                    }
                ],
                "quickButtonCommands" : [
                    {
                        "caption": "Нажми меня",
                        "action": "quickRequest",
                        "metadata": "/giveMeFormWithId?id=converterForm"
                    }
                ]
            }
        }
]
                """
    )
    @get:Valid
    @get:Size(max = 10, message = "maximum commands length is 10")
    val commands: List<Command>
)
