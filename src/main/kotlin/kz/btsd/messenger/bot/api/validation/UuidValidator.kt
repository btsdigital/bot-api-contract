package kz.btsd.messenger.bot.api.validation

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class UuidValidator : ConstraintValidator<UUID, String?> {
    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
        if (value == null) return true
        return UUID_REGEX.matches(value)
    }

    companion object {
        val UUID_REGEX = Regex("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}")
    }
}
