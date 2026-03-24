package android.ravenwood.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface RavenwoodRemove {
    public java.lang.Class<?>[] blockedBy() default {};
    public java.lang.String reason() default "";
    public long bug() default 0L;
    public java.lang.String comment() default "";
}
