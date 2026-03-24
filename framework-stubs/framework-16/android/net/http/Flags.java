package android.net.http;

public final class Flags {
    public static final java.lang.String FLAG_PRELOAD_HTTPENGINE_IN_ZYGOTE = "android.net.http.preload_httpengine_in_zygote";
    public static final java.lang.String FLAG_PRELOAD_HTTPENGINE_JAVA_IMPL_CLASSES = "android.net.http.preload_httpengine_java_impl_classes";
    public static final java.lang.String FLAG_PRELOAD_HTTPENGINE_SHARED_LIBRARY = "android.net.http.preload_httpengine_shared_library";
    public Flags() {}
    public static boolean preloadHttpengineInZygote() { return false; }
    public static boolean preloadHttpengineJavaImplClasses() { return false; }
    public static boolean preloadHttpengineSharedLibrary() { return false; }
}
