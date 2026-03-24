package com.android.internal.telephony.metrics;

public class CallQualityMetrics {
    public CallQualityMetrics(com.android.internal.telephony.Phone p0) {}
    public void saveCallQuality(android.telephony.CallQuality p0) {}
    public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQualitySummary getCallQualitySummaryDl() { return null; }
    public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQualitySummary getCallQualitySummaryUl() { return null; }
    public java.lang.String toString() { return null; }

    private class TimestampedQualitySnapshot implements java.lang.Comparable<com.android.internal.telephony.metrics.CallQualityMetrics.TimestampedQualitySnapshot> {
        int mTimestampMs;
        int mCallQualityLevel;
        TimestampedQualitySnapshot(com.android.internal.telephony.metrics.CallQualityMetrics p0, int p1, int p2) {}
        public int compareTo(com.android.internal.telephony.metrics.CallQualityMetrics.TimestampedQualitySnapshot p0) { return 0; }
        public java.lang.String toString() { return null; }
    }
}
