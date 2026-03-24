package android.os;

public class UserBatteryConsumer extends android.os.BatteryConsumer {
    static final int CONSUMER_TYPE_USER = 2;
    static final int COLUMN_COUNT = 2;
    UserBatteryConsumer(android.os.BatteryConsumer.BatteryConsumerData p0) { super((android.os.BatteryConsumer.BatteryConsumerData)null); }
    public int getUserId() { return 0; }
    public void dump(java.io.PrintWriter p0, boolean p1) {}
    void writeToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    static void createFromXml(com.android.modules.utils.TypedXmlPullParser p0, android.os.BatteryUsageStats.Builder p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}

    public static final class Builder extends android.os.BatteryConsumer.BaseBuilder<android.os.UserBatteryConsumer.Builder> {
        Builder(android.os.BatteryConsumer.BatteryConsumerData p0, int p1) { super(null, 0); }
        public void addUidBatteryConsumer(android.os.UidBatteryConsumer.Builder p0) {}
        public android.os.UserBatteryConsumer build() { return null; }
    }
}
