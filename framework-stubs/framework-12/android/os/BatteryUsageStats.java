package android.os;

public final class BatteryUsageStats implements android.os.Parcelable {
    public static final int AGGREGATE_BATTERY_CONSUMER_SCOPE_DEVICE = 0;
    public static final int AGGREGATE_BATTERY_CONSUMER_SCOPE_ALL_APPS = 1;
    public static final int AGGREGATE_BATTERY_CONSUMER_SCOPE_COUNT = 2;
    private static final int STATSD_PULL_ATOM_MAX_BYTES = 45000;
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
    static final java.lang.String XML_ATTR_START_TIMESTAMP = "start_timestamp";
    static final java.lang.String XML_ATTR_END_TIMESTAMP = "end_timestamp";
    static final java.lang.String XML_ATTR_POWER = "power";
    static final java.lang.String XML_ATTR_DURATION = "duration";
    static final java.lang.String XML_ATTR_MODEL = "model";
    static final java.lang.String XML_ATTR_BATTERY_CAPACITY = "battery_capacity";
    static final java.lang.String XML_ATTR_DISCHARGE_PERCENT = "discharge_pct";
    static final java.lang.String XML_ATTR_DISCHARGE_LOWER = "discharge_lower";
    static final java.lang.String XML_ATTR_DISCHARGE_UPPER = "discharge_upper";
    static final java.lang.String XML_ATTR_BATTERY_REMAINING = "battery_remaining";
    static final java.lang.String XML_ATTR_CHARGE_REMAINING = "charge_remaining";
    static final java.lang.String XML_ATTR_HIGHEST_DRAIN_PACKAGE = "highest_drain_package";
    static final java.lang.String XML_ATTR_TIME_IN_FOREGROUND = "time_in_foreground";
    static final java.lang.String XML_ATTR_TIME_IN_BACKGROUND = "time_in_background";
    private final int mDischargePercentage = 0;
    private final double mBatteryCapacityMah = 0.0;
    private final long mStatsStartTimestampMs = 0L;
    private final long mStatsEndTimestampMs = 0L;
    private final long mStatsDurationMs = 0L;
    private final double mDischargedPowerLowerBound = 0.0;
    private final double mDischargedPowerUpperBound = 0.0;
    private final long mBatteryTimeRemainingMs = 0L;
    private final long mChargeTimeRemainingMs = 0L;
    private final java.lang.String[] mCustomPowerComponentNames = null;
    private final java.util.List<android.os.UidBatteryConsumer> mUidBatteryConsumers = null;
    private final java.util.List<android.os.UserBatteryConsumer> mUserBatteryConsumers = null;
    private final android.os.AggregateBatteryConsumer[] mAggregateBatteryConsumers = null;
    private final android.os.Parcel mHistoryBuffer = null;
    private final java.util.List<android.os.BatteryStats.HistoryTag> mHistoryTagPool = null;
    public static final android.os.Parcelable.Creator<android.os.BatteryUsageStats> CREATOR = null;
    private static final double WEIGHT_CONSUMED_POWER = 1.0;
    private static final double WEIGHT_FOREGROUND_STATE = 2.777777777777778e-05;
    private static final double WEIGHT_BACKGROUND_STATE = 8.333333333333333e-05;
    private BatteryUsageStats(android.os.BatteryUsageStats.Builder p0) {}
    public long getStatsStartTimestamp() { return 0L; }
    public long getStatsEndTimestamp() { return 0L; }
    public long getStatsDuration() { return 0L; }
    public double getConsumedPower() { return 0.0; }
    public double getBatteryCapacity() { return 0.0; }
    public int getDischargePercentage() { return 0; }
    public android.util.Range<java.lang.Double> getDischargedPowerRange() { return null; }
    public long getBatteryTimeRemainingMs() { return 0L; }
    public long getChargeTimeRemainingMs() { return 0L; }
    public android.os.BatteryConsumer getAggregateBatteryConsumer(int p0) { return null; }
    public java.util.List<android.os.UidBatteryConsumer> getUidBatteryConsumers() { return null; }
    public java.util.List<android.os.UserBatteryConsumer> getUserBatteryConsumers() { return null; }
    public com.android.internal.os.BatteryStatsHistoryIterator iterateBatteryStatsHistory() { return null; }
    public int describeContents() { return 0; }
    private BatteryUsageStats(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public byte[] getStatsProto() { return null; }
    private void writeStatsProto(android.util.proto.ProtoOutputStream p0, int p1) {}
    private void writeUidBatteryConsumersProto(android.util.proto.ProtoOutputStream p0, int p1) {}
    private double getUidBatteryConsumerWeight(android.os.UidBatteryConsumer p0) { return 0.0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    private void printPowerComponent(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, double p3, double p4, int p5, long p6) {}
    private void dumpSortedBatteryConsumers(java.io.PrintWriter p0, java.lang.String p1, java.util.List<? extends android.os.BatteryConsumer> p2) {}
    public void writeXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
    public static android.os.BatteryUsageStats createFromXml(android.util.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AggregateBatteryConsumerScope {
    }

    public static final class Builder {
        private final java.lang.String[] mCustomPowerComponentNames = null;
        private final boolean mIncludePowerModels = false;
        private long mStatsStartTimestampMs;
        private long mStatsEndTimestampMs;
        private long mStatsDurationMs;
        private double mBatteryCapacityMah;
        private int mDischargePercentage;
        private double mDischargedPowerLowerBoundMah;
        private double mDischargedPowerUpperBoundMah;
        private long mBatteryTimeRemainingMs;
        private long mChargeTimeRemainingMs;
        private final android.os.AggregateBatteryConsumer.Builder[] mAggregateBatteryConsumersBuilders = null;
        private final android.util.SparseArray<android.os.UidBatteryConsumer.Builder> mUidBatteryConsumerBuilders = null;
        private final android.util.SparseArray<android.os.UserBatteryConsumer.Builder> mUserBatteryConsumerBuilders = null;
        private android.os.Parcel mHistoryBuffer;
        private java.util.List<android.os.BatteryStats.HistoryTag> mHistoryTagPool;
        public Builder(java.lang.String[] p0) {}
        public Builder(java.lang.String[] p0, boolean p1) {}
        public android.os.BatteryUsageStats build() { return null; }
        public android.os.BatteryUsageStats.Builder setBatteryCapacity(double p0) { return null; }
        public android.os.BatteryUsageStats.Builder setStatsStartTimestamp(long p0) { return null; }
        public android.os.BatteryUsageStats.Builder setStatsEndTimestamp(long p0) { return null; }
        public android.os.BatteryUsageStats.Builder setStatsDuration(long p0) { return null; }
        private long getStatsDuration() { return 0L; }
        public android.os.BatteryUsageStats.Builder setDischargePercentage(int p0) { return null; }
        public android.os.BatteryUsageStats.Builder setDischargedPowerRange(double p0, double p1) { return null; }
        public android.os.BatteryUsageStats.Builder setBatteryTimeRemainingMs(long p0) { return null; }
        public android.os.BatteryUsageStats.Builder setChargeTimeRemainingMs(long p0) { return null; }
        public android.os.BatteryUsageStats.Builder setBatteryHistory(android.os.Parcel p0, java.util.List<android.os.BatteryStats.HistoryTag> p1) { return null; }
        public android.os.AggregateBatteryConsumer.Builder getAggregateBatteryConsumerBuilder(int p0) { return null; }
        public android.os.UidBatteryConsumer.Builder getOrCreateUidBatteryConsumerBuilder(android.os.BatteryStats.Uid p0) { return null; }
        public android.os.UidBatteryConsumer.Builder getOrCreateUidBatteryConsumerBuilder(int p0) { return null; }
        public android.os.UserBatteryConsumer.Builder getOrCreateUserBatteryConsumerBuilder(int p0) { return null; }
        public android.util.SparseArray<android.os.UidBatteryConsumer.Builder> getUidBatteryConsumerBuilders() { return null; }
        public android.os.BatteryUsageStats.Builder add(android.os.BatteryUsageStats p0) { return null; }
    }
}
