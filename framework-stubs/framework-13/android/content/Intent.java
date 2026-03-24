package android.content;

public class Intent implements android.os.Parcelable, java.lang.Cloneable {
    public static final java.lang.String ACTION_MAIN = "android.intent.action.MAIN";
    public static final java.lang.String ACTION_VIEW = "android.intent.action.VIEW";
    public static final java.lang.String EXTRA_FROM_STORAGE = "android.intent.extra.FROM_STORAGE";
    public static final java.lang.String ACTION_DEFAULT = "android.intent.action.VIEW";
    public static final java.lang.String ACTION_QUICK_VIEW = "android.intent.action.QUICK_VIEW";
    public static final java.lang.String ACTION_ATTACH_DATA = "android.intent.action.ATTACH_DATA";
    public static final java.lang.String ACTION_EDIT = "android.intent.action.EDIT";
    public static final java.lang.String ACTION_INSERT_OR_EDIT = "android.intent.action.INSERT_OR_EDIT";
    public static final java.lang.String ACTION_PICK = "android.intent.action.PICK";
    public static final java.lang.String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
    public static final java.lang.String ACTION_CREATE_SHORTCUT = "android.intent.action.CREATE_SHORTCUT";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SHORTCUT_INTENT = "android.intent.extra.shortcut.INTENT";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SHORTCUT_NAME = "android.intent.extra.shortcut.NAME";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SHORTCUT_ICON = "android.intent.extra.shortcut.ICON";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SHORTCUT_ICON_RESOURCE = "android.intent.extra.shortcut.ICON_RESOURCE";
    public static final java.lang.String ACTION_APPLICATION_PREFERENCES = "android.intent.action.APPLICATION_PREFERENCES";
    public static final java.lang.String ACTION_SHOW_APP_INFO = "android.intent.action.SHOW_APP_INFO";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_ACTIVITY_RECOGNIZER = "android.intent.action.ACTIVITY_RECOGNIZER";
    public static final java.lang.String ACTION_CHOOSER = "android.intent.action.CHOOSER";
    public static final java.lang.String ACTION_GET_CONTENT = "android.intent.action.GET_CONTENT";
    public static final java.lang.String ACTION_DIAL = "android.intent.action.DIAL";
    public static final java.lang.String ACTION_CALL = "android.intent.action.CALL";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_CALL_EMERGENCY = "android.intent.action.CALL_EMERGENCY";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_DIAL_EMERGENCY = "android.intent.action.DIAL_EMERGENCY";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_CALL_PRIVILEGED = "android.intent.action.CALL_PRIVILEGED";
    public static final java.lang.String ACTION_CARRIER_SETUP = "android.intent.action.CARRIER_SETUP";
    public static final java.lang.String ACTION_SENDTO = "android.intent.action.SENDTO";
    public static final java.lang.String ACTION_SEND = "android.intent.action.SEND";
    public static final java.lang.String ACTION_SEND_MULTIPLE = "android.intent.action.SEND_MULTIPLE";
    public static final java.lang.String ACTION_ANSWER = "android.intent.action.ANSWER";
    public static final java.lang.String ACTION_INSERT = "android.intent.action.INSERT";
    public static final java.lang.String ACTION_PASTE = "android.intent.action.PASTE";
    public static final java.lang.String ACTION_DELETE = "android.intent.action.DELETE";
    public static final java.lang.String ACTION_RUN = "android.intent.action.RUN";
    public static final java.lang.String ACTION_SYNC = "android.intent.action.SYNC";
    public static final java.lang.String ACTION_PICK_ACTIVITY = "android.intent.action.PICK_ACTIVITY";
    public static final java.lang.String ACTION_SEARCH = "android.intent.action.SEARCH";
    public static final java.lang.String ACTION_SYSTEM_TUTORIAL = "android.intent.action.SYSTEM_TUTORIAL";
    public static final java.lang.String ACTION_WEB_SEARCH = "android.intent.action.WEB_SEARCH";
    public static final java.lang.String ACTION_ASSIST = "android.intent.action.ASSIST";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_VOICE_ASSIST = "android.intent.action.VOICE_ASSIST";
    public static final java.lang.String EXTRA_ASSIST_PACKAGE = "android.intent.extra.ASSIST_PACKAGE";
    public static final java.lang.String EXTRA_ASSIST_UID = "android.intent.extra.ASSIST_UID";
    public static final java.lang.String EXTRA_ASSIST_CONTEXT = "android.intent.extra.ASSIST_CONTEXT";
    public static final java.lang.String EXTRA_ASSIST_INPUT_HINT_KEYBOARD = "android.intent.extra.ASSIST_INPUT_HINT_KEYBOARD";
    public static final java.lang.String EXTRA_ASSIST_INPUT_DEVICE_ID = "android.intent.extra.ASSIST_INPUT_DEVICE_ID";
    public static final java.lang.String ACTION_ALL_APPS = "android.intent.action.ALL_APPS";
    public static final java.lang.String ACTION_SHOW_WORK_APPS = "android.intent.action.SHOW_WORK_APPS";
    public static final java.lang.String ACTION_SET_WALLPAPER = "android.intent.action.SET_WALLPAPER";
    public static final java.lang.String ACTION_BUG_REPORT = "android.intent.action.BUG_REPORT";
    public static final java.lang.String ACTION_FACTORY_TEST = "android.intent.action.FACTORY_TEST";
    public static final java.lang.String ACTION_CALL_BUTTON = "android.intent.action.CALL_BUTTON";
    public static final java.lang.String ACTION_VOICE_COMMAND = "android.intent.action.VOICE_COMMAND";
    public static final java.lang.String ACTION_SEARCH_LONG_PRESS = "android.intent.action.SEARCH_LONG_PRESS";
    public static final java.lang.String ACTION_APP_ERROR = "android.intent.action.APP_ERROR";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_PENDING_INCIDENT_REPORTS_CHANGED = "android.intent.action.PENDING_INCIDENT_REPORTS_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_INCIDENT_REPORT_READY = "android.intent.action.INCIDENT_REPORT_READY";
    public static final java.lang.String ACTION_POWER_USAGE_SUMMARY = "android.intent.action.POWER_USAGE_SUMMARY";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_DEVICE_INITIALIZATION_WIZARD = "android.intent.action.DEVICE_INITIALIZATION_WIZARD";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_UPGRADE_SETUP = "android.intent.action.UPGRADE_SETUP";
    public static final java.lang.String ACTION_SHOW_KEYBOARD_SHORTCUTS = "com.android.intent.action.SHOW_KEYBOARD_SHORTCUTS";
    public static final java.lang.String ACTION_DISMISS_KEYBOARD_SHORTCUTS = "com.android.intent.action.DISMISS_KEYBOARD_SHORTCUTS";
    public static final java.lang.String ACTION_MANAGE_NETWORK_USAGE = "android.intent.action.MANAGE_NETWORK_USAGE";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_INSTALL_PACKAGE = "android.intent.action.INSTALL_PACKAGE";
    public static final java.lang.String ACTION_INSTALL_FAILURE = "android.intent.action.INSTALL_FAILURE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_INSTALL_INSTANT_APP_PACKAGE = "android.intent.action.INSTALL_INSTANT_APP_PACKAGE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_RESOLVE_INSTANT_APP_PACKAGE = "android.intent.action.RESOLVE_INSTANT_APP_PACKAGE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_INSTANT_APP_RESOLVER_SETTINGS = "android.intent.action.INSTANT_APP_RESOLVER_SETTINGS";
    public static final java.lang.String EXTRA_INSTALLER_PACKAGE_NAME = "android.intent.extra.INSTALLER_PACKAGE_NAME";
    public static final java.lang.String EXTRA_NOT_UNKNOWN_SOURCE = "android.intent.extra.NOT_UNKNOWN_SOURCE";
    public static final java.lang.String EXTRA_ORIGINATING_URI = "android.intent.extra.ORIGINATING_URI";
    public static final java.lang.String EXTRA_REFERRER = "android.intent.extra.REFERRER";
    public static final java.lang.String EXTRA_REFERRER_NAME = "android.intent.extra.REFERRER_NAME";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ORIGINATING_UID = "android.intent.extra.ORIGINATING_UID";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_ALLOW_REPLACE = "android.intent.extra.ALLOW_REPLACE";
    public static final java.lang.String EXTRA_RETURN_RESULT = "android.intent.extra.RETURN_RESULT";
    public static final java.lang.String EXTRA_INSTALL_RESULT = "android.intent.extra.INSTALL_RESULT";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_UNINSTALL_PACKAGE = "android.intent.action.UNINSTALL_PACKAGE";
    public static final java.lang.String EXTRA_UNINSTALL_ALL_USERS = "android.intent.extra.UNINSTALL_ALL_USERS";
    @android.annotation.SystemApi
    public static final java.lang.String METADATA_SETUP_VERSION = "android.SETUP_VERSION";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_MANAGE_APP_PERMISSIONS = "android.intent.action.MANAGE_APP_PERMISSIONS";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.GRANT_RUNTIME_PERMISSIONS")
    public static final java.lang.String ACTION_MANAGE_APP_PERMISSION = "android.intent.action.MANAGE_APP_PERMISSION";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_MANAGE_PERMISSIONS = "android.intent.action.MANAGE_PERMISSIONS";
    public static final java.lang.String ACTION_AUTO_REVOKE_PERMISSIONS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";
    public static final java.lang.String ACTION_MANAGE_UNUSED_APPS = "android.intent.action.MANAGE_UNUSED_APPS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_REVIEW_PERMISSIONS = "android.intent.action.REVIEW_PERMISSIONS";
    @android.annotation.RequiresPermission("android.permission.START_VIEW_PERMISSION_USAGE")
    public static final java.lang.String ACTION_VIEW_PERMISSION_USAGE = "android.intent.action.VIEW_PERMISSION_USAGE";
    @android.annotation.RequiresPermission("android.permission.START_VIEW_PERMISSION_USAGE")
    public static final java.lang.String ACTION_VIEW_PERMISSION_USAGE_FOR_PERIOD = "android.intent.action.VIEW_PERMISSION_USAGE_FOR_PERIOD";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_SENSOR_PRIVACY")
    public static final java.lang.String ACTION_VIEW_SAFETY_CENTER_QS = "android.intent.action.VIEW_SAFETY_CENTER_QS";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_ROLE_HOLDERS")
    public static final java.lang.String ACTION_MANAGE_DEFAULT_APP = "android.intent.action.MANAGE_DEFAULT_APP";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ROLE_NAME = "android.intent.extra.ROLE_NAME";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_ROLE_HOLDERS")
    public static final java.lang.String ACTION_MANAGE_SPECIAL_APP_ACCESSES = "android.intent.action.MANAGE_SPECIAL_APP_ACCESSES";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_REMOTE_CALLBACK = "android.intent.extra.REMOTE_CALLBACK";
    public static final java.lang.String EXTRA_PACKAGE_NAME = "android.intent.extra.PACKAGE_NAME";
    public static final java.lang.String EXTRA_LOCALE_LIST = "android.intent.extra.LOCALE_LIST";
    public static final java.lang.String EXTRA_SUSPENDED_PACKAGE_EXTRAS = "android.intent.extra.SUSPENDED_PACKAGE_EXTRAS";
    public static final java.lang.String EXTRA_SPLIT_NAME = "android.intent.extra.SPLIT_NAME";
    public static final java.lang.String EXTRA_COMPONENT_NAME = "android.intent.extra.COMPONENT_NAME";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_RESULT_NEEDED = "android.intent.extra.RESULT_NEEDED";
    public static final java.lang.String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_MANAGE_PERMISSION_APPS = "android.intent.action.MANAGE_PERMISSION_APPS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PERMISSION_NAME = "android.intent.extra.PERMISSION_NAME";
    public static final java.lang.String EXTRA_PERMISSION_GROUP_NAME = "android.intent.extra.PERMISSION_GROUP_NAME";
    public static final java.lang.String EXTRA_DURATION_MILLIS = "android.intent.extra.DURATION_MILLIS";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.GRANT_RUNTIME_PERMISSIONS")
    public static final java.lang.String ACTION_REVIEW_PERMISSION_USAGE = "android.intent.action.REVIEW_PERMISSION_USAGE";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.GRANT_RUNTIME_PERMISSIONS")
    public static final java.lang.String ACTION_REVIEW_PERMISSION_HISTORY = "android.intent.action.REVIEW_PERMISSION_HISTORY";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.GRANT_RUNTIME_PERMISSIONS")
    public static final java.lang.String ACTION_REVIEW_ONGOING_PERMISSION_USAGE = "android.intent.action.REVIEW_ONGOING_PERMISSION_USAGE";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.REVIEW_ACCESSIBILITY_SERVICES")
    public static final java.lang.String ACTION_REVIEW_ACCESSIBILITY_SERVICES = "android.intent.action.REVIEW_ACCESSIBILITY_SERVICES";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.START_VIEW_PERMISSION_USAGE")
    public static final java.lang.String ACTION_MANAGE_PERMISSION_USAGE = "android.intent.action.MANAGE_PERMISSION_USAGE";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.START_VIEW_APP_FEATURES")
    public static final java.lang.String ACTION_VIEW_APP_FEATURES = "android.intent.action.VIEW_APP_FEATURES";
    public static final java.lang.String ACTION_SAFETY_CENTER = "android.intent.action.SAFETY_CENTER";
    public static final java.lang.String ACTION_SCREEN_OFF = "android.intent.action.SCREEN_OFF";
    public static final java.lang.String ACTION_SCREEN_ON = "android.intent.action.SCREEN_ON";
    public static final java.lang.String ACTION_DREAMING_STOPPED = "android.intent.action.DREAMING_STOPPED";
    public static final java.lang.String ACTION_DREAMING_STARTED = "android.intent.action.DREAMING_STARTED";
    public static final java.lang.String ACTION_USER_PRESENT = "android.intent.action.USER_PRESENT";
    public static final java.lang.String ACTION_TIME_TICK = "android.intent.action.TIME_TICK";
    public static final java.lang.String ACTION_TIME_CHANGED = "android.intent.action.TIME_SET";
    public static final java.lang.String ACTION_DATE_CHANGED = "android.intent.action.DATE_CHANGED";
    public static final java.lang.String ACTION_TIMEZONE_CHANGED = "android.intent.action.TIMEZONE_CHANGED";
    public static final java.lang.String ACTION_ALARM_CHANGED = "android.intent.action.ALARM_CHANGED";
    public static final java.lang.String ACTION_LOCKED_BOOT_COMPLETED = "android.intent.action.LOCKED_BOOT_COMPLETED";
    public static final java.lang.String ACTION_BOOT_COMPLETED = "android.intent.action.BOOT_COMPLETED";
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.BROADCAST_CLOSE_SYSTEM_DIALOGS")
    public static final java.lang.String ACTION_CLOSE_SYSTEM_DIALOGS = "android.intent.action.CLOSE_SYSTEM_DIALOGS";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_PACKAGE_INSTALL = "android.intent.action.PACKAGE_INSTALL";
    public static final java.lang.String ACTION_PACKAGE_ADDED = "android.intent.action.PACKAGE_ADDED";
    public static final java.lang.String ACTION_PACKAGE_REPLACED = "android.intent.action.PACKAGE_REPLACED";
    public static final java.lang.String ACTION_MY_PACKAGE_REPLACED = "android.intent.action.MY_PACKAGE_REPLACED";
    public static final java.lang.String ACTION_PACKAGE_REMOVED = "android.intent.action.PACKAGE_REMOVED";
    public static final java.lang.String ACTION_PACKAGE_REMOVED_INTERNAL = "android.intent.action.PACKAGE_REMOVED_INTERNAL";
    public static final java.lang.String ACTION_PACKAGE_FULLY_REMOVED = "android.intent.action.PACKAGE_FULLY_REMOVED";
    public static final java.lang.String ACTION_PACKAGE_CHANGED = "android.intent.action.PACKAGE_CHANGED";
    public static final java.lang.String ACTION_PACKAGE_ENABLE_ROLLBACK = "android.intent.action.PACKAGE_ENABLE_ROLLBACK";
    public static final java.lang.String ACTION_CANCEL_ENABLE_ROLLBACK = "android.intent.action.CANCEL_ENABLE_ROLLBACK";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_ROLLBACK_COMMITTED = "android.intent.action.ROLLBACK_COMMITTED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_QUERY_PACKAGE_RESTART = "android.intent.action.QUERY_PACKAGE_RESTART";
    public static final java.lang.String ACTION_PACKAGE_RESTARTED = "android.intent.action.PACKAGE_RESTARTED";
    public static final java.lang.String ACTION_PACKAGE_DATA_CLEARED = "android.intent.action.PACKAGE_DATA_CLEARED";
    public static final java.lang.String ACTION_PACKAGES_SUSPENDED = "android.intent.action.PACKAGES_SUSPENDED";
    public static final java.lang.String ACTION_PACKAGES_UNSUSPENDED = "android.intent.action.PACKAGES_UNSUSPENDED";
    public static final java.lang.String ACTION_PACKAGES_SUSPENSION_CHANGED = "android.intent.action.PACKAGES_SUSPENSION_CHANGED";
    public static final java.lang.String ACTION_DISTRACTING_PACKAGES_CHANGED = "android.intent.action.DISTRACTING_PACKAGES_CHANGED";
    public static final java.lang.String ACTION_MY_PACKAGE_SUSPENDED = "android.intent.action.MY_PACKAGE_SUSPENDED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_SHOW_SUSPENDED_APP_DETAILS = "android.intent.action.SHOW_SUSPENDED_APP_DETAILS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_PACKAGE_UNSUSPENDED_MANUALLY = "android.intent.action.PACKAGE_UNSUSPENDED_MANUALLY";
    public static final java.lang.String ACTION_MY_PACKAGE_UNSUSPENDED = "android.intent.action.MY_PACKAGE_UNSUSPENDED";
    public static final java.lang.String ACTION_UID_REMOVED = "android.intent.action.UID_REMOVED";
    public static final java.lang.String ACTION_PACKAGE_FIRST_LAUNCH = "android.intent.action.PACKAGE_FIRST_LAUNCH";
    public static final java.lang.String ACTION_PACKAGE_NEEDS_VERIFICATION = "android.intent.action.PACKAGE_NEEDS_VERIFICATION";
    public static final java.lang.String ACTION_PACKAGE_VERIFIED = "android.intent.action.PACKAGE_VERIFIED";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_INTENT_FILTER_NEEDS_VERIFICATION = "android.intent.action.INTENT_FILTER_NEEDS_VERIFICATION";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_DOMAINS_NEED_VERIFICATION = "android.intent.action.DOMAINS_NEED_VERIFICATION";
    public static final java.lang.String ACTION_EXTERNAL_APPLICATIONS_AVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE";
    public static final java.lang.String ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE";
    public static final java.lang.String ACTION_PREFERRED_ACTIVITY_CHANGED = "android.intent.action.ACTION_PREFERRED_ACTIVITY_CHANGED";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_WALLPAPER_CHANGED = "android.intent.action.WALLPAPER_CHANGED";
    public static final java.lang.String ACTION_CONFIGURATION_CHANGED = "android.intent.action.CONFIGURATION_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_SPLIT_CONFIGURATION_CHANGED = "android.intent.action.SPLIT_CONFIGURATION_CHANGED";
    public static final java.lang.String ACTION_LOCALE_CHANGED = "android.intent.action.LOCALE_CHANGED";
    public static final java.lang.String ACTION_APPLICATION_LOCALE_CHANGED = "android.intent.action.APPLICATION_LOCALE_CHANGED";
    public static final java.lang.String ACTION_BATTERY_CHANGED = "android.intent.action.BATTERY_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_BATTERY_LEVEL_CHANGED = "android.intent.action.BATTERY_LEVEL_CHANGED";
    public static final java.lang.String ACTION_BATTERY_LOW = "android.intent.action.BATTERY_LOW";
    public static final java.lang.String ACTION_BATTERY_OKAY = "android.intent.action.BATTERY_OKAY";
    public static final java.lang.String ACTION_POWER_CONNECTED = "android.intent.action.ACTION_POWER_CONNECTED";
    public static final java.lang.String ACTION_POWER_DISCONNECTED = "android.intent.action.ACTION_POWER_DISCONNECTED";
    public static final java.lang.String ACTION_SHUTDOWN = "android.intent.action.ACTION_SHUTDOWN";
    public static final java.lang.String ACTION_REQUEST_SHUTDOWN = "com.android.internal.intent.action.REQUEST_SHUTDOWN";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_DEVICE_STORAGE_LOW = "android.intent.action.DEVICE_STORAGE_LOW";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_DEVICE_STORAGE_OK = "android.intent.action.DEVICE_STORAGE_OK";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_DEVICE_STORAGE_FULL = "android.intent.action.DEVICE_STORAGE_FULL";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_DEVICE_STORAGE_NOT_FULL = "android.intent.action.DEVICE_STORAGE_NOT_FULL";
    public static final java.lang.String ACTION_MANAGE_PACKAGE_STORAGE = "android.intent.action.MANAGE_PACKAGE_STORAGE";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_UMS_CONNECTED = "android.intent.action.UMS_CONNECTED";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_UMS_DISCONNECTED = "android.intent.action.UMS_DISCONNECTED";
    public static final java.lang.String ACTION_MEDIA_REMOVED = "android.intent.action.MEDIA_REMOVED";
    public static final java.lang.String ACTION_MEDIA_UNMOUNTED = "android.intent.action.MEDIA_UNMOUNTED";
    public static final java.lang.String ACTION_MEDIA_CHECKING = "android.intent.action.MEDIA_CHECKING";
    public static final java.lang.String ACTION_MEDIA_NOFS = "android.intent.action.MEDIA_NOFS";
    public static final java.lang.String ACTION_MEDIA_MOUNTED = "android.intent.action.MEDIA_MOUNTED";
    public static final java.lang.String ACTION_MEDIA_SHARED = "android.intent.action.MEDIA_SHARED";
    public static final java.lang.String ACTION_MEDIA_UNSHARED = "android.intent.action.MEDIA_UNSHARED";
    public static final java.lang.String ACTION_MEDIA_BAD_REMOVAL = "android.intent.action.MEDIA_BAD_REMOVAL";
    public static final java.lang.String ACTION_MEDIA_UNMOUNTABLE = "android.intent.action.MEDIA_UNMOUNTABLE";
    public static final java.lang.String ACTION_MEDIA_EJECT = "android.intent.action.MEDIA_EJECT";
    public static final java.lang.String ACTION_MEDIA_SCANNER_STARTED = "android.intent.action.MEDIA_SCANNER_STARTED";
    public static final java.lang.String ACTION_MEDIA_SCANNER_FINISHED = "android.intent.action.MEDIA_SCANNER_FINISHED";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_MEDIA_SCANNER_SCAN_FILE = "android.intent.action.MEDIA_SCANNER_SCAN_FILE";
    public static final java.lang.String ACTION_MEDIA_BUTTON = "android.intent.action.MEDIA_BUTTON";
    public static final java.lang.String ACTION_CAMERA_BUTTON = "android.intent.action.CAMERA_BUTTON";
    public static final java.lang.String ACTION_GTALK_SERVICE_CONNECTED = "android.intent.action.GTALK_CONNECTED";
    public static final java.lang.String ACTION_GTALK_SERVICE_DISCONNECTED = "android.intent.action.GTALK_DISCONNECTED";
    public static final java.lang.String ACTION_INPUT_METHOD_CHANGED = "android.intent.action.INPUT_METHOD_CHANGED";
    public static final java.lang.String ACTION_AIRPLANE_MODE_CHANGED = "android.intent.action.AIRPLANE_MODE";
    public static final java.lang.String ACTION_PROVIDER_CHANGED = "android.intent.action.PROVIDER_CHANGED";
    public static final java.lang.String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
    public static final java.lang.String ACTION_ADVANCED_SETTINGS_CHANGED = "android.intent.action.ADVANCED_SETTINGS";
    public static final java.lang.String ACTION_APPLICATION_RESTRICTIONS_CHANGED = "android.intent.action.APPLICATION_RESTRICTIONS_CHANGED";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_NEW_OUTGOING_CALL = "android.intent.action.NEW_OUTGOING_CALL";
    public static final java.lang.String ACTION_REBOOT = "android.intent.action.REBOOT";
    public static final java.lang.String ACTION_DOCK_EVENT = "android.intent.action.DOCK_EVENT";
    public static final java.lang.String ACTION_IDLE_MAINTENANCE_START = "android.intent.action.ACTION_IDLE_MAINTENANCE_START";
    public static final java.lang.String ACTION_IDLE_MAINTENANCE_END = "android.intent.action.ACTION_IDLE_MAINTENANCE_END";
    public static final java.lang.String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_PRE_BOOT_COMPLETED = "android.intent.action.PRE_BOOT_COMPLETED";
    public static final java.lang.String ACTION_GET_RESTRICTION_ENTRIES = "android.intent.action.GET_RESTRICTION_ENTRIES";
    public static final java.lang.String ACTION_USER_INITIALIZE = "android.intent.action.USER_INITIALIZE";
    public static final java.lang.String ACTION_USER_FOREGROUND = "android.intent.action.USER_FOREGROUND";
    public static final java.lang.String ACTION_USER_BACKGROUND = "android.intent.action.USER_BACKGROUND";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USER_ADDED = "android.intent.action.USER_ADDED";
    public static final java.lang.String ACTION_USER_STARTED = "android.intent.action.USER_STARTED";
    public static final java.lang.String ACTION_USER_STARTING = "android.intent.action.USER_STARTING";
    public static final java.lang.String ACTION_USER_STOPPING = "android.intent.action.USER_STOPPING";
    public static final java.lang.String ACTION_USER_STOPPED = "android.intent.action.USER_STOPPED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USER_REMOVED = "android.intent.action.USER_REMOVED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USER_SWITCHED = "android.intent.action.USER_SWITCHED";
    public static final java.lang.String ACTION_USER_UNLOCKED = "android.intent.action.USER_UNLOCKED";
    public static final java.lang.String ACTION_USER_INFO_CHANGED = "android.intent.action.USER_INFO_CHANGED";
    public static final java.lang.String ACTION_MANAGED_PROFILE_ADDED = "android.intent.action.MANAGED_PROFILE_ADDED";
    public static final java.lang.String ACTION_MANAGED_PROFILE_REMOVED = "android.intent.action.MANAGED_PROFILE_REMOVED";
    public static final java.lang.String ACTION_MANAGED_PROFILE_UNLOCKED = "android.intent.action.MANAGED_PROFILE_UNLOCKED";
    public static final java.lang.String ACTION_MANAGED_PROFILE_AVAILABLE = "android.intent.action.MANAGED_PROFILE_AVAILABLE";
    public static final java.lang.String ACTION_MANAGED_PROFILE_UNAVAILABLE = "android.intent.action.MANAGED_PROFILE_UNAVAILABLE";
    public static final java.lang.String ACTION_PROFILE_ACCESSIBLE = "android.intent.action.PROFILE_ACCESSIBLE";
    public static final java.lang.String ACTION_PROFILE_INACCESSIBLE = "android.intent.action.PROFILE_INACCESSIBLE";
    public static final java.lang.String ACTION_DEVICE_LOCKED_CHANGED = "android.intent.action.DEVICE_LOCKED_CHANGED";
    public static final java.lang.String ACTION_QUICK_CLOCK = "android.intent.action.QUICK_CLOCK";
    public static final java.lang.String ACTION_SHOW_BRIGHTNESS_DIALOG = "com.android.intent.action.SHOW_BRIGHTNESS_DIALOG";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_GLOBAL_BUTTON = "android.intent.action.GLOBAL_BUTTON";
    public static final java.lang.String ACTION_MEDIA_RESOURCE_GRANTED = "android.intent.action.MEDIA_RESOURCE_GRANTED";
    public static final java.lang.String ACTION_OVERLAY_CHANGED = "android.intent.action.OVERLAY_CHANGED";
    public static final java.lang.String ACTION_OPEN_DOCUMENT = "android.intent.action.OPEN_DOCUMENT";
    public static final java.lang.String ACTION_CREATE_DOCUMENT = "android.intent.action.CREATE_DOCUMENT";
    public static final java.lang.String ACTION_OPEN_DOCUMENT_TREE = "android.intent.action.OPEN_DOCUMENT_TREE";
    public static final java.lang.String ACTION_TRANSLATE = "android.intent.action.TRANSLATE";
    public static final java.lang.String ACTION_DEFINE = "android.intent.action.DEFINE";
    public static final java.lang.String ACTION_DYNAMIC_SENSOR_CHANGED = "android.intent.action.DYNAMIC_SENSOR_CHANGED";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_MASTER_CLEAR = "android.intent.action.MASTER_CLEAR";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_MASTER_CLEAR_NOTIFICATION = "android.intent.action.MASTER_CLEAR_NOTIFICATION";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_FORCE_MASTER_CLEAR = "android.intent.extra.FORCE_MASTER_CLEAR";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_FACTORY_RESET = "android.intent.action.FACTORY_RESET";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_FORCE_FACTORY_RESET = "android.intent.extra.FORCE_FACTORY_RESET";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_SETTING_RESTORED = "android.os.action.SETTING_RESTORED";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String EXTRA_SETTING_NAME = "setting_name";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String EXTRA_SETTING_PREVIOUS_VALUE = "previous_value";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String EXTRA_SETTING_NEW_VALUE = "new_value";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String EXTRA_SETTING_RESTORED_FROM_SDK_INT = "restored_from_sdk_int";
    public static final java.lang.String ACTION_PROCESS_TEXT = "android.intent.action.PROCESS_TEXT";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_SIM_STATE_CHANGED = "android.intent.action.SIM_STATE_CHANGED";
    public static final java.lang.String EXTRA_SIM_STATE = "ss";
    public static final java.lang.String SIM_STATE_UNKNOWN = "UNKNOWN";
    public static final java.lang.String SIM_STATE_NOT_READY = "NOT_READY";
    public static final java.lang.String SIM_STATE_ABSENT = "ABSENT";
    public static final java.lang.String SIM_STATE_PRESENT = "PRESENT";
    public static final java.lang.String SIM_STATE_CARD_IO_ERROR = "CARD_IO_ERROR";
    public static final java.lang.String SIM_STATE_CARD_RESTRICTED = "CARD_RESTRICTED";
    public static final java.lang.String SIM_STATE_LOCKED = "LOCKED";
    public static final java.lang.String SIM_STATE_READY = "READY";
    public static final java.lang.String SIM_STATE_IMSI = "IMSI";
    public static final java.lang.String SIM_STATE_LOADED = "LOADED";
    public static final java.lang.String EXTRA_SIM_LOCKED_REASON = "reason";
    public static final java.lang.String SIM_LOCKED_ON_PIN = "PIN";
    public static final java.lang.String SIM_LOCKED_ON_PUK = "PUK";
    public static final java.lang.String SIM_LOCKED_NETWORK = "NETWORK";
    public static final java.lang.String SIM_ABSENT_ON_PERM_DISABLED = "PERM_DISABLED";
    public static final java.lang.String EXTRA_REBROADCAST_ON_UNLOCK = "rebroadcastOnUnlock";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_SERVICE_STATE = "android.intent.action.SERVICE_STATE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_LOAD_DATA = "android.intent.action.LOAD_DATA";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_VOICE_REG_STATE = "voiceRegState";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_DATA_REG_STATE = "dataRegState";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_VOICE_ROAMING_TYPE = "voiceRoamingType";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_DATA_ROAMING_TYPE = "dataRoamingType";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_OPERATOR_ALPHA_LONG = "operator-alpha-long";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_OPERATOR_ALPHA_SHORT = "operator-alpha-short";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_OPERATOR_NUMERIC = "operator-numeric";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_DATA_OPERATOR_ALPHA_LONG = "data-operator-alpha-long";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_DATA_OPERATOR_ALPHA_SHORT = "data-operator-alpha-short";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_DATA_OPERATOR_NUMERIC = "data-operator-numeric";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_MANUAL = "manual";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_VOICE_RADIO_TECH = "radioTechnology";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_DATA_RADIO_TECH = "dataRadioTechnology";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CSS_INDICATOR = "cssIndicator";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_NETWORK_ID = "networkId";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_SYSTEM_ID = "systemId";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CDMA_ROAMING_INDICATOR = "cdmaRoamingIndicator";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CDMA_DEFAULT_ROAMING_INDICATOR = "cdmaDefaultRoamingIndicator";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_EMERGENCY_ONLY = "emergencyOnly";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_IS_DATA_ROAMING_FROM_REGISTRATION = "isDataRoamingFromRegistration";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_IS_USING_CARRIER_AGGREGATION = "isUsingCarrierAggregation";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_LTE_EARFCN_RSRP_BOOST = "LteEarfcnRsrpBoost";
    public static final java.lang.String EXTRA_PROCESS_TEXT = "android.intent.extra.PROCESS_TEXT";
    public static final java.lang.String EXTRA_PROCESS_TEXT_READONLY = "android.intent.extra.PROCESS_TEXT_READONLY";
    public static final java.lang.String ACTION_THERMAL_EVENT = "android.intent.action.THERMAL_EVENT";
    public static final java.lang.String EXTRA_THERMAL_STATE = "android.intent.extra.THERMAL_STATE";
    public static final int EXTRA_THERMAL_STATE_NORMAL = 0;
    public static final int EXTRA_THERMAL_STATE_WARNING = 1;
    public static final int EXTRA_THERMAL_STATE_EXCEEDED = 2;
    public static final java.lang.String ACTION_DOCK_IDLE = "android.intent.action.DOCK_IDLE";
    public static final java.lang.String ACTION_DOCK_ACTIVE = "android.intent.action.DOCK_ACTIVE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_DEVICE_CUSTOMIZATION_READY = "android.intent.action.DEVICE_CUSTOMIZATION_READY";
    public static final java.lang.String ACTION_VIEW_LOCUS = "android.intent.action.VIEW_LOCUS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_PACKAGE_NEEDS_INTEGRITY_VERIFICATION = "android.intent.action.PACKAGE_NEEDS_INTEGRITY_VERIFICATION";
    public static final java.lang.String ACTION_SHOW_FOREGROUND_SERVICE_MANAGER = "android.intent.action.SHOW_FOREGROUND_SERVICE_MANAGER";
    public static final java.lang.String CATEGORY_DEFAULT = "android.intent.category.DEFAULT";
    public static final java.lang.String CATEGORY_BROWSABLE = "android.intent.category.BROWSABLE";
    public static final java.lang.String CATEGORY_VOICE = "android.intent.category.VOICE";
    public static final java.lang.String CATEGORY_ALTERNATIVE = "android.intent.category.ALTERNATIVE";
    public static final java.lang.String CATEGORY_SELECTED_ALTERNATIVE = "android.intent.category.SELECTED_ALTERNATIVE";
    public static final java.lang.String CATEGORY_TAB = "android.intent.category.TAB";
    public static final java.lang.String CATEGORY_LAUNCHER = "android.intent.category.LAUNCHER";
    public static final java.lang.String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final java.lang.String CATEGORY_CAR_LAUNCHER = "android.intent.category.CAR_LAUNCHER";
    public static final java.lang.String CATEGORY_COMMUNAL_MODE = "android.intent.category.COMMUNAL_MODE";
    @android.annotation.SystemApi
    public static final java.lang.String CATEGORY_LEANBACK_SETTINGS = "android.intent.category.LEANBACK_SETTINGS";
    public static final java.lang.String CATEGORY_INFO = "android.intent.category.INFO";
    public static final java.lang.String CATEGORY_HOME = "android.intent.category.HOME";
    public static final java.lang.String CATEGORY_HOME_MAIN = "android.intent.category.HOME_MAIN";
    public static final java.lang.String CATEGORY_SECONDARY_HOME = "android.intent.category.SECONDARY_HOME";
    public static final java.lang.String CATEGORY_SETUP_WIZARD = "android.intent.category.SETUP_WIZARD";
    public static final java.lang.String CATEGORY_LAUNCHER_APP = "android.intent.category.LAUNCHER_APP";
    public static final java.lang.String CATEGORY_PREFERENCE = "android.intent.category.PREFERENCE";
    public static final java.lang.String CATEGORY_DEVELOPMENT_PREFERENCE = "android.intent.category.DEVELOPMENT_PREFERENCE";
    public static final java.lang.String CATEGORY_EMBED = "android.intent.category.EMBED";
    public static final java.lang.String CATEGORY_APP_MARKET = "android.intent.category.APP_MARKET";
    public static final java.lang.String CATEGORY_MONKEY = "android.intent.category.MONKEY";
    public static final java.lang.String CATEGORY_TEST = "android.intent.category.TEST";
    public static final java.lang.String CATEGORY_UNIT_TEST = "android.intent.category.UNIT_TEST";
    public static final java.lang.String CATEGORY_SAMPLE_CODE = "android.intent.category.SAMPLE_CODE";
    public static final java.lang.String CATEGORY_OPENABLE = "android.intent.category.OPENABLE";
    public static final java.lang.String CATEGORY_TYPED_OPENABLE = "android.intent.category.TYPED_OPENABLE";
    public static final java.lang.String CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST = "android.intent.category.FRAMEWORK_INSTRUMENTATION_TEST";
    public static final java.lang.String CATEGORY_CAR_DOCK = "android.intent.category.CAR_DOCK";
    public static final java.lang.String CATEGORY_DESK_DOCK = "android.intent.category.DESK_DOCK";
    public static final java.lang.String CATEGORY_LE_DESK_DOCK = "android.intent.category.LE_DESK_DOCK";
    public static final java.lang.String CATEGORY_HE_DESK_DOCK = "android.intent.category.HE_DESK_DOCK";
    public static final java.lang.String CATEGORY_CAR_MODE = "android.intent.category.CAR_MODE";
    public static final java.lang.String CATEGORY_VR_HOME = "android.intent.category.VR_HOME";
    public static final java.lang.String CATEGORY_ACCESSIBILITY_SHORTCUT_TARGET = "android.intent.category.ACCESSIBILITY_SHORTCUT_TARGET";
    public static final java.lang.String CATEGORY_APP_BROWSER = "android.intent.category.APP_BROWSER";
    public static final java.lang.String CATEGORY_APP_CALCULATOR = "android.intent.category.APP_CALCULATOR";
    public static final java.lang.String CATEGORY_APP_CALENDAR = "android.intent.category.APP_CALENDAR";
    public static final java.lang.String CATEGORY_APP_CONTACTS = "android.intent.category.APP_CONTACTS";
    public static final java.lang.String CATEGORY_APP_EMAIL = "android.intent.category.APP_EMAIL";
    public static final java.lang.String CATEGORY_APP_GALLERY = "android.intent.category.APP_GALLERY";
    public static final java.lang.String CATEGORY_APP_MAPS = "android.intent.category.APP_MAPS";
    public static final java.lang.String CATEGORY_APP_MESSAGING = "android.intent.category.APP_MESSAGING";
    public static final java.lang.String CATEGORY_APP_MUSIC = "android.intent.category.APP_MUSIC";
    public static final java.lang.String CATEGORY_APP_FILES = "android.intent.category.APP_FILES";
    public static final java.lang.String CATEGORY_APP_WEATHER = "android.intent.category.APP_WEATHER";
    public static final java.lang.String CATEGORY_APP_FITNESS = "android.intent.category.APP_FITNESS";
    public static final java.lang.String EXTRA_TEMPLATE = "android.intent.extra.TEMPLATE";
    public static final java.lang.String EXTRA_TEXT = "android.intent.extra.TEXT";
    public static final java.lang.String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final java.lang.String EXTRA_STREAM = "android.intent.extra.STREAM";
    public static final java.lang.String EXTRA_EMAIL = "android.intent.extra.EMAIL";
    public static final java.lang.String EXTRA_CC = "android.intent.extra.CC";
    public static final java.lang.String EXTRA_BCC = "android.intent.extra.BCC";
    public static final java.lang.String EXTRA_SUBJECT = "android.intent.extra.SUBJECT";
    public static final java.lang.String EXTRA_INTENT = "android.intent.extra.INTENT";
    public static final java.lang.String EXTRA_USER_ID = "android.intent.extra.USER_ID";
    public static final java.lang.String EXTRA_TASK_ID = "android.intent.extra.TASK_ID";
    public static final java.lang.String EXTRA_ATTRIBUTION_TAGS = "android.intent.extra.ATTRIBUTION_TAGS";
    public static final java.lang.String EXTRA_START_TIME = "android.intent.extra.START_TIME";
    public static final java.lang.String EXTRA_END_TIME = "android.intent.extra.END_TIME";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_SHOWING_ATTRIBUTION = "android.intent.extra.SHOWING_ATTRIBUTION";
    public static final java.lang.String EXTRA_ALTERNATE_INTENTS = "android.intent.extra.ALTERNATE_INTENTS";
    public static final java.lang.String EXTRA_EXCLUDE_COMPONENTS = "android.intent.extra.EXCLUDE_COMPONENTS";
    public static final java.lang.String EXTRA_CHOOSER_TARGETS = "android.intent.extra.CHOOSER_TARGETS";
    public static final java.lang.String EXTRA_CHOOSER_REFINEMENT_INTENT_SENDER = "android.intent.extra.CHOOSER_REFINEMENT_INTENT_SENDER";
    public static final java.lang.String EXTRA_CHOOSER_CUSTOM_ACTIONS = "android.intent.extra.CHOOSER_CUSTOM_ACTIONS";
    public static final java.lang.String EXTRA_CHOOSER_MODIFY_SHARE_ACTION = "android.intent.extra.CHOOSER_MODIFY_SHARE_ACTION";
    public static final java.lang.String EXTRA_CONTENT_ANNOTATIONS = "android.intent.extra.CONTENT_ANNOTATIONS";
    public static final java.lang.String EXTRA_RESULT_RECEIVER = "android.intent.extra.RESULT_RECEIVER";
    public static final java.lang.String EXTRA_TITLE = "android.intent.extra.TITLE";
    public static final java.lang.String EXTRA_INITIAL_INTENTS = "android.intent.extra.INITIAL_INTENTS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_INSTANT_APP_SUCCESS = "android.intent.extra.INSTANT_APP_SUCCESS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_INSTANT_APP_FAILURE = "android.intent.extra.INSTANT_APP_FAILURE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_INSTANT_APP_HOSTNAME = "android.intent.extra.INSTANT_APP_HOSTNAME";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_INSTANT_APP_TOKEN = "android.intent.extra.INSTANT_APP_TOKEN";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_INSTANT_APP_ACTION = "android.intent.extra.INSTANT_APP_ACTION";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_INSTANT_APP_BUNDLES = "android.intent.extra.INSTANT_APP_BUNDLES";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_INSTANT_APP_EXTRAS = "android.intent.extra.INSTANT_APP_EXTRAS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_UNKNOWN_INSTANT_APP = "android.intent.extra.UNKNOWN_INSTANT_APP";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_VERSION_CODE = "android.intent.extra.VERSION_CODE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_LONG_VERSION_CODE = "android.intent.extra.LONG_VERSION_CODE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CALLING_PACKAGE = "android.intent.extra.CALLING_PACKAGE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_VERIFICATION_BUNDLE = "android.intent.extra.VERIFICATION_BUNDLE";
    public static final java.lang.String EXTRA_REPLACEMENT_EXTRAS = "android.intent.extra.REPLACEMENT_EXTRAS";
    public static final java.lang.String EXTRA_CHOSEN_COMPONENT_INTENT_SENDER = "android.intent.extra.CHOSEN_COMPONENT_INTENT_SENDER";
    public static final java.lang.String EXTRA_CHOSEN_COMPONENT = "android.intent.extra.CHOSEN_COMPONENT";
    public static final java.lang.String EXTRA_KEY_EVENT = "android.intent.extra.KEY_EVENT";
    public static final java.lang.String EXTRA_KEY_CONFIRM = "android.intent.extra.KEY_CONFIRM";
    public static final java.lang.String EXTRA_USER_REQUESTED_SHUTDOWN = "android.intent.extra.USER_REQUESTED_SHUTDOWN";
    public static final java.lang.String EXTRA_DONT_KILL_APP = "android.intent.extra.DONT_KILL_APP";
    public static final java.lang.String EXTRA_USER_INITIATED = "android.intent.extra.USER_INITIATED";
    public static final java.lang.String EXTRA_PHONE_NUMBER = "android.intent.extra.PHONE_NUMBER";
    public static final java.lang.String EXTRA_UID = "android.intent.extra.UID";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PACKAGES = "android.intent.extra.PACKAGES";
    public static final java.lang.String EXTRA_DATA_REMOVED = "android.intent.extra.DATA_REMOVED";
    public static final java.lang.String EXTRA_REMOVED_FOR_ALL_USERS = "android.intent.extra.REMOVED_FOR_ALL_USERS";
    public static final java.lang.String EXTRA_REPLACING = "android.intent.extra.REPLACING";
    public static final java.lang.String EXTRA_ALARM_COUNT = "android.intent.extra.ALARM_COUNT";
    public static final java.lang.String EXTRA_DOCK_STATE = "android.intent.extra.DOCK_STATE";
    public static final int EXTRA_DOCK_STATE_UNDOCKED = 0;
    public static final int EXTRA_DOCK_STATE_DESK = 1;
    public static final int EXTRA_DOCK_STATE_CAR = 2;
    public static final int EXTRA_DOCK_STATE_LE_DESK = 3;
    public static final int EXTRA_DOCK_STATE_HE_DESK = 4;
    public static final java.lang.String METADATA_DOCK_HOME = "android.dock_home";
    public static final java.lang.String EXTRA_BUG_REPORT = "android.intent.extra.BUG_REPORT";
    public static final java.lang.String EXTRA_REMOTE_INTENT_TOKEN = "android.intent.extra.remote_intent_token";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_CHANGED_COMPONENT_NAME = "android.intent.extra.changed_component_name";
    public static final java.lang.String EXTRA_CHANGED_COMPONENT_NAME_LIST = "android.intent.extra.changed_component_name_list";
    public static final java.lang.String EXTRA_CHANGED_PACKAGE_LIST = "android.intent.extra.changed_package_list";
    public static final java.lang.String EXTRA_CHANGED_UID_LIST = "android.intent.extra.changed_uid_list";
    public static final java.lang.String EXTRA_DISTRACTION_RESTRICTIONS = "android.intent.extra.distraction_restrictions";
    public static final java.lang.String EXTRA_CLIENT_LABEL = "android.intent.extra.client_label";
    public static final java.lang.String EXTRA_CLIENT_INTENT = "android.intent.extra.client_intent";
    public static final java.lang.String EXTRA_LOCAL_ONLY = "android.intent.extra.LOCAL_ONLY";
    public static final java.lang.String EXTRA_ALLOW_MULTIPLE = "android.intent.extra.ALLOW_MULTIPLE";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String EXTRA_USER_HANDLE = "android.intent.extra.user_handle";
    public static final java.lang.String EXTRA_USER = "android.intent.extra.USER";
    public static final java.lang.String EXTRA_RESTRICTIONS_LIST = "android.intent.extra.restrictions_list";
    public static final java.lang.String EXTRA_RESTRICTIONS_BUNDLE = "android.intent.extra.restrictions_bundle";
    public static final java.lang.String EXTRA_RESTRICTIONS_INTENT = "android.intent.extra.restrictions_intent";
    public static final java.lang.String EXTRA_MIME_TYPES = "android.intent.extra.MIME_TYPES";
    public static final java.lang.String EXTRA_SHUTDOWN_USERSPACE_ONLY = "android.intent.extra.SHUTDOWN_USERSPACE_ONLY";
    public static final java.lang.String EXTRA_TIME = "android.intent.extra.TIME";
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String EXTRA_TIMEZONE = "time-zone";
    public static final java.lang.String EXTRA_TIME_PREF_24_HOUR_FORMAT = "android.intent.extra.TIME_PREF_24_HOUR_FORMAT";
    public static final int EXTRA_TIME_PREF_VALUE_USE_12_HOUR = 0;
    public static final int EXTRA_TIME_PREF_VALUE_USE_24_HOUR = 1;
    public static final int EXTRA_TIME_PREF_VALUE_USE_LOCALE_DEFAULT = 2;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_REASON = "android.intent.extra.REASON";
    public static final java.lang.String EXTRA_WIPE_EXTERNAL_STORAGE = "android.intent.extra.WIPE_EXTERNAL_STORAGE";
    public static final java.lang.String EXTRA_WIPE_ESIMS = "com.android.internal.intent.extra.WIPE_ESIMS";
    public static final java.lang.String EXTRA_SIM_ACTIVATION_RESPONSE = "android.intent.extra.SIM_ACTIVATION_RESPONSE";
    public static final java.lang.String EXTRA_INDEX = "android.intent.extra.INDEX";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_QUICK_VIEW_ADVANCED = "android.intent.extra.QUICK_VIEW_ADVANCED";
    public static final java.lang.String EXTRA_QUICK_VIEW_FEATURES = "android.intent.extra.QUICK_VIEW_FEATURES";
    public static final java.lang.String EXTRA_QUIET_MODE = "android.intent.extra.QUIET_MODE";
    public static final java.lang.String EXTRA_CONTENT_QUERY = "android.intent.extra.CONTENT_QUERY";
    public static final java.lang.String EXTRA_MEDIA_RESOURCE_TYPE = "android.intent.extra.MEDIA_RESOURCE_TYPE";
    public static final java.lang.String EXTRA_AUTO_LAUNCH_SINGLE_CHOICE = "android.intent.extra.AUTO_LAUNCH_SINGLE_CHOICE";
    public static final int EXTRA_MEDIA_RESOURCE_TYPE_VIDEO_CODEC = 0;
    public static final int EXTRA_MEDIA_RESOURCE_TYPE_AUDIO_CODEC = 1;
    public static final java.lang.String EXTRA_LOCUS_ID = "android.intent.extra.LOCUS_ID";
    public static final java.lang.String EXTRA_VISIBILITY_ALLOW_LIST = "android.intent.extra.VISIBILITY_ALLOW_LIST";
    public static final int FLAG_GRANT_READ_URI_PERMISSION = 1;
    public static final int FLAG_GRANT_WRITE_URI_PERMISSION = 2;
    public static final int FLAG_FROM_BACKGROUND = 4;
    public static final int FLAG_DEBUG_LOG_RESOLUTION = 8;
    public static final int FLAG_EXCLUDE_STOPPED_PACKAGES = 16;
    public static final int FLAG_INCLUDE_STOPPED_PACKAGES = 32;
    public static final int FLAG_GRANT_PERSISTABLE_URI_PERMISSION = 64;
    public static final int FLAG_GRANT_PREFIX_URI_PERMISSION = 128;
    public static final int FLAG_DIRECT_BOOT_AUTO = 256;
    @java.lang.Deprecated
    public static final int FLAG_DEBUG_TRIAGED_MISSING = 256;
    public static final int FLAG_IGNORE_EPHEMERAL = 512;
    public static final int FLAG_ACTIVITY_NO_HISTORY = 1073741824;
    public static final int FLAG_ACTIVITY_SINGLE_TOP = 536870912;
    public static final int FLAG_ACTIVITY_NEW_TASK = 268435456;
    public static final int FLAG_ACTIVITY_MULTIPLE_TASK = 134217728;
    public static final int FLAG_ACTIVITY_CLEAR_TOP = 67108864;
    public static final int FLAG_ACTIVITY_FORWARD_RESULT = 33554432;
    public static final int FLAG_ACTIVITY_PREVIOUS_IS_TOP = 16777216;
    public static final int FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS = 8388608;
    public static final int FLAG_ACTIVITY_BROUGHT_TO_FRONT = 4194304;
    public static final int FLAG_ACTIVITY_RESET_TASK_IF_NEEDED = 2097152;
    public static final int FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY = 1048576;
    @java.lang.Deprecated
    public static final int FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET = 524288;
    public static final int FLAG_ACTIVITY_NEW_DOCUMENT = 524288;
    public static final int FLAG_ACTIVITY_NO_USER_ACTION = 262144;
    public static final int FLAG_ACTIVITY_REORDER_TO_FRONT = 131072;
    public static final int FLAG_ACTIVITY_NO_ANIMATION = 65536;
    public static final int FLAG_ACTIVITY_CLEAR_TASK = 32768;
    public static final int FLAG_ACTIVITY_TASK_ON_HOME = 16384;
    public static final int FLAG_ACTIVITY_RETAIN_IN_RECENTS = 8192;
    public static final int FLAG_ACTIVITY_LAUNCH_ADJACENT = 4096;
    public static final int FLAG_ACTIVITY_MATCH_EXTERNAL = 2048;
    public static final int FLAG_ACTIVITY_REQUIRE_NON_BROWSER = 1024;
    public static final int FLAG_ACTIVITY_REQUIRE_DEFAULT = 512;
    public static final int FLAG_RECEIVER_REGISTERED_ONLY = 1073741824;
    public static final int FLAG_RECEIVER_REPLACE_PENDING = 536870912;
    public static final int FLAG_RECEIVER_FOREGROUND = 268435456;
    public static final int FLAG_RECEIVER_OFFLOAD = -2147483648;
    public static final int FLAG_RECEIVER_OFFLOAD_FOREGROUND = 2048;
    public static final int FLAG_RECEIVER_NO_ABORT = 134217728;
    @android.annotation.SystemApi
    public static final int FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT = 67108864;
    public static final int FLAG_RECEIVER_BOOT_UPGRADE = 33554432;
    @android.annotation.SystemApi
    public static final int FLAG_RECEIVER_INCLUDE_BACKGROUND = 16777216;
    public static final int FLAG_RECEIVER_EXCLUDE_BACKGROUND = 8388608;
    public static final int FLAG_RECEIVER_FROM_SHELL = 4194304;
    public static final int FLAG_RECEIVER_VISIBLE_TO_INSTANT_APPS = 2097152;
    public static final int IMMUTABLE_FLAGS = 195;
    public static final int URI_INTENT_SCHEME = 1;
    public static final int URI_ANDROID_APP_SCHEME = 2;
    public static final int URI_ALLOW_UNSAFE = 4;
    public static final int FILL_IN_ACTION = 1;
    public static final int FILL_IN_DATA = 2;
    public static final int FILL_IN_CATEGORIES = 4;
    public static final int FILL_IN_COMPONENT = 8;
    public static final int FILL_IN_PACKAGE = 16;
    public static final int FILL_IN_SOURCE_BOUNDS = 32;
    public static final int FILL_IN_SELECTOR = 64;
    public static final int FILL_IN_CLIP_DATA = 128;
    public static final int FILL_IN_IDENTIFIER = 256;
    public static final android.os.Parcelable.Creator<android.content.Intent> CREATOR = null;
    public static android.content.Intent createChooser(android.content.Intent p0, java.lang.CharSequence p1) { return null; }
    public static android.content.Intent createChooser(android.content.Intent p0, java.lang.CharSequence p1, android.content.IntentSender p2) { return null; }
    public static boolean isAccessUriMode(int p0) { return false; }
    public Intent() {}
    public Intent(android.content.Intent p0) {}
    public java.lang.Object clone() { return null; }
    public android.content.Intent cloneFilter() { return null; }
    public Intent(java.lang.String p0) {}
    public Intent(java.lang.String p0, android.net.Uri p1) {}
    public Intent(android.content.Context p0, java.lang.Class<?> p1) {}
    public Intent(java.lang.String p0, android.net.Uri p1, android.content.Context p2, java.lang.Class<?> p3) {}
    public static android.content.Intent makeMainActivity(android.content.ComponentName p0) { return null; }
    public static android.content.Intent makeMainSelectorActivity(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.content.Intent makeRestartActivityTask(android.content.ComponentName p0) { return null; }
    @java.lang.Deprecated
    public static android.content.Intent getIntent(java.lang.String p0) throws java.net.URISyntaxException { return null; }
    public static android.content.Intent parseUri(java.lang.String p0, int p1) throws java.net.URISyntaxException { return null; }
    public static android.content.Intent getIntentOld(java.lang.String p0) throws java.net.URISyntaxException { return null; }
    public static android.content.Intent parseCommandArgs(android.os.ShellCommand p0, android.content.Intent.CommandOptionHandler p1) throws java.net.URISyntaxException { return null; }
    public static void printIntentArgsHelp(java.io.PrintWriter p0, java.lang.String p1) {}
    public java.lang.String getAction() { return null; }
    public android.net.Uri getData() { return null; }
    public java.lang.String getDataString() { return null; }
    public java.lang.String getScheme() { return null; }
    public java.lang.String getType() { return null; }
    public android.content.Intent getOriginalIntent() { return null; }
    public void setOriginalIntent(android.content.Intent p0) {}
    public java.lang.String resolveType(android.content.Context p0) { return null; }
    public java.lang.String resolveType(android.content.ContentResolver p0) { return null; }
    public java.lang.String resolveTypeIfNeeded(android.content.ContentResolver p0) { return null; }
    public java.lang.String getIdentifier() { return null; }
    public boolean hasCategory(java.lang.String p0) { return false; }
    public java.util.Set<java.lang.String> getCategories() { return null; }
    public android.content.Intent getSelector() { return null; }
    public android.content.ClipData getClipData() { return null; }
    public int getContentUserHint() { return 0; }
    public java.lang.String getLaunchToken() { return null; }
    public void setLaunchToken(java.lang.String p0) {}
    public void setExtrasClassLoader(java.lang.ClassLoader p0) {}
    public boolean hasExtra(java.lang.String p0) { return false; }
    public boolean hasFileDescriptors() { return false; }
    public void setAllowFds(boolean p0) {}
    public void setDefusable(boolean p0) {}
    @java.lang.Deprecated
    public java.lang.Object getExtra(java.lang.String p0) { return null; }
    public boolean getBooleanExtra(java.lang.String p0, boolean p1) { return false; }
    public byte getByteExtra(java.lang.String p0, byte p1) { return 0; }
    public short getShortExtra(java.lang.String p0, short p1) { return 0; }
    public char getCharExtra(java.lang.String p0, char p1) { return 0; }
    public int getIntExtra(java.lang.String p0, int p1) { return 0; }
    public long getLongExtra(java.lang.String p0, long p1) { return 0L; }
    public float getFloatExtra(java.lang.String p0, float p1) { return 0.0f; }
    public double getDoubleExtra(java.lang.String p0, double p1) { return 0.0; }
    public java.lang.String getStringExtra(java.lang.String p0) { return null; }
    public java.lang.CharSequence getCharSequenceExtra(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public <T extends android.os.Parcelable> T getParcelableExtra(java.lang.String p0) { return null; }
    public <T extends java.lang.Object> T getParcelableExtra(java.lang.String p0, java.lang.Class<T> p1) { return null; }
    @java.lang.Deprecated
    public android.os.Parcelable[] getParcelableArrayExtra(java.lang.String p0) { return null; }
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection"})
    public <T extends java.lang.Object> T[] getParcelableArrayExtra(java.lang.String p0, java.lang.Class<T> p1) { return null; }
    @java.lang.Deprecated
    public <T extends android.os.Parcelable> java.util.ArrayList<T> getParcelableArrayListExtra(java.lang.String p0) { return null; }
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public <T extends java.lang.Object> java.util.ArrayList<T> getParcelableArrayListExtra(java.lang.String p0, java.lang.Class<? extends T> p1) { return null; }
    public java.io.Serializable getSerializableExtra(java.lang.String p0) { return null; }
    public <T extends java.io.Serializable> T getSerializableExtra(java.lang.String p0, java.lang.Class<T> p1) { return null; }
    public java.util.ArrayList<java.lang.Integer> getIntegerArrayListExtra(java.lang.String p0) { return null; }
    public java.util.ArrayList<java.lang.String> getStringArrayListExtra(java.lang.String p0) { return null; }
    public java.util.ArrayList<java.lang.CharSequence> getCharSequenceArrayListExtra(java.lang.String p0) { return null; }
    public boolean[] getBooleanArrayExtra(java.lang.String p0) { return null; }
    public byte[] getByteArrayExtra(java.lang.String p0) { return null; }
    public short[] getShortArrayExtra(java.lang.String p0) { return null; }
    public char[] getCharArrayExtra(java.lang.String p0) { return null; }
    public int[] getIntArrayExtra(java.lang.String p0) { return null; }
    public long[] getLongArrayExtra(java.lang.String p0) { return null; }
    public float[] getFloatArrayExtra(java.lang.String p0) { return null; }
    public double[] getDoubleArrayExtra(java.lang.String p0) { return null; }
    public java.lang.String[] getStringArrayExtra(java.lang.String p0) { return null; }
    public java.lang.CharSequence[] getCharSequenceArrayExtra(java.lang.String p0) { return null; }
    public android.os.Bundle getBundleExtra(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public android.os.IBinder getIBinderExtra(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public java.lang.Object getExtra(java.lang.String p0, java.lang.Object p1) { return null; }
    public android.os.Bundle getExtras() { return null; }
    public int getExtrasTotalSize() { return 0; }
    public boolean canStripForHistory() { return false; }
    public android.content.Intent maybeStripForHistory() { return null; }
    public int getFlags() { return 0; }
    public boolean isExcludingStopped() { return false; }
    public java.lang.String getPackage() { return null; }
    public android.content.ComponentName getComponent() { return null; }
    public android.graphics.Rect getSourceBounds() { return null; }
    public android.content.ComponentName resolveActivity(android.content.pm.PackageManager p0) { return null; }
    public android.content.pm.ActivityInfo resolveActivityInfo(android.content.pm.PackageManager p0, int p1) { return null; }
    public android.content.ComponentName resolveSystemService(android.content.pm.PackageManager p0, int p1) { return null; }
    public android.content.Intent setAction(java.lang.String p0) { return null; }
    public android.content.Intent setData(android.net.Uri p0) { return null; }
    public android.content.Intent setDataAndNormalize(android.net.Uri p0) { return null; }
    public android.content.Intent setType(java.lang.String p0) { return null; }
    public android.content.Intent setTypeAndNormalize(java.lang.String p0) { return null; }
    public android.content.Intent setDataAndType(android.net.Uri p0, java.lang.String p1) { return null; }
    public android.content.Intent setDataAndTypeAndNormalize(android.net.Uri p0, java.lang.String p1) { return null; }
    public android.content.Intent setIdentifier(java.lang.String p0) { return null; }
    public android.content.Intent addCategory(java.lang.String p0) { return null; }
    public void removeCategory(java.lang.String p0) {}
    public void setSelector(android.content.Intent p0) {}
    public void setClipData(android.content.ClipData p0) {}
    public void prepareToLeaveUser(int p0) {}
    public android.content.Intent putExtra(java.lang.String p0, boolean p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, byte p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, char p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, short p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, int p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, long p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, float p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, double p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, java.lang.String p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, java.lang.CharSequence p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, android.os.Parcelable p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, android.os.Parcelable[] p1) { return null; }
    public android.content.Intent putParcelableArrayListExtra(java.lang.String p0, java.util.ArrayList<? extends android.os.Parcelable> p1) { return null; }
    public android.content.Intent putIntegerArrayListExtra(java.lang.String p0, java.util.ArrayList<java.lang.Integer> p1) { return null; }
    public android.content.Intent putStringArrayListExtra(java.lang.String p0, java.util.ArrayList<java.lang.String> p1) { return null; }
    public android.content.Intent putCharSequenceArrayListExtra(java.lang.String p0, java.util.ArrayList<java.lang.CharSequence> p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, java.io.Serializable p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, boolean[] p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, byte[] p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, short[] p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, char[] p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, int[] p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, long[] p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, float[] p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, double[] p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, java.lang.String[] p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, java.lang.CharSequence[] p1) { return null; }
    public android.content.Intent putExtra(java.lang.String p0, android.os.Bundle p1) { return null; }
    @java.lang.Deprecated
    public android.content.Intent putExtra(java.lang.String p0, android.os.IBinder p1) { return null; }
    public android.content.Intent putExtras(android.content.Intent p0) { return null; }
    public android.content.Intent putExtras(android.os.Bundle p0) { return null; }
    public android.content.Intent replaceExtras(android.content.Intent p0) { return null; }
    public android.content.Intent replaceExtras(android.os.Bundle p0) { return null; }
    public void removeExtra(java.lang.String p0) {}
    public android.content.Intent setFlags(int p0) { return null; }
    public android.content.Intent addFlags(int p0) { return null; }
    public void removeFlags(int p0) {}
    public android.content.Intent setPackage(java.lang.String p0) { return null; }
    public android.content.Intent setComponent(android.content.ComponentName p0) { return null; }
    public android.content.Intent setClassName(android.content.Context p0, java.lang.String p1) { return null; }
    public android.content.Intent setClassName(java.lang.String p0, java.lang.String p1) { return null; }
    public android.content.Intent setClass(android.content.Context p0, java.lang.Class<?> p1) { return null; }
    public void setSourceBounds(android.graphics.Rect p0) {}
    public int fillIn(android.content.Intent p0, int p1) { return 0; }
    public boolean filterEquals(android.content.Intent p0) { return false; }
    public int filterHashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public java.lang.String toInsecureString() { return null; }
    public java.lang.String toShortString(boolean p0, boolean p1, boolean p2, boolean p3) { return null; }
    public void toShortString(java.lang.StringBuilder p0, boolean p1, boolean p2, boolean p3, boolean p4) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, boolean p2, boolean p3, boolean p4, boolean p5) {}
    @java.lang.Deprecated
    public java.lang.String toURI() { return null; }
    public java.lang.String toUri(int p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected Intent(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public static android.content.Intent parseIntent(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public void saveToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    public static android.content.Intent restoreFromXml(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public static java.lang.String normalizeMimeType(java.lang.String p0) { return null; }
    public void prepareToLeaveProcess(android.content.Context p0) {}
    public void prepareToLeaveProcess(boolean p0) {}
    public void prepareToEnterProcess(boolean p0, android.content.AttributionSource p1) {}
    public boolean hasWebURI() { return false; }
    public boolean isWebIntent() { return false; }
    public boolean isImplicitImageCaptureIntent() { return false; }
    public void fixUris(int p0) {}
    public boolean migrateExtraStreamToClipData() { return false; }
    public boolean migrateExtraStreamToClipData(android.content.Context p0) { return false; }
    public static java.lang.String dockStateToString(int p0) { return null; }
    public boolean isDocument() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AccessUriMode {
    }

    public static interface CommandOptionHandler {
        public boolean handleOption(java.lang.String p0, android.os.ShellCommand p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CopyMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FillInFlags {
    }

    public static final class FilterComparison {
        public FilterComparison(android.content.Intent p0) {}
        public android.content.Intent getIntent() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GrantUriMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MutableFlags {
    }

    public static class ShortcutIconResource implements android.os.Parcelable {
        public java.lang.String packageName;
        public java.lang.String resourceName;
        public static final android.os.Parcelable.Creator<android.content.Intent.ShortcutIconResource> CREATOR = null;
        public ShortcutIconResource() {}
        public static android.content.Intent.ShortcutIconResource fromContext(android.content.Context p0, int p1) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UriFlags {
    }
}
