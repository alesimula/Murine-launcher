package com.android.server.content;

public final class SyncStatusProto {
    public static final long STATUS = 2246267895809L;
    public SyncStatusProto() {}

    public final class StatusInfo {
        public static final long AUTHORITY_ID = 1120986464258L;
        public static final long LAST_SUCCESS_TIME = 1112396529667L;
        public static final long LAST_SUCCESS_SOURCE = 1120986464260L;
        public static final long LAST_FAILURE_TIME = 1112396529669L;
        public static final long LAST_FAILURE_SOURCE = 1120986464262L;
        public static final long LAST_FAILURE_MESSAGE = 1138166333447L;
        public static final long INITIAL_FAILURE_TIME = 1112396529672L;
        public static final long PENDING = 1133871366153L;
        public static final long INITIALIZE = 1133871366154L;
        public static final long PERIODIC_SYNC_TIMES = 2211908157451L;
        public static final long LAST_EVENT_INFO = 2246267895820L;
        public static final long LAST_TODAY_RESET_TIME = 1112396529677L;
        public static final long TOTAL_STATS = 1146756268046L;
        public static final long TODAY_STATS = 1146756268047L;
        public static final long YESTERDAY_STATS = 1146756268048L;
        public static final long PER_SOURCE_LAST_SUCCESS_TIMES = 2211908157457L;
        public static final long PER_SOURCE_LAST_FAILURE_TIMES = 2211908157458L;
        public StatusInfo(com.android.server.content.SyncStatusProto p0) {}

        public final class LastEventInfo {
            public static final long LAST_EVENT_TIME = 1112396529665L;
            public static final long LAST_EVENT = 1138166333442L;
            public LastEventInfo(com.android.server.content.SyncStatusProto.StatusInfo p0) {}
        }

        public final class Stats {
            public static final long TOTAL_ELAPSED_TIME = 1112396529665L;
            public static final long NUM_SYNCS = 1120986464258L;
            public static final long NUM_FAILURES = 1120986464259L;
            public static final long NUM_CANCELS = 1120986464260L;
            public static final long NUM_SOURCE_OTHER = 1120986464261L;
            public static final long NUM_SOURCE_LOCAL = 1120986464262L;
            public static final long NUM_SOURCE_POLL = 1120986464263L;
            public static final long NUM_SOURCE_USER = 1120986464264L;
            public static final long NUM_SOURCE_PERIODIC = 1120986464265L;
            public static final long NUM_SOURCE_FEED = 1120986464266L;
            public Stats(com.android.server.content.SyncStatusProto.StatusInfo p0) {}
        }
    }
}
