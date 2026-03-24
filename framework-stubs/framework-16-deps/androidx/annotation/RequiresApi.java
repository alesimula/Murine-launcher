package androidx.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface RequiresApi {
    int value() default 0;
}
