package androidx.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface RequiresPermission {
    java.lang.String value() default "";
}
