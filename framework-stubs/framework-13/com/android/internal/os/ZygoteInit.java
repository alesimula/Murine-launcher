package com.android.internal.os;

public class ZygoteInit {
    static void preload(android.util.TimingsTraceLog p0) {}
    static void lazyPreload() {}
    static native void nativePreloadGraphicsDriver();
    public static void setApiDenylistExemptions(java.lang.String[] p0) {}
    public static void setHiddenApiAccessLogSampleRate(int p0) {}
    public static void setHiddenApiUsageLogger(dalvik.system.VMRuntime.HiddenApiUsageLogger p0) {}
    static java.lang.ClassLoader createPathClassLoader(java.lang.String p0, int p1) { return null; }
    public static void main(java.lang.String[] p0) {}
    static boolean isPreloadComplete() { return false; }
    public static java.lang.Runnable zygoteInit(int p0, long[] p1, java.lang.String[] p2, java.lang.ClassLoader p3) { return null; }
    static java.lang.Runnable childZygoteInit(java.lang.String[] p0) { return null; }
}
