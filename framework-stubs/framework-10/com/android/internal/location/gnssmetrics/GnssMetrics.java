package com.android.internal.location.gnssmetrics;

public class GnssMetrics {
    private static final java.lang.String TAG = null;
    public static final int GPS_SIGNAL_QUALITY_UNKNOWN = -1;
    public static final int GPS_SIGNAL_QUALITY_POOR = 0;
    public static final int GPS_SIGNAL_QUALITY_GOOD = 1;
    public static final int NUM_GPS_SIGNAL_QUALITY_LEVELS = 2;
    private static final int DEFAULT_TIME_BETWEEN_FIXES_MILLISECS = 1000;
    private java.lang.String logStartInElapsedRealTime;
    private com.android.internal.location.gnssmetrics.GnssMetrics.GnssPowerMetrics mGnssPowerMetrics;
    private boolean[] mConstellationTypes;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics locationFailureStatistics;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics timeToFirstFixSecStatistics;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics positionAccuracyMeterStatistics;
    private com.android.internal.location.gnssmetrics.GnssMetrics.Statistics topFourAverageCn0Statistics;
    public GnssMetrics(com.android.internal.app.IBatteryStats p0) {}
    public void logReceivedLocationStatus(boolean p0) {}
    public void logMissedReports(int p0, int p1) {}
    public void logTimeToFirstFixMilliSecs(int p0) {}
    public void logPositionAccuracyMeters(float p0) {}
    public void logCn0(float[] p0, int p1) {}
    public void logConstellationType(int p0) {}
    public java.lang.String dumpGnssMetricsAsProtoString() { return null; }
    public java.lang.String dumpGnssMetricsAsText() { return null; }
    private void reset() {}
    public void resetConstellationTypes() {}

    private class Statistics {
        private int count;
        private double sum;
        private double sumSquare;
        private Statistics(com.android.internal.location.gnssmetrics.GnssMetrics p0) {}
        public void reset() {}
        public void addItem(double p0) {}
        public int getCount() { return 0; }
        public double getMean() { return 0.0; }
        public double getStandardDeviation() { return 0.0; }
    }

    private class GnssPowerMetrics {
        public static final double POOR_TOP_FOUR_AVG_CN0_THRESHOLD_DB_HZ = 20.0;
        private static final double REPORTING_THRESHOLD_DB_HZ = 1.0;
        private final com.android.internal.app.IBatteryStats mBatteryStats = null;
        private double mLastAverageCn0;
        private int mLastSignalLevel;
        public GnssPowerMetrics(com.android.internal.location.gnssmetrics.GnssMetrics p0, com.android.internal.app.IBatteryStats p1) {}
        public com.android.internal.location.nano.GnssLogsProto.PowerMetrics buildProto() { return null; }
        public android.os.connectivity.GpsBatteryStats getGpsBatteryStats() { return null; }
        public void reportSignalQuality(float[] p0, int p1) {}
        private int getSignalLevel(double p0) { return 0; }
    }
}
