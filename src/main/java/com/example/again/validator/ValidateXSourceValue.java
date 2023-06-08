package com.example.again.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {XSourceValueValidator.class, DateValidator.class, IntegerValidator.class})
public @interface ValidateXSourceValue {
    String message() default "Invalid source value";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String[] allowedValues();
}
