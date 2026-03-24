package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER})
public @interface RequiresPermission {
    public java.lang.String value() default "";
    public java.lang.String[] allOf() default {};
    public java.lang.String[] anyOf() default {};
    public boolean conditional() default false;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER})
    public static @interface Read {
        public android.annotation.RequiresPermission value() default @android.annotation.RequiresPermission;
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER})
    public static @interface Write {
        public android.annotation.RequiresPermission value() default @android.annotation.RequiresPermission;
    }
}
