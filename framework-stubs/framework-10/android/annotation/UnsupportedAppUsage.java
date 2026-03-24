package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Repeatable(android.annotation.UnsupportedAppUsage.Container.class)
public @interface UnsupportedAppUsage {
    public long trackingBug() default 0L;
    public int maxTargetSdk() default 2147483647;
    public java.lang.String expectedSignature() default "";
    public java.lang.String implicitMember() default "";

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    public static @interface Container {
        public android.annotation.UnsupportedAppUsage[] value();
    }
}
