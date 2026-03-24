package android.ravenwood.annotation;

@java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface RavenwoodRedirect {
    public java.lang.String comment() default "";
}
