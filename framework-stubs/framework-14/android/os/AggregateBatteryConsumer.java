package android.os;

public final class AggregateBatteryConsumer extends android.os.BatteryConsumer {
    static final int CONSUMER_TYPE_AGGREGATE = 0;
    static final int COLUMN_INDEX_SCOPE = 1;
    static final int COLUMN_INDEX_CONSUMED_POWER = 2;
    static final int COLUMN_COUNT = 3;
    AggregateBatteryConsumer(android.os.BatteryConsumer.BatteryConsumerData p0) { super((android.os.BatteryConsumer.BatteryConsumerData)null); }
    int getScope() { return 0; }
    public void dump(java.io.PrintWriter p0, boolean p1) {}
    public double getConsumedPower() { return 0.0; }
    void writeToXml(com.android.modules.utils.TypedXmlSerializer p0, int p1) throws java.io.IOException {}
    static void parseXml(com.android.modules.utils.TypedXmlPullParser p0, android.os.BatteryUsageStats.Builder p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    void writePowerComponentModelProto(android.util.proto.ProtoOutputStream p0) {}

    public static final class Builder extends android.os.BatteryConsumer.BaseBuilder<android.os.AggregateBatteryConsumer.Builder> {
        public Builder(android.os.BatteryConsumer.BatteryConsumerData p0, int p1) { super(null, 0); }
        public android.os.AggregateBatteryConsumer.Builder setConsumedPower(double p0) { return null; }
        public void add(android.os.AggregateBatteryConsumer p0) {}
        public android.os.AggregateBatteryConsumer build() { return null; }
    }
}
