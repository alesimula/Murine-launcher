package dalvik.annotation;

@java.lang.Deprecated
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(java.lang.annotation.ElementType.ANNOTATION_TYPE)
public @interface TestTarget {
    @java.lang.Deprecated
    public java.lang.String methodName() default "";
    @java.lang.Deprecated
    public java.lang.String conceptName() default "";
    @java.lang.Deprecated
    public java.lang.Class<?>[] methodArgs() default {};
}
