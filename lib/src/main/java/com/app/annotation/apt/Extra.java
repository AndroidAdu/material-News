package com.app.annotation.apt;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Created by baixiaokang on 16/12/30.
 */
@Retention(CLASS)
@Target(FIELD)
public @interface Extra {
    String value();
}
