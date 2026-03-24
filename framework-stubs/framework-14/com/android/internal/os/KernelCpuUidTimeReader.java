package com.android.internal.os;

public abstract class KernelCpuUidTimeReader<T extends java.lang.Object> {
    protected static final boolean DEBUG = false;
    final java.lang.String mTag = null;
    final android.util.SparseArray<T> mLastTimes = null;
    final com.android.internal.os.KernelCpuProcStringReader mReader = null;
    final boolean mThrottle = false;
    protected boolean mBpfTimesAvailable;
    final com.android.internal.os.KernelCpuUidBpfMapReader mBpfReader = null;
    KernelCpuUidTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, com.android.internal.os.KernelCpuUidBpfMapReader p1, boolean p2, com.android.internal.os.Clock p3) {}
    KernelCpuUidTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, boolean p1, com.android.internal.os.Clock p2) {}
    public void readDelta(com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p0) {}
    public void readDelta(boolean p0, com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p1) {}
    public void readAbsolute(com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p0) {}
    abstract void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p0, boolean p1);
    abstract void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p0);
    public void removeUid(int p0) {}
    public void removeUidsInRange(int p0, int p1) {}
    public void setThrottle(long p0) {}

    public static interface Callback<T extends java.lang.Object> {
        public void onUidCpuTime(int p0, T p1);
    }

    public static class KernelCpuUidActiveTimeReader extends com.android.internal.os.KernelCpuUidTimeReader<java.lang.Long> {
        public KernelCpuUidActiveTimeReader(boolean p0) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidActiveTimeReader(boolean p0, com.android.internal.os.Clock p1) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidActiveTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, com.android.internal.os.KernelCpuUidBpfMapReader p1, boolean p2) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<java.lang.Long> p0, boolean p1) {}
        void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<java.lang.Long> p0) {}
    }

    public static class KernelCpuUidClusterTimeReader extends com.android.internal.os.KernelCpuUidTimeReader<long[]> {
        public KernelCpuUidClusterTimeReader(boolean p0) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidClusterTimeReader(boolean p0, com.android.internal.os.Clock p1) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidClusterTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, com.android.internal.os.KernelCpuUidBpfMapReader p1, boolean p2) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        void processUidDelta(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0, boolean p1) {}
        void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
    }

    public static class KernelCpuUidFreqTimeReader extends com.android.internal.os.KernelCpuUidTimeReader<long[]> {
        public KernelCpuUidFreqTimeReader(boolean p0) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidFreqTimeReader(boolean p0, com.android.internal.os.Clock p1) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidFreqTimeReader(java.lang.String p0, com.android.internal.os.KernelCpuProcStringReader p1, com.android.internal.os.KernelCpuUidBpfMapReader p2, boolean p3) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public boolean perClusterTimesAvailable() { return false; }
        public boolean allUidTimesAvailable() { return false; }
        public android.util.SparseArray<long[]> getAllUidCpuFreqTimeMs() { return null; }
        public long[] readFreqs(com.android.internal.os.PowerProfile p0) { return null; }
        void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0, boolean p1) {}
        void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        public boolean isFastCpuTimesReader() { return false; }
    }

    public static class KernelCpuUidUserSysTimeReader extends com.android.internal.os.KernelCpuUidTimeReader<long[]> {
        public KernelCpuUidUserSysTimeReader(boolean p0) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidUserSysTimeReader(boolean p0, com.android.internal.os.Clock p1) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidUserSysTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, boolean p1, com.android.internal.os.Clock p2) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0, boolean p1) {}
        void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        public void removeUid(int p0) {}
        public void removeUidsInRange(int p0, int p1) {}
    }
}
