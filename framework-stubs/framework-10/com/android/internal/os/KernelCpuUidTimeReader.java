package com.android.internal.os;

public abstract class KernelCpuUidTimeReader<T extends java.lang.Object> {
    protected static final boolean DEBUG = false;
    private static final long DEFAULT_MIN_TIME_BETWEEN_READ = 1000L;
    final java.lang.String mTag = null;
    final android.util.SparseArray<T> mLastTimes = null;
    final com.android.internal.os.KernelCpuProcStringReader mReader = null;
    final boolean mThrottle = false;
    private long mMinTimeBetweenRead;
    private long mLastReadTimeMs;
    KernelCpuUidTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, boolean p1) {}
    public void readDelta(com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p0) {}
    public void readAbsolute(com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p0) {}
    abstract void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p0);
    abstract void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p0);
    public void removeUid(int p0) {}
    public void removeUidsInRange(int p0, int p1) {}
    public void setThrottle(long p0) {}

    public static class KernelCpuUidUserSysTimeReader extends com.android.internal.os.KernelCpuUidTimeReader<long[]> {
        private static final java.lang.String REMOVE_UID_PROC_FILE = "/proc/uid_cputime/remove_uid_range";
        private final long[] mBuffer = null;
        private final long[] mUsrSysTime = null;
        public KernelCpuUidUserSysTimeReader(boolean p0) { super(null, false); }
        public KernelCpuUidUserSysTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, boolean p1) { super(null, false); }
        void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        public void removeUid(int p0) {}
        public void removeUidsInRange(int p0, int p1) {}
        private void removeUidsFromKernelModule(int p0, int p1) {}
    }

    public static class KernelCpuUidFreqTimeReader extends com.android.internal.os.KernelCpuUidTimeReader<long[]> {
        private static final java.lang.String UID_TIMES_PROC_FILE = "/proc/uid_time_in_state";
        private static final int MAX_ERROR_COUNT = 5;
        private final java.nio.file.Path mProcFilePath = null;
        private long[] mBuffer;
        private long[] mCurTimes;
        private long[] mDeltaTimes;
        private long[] mCpuFreqs;
        private int mFreqCount;
        private int mErrors;
        private boolean mPerClusterTimesAvailable;
        private boolean mAllUidTimesAvailable;
        public KernelCpuUidFreqTimeReader(boolean p0) { super(null, false); }
        public KernelCpuUidFreqTimeReader(java.lang.String p0, com.android.internal.os.KernelCpuProcStringReader p1, boolean p2) { super(null, false); }
        public boolean perClusterTimesAvailable() { return false; }
        public boolean allUidTimesAvailable() { return false; }
        public android.util.SparseArray<long[]> getAllUidCpuFreqTimeMs() { return null; }
        public long[] readFreqs(com.android.internal.os.PowerProfile p0) { return null; }
        private long[] readFreqs(java.lang.String p0) { return null; }
        void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        private void copyToCurTimes() {}
        private boolean checkPrecondition(com.android.internal.os.KernelCpuProcStringReader.ProcFileIterator p0) { return false; }
        private android.util.IntArray extractClusterInfoFromProcFileFreqs() { return null; }
    }

    public static class KernelCpuUidClusterTimeReader extends com.android.internal.os.KernelCpuUidTimeReader<long[]> {
        private int mNumClusters;
        private int mNumCores;
        private int[] mCoresOnClusters;
        private long[] mBuffer;
        private long[] mCurTime;
        private long[] mDeltaTime;
        public KernelCpuUidClusterTimeReader(boolean p0) { super(null, false); }
        public KernelCpuUidClusterTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, boolean p1) { super(null, false); }
        void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        private void sumClusterTime() {}
        private boolean checkPrecondition(com.android.internal.os.KernelCpuProcStringReader.ProcFileIterator p0) { return false; }
    }

    public static class KernelCpuUidActiveTimeReader extends com.android.internal.os.KernelCpuUidTimeReader<java.lang.Long> {
        private int mCores;
        private long[] mBuffer;
        public KernelCpuUidActiveTimeReader(boolean p0) { super(null, false); }
        public KernelCpuUidActiveTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, boolean p1) { super(null, false); }
        void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<java.lang.Long> p0) {}
        void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<java.lang.Long> p0) {}
        private static long sumActiveTime(long[] p0) { return 0L; }
        private boolean checkPrecondition(com.android.internal.os.KernelCpuProcStringReader.ProcFileIterator p0) { return false; }
    }

    public static interface Callback<T extends java.lang.Object> {
        public void onUidCpuTime(int p0, T p1);
    }
}
