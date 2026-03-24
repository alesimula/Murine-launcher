package com.android.net.module.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface GuardedBy {
    java.lang.String value() default "";
}
