package android.os.health;

public class HealthStats {
    private java.lang.String mDataType;
    private int[] mTimerKeys;
    private int[] mTimerCounts;
    private long[] mTimerTimes;
    private int[] mMeasurementKeys;
    private long[] mMeasurementValues;
    private int[] mStatsKeys;
    private android.util.ArrayMap<java.lang.String, android.os.health.HealthStats>[] mStatsValues;
    private int[] mTimersKeys;
    private android.util.ArrayMap<java.lang.String, android.os.health.TimerStat>[] mTimersValues;
    private int[] mMeasurementsKeys;
    private android.util.ArrayMap<java.lang.String, java.lang.Long>[] mMeasurementsValues;
    private HealthStats() {}
    public HealthStats(android.os.Parcel p0) {}
    public java.lang.String getDataType() { return null; }
    public boolean hasTimer(int p0) { return false; }
    public android.os.health.TimerStat getTimer(int p0) { return null; }
    public int getTimerCount(int p0) { return 0; }
    public long getTimerTime(int p0) { return 0L; }
    public int getTimerKeyCount() { return 0; }
    public int getTimerKeyAt(int p0) { return 0; }
    public boolean hasMeasurement(int p0) { return false; }
    public long getMeasurement(int p0) { return 0L; }
    public int getMeasurementKeyCount() { return 0; }
    public int getMeasurementKeyAt(int p0) { return 0; }
    public boolean hasStats(int p0) { return false; }
    public java.util.Map<java.lang.String, android.os.health.HealthStats> getStats(int p0) { return null; }
    public int getStatsKeyCount() { return 0; }
    public int getStatsKeyAt(int p0) { return 0; }
    public boolean hasTimers(int p0) { return false; }
    public java.util.Map<java.lang.String, android.os.health.TimerStat> getTimers(int p0) { return null; }
    public int getTimersKeyCount() { return 0; }
    public int getTimersKeyAt(int p0) { return 0; }
    public boolean hasMeasurements(int p0) { return false; }
    public java.util.Map<java.lang.String, java.lang.Long> getMeasurements(int p0) { return null; }
    public int getMeasurementsKeyCount() { return 0; }
    public int getMeasurementsKeyAt(int p0) { return 0; }
    private static int getIndex(int[] p0, int p1) { return 0; }
    private static android.util.ArrayMap<java.lang.String, android.os.health.HealthStats> createHealthStatsMap(android.os.Parcel p0) { return null; }
    private static <T extends android.os.Parcelable> android.util.ArrayMap<java.lang.String, T> createParcelableMap(android.os.Parcel p0, android.os.Parcelable.Creator<T> p1) { return null; }
    private static android.util.ArrayMap<java.lang.String, java.lang.Long> createLongsMap(android.os.Parcel p0) { return null; }
}
