package com.sic.org.spring.remake.repository.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by pthanhtrung on 3/25/2016.
 * REF: http://tutorials.jenkov.com/java/annotations.html
 * REF: https://docs.oracle.com/javase/7/docs/api/java/lang/annotation/Inherited.html
 * REF: https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/context/annotation/Import.html
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(MyJpaRepositoriesRegistrar.class)
public @interface MyEnableJpaRepositories {
    String[] basePackages() default {};
}
