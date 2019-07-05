package kz.btsd.messenger.bot.api.validation

import javax.validation.Constraint
import javax.validation.ReportAsSingleViolation
import javax.validation.constraints.Size
import kotlin.reflect.KClass

@MustBeDocumented
@Size(max = 32)
@ReportAsSingleViolation
@Constraint(validatedBy = [])
@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class CommandCaption(
    val attributeName: String = "caption",
    val message: String = "{attributeName} length should be <= 32, recommended is 20",
    val groups: Array<KClass<out Any>> = [],
    val payload: Array<KClass<out Any>> = []
)
