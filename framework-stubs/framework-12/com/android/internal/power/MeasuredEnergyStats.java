package com.android.internal.power;

public class MeasuredEnergyStats {
    private static final java.lang.String TAG = "MeasuredEnergyStats";
    public static final int POWER_BUCKET_UNKNOWN = -1;
    public static final int POWER_BUCKET_SCREEN_ON = 0;
    public static final int POWER_BUCKET_SCREEN_DOZE = 1;
    public static final int POWER_BUCKET_SCREEN_OTHER = 2;
    public static final int POWER_BUCKET_CPU = 3;
    public static final int POWER_BUCKET_WIFI = 4;
    public static final int POWER_BUCKET_BLUETOOTH = 5;
    public static final int POWER_BUCKET_GNSS = 6;
    public static final int POWER_BUCKET_MOBILE_RADIO = 7;
    public static final int NUMBER_STANDARD_POWER_BUCKETS = 8;
    private final long[] mAccumulatedChargeMicroCoulomb = null;
    private final java.lang.String[] mCustomBucketNames = null;
    public MeasuredEnergyStats(boolean[] p0, java.lang.String[] p1) {}
    private MeasuredEnergyStats(com.android.internal.power.MeasuredEnergyStats p0) {}
    public static com.android.internal.power.MeasuredEnergyStats createFromTemplate(com.android.internal.power.MeasuredEnergyStats p0) { return null; }
    private MeasuredEnergyStats(int p0) {}
    public MeasuredEnergyStats(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0) {}
    private void readSummaryFromParcel(android.os.Parcel p0, boolean p1) {}
    private void writeSummaryToParcel(android.os.Parcel p0, boolean p1) {}
    private int getNumberOfIndices() { return 0; }
    public void updateStandardBucket(int p0, long p1) {}
    public void updateCustomBucket(int p0, long p1) {}
    private void updateEntry(int p0, long p1) {}
    public long getAccumulatedStandardBucketCharge(int p0) { return 0L; }
    public long getAccumulatedCustomBucketCharge(int p0) { return 0L; }
    public long[] getAccumulatedCustomBucketCharges() { return null; }
    public static int getDisplayPowerBucket(int p0) { return 0; }
    public static com.android.internal.power.MeasuredEnergyStats createAndReadSummaryFromParcel(android.os.Parcel p0) { return null; }
    public static com.android.internal.power.MeasuredEnergyStats createAndReadSummaryFromParcel(android.os.Parcel p0, com.android.internal.power.MeasuredEnergyStats p1) { return null; }
    private boolean containsInterestingData() { return false; }
    public static void writeSummaryToParcel(com.android.internal.power.MeasuredEnergyStats p0, android.os.Parcel p1, boolean p2, boolean p3) {}
    private void reset() {}
    public static void resetIfNotNull(com.android.internal.power.MeasuredEnergyStats p0) {}
    private void setValueIfSupported(int p0, long p1) {}
    public boolean isStandardBucketSupported(int p0) { return false; }
    private boolean isIndexSupported(int p0) { return false; }
    public boolean isSupportEqualTo(boolean[] p0, java.lang.String[] p1) { return false; }
    public java.lang.String[] getCustomBucketNames() { return null; }
    public void dump(java.io.PrintWriter p0) {}
    private java.lang.String getBucketName(int p0) { return null; }
    public int getNumberCustomPowerBuckets() { return 0; }
    private static int customBucketToIndex(int p0) { return 0; }
    private static int indexToCustomBucket(int p0) { return 0; }
    private static void checkValidStandardBucket(int p0) {}
    private static boolean isValidStandardBucket(int p0) { return false; }
    public boolean isValidCustomBucket(int p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StandardPowerBucket {
    }
}
