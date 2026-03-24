package android.os;

public final class AppBatteryStatsProto {
    public static final long UID_STATS = 2246267895809L;
    public AppBatteryStatsProto() {}

    public final class UidStats {
        public static final long UID = 1120986464257L;
        public static final long PROCESS_STATE_STATS = 2246267895810L;
        public UidStats(android.os.AppBatteryStatsProto p0) {}

        public final class ProcessStateStats {
            public static final int UNSPECIFIED = 0;
            public static final int FOREGROUND = 1;
            public static final int BACKGROUND = 2;
            public static final int FOREGROUND_SERVICE = 3;
            public static final int CACHED = 4;
            public static final long PROCESS_STATE = 1159641169921L;
            public static final long DURATION_MS = 1112396529666L;
            public static final long POWER_MAH = 1103806595075L;
            public ProcessStateStats(android.os.AppBatteryStatsProto.UidStats p0) {}
        }
    }
}
