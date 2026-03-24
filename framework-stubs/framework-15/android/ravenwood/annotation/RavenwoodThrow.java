package android.ravenwood.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface RavenwoodThrow {
    public java.lang.Class<?>[] blockedBy() default {};
    public java.lang.String reason() default "";
}
