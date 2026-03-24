package android.os;

public final class BatteryUsageStatsAtomsProto {
    public static final long SESSION_START_MILLIS = 1112396529665L;
    public static final long SESSION_END_MILLIS = 1112396529666L;
    public static final long SESSION_DURATION_MILLIS = 1112396529667L;
    public static final long DEVICE_BATTERY_CONSUMER = 1146756268036L;
    public static final long UID_BATTERY_CONSUMERS = 2246267895813L;
    public static final long SESSION_DISCHARGE_PERCENTAGE = 1120986464262L;
    public static final long DISCHARGE_DURATION_MILLIS = 1112396529671L;
    public BatteryUsageStatsAtomsProto() {}

    public final class BatteryConsumerData {
        public static final long TOTAL_CONSUMED_POWER_DECI_COULOMBS = 1112396529665L;
        public static final long POWER_COMPONENTS = 2246267895810L;
        public static final long SLICES = 2246267895811L;
        public BatteryConsumerData(android.os.BatteryUsageStatsAtomsProto p0) {}

        public final class PowerComponentUsage {
            public static final long COMPONENT = 1120986464257L;
            public static final long POWER_DECI_COULOMBS = 1112396529666L;
            public static final long DURATION_MILLIS = 1112396529667L;
            public PowerComponentUsage(android.os.BatteryUsageStatsAtomsProto.BatteryConsumerData p0) {}
        }

        public final class PowerComponentUsageSlice {
            public static final int UNSPECIFIED = 0;
            public static final int FOREGROUND = 1;
            public static final int BACKGROUND = 2;
            public static final int FOREGROUND_SERVICE = 3;
            public static final int CACHED = 4;
            public static final long POWER_COMPONENT = 1146756268033L;
            public static final long PROCESS_STATE = 1159641169922L;
            public PowerComponentUsageSlice(android.os.BatteryUsageStatsAtomsProto.BatteryConsumerData p0) {}
        }
    }

    public final class UidBatteryConsumer {
        public static final long UID = 1120986464257L;
        public static final long BATTERY_CONSUMER_DATA = 1146756268034L;
        public static final long TIME_IN_FOREGROUND_MILLIS = 1112396529667L;
        public static final long TIME_IN_BACKGROUND_MILLIS = 1112396529668L;
        public UidBatteryConsumer(android.os.BatteryUsageStatsAtomsProto p0) {}
    }
}
