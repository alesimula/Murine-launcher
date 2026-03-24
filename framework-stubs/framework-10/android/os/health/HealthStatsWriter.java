package android.os.health;

public class HealthStatsWriter {
    private final android.os.health.HealthKeys.Constants mConstants = null;
    private final boolean[] mTimerFields = null;
    private final int[] mTimerCounts = null;
    private final long[] mTimerTimes = null;
    private final boolean[] mMeasurementFields = null;
    private final long[] mMeasurementValues = null;
    private final android.util.ArrayMap<java.lang.String, android.os.health.HealthStatsWriter>[] mStatsValues = null;
    private final android.util.ArrayMap<java.lang.String, android.os.health.TimerStat>[] mTimersValues = null;
    private final android.util.ArrayMap<java.lang.String, java.lang.Long>[] mMeasurementsValues = null;
    public HealthStatsWriter(android.os.health.HealthKeys.Constants p0) {}
    public void addTimer(int p0, int p1, long p2) {}
    public void addMeasurement(int p0, long p1) {}
    public void addStats(int p0, java.lang.String p1, android.os.health.HealthStatsWriter p2) {}
    public void addTimers(int p0, java.lang.String p1, android.os.health.TimerStat p2) {}
    public void addMeasurements(int p0, java.lang.String p1, long p2) {}
    public void flattenToParcel(android.os.Parcel p0) {}
    private static int countBooleanArray(boolean[] p0) { return 0; }
    private static <T extends java.lang.Object> int countObjectArray(T[] p0) { return 0; }
    private static void writeHealthStatsWriterMap(android.os.Parcel p0, android.util.ArrayMap<java.lang.String, android.os.health.HealthStatsWriter> p1) {}
    private static <T extends android.os.Parcelable> void writeParcelableMap(android.os.Parcel p0, android.util.ArrayMap<java.lang.String, T> p1) {}
    private static void writeLongsMap(android.os.Parcel p0, android.util.ArrayMap<java.lang.String, java.lang.Long> p1) {}
}
