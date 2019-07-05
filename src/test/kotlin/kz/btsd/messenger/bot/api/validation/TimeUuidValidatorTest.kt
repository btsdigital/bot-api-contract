package kz.btsd.messenger.bot.api.validation

import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import kz.btsd.messenger.bot.api.helpers.NOT_COMPLETE_UUID
import kz.btsd.messenger.bot.api.helpers.SOME_RANDOM_STRING
import kz.btsd.messenger.bot.api.helpers.UUID_V4
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import javax.validation.ConstraintValidatorContext

@ExtendWith(MockKExtension::class)
internal class TimeUuidValidatorTest {
    @MockK
    private lateinit var context: ConstraintValidatorContext

    private val validator = TimeUuidValidator()

    @Test
    fun `time uuid should pass validation`() {
        assertThat(validator.isValid(TIME_UUID, context)).isTrue()
    }

    @Test
    fun `uuid v4 should not pass validation`() {
        assertThat(validator.isValid(UUID_V4, context)).isFalse()
    }

    @Test
    fun `random string should not pass validation`() {
        assertThat(validator.isValid(SOME_RANDOM_STRING, context)).isFalse()
    }

    @Test
    fun `empty string should not pass validation`() {
        assertThat(validator.isValid("", context)).isFalse()
    }

    @Test
    fun `null string should pass validation`() {
        assertThat(validator.isValid(null, context)).isTrue()
    }

    @Test
    fun `not complete uuid should not pass validation`() {
        assertThat(validator.isValid(NOT_COMPLETE_UUID, context)).isFalse()
    }
}

private const val TIME_UUID = "2b46707c-a5fd-11e8-98d0-529269fb1459"
