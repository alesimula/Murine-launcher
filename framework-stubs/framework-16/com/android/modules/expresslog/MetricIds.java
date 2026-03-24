package com.android.modules.expresslog;

public final class MetricIds {
    public static final long INVALID_METRIC_ID = 0L;
    public static final int METRIC_TYPE_UNKNOWN = 0;
    public static final int METRIC_TYPE_COUNTER = 1;
    public static final int METRIC_TYPE_HISTOGRAM = 2;
    public static final int METRIC_TYPE_COUNTER_WITH_UID = 3;
    public static final int METRIC_TYPE_HISTOGRAM_WITH_UID = 4;
    public MetricIds() {}
    static long getMetricIdHash(java.lang.String p0, int p1) { return 0L; }

    private static final class MetricInfo {
        public long mHash;
        public int mType;
        MetricInfo(long p0, int p1) {}
    }
}
