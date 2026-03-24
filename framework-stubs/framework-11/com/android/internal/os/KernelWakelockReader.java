package com.android.internal.os;

public class KernelWakelockReader {
    private static final java.lang.String TAG = "KernelWakelockReader";
    private static int sKernelWakelockUpdateVersion;
    private static final java.lang.String sWakelockFile = "/proc/wakelocks";
    private static final java.lang.String sWakeupSourceFile = "/d/wakeup_sources";
    private static final java.lang.String sSysClassWakeupDir = "/sys/class/wakeup";
    private static final int[] PROC_WAKELOCKS_FORMAT = null;
    private static final int[] WAKEUP_SOURCES_FORMAT = null;
    private final java.lang.String[] mProcWakelocksName = null;
    private final long[] mProcWakelocksData = null;
    private android.system.suspend.ISuspendControlService mSuspendControlService;
    private byte[] mKernelWakelockBuffer;
    public KernelWakelockReader() {}
    public final com.android.internal.os.KernelWakelockStats readKernelWakelockStats(com.android.internal.os.KernelWakelockStats p0) { return null; }
    private com.android.internal.os.KernelWakelockStats getWakelockStatsFromSystemSuspend(com.android.internal.os.KernelWakelockStats p0) { return null; }
    public com.android.internal.os.KernelWakelockStats updateWakelockStats(android.system.suspend.WakeLockInfo[] p0, com.android.internal.os.KernelWakelockStats p1) { return null; }
    public com.android.internal.os.KernelWakelockStats parseProcWakelocks(byte[] p0, int p1, boolean p2, com.android.internal.os.KernelWakelockStats p3) { return null; }
    public com.android.internal.os.KernelWakelockStats updateVersion(com.android.internal.os.KernelWakelockStats p0) { return null; }
    public com.android.internal.os.KernelWakelockStats removeOldStats(com.android.internal.os.KernelWakelockStats p0) { return null; }
}
