package android.os;

public final class AggregateBatteryConsumer extends android.os.BatteryConsumer implements android.os.Parcelable {
    private final double mConsumedPowerMah = 0.0;
    public static final android.os.Parcelable.Creator<android.os.AggregateBatteryConsumer> CREATOR = null;
    public AggregateBatteryConsumer(android.os.AggregateBatteryConsumer.Builder p0) { super(null); }
    private AggregateBatteryConsumer(android.os.Parcel p0) { super(null); }
    public void dump(java.io.PrintWriter p0, boolean p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public double getConsumedPower() { return 0.0; }
    void writeToXml(android.util.TypedXmlSerializer p0, int p1) throws java.io.IOException {}
    static void parseXml(android.util.TypedXmlPullParser p0, android.os.BatteryUsageStats.Builder p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}

    public static final class Builder extends android.os.BatteryConsumer.BaseBuilder<android.os.AggregateBatteryConsumer.Builder> {
        private double mConsumedPowerMah;
        public Builder(java.lang.String[] p0, boolean p1) { super(null, false); }
        public android.os.AggregateBatteryConsumer.Builder setConsumedPower(double p0) { return null; }
        public void add(android.os.AggregateBatteryConsumer p0) {}
        public android.os.AggregateBatteryConsumer build() { return null; }
    }
}
