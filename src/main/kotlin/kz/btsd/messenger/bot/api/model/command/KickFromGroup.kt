package kz.btsd.messenger.bot.api.model.command

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import kz.btsd.messenger.bot.api.model.peer.Peer
import kz.btsd.messenger.bot.api.validation.UUID
import javax.validation.Valid

@ApiModel(description = "Kick from group", parent = Command::class)
data class KickFromGroup(
    @ApiModelProperty(
        notes = "GroupId in which peer is a member",
        required = true
    )
    @get:UUID(attributeName = "groupId")
    val groupId: String,
    @ApiModelProperty(
        notes = "Peer to kick",
        required = true
    )
    @get:Valid
    val peerToKick: Peer
) : Command("KickFromGroup")
