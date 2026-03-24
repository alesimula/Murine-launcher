package com.android.internal.os;

public final class Zygote {
    public static final int DEBUG_ENABLE_JDWP = 1;
    public static final int DEBUG_ENABLE_CHECKJNI = 2;
    public static final int DEBUG_ENABLE_ASSERT = 4;
    public static final int DEBUG_ENABLE_SAFEMODE = 8;
    public static final int DEBUG_ENABLE_JNI_LOGGING = 16;
    public static final int DEBUG_GENERATE_DEBUG_INFO = 32;
    public static final int DEBUG_ALWAYS_JIT = 64;
    public static final int DEBUG_NATIVE_DEBUGGABLE = 128;
    public static final int DEBUG_JAVA_DEBUGGABLE = 256;
    public static final int DISABLE_VERIFIER = 512;
    public static final int ONLY_USE_SYSTEM_OAT_FILES = 1024;
    public static final int DEBUG_GENERATE_MINI_DEBUG_INFO = 2048;
    public static final int API_ENFORCEMENT_POLICY_MASK = 12288;
    public static final int API_ENFORCEMENT_POLICY_SHIFT = Integer.valueOf(0);
    public static final int PROFILE_SYSTEM_SERVER = 16384;
    public static final int PROFILE_FROM_SHELL = 32768;
    public static final int USE_APP_IMAGE_STARTUP_CACHE = 65536;
    public static final int DEBUG_IGNORE_APP_SIGNAL_HANDLER = 131072;
    public static final int DISABLE_TEST_API_ENFORCEMENT_POLICY = 262144;
    public static final int MEMORY_TAG_LEVEL_MASK = 1572864;
    public static final int MEMORY_TAG_LEVEL_NONE = 0;
    public static final int MEMORY_TAG_LEVEL_TBI = 524288;
    public static final int MEMORY_TAG_LEVEL_ASYNC = 1048576;
    public static final int MEMORY_TAG_LEVEL_SYNC = 1572864;
    public static final int GWP_ASAN_LEVEL_MASK = 6291456;
    public static final int GWP_ASAN_LEVEL_NEVER = 0;
    public static final int GWP_ASAN_LEVEL_LOTTERY = 2097152;
    public static final int GWP_ASAN_LEVEL_ALWAYS = 4194304;
    public static final int GWP_ASAN_LEVEL_DEFAULT = 6291456;
    public static final int NATIVE_HEAP_ZERO_INIT_ENABLED = 8388608;
    public static final int PROFILEABLE = 16777216;
    public static final int MOUNT_EXTERNAL_NONE = 0;
    public static final int MOUNT_EXTERNAL_DEFAULT = 1;
    public static final int MOUNT_EXTERNAL_INSTALLER = 2;
    public static final int MOUNT_EXTERNAL_PASS_THROUGH = 3;
    public static final int MOUNT_EXTERNAL_ANDROID_WRITABLE = 4;
    static final int USAP_MANAGEMENT_MESSAGE_BYTES = 8;
    public static final java.lang.String START_AS_TOP_APP_ARG = "--is-top-app";
    public static final java.lang.String PKG_DATA_INFO_MAP = "--pkg-data-info-map";
    public static final java.lang.String ALLOWLISTED_DATA_INFO_MAP = "--allowlisted-data-info-map";
    public static final java.lang.String BIND_MOUNT_APP_STORAGE_DIRS = "--bind-mount-storage-dirs";
    public static final java.lang.String BIND_MOUNT_APP_DATA_DIRS = "--bind-mount-data-dirs";
    public static final java.lang.String CHILD_ZYGOTE_SOCKET_NAME_ARG = "--zygote-socket=";
    public static final java.lang.String CHILD_ZYGOTE_ABI_LIST_ARG = "--abi-list=";
    public static final java.lang.String CHILD_ZYGOTE_UID_RANGE_START = "--uid-range-start=";
    public static final java.lang.String CHILD_ZYGOTE_UID_RANGE_END = "--uid-range-end=";
    public static final long PROPERTY_CHECK_INTERVAL = 60000L;
    public static final int SOCKET_BUFFER_SIZE = 256;
    static final int[][] INT_ARRAY_2D = null;
    public static final java.lang.String PRIMARY_SOCKET_NAME = "zygote";
    public static final java.lang.String SECONDARY_SOCKET_NAME = "zygote_secondary";
    public static final java.lang.String USAP_POOL_PRIMARY_SOCKET_NAME = "usap_pool_primary";
    public static final java.lang.String USAP_POOL_SECONDARY_SOCKET_NAME = "usap_pool_secondary";
    static int forkAndSpecialize(int p0, int p1, int[] p2, int p3, int[][] p4, int p5, java.lang.String p6, java.lang.String p7, int[] p8, int[] p9, boolean p10, java.lang.String p11, java.lang.String p12, boolean p13, java.lang.String[] p14, java.lang.String[] p15, boolean p16, boolean p17) { return 0; }
    static native void nativePreApplicationInit();
    static int forkSystemServer(int p0, int p1, int[] p2, int p3, int[][] p4, long p5, long p6) { return 0; }
    protected static native void nativeAllowFileAcrossFork(java.lang.String p0);
    static void allowAppFilesAcrossFork(android.content.pm.ApplicationInfo p0) {}
    static void markOpenedFilesBeforePreload() {}
    static void allowFilesOpenedByPreload() {}
    protected static native void nativeInstallSeccompUidGidFilter(int p0, int p1);
    static void initNativeState(boolean p0) {}
    protected static native void nativeInitNativeState(boolean p0);
    public static java.lang.String getConfigurationProperty(java.lang.String p0, java.lang.String p1) { return null; }
    static void emptyUsapPool() {}
    public static boolean getConfigurationPropertyBoolean(java.lang.String p0, java.lang.Boolean p1) { return false; }
    static int getUsapPoolCount() { return 0; }
    static java.io.FileDescriptor getUsapPoolEventFD() { return null; }
    static java.lang.Runnable forkUsap(android.net.LocalServerSocket p0, int[] p1, boolean p2) { return null; }
    static java.lang.Runnable forkSimpleApps(com.android.internal.os.ZygoteCommandBuffer p0, java.io.FileDescriptor p1, int p2, int p3, java.lang.String p4) { return null; }
    static void setAppProcessName(com.android.internal.os.ZygoteArguments p0, java.lang.String p1) {}
    static int[] getUsapPipeFDs() { return null; }
    static boolean removeUsapTableEntry(int p0) { return false; }
    static int minChildUid(android.net.Credentials p0) { return 0; }
    static void applyUidSecurityPolicy(com.android.internal.os.ZygoteArguments p0, android.net.Credentials p1) throws com.android.internal.os.ZygoteSecurityException {}
    static void applyDebuggerSystemProperty(com.android.internal.os.ZygoteArguments p0) {}
    static void applyInvokeWithSecurityPolicy(com.android.internal.os.ZygoteArguments p0, android.net.Credentials p1) throws com.android.internal.os.ZygoteSecurityException {}
    public static java.lang.String getWrapProperty(java.lang.String p0) { return null; }
    static void applyInvokeWithSystemProperty(com.android.internal.os.ZygoteArguments p0) {}
    static android.net.LocalServerSocket createManagedSocketFromInitSocket(java.lang.String p0) { return null; }
    static void execShell(java.lang.String p0) {}
    static void appendQuotedShellArgs(java.lang.StringBuilder p0, java.lang.String[] p1) {}
    public static native int nativeParseSigChld(byte[] p0, int p1, int[] p2);
    public static native boolean nativeSupportsMemoryTagging();
    public static native boolean nativeSupportsTaggedPointers();
    public static native int nativeCurrentTaggingLevel();
    public static int getMemorySafetyRuntimeFlags(android.content.pm.ApplicationInfo p0, android.content.pm.ProcessInfo p1, java.lang.String p2, com.android.internal.compat.IPlatformCompat p3) { return 0; }
    public static int getMemorySafetyRuntimeFlagsForSecondaryZygote(android.content.pm.ApplicationInfo p0, android.content.pm.ProcessInfo p1) { return 0; }
}
