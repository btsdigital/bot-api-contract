package kz.btsd.messenger.bot.api.validation

import javax.validation.Constraint
import javax.validation.ReportAsSingleViolation
import javax.validation.constraints.Size
import kotlin.reflect.KClass

@MustBeDocumented
@Size(max = 4096)
@ReportAsSingleViolation
@Constraint(validatedBy = [])
@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class Content(
    val attributeName: String = "content",
    val message: String = "{attributeName} length should be <= 4096",
    val groups: Array<KClass<out Any>> = [],
    val payload: Array<KClass<out Any>> = []
)
