package android.ravenwood.annotation;

@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface RavenwoodClassLoadHook {
    public static final java.lang.String LIBANDROID_LOADING_HOOK = "com.android.platform.test.ravenwood.runtimehelper.ClassLoadHook.onClassLoaded";
    public java.lang.String value();
    public java.lang.String comment() default "";
}
