package br.gradefinder;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface EhMain {
    int version() default 1;
}