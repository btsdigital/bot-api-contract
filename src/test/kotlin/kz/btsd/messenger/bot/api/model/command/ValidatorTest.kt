package kz.btsd.messenger.bot.api.model.command

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import javax.validation.ConstraintViolation
import javax.validation.Validation
import javax.validation.Validator
import javax.validation.ValidatorFactory
import kotlin.reflect.KClass

open class ValidatorTest {
    protected lateinit var validator: Validator

    companion object {
        lateinit var validatorFactory: ValidatorFactory

        @BeforeAll
        @JvmStatic
        fun setupValidatorFactory() {
            validatorFactory = Validation.buildDefaultValidatorFactory()
        }
    }

    @BeforeEach
    fun init() {
        validator = validatorFactory.validator
    }

    protected fun ConstraintViolation<*>.violates(annotation: KClass<*>) {
        assertThat(this.constraintDescriptor.annotation).isInstanceOf(annotation.java)
    }

    protected fun Set<ConstraintViolation<*>>.violatesSingle(annotation: KClass<*>) {
        assertThat(size).isEqualTo(1)
        first().violates(annotation)
    }

    protected fun <T> T.violates(annotation: KClass<*>) {
        val violations = validator.validate(this)
        assertThat(violations.size).isEqualTo(1)
        violations.first().violates(annotation)
    }

    protected fun <T> T.noViolations() {
        assertThat(validator.validate(this)).isEmpty()
    }

    protected fun Set<ConstraintViolation<*>>.isValid() = assertThat(this).isEmpty()
}
