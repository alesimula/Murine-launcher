package com.android.internal.os;

public class KernelCpuThreadReader {
    public KernelCpuThreadReader(int p0, java.util.function.Predicate<java.lang.Integer> p1, java.nio.file.Path p2, java.nio.file.Path p3, com.android.internal.os.KernelCpuThreadReader.Injector p4) throws java.io.IOException {}
    public static com.android.internal.os.KernelCpuThreadReader create(int p0, java.util.function.Predicate<java.lang.Integer> p1) { return null; }
    public java.util.ArrayList<com.android.internal.os.KernelCpuThreadReader.ProcessCpuUsage> getProcessCpuUsage() { return null; }
    public int[] getCpuFrequenciesKhz() { return null; }
    void setNumBuckets(int p0) {}
    void setUidPredicate(java.util.function.Predicate<java.lang.Integer> p0) {}

    public static class FrequencyBucketCreator {
        public FrequencyBucketCreator(long[] p0, int p1) {}
        public int[] bucketValues(long[] p0) { return null; }
        public int[] bucketFrequencies(long[] p0) { return null; }
    }

    public static class Injector {
        public Injector() {}
        public int getUidForPid(int p0) { return 0; }
    }

    public static class ProcessCpuUsage {
        public final int processId = 0;
        public final java.lang.String processName = null;
        public final int uid = 0;
        public java.util.ArrayList<com.android.internal.os.KernelCpuThreadReader.ThreadCpuUsage> threadCpuUsages;
        public ProcessCpuUsage(int p0, java.lang.String p1, int p2, java.util.ArrayList<com.android.internal.os.KernelCpuThreadReader.ThreadCpuUsage> p3) {}
    }

    public static class ThreadCpuUsage {
        public final int threadId = 0;
        public final java.lang.String threadName = null;
        public int[] usageTimesMillis;
        public ThreadCpuUsage(int p0, java.lang.String p1, int[] p2) {}
    }
}
