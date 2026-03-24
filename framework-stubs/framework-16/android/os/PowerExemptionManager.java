package android.os;

@android.annotation.SystemApi
public class PowerExemptionManager {
    public static final int EVENT_UNSPECIFIED = 0;
    public static final int EVENT_SMS = 1;
    public static final int EVENT_MMS = 2;
    public static final int TEMPORARY_ALLOW_LIST_TYPE_NONE = -1;
    public static final int TEMPORARY_ALLOW_LIST_TYPE_FOREGROUND_SERVICE_ALLOWED = 0;
    public static final int TEMPORARY_ALLOW_LIST_TYPE_FOREGROUND_SERVICE_NOT_ALLOWED = 1;
    public static final int TEMPORARY_ALLOW_LIST_TYPE_APP_FREEZING_DELAYED = 4;
    public static final int REASON_DENIED = -1;
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_OTHER = 1;
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
    public static final int REASON_PUSH_MESSAGING_DEFERRABLE = 105;
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
    @android.annotation.SystemApi
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
    public static final int REASON_MEDIA_NOTIFICATION_TRANSFER = 325;
    public static final int REASON_PACKAGE_INSTALLER = 326;
    public static final int REASON_SYSTEM_EXEMPT_APP_OP = 327;
    public static final int REASON_PACKAGE_UNARCHIVE = 328;
    public static final int REASON_TILE_ONCLICK = 329;
    public static final int REASON_OPT_OUT_REQUESTED = 1000;
    public PowerExemptionManager(android.content.Context p0) {}
    @android.annotation.RequiresPermission("android.permission.DEVICE_POWER")
    public void addToPermanentAllowList(java.lang.String p0) {}
    @android.annotation.RequiresPermission("android.permission.DEVICE_POWER")
    public void addToPermanentAllowList(java.util.List<java.lang.String> p0) {}
    @android.annotation.NonNull
    @android.annotation.RequiresPermission("android.permission.DEVICE_POWER")
    public int[] getAllowListedAppIds(boolean p0) { return null; }
    public boolean isAllowListed(java.lang.String p0, boolean p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.DEVICE_POWER")
    public void removeFromPermanentAllowList(java.lang.String p0) {}
    @android.annotation.RequiresPermission("android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST")
    public void addToTemporaryAllowList(java.lang.String p0, int p1, java.lang.String p2, long p3) {}
    @android.annotation.RequiresPermission("android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST")
    public long addToTemporaryAllowListForEvent(java.lang.String p0, int p1, java.lang.String p2, int p3) { return 0L; }
    public static int getReasonCodeFromProcState(int p0) { return 0; }
    public static int getExemptionReasonForStatsd(int p0) { return 0; }
    public static java.lang.String reasonCodeToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AllowListEvent {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ReasonCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TempAllowListType {
    }
}
