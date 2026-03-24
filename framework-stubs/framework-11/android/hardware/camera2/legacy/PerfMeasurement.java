package android.hardware.camera2.legacy;

class PerfMeasurement {
    private static final java.lang.String TAG = "PerfMeasurement";
    public static final int DEFAULT_MAX_QUERIES = 3;
    private final long mNativeContext = 0L;
    private int mCompletedQueryCount;
    private java.util.ArrayList<java.lang.Long> mCollectedGpuDurations;
    private java.util.ArrayList<java.lang.Long> mCollectedCpuDurations;
    private java.util.ArrayList<java.lang.Long> mCollectedTimestamps;
    private java.util.Queue<java.lang.Long> mTimestampQueue;
    private java.util.Queue<java.lang.Long> mCpuDurationsQueue;
    private long mStartTimeNs;
    private static final long NO_DURATION_YET = -1L;
    private static final long FAILED_TIMING = -2L;
    public PerfMeasurement() {}
    public PerfMeasurement(int p0) {}
    public static boolean isGlTimingSupported() { return false; }
    public void dumpPerformanceData(java.lang.String p0) {}
    public void startTimer() {}
    public void stopTimer() {}
    public void addTimestamp(long p0) {}
    private long getNextGlDuration() { return 0L; }
    public int getCompletedQueryCount() { return 0; }
    protected void finalize() {}
    private static native long nativeCreateContext(int p0);
    private static native void nativeDeleteContext(long p0);
    private static native boolean nativeQuerySupport();
    protected static native void nativeStartGlTimer(long p0);
    protected static native void nativeStopGlTimer(long p0);
    protected static native long nativeGetNextGlDuration(long p0);
}
