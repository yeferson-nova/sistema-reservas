package com.ynova.sistema_reservas.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CityFormatValidator implements ConstraintValidator<ICityFormatConstraint, String> {

    @Override
    public boolean isValid(String field, ConstraintValidatorContext context) {
        return field != null &&
                field.length() == 3 &&
                field.matches("[A-Z]+");
    }

}
