package android.service;

public final class SensorEventConnectionProto {
    public static final int OP_MODE_UNKNOWN = 0;
    public static final int OP_MODE_NORMAL = 1;
    public static final int OP_MODE_RESTRICTED = 2;
    public static final int OP_MODE_DATA_INJECTION = 3;
    public static final long OPERATING_MODE = 1159641169921L;
    public static final long PACKAGE_NAME = 1138166333442L;
    public static final long WAKE_LOCK_REF_COUNT = 1120986464259L;
    public static final long UID = 1120986464260L;
    public static final long CACHE_SIZE = 1120986464261L;
    public static final long MAX_CACHE_SIZE = 1120986464262L;
    public static final long FLUSH_INFOS = 2246267895815L;
    public static final long EVENTS_RECEIVED = 1120986464264L;
    public static final long EVENTS_SENT = 1120986464265L;
    public static final long EVENTS_CACHE = 1120986464266L;
    public static final long EVENTS_DROPPED = 1120986464267L;
    public static final long TOTAL_ACKS_NEEDED = 1120986464268L;
    public static final long TOTAL_ACKS_RECEIVED = 1120986464269L;
    public SensorEventConnectionProto() {}

    public final class FlushInfoProto {
        public static final long SENSOR_NAME = 1138166333441L;
        public static final long SENSOR_HANDLE = 1120986464258L;
        public static final long FIRST_FLUSH_PENDING = 1133871366147L;
        public static final long PENDING_FLUSH_EVENTS_TO_SEND = 1120986464260L;
        public FlushInfoProto(android.service.SensorEventConnectionProto p0) {}
    }
}
