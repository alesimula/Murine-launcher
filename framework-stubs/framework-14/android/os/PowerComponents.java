package android.os;

class PowerComponents {
    PowerComponents(android.os.PowerComponents.Builder p0) {}
    PowerComponents(android.os.BatteryConsumer.BatteryConsumerData p0) {}
    public double getConsumedPower(android.os.BatteryConsumer.Dimensions p0) { return 0.0; }
    public double getConsumedPower(android.os.BatteryConsumer.Key p0) { return 0.0; }
    public double getConsumedPowerForCustomComponent(int p0) { return 0.0; }
    public java.lang.String getCustomPowerComponentName(int p0) { return null; }
    int getPowerModel(android.os.BatteryConsumer.Key p0) { return 0; }
    public long getUsageDurationMillis(android.os.BatteryConsumer.Key p0) { return 0L; }
    public long getUsageDurationForCustomComponentMillis(int p0) { return 0L; }
    public void dump(java.io.PrintWriter p0, boolean p1) {}
    boolean hasStatsProtoData() { return false; }
    void writeStatsProto(android.util.proto.ProtoOutputStream p0) {}
    void writeToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    static void parseXml(com.android.modules.utils.TypedXmlPullParser p0, android.os.PowerComponents.Builder p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}

    static final class Builder {
        Builder(android.os.BatteryConsumer.BatteryConsumerData p0) {}
        public android.os.PowerComponents.Builder setConsumedPower(android.os.BatteryConsumer.Key p0, double p1, int p2) { return null; }
        public android.os.PowerComponents.Builder setConsumedPowerForCustomComponent(int p0, double p1) { return null; }
        public android.os.PowerComponents.Builder setUsageDurationMillis(android.os.BatteryConsumer.Key p0, long p1) { return null; }
        public android.os.PowerComponents.Builder setUsageDurationForCustomComponentMillis(int p0, long p1) { return null; }
        public void addPowerAndDuration(android.os.PowerComponents.Builder p0) {}
        public void addPowerAndDuration(android.os.PowerComponents p0) {}
        public double getTotalPower() { return 0.0; }
        public android.os.PowerComponents build() { return null; }
    }
}
