package android.os;

public final class BatteryUsageStatsQuery implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.BatteryUsageStatsQuery DEFAULT = null;
    public static final int FLAG_BATTERY_USAGE_STATS_POWER_PROFILE_MODEL = 1;
    public static final int FLAG_BATTERY_USAGE_STATS_INCLUDE_HISTORY = 2;
    public static final int FLAG_BATTERY_USAGE_STATS_INCLUDE_POWER_MODELS = 4;
    public static final int FLAG_BATTERY_USAGE_STATS_INCLUDE_PROCESS_STATE_DATA = 8;
    public static final int FLAG_BATTERY_USAGE_STATS_INCLUDE_VIRTUAL_UIDS = 16;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.BatteryUsageStatsQuery> CREATOR = null;
    public int getFlags() { return 0; }
    @android.annotation.NonNull
    public int[] getUserIds() { return null; }
    public boolean shouldForceUsePowerProfileModel() { return false; }
    public boolean isProcessStateDataNeeded() { return false; }
    public int[] getPowerComponents() { return null; }
    public long getMaxStatsAge() { return 0L; }
    public double getMinConsumedPowerThreshold() { return 0.0; }
    public long getFromTimestamp() { return 0L; }
    public long getToTimestamp() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BatteryUsageStatsFlags {
    }

    public static final class Builder {
        public Builder() {}
        public android.os.BatteryUsageStatsQuery build() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder addUser(android.os.UserHandle p0) { return null; }
        public android.os.BatteryUsageStatsQuery.Builder includeBatteryHistory() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder includeProcessStateData() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder powerProfileModeledOnly() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder includePowerModels() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder includePowerComponents(int[] p0) { return null; }
        public android.os.BatteryUsageStatsQuery.Builder includeVirtualUids() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder aggregateSnapshots(long p0, long p1) { return null; }
        public android.os.BatteryUsageStatsQuery.Builder setMaxStatsAgeMs(long p0) { return null; }
        public android.os.BatteryUsageStatsQuery.Builder setMinConsumedPowerThreshold(double p0) { return null; }
    }
}
