package kz.btsd.messenger.bot.api.model.meet

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.model.meet.CreateMeeting.MeetingAllowedFor

@ApiModel(description = "Meeting info")
data class Meeting(
    @ApiModelProperty(notes = "Meeting id")
    val id: String,
    @ApiModelProperty(notes = "Meeting title")
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
    val users: List<String>,
    @ApiModelProperty(notes = "Meeting url")
    val url: String
)
