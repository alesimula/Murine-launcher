package android.os;

public class PerformanceCollector {
    public static final java.lang.String METRIC_KEY_ITERATIONS = "iterations";
    public static final java.lang.String METRIC_KEY_LABEL = "label";
    public static final java.lang.String METRIC_KEY_CPU_TIME = "cpu_time";
    public static final java.lang.String METRIC_KEY_EXECUTION_TIME = "execution_time";
    public static final java.lang.String METRIC_KEY_PRE_RECEIVED_TRANSACTIONS = "pre_received_transactions";
    public static final java.lang.String METRIC_KEY_PRE_SENT_TRANSACTIONS = "pre_sent_transactions";
    public static final java.lang.String METRIC_KEY_RECEIVED_TRANSACTIONS = "received_transactions";
    public static final java.lang.String METRIC_KEY_SENT_TRANSACTIONS = "sent_transactions";
    public static final java.lang.String METRIC_KEY_GC_INVOCATION_COUNT = "gc_invocation_count";
    public static final java.lang.String METRIC_KEY_JAVA_ALLOCATED = "java_allocated";
    public static final java.lang.String METRIC_KEY_JAVA_FREE = "java_free";
    public static final java.lang.String METRIC_KEY_JAVA_PRIVATE_DIRTY = "java_private_dirty";
    public static final java.lang.String METRIC_KEY_JAVA_PSS = "java_pss";
    public static final java.lang.String METRIC_KEY_JAVA_SHARED_DIRTY = "java_shared_dirty";
    public static final java.lang.String METRIC_KEY_JAVA_SIZE = "java_size";
    public static final java.lang.String METRIC_KEY_NATIVE_ALLOCATED = "native_allocated";
    public static final java.lang.String METRIC_KEY_NATIVE_FREE = "native_free";
    public static final java.lang.String METRIC_KEY_NATIVE_PRIVATE_DIRTY = "native_private_dirty";
    public static final java.lang.String METRIC_KEY_NATIVE_PSS = "native_pss";
    public static final java.lang.String METRIC_KEY_NATIVE_SHARED_DIRTY = "native_shared_dirty";
    public static final java.lang.String METRIC_KEY_NATIVE_SIZE = "native_size";
    public static final java.lang.String METRIC_KEY_GLOBAL_ALLOC_COUNT = "global_alloc_count";
    public static final java.lang.String METRIC_KEY_GLOBAL_ALLOC_SIZE = "global_alloc_size";
    public static final java.lang.String METRIC_KEY_GLOBAL_FREED_COUNT = "global_freed_count";
    public static final java.lang.String METRIC_KEY_GLOBAL_FREED_SIZE = "global_freed_size";
    public static final java.lang.String METRIC_KEY_OTHER_PRIVATE_DIRTY = "other_private_dirty";
    public static final java.lang.String METRIC_KEY_OTHER_PSS = "other_pss";
    public static final java.lang.String METRIC_KEY_OTHER_SHARED_DIRTY = "other_shared_dirty";
    private android.os.PerformanceCollector.PerformanceResultsWriter mPerfWriter;
    private android.os.Bundle mPerfSnapshot;
    private android.os.Bundle mPerfMeasurement;
    private long mSnapshotCpuTime;
    private long mSnapshotExecTime;
    private long mCpuTime;
    private long mExecTime;
    @android.annotation.UnsupportedAppUsage
    public PerformanceCollector() {}
    public PerformanceCollector(android.os.PerformanceCollector.PerformanceResultsWriter p0) {}
    public void setPerformanceResultsWriter(android.os.PerformanceCollector.PerformanceResultsWriter p0) {}
    @android.annotation.UnsupportedAppUsage
    public void beginSnapshot(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.os.Bundle endSnapshot() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void startTiming(java.lang.String p0) {}
    public android.os.Bundle addIteration(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.os.Bundle stopTiming(java.lang.String p0) { return null; }
    public void addMeasurement(java.lang.String p0, long p1) {}
    public void addMeasurement(java.lang.String p0, float p1) {}
    public void addMeasurement(java.lang.String p0, java.lang.String p1) {}
    private void startPerformanceSnapshot() {}
    private void endPerformanceSnapshot() {}
    private static void startAllocCounting() {}
    private static void stopAllocCounting() {}
    private static android.os.Bundle getAllocCounts() { return null; }
    private static android.os.Bundle getBinderCounts() { return null; }

    public static interface PerformanceResultsWriter {
        public void writeBeginSnapshot(java.lang.String p0);
        public void writeEndSnapshot(android.os.Bundle p0);
        public void writeStartTiming(java.lang.String p0);
        public void writeStopTiming(android.os.Bundle p0);
        public void writeMeasurement(java.lang.String p0, long p1);
        public void writeMeasurement(java.lang.String p0, float p1);
        public void writeMeasurement(java.lang.String p0, java.lang.String p1);
    }
}
