package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
public @interface RequiresFeature {
    public java.lang.String value() default "";
    public java.lang.String[] allOf() default {};
    public java.lang.String[] anyOf() default {};
    public java.lang.String enforcement() default "android.content.pm.PackageManager#hasSystemFeature";
}
