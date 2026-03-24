package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.LOCAL_VARIABLE})
public @interface FloatRange {
    public double from() default Double.NEGATIVE_INFINITY;
    public double to() default Double.POSITIVE_INFINITY;
    public boolean fromInclusive() default true;
    public boolean toInclusive() default true;
}
