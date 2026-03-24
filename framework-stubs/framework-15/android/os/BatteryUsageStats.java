package android.os;

public final class BatteryUsageStats implements android.os.Parcelable, java.io.Closeable {
    public static final int AGGREGATE_BATTERY_CONSUMER_SCOPE_DEVICE = 0;
    public static final int AGGREGATE_BATTERY_CONSUMER_SCOPE_ALL_APPS = 1;
    public static final int AGGREGATE_BATTERY_CONSUMER_SCOPE_COUNT = 2;
    static final java.lang.String XML_TAG_BATTERY_USAGE_STATS = "battery_usage_stats";
    static final java.lang.String XML_TAG_AGGREGATE = "aggregate";
    static final java.lang.String XML_TAG_UID = "uid";
    static final java.lang.String XML_TAG_USER = "user";
    static final java.lang.String XML_TAG_POWER_COMPONENTS = "power_components";
    static final java.lang.String XML_TAG_COMPONENT = "component";
    static final java.lang.String XML_TAG_CUSTOM_COMPONENT = "custom_component";
    static final java.lang.String XML_ATTR_ID = "id";
    static final java.lang.String XML_ATTR_UID = "uid";
    static final java.lang.String XML_ATTR_USER_ID = "user_id";
    static final java.lang.String XML_ATTR_SCOPE = "scope";
    static final java.lang.String XML_ATTR_PREFIX_CUSTOM_COMPONENT = "custom_component_";
    static final java.lang.String XML_ATTR_PREFIX_INCLUDES_PROC_STATE_DATA = "includes_proc_state_data";
    static final java.lang.String XML_ATTR_START_TIMESTAMP = "start_timestamp";
    static final java.lang.String XML_ATTR_END_TIMESTAMP = "end_timestamp";
    static final java.lang.String XML_ATTR_PROCESS_STATE = "process_state";
    static final java.lang.String XML_ATTR_POWER = "power";
    static final java.lang.String XML_ATTR_DURATION = "duration";
    static final java.lang.String XML_ATTR_MODEL = "model";
    static final java.lang.String XML_ATTR_BATTERY_CAPACITY = "battery_capacity";
    static final java.lang.String XML_ATTR_DISCHARGE_PERCENT = "discharge_pct";
    static final java.lang.String XML_ATTR_DISCHARGE_LOWER = "discharge_lower";
    static final java.lang.String XML_ATTR_DISCHARGE_UPPER = "discharge_upper";
    static final java.lang.String XML_ATTR_DISCHARGE_DURATION = "discharge_duration";
    static final java.lang.String XML_ATTR_BATTERY_REMAINING = "battery_remaining";
    static final java.lang.String XML_ATTR_CHARGE_REMAINING = "charge_remaining";
    static final java.lang.String XML_ATTR_HIGHEST_DRAIN_PACKAGE = "highest_drain_package";
    static final java.lang.String XML_ATTR_TIME_IN_FOREGROUND = "time_in_foreground";
    static final java.lang.String XML_ATTR_TIME_IN_BACKGROUND = "time_in_background";
    static final java.lang.String XML_ATTR_TIME_IN_FOREGROUND_SERVICE = "time_in_foreground_service";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.BatteryUsageStats> CREATOR = null;
    public long getStatsStartTimestamp() { return 0L; }
    public long getStatsEndTimestamp() { return 0L; }
    public long getStatsDuration() { return 0L; }
    public double getConsumedPower() { return 0.0; }
    public double getBatteryCapacity() { return 0.0; }
    public int getDischargePercentage() { return 0; }
    public android.util.Range<java.lang.Double> getDischargedPowerRange() { return null; }
    public long getDischargeDurationMs() { return 0L; }
    public long getBatteryTimeRemainingMs() { return 0L; }
    public long getChargeTimeRemainingMs() { return 0L; }
    public android.os.AggregateBatteryConsumer getAggregateBatteryConsumer(int p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.os.UidBatteryConsumer> getUidBatteryConsumers() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.os.UserBatteryConsumer> getUserBatteryConsumers() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getCustomPowerComponentNames() { return null; }
    public boolean isProcessStateDataIncluded() { return false; }
    @android.annotation.NonNull
    public com.android.internal.os.BatteryStatsHistoryIterator iterateBatteryStatsHistory() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public byte[] getStatsProto() { return null; }
    public void dumpToProto(java.io.FileDescriptor p0) {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public void writeXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public static android.os.BatteryUsageStats createFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AggregateBatteryConsumerScope {
    }

    public static final class Builder {
        public Builder(java.lang.String[] p0) {}
        public Builder(java.lang.String[] p0, boolean p1, boolean p2, double p3) {}
        public boolean isProcessStateDataNeeded() { return false; }
        @android.annotation.NonNull
        public android.os.BatteryUsageStats build() { return null; }
        public android.os.BatteryUsageStats.Builder setBatteryCapacity(double p0) { return null; }
        public android.os.BatteryUsageStats.Builder setStatsStartTimestamp(long p0) { return null; }
        public android.os.BatteryUsageStats.Builder setStatsEndTimestamp(long p0) { return null; }
        public android.os.BatteryUsageStats.Builder setStatsDuration(long p0) { return null; }
        @android.annotation.NonNull
        public android.os.BatteryUsageStats.Builder setDischargePercentage(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.BatteryUsageStats.Builder setDischargedPowerRange(double p0, double p1) { return null; }
        @android.annotation.NonNull
        public android.os.BatteryUsageStats.Builder setDischargeDurationMs(long p0) { return null; }
        @android.annotation.NonNull
        public android.os.BatteryUsageStats.Builder setBatteryTimeRemainingMs(long p0) { return null; }
        @android.annotation.NonNull
        public android.os.BatteryUsageStats.Builder setChargeTimeRemainingMs(long p0) { return null; }
        @android.annotation.NonNull
        public android.os.BatteryUsageStats.Builder setBatteryHistory(com.android.internal.os.BatteryStatsHistory p0) { return null; }
        @android.annotation.NonNull
        public android.os.AggregateBatteryConsumer.Builder getAggregateBatteryConsumerBuilder(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.UidBatteryConsumer.Builder getOrCreateUidBatteryConsumerBuilder(android.os.BatteryStats.Uid p0) { return null; }
        @android.annotation.NonNull
        public android.os.UidBatteryConsumer.Builder getOrCreateUidBatteryConsumerBuilder(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.UserBatteryConsumer.Builder getOrCreateUserBatteryConsumerBuilder(int p0) { return null; }
        @android.annotation.NonNull
        public android.util.SparseArray<android.os.UidBatteryConsumer.Builder> getUidBatteryConsumerBuilders() { return null; }
        @android.annotation.NonNull
        public android.os.BatteryUsageStats.Builder add(android.os.BatteryUsageStats p0) { return null; }
        void dump(java.io.PrintWriter p0) {}
    }
}
