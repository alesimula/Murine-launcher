package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.ANNOTATION_TYPE)
public @interface StringDef {
    public java.lang.String[] prefix() default {};
    public java.lang.String[] suffix() default {};
    public java.lang.String[] value() default {};
}
