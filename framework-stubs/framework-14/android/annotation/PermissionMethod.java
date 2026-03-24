package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
public @interface PermissionMethod {
    @android.annotation.PermissionName
    public java.lang.String[] value() default {};
    public boolean anyOf() default false;
    public boolean orSelf() default false;
}
