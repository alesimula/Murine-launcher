package android.compat.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface UnsupportedAppUsage {
    int maxTargetSdk() default 0;
    long trackingBug() default 0L;
    java.lang.String publicAlternatives() default "";
    java.lang.String overrideSourcePosition() default "";
    java.lang.String implicitMember() default "";
}
