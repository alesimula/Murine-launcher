package android.ravenwood.annotation;

@java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface RavenwoodSupported {
    public android.ravenwood.annotation.RavenwoodSupported.SupportType type();
    public java.lang.String subclass() default "";
    public java.lang.String comment() default "";
    public long bug() default 0L;

    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface RavenwoodProvidingImplementation {
        public java.lang.Class<?> target();
        public java.lang.String comment() default "";
    }

    public static enum SupportType {
        OTHER,
        SUBCLASS;
    }
}
