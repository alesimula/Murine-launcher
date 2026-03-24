package android.service;

public final class SensorListProto {
    public static final int RM_UNKNOWN = 0;
    public static final int RM_CONTINUOUS = 1;
    public static final int RM_ON_CHANGE = 2;
    public static final int RM_ONE_SHOT = 3;
    public static final int RM_SPECIAL_TRIGGER = 4;
    public static final long SENSORS = 2246267895809L;
    public SensorListProto() {}

    public final class SensorProto {
        public static final long HANDLE = 1120986464257L;
        public static final long NAME = 1138166333442L;
        public static final long VENDOR = 1138166333443L;
        public static final long VERSION = 1120986464260L;
        public static final long STRING_TYPE = 1138166333445L;
        public static final long TYPE = 1120986464262L;
        public static final long REQUIRED_PERMISSION = 1138166333447L;
        public static final long FLAGS = 1120986464264L;
        public static final long REPORTING_MODE = 1159641169929L;
        public static final long MAX_DELAY_US = 1120986464266L;
        public static final long MIN_DELAY_US = 1120986464267L;
        public static final long FIFO_MAX_EVENT_COUNT = 1120986464268L;
        public static final long FIFO_RESERVED_EVENT_COUNT = 1120986464269L;
        public static final long IS_WAKEUP = 1133871366158L;
        public static final long DATA_INJECTION_SUPPORTED = 1133871366159L;
        public static final long IS_DYNAMIC = 1133871366160L;
        public static final long HAS_ADDITIONAL_INFO = 1133871366161L;
        public static final long HIGHEST_RATE_LEVEL = 1120986464274L;
        public static final long ASHMEM = 1133871366163L;
        public static final long GRALLOC = 1133871366164L;
        public static final long MIN_VALUE = 1108101562389L;
        public static final long MAX_VALUE = 1108101562390L;
        public static final long RESOLUTION = 1108101562391L;
        public static final long POWER_USAGE = 1108101562392L;
        public SensorProto(android.service.SensorListProto p0) {}
    }
}
