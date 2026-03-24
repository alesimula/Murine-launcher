package android.filterfw.core;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface GenerateFinalPort {
    public java.lang.String name() default "";
    public boolean hasDefault() default false;
}
