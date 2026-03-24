package android.os;

public final class Trace {
    public static final long TRACE_TAG_NEVER = 0L;
    public static final long TRACE_TAG_ALWAYS = 1L;
    public static final long TRACE_TAG_GRAPHICS = 2L;
    public static final long TRACE_TAG_INPUT = 4L;
    public static final long TRACE_TAG_VIEW = 8L;
    public static final long TRACE_TAG_WEBVIEW = 16L;
    public static final long TRACE_TAG_WINDOW_MANAGER = 32L;
    public static final long TRACE_TAG_ACTIVITY_MANAGER = 64L;
    public static final long TRACE_TAG_SYNC_MANAGER = 128L;
    public static final long TRACE_TAG_AUDIO = 256L;
    public static final long TRACE_TAG_VIDEO = 512L;
    public static final long TRACE_TAG_CAMERA = 1024L;
    public static final long TRACE_TAG_HAL = 2048L;
    public static final long TRACE_TAG_APP = 4096L;
    public static final long TRACE_TAG_RESOURCES = 8192L;
    public static final long TRACE_TAG_DALVIK = 16384L;
    public static final long TRACE_TAG_RS = 32768L;
    public static final long TRACE_TAG_BIONIC = 65536L;
    public static final long TRACE_TAG_POWER = 131072L;
    public static final long TRACE_TAG_PACKAGE_MANAGER = 262144L;
    public static final long TRACE_TAG_SYSTEM_SERVER = 524288L;
    public static final long TRACE_TAG_DATABASE = 1048576L;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final long TRACE_TAG_NETWORK = 2097152L;
    public static final long TRACE_TAG_ADB = 4194304L;
    public static final long TRACE_TAG_VIBRATOR = 8388608L;
    @android.annotation.SystemApi
    public static final long TRACE_TAG_AIDL = 16777216L;
    public static final long TRACE_TAG_NNAPI = 33554432L;
    public static final long TRACE_TAG_RRO = 67108864L;
    public static final long TRACE_TAG_THERMAL = 134217728L;
    public static final int MAX_SECTION_NAME_LEN = 127;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static boolean isTagEnabled(long p0) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static void traceCounter(long p0, java.lang.String p1, int p2) {}
    public static void setAppTracingAllowed(boolean p0) {}
    public static void setTracingEnabled(boolean p0, int p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static void traceBegin(long p0, java.lang.String p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static void traceEnd(long p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static void asyncTraceBegin(long p0, java.lang.String p1, int p2) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static void asyncTraceEnd(long p0, java.lang.String p1, int p2) {}
    public static void asyncTraceForTrackBegin(long p0, java.lang.String p1, java.lang.String p2, int p3) {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.os.async_trace_for_track")
    public static void asyncTraceForTrackBegin(java.lang.String p0, java.lang.String p1, int p2) {}
    public static void asyncTraceForTrackEnd(long p0, java.lang.String p1, int p2) {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.os.async_trace_for_track")
    public static void asyncTraceForTrackEnd(java.lang.String p0, int p1) {}
    public static void instant(long p0, java.lang.String p1) {}
    public static void instantForTrack(long p0, java.lang.String p1, java.lang.String p2) {}
    public static boolean isEnabled() { return false; }
    public static void beginSection(java.lang.String p0) {}
    public static void endSection() {}
    public static void beginAsyncSection(java.lang.String p0, int p1) {}
    public static void endAsyncSection(java.lang.String p0, int p1) {}
    public static void setCounter(java.lang.String p0, long p1) {}
    public static void setCounter(long p0, java.lang.String p1, long p2) {}
    public static void registerWithPerfetto() {}
}
