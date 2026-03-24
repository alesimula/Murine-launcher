package com.android.internal.power;

public class MeasuredEnergyStats {
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
    public MeasuredEnergyStats(com.android.internal.power.MeasuredEnergyStats.Config p0) {}
    public static com.android.internal.power.MeasuredEnergyStats createFromParcel(com.android.internal.power.MeasuredEnergyStats.Config p0, android.os.Parcel p1) { return null; }
    public MeasuredEnergyStats(com.android.internal.power.MeasuredEnergyStats.Config p0, android.os.Parcel p1) {}
    public void writeToParcel(android.os.Parcel p0) {}
    public void updateStandardBucket(int p0, long p1) {}
    public void updateStandardBucket(int p0, long p1, long p2) {}
    public void updateCustomBucket(int p0, long p1) {}
    public void updateCustomBucket(int p0, long p1, long p2) {}
    public void setState(int p0, long p1) {}
    public long getAccumulatedStandardBucketCharge(int p0) { return 0L; }
    public long getAccumulatedStandardBucketCharge(int p0, int p1) { return 0L; }
    public long getAccumulatedCustomBucketCharge(int p0) { return 0L; }
    public long[] getAccumulatedCustomBucketCharges() { return null; }
    public static int getDisplayPowerBucket(int p0) { return 0; }
    public static com.android.internal.power.MeasuredEnergyStats createAndReadSummaryFromParcel(com.android.internal.power.MeasuredEnergyStats.Config p0, android.os.Parcel p1) { return null; }
    public static void writeSummaryToParcel(com.android.internal.power.MeasuredEnergyStats p0, android.os.Parcel p1) {}
    public static void resetIfNotNull(com.android.internal.power.MeasuredEnergyStats p0) {}
    public boolean isStandardBucketSupported(int p0) { return false; }
    public void dump(java.io.PrintWriter p0) {}
    public int getNumberCustomPowerBuckets() { return 0; }
    public boolean isValidCustomBucket(int p0) { return false; }

    public static class Config {
        public Config(boolean[] p0, java.lang.String[] p1, int[] p2, java.lang.String[] p3) {}
        public boolean isCompatible(com.android.internal.power.MeasuredEnergyStats.Config p0) { return false; }
        public static void writeToParcel(com.android.internal.power.MeasuredEnergyStats.Config p0, android.os.Parcel p1) {}
        public static com.android.internal.power.MeasuredEnergyStats.Config createFromParcel(android.os.Parcel p0) { return null; }
        public boolean isSupportedBucket(int p0) { return false; }
        public java.lang.String[] getCustomBucketNames() { return null; }
        public boolean isSupportedMultiStateBucket(int p0) { return false; }
        public java.lang.String[] getStateNames() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StandardPowerBucket {
    }
}
