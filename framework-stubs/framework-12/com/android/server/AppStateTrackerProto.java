package com.android.server;

public final class AppStateTrackerProto {
    public static final long FORCED_APP_STANDBY_FEATURE_ENABLED = 1133871366157L;
    public static final long FORCE_ALL_APPS_STANDBY = 1133871366145L;
    public static final long ACTIVE_UIDS = 2220498092034L;
    public static final long FOREGROUND_UIDS = 2220498092043L;
    public static final long POWER_SAVE_EXEMPT_APP_IDS = 2220498092035L;
    public static final long POWER_SAVE_USER_EXEMPT_APP_IDS = 2220498092044L;
    public static final long TEMP_POWER_SAVE_EXEMPT_APP_IDS = 2220498092036L;
    public static final long RUN_ANY_IN_BACKGROUND_RESTRICTED_PACKAGES = 2246267895813L;
    public static final long IS_SMALL_BATTERY_DEVICE = 1133871366150L;
    public static final long FORCE_ALL_APPS_STANDBY_FOR_SMALL_BATTERY = 1133871366151L;
    public static final long IS_PLUGGED_IN = 1133871366152L;
    public static final long STATS = 1146756268041L;
    public static final long EXEMPTED_BUCKET_PACKAGES = 2246267895818L;
    public AppStateTrackerProto() {}

    public final class ExemptedPackage {
        public static final long USER_ID = 1120986464257L;
        public static final long PACKAGE_NAME = 1138166333442L;
        public ExemptedPackage(com.android.server.AppStateTrackerProto p0) {}
    }

    public final class RunAnyInBackgroundRestrictedPackages {
        public static final long UID = 1120986464257L;
        public static final long PACKAGE_NAME = 1138166333442L;
        public RunAnyInBackgroundRestrictedPackages(com.android.server.AppStateTrackerProto p0) {}
    }
}
