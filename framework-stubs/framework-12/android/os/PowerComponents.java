package android.os;

class PowerComponents {
    private static final int CUSTOM_POWER_COMPONENT_OFFSET = -982;
    private final double mConsumedPowerMah = 0.0;
    private final double[] mPowerComponentsMah = null;
    private final long[] mUsageDurationsMs = null;
    private final int mCustomPowerComponentCount = 0;
    private final byte[] mPowerModels = null;
    private java.lang.String[] mCustomPowerComponentNames;
    PowerComponents(android.os.PowerComponents.Builder p0) {}
    PowerComponents(android.os.Parcel p0) {}
    void writeToParcel(android.os.Parcel p0, int p1) {}
    public double getConsumedPower() { return 0.0; }
    public double getConsumedPower(int p0) { return 0.0; }
    public double getConsumedPowerForCustomComponent(int p0) { return 0.0; }
    void setCustomPowerComponentNames(java.lang.String[] p0) {}
    public java.lang.String getCustomPowerComponentName(int p0) { return null; }
    public boolean hasPowerModels() { return false; }
    int getPowerModel(int p0) { return 0; }
    public long getUsageDurationMillis(int p0) { return 0L; }
    public long getUsageDurationForCustomComponentMillis(int p0) { return 0L; }
    public int getCustomPowerComponentCount() { return 0; }
    public long getMaxComponentUsageDurationMillis() { return 0L; }
    public void dump(java.io.PrintWriter p0, boolean p1) {}
    boolean hasStatsProtoData() { return false; }
    void writeStatsProto(android.util.proto.ProtoOutputStream p0) {}
    private boolean writeStatsProtoImpl(android.util.proto.ProtoOutputStream p0) { return false; }
    void writeToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
    static void parseXml(android.util.TypedXmlPullParser p0, android.os.PowerComponents.Builder p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}

    static final class Builder {
        private static final byte POWER_MODEL_UNINITIALIZED = -1;
        private final double[] mPowerComponentsMah = null;
        private final java.lang.String[] mCustomPowerComponentNames = null;
        private final long[] mUsageDurationsMs = null;
        private final byte[] mPowerModels = null;
        Builder(java.lang.String[] p0, boolean p1) {}
        public android.os.PowerComponents.Builder setConsumedPower(int p0, double p1, int p2) { return null; }
        public android.os.PowerComponents.Builder setConsumedPowerForCustomComponent(int p0, double p1) { return null; }
        public android.os.PowerComponents.Builder setUsageDurationMillis(int p0, long p1) { return null; }
        public android.os.PowerComponents.Builder setUsageDurationForCustomComponentMillis(int p0, long p1) { return null; }
        public void addPowerAndDuration(android.os.PowerComponents.Builder p0) {}
        public void addPowerAndDuration(android.os.PowerComponents p0) {}
        private void addPowerAndDuration(double[] p0, long[] p1, byte[] p2) {}
        public double getTotalPower() { return 0.0; }
        private byte[] getPowerModels() { return null; }
        public android.os.PowerComponents build() { return null; }
    }
}
