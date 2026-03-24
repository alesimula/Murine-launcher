package android.os;

public abstract class BatteryConsumer {
    public static final int POWER_COMPONENT_ANY = -1;
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
    public static final int POWER_MODEL_UNDEFINED = 0;
    public static final int POWER_MODEL_POWER_PROFILE = 1;
    public static final int POWER_MODEL_MEASURED_ENERGY = 2;
    public static final int PROCESS_STATE_UNSPECIFIED = 0;
    public static final int PROCESS_STATE_ANY = 0;
    public static final int PROCESS_STATE_FOREGROUND = 1;
    public static final int PROCESS_STATE_BACKGROUND = 2;
    public static final int PROCESS_STATE_FOREGROUND_SERVICE = 3;
    public static final int PROCESS_STATE_CACHED = 4;
    public static final int PROCESS_STATE_COUNT = 5;
    static final int COLUMN_INDEX_BATTERY_CONSUMER_TYPE = 0;
    static final int COLUMN_COUNT = 1;
    public static final android.os.BatteryConsumer.Dimensions UNSPECIFIED_DIMENSIONS = null;
    protected final android.os.BatteryConsumer.BatteryConsumerData mData = null;
    protected final android.os.PowerComponents mPowerComponents = null;
    protected BatteryConsumer(android.os.BatteryConsumer.BatteryConsumerData p0, android.os.PowerComponents p1) {}
    public BatteryConsumer(android.os.BatteryConsumer.BatteryConsumerData p0) {}
    public double getConsumedPower() { return 0.0; }
    public double getConsumedPower(android.os.BatteryConsumer.Dimensions p0) { return 0.0; }
    public android.os.BatteryConsumer.Key[] getKeys(int p0) { return null; }
    public android.os.BatteryConsumer.Key getKey(int p0) { return null; }
    public android.os.BatteryConsumer.Key getKey(int p0, int p1) { return null; }
    public double getConsumedPower(int p0) { return 0.0; }
    public double getConsumedPower(android.os.BatteryConsumer.Key p0) { return 0.0; }
    public int getPowerModel(int p0) { return 0; }
    public int getPowerModel(android.os.BatteryConsumer.Key p0) { return 0; }
    public double getConsumedPowerForCustomComponent(int p0) { return 0.0; }
    public int getCustomPowerComponentCount() { return 0; }
    public java.lang.String getCustomPowerComponentName(int p0) { return null; }
    public long getUsageDurationMillis(int p0) { return 0L; }
    public long getUsageDurationMillis(android.os.BatteryConsumer.Key p0) { return 0L; }
    public long getUsageDurationForCustomComponentMillis(int p0) { return 0L; }
    public static java.lang.String powerComponentIdToString(int p0) { return null; }
    public static java.lang.String powerModelToString(int p0) { return null; }
    public static java.lang.String processStateToString(int p0) { return null; }
    public void dump(java.io.PrintWriter p0) {}
    public abstract void dump(java.io.PrintWriter p0, boolean p1);
    boolean hasStatsProtoData() { return false; }
    void writeStatsProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    static long convertMahToDeciCoulombs(double p0) { return 0L; }
    static android.os.BatteryConsumer.BatteryConsumerDataLayout createBatteryConsumerDataLayout(java.lang.String[] p0, boolean p1, boolean p2) { return null; }

    protected static abstract class BaseBuilder<T extends android.os.BatteryConsumer.BaseBuilder<?>> {
        protected final android.os.BatteryConsumer.BatteryConsumerData mData = null;
        protected final android.os.PowerComponents.Builder mPowerComponentsBuilder = null;
        public BaseBuilder(android.os.BatteryConsumer.BatteryConsumerData p0, int p1) {}
        public android.os.BatteryConsumer.Key[] getKeys(int p0) { return null; }
        public android.os.BatteryConsumer.Key getKey(int p0, int p1) { return null; }
        public T setConsumedPower(int p0, double p1) { return null; }
        public T setConsumedPower(int p0, double p1, int p2) { return null; }
        public T setConsumedPower(android.os.BatteryConsumer.Key p0, double p1, int p2) { return null; }
        public T setConsumedPowerForCustomComponent(int p0, double p1) { return null; }
        public T setUsageDurationMillis(int p0, long p1) { return null; }
        public T setUsageDurationMillis(android.os.BatteryConsumer.Key p0, long p1) { return null; }
        public T setUsageDurationForCustomComponentMillis(int p0, long p1) { return null; }
        public double getTotalPower() { return 0.0; }
    }

    static class BatteryConsumerData {
        public final android.os.BatteryConsumer.BatteryConsumerDataLayout layout = null;
        BatteryConsumerData(android.database.CursorWindow p0, int p1, android.os.BatteryConsumer.BatteryConsumerDataLayout p2) {}
        static android.os.BatteryConsumer.BatteryConsumerData create(android.database.CursorWindow p0, android.os.BatteryConsumer.BatteryConsumerDataLayout p1) { return null; }
        public android.os.BatteryConsumer.Key[] getKeys(int p0) { return null; }
        android.os.BatteryConsumer.Key getKeyOrThrow(int p0, int p1) { return null; }
        android.os.BatteryConsumer.Key getKey(int p0, int p1) { return null; }
        void putInt(int p0, int p1) {}
        int getInt(int p0) { return 0; }
        void putDouble(int p0, double p1) {}
        double getDouble(int p0) { return 0.0; }
        void putLong(int p0, long p1) {}
        long getLong(int p0) { return 0L; }
        void putString(int p0, java.lang.String p1) {}
        java.lang.String getString(int p0) { return null; }
    }

    static class BatteryConsumerDataLayout {
        public final java.lang.String[] customPowerComponentNames = null;
        public final int customPowerComponentCount = 0;
        public final boolean powerModelsIncluded = false;
        public final boolean processStateDataIncluded = false;
        public final android.os.BatteryConsumer.Key[][] keys = null;
        public final int totalConsumedPowerColumnIndex = 0;
        public final int firstCustomConsumedPowerColumn = 0;
        public final int firstCustomUsageDurationColumn = 0;
        public final int columnCount = 0;
        public final android.os.BatteryConsumer.Key[][] processStateKeys = null;
    }

    public static final class Dimensions {
        public final int powerComponent = 0;
        public final int processState = 0;
        public Dimensions(int p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public static final class Key {
        public final int powerComponent = 0;
        public final int processState = 0;
        final int mPowerModelColumnIndex = 0;
        final int mPowerColumnIndex = 0;
        final int mDurationColumnIndex = 0;
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toShortString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PowerComponent {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PowerModel {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProcessState {
    }
}
