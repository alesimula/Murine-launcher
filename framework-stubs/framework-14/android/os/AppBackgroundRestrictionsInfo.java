package android.os;

public final class AppBackgroundRestrictionsInfo {
    public static final int LEVEL_UNKNOWN = 0;
    public static final int LEVEL_UNRESTRICTED = 1;
    public static final int LEVEL_EXEMPTED = 2;
    public static final int LEVEL_ADAPTIVE_BUCKET = 3;
    public static final int LEVEL_RESTRICTED_BUCKET = 4;
    public static final int LEVEL_BACKGROUND_RESTRICTED = 5;
    public static final int LEVEL_HIBERNATION = 6;
    public static final int THRESHOLD_UNKNOWN = 0;
    public static final int THRESHOLD_RESTRICTED = 1;
    public static final int THRESHOLD_USER = 2;
    public static final int UNKNOWN_TRACKER = 0;
    public static final int BATTERY_TRACKER = 1;
    public static final int BATTERY_EXEMPTION_TRACKER = 2;
    public static final int FGS_TRACKER = 3;
    public static final int MEDIA_SESSION_TRACKER = 4;
    public static final int PERMISSION_TRACKER = 5;
    public static final int BROADCAST_EVENTS_TRACKER = 6;
    public static final int BIND_SERVICE_EVENTS_TRACKER = 7;
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_DENIED = 1;
    public static final int REASON_OTHER = 2;
    public static final int REASON_PROC_STATE_PERSISTENT = 10;
    public static final int REASON_PROC_STATE_PERSISTENT_UI = 11;
    public static final int REASON_PROC_STATE_TOP = 12;
    public static final int REASON_PROC_STATE_BTOP = 13;
    public static final int REASON_PROC_STATE_FGS = 14;
    public static final int REASON_PROC_STATE_BFGS = 15;
    public static final int REASON_UID_VISIBLE = 50;
    public static final int REASON_SYSTEM_UID = 51;
    public static final int REASON_ACTIVITY_STARTER = 52;
    public static final int REASON_START_ACTIVITY_FLAG = 53;
    public static final int REASON_FGS_BINDING = 54;
    public static final int REASON_DEVICE_OWNER = 55;
    public static final int REASON_PROFILE_OWNER = 56;
    public static final int REASON_COMPANION_DEVICE_MANAGER = 57;
    public static final int REASON_BACKGROUND_ACTIVITY_PERMISSION = 58;
    public static final int REASON_BACKGROUND_FGS_PERMISSION = 59;
    public static final int REASON_INSTR_BACKGROUND_ACTIVITY_PERMISSION = 60;
    public static final int REASON_INSTR_BACKGROUND_FGS_PERMISSION = 61;
    public static final int REASON_SYSTEM_ALERT_WINDOW_PERMISSION = 62;
    public static final int REASON_DEVICE_DEMO_MODE = 63;
    public static final int REASON_ALLOWLISTED_PACKAGE = 65;
    public static final int REASON_APPOP = 66;
    public static final int REASON_ACTIVITY_VISIBILITY_GRACE_PERIOD = 67;
    public static final int REASON_OP_ACTIVATE_VPN = 68;
    public static final int REASON_OP_ACTIVATE_PLATFORM_VPN = 69;
    public static final int REASON_TEMP_ALLOWED_WHILE_IN_USE = 70;
    public static final int REASON_CURRENT_INPUT_METHOD = 71;
    public static final int REASON_GEOFENCING = 100;
    public static final int REASON_PUSH_MESSAGING = 101;
    public static final int REASON_PUSH_MESSAGING_OVER_QUOTA = 102;
    public static final int REASON_ACTIVITY_RECOGNITION = 103;
    public static final int REASON_ACCOUNT_TRANSFER = 104;
    public static final int REASON_BOOT_COMPLETED = 200;
    public static final int REASON_PRE_BOOT_COMPLETED = 201;
    public static final int REASON_LOCKED_BOOT_COMPLETED = 202;
    public static final int REASON_BLUETOOTH_BROADCAST = 203;
    public static final int REASON_TIMEZONE_CHANGED = 204;
    public static final int REASON_TIME_CHANGED = 205;
    public static final int REASON_LOCALE_CHANGED = 206;
    public static final int REASON_SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED = 207;
    public static final int REASON_REFRESH_SAFETY_SOURCES = 208;
    public static final int REASON_SYSTEM_ALLOW_LISTED = 300;
    public static final int REASON_ALARM_MANAGER_ALARM_CLOCK = 301;
    public static final int REASON_ALARM_MANAGER_WHILE_IDLE = 302;
    public static final int REASON_SERVICE_LAUNCH = 303;
    public static final int REASON_KEY_CHAIN = 304;
    public static final int REASON_PACKAGE_VERIFIER = 305;
    public static final int REASON_SYNC_MANAGER = 306;
    public static final int REASON_DOMAIN_VERIFICATION_V1 = 307;
    public static final int REASON_DOMAIN_VERIFICATION_V2 = 308;
    public static final int REASON_VPN = 309;
    public static final int REASON_NOTIFICATION_SERVICE = 310;
    public static final int REASON_PACKAGE_REPLACED = 311;
    public static final int REASON_LOCATION_PROVIDER = 312;
    public static final int REASON_MEDIA_BUTTON = 313;
    public static final int REASON_EVENT_SMS = 314;
    public static final int REASON_EVENT_MMS = 315;
    public static final int REASON_SHELL = 316;
    public static final int REASON_MEDIA_SESSION_CALLBACK = 317;
    public static final int REASON_ROLE_DIALER = 318;
    public static final int REASON_ROLE_EMERGENCY = 319;
    public static final int REASON_SYSTEM_MODULE = 320;
    public static final int REASON_CARRIER_PRIVILEGED_APP = 321;
    public static final int REASON_DPO_PROTECTED_APP = 322;
    public static final int REASON_DISALLOW_APPS_CONTROL = 323;
    public static final int REASON_ACTIVE_DEVICE_ADMIN = 324;
    public static final int REASON_OPT_OUT_REQUESTED = 1000;
    public static final int UNKNOWN = 0;
    public static final int OPTIMIZED = 1;
    public static final int BACKGROUND_RESTRICTED = 2;
    public static final int NOT_OPTIMIZED = 3;
    public static final int SDK_UNKNOWN = 0;
    public static final int SDK_PRE_S = 1;
    public static final int SDK_S = 2;
    public static final int SDK_T = 3;
    public static final long UID = 1120986464257L;
    public static final long RESTRICTION_LEVEL = 1159641169922L;
    public static final long THRESHOLD = 1159641169923L;
    public static final long TRACKER = 1159641169924L;
    public static final long FGS_TRACKER_INFO = 1146756268037L;
    public static final long BATTERY_TRACKER_INFO = 1146756268038L;
    public static final long BROADCAST_EVENTS_TRACKER_INFO = 1146756268039L;
    public static final long BIND_SERVICE_EVENTS_TRACKER_INFO = 1146756268040L;
    public static final long EXEMPTION_REASON = 1159641169929L;
    public static final long OPT_LEVEL = 1159641169930L;
    public static final long TARGET_SDK = 1159641169931L;
    public static final long LOW_MEM_DEVICE = 1133871366156L;
    public static final long PREVIOUS_RESTRICTION_LEVEL = 1159641169933L;
    public AppBackgroundRestrictionsInfo() {}

