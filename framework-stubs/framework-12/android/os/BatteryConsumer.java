package android.os;

public abstract class BatteryConsumer {
    public static final int POWER_COMPONENT_SCREEN = 0;
    public static final int POWER_COMPONENT_CPU = 1;
    public static final int POWER_COMPONENT_BLUETOOTH = 2;
    public static final int POWER_COMPONENT_CAMERA = 3;
    public static final int POWER_COMPONENT_AUDIO = 4;
    public static final int POWER_COMPONENT_VIDEO = 5;
    public static final int POWER_COMPONENT_FLASHLIGHT = 6;
    public static final int POWER_COMPONENT_SYSTEM_SERVICES = 7;
    public static final int POWER_COMPONENT_MOBILE_RADIO = 8;
    public static final int POWER_COMPONENT_SENSORS = 9;
    public static final int POWER_COMPONENT_GNSS = 10;
    public static final int POWER_COMPONENT_WIFI = 11;
    public static final int POWER_COMPONENT_WAKELOCK = 12;
    public static final int POWER_COMPONENT_MEMORY = 13;
    public static final int POWER_COMPONENT_PHONE = 14;
    public static final int POWER_COMPONENT_AMBIENT_DISPLAY = 15;
    public static final int POWER_COMPONENT_IDLE = 16;
    public static final int POWER_COMPONENT_REATTRIBUTED_TO_OTHER_CONSUMERS = 17;
    public static final int POWER_COMPONENT_COUNT = 18;
    public static final int FIRST_CUSTOM_POWER_COMPONENT_ID = 1000;
    public static final int LAST_CUSTOM_POWER_COMPONENT_ID = 9999;
    private static final java.lang.String[] sPowerComponentNames = null;
    public static final int POWER_MODEL_UNDEFINED = 0;
    public static final int POWER_MODEL_POWER_PROFILE = 1;
    public static final int POWER_MODEL_MEASURED_ENERGY = 2;
    protected final android.os.PowerComponents mPowerComponents = null;
    protected BatteryConsumer(android.os.PowerComponents p0) {}
    public double getConsumedPower() { return 0.0; }
    public double getConsumedPower(int p0) { return 0.0; }
    public int getPowerModel(int p0) { return 0; }
    public double getConsumedPowerForCustomComponent(int p0) { return 0.0; }
    public int getCustomPowerComponentCount() { return 0; }
    void setCustomPowerComponentNames(java.lang.String[] p0) {}
    public java.lang.String getCustomPowerComponentName(int p0) { return null; }
    public long getUsageDurationMillis(int p0) { return 0L; }
    public long getUsageDurationForCustomComponentMillis(int p0) { return 0L; }
    protected void writeToParcel(android.os.Parcel p0, int p1) {}
    public static java.lang.String powerComponentIdToString(int p0) { return null; }
    public static java.lang.String powerModelToString(int p0) { return null; }
    public void dump(java.io.PrintWriter p0) {}
    public abstract void dump(java.io.PrintWriter p0, boolean p1);
    boolean hasStatsProtoData() { return false; }
    void writeStatsProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    private boolean writeStatsProtoImpl(android.util.proto.ProtoOutputStream p0, long p1) { return false; }
    static long convertMahToDeciCoulombs(double p0) { return 0L; }

    protected static abstract class BaseBuilder<T extends android.os.BatteryConsumer.BaseBuilder<?>> {
        final android.os.PowerComponents.Builder mPowerComponentsBuilder = null;
        public BaseBuilder(java.lang.String[] p0, boolean p1) {}
        public T setConsumedPower(int p0, double p1) { return null; }
        public T setConsumedPower(int p0, double p1, int p2) { return null; }
        public T setConsumedPowerForCustomComponent(int p0, double p1) { return null; }
        public T setUsageDurationMillis(int p0, long p1) { return null; }
        public T setUsageDurationForCustomComponentMillis(int p0, long p1) { return null; }
        public double getTotalPower() { return 0.0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PowerComponent {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PowerModel {
    }
}
