package com.hello.ultra.base.anotation;

import com.hello.ultra.base.enums.API;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by cjh on 2017. 3. 2..
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface ControllerCheck {
    API type();
}
