package android.app;

public class AppOpsManager {
    final android.content.Context mContext = null;
    @android.annotation.UnsupportedAppUsage
    final com.android.internal.app.IAppOpsService mService = null;
    private final android.util.ArrayMap<android.app.AppOpsManager.OnOpChangedListener, com.android.internal.app.IAppOpsCallback> mModeWatchers = null;
    private final android.util.ArrayMap<android.app.AppOpsManager.OnOpActiveChangedListener, com.android.internal.app.IAppOpsActiveCallback> mActiveWatchers = null;
    private final android.util.ArrayMap<android.app.AppOpsManager.OnOpNotedListener, com.android.internal.app.IAppOpsNotedCallback> mNotedWatchers = null;
    static android.os.IBinder sToken;
    public static final int HISTORICAL_MODE_DISABLED = 0;
    public static final int HISTORICAL_MODE_ENABLED_ACTIVE = 1;
    public static final int HISTORICAL_MODE_ENABLED_PASSIVE = 2;
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_IGNORED = 1;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_FOREGROUND = 4;
    public static final int WATCH_FOREGROUND_CHANGES = 1;
    public static final java.lang.String[] MODE_NAMES = null;
    @android.annotation.SystemApi
    public static final int UID_STATE_PERSISTENT = 100;
    @android.annotation.SystemApi
    public static final int UID_STATE_TOP = 200;
    @android.annotation.SystemApi
    public static final int UID_STATE_FOREGROUND_SERVICE_LOCATION = 300;
    @android.annotation.SystemApi
    public static final int UID_STATE_FOREGROUND_SERVICE = 400;
    public static final int UID_STATE_MAX_LAST_NON_RESTRICTED = 400;
    @android.annotation.SystemApi
    public static final int UID_STATE_FOREGROUND = 500;
    @android.annotation.SystemApi
    public static final int UID_STATE_BACKGROUND = 600;
    @android.annotation.SystemApi
    public static final int UID_STATE_CACHED = 700;
    public static final int MAX_PRIORITY_UID_STATE = 100;
    public static final int MIN_PRIORITY_UID_STATE = 700;
    public static final int[] UID_STATES = null;
    @android.annotation.SystemApi
    public static final int OP_FLAG_SELF = 1;
    @android.annotation.SystemApi
    public static final int OP_FLAG_TRUSTED_PROXY = 2;
    @android.annotation.SystemApi
    public static final int OP_FLAG_UNTRUSTED_PROXY = 4;
    @android.annotation.SystemApi
    public static final int OP_FLAG_TRUSTED_PROXIED = 8;
    @android.annotation.SystemApi
    public static final int OP_FLAG_UNTRUSTED_PROXIED = 16;
    @android.annotation.SystemApi
    public static final int OP_FLAGS_ALL = 31;
    @android.annotation.SystemApi
    public static final int OP_FLAGS_ALL_TRUSTED = 13;
    private static final int UID_STATE_OFFSET = 31;
    private static final int FLAGS_MASK = -1;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_NONE = -1;
    public static final int OP_COARSE_LOCATION = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_FINE_LOCATION = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_GPS = 2;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_VIBRATE = 3;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_READ_CONTACTS = 4;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_WRITE_CONTACTS = 5;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_READ_CALL_LOG = 6;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_WRITE_CALL_LOG = 7;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_READ_CALENDAR = 8;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_WRITE_CALENDAR = 9;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_WIFI_SCAN = 10;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_POST_NOTIFICATION = 11;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_NEIGHBORING_CELLS = 12;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_CALL_PHONE = 13;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_READ_SMS = 14;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_WRITE_SMS = 15;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_RECEIVE_SMS = 16;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_RECEIVE_EMERGECY_SMS = 17;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_RECEIVE_MMS = 18;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_RECEIVE_WAP_PUSH = 19;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_SEND_SMS = 20;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_READ_ICC_SMS = 21;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_WRITE_ICC_SMS = 22;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_WRITE_SETTINGS = 23;
    public static final int OP_SYSTEM_ALERT_WINDOW = 24;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_ACCESS_NOTIFICATIONS = 25;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_CAMERA = 26;
    public static final int OP_RECORD_AUDIO = 27;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_PLAY_AUDIO = 28;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_READ_CLIPBOARD = 29;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_WRITE_CLIPBOARD = 30;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_TAKE_MEDIA_BUTTONS = 31;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_TAKE_AUDIO_FOCUS = 32;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_AUDIO_MASTER_VOLUME = 33;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_AUDIO_VOICE_VOLUME = 34;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_AUDIO_RING_VOLUME = 35;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_AUDIO_MEDIA_VOLUME = 36;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_AUDIO_ALARM_VOLUME = 37;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_AUDIO_NOTIFICATION_VOLUME = 38;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_AUDIO_BLUETOOTH_VOLUME = 39;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_WAKE_LOCK = 40;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_MONITOR_LOCATION = 41;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_MONITOR_HIGH_POWER_LOCATION = 42;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_GET_USAGE_STATS = 43;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_MUTE_MICROPHONE = 44;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_TOAST_WINDOW = 45;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_PROJECT_MEDIA = 46;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_ACTIVATE_VPN = 47;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_WRITE_WALLPAPER = 48;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_ASSIST_STRUCTURE = 49;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_ASSIST_SCREENSHOT = 50;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_READ_PHONE_STATE = 51;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_ADD_VOICEMAIL = 52;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_USE_SIP = 53;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_PROCESS_OUTGOING_CALLS = 54;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_USE_FINGERPRINT = 55;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_BODY_SENSORS = 56;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_READ_CELL_BROADCASTS = 57;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_MOCK_LOCATION = 58;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_READ_EXTERNAL_STORAGE = 59;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_WRITE_EXTERNAL_STORAGE = 60;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_TURN_SCREEN_ON = 61;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_GET_ACCOUNTS = 62;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_RUN_IN_BACKGROUND = 63;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_AUDIO_ACCESSIBILITY_VOLUME = 64;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_READ_PHONE_NUMBERS = 65;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_REQUEST_INSTALL_PACKAGES = 66;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_PICTURE_IN_PICTURE = 67;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_INSTANT_APP_START_FOREGROUND = 68;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_ANSWER_PHONE_CALLS = 69;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_RUN_ANY_IN_BACKGROUND = 70;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_CHANGE_WIFI_STATE = 71;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_REQUEST_DELETE_PACKAGES = 72;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_BIND_ACCESSIBILITY_SERVICE = 73;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_ACCEPT_HANDOVER = 74;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_MANAGE_IPSEC_TUNNELS = 75;
    public static final int OP_START_FOREGROUND = 76;
    @android.annotation.UnsupportedAppUsage
    public static final int OP_BLUETOOTH_SCAN = 77;
    public static final int OP_USE_BIOMETRIC = 78;
    public static final int OP_ACTIVITY_RECOGNITION = 79;
    public static final int OP_SMS_FINANCIAL_TRANSACTIONS = 80;
    public static final int OP_READ_MEDIA_AUDIO = 81;
    public static final int OP_WRITE_MEDIA_AUDIO = 82;
    public static final int OP_READ_MEDIA_VIDEO = 83;
    public static final int OP_WRITE_MEDIA_VIDEO = 84;
    public static final int OP_READ_MEDIA_IMAGES = 85;
    public static final int OP_WRITE_MEDIA_IMAGES = 86;
    public static final int OP_LEGACY_STORAGE = 87;
    public static final int OP_ACCESS_ACCESSIBILITY = 88;
    public static final int OP_READ_DEVICE_IDENTIFIERS = 89;
    @android.annotation.UnsupportedAppUsage
    public static final int _NUM_OP = 90;
    public static final java.lang.String OPSTR_COARSE_LOCATION = "android:coarse_location";
    public static final java.lang.String OPSTR_FINE_LOCATION = "android:fine_location";
    public static final java.lang.String OPSTR_MONITOR_LOCATION = "android:monitor_location";
    public static final java.lang.String OPSTR_MONITOR_HIGH_POWER_LOCATION = "android:monitor_location_high_power";
    public static final java.lang.String OPSTR_GET_USAGE_STATS = "android:get_usage_stats";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ACTIVATE_VPN = "android:activate_vpn";
    public static final java.lang.String OPSTR_READ_CONTACTS = "android:read_contacts";
    public static final java.lang.String OPSTR_WRITE_CONTACTS = "android:write_contacts";
    public static final java.lang.String OPSTR_READ_CALL_LOG = "android:read_call_log";
    public static final java.lang.String OPSTR_WRITE_CALL_LOG = "android:write_call_log";
    public static final java.lang.String OPSTR_READ_CALENDAR = "android:read_calendar";
    public static final java.lang.String OPSTR_WRITE_CALENDAR = "android:write_calendar";
    public static final java.lang.String OPSTR_CALL_PHONE = "android:call_phone";
    public static final java.lang.String OPSTR_READ_SMS = "android:read_sms";
    public static final java.lang.String OPSTR_RECEIVE_SMS = "android:receive_sms";
    public static final java.lang.String OPSTR_RECEIVE_MMS = "android:receive_mms";
    public static final java.lang.String OPSTR_RECEIVE_WAP_PUSH = "android:receive_wap_push";
    public static final java.lang.String OPSTR_SEND_SMS = "android:send_sms";
    public static final java.lang.String OPSTR_CAMERA = "android:camera";
    public static final java.lang.String OPSTR_RECORD_AUDIO = "android:record_audio";
    public static final java.lang.String OPSTR_READ_PHONE_STATE = "android:read_phone_state";
    public static final java.lang.String OPSTR_ADD_VOICEMAIL = "android:add_voicemail";
    public static final java.lang.String OPSTR_USE_SIP = "android:use_sip";
    public static final java.lang.String OPSTR_PROCESS_OUTGOING_CALLS = "android:process_outgoing_calls";
    public static final java.lang.String OPSTR_USE_FINGERPRINT = "android:use_fingerprint";
    public static final java.lang.String OPSTR_BODY_SENSORS = "android:body_sensors";
    public static final java.lang.String OPSTR_READ_CELL_BROADCASTS = "android:read_cell_broadcasts";
    public static final java.lang.String OPSTR_MOCK_LOCATION = "android:mock_location";
    public static final java.lang.String OPSTR_READ_EXTERNAL_STORAGE = "android:read_external_storage";
    public static final java.lang.String OPSTR_WRITE_EXTERNAL_STORAGE = "android:write_external_storage";
    public static final java.lang.String OPSTR_SYSTEM_ALERT_WINDOW = "android:system_alert_window";
    public static final java.lang.String OPSTR_WRITE_SETTINGS = "android:write_settings";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_GET_ACCOUNTS = "android:get_accounts";
    public static final java.lang.String OPSTR_READ_PHONE_NUMBERS = "android:read_phone_numbers";
    public static final java.lang.String OPSTR_PICTURE_IN_PICTURE = "android:picture_in_picture";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_INSTANT_APP_START_FOREGROUND = "android:instant_app_start_foreground";
    public static final java.lang.String OPSTR_ANSWER_PHONE_CALLS = "android:answer_phone_calls";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ACCEPT_HANDOVER = "android:accept_handover";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_GPS = "android:gps";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_VIBRATE = "android:vibrate";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WIFI_SCAN = "android:wifi_scan";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_POST_NOTIFICATION = "android:post_notification";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_NEIGHBORING_CELLS = "android:neighboring_cells";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WRITE_SMS = "android:write_sms";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_RECEIVE_EMERGENCY_BROADCAST = "android:receive_emergency_broadcast";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_ICC_SMS = "android:read_icc_sms";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WRITE_ICC_SMS = "android:write_icc_sms";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ACCESS_NOTIFICATIONS = "android:access_notifications";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_PLAY_AUDIO = "android:play_audio";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_CLIPBOARD = "android:read_clipboard";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WRITE_CLIPBOARD = "android:write_clipboard";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_TAKE_MEDIA_BUTTONS = "android:take_media_buttons";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_TAKE_AUDIO_FOCUS = "android:take_audio_focus";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_MASTER_VOLUME = "android:audio_master_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_VOICE_VOLUME = "android:audio_voice_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_RING_VOLUME = "android:audio_ring_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_MEDIA_VOLUME = "android:audio_media_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_ALARM_VOLUME = "android:audio_alarm_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_NOTIFICATION_VOLUME = "android:audio_notification_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_BLUETOOTH_VOLUME = "android:audio_bluetooth_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WAKE_LOCK = "android:wake_lock";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_MUTE_MICROPHONE = "android:mute_microphone";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_TOAST_WINDOW = "android:toast_window";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_PROJECT_MEDIA = "android:project_media";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WRITE_WALLPAPER = "android:write_wallpaper";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ASSIST_STRUCTURE = "android:assist_structure";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ASSIST_SCREENSHOT = "android:assist_screenshot";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_TURN_SCREEN_ON = "android:turn_screen_on";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_RUN_IN_BACKGROUND = "android:run_in_background";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_ACCESSIBILITY_VOLUME = "android:audio_accessibility_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_REQUEST_INSTALL_PACKAGES = "android:request_install_packages";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_RUN_ANY_IN_BACKGROUND = "android:run_any_in_background";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_CHANGE_WIFI_STATE = "android:change_wifi_state";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_REQUEST_DELETE_PACKAGES = "android:request_delete_packages";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_BIND_ACCESSIBILITY_SERVICE = "android:bind_accessibility_service";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_MANAGE_IPSEC_TUNNELS = "android:manage_ipsec_tunnels";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_START_FOREGROUND = "android:start_foreground";
    public static final java.lang.String OPSTR_BLUETOOTH_SCAN = "android:bluetooth_scan";
    public static final java.lang.String OPSTR_USE_BIOMETRIC = "android:use_biometric";
    public static final java.lang.String OPSTR_ACTIVITY_RECOGNITION = "android:activity_recognition";
    public static final java.lang.String OPSTR_SMS_FINANCIAL_TRANSACTIONS = "android:sms_financial_transactions";
    public static final java.lang.String OPSTR_READ_MEDIA_AUDIO = "android:read_media_audio";
    public static final java.lang.String OPSTR_WRITE_MEDIA_AUDIO = "android:write_media_audio";
    public static final java.lang.String OPSTR_READ_MEDIA_VIDEO = "android:read_media_video";
    public static final java.lang.String OPSTR_WRITE_MEDIA_VIDEO = "android:write_media_video";
    public static final java.lang.String OPSTR_READ_MEDIA_IMAGES = "android:read_media_images";
    public static final java.lang.String OPSTR_WRITE_MEDIA_IMAGES = "android:write_media_images";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_LEGACY_STORAGE = "android:legacy_storage";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ACCESS_ACCESSIBILITY = "android:access_accessibility";
    public static final java.lang.String OPSTR_READ_DEVICE_IDENTIFIERS = "android:read_device_identifiers";
    private static final int[] RUNTIME_AND_APPOP_PERMISSIONS_OPS = null;
    private static int[] sOpToSwitch;
    private static java.lang.String[] sOpToString;
    private static java.lang.String[] sOpNames;
    @android.annotation.UnsupportedAppUsage
    private static java.lang.String[] sOpPerms;
    private static java.lang.String[] sOpRestrictions;
    private static boolean[] sOpAllowSystemRestrictionBypass;
    private static int[] sOpDefaultMode;
    private static boolean[] sOpDisableReset;
    private static java.util.HashMap<java.lang.String, java.lang.Integer> sOpStrToOp;
    private static java.util.HashMap<java.lang.String, java.lang.Integer> sPermToOp;
    public static final java.lang.String KEY_HISTORICAL_OPS = "historical_ops";
    private static final java.lang.String DEBUG_LOGGING_ENABLE_PROP = "appops.logging_enabled";
    private static final java.lang.String DEBUG_LOGGING_PACKAGES_PROP = "appops.logging_packages";
    private static final java.lang.String DEBUG_LOGGING_OPS_PROP = "appops.logging_ops";
    private static final java.lang.String DEBUG_LOGGING_TAG = "AppOpsManager";
    public static int resolveFirstUnrestrictedUidState(int p0) { return 0; }
    public static int resolveLastRestrictedUidState(int p0) { return 0; }
    public static java.lang.String getUidStateName(int p0) { return null; }
    public static final java.lang.String getFlagName(int p0) { return null; }
    public static java.lang.String keyToString(long p0) { return null; }
    public static long makeKey(int p0, int p1) { return 0L; }
    public static int extractUidStateFromKey(long p0) { return 0; }
    public static int extractFlagsFromKey(long p0) { return 0; }
    public static java.lang.String flagsToString(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static int opToSwitch(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String opToName(int p0) { return null; }
    public static java.lang.String opToPublicName(int p0) { return null; }
    public static int strDebugOpToOp(java.lang.String p0) { return 0; }
    public static java.lang.String opToPermission(int p0) { return null; }
    @android.annotation.SystemApi
    public static java.lang.String opToPermission(java.lang.String p0) { return null; }
    public static java.lang.String opToRestriction(int p0) { return null; }
    public static int permissionToOpCode(java.lang.String p0) { return 0; }
    public static boolean opAllowSystemBypassRestriction(int p0) { return false; }
    public static int opToDefaultMode(int p0) { return 0; }
    @android.annotation.SystemApi
    public static int opToDefaultMode(java.lang.String p0) { return 0; }
    public static java.lang.String modeToName(int p0) { return null; }
    public static boolean opAllowsReset(int p0) { return false; }
    private static long sumForFlagsInStates(android.util.LongSparseLongArray p0, int p1, int p2, int p3) { return 0L; }
    private static long findFirstNonNegativeForFlagsInStates(android.util.LongSparseLongArray p0, int p1, int p2, int p3) { return 0L; }
    private static java.lang.String findFirstNonNullForFlagsInStates(android.util.LongSparseArray<java.lang.String> p0, int p1, int p2, int p3) { return null; }
    AppOpsManager(android.content.Context p0, com.android.internal.app.IAppOpsService p1) {}
    @android.annotation.SystemApi
    public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(java.lang.String[] p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int p0, java.lang.String p1, int[] p2) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int p0, java.lang.String p1, java.lang.String... p2) { return null; }
    @android.annotation.SystemApi
    public void getHistoricalOps(android.app.AppOpsManager.HistoricalOpsRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.app.AppOpsManager.HistoricalOps> p2) {}
    public void getHistoricalOpsFromDiskRaw(android.app.AppOpsManager.HistoricalOpsRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.app.AppOpsManager.HistoricalOps> p2) {}
    public void reloadNonHistoricalState() {}
    public void setUidMode(int p0, int p1, int p2) {}
    @android.annotation.SystemApi
    public void setUidMode(java.lang.String p0, int p1, int p2) {}
    public void setUserRestriction(int p0, boolean p1, android.os.IBinder p2) {}
    public void setUserRestriction(int p0, boolean p1, android.os.IBinder p2, java.lang.String[] p3) {}
    public void setUserRestrictionForUser(int p0, boolean p1, android.os.IBinder p2, java.lang.String[] p3, int p4) {}
    public void setMode(int p0, int p1, java.lang.String p2, int p3) {}
    @android.annotation.SystemApi
    public void setMode(java.lang.String p0, int p1, java.lang.String p2, int p3) {}
    @android.annotation.UnsupportedAppUsage
    public void setRestriction(int p0, int p1, int p2, java.lang.String[] p3) {}
    @android.annotation.UnsupportedAppUsage
    public void resetAllModes() {}
    public static java.lang.String permissionToOp(java.lang.String p0) { return null; }
    public void startWatchingMode(java.lang.String p0, java.lang.String p1, android.app.AppOpsManager.OnOpChangedListener p2) {}
    public void startWatchingMode(java.lang.String p0, java.lang.String p1, int p2, android.app.AppOpsManager.OnOpChangedListener p3) {}
    public void startWatchingMode(int p0, java.lang.String p1, android.app.AppOpsManager.OnOpChangedListener p2) {}
    public void startWatchingMode(int p0, java.lang.String p1, int p2, android.app.AppOpsManager.OnOpChangedListener p3) {}
    public void stopWatchingMode(android.app.AppOpsManager.OnOpChangedListener p0) {}
    public void startWatchingActive(int[] p0, android.app.AppOpsManager.OnOpActiveChangedListener p1) {}
    public void stopWatchingActive(android.app.AppOpsManager.OnOpActiveChangedListener p0) {}
    public void startWatchingNoted(int[] p0, android.app.AppOpsManager.OnOpNotedListener p1) {}
    public void stopWatchingNoted(android.app.AppOpsManager.OnOpNotedListener p0) {}
    private java.lang.String buildSecurityExceptionMsg(int p0, int p1, java.lang.String p2) { return null; }
    public static int strOpToOp(java.lang.String p0) { return 0; }
    public int unsafeCheckOp(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    @java.lang.Deprecated
    public int checkOp(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int unsafeCheckOpNoThrow(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    @java.lang.Deprecated
    public int checkOpNoThrow(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int unsafeCheckOpRaw(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int unsafeCheckOpRawNoThrow(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int noteOp(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int noteOpNoThrow(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int noteProxyOp(java.lang.String p0, java.lang.String p1) { return 0; }
    public int noteProxyOpNoThrow(java.lang.String p0, java.lang.String p1) { return 0; }
    public int noteProxyOpNoThrow(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    public int startOp(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int startOpNoThrow(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public void finishOp(java.lang.String p0, int p1, java.lang.String p2) {}
    @android.annotation.UnsupportedAppUsage
    public int checkOp(int p0, int p1, java.lang.String p2) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int checkOpNoThrow(int p0, int p1, java.lang.String p2) { return 0; }
    public void checkPackage(int p0, java.lang.String p1) {}
    public int checkAudioOp(int p0, int p1, int p2, java.lang.String p3) { return 0; }
    public int checkAudioOpNoThrow(int p0, int p1, int p2, java.lang.String p3) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int noteOp(int p0, int p1, java.lang.String p2) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int noteProxyOp(int p0, java.lang.String p1) { return 0; }
    public int noteProxyOpNoThrow(int p0, java.lang.String p1, int p2) { return 0; }
    public int noteProxyOpNoThrow(int p0, java.lang.String p1) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int noteOpNoThrow(int p0, int p1, java.lang.String p2) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int noteOp(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static android.os.IBinder getToken(com.android.internal.app.IAppOpsService p0) { return null; }
    public int startOp(int p0) { return 0; }
    public int startOp(int p0, int p1, java.lang.String p2) { return 0; }
    public int startOp(int p0, int p1, java.lang.String p2, boolean p3) { return 0; }
    public int startOpNoThrow(int p0, int p1, java.lang.String p2) { return 0; }
    public int startOpNoThrow(int p0, int p1, java.lang.String p2, boolean p3) { return 0; }
    public void finishOp(int p0, int p1, java.lang.String p2) {}
    public void finishOp(int p0) {}
    public boolean isOperationActive(int p0, int p1, java.lang.String p2) { return false; }
    public void setHistoryParameters(int p0, long p1, int p2) {}
    public void offsetHistory(long p0) {}
    public void addHistoricalOps(android.app.AppOpsManager.HistoricalOps p0) {}
    public void resetHistoryParameters() {}
    public void clearHistory() {}
    @android.annotation.SystemApi
    public static java.lang.String[] getOpStrs() { return null; }
    public static int getNumOps() { return 0; }
    private static long maxForFlagsInStates(android.util.LongSparseLongArray p0, int p1, int p2, int p3) { return 0L; }
    private static void writeLongSparseLongArrayToParcel(android.util.LongSparseLongArray p0, android.os.Parcel p1) {}
    private static android.util.LongSparseLongArray readLongSparseLongArrayFromParcel(android.os.Parcel p0) { return null; }
    private static void writeLongSparseStringArrayToParcel(android.util.LongSparseArray<java.lang.String> p0, android.os.Parcel p1) {}
    private static android.util.LongSparseArray<java.lang.String> readLongSparseStringArrayFromParcel(android.os.Parcel p0) { return null; }
    private static android.util.LongSparseArray<java.lang.Object> collectKeys(android.util.LongSparseLongArray p0, android.util.LongSparseArray<java.lang.Object> p1) { return null; }
    public static java.lang.String uidStateToString(int p0) { return null; }
    public static int parseHistoricalMode(java.lang.String p0) { return 0; }
    public static java.lang.String historicalModeToString(int p0) { return null; }
    private static int getSystemAlertWindowDefault() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UidState {
    }

    @android.annotation.SystemApi
    public static final class PackageOps implements android.os.Parcelable {
        private final java.lang.String mPackageName = null;
        private final int mUid = 0;
        private final java.util.List<android.app.AppOpsManager.OpEntry> mEntries = null;
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.PackageOps> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        public PackageOps(java.lang.String p0, int p1, java.util.List<android.app.AppOpsManager.OpEntry> p2) {}
        public java.lang.String getPackageName() { return null; }
        public int getUid() { return 0; }
        public java.util.List<android.app.AppOpsManager.OpEntry> getOps() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        PackageOps(android.os.Parcel p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OpFlags {
    }

    @android.annotation.SystemApi
    public static final class OpEntry implements android.os.Parcelable {
        private final int mOp = 0;
        private final boolean mRunning = false;
        private final int mMode = 0;
        private final android.util.LongSparseLongArray mAccessTimes = null;
        private final android.util.LongSparseLongArray mRejectTimes = null;
        private final android.util.LongSparseLongArray mDurations = null;
        private final android.util.LongSparseLongArray mProxyUids = null;
        private final android.util.LongSparseArray<java.lang.String> mProxyPackageNames = null;
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.OpEntry> CREATOR = null;
        public OpEntry(int p0, boolean p1, int p2, android.util.LongSparseLongArray p3, android.util.LongSparseLongArray p4, android.util.LongSparseLongArray p5, android.util.LongSparseLongArray p6, android.util.LongSparseArray<java.lang.String> p7) {}
        public OpEntry(int p0, int p1) {}
        public android.util.LongSparseArray<java.lang.Object> collectKeys() { return null; }
        @android.annotation.UnsupportedAppUsage
        public int getOp() { return 0; }
        public java.lang.String getOpStr() { return null; }
        public int getMode() { return 0; }
        @android.annotation.UnsupportedAppUsage
        public long getTime() { return 0L; }
        public long getLastAccessTime(int p0) { return 0L; }
        public long getLastAccessForegroundTime(int p0) { return 0L; }
        public long getLastAccessBackgroundTime(int p0) { return 0L; }
        public long getLastAccessTime(int p0, int p1, int p2) { return 0L; }
        @android.annotation.UnsupportedAppUsage
        public long getRejectTime() { return 0L; }
        public long getLastRejectTime(int p0) { return 0L; }
        public long getLastRejectForegroundTime(int p0) { return 0L; }
        public long getLastRejectBackgroundTime(int p0) { return 0L; }
        public long getLastRejectTime(int p0, int p1, int p2) { return 0L; }
        public boolean isRunning() { return false; }
        public long getDuration() { return 0L; }
        public long getLastForegroundDuration(int p0) { return 0L; }
        public long getLastBackgroundDuration(int p0) { return 0L; }
        public long getLastDuration(int p0, int p1, int p2) { return 0L; }
        public int getProxyUid() { return 0; }
        public int getProxyUid(int p0, int p1) { return 0; }
        public java.lang.String getProxyPackageName() { return null; }
        public java.lang.String getProxyPackageName(int p0, int p1) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        OpEntry(android.os.Parcel p0) {}
    }

    public static interface OnOpNotedListener {
        public void onOpNoted(int p0, int p1, java.lang.String p2, int p3);
    }

    public static interface OnOpChangedListener {
        public void onOpChanged(java.lang.String p0, java.lang.String p1);
    }

    public static class OnOpChangedInternalListener implements android.app.AppOpsManager.OnOpChangedListener {
        public OnOpChangedInternalListener() {}
        public void onOpChanged(java.lang.String p0, java.lang.String p1) {}
        public void onOpChanged(int p0, java.lang.String p1) {}
    }

    public static interface OnOpActiveChangedListener {
        public void onOpActiveChanged(int p0, int p1, java.lang.String p2, boolean p3);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Mode {
    }

    @android.annotation.SystemApi
    public static final class HistoricalUidOps implements android.os.Parcelable {
        private final int mUid = 0;
        private android.util.ArrayMap<java.lang.String, android.app.AppOpsManager.HistoricalPackageOps> mHistoricalPackageOps;
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.HistoricalUidOps> CREATOR = null;
        public HistoricalUidOps(int p0) {}
        private HistoricalUidOps(android.app.AppOpsManager.HistoricalUidOps p0) {}
        private HistoricalUidOps(android.os.Parcel p0) {}
        private android.app.AppOpsManager.HistoricalUidOps splice(double p0) { return null; }
        private void merge(android.app.AppOpsManager.HistoricalUidOps p0) {}
        private void filter(java.lang.String p0, java.lang.String[] p1, double p2) {}
        private boolean isEmpty() { return false; }
        private void increaseAccessCount(int p0, java.lang.String p1, int p2, int p3, long p4) {}
        private void increaseRejectCount(int p0, java.lang.String p1, int p2, int p3, long p4) {}
        private void increaseAccessDuration(int p0, java.lang.String p1, int p2, int p3, long p4) {}
        public int getUid() { return 0; }
        public int getPackageCount() { return 0; }
        public android.app.AppOpsManager.HistoricalPackageOps getPackageOpsAt(int p0) { return null; }
        public android.app.AppOpsManager.HistoricalPackageOps getPackageOps(java.lang.String p0) { return null; }
        private void clearHistory(java.lang.String p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private void accept(android.app.AppOpsManager.HistoricalOpsVisitor p0) {}
        private android.app.AppOpsManager.HistoricalPackageOps getOrCreateHistoricalPackageOps(java.lang.String p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @android.annotation.SystemApi
    public static final class HistoricalPackageOps implements android.os.Parcelable {
        private final java.lang.String mPackageName = null;
        private android.util.ArrayMap<java.lang.String, android.app.AppOpsManager.HistoricalOp> mHistoricalOps;
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.HistoricalPackageOps> CREATOR = null;
        public HistoricalPackageOps(java.lang.String p0) {}
        private HistoricalPackageOps(android.app.AppOpsManager.HistoricalPackageOps p0) {}
        private HistoricalPackageOps(android.os.Parcel p0) {}
        private android.app.AppOpsManager.HistoricalPackageOps splice(double p0) { return null; }
        private void merge(android.app.AppOpsManager.HistoricalPackageOps p0) {}
        private void filter(java.lang.String[] p0, double p1) {}
        private boolean isEmpty() { return false; }
        private void increaseAccessCount(int p0, int p1, int p2, long p3) {}
        private void increaseRejectCount(int p0, int p1, int p2, long p3) {}
        private void increaseAccessDuration(int p0, int p1, int p2, long p3) {}
        public java.lang.String getPackageName() { return null; }
        public int getOpCount() { return 0; }
        public android.app.AppOpsManager.HistoricalOp getOpAt(int p0) { return null; }
        public android.app.AppOpsManager.HistoricalOp getOp(java.lang.String p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private void accept(android.app.AppOpsManager.HistoricalOpsVisitor p0) {}
        private android.app.AppOpsManager.HistoricalOp getOrCreateHistoricalOp(int p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static interface HistoricalOpsVisitor {
        public void visitHistoricalOps(android.app.AppOpsManager.HistoricalOps p0);
        public void visitHistoricalUidOps(android.app.AppOpsManager.HistoricalUidOps p0);
        public void visitHistoricalPackageOps(android.app.AppOpsManager.HistoricalPackageOps p0);
        public void visitHistoricalOp(android.app.AppOpsManager.HistoricalOp p0);
    }

    @android.annotation.SystemApi
    public static final class HistoricalOpsRequest {
        private final int mUid = 0;
        private final java.lang.String mPackageName = null;
        private final java.util.List<java.lang.String> mOpNames = null;
        private final long mBeginTimeMillis = 0L;
        private final long mEndTimeMillis = 0L;
        private final int mFlags = 0;
        private HistoricalOpsRequest(int p0, java.lang.String p1, java.util.List<java.lang.String> p2, long p3, long p4, int p5) {}

        @android.annotation.SystemApi
        public static final class Builder {
            private int mUid;
            private java.lang.String mPackageName;
            private java.util.List<java.lang.String> mOpNames;
            private final long mBeginTimeMillis = 0L;
            private final long mEndTimeMillis = 0L;
            private int mFlags;
            public Builder(long p0, long p1) {}
            public android.app.AppOpsManager.HistoricalOpsRequest.Builder setUid(int p0) { return null; }
            public android.app.AppOpsManager.HistoricalOpsRequest.Builder setPackageName(java.lang.String p0) { return null; }
            public android.app.AppOpsManager.HistoricalOpsRequest.Builder setOpNames(java.util.List<java.lang.String> p0) { return null; }
            public android.app.AppOpsManager.HistoricalOpsRequest.Builder setFlags(int p0) { return null; }
            public android.app.AppOpsManager.HistoricalOpsRequest build() { return null; }
        }
    }

    @android.annotation.SystemApi
    public static final class HistoricalOps implements android.os.Parcelable {
        private long mBeginTimeMillis;
        private long mEndTimeMillis;
        private android.util.SparseArray<android.app.AppOpsManager.HistoricalUidOps> mHistoricalUidOps;
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.HistoricalOps> CREATOR = null;
        public HistoricalOps(long p0, long p1) {}
        public HistoricalOps(android.app.AppOpsManager.HistoricalOps p0) {}
        private HistoricalOps(android.os.Parcel p0) {}
        public android.app.AppOpsManager.HistoricalOps spliceFromBeginning(double p0) { return null; }
        public android.app.AppOpsManager.HistoricalOps spliceFromEnd(double p0) { return null; }
        private android.app.AppOpsManager.HistoricalOps splice(double p0, boolean p1) { return null; }
        public void merge(android.app.AppOpsManager.HistoricalOps p0) {}
        public void filter(int p0, java.lang.String p1, java.lang.String[] p2, long p3, long p4) {}
        public boolean isEmpty() { return false; }
        public long getDurationMillis() { return 0L; }
        public void increaseAccessCount(int p0, int p1, java.lang.String p2, int p3, int p4, long p5) {}
        public void increaseRejectCount(int p0, int p1, java.lang.String p2, int p3, int p4, long p5) {}
        public void increaseAccessDuration(int p0, int p1, java.lang.String p2, int p3, int p4, long p5) {}
        public void offsetBeginAndEndTime(long p0) {}
        public void setBeginAndEndTime(long p0, long p1) {}
        public void setBeginTime(long p0) {}
        public void setEndTime(long p0) {}
        public long getBeginTimeMillis() { return 0L; }
        public long getEndTimeMillis() { return 0L; }
        public int getUidCount() { return 0; }
        public android.app.AppOpsManager.HistoricalUidOps getUidOpsAt(int p0) { return null; }
        public android.app.AppOpsManager.HistoricalUidOps getUidOps(int p0) { return null; }
        public void clearHistory(int p0, java.lang.String p1) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void accept(android.app.AppOpsManager.HistoricalOpsVisitor p0) {}
        private android.app.AppOpsManager.HistoricalUidOps getOrCreateHistoricalUidOps(int p0) { return null; }
        public static double round(double p0) { return 0.0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    @android.annotation.SystemApi
    public static final class HistoricalOp implements android.os.Parcelable {
        private final int mOp = 0;
        private android.util.LongSparseLongArray mAccessCount;
        private android.util.LongSparseLongArray mRejectCount;
        private android.util.LongSparseLongArray mAccessDuration;
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.HistoricalOp> CREATOR = null;
        public HistoricalOp(int p0) {}
        private HistoricalOp(android.app.AppOpsManager.HistoricalOp p0) {}
        private HistoricalOp(android.os.Parcel p0) {}
        private void filter(double p0) {}
        private boolean isEmpty() { return false; }
        private boolean hasData(android.util.LongSparseLongArray p0) { return false; }
        private android.app.AppOpsManager.HistoricalOp splice(double p0) { return null; }
        private static void splice(android.util.LongSparseLongArray p0, java.util.function.Supplier<android.util.LongSparseLongArray> p1, double p2) {}
        private void merge(android.app.AppOpsManager.HistoricalOp p0) {}
        private void increaseAccessCount(int p0, int p1, long p2) {}
        private void increaseRejectCount(int p0, int p1, long p2) {}
        private void increaseAccessDuration(int p0, int p1, long p2) {}
        private void increaseCount(android.util.LongSparseLongArray p0, int p1, int p2, long p3) {}
        public java.lang.String getOpName() { return null; }
        public int getOpCode() { return 0; }
        public long getForegroundAccessCount(int p0) { return 0L; }
        public long getBackgroundAccessCount(int p0) { return 0L; }
        public long getAccessCount(int p0, int p1, int p2) { return 0L; }
        public long getForegroundRejectCount(int p0) { return 0L; }
        public long getBackgroundRejectCount(int p0) { return 0L; }
        public long getRejectCount(int p0, int p1, int p2) { return 0L; }
        public long getForegroundAccessDuration(int p0) { return 0L; }
        public long getBackgroundAccessDuration(int p0) { return 0L; }
        public long getAccessDuration(int p0, int p1, int p2) { return 0L; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        private void accept(android.app.AppOpsManager.HistoricalOpsVisitor p0) {}
        private android.util.LongSparseLongArray getOrCreateAccessCount() { return null; }
        private android.util.LongSparseLongArray getOrCreateRejectCount() { return null; }
        private android.util.LongSparseLongArray getOrCreateAccessDuration() { return null; }
        private static void scale(android.util.LongSparseLongArray p0, double p1) {}
        private static void merge(java.util.function.Supplier<android.util.LongSparseLongArray> p0, android.util.LongSparseLongArray p1) {}
        public android.util.LongSparseArray<java.lang.Object> collectKeys() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HistoricalMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD})
    public static @interface DataBucketKey {
    }
}
