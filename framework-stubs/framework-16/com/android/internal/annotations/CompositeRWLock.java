package com.android.internal.annotations;

@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface CompositeRWLock {
    public java.lang.String[] value() default {};
}
