package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE})
public @interface EnforcePermission {
    public java.lang.String value() default "";
    public java.lang.String[] allOf() default {};
    public java.lang.String[] anyOf() default {};
}
