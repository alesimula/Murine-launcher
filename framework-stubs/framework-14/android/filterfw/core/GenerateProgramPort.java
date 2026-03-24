package android.filterfw.core;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface GenerateProgramPort {
    public java.lang.String name();
    public java.lang.Class type();
    public java.lang.String variableName() default "";
    public boolean hasDefault() default false;
}
