package com.example.design.eventBusMock;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Subscribe.
 * 注解
 * @author zhangteng 2/16/21
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public@interface Subscribe {

}
