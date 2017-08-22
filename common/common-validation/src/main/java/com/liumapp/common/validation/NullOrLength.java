package com.liumapp.common.validation;

import org.hibernate.validator.constraints.CompositionType;
import org.hibernate.validator.constraints.ConstraintComposition;
import org.hibernate.validator.constraints.Length;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Size;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liumapp on 8/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@ConstraintComposition(CompositionType.OR)
@Size(min = 0,max = 0)
@Length(min = 6, max = 12)
@ReportAsSingleViolation
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { })
public @interface NullOrLength {

    String message() default "{org.hibernate.validator.constraints.Length.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}

