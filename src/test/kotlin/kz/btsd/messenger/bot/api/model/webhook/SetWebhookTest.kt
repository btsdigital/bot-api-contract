package kz.btsd.messenger.bot.api.model.webhook

import kz.btsd.messenger.bot.api.model.command.ValidatorTest
import org.junit.jupiter.api.Test
import javax.validation.constraints.Size

class SetWebhookTest : ValidatorTest() {

    @Test
    fun `url size cant be longer than 200`() {
        val curSize = setWebhook.url.length
        val url = setWebhook.url + "e".repeat(201 - curSize)
        setWebhook.copy(url = url).violates(Size::class)
    }

    @Test
    fun `url is valid size`() {
        setWebhook.noViolations()
    }

    val setWebhook = SetWebhook("https://helloworld.com/path?q=query")
}
