package android.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.PACKAGE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Repeatable(android.annotation.SystemApi.Container.class)
public @interface SystemApi {
    public android.annotation.SystemApi.Client client() default android.annotation.SystemApi.Client.PRIVILEGED_APPS;

    public static enum Client {
        PRIVILEGED_APPS,
        MODULE_LIBRARIES,
        SYSTEM_SERVER;
        private Client() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    public static @interface Container {
        public android.annotation.SystemApi[] value();
    }
}
