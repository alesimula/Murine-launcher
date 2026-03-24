package com.android.internal.os;

public abstract class KernelCpuUidBpfMapReader {
    private static final int ERROR_THRESHOLD = 5;
    private static final long FRESHNESS_MS = 500L;
    private static final com.android.internal.os.KernelCpuUidBpfMapReader FREQ_TIME_READER = null;
    private static final com.android.internal.os.KernelCpuUidBpfMapReader ACTIVE_TIME_READER = null;
    private static final com.android.internal.os.KernelCpuUidBpfMapReader CLUSTER_TIME_READER = null;
    final java.lang.String mTag = null;
    private int mErrors;
    protected android.util.SparseArray<long[]> mData;
    private long mLastReadTime;
    protected final java.util.concurrent.locks.ReentrantReadWriteLock mLock = null;
    protected final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock mReadLock = null;
    protected final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock mWriteLock = null;
    public KernelCpuUidBpfMapReader() {}
    static com.android.internal.os.KernelCpuUidBpfMapReader getFreqTimeReaderInstance() { return null; }
    static com.android.internal.os.KernelCpuUidBpfMapReader getActiveTimeReaderInstance() { return null; }
    static com.android.internal.os.KernelCpuUidBpfMapReader getClusterTimeReaderInstance() { return null; }
    public boolean startTrackingBpfTimes() { return false; }
    protected abstract boolean readBpfData();
    public abstract long[] getDataDimensions();
    public void removeUidsInRange(int p0, int p1) {}
    public com.android.internal.os.KernelCpuUidBpfMapReader.BpfMapIterator open() { return null; }
    public com.android.internal.os.KernelCpuUidBpfMapReader.BpfMapIterator open(boolean p0) { return null; }
    private boolean dataValid() { return false; }

    public class BpfMapIterator implements java.lang.AutoCloseable {
        private int mPos;
        public BpfMapIterator(com.android.internal.os.KernelCpuUidBpfMapReader p0) {}
        public boolean getNextUid(long[] p0) { return false; }
        public void close() {}
    }

    public static class KernelCpuUidActiveTimeBpfMapReader extends com.android.internal.os.KernelCpuUidBpfMapReader {
        public KernelCpuUidActiveTimeBpfMapReader() { super(); }
        protected final native boolean readBpfData();
        public final native long[] getDataDimensions();
    }

    public static class KernelCpuUidClusterTimeBpfMapReader extends com.android.internal.os.KernelCpuUidBpfMapReader {
        public KernelCpuUidClusterTimeBpfMapReader() { super(); }
        protected final native boolean readBpfData();
        public final native long[] getDataDimensions();
    }

    public static class KernelCpuUidFreqTimeBpfMapReader extends com.android.internal.os.KernelCpuUidBpfMapReader {
        public KernelCpuUidFreqTimeBpfMapReader() { super(); }
        private final native boolean removeUidRange(int p0, int p1);
        protected final native boolean readBpfData();
        public final long[] getDataDimensions() { return null; }
        public void removeUidsInRange(int p0, int p1) {}
    }
}
