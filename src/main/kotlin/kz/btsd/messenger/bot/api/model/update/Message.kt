package kz.btsd.messenger.bot.api.model.update

import io.swagger.annotations.ApiModel
import kz.btsd.messenger.bot.api.model.media.Media
import kz.btsd.messenger.bot.api.model.peer.Peer
import java.time.ZonedDateTime

@ApiModel(parent = Update::class)
data class Message(
    override val updateId: String,
    val messageId: String,
    val sentAt: ZonedDateTime,
    val author: Peer,
    val dialog: Peer,
    val content: String,
    val forwardMetadata: MessageForwardMetadata? = null,
    val media: List<Media> = emptyList(),
    val likeCount: Long? = null,
    val repostCount: Long? = null,
    val viewCount: Long? = null,
    val channelPostAuthor: Peer? = null,
    val replyToMessageId: String? = null
) : Update(updateId, "Message")
