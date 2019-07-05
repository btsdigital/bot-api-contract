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
internal class UuidValidatorTest {
    @MockK
    private lateinit var context: ConstraintValidatorContext

    private val validator = UuidValidator()

    @Test
    fun `uuid version 4 should pass`() {
        assertThat(validator.isValid(UUID_V4, context)).isTrue()
    }

    @Test
    fun `null should pass`() {
        assertThat(validator.isValid(null, context)).isTrue()
    }

    @Test
    fun `empty should not pass`() {
        assertThat(validator.isValid("", context)).isFalse()
    }

    @Test
    fun `random string should not pass`() {
        assertThat(validator.isValid(SOME_RANDOM_STRING, context)).isFalse()
    }

    @Test
    fun `not complete uuid should not pass`() {
        assertThat(validator.isValid(NOT_COMPLETE_UUID, context)).isFalse()
    }
}
