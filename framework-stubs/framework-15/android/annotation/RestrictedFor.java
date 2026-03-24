package android.annotation;

@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Repeatable(android.annotation.RestrictedFor.Container.class)
public @interface RestrictedFor {
    public android.annotation.RestrictedFor.Environment[] environments();
    public int from();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    public static @interface Container {
        public android.annotation.RestrictedFor[] value();
    }

    public static enum Environment {
        SDK_SANDBOX;
    }
}