    public final class BatteryTrackerInfo {
        public static final long BATTERY_24H = 1120986464257L;
        public static final long BATTERY_USAGE_BACKGROUND = 1120986464258L;
        public static final long BATTERY_USAGE_FGS = 1120986464259L;
        public static final long BATTERY_USAGE_FOREGROUND = 1120986464260L;
        public static final long BATTERY_USAGE_CACHED = 1120986464261L;
        public BatteryTrackerInfo(android.os.AppBackgroundRestrictionsInfo p0) {}
    }

    public final class BindServiceEventsTrackerInfo {
        public static final long BIND_SERVICE_REQUESTS = 1120986464257L;
        public BindServiceEventsTrackerInfo(android.os.AppBackgroundRestrictionsInfo p0) {}
    }

    public final class BroadcastEventsTrackerInfo {
        public static final long BROADCASTS_SENT = 1120986464257L;
        public BroadcastEventsTrackerInfo(android.os.AppBackgroundRestrictionsInfo p0) {}
    }

    public final class FgsTrackerInfo {
        public static final long FGS_NOTIFICATION_VISIBLE = 1133871366145L;
        public static final long FGS_DURATION = 1112396529666L;
        public FgsTrackerInfo(android.os.AppBackgroundRestrictionsInfo p0) {}
    }
}
