package com.android.server.am;

public final class ServiceRecordProto {
    public static final long SHORT_NAME = 1138166333441L;
    public static final long IS_RUNNING = 1133871366146L;
    public static final long PID = 1120986464259L;
    public static final long INTENT = 1146756268036L;
    public static final long PACKAGE_NAME = 1138166333445L;
    public static final long PROCESS_NAME = 1138166333446L;
    public static final long PERMISSION = 1138166333447L;
    public static final long APPINFO = 1146756268040L;
    public static final long APP = 1146756268041L;
    public static final long ISOLATED_PROC = 1146756268042L;
    public static final long WHITELIST_MANAGER = 1133871366155L;
    public static final long DELAYED = 1133871366156L;
    public static final long FOREGROUND = 1146756268045L;
    public static final long CREATE_REAL_TIME = 1146756268046L;
    public static final long STARTING_BG_TIMEOUT = 1146756268047L;
    public static final long LAST_ACTIVITY_TIME = 1146756268048L;
    public static final long RESTART_TIME = 1146756268049L;
    public static final long CREATED_FROM_FG = 1133871366162L;
    public static final long START = 1146756268051L;
    public static final long EXECUTE = 1146756268052L;
    public static final long DESTORY_TIME = 1146756268053L;
    public static final long CRASH = 1146756268054L;
    public static final long DELIVERED_STARTS = 2246267895831L;
    public static final long PENDING_STARTS = 2246267895832L;
    public static final long BINDINGS = 2246267895833L;
    public static final long CONNECTIONS = 2246267895834L;
    public static final long ALLOW_WHILE_IN_USE_PERMISSION_IN_FGS = 1133871366171L;
    public static final long SHORT_FGS_INFO = 1146756268060L;
    public ServiceRecordProto() {}

    public final class AppInfo {
        public static final long BASE_DIR = 1138166333441L;
        public static final long RES_DIR = 1138166333442L;
        public static final long DATA_DIR = 1138166333443L;
        public static final long TARGET_SDK_VERSION = 1120986464260L;
        public AppInfo(com.android.server.am.ServiceRecordProto p0) {}
    }

    public final class Crash {
        public static final long RESTART_COUNT = 1120986464257L;
        public static final long RESTART_DELAY = 1146756268034L;
        public static final long NEXT_RESTART_TIME = 1146756268035L;
        public static final long CRASH_COUNT = 1120986464260L;
        public Crash(com.android.server.am.ServiceRecordProto p0) {}
    }

    public final class ExecuteNesting {
        public static final long EXECUTE_NESTING = 1120986464257L;
        public static final long EXECUTE_FG = 1133871366146L;
        public static final long EXECUTING_START = 1146756268035L;
        public ExecuteNesting(com.android.server.am.ServiceRecordProto p0) {}
    }

    public final class Foreground {
        public static final long ID = 1120986464257L;
        public static final long NOTIFICATION = 1146756268034L;
        public static final long FOREGROUND_SERVICE_TYPE = 1120986464259L;
        public Foreground(com.android.server.am.ServiceRecordProto p0) {}
    }

    public final class ShortFgsInfo {
        public static final long START_TIME = 1112396529665L;
        public static final long START_FOREGROUND_COUNT = 1120986464258L;
        public static final long START_ID = 1120986464259L;
        public static final long TIMEOUT_TIME = 1112396529668L;
        public static final long PROC_STATE_DEMOTE_TIME = 1112396529669L;
        public static final long ANR_TIME = 1112396529670L;
        public ShortFgsInfo(com.android.server.am.ServiceRecordProto p0) {}
    }

    public final class Start {
        public static final long START_REQUESTED = 1133871366145L;
        public static final long DELAYED_STOP = 1133871366146L;
        public static final long STOP_IF_KILLED = 1133871366147L;
        public static final long CALL_START = 1133871366148L;
        public static final long LAST_START_ID = 1120986464261L;
        public static final long START_COMMAND_RESULT = 1120986464262L;
        public Start(com.android.server.am.ServiceRecordProto p0) {}
    }

    public final class StartItem {
        public static final long ID = 1120986464257L;
        public static final long DURATION = 1146756268034L;
        public static final long DELIVERY_COUNT = 1120986464259L;
        public static final long DONE_EXECUTING_COUNT = 1120986464260L;
        public static final long INTENT = 1146756268037L;
        public static final long NEEDED_GRANTS = 1146756268038L;
        public static final long URI_PERMISSIONS = 1146756268039L;
        public StartItem(com.android.server.am.ServiceRecordProto p0) {}
    }
}
