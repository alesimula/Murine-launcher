package com.android.internal.os;

public class KernelSingleUidTimeReader {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = false;
    private static final java.lang.String PROC_FILE_DIR = "/proc/uid/";
    private static final java.lang.String PROC_FILE_NAME = "/time_in_state";
    private static final java.lang.String UID_TIMES_PROC_FILE = "/proc/uid_time_in_state";
    public static final int TOTAL_READ_ERROR_COUNT = 5;
    private final int mCpuFreqsCount = 0;
    private android.util.SparseArray<long[]> mLastUidCpuTimeMs;
    private int mReadErrorCounter;
    private boolean mSingleUidCpuTimesAvailable;
    private boolean mCpuFreqsCountVerified;
    private final com.android.internal.os.KernelSingleUidTimeReader.Injector mInjector = null;
    KernelSingleUidTimeReader(int p0) {}
    public KernelSingleUidTimeReader(int p0, com.android.internal.os.KernelSingleUidTimeReader.Injector p1) {}
    public boolean singleUidCpuTimesAvailable() { return false; }
    public long[] readDeltaMs(int p0) { return null; }
    private void verifyCpuFreqsCount(int p0, java.lang.String p1) {}
    private long[] readCpuTimesFromByteBuffer(java.nio.ByteBuffer p0) { return null; }
    public long[] computeDelta(int p0, long[] p1) { return null; }
    public long[] getDeltaLocked(long[] p0, long[] p1) { return null; }
    public void setAllUidsCpuTimesMs(android.util.SparseArray<long[]> p0) {}
    public void removeUid(int p0) {}
    public void removeUidsInRange(int p0, int p1) {}
    public android.util.SparseArray<long[]> getLastUidCpuTimeMs() { return null; }
    public void setSingleUidCpuTimesAvailable(boolean p0) {}

    public static class Injector {
        public Injector() {}
        public byte[] readData(java.lang.String p0) throws java.io.IOException { return null; }
    }
}
