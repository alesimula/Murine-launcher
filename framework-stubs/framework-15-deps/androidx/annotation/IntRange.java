package androidx.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface IntRange {
    long from() default 0L;
}
