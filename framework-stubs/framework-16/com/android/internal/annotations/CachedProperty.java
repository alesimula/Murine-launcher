package com.android.internal.annotations;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
public @interface CachedProperty {
    public java.lang.String module() default "";
    public java.lang.String api() default "";
    public int max() default -1;
    public com.android.internal.annotations.CacheModifier[] mods() default com.android.internal.annotations.CacheModifier.STATIC;
    public boolean cacheNulls() default false;
}
