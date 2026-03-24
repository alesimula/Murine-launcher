package com.android.internal.location.gnssmetrics;

public class GnssMetrics {
    private static final java.lang.String TAG = null;
    private static final int GPS_SIGNAL_QUALITY_UNKNOWN = -1;
    private static final int GPS_SIGNAL_QUALITY_POOR = 0;
    private static final int GPS_SIGNAL_QUALITY_GOOD = 1;
    public static final int NUM_GPS_SIGNAL_QUALITY_LEVELS = 2;
    private static final int DEFAULT_TIME_BETWEEN_FIXES_MILLISECS = 1000;
    private java.lang.String mLogStartInElapsedRealTime;
    private static final double HZ_PER_MHZ = 1000000.0;
    private com.android.internal.location.gnssmetrics.GnssMetrics.GnssPowerMetrics mGnssPowerMetrics;
    private static final double L5_CARRIER_FREQ_RANGE_LOW_HZ = 1164000000.0;
    private static final double L5_CARRIER_FREQ_RANGE_HIGH_HZ = 1189000000.0;
    private boolean[] mConstellationTypes;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics mLocationFailureStatistics;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics mTimeToFirstFixSecStatistics;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics mPositionAccuracyMeterStatistics;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics mTopFourAverageCn0Statistics;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics mTopFourAverageCn0StatisticsL5;
    private int mNumSvStatus;
    private int mNumL5SvStatus;
    private int mNumSvStatusUsedInFix;
    private int mNumL5SvStatusUsedInFix;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics mLocationFailureReportsStatistics;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics mTimeToFirstFixMilliSReportsStatistics;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics mPositionAccuracyMetersReportsStatistics;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics mTopFourAverageCn0DbmHzReportsStatistics;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics mL5TopFourAverageCn0DbmHzReportsStatistics;
    private long mSvStatusReports;
    private long mL5SvStatusReports;
    private long mSvStatusReportsUsedInFix;
    private long mL5SvStatusReportsUsedInFix;
    private android.app.StatsManager mStatsManager;
    public GnssMetrics(android.content.Context p0, com.android.internal.app.IBatteryStats p1) {}
    public void logReceivedLocationStatus(boolean p0) {}
    public void logMissedReports(int p0, int p1) {}
    public void logTimeToFirstFixMilliSecs(int p0) {}
    public void logPositionAccuracyMeters(float p0) {}
    public void logCn0(float[] p0, int p1, float[] p2) {}
    private static boolean isL5Sv(float p0) { return false; }
    public void logSvStatus(android.location.GnssStatus p0) {}
    private void logCn0L5(int p0, float[] p1, float[] p2) {}
    public void logConstellationType(int p0) {}
    public java.lang.String dumpGnssMetricsAsProtoString() { return null; }
    public java.lang.String dumpGnssMetricsAsText() { return null; }
    private void reset() {}
    public void resetConstellationTypes() {}
    private void registerGnssStats() {}

    private class GnssPowerMetrics {
        public static final double POOR_TOP_FOUR_AVG_CN0_THRESHOLD_DB_HZ = 20.0;
        private static final double REPORTING_THRESHOLD_DB_HZ = 1.0;
        private final com.android.internal.app.IBatteryStats mBatteryStats = null;
        private double mLastAverageCn0;
        private int mLastSignalLevel;
        private GnssPowerMetrics(com.android.internal.location.gnssmetrics.GnssMetrics p0, com.android.internal.app.IBatteryStats p1) {}
        public com.android.internal.location.nano.GnssLogsProto.PowerMetrics buildProto() { return null; }
        public android.os.connectivity.GpsBatteryStats getGpsBatteryStats() { return null; }
        public void reportSignalQuality(float[] p0, int p1) {}
        private int getSignalLevel(double p0) { return 0; }
    }

    private static class Statistics {
        private int mCount;
        private double mSum;
        private double mSumSquare;
        private long mLongSum;
        private Statistics() {}
        public synchronized void reset() {}
        public synchronized void addItem(double p0) {}
        public synchronized int getCount() { return 0; }
        public synchronized double getMean() { return 0.0; }
        public synchronized double getStandardDeviation() { return 0.0; }
        public synchronized long getLongSum() { return 0L; }
    }

    private class StatsPullAtomCallbackImpl implements android.app.StatsManager.StatsPullAtomCallback {
        private StatsPullAtomCallbackImpl(com.android.internal.location.gnssmetrics.GnssMetrics p0) {}
        public int onPullAtom(int p0, java.util.List<android.util.StatsEvent> p1) { return 0; }
    }
}
