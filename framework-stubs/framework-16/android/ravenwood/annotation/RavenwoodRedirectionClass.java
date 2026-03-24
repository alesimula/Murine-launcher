package android.ravenwood.annotation;

@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface RavenwoodRedirectionClass {
    public java.lang.String value();
    public java.lang.String comment() default "";
}
