package com.android.internal.os;

public class KernelSingleProcessCpuThreadReader {
    public KernelSingleProcessCpuThreadReader(int p0, com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader p1) throws java.io.IOException {}
    public static com.android.internal.os.KernelSingleProcessCpuThreadReader create(int p0) { return null; }
    public void startTrackingThreadCpuTimes() {}
    public void setSelectedThreadIds(int[] p0) {}
    public int getCpuFrequencyCount() { return 0; }
    public com.android.internal.os.KernelSingleProcessCpuThreadReader.ProcessCpuUsage getProcessCpuUsage() { return null; }

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
