package kz.btsd.messenger.bot.api.validation

import kz.btsd.messenger.bot.api.validation.UuidValidator.Companion.UUID_REGEX
import java.util.UUID
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class TimeUuidValidator : ConstraintValidator<TimeUuid, String?> {
    override fun isValid(value: String?, context: ConstraintValidatorContext): Boolean {
        if (value == null) return true
        return isTimeUuid(value)
    }

    private fun isTimeUuid(value: String) = UUID_REGEX.matches(value) && UUID.fromString(value).version() == 1
}
