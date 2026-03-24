package androidx.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface ChecksSdkIntAtLeast {
    int api() default 0;
}
