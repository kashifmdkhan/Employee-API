package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.PARAMETER})
@Constraint(validatedBy = {AgeOddValidator.class})
public @interface AgeOddValidationAnnotation {
    String message() default "Age of Employee should be odd";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
