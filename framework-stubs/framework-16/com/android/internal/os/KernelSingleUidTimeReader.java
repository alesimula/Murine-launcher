package com.android.internal.os;

public class KernelSingleUidTimeReader {
    public static final int TOTAL_READ_ERROR_COUNT = 5;
    public KernelSingleUidTimeReader(int p0) {}
    public KernelSingleUidTimeReader(int p0, com.android.internal.os.KernelSingleUidTimeReader.Injector p1) {}
    public boolean singleUidCpuTimesAvailable() { return false; }
    public long[] readDeltaMs(int p0) { return null; }
    public long[] computeDelta(int p0, long[] p1) { return null; }
    public long[] getDeltaLocked(long[] p0, long[] p1) { return null; }
    public void setAllUidsCpuTimesMs(android.util.SparseArray<long[]> p0) {}
    public void removeUid(int p0) {}
    public void removeUidsInRange(int p0, int p1) {}
    public void addDelta(int p0, com.android.internal.os.LongArrayMultiStateCounter p1, long p2) {}
    public void addDelta(int p0, com.android.internal.os.LongArrayMultiStateCounter p1, long p2, long[] p3) {}
    public android.util.SparseArray<long[]> getLastUidCpuTimeMs() { return null; }
    public void setSingleUidCpuTimesAvailable(boolean p0) {}

    public static class Injector {
        public Injector() {}
        public byte[] readData(java.lang.String p0) throws java.io.IOException { return null; }
        public native long[] readBpfData(int p0);
        public boolean addDelta(int p0, com.android.internal.os.LongArrayMultiStateCounter p1, long p2, long[] p3) { return false; }
        public boolean addDeltaForTest(int p0, com.android.internal.os.LongArrayMultiStateCounter p1, long p2, long[][] p3, long[] p4) { return false; }
    }
}
