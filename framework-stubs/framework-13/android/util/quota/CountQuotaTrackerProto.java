package android.util.quota;

public final class CountQuotaTrackerProto {
    public static final long BASE_QUOTA_DATA = 1146756268033L;
    public static final long COUNT_LIMIT = 2246267895810L;
    public static final long UPTC_STATS = 2246267895811L;
    public CountQuotaTrackerProto() {}

    public final class CountLimit {
        public static final long CATEGORY = 1146756268033L;
        public static final long LIMIT = 1120986464258L;
        public static final long WINDOW_SIZE_MS = 1112396529667L;
        public CountLimit(android.util.quota.CountQuotaTrackerProto p0) {}
    }

    public final class Event {
        public static final long TIMESTAMP_ELAPSED = 1112396529665L;
        public Event(android.util.quota.CountQuotaTrackerProto p0) {}
    }

    public final class ExecutionStats {
        public static final long EXPIRATION_TIME_ELAPSED = 1112396529665L;
        public static final long WINDOW_SIZE_MS = 1112396529666L;
        public static final long COUNT_LIMIT = 1120986464259L;
        public static final long COUNT_IN_WINDOW = 1120986464260L;
        public static final long IN_QUOTA_TIME_ELAPSED = 1112396529669L;
        public ExecutionStats(android.util.quota.CountQuotaTrackerProto p0) {}
    }

    public final class UptcStats {
        public static final long UPTC = 1146756268033L;
        public static final long IS_QUOTA_FREE = 1133871366146L;
        public static final long EVENTS = 2246267895811L;
        public static final long EXECUTION_STATS = 2246267895812L;
        public UptcStats(android.util.quota.CountQuotaTrackerProto p0) {}
    }
}
