package com.example.again.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class IntegerValidator implements ConstraintValidator<ValidateXSourceValue, Integer> {

    @Override
    public void initialize(ValidateXSourceValue constraintAnnotation) {
        // Initialization logic, if any
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        // Validation logic for the Integer field
        return value != null && value > 0; // Example validation condition
    }
}
