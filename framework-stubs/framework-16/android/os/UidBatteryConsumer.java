package android.os;

public final class UidBatteryConsumer extends android.os.BatteryConsumer {
    static final int CONSUMER_TYPE_UID = 1;
    public static final int STATE_FOREGROUND = 0;
    public static final int STATE_BACKGROUND = 1;
    static final int COLUMN_INDEX_UID = 1;
    static final int COLUMN_INDEX_PACKAGE_WITH_HIGHEST_DRAIN = 2;
    static final int COLUMN_COUNT = 3;
    UidBatteryConsumer(android.os.BatteryConsumer.BatteryConsumerData p0) { super((android.os.BatteryConsumer.BatteryConsumerData)null); }
    public int getUid() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getPackageWithHighestDrain() { return null; }
    @java.lang.Deprecated
    public long getTimeInStateMs(int p0) { return 0L; }
    public long getTimeInProcessStateMs(int p0) { return 0L; }
    public void dump(java.io.PrintWriter p0, boolean p1) {}
    void writeToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    static void createFromXml(com.android.modules.utils.TypedXmlPullParser p0, android.os.BatteryUsageStats.Builder p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}

    public static final class Builder extends android.os.BatteryConsumer.BaseBuilder<android.os.UidBatteryConsumer.Builder> {
        public Builder(android.os.BatteryConsumer.BatteryConsumerData p0, android.os.BatteryStats.Uid p1, double p2) { super(null, 0, 0.0); }
        public Builder(android.os.BatteryConsumer.BatteryConsumerData p0, int p1, double p2) { super(null, 0, 0.0); }
        @android.annotation.NonNull
        public android.os.BatteryStats.Uid getBatteryStatsUid() { return null; }
        public int getUid() { return 0; }
        public boolean isVirtualUid() { return false; }
        @android.annotation.NonNull
        public android.os.UidBatteryConsumer.Builder setPackageWithHighestDrain(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.os.UidBatteryConsumer.Builder setTimeInStateMs(int p0, long p1) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.os.UidBatteryConsumer.Builder setTimeInProcessStateMs(int p0, long p1) { return null; }
        public android.os.UidBatteryConsumer.Builder excludeFromBatteryUsageStats() { return null; }
        public android.os.UidBatteryConsumer.Builder add(android.os.UidBatteryConsumer p0) { return null; }
        public boolean isExcludedFromBatteryUsageStats() { return false; }
        @android.annotation.NonNull
        public android.os.UidBatteryConsumer build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
