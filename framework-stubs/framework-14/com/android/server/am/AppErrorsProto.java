package com.android.server.am;

public final class AppErrorsProto {
    public static final long NOW_UPTIME_MS = 1112396529665L;
    public static final long PROCESS_CRASH_TIMES = 2246267895810L;
    public static final long BAD_PROCESSES = 2246267895811L;
    public AppErrorsProto() {}

    public final class BadProcess {
        public static final long PROCESS_NAME = 1138166333441L;
        public static final long ENTRIES = 2246267895810L;
        public BadProcess(com.android.server.am.AppErrorsProto p0) {}

        public final class Entry {
            public static final long UID = 1120986464257L;
            public static final long CRASHED_AT_MS = 1112396529666L;
            public static final long SHORT_MSG = 1138166333443L;
            public static final long LONG_MSG = 1138166333444L;
            public static final long STACK = 1138166333445L;
            public Entry(com.android.server.am.AppErrorsProto.BadProcess p0) {}
        }
    }

    public final class ProcessCrashTime {
        public static final long PROCESS_NAME = 1138166333441L;
        public static final long ENTRIES = 2246267895810L;
        public ProcessCrashTime(com.android.server.am.AppErrorsProto p0) {}

        public final class Entry {
            public static final long UID = 1120986464257L;
            public static final long LAST_CRASHED_AT_MS = 1112396529666L;
            public Entry(com.android.server.am.AppErrorsProto.ProcessCrashTime p0) {}
        }
    }
}
