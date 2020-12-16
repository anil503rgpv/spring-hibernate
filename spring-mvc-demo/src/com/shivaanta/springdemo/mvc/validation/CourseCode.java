package com.shivaanta.springdemo.mvc.validation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target(value = { ElementType.METHOD,ElementType.FIELD })
@Retention(RUNTIME)
public @interface CourseCode {
	
	public String value() default "LUV";
	public String message() default "must start with LUV";
	
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default {};

}
