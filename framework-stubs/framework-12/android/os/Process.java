package android.os;

public class Process {
    private static final java.lang.String LOG_TAG = "Process";
    public static final int INVALID_UID = -1;
    public static final int ROOT_UID = 0;
    public static final int SYSTEM_UID = 1000;
    public static final int PHONE_UID = 1001;
    public static final int SHELL_UID = 2000;
    public static final int LOG_UID = 1007;
    public static final int WIFI_UID = 1010;
    public static final int MEDIA_UID = 1013;
    public static final int DRM_UID = 1019;
    public static final int SDCARD_RW_GID = 1015;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int VPN_UID = 1016;
    public static final int KEYSTORE_UID = 1017;
    public static final int CREDSTORE_UID = 1076;
    public static final int NFC_UID = 1027;
    public static final int CLAT_UID = 1029;
    public static final int BLUETOOTH_UID = 1002;
    public static final int MEDIA_RW_GID = 1023;
    public static final int PACKAGE_INFO_GID = 1032;
    public static final int SHARED_RELRO_UID = 1037;
    public static final int AUDIOSERVER_UID = 1041;
    public static final int CAMERASERVER_UID = 1047;
    public static final int DNS_TETHER_UID = 1052;
    public static final int WEBVIEW_ZYGOTE_UID = 1053;
    public static final int OTA_UPDATE_UID = 1061;
    public static final int STATSD_UID = 1066;
    public static final int INCIDENTD_UID = 1067;
    public static final int SE_UID = 1068;
    public static final int IORAPD_UID = 1071;
    public static final int NETWORK_STACK_UID = 1073;
    public static final int FSVERITY_CERT_UID = 1075;
    public static final int EXTERNAL_STORAGE_GID = 1077;
    public static final int EXT_DATA_RW_GID = 1078;
    public static final int EXT_OBB_RW_GID = 1079;
    public static final int UWB_UID = 1083;
    public static final int INET_GID = 3003;
    public static final int NOBODY_UID = 9999;
    public static final int FIRST_APPLICATION_UID = 10000;
    public static final int LAST_APPLICATION_UID = 19999;
    public static final int FIRST_APP_ZYGOTE_ISOLATED_UID = 90000;
    public static final int NUM_UIDS_PER_APP_ZYGOTE = 100;
    public static final int LAST_APP_ZYGOTE_ISOLATED_UID = 98999;
    public static final int FIRST_ISOLATED_UID = 99000;
    public static final int LAST_ISOLATED_UID = 99999;
    public static final int SHARED_USER_GID = 9997;
    public static final int FIRST_SHARED_APPLICATION_GID = 50000;
    public static final int LAST_SHARED_APPLICATION_GID = 59999;
    public static final int FIRST_APPLICATION_CACHE_GID = 20000;
    public static final int LAST_APPLICATION_CACHE_GID = 29999;
    public static final int THREAD_PRIORITY_DEFAULT = 0;
    public static final int THREAD_PRIORITY_LOWEST = 19;
    public static final int THREAD_PRIORITY_BACKGROUND = 10;
    public static final int THREAD_PRIORITY_FOREGROUND = -2;
    public static final int THREAD_PRIORITY_DISPLAY = -4;
    public static final int THREAD_PRIORITY_URGENT_DISPLAY = -8;
    public static final int THREAD_PRIORITY_VIDEO = -10;
    public static final int THREAD_PRIORITY_TOP_APP_BOOST = -10;
    public static final int THREAD_PRIORITY_AUDIO = -16;
    public static final int THREAD_PRIORITY_URGENT_AUDIO = -19;
    public static final int THREAD_PRIORITY_MORE_FAVORABLE = -1;
    public static final int THREAD_PRIORITY_LESS_FAVORABLE = 1;
    public static final int SCHED_OTHER = 0;
    public static final int SCHED_FIFO = 1;
    public static final int SCHED_RR = 2;
    public static final int SCHED_BATCH = 3;
    public static final int SCHED_IDLE = 5;
    public static final int SCHED_RESET_ON_FORK = 1073741824;
    public static final int THREAD_GROUP_DEFAULT = -1;
    public static final int THREAD_GROUP_BACKGROUND = 0;
    private static final int THREAD_GROUP_FOREGROUND = 1;
    public static final int THREAD_GROUP_SYSTEM = 2;
    public static final int THREAD_GROUP_AUDIO_APP = 3;
    public static final int THREAD_GROUP_AUDIO_SYS = 4;
    public static final int THREAD_GROUP_TOP_APP = 5;
    public static final int THREAD_GROUP_RT_APP = 6;
    public static final int THREAD_GROUP_RESTRICTED = 7;
    public static final int SIGNAL_QUIT = 3;
    public static final int SIGNAL_KILL = 9;
    public static final int SIGNAL_USR1 = 10;
    private static long sStartElapsedRealtime;
    private static long sStartUptimeMillis;
    private static final int PIDFD_UNKNOWN = 0;
    private static final int PIDFD_SUPPORTED = 1;
    private static final int PIDFD_UNSUPPORTED = 2;
    private static int sPidFdSupported;
    public static final int ZYGOTE_POLICY_FLAG_EMPTY = 0;
    public static final int ZYGOTE_POLICY_FLAG_LATENCY_SENSITIVE = 1;
    public static final int ZYGOTE_POLICY_FLAG_BATCH_LAUNCH = 2;
    public static final int ZYGOTE_POLICY_FLAG_SYSTEM_PROCESS = 4;
    public static final android.os.ZygoteProcess ZYGOTE_PROCESS = null;
    public static final int PROC_TERM_MASK = 255;
    public static final int PROC_ZERO_TERM = 0;
    public static final int PROC_SPACE_TERM = 32;
    public static final int PROC_TAB_TERM = 9;
    public static final int PROC_NEWLINE_TERM = 10;
    public static final int PROC_COMBINE = 256;
    public static final int PROC_PARENS = 512;
    public static final int PROC_QUOTES = 1024;
    public static final int PROC_CHAR = 2048;
    public static final int PROC_OUT_STRING = 4096;
    public static final int PROC_OUT_LONG = 8192;
    public static final int PROC_OUT_FLOAT = 16384;
    public Process() {}
    public static android.os.Process.ProcessStartResult start(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, int p6, int p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, java.lang.String p13, int p14, boolean p15, long[] p16, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p17, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p18, boolean p19, boolean p20, java.lang.String[] p21) { return null; }
    public static android.os.Process.ProcessStartResult startWebView(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, int p6, int p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, java.lang.String p13, long[] p14, java.lang.String[] p15) { return null; }
    public static final native long getElapsedCpuTime();
    public static final long getStartElapsedRealtime() { return 0L; }
    public static final long getStartUptimeMillis() { return 0L; }
    public static final void setStartTimes(long p0, long p1) {}
    public static final boolean is64Bit() { return false; }
    public static final int myPid() { return 0; }
    public static final int myPpid() { return 0; }
    public static final int myTid() { return 0; }
    public static final int myUid() { return 0; }
    public static android.os.UserHandle myUserHandle() { return null; }
    public static boolean isCoreUid(int p0) { return false; }
    public static boolean isApplicationUid(int p0) { return false; }
    public static final boolean isIsolated() { return false; }
    public static final boolean isIsolated(int p0) { return false; }
    public static final native int getUidForName(java.lang.String p0);
    public static final native int getGidForName(java.lang.String p0);
    public static final int getUidForPid(int p0) { return 0; }
    public static final int getParentPid(int p0) { return 0; }
    public static final int getThreadGroupLeader(int p0) { return 0; }
    public static final native void setThreadPriority(int p0, int p1) throws java.lang.IllegalArgumentException, java.lang.SecurityException;
    public static final native void setCanSelfBackground(boolean p0);
    public static final native void setThreadGroup(int p0, int p1) throws java.lang.IllegalArgumentException, java.lang.SecurityException;
    public static final native void setThreadGroupAndCpuset(int p0, int p1) throws java.lang.IllegalArgumentException, java.lang.SecurityException;
    public static final native void setProcessGroup(int p0, int p1) throws java.lang.IllegalArgumentException, java.lang.SecurityException;
    public static final native void setProcessFrozen(int p0, int p1, boolean p2);
    public static final native void enableFreezer(boolean p0);
    public static final native int getProcessGroup(int p0) throws java.lang.IllegalArgumentException, java.lang.SecurityException;
    public static final native int createProcessGroup(int p0, int p1);
    public static final native int[] getExclusiveCores();
    public static final native void setThreadPriority(int p0) throws java.lang.IllegalArgumentException, java.lang.SecurityException;
    public static final native int getThreadPriority(int p0) throws java.lang.IllegalArgumentException;
    public static final native int getThreadScheduler(int p0) throws java.lang.IllegalArgumentException;
    public static final native void setThreadScheduler(int p0, int p1, int p2) throws java.lang.IllegalArgumentException;
    @java.lang.Deprecated
    public static final boolean supportsProcesses() { return false; }
    public static final native boolean setSwappiness(int p0, boolean p1);
    public static final native void setArgV0(java.lang.String p0);
    public static final void killProcess(int p0) {}
    public static final native int setUid(int p0);
    public static final native int setGid(int p0);
    public static final native void sendSignal(int p0, int p1);
    public static final void killProcessQuiet(int p0) {}
    public static final native void sendSignalQuiet(int p0, int p1);
    public static final native long getFreeMemory();
    public static final native long getTotalMemory();
    public static final native void readProcLines(java.lang.String p0, java.lang.String[] p1, long[] p2);
    public static final native int[] getPids(java.lang.String p0, int[] p1);
    public static final native boolean readProcFile(java.lang.String p0, int[] p1, java.lang.String[] p2, long[] p3, float[] p4);
    public static final native boolean parseProcLine(byte[] p0, int p1, int p2, int[] p3, java.lang.String[] p4, long[] p5, float[] p6);
    public static final native int[] getPidsForCommands(java.lang.String[] p0);
    public static final native long getPss(int p0);
    public static final native long[] getRss(int p0);
    public static final native int killProcessGroup(int p0, int p1);
    public static final native void removeAllProcessGroups();
    public static final boolean isThreadInProcess(int p0, int p1) { return false; }
    public static void waitForProcessDeath(int p0, int p1) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {}
    public static boolean supportsPidFd() { return false; }
    public static java.io.FileDescriptor openPidFd(int p0, int p1) throws java.io.IOException { return null; }
    private static native int nativePidFdOpen(int p0, int p1) throws android.system.ErrnoException;

    public static final class ProcessStartResult {
        public int pid;
        public boolean usingWrapper;
        public ProcessStartResult() {}
    }
}
