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
    public static final int MOUNT_EXTERNAL_NONE = 0;
    public static final int MOUNT_EXTERNAL_DEFAULT = 1;
    public static final int MOUNT_EXTERNAL_READ = 2;
    public static final int MOUNT_EXTERNAL_WRITE = 3;
    public static final int MOUNT_EXTERNAL_LEGACY = 4;
    public static final int MOUNT_EXTERNAL_INSTALLER = 5;
    public static final int MOUNT_EXTERNAL_FULL = 6;
    public static final int USAP_MANAGEMENT_MESSAGE_BYTES = 8;
    public static final java.lang.String CHILD_ZYGOTE_SOCKET_NAME_ARG = "--zygote-socket=";
    public static final java.lang.String CHILD_ZYGOTE_ABI_LIST_ARG = "--abi-list=";
    public static final java.lang.String CHILD_ZYGOTE_UID_RANGE_START = "--uid-range-start=";
    public static final java.lang.String CHILD_ZYGOTE_UID_RANGE_END = "--uid-range-end=";
    private static final java.lang.String ANDROID_SOCKET_PREFIX = "ANDROID_SOCKET_";
    public static final long PROPERTY_CHECK_INTERVAL = 60000L;
    public static final int SOCKET_BUFFER_SIZE = 256;
    protected static final int[][] INT_ARRAY_2D = null;
    public static final java.lang.String PRIMARY_SOCKET_NAME = "zygote";
    public static final java.lang.String SECONDARY_SOCKET_NAME = "zygote_secondary";
    public static final java.lang.String USAP_POOL_PRIMARY_SOCKET_NAME = "usap_pool_primary";
    public static final java.lang.String USAP_POOL_SECONDARY_SOCKET_NAME = "usap_pool_secondary";
    private static final java.lang.String USAP_ERROR_PREFIX = "Invalid command to USAP: ";
    private Zygote() {}
    public static int forkAndSpecialize(int p0, int p1, int[] p2, int p3, int[][] p4, int p5, java.lang.String p6, java.lang.String p7, int[] p8, int[] p9, boolean p10, java.lang.String p11, java.lang.String p12, int p13) { return 0; }
    private static native int nativeForkAndSpecialize(int p0, int p1, int[] p2, int p3, int[][] p4, int p5, java.lang.String p6, java.lang.String p7, int[] p8, int[] p9, boolean p10, java.lang.String p11, java.lang.String p12);
    public static void specializeAppProcess(int p0, int p1, int[] p2, int p3, int[][] p4, int p5, java.lang.String p6, java.lang.String p7, boolean p8, java.lang.String p9, java.lang.String p10) {}
    private static native void nativeSpecializeAppProcess(int p0, int p1, int[] p2, int p3, int[][] p4, int p5, java.lang.String p6, java.lang.String p7, boolean p8, java.lang.String p9, java.lang.String p10);
    static native void nativePreApplicationInit();
    public static int forkSystemServer(int p0, int p1, int[] p2, int p3, int[][] p4, long p5, long p6) { return 0; }
    private static native int nativeForkSystemServer(int p0, int p1, int[] p2, int p3, int[][] p4, long p5, long p6);
    protected static native void nativeAllowFileAcrossFork(java.lang.String p0);
    protected static void allowAppFilesAcrossFork(android.content.pm.ApplicationInfo p0) {}
    protected static native void nativeInstallSeccompUidGidFilter(int p0, int p1);
    static void initNativeState(boolean p0) {}
    protected static native void nativeInitNativeState(boolean p0);
    public static java.lang.String getConfigurationProperty(java.lang.String p0, java.lang.String p1) { return null; }
    protected static void emptyUsapPool() {}
    private static native void nativeEmptyUsapPool();
    public static boolean getConfigurationPropertyBoolean(java.lang.String p0, java.lang.Boolean p1) { return false; }
    static int getUsapPoolCount() { return 0; }
    private static native int nativeGetUsapPoolCount();
    static java.io.FileDescriptor getUsapPoolEventFD() { return null; }
    private static native int nativeGetUsapPoolEventFD();
    static java.lang.Runnable forkUsap(android.net.LocalServerSocket p0, int[] p1) { return null; }
    private static native int nativeForkUsap(int p0, int p1, int[] p2);
    private static java.lang.Runnable usapMain(android.net.LocalServerSocket p0, java.io.FileDescriptor p1) { return null; }
    private static void blockSigTerm() {}
    private static native void nativeBlockSigTerm();
    private static void unblockSigTerm() {}
    private static native void nativeUnblockSigTerm();
    private static void validateUsapCommand(com.android.internal.os.ZygoteArguments p0) {}
    protected static void disableExecuteOnly(int p0) {}
    private static native boolean nativeDisableExecuteOnly();
    protected static int[] getUsapPipeFDs() { return null; }
    private static native int[] nativeGetUsapPipeFDs();
    protected static boolean removeUsapTableEntry(int p0) { return false; }
    private static native boolean nativeRemoveUsapTableEntry(int p0);
    protected static void applyUidSecurityPolicy(com.android.internal.os.ZygoteArguments p0, android.net.Credentials p1) throws com.android.internal.os.ZygoteSecurityException {}
    protected static void applyDebuggerSystemProperty(com.android.internal.os.ZygoteArguments p0) {}
    protected static void applyInvokeWithSecurityPolicy(com.android.internal.os.ZygoteArguments p0, android.net.Credentials p1) throws com.android.internal.os.ZygoteSecurityException {}
    protected static void applyInvokeWithSystemProperty(com.android.internal.os.ZygoteArguments p0) {}
    static java.lang.String[] readArgumentList(java.io.BufferedReader p0) throws java.io.IOException { return null; }
    static android.net.LocalServerSocket createManagedSocketFromInitSocket(java.lang.String p0) { return null; }
    private static void callPostForkSystemServerHooks() {}
    private static void callPostForkChildHooks(int p0, boolean p1, boolean p2, java.lang.String p3) {}
    static void resetNicePriority() {}
    public static void execShell(java.lang.String p0) {}
    public static void appendQuotedShellArgs(java.lang.StringBuilder p0, java.lang.String[] p1) {}
}
