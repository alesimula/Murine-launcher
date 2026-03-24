package androidx.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface VisibleForTesting {
    int otherwise() default 0;
}
