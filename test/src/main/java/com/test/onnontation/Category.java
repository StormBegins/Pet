package com.test.onnontation;

import com.sun.xml.internal.ws.developer.ValidationErrorHandler;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;

public @interface Category {
    String message() default "数字太大";
    float min() default 9;
    float max() default 10000;

    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
class CateValidator implements ConstraintValidator<Category,Float> {
    float min,max;

    @Override
    public void initialize(Category constraintAnnotation) {
        min = constraintAnnotation.min();
        max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Float aFloat, ConstraintValidatorContext constraintValidatorContext) {
        return aFloat >= min && aFloat <= max;
    }
}