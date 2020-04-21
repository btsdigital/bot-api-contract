package kz.btsd.messenger.bot.api.model.meet

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.validation.TimeUuid
import javax.validation.constraints.Size

@ApiModel(description = "Create Meeting request")
data class CreateMeeting(
    @ApiModelProperty(notes = "Meeting owner id")
    @get:TimeUuid(attributeName = "ownerId")
    val ownerId: String,
    @ApiModelProperty(notes = "Meeting title")
    @get:Size(max = 50, message = "Size of title should be <= {max}")
    val title: String,
    @ApiModelProperty(notes = "Meeting allowed for")
    val allowedFor: MeetingAllowedFor,
    @ApiModelProperty(notes = "Meeting start time, unix timestamp")
    val startTime: Long,
    @ApiModelProperty(notes = "Meeting end time, unix timestamp")
    val endTime: Long,
    @ApiModelProperty(notes = "Password, if password empty mean access without password")
    val password: String,
    @ApiModelProperty(notes = "List of user ids, in time uuid")
    val users: List<String>
) {
    enum class MeetingAllowedFor {
        NOT_SET, AUTHENTICATED_USERS, ANYBODY
    }
}
