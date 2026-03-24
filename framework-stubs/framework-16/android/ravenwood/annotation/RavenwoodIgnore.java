package android.ravenwood.annotation;

@java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface RavenwoodIgnore {
    public java.lang.Class<?>[] blockedBy() default {};
    public java.lang.String reason() default "";
    public long bug() default 0L;
    public java.lang.String comment() default "";
}
