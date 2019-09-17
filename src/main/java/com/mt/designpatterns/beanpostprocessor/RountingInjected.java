package com.mt.designpatterns.beanpostprocessor;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 自定义注解
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface RountingInjected {
    String value() default "helloServiceImpl1";
}