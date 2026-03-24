package android.annotation;

@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Repeatable(android.annotation.RestrictedForEnvironment.Container.class)
public @interface RestrictedForEnvironment {
    public static final java.lang.String ENVIRONMENT_SDK_RUNTIME = "SDK Runtime";
    public java.lang.String[] environments();
    public int from();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    public static @interface Container {
        public android.annotation.RestrictedForEnvironment[] value();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Environment {
    }
}
