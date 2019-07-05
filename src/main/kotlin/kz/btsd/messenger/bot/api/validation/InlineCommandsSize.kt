package kz.btsd.messenger.bot.api.validation

import javax.validation.Constraint
import javax.validation.ReportAsSingleViolation
import javax.validation.constraints.Size
import kotlin.reflect.KClass

@MustBeDocumented
@Size(max = 25)
@ReportAsSingleViolation
@Constraint(validatedBy = [])
@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class InlineCommandsSize(
    val attributeName: String = "inlineCommands",
    val message: String = "Number of {attributeName} must me less than 25, recommended number is 3",
    val groups: Array<KClass<out Any>> = [],
    val payload: Array<KClass<out Any>> = []
)
