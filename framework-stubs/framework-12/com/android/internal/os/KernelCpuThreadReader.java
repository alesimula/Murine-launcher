package com.android.internal.os;

public class KernelCpuThreadReader {
    private static final java.lang.String TAG = "KernelCpuThreadReader";
    private static final boolean DEBUG = false;
    private static final java.lang.String CPU_STATISTICS_FILENAME = "time_in_state";
    private static final java.lang.String PROCESS_NAME_FILENAME = "cmdline";
    private static final java.lang.String THREAD_NAME_FILENAME = "comm";
    private static final java.lang.String PROCESS_DIRECTORY_FILTER = "[0-9]*";
    private static final java.lang.String DEFAULT_PROCESS_NAME = "unknown_process";
    private static final java.lang.String DEFAULT_THREAD_NAME = "unknown_thread";
    private static final java.nio.file.Path DEFAULT_PROC_PATH = null;
    private static final java.nio.file.Path DEFAULT_INITIAL_TIME_IN_STATE_PATH = null;
    private static final int ID_ERROR = -1;
    private java.util.function.Predicate<java.lang.Integer> mUidPredicate;
    private final java.nio.file.Path mProcPath = null;
    private int[] mFrequenciesKhz;
    private final com.android.internal.os.ProcTimeInStateReader mProcTimeInStateReader = null;
    private com.android.internal.os.KernelCpuThreadReader.FrequencyBucketCreator mFrequencyBucketCreator;
    private final com.android.internal.os.KernelCpuThreadReader.Injector mInjector = null;
    public KernelCpuThreadReader(int p0, java.util.function.Predicate<java.lang.Integer> p1, java.nio.file.Path p2, java.nio.file.Path p3, com.android.internal.os.KernelCpuThreadReader.Injector p4) throws java.io.IOException {}
    public static com.android.internal.os.KernelCpuThreadReader create(int p0, java.util.function.Predicate<java.lang.Integer> p1) { return null; }
    public java.util.ArrayList<com.android.internal.os.KernelCpuThreadReader.ProcessCpuUsage> getProcessCpuUsage() { return null; }
    public int[] getCpuFrequenciesKhz() { return null; }
    void setNumBuckets(int p0) {}
    void setUidPredicate(java.util.function.Predicate<java.lang.Integer> p0) {}
    private com.android.internal.os.KernelCpuThreadReader.ProcessCpuUsage getProcessCpuUsage(java.nio.file.Path p0, int p1, int p2) { return null; }
    private com.android.internal.os.KernelCpuThreadReader.ThreadCpuUsage getThreadCpuUsage(java.nio.file.Path p0) { return null; }
    private java.lang.String getProcessName(java.nio.file.Path p0) { return null; }
    private java.lang.String getThreadName(java.nio.file.Path p0) { return null; }
    private int getProcessId(java.nio.file.Path p0) { return 0; }

    public static class FrequencyBucketCreator {
        private final int mNumFrequencies = 0;
        private final int mNumBuckets = 0;
        private final int[] mBucketStartIndices = null;
        public FrequencyBucketCreator(long[] p0, int p1) {}
        public int[] bucketValues(long[] p0) { return null; }
        public int[] bucketFrequencies(long[] p0) { return null; }
        private static int[] getClusterStartIndices(long[] p0) { return null; }
        private static int[] getBucketStartIndices(int[] p0, int p1, int p2) { return null; }
        private static int getLowerBound(int p0, int[] p1) { return 0; }
        private static int getUpperBound(int p0, int[] p1, int p2) { return 0; }
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
