package com.android.libcore.readonly;

public final class Flags {
    public static final java.lang.String FLAG_NATIVE_METRICS = "com.android.libcore.readonly.native_metrics";
    public static final java.lang.String FLAG_POST_CLEANUP_APIS = "com.android.libcore.readonly.post_cleanup_apis";
    public Flags() {}
    public static boolean nativeMetrics() { return false; }
    public static boolean postCleanupApis() { return false; }
}
