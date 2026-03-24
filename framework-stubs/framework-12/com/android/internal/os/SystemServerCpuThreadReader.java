package com.android.internal.os;

public class SystemServerCpuThreadReader {
    private final com.android.internal.os.KernelSingleProcessCpuThreadReader mKernelCpuThreadReader = null;
    private long[] mLastThreadCpuTimesUs;
    private long[] mLastBinderThreadCpuTimesUs;
    private final com.android.internal.os.SystemServerCpuThreadReader.SystemServiceCpuThreadTimes mDeltaCpuThreadTimes = null;
    public static com.android.internal.os.SystemServerCpuThreadReader create() { return null; }
    public SystemServerCpuThreadReader(int p0, com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader p1) throws java.io.IOException {}
    public SystemServerCpuThreadReader(com.android.internal.os.KernelSingleProcessCpuThreadReader p0) {}
    public void startTrackingThreadCpuTime() {}
    public void setBinderThreadNativeTids(int[] p0) {}
    public com.android.internal.os.SystemServerCpuThreadReader.SystemServiceCpuThreadTimes readDelta() { return null; }
    public com.android.internal.os.SystemServerCpuThreadReader.SystemServiceCpuThreadTimes readAbsolute() { return null; }

    public static class SystemServiceCpuThreadTimes {
        public long[] threadCpuTimesUs;
        public long[] binderThreadCpuTimesUs;
        public SystemServiceCpuThreadTimes() {}
    }
}
