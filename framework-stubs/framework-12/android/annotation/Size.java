package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD})
public @interface Size {
    public long value() default -1L;
    public long min() default -9223372036854775808L;
    public long max() default 9223372036854775807L;
    public long multiple() default 1L;
}
