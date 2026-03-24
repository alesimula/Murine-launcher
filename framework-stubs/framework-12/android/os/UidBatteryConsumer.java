package android.os;

public final class UidBatteryConsumer extends android.os.BatteryConsumer implements android.os.Parcelable {
    public static final int STATE_FOREGROUND = 0;
    public static final int STATE_BACKGROUND = 1;
    private final int mUid = 0;
    private final java.lang.String mPackageWithHighestDrain = null;
    private final long mTimeInForegroundMs = 0L;
    private final long mTimeInBackgroundMs = 0L;
    public static final android.os.Parcelable.Creator<android.os.UidBatteryConsumer> CREATOR = null;
    public int getUid() { return 0; }
    public java.lang.String getPackageWithHighestDrain() { return null; }
    public long getTimeInStateMs(int p0) { return 0L; }
    private UidBatteryConsumer(android.os.UidBatteryConsumer.Builder p0) { super(null); }
    private UidBatteryConsumer(android.os.Parcel p0) { super(null); }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dump(java.io.PrintWriter p0, boolean p1) {}
    public int describeContents() { return 0; }
    void writeToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
    static void createFromXml(android.util.TypedXmlPullParser p0, android.os.BatteryUsageStats.Builder p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}

    public static final class Builder extends android.os.BatteryConsumer.BaseBuilder<android.os.UidBatteryConsumer.Builder> {
        private static final java.lang.String PACKAGE_NAME_UNINITIALIZED = "";
        private final android.os.BatteryStats.Uid mBatteryStatsUid = null;
        private final int mUid = 0;
        private java.lang.String mPackageWithHighestDrain;
        public long mTimeInForegroundMs;
        public long mTimeInBackgroundMs;
        private boolean mExcludeFromBatteryUsageStats;
        public Builder(java.lang.String[] p0, boolean p1, android.os.BatteryStats.Uid p2) { super(null, false); }
        public Builder(java.lang.String[] p0, boolean p1, int p2) { super(null, false); }
        public android.os.BatteryStats.Uid getBatteryStatsUid() { return null; }
        public int getUid() { return 0; }
        public android.os.UidBatteryConsumer.Builder setPackageWithHighestDrain(java.lang.String p0) { return null; }
        public android.os.UidBatteryConsumer.Builder setTimeInStateMs(int p0, long p1) { return null; }
        public android.os.UidBatteryConsumer.Builder excludeFromBatteryUsageStats() { return null; }
        public android.os.UidBatteryConsumer.Builder add(android.os.UidBatteryConsumer p0) { return null; }
        public boolean isExcludedFromBatteryUsageStats() { return false; }
        public android.os.UidBatteryConsumer build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
