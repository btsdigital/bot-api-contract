package kz.btsd.messenger.bot.api.validation

import kz.btsd.messenger.bot.api.model.command.InlineCommand
import javax.validation.Constraint
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext
import kotlin.reflect.KClass

@MustBeDocumented
@Constraint(validatedBy = [InlineCommandTableValidator::class])
@Target(AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY, AnnotationTarget.PROPERTY_GETTER)
@Retention(AnnotationRetention.RUNTIME)
annotation class InlineCommandTableSize(
    val message: String = "{attributeName} should not have more than 25 rows, 25 columns",
    val attributeName: String = "id",
    val groups: Array<KClass<out Any>> = [],
    val payload: Array<KClass<out Any>> = []
)

const val MAX_INLINE_CMD_ROWS = 25
const val MAX_INLINE_CMD_ROW_SIZE = 10

class InlineCommandTableValidator : ConstraintValidator<InlineCommandTableSize, List<List<InlineCommand>>> {
    override fun isValid(value: List<List<InlineCommand>>?, context: ConstraintValidatorContext?): Boolean {
        if (value == null) return true
        if (value.size > MAX_INLINE_CMD_ROWS) {
            return false
        }
        return value.fold(
            true,
            { ok, commands -> ok && commands.size <= MAX_INLINE_CMD_ROW_SIZE }
        )
    }
}
