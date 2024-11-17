package com.ynova.sistema_reservas.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CityFormatValidator.class)
public @interface ICityFormatConstraint {

    String message () default "Inavalid format of the city";

    Class <?> [] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
