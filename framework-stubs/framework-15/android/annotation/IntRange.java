package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
public @interface IntRange {
    public long from() default -9223372036854775808L;
    public long to() default 9223372036854775807L;
}
