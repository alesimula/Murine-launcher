package android.os;

class PowerComponents {
    PowerComponents(android.os.PowerComponents.Builder p0) {}
    PowerComponents(android.os.BatteryConsumer.BatteryConsumerData p0) {}
    public double getConsumedPower(android.os.BatteryConsumer.Dimensions p0) { return 0.0; }
    public double getConsumedPower(int p0, int p1, int p2, int p3) { return 0.0; }
    public long getUsageDurationMillis(android.os.BatteryConsumer.Dimensions p0) { return 0L; }
    public long getUsageDurationMillis(int p0, int p1, int p2, int p3) { return 0L; }
    public double getConsumedPower(android.os.BatteryConsumer.Key p0) { return 0.0; }
    public java.lang.String getCustomPowerComponentName(int p0) { return null; }
    public long getUsageDurationMillis(android.os.BatteryConsumer.Key p0) { return 0L; }
    void dump(java.io.PrintWriter p0, int p1, int p2, boolean p3) {}
    boolean hasStatsProtoData() { return false; }
    void writeStatsProto(android.util.proto.ProtoOutputStream p0) {}
    void writeToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    static void parseXml(com.android.modules.utils.TypedXmlPullParser p0, android.os.PowerComponents.Builder p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}

    static final class Builder {
        Builder(android.os.BatteryConsumer.BatteryConsumerData p0, double p1) {}
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.os.PowerComponents.Builder setConsumedPower(android.os.BatteryConsumer.Key p0, double p1) { return null; }
        @android.annotation.NonNull
        public android.os.PowerComponents.Builder addConsumedPower(android.os.BatteryConsumer.Key p0, double p1) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.os.PowerComponents.Builder setUsageDurationMillis(android.os.BatteryConsumer.Key p0, long p1) { return null; }
        @android.annotation.NonNull
        public android.os.PowerComponents.Builder addUsageDurationMillis(android.os.BatteryConsumer.Key p0, long p1) { return null; }
        public void addPowerAndDuration(android.os.PowerComponents.Builder p0) {}
        public void addPowerAndDuration(android.os.PowerComponents p0) {}
        public double getTotalPower() { return 0.0; }
        @android.annotation.NonNull
        public android.os.PowerComponents build() { return null; }
    }
}
