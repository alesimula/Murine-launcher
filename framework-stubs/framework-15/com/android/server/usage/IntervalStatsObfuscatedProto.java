package com.android.server.usage;

public final class IntervalStatsObfuscatedProto {
    public static final long END_TIME_MS = 1112396529665L;
    public static final long MAJOR_VERSION = 1120986464258L;
    public static final long MINOR_VERSION = 1120986464259L;
    public static final long INTERACTIVE = 1146756268042L;
    public static final long NON_INTERACTIVE = 1146756268043L;
    public static final long KEYGUARD_SHOWN = 1146756268044L;
    public static final long KEYGUARD_HIDDEN = 1146756268045L;
    public static final long PACKAGES = 2246267895828L;
    public static final long CONFIGURATIONS = 2246267895829L;
    public static final long EVENT_LOG = 2246267895830L;
    public static final long PENDING_EVENTS = 2246267895831L;
    public static final long PACKAGE_USAGE = 2246267895832L;
    public IntervalStatsObfuscatedProto() {}

    public final class Configuration {
        public static final long CONFIG = 1146756268033L;
        public static final long LAST_TIME_ACTIVE_MS = 1112396529666L;
        public static final long TOTAL_TIME_ACTIVE_MS = 1112396529667L;
        public static final long COUNT = 1120986464260L;
        public static final long ACTIVE = 1133871366149L;
        public Configuration(com.android.server.usage.IntervalStatsObfuscatedProto p0) {}
    }

    public final class CountAndTime {
        public static final long COUNT = 1120986464257L;
        public static final long TIME_MS = 1112396529666L;
        public CountAndTime(com.android.server.usage.IntervalStatsObfuscatedProto p0) {}
    }

    public final class PackageUsage {
        public static final long PACKAGE_NAME = 1138166333441L;
        public static final long TIME_MS = 1112396529666L;
        public PackageUsage(com.android.server.usage.IntervalStatsObfuscatedProto p0) {}
    }
}
