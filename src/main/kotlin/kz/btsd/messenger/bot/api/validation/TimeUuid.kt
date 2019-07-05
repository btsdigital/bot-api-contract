package kz.btsd.messenger.bot.api.validation

import javax.validation.Constraint
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.FIELD
import kotlin.annotation.AnnotationTarget.PROPERTY
import kotlin.annotation.AnnotationTarget.PROPERTY_GETTER
import kotlin.annotation.AnnotationTarget.VALUE_PARAMETER
import kotlin.reflect.KClass

@MustBeDocumented
@Constraint(validatedBy = [TimeUuidValidator::class])
@Target(FIELD, VALUE_PARAMETER, PROPERTY, PROPERTY_GETTER)
@Retention(RUNTIME)
annotation class TimeUuid(
    val message: String = "{attributeName} is not a valid Time UUID",
    val attributeName: String = "Value",
    val groups: Array<KClass<out Any>> = [],
    val payload: Array<KClass<out Any>> = []
)
