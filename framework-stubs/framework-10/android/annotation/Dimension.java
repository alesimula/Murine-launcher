package android.annotation;

@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
public @interface Dimension {
    public static final int DP = 0;
    public static final int PX = 1;
    public static final int SP = 2;
    public int unit() default 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Unit {
    }
}
