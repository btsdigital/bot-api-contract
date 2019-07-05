package kz.btsd.messenger.bot.api.validation

import javax.validation.Constraint
import javax.validation.ReportAsSingleViolation
import javax.validation.constraints.Size
import kotlin.reflect.KClass

@MustBeDocumented
@Size(max = 255)
@ReportAsSingleViolation
@Constraint(validatedBy = [])
@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class CommandMetadata(
    val attributeName: String = "metadata",
    val message: String = "{attributeName} length should be <= 255",
    val groups: Array<KClass<out Any>> = [],
    val payload: Array<KClass<out Any>> = []
)
