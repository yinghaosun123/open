package com.syh.tcc.common.association;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TccTransaction {
    String confirmMethod() default  "confirm";//对应tcc中的commit
    String cancelMethod() default  "cancel";//对应tcc中的cancel
}
