package com.android.internal.os;

public class KernelSingleProcessCpuThreadReader {
    private static final java.lang.String TAG = "KernelSingleProcCpuThreadRdr";
    private static final boolean DEBUG = false;
    private final int mPid = 0;
    private final com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader mCpuTimeInStateReader = null;
    private int[] mSelectedThreadNativeTids;
    private int mFrequencyCount;
    private boolean mIsTracking;
    public KernelSingleProcessCpuThreadReader(int p0, com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader p1) throws java.io.IOException {}
    public static com.android.internal.os.KernelSingleProcessCpuThreadReader create(int p0) { return null; }
    public void startTrackingThreadCpuTimes() {}
    public void setSelectedThreadIds(int[] p0) {}
    public int getCpuFrequencyCount() { return 0; }
    public com.android.internal.os.KernelSingleProcessCpuThreadReader.ProcessCpuUsage getProcessCpuUsage() { return null; }
    private native int getCpuFrequencyCount(com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader p0);
    private native boolean startTrackingProcessCpuTimes(int p0, com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader p1);
    private native boolean startAggregatingThreadCpuTimes(int[] p0, com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader p1);
    private native boolean readProcessCpuUsage(int p0, long[] p1, long[] p2, com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader p3);

    public static interface CpuTimeInStateReader {
        public int getCpuFrequencyCount();
        public boolean startTrackingProcessCpuTimes(int p0);
        public boolean startAggregatingTaskCpuTimes(int p0, int p1);
        public java.lang.String[] getAggregatedTaskCpuFreqTimes(int p0);
    }

    public static class ProcessCpuUsage {
        public long[] threadCpuTimesMillis;
        public long[] selectedThreadCpuTimesMillis;
        public ProcessCpuUsage(int p0) {}
    }
}
