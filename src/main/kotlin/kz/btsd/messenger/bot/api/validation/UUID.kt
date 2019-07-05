package kz.btsd.messenger.bot.api.validation

import javax.validation.Constraint
import kotlin.reflect.KClass

@MustBeDocumented
@Constraint(validatedBy = [UuidValidator::class])
@Target(AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY, AnnotationTarget.PROPERTY_GETTER)
@Retention(AnnotationRetention.RUNTIME)
annotation class UUID(
    val message: String = "{attributeName} is not a valid UUID",
    val attributeName: String = "id",
    val groups: Array<KClass<out Any>> = [],
    val payload: Array<KClass<out Any>> = []
)
