package android.os;

public class UserBatteryConsumer extends android.os.BatteryConsumer implements android.os.Parcelable {
    private final int mUserId = 0;
    public static final android.os.Parcelable.Creator<android.os.UserBatteryConsumer> CREATOR = null;
    public int getUserId() { return 0; }
    private UserBatteryConsumer(android.os.UserBatteryConsumer.Builder p0) { super(null); }
    private UserBatteryConsumer(android.os.Parcel p0) { super(null); }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dump(java.io.PrintWriter p0, boolean p1) {}
    public int describeContents() { return 0; }
    void writeToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
    static void createFromXml(android.util.TypedXmlPullParser p0, android.os.BatteryUsageStats.Builder p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}

    public static final class Builder extends android.os.BatteryConsumer.BaseBuilder<android.os.UserBatteryConsumer.Builder> {
        private final int mUserId = 0;
        private java.util.List<android.os.UidBatteryConsumer.Builder> mUidBatteryConsumers;
        Builder(java.lang.String[] p0, boolean p1, int p2) { super(null, false); }
        public void addUidBatteryConsumer(android.os.UidBatteryConsumer.Builder p0) {}
        public android.os.UserBatteryConsumer build() { return null; }
    }
}
