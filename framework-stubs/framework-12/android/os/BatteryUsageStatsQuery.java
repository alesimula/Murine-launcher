package android.os;

public final class BatteryUsageStatsQuery implements android.os.Parcelable {
    public static final android.os.BatteryUsageStatsQuery DEFAULT = null;
    public static final int FLAG_BATTERY_USAGE_STATS_POWER_PROFILE_MODEL = 1;
    public static final int FLAG_BATTERY_USAGE_STATS_INCLUDE_HISTORY = 2;
    public static final int FLAG_BATTERY_USAGE_STATS_INCLUDE_POWER_MODELS = 4;
    private static final long DEFAULT_MAX_STATS_AGE_MS = 300000L;
    private final int mFlags = 0;
    private final int[] mUserIds = null;
    private final long mMaxStatsAgeMs = 0L;
    private long mFromTimestamp;
    private long mToTimestamp;
    public static final android.os.Parcelable.Creator<android.os.BatteryUsageStatsQuery> CREATOR = null;
    private BatteryUsageStatsQuery(android.os.BatteryUsageStatsQuery.Builder p0) {}
    public int getFlags() { return 0; }
    public int[] getUserIds() { return null; }
    public boolean shouldForceUsePowerProfileModel() { return false; }
    public long getMaxStatsAge() { return 0L; }
    public long getFromTimestamp() { return 0L; }
    public long getToTimestamp() { return 0L; }
    private BatteryUsageStatsQuery(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BatteryUsageStatsFlags {
    }

    public static final class Builder {
        private int mFlags;
        private android.util.IntArray mUserIds;
        private long mMaxStatsAgeMs;
        private long mFromTimestamp;
        private long mToTimestamp;
        public Builder() {}
        public android.os.BatteryUsageStatsQuery build() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder addUser(android.os.UserHandle p0) { return null; }
        public android.os.BatteryUsageStatsQuery.Builder includeBatteryHistory() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder powerProfileModeledOnly() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder includePowerModels() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder aggregateSnapshots(long p0, long p1) { return null; }
        public android.os.BatteryUsageStatsQuery.Builder setMaxStatsAgeMs(long p0) { return null; }
    }
}
