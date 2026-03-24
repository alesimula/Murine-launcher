package com.android.internal.os;

public class ZygoteInit {
    private static final java.lang.String TAG = "Zygote";
    private static final boolean LOGGING_DEBUG = Boolean.valueOf(false);
    private static final java.lang.String PROPERTY_DISABLE_GRAPHICS_DRIVER_PRELOADING = "ro.zygote.disable_gl_preload";
    private static final int LOG_BOOT_PROGRESS_PRELOAD_START = 3020;
    private static final int LOG_BOOT_PROGRESS_PRELOAD_END = 3030;
    private static final java.lang.String ABI_LIST_ARG = "--abi-list=";
    private static final java.lang.String SOCKET_NAME_ARG = "--socket-name=";
    private static android.content.res.Resources mResources;
    private static final java.lang.String PRELOADED_CLASSES = "/system/etc/preloaded-classes";
    private static final boolean PRELOAD_RESOURCES = true;
    private static final int UNPRIVILEGED_UID = 9999;
    private static final int UNPRIVILEGED_GID = 9999;
    private static final int ROOT_UID = 0;
    private static final int ROOT_GID = 0;
    private static boolean sPreloadComplete;
    private static java.lang.ClassLoader sCachedSystemServerClassLoader;
    static void preload(android.util.TimingsTraceLog p0) {}
    static void lazyPreload() {}
    private static void beginPreload() {}
    private static void endPreload() {}
    private static void preloadSharedLibraries() {}
    private static native void nativePreloadAppProcessHALs();
    static native void nativePreloadGraphicsDriver();
    private static void maybePreloadGraphicsDriver() {}
    private static void preloadTextResources() {}
    private static void warmUpJcaProviders() {}
    private static void preloadClasses() {}
    private static void cacheNonBootClasspathClassLoaders() {}
    private static void preloadResources() {}
    private static int preloadColorStateLists(android.content.res.TypedArray p0) { return 0; }
    private static int preloadDrawables(android.content.res.TypedArray p0) { return 0; }
    private static void gcAndFinalize() {}
    private static boolean shouldProfileSystemServer() { return false; }
    private static java.lang.Runnable handleSystemServerProcess(com.android.internal.os.ZygoteArguments p0) { return null; }
    private static java.lang.ClassLoader getOrCreateSystemServerClassLoader() { return null; }
    private static void prepareSystemServerProfile(java.lang.String p0) throws android.os.RemoteException {}
    public static void setApiDenylistExemptions(java.lang.String[] p0) {}
    public static void setHiddenApiAccessLogSampleRate(int p0) {}
    public static void setHiddenApiUsageLogger(dalvik.system.VMRuntime.HiddenApiUsageLogger p0) {}
    static java.lang.ClassLoader createPathClassLoader(java.lang.String p0, int p1) { return null; }
    private static void performSystemServerDexOpt(java.lang.String p0) {}
    private static java.lang.String getSystemServerClassLoaderContext(java.lang.String p0) { return null; }
    private static java.lang.String encodeSystemServerClassPath(java.lang.String p0, java.lang.String p1) { return null; }
    private static java.lang.Runnable forkSystemServer(java.lang.String p0, java.lang.String p1, com.android.internal.os.ZygoteServer p2) { return null; }
    private static long posixCapabilitiesAsBits(int... p0) { return 0L; }
    public static void main(java.lang.String[] p0) {}
    private static boolean hasSecondZygote(java.lang.String p0) { return false; }
    private static void waitForSecondaryZygote(java.lang.String p0) {}
    static boolean isPreloadComplete() { return false; }
    private ZygoteInit() {}
    public static java.lang.Runnable zygoteInit(int p0, long[] p1, java.lang.String[] p2, java.lang.ClassLoader p3) { return null; }
    static java.lang.Runnable childZygoteInit(java.lang.String[] p0) { return null; }
    private static native void nativeZygoteInit();
}
