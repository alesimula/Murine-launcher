package com.android.internal.annotations;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
public @interface CachedPropertyDefaults {
    public java.lang.String module() default "system_server";
    public int max() default 32;
    public java.lang.String name() default "";
}
