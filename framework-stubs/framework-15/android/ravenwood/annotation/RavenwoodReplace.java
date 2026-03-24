package android.ravenwood.annotation;

@java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface RavenwoodReplace {
    public java.lang.Class<?>[] blockedBy() default {};
    public java.lang.String reason() default "";
}
