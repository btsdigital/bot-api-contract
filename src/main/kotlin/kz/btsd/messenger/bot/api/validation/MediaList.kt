package kz.btsd.messenger.bot.api.validation

import javax.validation.Constraint
import javax.validation.ReportAsSingleViolation
import javax.validation.constraints.Size
import kotlin.reflect.KClass

@MustBeDocumented
@Size(max = 100)
@ReportAsSingleViolation
@Constraint(validatedBy = [])
@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class MediaList(
    val attributeName: String = "mediaList",
    val message: String = "{attributeName} size should be <= 100",
    val groups: Array<KClass<out Any>> = [],
    val payload: Array<KClass<out Any>> = []
)
