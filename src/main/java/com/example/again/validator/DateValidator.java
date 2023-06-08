package com.example.again.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Date;

public class DateValidator implements ConstraintValidator<ValidateXSourceValue, Date> {

    @Override
    public void initialize(ValidateXSourceValue constraintAnnotation) {
        // Initialization logic, if any
    }

    @Override
    public boolean isValid(Date date, ConstraintValidatorContext context) {
        // Validation logic for the date field
        return date != null && date.after(new Date());
    }
}
