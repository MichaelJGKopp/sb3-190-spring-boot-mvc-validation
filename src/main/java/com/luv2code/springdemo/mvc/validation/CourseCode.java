package com.luv2code.springdemo.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)    // define the class that will handle the validation logic
@Target({ElementType.FIELD, ElementType.METHOD})    // define where we can apply this annotation
@Retention(RetentionPolicy.RUNTIME)   // define how long the annotated type is retained
public @interface CourseCode { // define the annotation

    // define default course code
    String value() default "LUV";

    // define default error message
    String message() default "must start with LUV";

    // define default groups
    Class<?>[] groups() default {};  // empty collection

    // define default payloads
    Class<? extends Payload>[] payload() default {};
}
