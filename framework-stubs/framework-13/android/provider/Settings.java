package android.provider;

public final class Settings {
    public static final boolean DEFAULT_OVERRIDEABLE_BY_RESTORE = false;
    public static final java.lang.String ACTION_SETTINGS = "android.settings.SETTINGS";
    public static final java.lang.String ACTION_APN_SETTINGS = "android.settings.APN_SETTINGS";
    public static final java.lang.String ACTION_LOCATION_SOURCE_SETTINGS = "android.settings.LOCATION_SOURCE_SETTINGS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_LOCATION_CONTROLLER_EXTRA_PACKAGE_SETTINGS = "android.settings.LOCATION_CONTROLLER_EXTRA_PACKAGE_SETTINGS";
    public static final java.lang.String ACTION_LOCATION_SCANNING_SETTINGS = "android.settings.LOCATION_SCANNING_SETTINGS";
    public static final java.lang.String ACTION_USER_SETTINGS = "android.settings.USER_SETTINGS";
    public static final java.lang.String ACTION_WIRELESS_SETTINGS = "android.settings.WIRELESS_SETTINGS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_TETHER_PROVISIONING_UI = "android.settings.TETHER_PROVISIONING_UI";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_TETHER_UNSUPPORTED_CARRIER_UI = "android.settings.TETHER_UNSUPPORTED_CARRIER_UI";
    public static final java.lang.String ACTION_AIRPLANE_MODE_SETTINGS = "android.settings.AIRPLANE_MODE_SETTINGS";
    public static final java.lang.String ACTION_MOBILE_DATA_USAGE = "android.settings.MOBILE_DATA_USAGE";
    public static final java.lang.String EXTRA_NETWORK_TEMPLATE = "network_template";
    public static final java.lang.String ACTION_ONE_HANDED_SETTINGS = "android.settings.action.ONE_HANDED_SETTINGS";
    public static final int SET_ALL_RESULT_FAILURE = 0;
    public static final int SET_ALL_RESULT_SUCCESS = 1;
    public static final int SET_ALL_RESULT_DISABLED = 2;
    public static final java.lang.String KEY_CONFIG_SET_ALL_RETURN = "config_set_all_return";
    public static final java.lang.String KEY_CONFIG_GET_SYNC_DISABLED_MODE_RETURN = "config_get_sync_disabled_mode_return";
    public static final java.lang.String EXTRA_SUB_ID = "android.provider.extra.SUB_ID";
    public static final java.lang.String ACTION_VOICE_CONTROL_AIRPLANE_MODE = "android.settings.VOICE_CONTROL_AIRPLANE_MODE";
    public static final java.lang.String ACTION_ACCESSIBILITY_SETTINGS = "android.settings.ACCESSIBILITY_SETTINGS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_ACCESSIBILITY_DETAILS_SETTINGS = "android.settings.ACCESSIBILITY_DETAILS_SETTINGS";
    public static final java.lang.String ACTION_REDUCE_BRIGHT_COLORS_SETTINGS = "android.settings.REDUCE_BRIGHT_COLORS_SETTINGS";
    public static final java.lang.String ACTION_COLOR_CORRECTION_SETTINGS = "com.android.settings.ACCESSIBILITY_COLOR_SPACE_SETTINGS";
    public static final java.lang.String ACTION_COLOR_INVERSION_SETTINGS = "android.settings.COLOR_INVERSION_SETTINGS";
    public static final java.lang.String ACTION_USAGE_ACCESS_SETTINGS = "android.settings.USAGE_ACCESS_SETTINGS";
    public static final java.lang.String INTENT_CATEGORY_USAGE_ACCESS_CONFIG = "android.intent.category.USAGE_ACCESS_CONFIG";
    public static final java.lang.String METADATA_USAGE_ACCESS_REASON = "android.settings.metadata.USAGE_ACCESS_REASON";
    public static final java.lang.String ACTION_SECURITY_SETTINGS = "android.settings.SECURITY_SETTINGS";
    public static final java.lang.String ACTION_MANAGE_UNKNOWN_APP_SOURCES = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
    public static final java.lang.String ACTION_REQUEST_SCHEDULE_EXACT_ALARM = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM";
    public static final java.lang.String ACTION_REQUEST_MANAGE_MEDIA = "android.settings.REQUEST_MANAGE_MEDIA";
    public static final java.lang.String ACTION_MANAGE_CROSS_PROFILE_ACCESS = "android.settings.MANAGE_CROSS_PROFILE_ACCESS";
    public static final java.lang.String ACTION_APP_OPEN_BY_DEFAULT_SETTINGS = "android.settings.APP_OPEN_BY_DEFAULT_SETTINGS";
    public static final java.lang.String ACTION_TRUSTED_CREDENTIALS_USER = "com.android.settings.TRUSTED_CREDENTIALS_USER";
    public static final java.lang.String ACTION_MONITORING_CERT_INFO = "com.android.settings.MONITORING_CERT_INFO";
    public static final java.lang.String ACTION_PRIVACY_SETTINGS = "android.settings.PRIVACY_SETTINGS";
    public static final java.lang.String ACTION_VPN_SETTINGS = "android.settings.VPN_SETTINGS";
    public static final java.lang.String ACTION_WIFI_SETTINGS = "android.settings.WIFI_SETTINGS";
    public static final java.lang.String ACTION_WIFI_IP_SETTINGS = "android.settings.WIFI_IP_SETTINGS";
    public static final java.lang.String ACTION_PROCESS_WIFI_EASY_CONNECT_URI = "android.settings.PROCESS_WIFI_EASY_CONNECT_URI";
    public static final java.lang.String EXTRA_EASY_CONNECT_ERROR_CODE = "android.provider.extra.EASY_CONNECT_ERROR_CODE";
    public static final java.lang.String EXTRA_EASY_CONNECT_ATTEMPTED_SSID = "android.provider.extra.EASY_CONNECT_ATTEMPTED_SSID";
    public static final java.lang.String EXTRA_EASY_CONNECT_CHANNEL_LIST = "android.provider.extra.EASY_CONNECT_CHANNEL_LIST";
    public static final java.lang.String EXTRA_EASY_CONNECT_BAND_LIST = "android.provider.extra.EASY_CONNECT_BAND_LIST";
    public static final java.lang.String ACTION_DATA_USAGE_SETTINGS = "android.settings.DATA_USAGE_SETTINGS";
    public static final java.lang.String ACTION_BLUETOOTH_SETTINGS = "android.settings.BLUETOOTH_SETTINGS";
    public static final java.lang.String ACTION_APP_SEARCH_SETTINGS = "android.settings.APP_SEARCH_SETTINGS";
    public static final java.lang.String ACTION_ASSIST_GESTURE_SETTINGS = "android.settings.ASSIST_GESTURE_SETTINGS";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_FINGERPRINT_ENROLL = "android.settings.FINGERPRINT_ENROLL";
    public static final java.lang.String ACTION_BIOMETRIC_ENROLL = "android.settings.BIOMETRIC_ENROLL";
    public static final java.lang.String EXTRA_BIOMETRIC_AUTHENTICATORS_ALLOWED = "android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED";
    public static final java.lang.String ACTION_CAST_SETTINGS = "android.settings.CAST_SETTINGS";
    public static final java.lang.String ACTION_DATE_SETTINGS = "android.settings.DATE_SETTINGS";
    public static final java.lang.String ACTION_SOUND_SETTINGS = "android.settings.SOUND_SETTINGS";
    public static final java.lang.String ACTION_DISPLAY_SETTINGS = "android.settings.DISPLAY_SETTINGS";
    public static final java.lang.String ACTION_AUTO_ROTATE_SETTINGS = "android.settings.AUTO_ROTATE_SETTINGS";
    public static final java.lang.String ACTION_NIGHT_DISPLAY_SETTINGS = "android.settings.NIGHT_DISPLAY_SETTINGS";
    public static final java.lang.String ACTION_DARK_THEME_SETTINGS = "android.settings.DARK_THEME_SETTINGS";
    public static final java.lang.String ACTION_LOCALE_SETTINGS = "android.settings.LOCALE_SETTINGS";
    public static final java.lang.String ACTION_APP_LOCALE_SETTINGS = "android.settings.APP_LOCALE_SETTINGS";
    public static final java.lang.String ACTION_LOCKSCREEN_SETTINGS = "android.settings.LOCK_SCREEN_SETTINGS";
    public static final java.lang.String ACTION_BLUETOOTH_PAIRING_SETTINGS = "android.settings.BLUETOOTH_PAIRING_SETTINGS";
    public static final java.lang.String ACTION_VOICE_INPUT_SETTINGS = "android.settings.VOICE_INPUT_SETTINGS";
    public static final java.lang.String ACTION_INPUT_METHOD_SETTINGS = "android.settings.INPUT_METHOD_SETTINGS";
    public static final java.lang.String ACTION_INPUT_METHOD_SUBTYPE_SETTINGS = "android.settings.INPUT_METHOD_SUBTYPE_SETTINGS";
    public static final java.lang.String ACTION_USER_DICTIONARY_SETTINGS = "android.settings.USER_DICTIONARY_SETTINGS";
    public static final java.lang.String ACTION_HARD_KEYBOARD_SETTINGS = "android.settings.HARD_KEYBOARD_SETTINGS";
    public static final java.lang.String ACTION_USER_DICTIONARY_INSERT = "com.android.settings.USER_DICTIONARY_INSERT";
    public static final java.lang.String ACTION_APPLICATION_SETTINGS = "android.settings.APPLICATION_SETTINGS";
    public static final java.lang.String ACTION_APPLICATION_DEVELOPMENT_SETTINGS = "android.settings.APPLICATION_DEVELOPMENT_SETTINGS";
    public static final java.lang.String ACTION_QUICK_LAUNCH_SETTINGS = "android.settings.QUICK_LAUNCH_SETTINGS";
    public static final java.lang.String ACTION_MANAGE_APPLICATIONS_SETTINGS = "android.settings.MANAGE_APPLICATIONS_SETTINGS";
    public static final java.lang.String ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS = "android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS";
    public static final java.lang.String ACTION_MANAGE_ALL_SIM_PROFILES_SETTINGS = "android.settings.MANAGE_ALL_SIM_PROFILES_SETTINGS";
    public static final java.lang.String ACTION_MANAGE_OVERLAY_PERMISSION = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_MANAGE_APP_OVERLAY_PERMISSION = "android.settings.MANAGE_APP_OVERLAY_PERMISSION";
    public static final java.lang.String ACTION_MANAGE_WRITE_SETTINGS = "android.settings.action.MANAGE_WRITE_SETTINGS";
    public static final java.lang.String ACTION_APP_USAGE_SETTINGS = "android.settings.action.APP_USAGE_SETTINGS";
    public static final java.lang.String ACTION_APPLICATION_DETAILS_SETTINGS = "android.settings.APPLICATION_DETAILS_SETTINGS";
    public static final java.lang.String ACTION_FOREGROUND_SERVICES_SETTINGS = "android.settings.FOREGROUND_SERVICES_SETTINGS";
    public static final java.lang.String ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS = "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS";
    public static final java.lang.String ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
    public static final java.lang.String ACTION_VIEW_ADVANCED_POWER_USAGE_DETAIL = "android.settings.VIEW_ADVANCED_POWER_USAGE_DETAIL";
    public static final java.lang.String ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS = "android.settings.IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS";
    public static final java.lang.String ACTION_APP_OPS_SETTINGS = "android.settings.APP_OPS_SETTINGS";
    public static final java.lang.String ACTION_SYSTEM_UPDATE_SETTINGS = "android.settings.SYSTEM_UPDATE_SETTINGS";
    public static final java.lang.String ACTION_MANAGED_PROFILE_SETTINGS = "android.settings.MANAGED_PROFILE_SETTINGS";
    public static final java.lang.String ACTION_SYNC_SETTINGS = "android.settings.SYNC_SETTINGS";
    public static final java.lang.String ACTION_ADD_ACCOUNT = "android.settings.ADD_ACCOUNT_SETTINGS";
    public static final java.lang.String ACTION_DATA_SAVER_SETTINGS = "android.settings.DATA_SAVER_SETTINGS";
    public static final java.lang.String ACTION_NETWORK_OPERATOR_SETTINGS = "android.settings.NETWORK_OPERATOR_SETTINGS";
    public static final java.lang.String ACTION_DATA_ROAMING_SETTINGS = "android.settings.DATA_ROAMING_SETTINGS";
    public static final java.lang.String ACTION_INTERNAL_STORAGE_SETTINGS = "android.settings.INTERNAL_STORAGE_SETTINGS";
    public static final java.lang.String ACTION_MEMORY_CARD_SETTINGS = "android.settings.MEMORY_CARD_SETTINGS";
    public static final java.lang.String ACTION_SEARCH_SETTINGS = "android.search.action.SEARCH_SETTINGS";
    public static final java.lang.String ACTION_DEVICE_INFO_SETTINGS = "android.settings.DEVICE_INFO_SETTINGS";
    public static final java.lang.String ACTION_NFC_SETTINGS = "android.settings.NFC_SETTINGS";
    public static final java.lang.String ACTION_NFCSHARING_SETTINGS = "android.settings.NFCSHARING_SETTINGS";
    public static final java.lang.String ACTION_NFC_PAYMENT_SETTINGS = "android.settings.NFC_PAYMENT_SETTINGS";
    public static final java.lang.String ACTION_DREAM_SETTINGS = "android.settings.DREAM_SETTINGS";
    public static final java.lang.String ACTION_NOTIFICATION_ASSISTANT_SETTINGS = "android.settings.NOTIFICATION_ASSISTANT_SETTINGS";
    public static final java.lang.String ACTION_NOTIFICATION_LISTENER_SETTINGS = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS";
    public static final java.lang.String ACTION_NOTIFICATION_LISTENER_DETAIL_SETTINGS = "android.settings.NOTIFICATION_LISTENER_DETAIL_SETTINGS";
    public static final java.lang.String EXTRA_NOTIFICATION_LISTENER_COMPONENT_NAME = "android.provider.extra.NOTIFICATION_LISTENER_COMPONENT_NAME";
    public static final java.lang.String ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_NOTIFICATION_POLICY_ACCESS_DETAIL_SETTINGS = "android.settings.NOTIFICATION_POLICY_ACCESS_DETAIL_SETTINGS";
    public static final java.lang.String ACTION_CONDITION_PROVIDER_SETTINGS = "android.settings.ACTION_CONDITION_PROVIDER_SETTINGS";
    public static final java.lang.String ACTION_CAPTIONING_SETTINGS = "android.settings.CAPTIONING_SETTINGS";
    public static final java.lang.String ACTION_PRINT_SETTINGS = "android.settings.ACTION_PRINT_SETTINGS";
    public static final java.lang.String ACTION_ZEN_MODE_SETTINGS = "android.settings.ZEN_MODE_SETTINGS";
    public static final java.lang.String ZEN_MODE_BLOCKED_EFFECTS_SETTINGS = "android.settings.ZEN_MODE_BLOCKED_EFFECTS_SETTINGS";
    public static final java.lang.String ZEN_MODE_ONBOARDING = "android.settings.ZEN_MODE_ONBOARDING";
    public static final java.lang.String ACTION_ZEN_MODE_PRIORITY_SETTINGS = "android.settings.ZEN_MODE_PRIORITY_SETTINGS";
    public static final java.lang.String ACTION_ZEN_MODE_AUTOMATION_SETTINGS = "android.settings.ZEN_MODE_AUTOMATION_SETTINGS";
    public static final java.lang.String ACTION_VOICE_CONTROL_DO_NOT_DISTURB_MODE = "android.settings.VOICE_CONTROL_DO_NOT_DISTURB_MODE";
    public static final java.lang.String ACTION_ZEN_MODE_SCHEDULE_RULE_SETTINGS = "android.settings.ZEN_MODE_SCHEDULE_RULE_SETTINGS";
    public static final java.lang.String ACTION_ZEN_MODE_EVENT_RULE_SETTINGS = "android.settings.ZEN_MODE_EVENT_RULE_SETTINGS";
    public static final java.lang.String ACTION_ZEN_MODE_EXTERNAL_RULE_SETTINGS = "android.settings.ZEN_MODE_EXTERNAL_RULE_SETTINGS";
    public static final java.lang.String ACTION_SHOW_REGULATORY_INFO = "android.settings.SHOW_REGULATORY_INFO";
    public static final java.lang.String DEVICE_NAME_SETTINGS = "android.settings.DEVICE_NAME";
    public static final java.lang.String ACTION_PAIRING_SETTINGS = "android.settings.PAIRING_SETTINGS";
    public static final java.lang.String ACTION_BATTERY_SAVER_SETTINGS = "android.settings.BATTERY_SAVER_SETTINGS";
    public static final java.lang.String ACTION_VOICE_CONTROL_BATTERY_SAVER_MODE = "android.settings.VOICE_CONTROL_BATTERY_SAVER_MODE";
    public static final java.lang.String ACTION_HOME_SETTINGS = "android.settings.HOME_SETTINGS";
    public static final java.lang.String ACTION_MANAGE_DEFAULT_APPS_SETTINGS = "android.settings.MANAGE_DEFAULT_APPS_SETTINGS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_MANAGE_MORE_DEFAULT_APPS_SETTINGS = "android.settings.MANAGE_MORE_DEFAULT_APPS_SETTINGS";
    public static final java.lang.String ACTION_NOTIFICATION_SETTINGS = "android.settings.NOTIFICATION_SETTINGS";
    public static final java.lang.String ACTION_CONVERSATION_SETTINGS = "android.settings.CONVERSATION_SETTINGS";
    public static final java.lang.String ACTION_NOTIFICATION_HISTORY = "android.settings.NOTIFICATION_HISTORY";
    public static final java.lang.String ACTION_ALL_APPS_NOTIFICATION_SETTINGS = "android.settings.ALL_APPS_NOTIFICATION_SETTINGS";
    public static final java.lang.String ACTION_ALL_APPS_NOTIFICATION_SETTINGS_FOR_REVIEW = "android.settings.ALL_APPS_NOTIFICATION_SETTINGS_FOR_REVIEW";
    public static final java.lang.String ACTION_APP_NOTIFICATION_SETTINGS = "android.settings.APP_NOTIFICATION_SETTINGS";
    public static final java.lang.String ACTION_CHANNEL_NOTIFICATION_SETTINGS = "android.settings.CHANNEL_NOTIFICATION_SETTINGS";
    public static final java.lang.String ACTION_APP_NOTIFICATION_BUBBLE_SETTINGS = "android.settings.APP_NOTIFICATION_BUBBLE_SETTINGS";
    public static final java.lang.String EXTRA_APP_PACKAGE = "android.provider.extra.APP_PACKAGE";
    public static final java.lang.String EXTRA_CHANNEL_ID = "android.provider.extra.CHANNEL_ID";
    public static final java.lang.String EXTRA_CONVERSATION_ID = "android.provider.extra.CONVERSATION_ID";
    public static final java.lang.String EXTRA_CHANNEL_FILTER_LIST = "android.provider.extra.CHANNEL_FILTER_LIST";
    public static final java.lang.String ACTION_APP_NOTIFICATION_REDACTION = "android.settings.ACTION_APP_NOTIFICATION_REDACTION";
    public static final java.lang.String EXTRA_APP_UID = "app_uid";
    public static final java.lang.String ACTION_POWER_MENU_SETTINGS = "android.settings.ACTION_POWER_MENU_SETTINGS";
    public static final java.lang.String ACTION_DEVICE_CONTROLS_SETTINGS = "android.settings.ACTION_DEVICE_CONTROLS_SETTINGS";
    public static final java.lang.String ACTION_MEDIA_CONTROLS_SETTINGS = "android.settings.ACTION_MEDIA_CONTROLS_SETTINGS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_SHOW_ADMIN_SUPPORT_DETAILS = "android.settings.SHOW_ADMIN_SUPPORT_DETAILS";
    public static final java.lang.String EXTRA_SUPERVISOR_RESTRICTED_SETTING_KEY = "android.provider.extra.SUPERVISOR_RESTRICTED_SETTING_KEY";
    public static final int SUPERVISOR_VERIFICATION_SETTING_UNKNOWN = 0;
    public static final int SUPERVISOR_VERIFICATION_SETTING_BIOMETRICS = 1;
    public static final java.lang.String ACTION_MANAGE_SUPERVISOR_RESTRICTED_SETTING = "android.settings.MANAGE_SUPERVISOR_RESTRICTED_SETTING";
    public static final java.lang.String ACTION_SHOW_REMOTE_BUGREPORT_DIALOG = "android.settings.SHOW_REMOTE_BUGREPORT_DIALOG";
    public static final java.lang.String ACTION_VR_LISTENER_SETTINGS = "android.settings.VR_LISTENER_SETTINGS";
    public static final java.lang.String ACTION_PICTURE_IN_PICTURE_SETTINGS = "android.settings.PICTURE_IN_PICTURE_SETTINGS";
    public static final java.lang.String ACTION_STORAGE_MANAGER_SETTINGS = "android.settings.STORAGE_MANAGER_SETTINGS";
    public static final java.lang.String ACTION_WEBVIEW_SETTINGS = "android.settings.WEBVIEW_SETTINGS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_ENTERPRISE_PRIVACY_SETTINGS = "android.settings.ENTERPRISE_PRIVACY_SETTINGS";
    public static final java.lang.String ACTION_SHOW_WORK_POLICY_INFO = "android.settings.SHOW_WORK_POLICY_INFO";
    public static final java.lang.String ACTION_REQUEST_SET_AUTOFILL_SERVICE = "android.settings.REQUEST_SET_AUTOFILL_SERVICE";
    public static final java.lang.String ACTION_QUICK_ACCESS_WALLET_SETTINGS = "android.settings.QUICK_ACCESS_WALLET_SETTINGS";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_STORAGE_VOLUME_ACCESS_SETTINGS = "android.settings.STORAGE_VOLUME_ACCESS_SETTINGS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_REQUEST_ENABLE_CONTENT_CAPTURE = "android.settings.REQUEST_ENABLE_CONTENT_CAPTURE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_MANAGE_DOMAIN_URLS = "android.settings.MANAGE_DOMAIN_URLS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_TETHER_SETTINGS = "android.settings.TETHER_SETTINGS";
    public static final java.lang.String ACTION_WIFI_TETHER_SETTING = "com.android.settings.WIFI_TETHER_SETTINGS";
    public static final java.lang.String ACTION_ENABLE_MMS_DATA_REQUEST = "android.settings.ENABLE_MMS_DATA_REQUEST";
    public static final java.lang.String ACTION_SHOW_RESTRICTED_SETTING_DIALOG = "android.settings.SHOW_RESTRICTED_SETTING_DIALOG";
    public static final java.lang.String EXTRA_ENABLE_MMS_DATA_REQUEST_REASON = "android.settings.extra.ENABLE_MMS_DATA_REQUEST_REASON";
    public static final int ENABLE_MMS_DATA_REQUEST_REASON_INCOMING_MMS = 0;
    public static final int ENABLE_MMS_DATA_REQUEST_REASON_OUTGOING_MMS = 1;
    public static final java.lang.String ACTION_MMS_MESSAGE_SETTING = "android.settings.MMS_MESSAGE_SETTING";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_BEDTIME_SETTINGS = "android.settings.BEDTIME_SETTINGS";
    public static final java.lang.String CALL_METHOD_GET_SYSTEM = "GET_system";
    public static final java.lang.String CALL_METHOD_GET_SECURE = "GET_secure";
    public static final java.lang.String CALL_METHOD_GET_GLOBAL = "GET_global";
    public static final java.lang.String CALL_METHOD_GET_CONFIG = "GET_config";
    public static final java.lang.String CALL_METHOD_TRACK_GENERATION_KEY = "_track_generation";
    public static final java.lang.String CALL_METHOD_GENERATION_INDEX_KEY = "_generation_index";
    public static final java.lang.String CALL_METHOD_GENERATION_KEY = "_generation";
    public static final java.lang.String CALL_METHOD_USER_KEY = "_user";
    public static final java.lang.String CALL_METHOD_MAKE_DEFAULT_KEY = "_make_default";
    public static final java.lang.String CALL_METHOD_RESET_MODE_KEY = "_reset_mode";
    public static final java.lang.String CALL_METHOD_TAG_KEY = "_tag";
    public static final java.lang.String CALL_METHOD_PREFIX_KEY = "_prefix";
    public static final java.lang.String CALL_METHOD_SYNC_DISABLED_MODE_KEY = "_disabled_mode";
    public static final java.lang.String CALL_METHOD_MONITOR_CALLBACK_KEY = "_monitor_callback_key";
    public static final java.lang.String CALL_METHOD_FLAGS_KEY = "_flags";
    public static final java.lang.String CALL_METHOD_OVERRIDEABLE_BY_RESTORE_KEY = "_overrideable_by_restore";
    public static final java.lang.String CALL_METHOD_PUT_SYSTEM = "PUT_system";
    public static final java.lang.String CALL_METHOD_PUT_SECURE = "PUT_secure";
    public static final java.lang.String CALL_METHOD_PUT_GLOBAL = "PUT_global";
    public static final java.lang.String CALL_METHOD_PUT_CONFIG = "PUT_config";
    public static final java.lang.String CALL_METHOD_SET_ALL_CONFIG = "SET_ALL_config";
    public static final java.lang.String CALL_METHOD_DELETE_SYSTEM = "DELETE_system";
    public static final java.lang.String CALL_METHOD_DELETE_SECURE = "DELETE_secure";
    public static final java.lang.String CALL_METHOD_DELETE_GLOBAL = "DELETE_global";
    public static final java.lang.String CALL_METHOD_DELETE_CONFIG = "DELETE_config";
    public static final java.lang.String CALL_METHOD_RESET_SECURE = "RESET_secure";
    public static final java.lang.String CALL_METHOD_RESET_GLOBAL = "RESET_global";
    public static final java.lang.String CALL_METHOD_RESET_CONFIG = "RESET_config";
    public static final java.lang.String CALL_METHOD_LIST_SYSTEM = "LIST_system";
    public static final java.lang.String CALL_METHOD_LIST_SECURE = "LIST_secure";
    public static final java.lang.String CALL_METHOD_LIST_GLOBAL = "LIST_global";
    public static final java.lang.String CALL_METHOD_LIST_CONFIG = "LIST_config";
    public static final java.lang.String CALL_METHOD_SET_SYNC_DISABLED_MODE_CONFIG = "SET_SYNC_DISABLED_MODE_config";
    public static final java.lang.String CALL_METHOD_GET_SYNC_DISABLED_MODE_CONFIG = "GET_SYNC_DISABLED_MODE_config";
    public static final java.lang.String CALL_METHOD_REGISTER_MONITOR_CALLBACK_CONFIG = "REGISTER_MONITOR_CALLBACK_config";
    public static final java.lang.String EXTRA_MONITOR_CALLBACK_TYPE = "monitor_callback_type";
    public static final java.lang.String EXTRA_ACCESS_CALLBACK = "access_callback";
    public static final java.lang.String EXTRA_NAMESPACE_UPDATED_CALLBACK = "namespace_updated_callback";
    public static final java.lang.String EXTRA_NAMESPACE = "namespace";
    public static final java.lang.String EXTRA_CALLING_PACKAGE = "calling_package";
    public static final java.lang.String EXTRA_AUTHORITIES = "authorities";
    public static final java.lang.String EXTRA_ACCOUNT_TYPES = "account_types";
    public static final java.lang.String EXTRA_INPUT_METHOD_ID = "input_method_id";
    public static final java.lang.String EXTRA_INPUT_DEVICE_IDENTIFIER = "input_device_identifier";
    public static final java.lang.String EXTRA_AIRPLANE_MODE_ENABLED = "airplane_mode_enabled";
    public static final java.lang.String EXTRA_BATTERY_SAVER_MODE_ENABLED = "android.settings.extra.battery_saver_mode_enabled";
    public static final java.lang.String EXTRA_DO_NOT_DISTURB_MODE_ENABLED = "android.settings.extra.do_not_disturb_mode_enabled";
    public static final java.lang.String EXTRA_DO_NOT_DISTURB_MODE_MINUTES = "android.settings.extra.do_not_disturb_mode_minutes";
    public static final int RESET_MODE_PACKAGE_DEFAULTS = 1;
    public static final int RESET_MODE_UNTRUSTED_DEFAULTS = 2;
    public static final int RESET_MODE_UNTRUSTED_CHANGES = 3;
    public static final int RESET_MODE_TRUSTED_DEFAULTS = 4;
    public static final java.lang.String EXTRA_NUMBER_OF_CERTIFICATES = "android.settings.extra.number_of_certificates";
    public static final java.lang.String AUTHORITY = "settings";
    public static final java.lang.String ACTION_WIFI_ADD_NETWORKS = "android.settings.WIFI_ADD_NETWORKS";
    public static final java.lang.String EXTRA_WIFI_NETWORK_LIST = "android.provider.extra.WIFI_NETWORK_LIST";
    public static final java.lang.String EXTRA_WIFI_NETWORK_RESULT_LIST = "android.provider.extra.WIFI_NETWORK_RESULT_LIST";
    public static final int ADD_WIFI_RESULT_SUCCESS = 0;
    public static final int ADD_WIFI_RESULT_ADD_OR_UPDATE_FAILED = 1;
    public static final int ADD_WIFI_RESULT_ALREADY_EXISTS = 2;
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_BUGREPORT_HANDLER_SETTINGS = "android.settings.BUGREPORT_HANDLER_SETTINGS";
    public static final java.lang.String ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION = "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION";
    public static final java.lang.String ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
    public static final java.lang.String ACTION_SETTINGS_EMBED_DEEP_LINK_ACTIVITY = "android.settings.SETTINGS_EMBED_DEEP_LINK_ACTIVITY";
    public static final java.lang.String EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_INTENT_URI = "android.provider.extra.SETTINGS_EMBEDDED_DEEP_LINK_INTENT_URI";
    public static final java.lang.String EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_HIGHLIGHT_MENU_KEY = "android.provider.extra.SETTINGS_EMBEDDED_DEEP_LINK_HIGHLIGHT_MENU_KEY";
    public Settings() {}
    public static void setInSystemServer() {}
    public static boolean isInSystemServer() { return false; }
    public static boolean canDrawOverlays(android.content.Context p0) { return false; }
    public static boolean isCallingPackageAllowedToWriteSettings(android.content.Context p0, int p1, java.lang.String p2, boolean p3) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static boolean checkAndNoteWriteSettingsOperation(android.content.Context p0, int p1, java.lang.String p2, boolean p3) { return false; }
    @android.annotation.SystemApi
    public static boolean checkAndNoteWriteSettingsOperation(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4) { return false; }
    public static boolean isCallingPackageAllowedToDrawOverlays(android.content.Context p0, int p1, java.lang.String p2, boolean p3) { return false; }
    public static boolean checkAndNoteDrawOverlaysOperation(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4) { return false; }
    @java.lang.Deprecated
    public static boolean isCallingPackageAllowedToPerformAppOpsProtectedOperation(android.content.Context p0, int p1, java.lang.String p2, boolean p3, int p4, java.lang.String[] p5, boolean p6) { return false; }
    public static boolean isCallingPackageAllowedToPerformAppOpsProtectedOperation(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, int p5, java.lang.String[] p6, boolean p7) { return false; }
    public static java.lang.String getPackageNameForUid(android.content.Context p0, int p1) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AddWifiResult {
    }

    public static final class Bookmarks implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String ID = "_id";
        public static final java.lang.String TITLE = "title";
        public static final java.lang.String FOLDER = "folder";
        public static final java.lang.String INTENT = "intent";
        public static final java.lang.String SHORTCUT = "shortcut";
        public static final java.lang.String ORDERING = "ordering";
        public Bookmarks() {}
        public static android.content.Intent getIntentForShortcut(android.content.ContentResolver p0, char p1) { return null; }
        public static android.net.Uri add(android.content.ContentResolver p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3, char p4, int p5) { return null; }
        public static java.lang.CharSequence getLabelForFolder(android.content.res.Resources p0, java.lang.String p1) { return null; }
        public static java.lang.CharSequence getTitle(android.content.Context p0, android.database.Cursor p1) { return null; }
    }

    public static final class Config extends android.provider.Settings.NameValueTable {
        public static final int SYNC_DISABLED_MODE_NONE = 0;
        public static final int SYNC_DISABLED_MODE_PERSISTENT = 1;
        public static final int SYNC_DISABLED_MODE_UNTIL_REBOOT = 2;
        public Config() { super(); }
        @android.annotation.RequiresPermission("android.permission.READ_DEVICE_CONFIG")
        static java.lang.String getString(android.content.ContentResolver p0, java.lang.String p1) { return null; }
        @android.annotation.RequiresPermission("android.permission.READ_DEVICE_CONFIG")
        public static java.util.Map<java.lang.String, java.lang.String> getStrings(android.content.ContentResolver p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return null; }
        @android.annotation.RequiresPermission("android.permission.WRITE_DEVICE_CONFIG")
        static boolean putString(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) { return false; }
        @android.annotation.RequiresPermission("android.permission.WRITE_DEVICE_CONFIG")
        public static boolean setStrings(android.content.ContentResolver p0, java.lang.String p1, java.util.Map<java.lang.String, java.lang.String> p2) throws android.provider.DeviceConfig.BadConfigException { return false; }
        @android.annotation.RequiresPermission("android.permission.WRITE_DEVICE_CONFIG")
        static boolean deleteString(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2) { return false; }
        @android.annotation.RequiresPermission("android.permission.WRITE_DEVICE_CONFIG")
        static void resetToDefaults(android.content.ContentResolver p0, int p1, java.lang.String p2) {}
        @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
        @android.annotation.RequiresPermission("android.permission.WRITE_DEVICE_CONFIG")
        static void setSyncDisabledMode(android.content.ContentResolver p0, int p1) {}
        @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
        @android.annotation.RequiresPermission("android.permission.WRITE_DEVICE_CONFIG")
        static int getSyncDisabledMode(android.content.ContentResolver p0) { return 0; }
        @android.annotation.RequiresPermission("android.permission.MONITOR_DEVICE_CONFIG_ACCESS")
        public static void registerMonitorCallback(android.content.ContentResolver p0, android.os.RemoteCallback p1) {}
        public static void clearProviderForTest() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
        public static @interface SyncDisabledMode {
        }
    }

    private static final class ContentProviderHolder {
        public ContentProviderHolder(android.net.Uri p0) {}
        public android.content.IContentProvider getProvider(android.content.ContentResolver p0) { return null; }
        public void clearProviderForTest() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnableMmsDataReason {
    }

    private static final class GenerationTracker {
        public GenerationTracker(android.util.MemoryIntArray p0, int p1, int p2, java.lang.Runnable p3) {}
        public boolean isGenerationChanged() { return false; }
        public int getCurrentGeneration() { return 0; }
        public void destroy() {}
    }

    public static final class Global extends android.provider.Settings.NameValueTable {
        public static final android.net.Uri CONTENT_URI = null;
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String NOTIFICATION_BUBBLES = "notification_bubbles";
        @android.provider.Settings.Readable
        public static final java.lang.String ADD_USERS_WHEN_LOCKED = "add_users_when_locked";
        public static final java.lang.String REMOVE_GUEST_ON_EXIT = "remove_guest_on_exit";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String APPLY_RAMPING_RINGER = "apply_ramping_ringer";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLE_ACCESSIBILITY_GLOBAL_GESTURE_ENABLED = "enable_accessibility_global_gesture_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String AIRPLANE_MODE_ON = "airplane_mode_on";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String THEATER_MODE_ON = "theater_mode_on";
        @android.provider.Settings.Readable
        public static final java.lang.String RADIO_BLUETOOTH = "bluetooth";
        @android.provider.Settings.Readable
        public static final java.lang.String RADIO_WIFI = "wifi";
        @android.provider.Settings.Readable
        public static final java.lang.String RADIO_WIMAX = "wimax";
        @android.provider.Settings.Readable
        public static final java.lang.String RADIO_CELL = "cell";
        @android.provider.Settings.Readable
        public static final java.lang.String RADIO_NFC = "nfc";
        @android.provider.Settings.Readable
        public static final java.lang.String AIRPLANE_MODE_RADIOS = "airplane_mode_radios";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String AIRPLANE_MODE_TOGGLEABLE_RADIOS = "airplane_mode_toggleable_radios";
        @android.provider.Settings.Readable
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLUETOOTH_CLASS_OF_DEVICE = "bluetooth_class_of_device";
        @android.provider.Settings.Readable
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLUETOOTH_DISABLED_PROFILES = "bluetooth_disabled_profiles";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_INTEROPERABILITY_LIST = "bluetooth_interoperability_list";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_SLEEP_POLICY = "wifi_sleep_policy";
        @java.lang.Deprecated
        public static final int WIFI_SLEEP_POLICY_DEFAULT = 0;
        @java.lang.Deprecated
        public static final int WIFI_SLEEP_POLICY_NEVER_WHILE_PLUGGED = 1;
        @java.lang.Deprecated
        public static final int WIFI_SLEEP_POLICY_NEVER = 2;
        @android.provider.Settings.Readable
        public static final java.lang.String AUTO_TIME = "auto_time";
        @android.provider.Settings.Readable
        public static final java.lang.String AUTO_TIME_ZONE = "auto_time_zone";
        @android.provider.Settings.Readable
        public static final java.lang.String CAR_DOCK_SOUND = "car_dock_sound";
        @android.provider.Settings.Readable
        public static final java.lang.String CAR_UNDOCK_SOUND = "car_undock_sound";
        @android.provider.Settings.Readable
        public static final java.lang.String DESK_DOCK_SOUND = "desk_dock_sound";
        @android.provider.Settings.Readable
        public static final java.lang.String DESK_UNDOCK_SOUND = "desk_undock_sound";
        @android.provider.Settings.Readable
        public static final java.lang.String DOCK_SOUNDS_ENABLED = "dock_sounds_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String DOCK_SOUNDS_ENABLED_WHEN_ACCESSIBILITY = "dock_sounds_enabled_when_accessbility";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_SOUND = "lock_sound";
        @android.provider.Settings.Readable
        public static final java.lang.String UNLOCK_SOUND = "unlock_sound";
        @android.provider.Settings.Readable
        public static final java.lang.String TRUSTED_SOUND = "trusted_sound";
        @android.provider.Settings.Readable
        public static final java.lang.String LOW_BATTERY_SOUND = "low_battery_sound";
        @android.provider.Settings.Readable
        public static final java.lang.String POWER_SOUNDS_ENABLED = "power_sounds_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String WIRELESS_CHARGING_STARTED_SOUND = "wireless_charging_started_sound";
        @android.provider.Settings.Readable
        public static final java.lang.String CHARGING_STARTED_SOUND = "charging_started_sound";
        @java.lang.Deprecated
        public static final java.lang.String CHARGING_SOUNDS_ENABLED = "charging_sounds_enabled";
        @java.lang.Deprecated
        public static final java.lang.String CHARGING_VIBRATION_ENABLED = "charging_vibration_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String STAY_ON_WHILE_PLUGGED_IN = "stay_on_while_plugged_in";
        @android.provider.Settings.Readable
        public static final java.lang.String BUGREPORT_IN_POWER_MENU = "bugreport_in_power_menu";
        @android.provider.Settings.Readable
        public static final java.lang.String CUSTOM_BUGREPORT_HANDLER_APP = "custom_bugreport_handler_app";
        @android.provider.Settings.Readable
        public static final java.lang.String CUSTOM_BUGREPORT_HANDLER_USER = "custom_bugreport_handler_user";
        @android.provider.Settings.Readable
        public static final java.lang.String ADB_ENABLED = "adb_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ADB_WIFI_ENABLED = "adb_wifi_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String DEBUG_VIEW_ATTRIBUTES = "debug_view_attributes";
        @android.provider.Settings.Readable
        public static final java.lang.String DEBUG_VIEW_ATTRIBUTES_APPLICATION_PACKAGE = "debug_view_attributes_application_package";
        @android.provider.Settings.Readable
        public static final java.lang.String ASSISTED_GPS_ENABLED = "assisted_gps_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_ON = "bluetooth_on";
        @android.provider.Settings.Readable
        public static final java.lang.String CDMA_CELL_BROADCAST_SMS = "cdma_cell_broadcast_sms";
        @android.provider.Settings.Readable
        public static final java.lang.String CDMA_ROAMING_MODE = "roaming_settings";
        @android.provider.Settings.Readable
        public static final java.lang.String CDMA_SUBSCRIPTION_MODE = "subscription_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String DEFAULT_RESTRICT_BACKGROUND_DATA = "default_restrict_background_data";
        @android.provider.Settings.Readable
        public static final java.lang.String DATA_ACTIVITY_TIMEOUT_MOBILE = "data_activity_timeout_mobile";
        @android.provider.Settings.Readable
        public static final java.lang.String DATA_ACTIVITY_TIMEOUT_WIFI = "data_activity_timeout_wifi";
        @android.provider.Settings.Readable(maxTargetSdk=32)
        public static final java.lang.String DATA_ROAMING = "data_roaming";
        @android.provider.Settings.Readable
        public static final java.lang.String MDC_INITIAL_MAX_RETRY = "mdc_initial_max_retry";
        @android.provider.Settings.Readable
        public static final java.lang.String FORCE_ALLOW_ON_EXTERNAL = "force_allow_on_external";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String DEFAULT_SM_DP_PLUS = "default_sm_dp_plus";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String EUICC_PROVISIONED = "euicc_provisioned";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String EUICC_SUPPORTED_COUNTRIES = "euicc_supported_countries";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String EUICC_UNSUPPORTED_COUNTRIES = "euicc_unsupported_countries";
        @android.provider.Settings.Readable
        public static final java.lang.String DEVELOPMENT_FORCE_RESIZABLE_ACTIVITIES = "force_resizable_activities";
        @android.provider.Settings.Readable
        public static final java.lang.String DEVELOPMENT_ENABLE_FREEFORM_WINDOWS_SUPPORT = "enable_freeform_support";
        @android.provider.Settings.Readable
        public static final java.lang.String DEVELOPMENT_FORCE_DESKTOP_MODE_ON_EXTERNAL_DISPLAYS = "force_desktop_mode_on_external_displays";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String DEVELOPMENT_ENABLE_NON_RESIZABLE_MULTI_WINDOW = "enable_non_resizable_multi_window";
        @android.provider.Settings.Readable
        public static final java.lang.String DEVELOPMENT_RENDER_SHADOWS_IN_COMPOSITOR = "render_shadows_in_compositor";
        @android.provider.Settings.Readable
        public static final java.lang.String DEVELOPMENT_USE_BLAST_ADAPTER_VR = "use_blast_adapter_vr";
        public static final java.lang.String DEVELOPMENT_WM_DISPLAY_SETTINGS_PATH = "wm_display_settings_path";
        @android.provider.Settings.Readable
        public static final java.lang.String DEVELOPMENT_SETTINGS_ENABLED = "development_settings_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String DEVICE_PROVISIONED = "device_provisioned";
        public static final java.lang.String BYPASS_DEVICE_POLICY_MANAGEMENT_ROLE_QUALIFICATIONS = "bypass_device_policy_management_role_qualifications";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String DEVICE_PROVISIONING_MOBILE_DATA_ENABLED = "device_provisioning_mobile_data";
        @android.provider.Settings.Readable
        public static final java.lang.String DISPLAY_SIZE_FORCED = "display_size_forced";
        @android.provider.Settings.Readable
        public static final java.lang.String DISPLAY_SCALING_FORCE = "display_scaling_force";
        @android.provider.Settings.Readable
        public static final java.lang.String DOWNLOAD_MAX_BYTES_OVER_MOBILE = "download_manager_max_bytes_over_mobile";
        @android.provider.Settings.Readable
        public static final java.lang.String DOWNLOAD_RECOMMENDED_MAX_BYTES_OVER_MOBILE = "download_manager_recommended_max_bytes_over_mobile";
        @java.lang.Deprecated
        public static final java.lang.String INSTALL_NON_MARKET_APPS = "install_non_market_apps";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_MEDIA_ON_QUICK_SETTINGS = "qs_media_controls";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCATION_BACKGROUND_THROTTLE_INTERVAL_MS = "location_background_throttle_interval_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCATION_BACKGROUND_THROTTLE_PROXIMITY_ALERT_INTERVAL_MS = "location_background_throttle_proximity_alert_interval_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCATION_BACKGROUND_THROTTLE_PACKAGE_WHITELIST = "location_background_throttle_package_whitelist";
        @android.provider.Settings.Readable
        @java.lang.Deprecated
        public static final java.lang.String LOCATION_IGNORE_SETTINGS_PACKAGE_WHITELIST = "location_ignore_settings_package_whitelist";
        public static final java.lang.String LOCATION_ENABLE_STATIONARY_THROTTLE = "location_enable_stationary_throttle";
        @android.provider.Settings.Readable
        public static final java.lang.String MHL_INPUT_SWITCHING_ENABLED = "mhl_input_switching_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String MHL_POWER_CHARGE_ENABLED = "mhl_power_charge_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String MOBILE_DATA = "mobile_data";
        @android.provider.Settings.Readable
        public static final java.lang.String MOBILE_DATA_ALWAYS_ON = "mobile_data_always_on";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_ALWAYS_REQUESTED = "wifi_always_requested";
        @android.provider.Settings.Readable
        public static final java.lang.String CONNECTIVITY_METRICS_BUFFER_SIZE = "connectivity_metrics_buffer_size";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_ENABLED = "netstats_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_POLL_INTERVAL = "netstats_poll_interval";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_TIME_CACHE_MAX_AGE = "netstats_time_cache_max_age";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_GLOBAL_ALERT_BYTES = "netstats_global_alert_bytes";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_SAMPLE_ENABLED = "netstats_sample_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_AUGMENT_ENABLED = "netstats_augment_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_COMBINE_SUBTYPE_ENABLED = "netstats_combine_subtype_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_DEV_BUCKET_DURATION = "netstats_dev_bucket_duration";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_DEV_PERSIST_BYTES = "netstats_dev_persist_bytes";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_DEV_ROTATE_AGE = "netstats_dev_rotate_age";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_DEV_DELETE_AGE = "netstats_dev_delete_age";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_UID_BUCKET_DURATION = "netstats_uid_bucket_duration";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_UID_PERSIST_BYTES = "netstats_uid_persist_bytes";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_UID_ROTATE_AGE = "netstats_uid_rotate_age";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_UID_DELETE_AGE = "netstats_uid_delete_age";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_UID_TAG_BUCKET_DURATION = "netstats_uid_tag_bucket_duration";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_UID_TAG_PERSIST_BYTES = "netstats_uid_tag_persist_bytes";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_UID_TAG_ROTATE_AGE = "netstats_uid_tag_rotate_age";
        @android.provider.Settings.Readable
        public static final java.lang.String NETSTATS_UID_TAG_DELETE_AGE = "netstats_uid_tag_delete_age";
        @android.provider.Settings.Readable
        public static final java.lang.String NETPOLICY_QUOTA_ENABLED = "netpolicy_quota_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String NETPOLICY_QUOTA_UNLIMITED = "netpolicy_quota_unlimited";
        @android.provider.Settings.Readable
        public static final java.lang.String NETPOLICY_QUOTA_LIMITED = "netpolicy_quota_limited";
        @android.provider.Settings.Readable
        public static final java.lang.String NETPOLICY_QUOTA_FRAC_JOBS = "netpolicy_quota_frac_jobs";
        @android.provider.Settings.Readable
        public static final java.lang.String NETPOLICY_QUOTA_FRAC_MULTIPATH = "netpolicy_quota_frac_multipath";
        @android.provider.Settings.Readable
        public static final java.lang.String NETPOLICY_OVERRIDE_ENABLED = "netpolicy_override_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String NETWORK_PREFERENCE = "network_preference";
        @android.provider.Settings.Readable
        public static final java.lang.String NETWORK_SCORER_APP = "network_scorer_app";
        @android.provider.Settings.Readable
        public static final java.lang.String NIGHT_DISPLAY_FORCED_AUTO_MODE_AVAILABLE = "night_display_forced_auto_mode_available";
        @android.provider.Settings.Readable
        public static final java.lang.String NITZ_UPDATE_DIFF = "nitz_update_diff";
        @android.provider.Settings.Readable
        public static final java.lang.String NITZ_UPDATE_SPACING = "nitz_update_spacing";
        public static final java.lang.String NITZ_NETWORK_DISCONNECT_RETENTION = "nitz_network_disconnect_retention";
        @android.provider.Settings.Readable
        public static final java.lang.String NTP_SERVER = "ntp_server";
        @android.provider.Settings.Readable
        public static final java.lang.String NTP_TIMEOUT = "ntp_timeout";
        @android.provider.Settings.Readable
        public static final java.lang.String STORAGE_BENCHMARK_INTERVAL = "storage_benchmark_interval";
        @android.provider.Settings.Readable
        public static final java.lang.String SETTINGS_USE_PSD_API = "settings_use_psd_api";
        @android.provider.Settings.Readable
        public static final java.lang.String SETTINGS_USE_EXTERNAL_PROVIDER_API = "settings_use_external_provider_api";
        @android.provider.Settings.Readable
        public static final java.lang.String DNS_RESOLVER_SAMPLE_VALIDITY_SECONDS = "dns_resolver_sample_validity_seconds";
        @android.provider.Settings.Readable
        public static final java.lang.String DNS_RESOLVER_SUCCESS_THRESHOLD_PERCENT = "dns_resolver_success_threshold_percent";
        @android.provider.Settings.Readable
        public static final java.lang.String DNS_RESOLVER_MIN_SAMPLES = "dns_resolver_min_samples";
        @android.provider.Settings.Readable
        public static final java.lang.String DNS_RESOLVER_MAX_SAMPLES = "dns_resolver_max_samples";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String OTA_DISABLE_AUTOMATIC_UPDATE = "ota_disable_automatic_update";
        @android.provider.Settings.Readable
        public static final java.lang.String PACKAGE_VERIFIER_TIMEOUT = "verifier_timeout";
        @android.provider.Settings.Readable
        public static final java.lang.String PACKAGE_STREAMING_VERIFIER_TIMEOUT = "streaming_verifier_timeout";
        @android.provider.Settings.Readable
        public static final java.lang.String APP_INTEGRITY_VERIFICATION_TIMEOUT = "app_integrity_verification_timeout";
        @android.provider.Settings.Readable
        public static final java.lang.String PACKAGE_VERIFIER_DEFAULT_RESPONSE = "verifier_default_response";
        @android.provider.Settings.Readable
        public static final java.lang.String PACKAGE_VERIFIER_SETTING_VISIBLE = "verifier_setting_visible";
        @android.provider.Settings.Readable
        public static final java.lang.String PACKAGE_VERIFIER_INCLUDE_ADB = "verifier_verify_adb_installs";
        @android.provider.Settings.Readable
        public static final java.lang.String INTEGRITY_CHECK_INCLUDES_RULE_PROVIDER = "verify_integrity_for_rule_provider";
        @android.provider.Settings.Readable
        public static final java.lang.String FSTRIM_MANDATORY_INTERVAL = "fstrim_mandatory_interval";
        @android.provider.Settings.Readable
        public static final java.lang.String PDP_WATCHDOG_POLL_INTERVAL_MS = "pdp_watchdog_poll_interval_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String PDP_WATCHDOG_LONG_POLL_INTERVAL_MS = "pdp_watchdog_long_poll_interval_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String PDP_WATCHDOG_ERROR_POLL_INTERVAL_MS = "pdp_watchdog_error_poll_interval_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String PDP_WATCHDOG_TRIGGER_PACKET_COUNT = "pdp_watchdog_trigger_packet_count";
        @android.provider.Settings.Readable
        public static final java.lang.String PDP_WATCHDOG_ERROR_POLL_COUNT = "pdp_watchdog_error_poll_count";
        @android.provider.Settings.Readable
        public static final java.lang.String PDP_WATCHDOG_MAX_PDP_RESET_FAIL_COUNT = "pdp_watchdog_max_pdp_reset_fail_count";
        @android.provider.Settings.Readable
        public static final java.lang.String SETUP_PREPAID_DATA_SERVICE_URL = "setup_prepaid_data_service_url";
        @android.provider.Settings.Readable
        public static final java.lang.String SETUP_PREPAID_DETECTION_TARGET_URL = "setup_prepaid_detection_target_url";
        @android.provider.Settings.Readable
        public static final java.lang.String SETUP_PREPAID_DETECTION_REDIR_HOST = "setup_prepaid_detection_redir_host";
        @android.provider.Settings.Readable
        public static final java.lang.String SMS_OUTGOING_CHECK_INTERVAL_MS = "sms_outgoing_check_interval_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String SMS_OUTGOING_CHECK_MAX_COUNT = "sms_outgoing_check_max_count";
        @android.provider.Settings.Readable
        public static final java.lang.String SMS_SHORT_CODE_CONFIRMATION = "sms_short_code_confirmation";
        @android.provider.Settings.Readable
        public static final java.lang.String SMS_SHORT_CODE_RULE = "sms_short_code_rule";
        @android.provider.Settings.Readable
        public static final java.lang.String TCP_DEFAULT_INIT_RWND = "tcp_default_init_rwnd";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String TETHER_SUPPORTED = "tether_supported";
        @android.provider.Settings.Readable
        public static final java.lang.String TETHER_DUN_REQUIRED = "tether_dun_required";
        @android.provider.Settings.Readable
        public static final java.lang.String TETHER_DUN_APN = "tether_dun_apn";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String TETHER_OFFLOAD_DISABLED = "tether_offload_disabled";
        @android.provider.Settings.Readable
        public static final java.lang.String TETHER_ENABLE_LEGACY_DHCP_SERVER = "tether_enable_legacy_dhcp_server";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String CARRIER_APP_WHITELIST = "carrier_app_whitelist";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String CARRIER_APP_NAMES = "carrier_app_names";
        @android.provider.Settings.Readable
        public static final java.lang.String USB_MASS_STORAGE_ENABLED = "usb_mass_storage_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String USE_GOOGLE_MAIL = "use_google_mail";
        @android.provider.Settings.Readable
        public static final java.lang.String USER_SWITCHER_ENABLED = "user_switcher_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String WEBVIEW_DATA_REDUCTION_PROXY_KEY = "webview_data_reduction_proxy_key";
        @android.provider.Settings.Readable
        public static final java.lang.String WEBVIEW_PROVIDER = "webview_provider";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String WEBVIEW_MULTIPROCESS = "webview_multiprocess";
        @android.provider.Settings.Readable
        public static final java.lang.String NETWORK_SWITCH_NOTIFICATION_DAILY_LIMIT = "network_switch_notification_daily_limit";
        @android.provider.Settings.Readable
        public static final java.lang.String NETWORK_SWITCH_NOTIFICATION_RATE_LIMIT_MILLIS = "network_switch_notification_rate_limit_millis";
        @android.provider.Settings.Readable
        public static final java.lang.String NETWORK_AVOID_BAD_WIFI = "network_avoid_bad_wifi";
        @android.provider.Settings.Readable
        public static final java.lang.String NETWORK_METERED_MULTIPATH_PREFERENCE = "network_metered_multipath_preference";
        @android.provider.Settings.Readable
        public static final java.lang.String NETWORK_DEFAULT_DAILY_MULTIPATH_QUOTA_BYTES = "network_default_daily_multipath_quota_bytes";
        @android.provider.Settings.Readable
        public static final java.lang.String NETWORK_WATCHLIST_LAST_REPORT_TIME = "network_watchlist_last_report_time";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_BADGING_THRESHOLDS = "wifi_badging_thresholds";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_DISPLAY_ON = "wifi_display_on";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_DISPLAY_CERTIFICATION_ON = "wifi_display_certification_on";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_DISPLAY_WPS_CONFIG = "wifi_display_wps_config";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wifi_networks_available_notification_on";
        @android.provider.Settings.Readable
        public static final java.lang.String WIMAX_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wimax_networks_available_notification_on";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY = "wifi_networks_available_repeat_delay";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_COUNTRY_CODE = "wifi_country_code";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_FRAMEWORK_SCAN_INTERVAL_MS = "wifi_framework_scan_interval_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_IDLE_MS = "wifi_idle_ms";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_NUM_OPEN_NETWORKS_KEPT = "wifi_num_open_networks_kept";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_ON = "wifi_on";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_SCAN_ALWAYS_AVAILABLE = "wifi_scan_always_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_P2P_PENDING_FACTORY_RESET = "wifi_p2p_pending_factory_reset";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String SOFT_AP_TIMEOUT_ENABLED = "soft_ap_timeout_enabled";
        @java.lang.Deprecated
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WAKEUP_ENABLED = "wifi_wakeup_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_MIGRATION_COMPLETED = "wifi_migration_completed";
        public static final java.lang.String UWB_ENABLED = "uwb_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String NETWORK_SCORING_UI_ENABLED = "network_scoring_ui_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String SPEED_LABEL_CACHE_EVICTION_AGE_MILLIS = "speed_label_cache_eviction_age_millis";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String NETWORK_RECOMMENDATIONS_ENABLED = "network_recommendations_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String NETWORK_RECOMMENDATIONS_PACKAGE = "network_recommendations_package";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String USE_OPEN_WIFI_PACKAGE = "use_open_wifi_package";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String RECOMMENDED_NETWORK_EVALUATOR_CACHE_EXPIRY_MS = "recommended_network_evaluator_cache_expiry_ms";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_SCAN_THROTTLE_ENABLED = "wifi_scan_throttle_enabled";
        @android.provider.Settings.Readable
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLE_SCAN_ALWAYS_AVAILABLE = "ble_scan_always_enabled";
        @android.provider.Settings.Readable
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLE_SCAN_LOW_POWER_WINDOW_MS = "ble_scan_low_power_window_ms";
        @android.provider.Settings.Readable
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLE_SCAN_BALANCED_WINDOW_MS = "ble_scan_balanced_window_ms";
        @android.provider.Settings.Readable
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLE_SCAN_LOW_LATENCY_WINDOW_MS = "ble_scan_low_latency_window_ms";
        @android.provider.Settings.Readable
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLE_SCAN_LOW_POWER_INTERVAL_MS = "ble_scan_low_power_interval_ms";
        @android.provider.Settings.Readable
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLE_SCAN_BALANCED_INTERVAL_MS = "ble_scan_balanced_interval_ms";
        @android.provider.Settings.Readable
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLE_SCAN_LOW_LATENCY_INTERVAL_MS = "ble_scan_low_latency_interval_ms";
        @android.provider.Settings.Readable
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLE_SCAN_BACKGROUND_MODE = "ble_scan_background_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_SUPPLICANT_SCAN_INTERVAL_MS = "wifi_supplicant_scan_interval_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_ENHANCED_AUTO_JOIN = "wifi_enhanced_auto_join";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_NETWORK_SHOW_RSSI = "wifi_network_show_rssi";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_SCAN_INTERVAL_WHEN_P2P_CONNECTED_MS = "wifi_scan_interval_p2p_connected_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_ON = "wifi_watchdog_on";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_POOR_NETWORK_TEST_ENABLED = "wifi_watchdog_poor_network_test_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_VERBOSE_LOGGING_ENABLED = "wifi_verbose_logging_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_CONNECTED_MAC_RANDOMIZATION_ENABLED = "wifi_connected_mac_randomization_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_SCORE_PARAMS = "wifi_score_params";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_MAX_DHCP_RETRY_COUNT = "wifi_max_dhcp_retry_count";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = "wifi_mobile_data_transition_wakelock_timeout_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_DEVICE_OWNER_CONFIGS_LOCKDOWN = "wifi_device_owner_configs_lockdown";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_FREQUENCY_BAND = "wifi_frequency_band";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_P2P_DEVICE_NAME = "wifi_p2p_device_name";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_EPHEMERAL_OUT_OF_RANGE_TIMEOUT_MS = "wifi_ephemeral_out_of_range_timeout_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String DATA_STALL_ALARM_NON_AGGRESSIVE_DELAY_IN_MS = "data_stall_alarm_non_aggressive_delay_in_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String DATA_STALL_ALARM_AGGRESSIVE_DELAY_IN_MS = "data_stall_alarm_aggressive_delay_in_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String PROVISIONING_APN_ALARM_DELAY_IN_MS = "provisioning_apn_alarm_delay_in_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String GPRS_REGISTER_CHECK_PERIOD_MS = "gprs_register_check_period_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String WTF_IS_FATAL = "wtf_is_fatal";
        @android.provider.Settings.Readable
        public static final java.lang.String MODE_RINGER = "mode_ringer";
        @android.provider.Settings.Readable
        public static final java.lang.String OVERLAY_DISPLAY_DEVICES = "overlay_display_devices";
        @android.provider.Settings.Readable
        public static final java.lang.String BATTERY_DISCHARGE_DURATION_THRESHOLD = "battery_discharge_duration_threshold";
        @android.provider.Settings.Readable
        public static final java.lang.String BATTERY_DISCHARGE_THRESHOLD = "battery_discharge_threshold";
        @android.provider.Settings.Readable
        public static final java.lang.String SEND_ACTION_APP_ERROR = "send_action_app_error";
        @android.provider.Settings.Readable
        public static final java.lang.String DROPBOX_AGE_SECONDS = "dropbox_age_seconds";
        @android.provider.Settings.Readable
        public static final java.lang.String DROPBOX_MAX_FILES = "dropbox_max_files";
        @android.provider.Settings.Readable
        public static final java.lang.String DROPBOX_QUOTA_KB = "dropbox_quota_kb";
        @android.provider.Settings.Readable
        public static final java.lang.String DROPBOX_QUOTA_PERCENT = "dropbox_quota_percent";
        @android.provider.Settings.Readable
        public static final java.lang.String DROPBOX_RESERVE_PERCENT = "dropbox_reserve_percent";
        @android.provider.Settings.Readable
        public static final java.lang.String DROPBOX_TAG_PREFIX = "dropbox:";
        @android.provider.Settings.Readable
        public static final java.lang.String ERROR_LOGCAT_PREFIX = "logcat_for_";
        @android.provider.Settings.Readable
        public static final java.lang.String MAX_ERROR_BYTES_PREFIX = "max_error_bytes_for_";
        @android.provider.Settings.Readable
        public static final java.lang.String SYS_FREE_STORAGE_LOG_INTERVAL = "sys_free_storage_log_interval";
        @android.provider.Settings.Readable
        public static final java.lang.String DISK_FREE_CHANGE_REPORTING_THRESHOLD = "disk_free_change_reporting_threshold";
        @android.provider.Settings.Readable
        public static final java.lang.String SYS_STORAGE_THRESHOLD_PERCENTAGE = "sys_storage_threshold_percentage";
        @android.provider.Settings.Readable
        public static final java.lang.String SYS_STORAGE_THRESHOLD_MAX_BYTES = "sys_storage_threshold_max_bytes";
        @android.provider.Settings.Readable
        public static final java.lang.String SYS_STORAGE_FULL_THRESHOLD_BYTES = "sys_storage_full_threshold_bytes";
        @android.provider.Settings.Readable
        public static final java.lang.String SYS_STORAGE_CACHE_PERCENTAGE = "sys_storage_cache_percentage";
        @android.provider.Settings.Readable
        public static final java.lang.String SYNC_MAX_RETRY_DELAY_IN_SECONDS = "sync_max_retry_delay_in_seconds";
        @android.provider.Settings.Readable
        public static final java.lang.String CONNECTIVITY_CHANGE_DELAY = "connectivity_change_delay";
        @android.provider.Settings.Readable
        public static final java.lang.String CONNECTIVITY_SAMPLING_INTERVAL_IN_SECONDS = "connectivity_sampling_interval_in_seconds";
        @android.provider.Settings.Readable
        public static final java.lang.String PAC_CHANGE_DELAY = "pac_change_delay";
        public static final int CAPTIVE_PORTAL_MODE_IGNORE = 0;
        public static final int CAPTIVE_PORTAL_MODE_PROMPT = 1;
        public static final int CAPTIVE_PORTAL_MODE_AVOID = 2;
        @android.provider.Settings.Readable
        public static final java.lang.String CAPTIVE_PORTAL_MODE = "captive_portal_mode";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String CAPTIVE_PORTAL_DETECTION_ENABLED = "captive_portal_detection_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String CAPTIVE_PORTAL_SERVER = "captive_portal_server";
        @android.provider.Settings.Readable
        public static final java.lang.String CAPTIVE_PORTAL_HTTPS_URL = "captive_portal_https_url";
        @android.provider.Settings.Readable
        public static final java.lang.String CAPTIVE_PORTAL_HTTP_URL = "captive_portal_http_url";
        @android.provider.Settings.Readable
        public static final java.lang.String CAPTIVE_PORTAL_FALLBACK_URL = "captive_portal_fallback_url";
        @android.provider.Settings.Readable
        public static final java.lang.String CAPTIVE_PORTAL_OTHER_FALLBACK_URLS = "captive_portal_other_fallback_urls";
        @android.provider.Settings.Readable
        public static final java.lang.String CAPTIVE_PORTAL_FALLBACK_PROBE_SPECS = "captive_portal_fallback_probe_specs";
        @android.provider.Settings.Readable
        public static final java.lang.String CAPTIVE_PORTAL_USE_HTTPS = "captive_portal_use_https";
        @android.provider.Settings.Readable
        public static final java.lang.String CAPTIVE_PORTAL_USER_AGENT = "captive_portal_user_agent";
        @android.provider.Settings.Readable
        public static final java.lang.String DATA_STALL_RECOVERY_ON_BAD_NETWORK = "data_stall_recovery_on_bad_network";
        @android.provider.Settings.Readable
        public static final java.lang.String MIN_DURATION_BETWEEN_RECOVERY_STEPS_IN_MS = "min_duration_between_recovery_steps";
        @android.provider.Settings.Readable
        public static final java.lang.String SET_INSTALL_LOCATION = "set_install_location";
        @android.provider.Settings.Readable
        public static final java.lang.String DEFAULT_INSTALL_LOCATION = "default_install_location";
        @android.provider.Settings.Readable
        public static final java.lang.String INET_CONDITION_DEBOUNCE_UP_DELAY = "inet_condition_debounce_up_delay";
        @android.provider.Settings.Readable
        public static final java.lang.String INET_CONDITION_DEBOUNCE_DOWN_DELAY = "inet_condition_debounce_down_delay";
        @android.provider.Settings.Readable
        public static final java.lang.String READ_EXTERNAL_STORAGE_ENFORCED_DEFAULT = "read_external_storage_enforced_default";
        @android.provider.Settings.Readable
        public static final java.lang.String HTTP_PROXY = "http_proxy";
        @android.provider.Settings.Readable
        public static final java.lang.String GLOBAL_HTTP_PROXY_HOST = "global_http_proxy_host";
        @android.provider.Settings.Readable
        public static final java.lang.String GLOBAL_HTTP_PROXY_PORT = "global_http_proxy_port";
        @android.provider.Settings.Readable
        public static final java.lang.String GLOBAL_HTTP_PROXY_EXCLUSION_LIST = "global_http_proxy_exclusion_list";
        @android.provider.Settings.Readable
        public static final java.lang.String GLOBAL_HTTP_PROXY_PAC = "global_proxy_pac_url";
        @android.provider.Settings.Readable
        public static final java.lang.String SET_GLOBAL_HTTP_PROXY = "set_global_http_proxy";
        @android.provider.Settings.Readable
        public static final java.lang.String DEFAULT_DNS_SERVER = "default_dns_server";
        @android.provider.Settings.Readable
        public static final java.lang.String PRIVATE_DNS_MODE = "private_dns_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String PRIVATE_DNS_SPECIFIER = "private_dns_specifier";
        @android.provider.Settings.Readable
        public static final java.lang.String PRIVATE_DNS_DEFAULT_MODE = "private_dns_default_mode";
        @android.provider.Settings.Readable
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLUETOOTH_BTSNOOP_DEFAULT_MODE = "bluetooth_btsnoop_default_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_HEADSET_PRIORITY_PREFIX = "bluetooth_headset_priority_";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_A2DP_SINK_PRIORITY_PREFIX = "bluetooth_a2dp_sink_priority_";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_A2DP_SRC_PRIORITY_PREFIX = "bluetooth_a2dp_src_priority_";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_A2DP_SUPPORTS_OPTIONAL_CODECS_PREFIX = "bluetooth_a2dp_supports_optional_codecs_";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_A2DP_OPTIONAL_CODECS_ENABLED_PREFIX = "bluetooth_a2dp_optional_codecs_enabled_";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_INPUT_DEVICE_PRIORITY_PREFIX = "bluetooth_input_device_priority_";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_MAP_PRIORITY_PREFIX = "bluetooth_map_priority_";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_MAP_CLIENT_PRIORITY_PREFIX = "bluetooth_map_client_priority_";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_PBAP_CLIENT_PRIORITY_PREFIX = "bluetooth_pbap_client_priority_";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_SAP_PRIORITY_PREFIX = "bluetooth_sap_priority_";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_PAN_PRIORITY_PREFIX = "bluetooth_pan_priority_";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_HEARING_AID_PRIORITY_PREFIX = "bluetooth_hearing_aid_priority_";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLE_RADIO_BUG_DETECTION = "enable_radio_bug_detection";
        @android.provider.Settings.Readable
        public static final java.lang.String RADIO_BUG_WAKELOCK_TIMEOUT_COUNT_THRESHOLD = "radio_bug_wakelock_timeout_count_threshold";
        @android.provider.Settings.Readable
        public static final java.lang.String RADIO_BUG_SYSTEM_ERROR_COUNT_THRESHOLD = "radio_bug_system_error_count_threshold";
        @android.provider.Settings.Readable
        public static final java.lang.String ACTIVITY_MANAGER_CONSTANTS = "activity_manager_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String ACTIVITY_STARTS_LOGGING_ENABLED = "activity_starts_logging_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String FOREGROUND_SERVICE_STARTS_LOGGING_ENABLED = "foreground_service_starts_logging_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String APP_BINDING_CONSTANTS = "app_binding_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String APP_OPS_CONSTANTS = "app_ops_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String BATTERY_SAVER_CONSTANTS = "battery_saver_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String BATTERY_SAVER_DEVICE_SPECIFIC_CONSTANTS = "battery_saver_device_specific_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String BATTERY_TIP_CONSTANTS = "battery_tip_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String ANOMALY_DETECTION_CONSTANTS = "anomaly_detection_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String ANOMALY_CONFIG_VERSION = "anomaly_config_version";
        @android.provider.Settings.Readable
        public static final java.lang.String ANOMALY_CONFIG = "anomaly_config";
        @android.provider.Settings.Readable
        public static final java.lang.String ALWAYS_ON_DISPLAY_CONSTANTS = "always_on_display_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String SYS_UIDCPUPOWER = "sys_uidcpupower";
        @android.provider.Settings.Readable
        public static final java.lang.String SYS_TRACED = "sys_traced";
        @android.provider.Settings.Readable
        public static final java.lang.String FPS_DEVISOR = "fps_divisor";
        @android.provider.Settings.Readable
        public static final java.lang.String DISPLAY_PANEL_LPM = "display_panel_lpm";
        @android.provider.Settings.Readable
        public static final java.lang.String APP_TIME_LIMIT_USAGE_SOURCE = "app_time_limit_usage_source";
        @android.provider.Settings.Readable
        public static final java.lang.String ART_VERIFIER_VERIFY_DEBUGGABLE = "art_verifier_verify_debuggable";
        @android.provider.Settings.Readable
        public static final java.lang.String POWER_MANAGER_CONSTANTS = "power_manager_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String SHORTCUT_MANAGER_CONSTANTS = "shortcut_manager_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String DEVICE_POLICY_CONSTANTS = "device_policy_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String TEXT_CLASSIFIER_CONSTANTS = "text_classifier_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String BATTERY_STATS_CONSTANTS = "battery_stats_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String SYNC_MANAGER_CONSTANTS = "sync_manager_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String BROADCAST_FG_CONSTANTS = "bcast_fg_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String BROADCAST_BG_CONSTANTS = "bcast_bg_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String BROADCAST_OFFLOAD_CONSTANTS = "bcast_offload_constants";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String APP_STANDBY_ENABLED = "app_standby_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ADAPTIVE_BATTERY_MANAGEMENT_ENABLED = "adaptive_battery_management_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLE_RESTRICTED_BUCKET = "enable_restricted_bucket";
        public static final int DEFAULT_ENABLE_RESTRICTED_BUCKET = 1;
        @android.provider.Settings.Readable
        public static final java.lang.String APP_AUTO_RESTRICTION_ENABLED = "app_auto_restriction_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String FORCED_APP_STANDBY_ENABLED = "forced_app_standby_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String FORCED_APP_STANDBY_FOR_SMALL_BATTERY_ENABLED = "forced_app_standby_for_small_battery_enabled";
        public static final java.lang.String ENABLE_TARE = "enable_tare";
        public static final int DEFAULT_ENABLE_TARE = 0;
        public static final java.lang.String ENABLE_TARE_ALARM_MANAGER = "enable_tare_alarm_manager";
        public static final int DEFAULT_ENABLE_TARE_ALARM_MANAGER = 0;
        public static final java.lang.String TARE_ALARM_MANAGER_CONSTANTS = "tare_alarm_manager_constants";
        public static final java.lang.String ENABLE_TARE_JOB_SCHEDULER = "enable_tare_job_scheduler";
        public static final int DEFAULT_ENABLE_TARE_JOB_SCHEDULER = 0;
        public static final java.lang.String TARE_JOB_SCHEDULER_CONSTANTS = "tare_job_scheduler_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String USER_ABSENT_RADIOS_OFF_FOR_SMALL_BATTERY_ENABLED = "user_absent_radios_off_for_small_battery_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String USER_ABSENT_TOUCH_OFF_FOR_SMALL_BATTERY_ENABLED = "user_absent_touch_off_for_small_battery_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_ON_WHEN_PROXY_DISCONNECTED = "wifi_on_when_proxy_disconnected";
        @android.provider.Settings.Readable
        public static final java.lang.String TIME_ONLY_MODE_CONSTANTS = "time_only_mode_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String UNGAZE_SLEEP_ENABLED = "ungaze_sleep_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String NETWORK_WATCHLIST_ENABLED = "network_watchlist_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_HIDDEN_LAUNCHER_ICON_APPS_ENABLED = "show_hidden_icon_apps_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_NEW_APP_INSTALLED_NOTIFICATION_ENABLED = "show_new_app_installed_notification_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String KEEP_PROFILE_IN_BACKGROUND = "keep_profile_in_background";
        public static final long DEFAULT_ADB_ALLOWED_CONNECTION_TIME = 604800000L;
        @android.provider.Settings.Readable
        public static final java.lang.String ADB_ALLOWED_CONNECTION_TIME = "adb_allowed_connection_time";
        @android.provider.Settings.Readable
        public static final java.lang.String WINDOW_ANIMATION_SCALE = "window_animation_scale";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String DISABLE_WINDOW_BLURS = "disable_window_blurs";
        @android.provider.Settings.Readable
        public static final java.lang.String TRANSITION_ANIMATION_SCALE = "transition_animation_scale";
        @android.provider.Settings.Readable
        public static final java.lang.String ANIMATOR_DURATION_SCALE = "animator_duration_scale";
        @android.provider.Settings.Readable
        public static final java.lang.String FANCY_IME_ANIMATIONS = "fancy_ime_animations";
        @android.provider.Settings.Readable
        public static final java.lang.String COMPATIBILITY_MODE = "compatibility_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String EMERGENCY_TONE = "emergency_tone";
        @android.provider.Settings.Readable
        public static final java.lang.String CALL_AUTO_RETRY = "call_auto_retry";
        @android.provider.Settings.Readable
        public static final java.lang.String EMERGENCY_AFFORDANCE_NEEDED = "emergency_affordance_needed";
        public static final java.lang.String EMERGENCY_GESTURE_POWER_BUTTON_COOLDOWN_PERIOD_MS = "emergency_gesture_power_button_cooldown_period_ms";
        public static final java.lang.String EMERGENCY_GESTURE_TAP_DETECTION_MIN_TIME_MS = "emergency_gesture_tap_detection_min_time_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLE_AUTOMATIC_SYSTEM_SERVER_HEAP_DUMPS = "enable_automatic_system_server_heap_dumps";
        @android.provider.Settings.Readable
        public static final java.lang.String PREFERRED_NETWORK_MODE = "preferred_network_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String DEBUG_APP = "debug_app";
        @android.provider.Settings.Readable
        public static final java.lang.String WAIT_FOR_DEBUGGER = "wait_for_debugger";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLE_GPU_DEBUG_LAYERS = "enable_gpu_debug_layers";
        @android.provider.Settings.Readable
        public static final java.lang.String GPU_DEBUG_APP = "gpu_debug_app";
        @android.provider.Settings.Readable
        public static final java.lang.String ANGLE_DEBUG_PACKAGE = "angle_debug_package";
        @android.provider.Settings.Readable
        public static final java.lang.String ANGLE_GL_DRIVER_ALL_ANGLE = "angle_gl_driver_all_angle";
        @android.provider.Settings.Readable
        public static final java.lang.String ANGLE_GL_DRIVER_SELECTION_PKGS = "angle_gl_driver_selection_pkgs";
        @android.provider.Settings.Readable
        public static final java.lang.String ANGLE_GL_DRIVER_SELECTION_VALUES = "angle_gl_driver_selection_values";
        @android.provider.Settings.Readable
        public static final java.lang.String ANGLE_EGL_FEATURES = "angle_egl_features";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_ANGLE_IN_USE_DIALOG_BOX = "show_angle_in_use_dialog_box";
        @android.provider.Settings.Readable
        public static final java.lang.String UPDATABLE_DRIVER_ALL_APPS = "updatable_driver_all_apps";
        @android.provider.Settings.Readable
        public static final java.lang.String UPDATABLE_DRIVER_PRODUCTION_OPT_IN_APPS = "updatable_driver_production_opt_in_apps";
        @android.provider.Settings.Readable
        public static final java.lang.String UPDATABLE_DRIVER_PRERELEASE_OPT_IN_APPS = "updatable_driver_prerelease_opt_in_apps";
        @android.provider.Settings.Readable
        public static final java.lang.String UPDATABLE_DRIVER_PRODUCTION_OPT_OUT_APPS = "updatable_driver_production_opt_out_apps";
        @android.provider.Settings.Readable
        public static final java.lang.String UPDATABLE_DRIVER_PRODUCTION_DENYLIST = "updatable_driver_production_denylist";
        @android.provider.Settings.Readable
        public static final java.lang.String UPDATABLE_DRIVER_PRODUCTION_DENYLISTS = "updatable_driver_production_denylists";
        @android.provider.Settings.Readable
        public static final java.lang.String UPDATABLE_DRIVER_PRODUCTION_ALLOWLIST = "updatable_driver_production_allowlist";
        @android.provider.Settings.Readable
        public static final java.lang.String UPDATABLE_DRIVER_SPHAL_LIBRARIES = "updatable_driver_sphal_libraries";
        @android.provider.Settings.Readable
        public static final java.lang.String GPU_DEBUG_LAYERS = "gpu_debug_layers";
        @android.provider.Settings.Readable
        public static final java.lang.String GPU_DEBUG_LAYERS_GLES = "gpu_debug_layers_gles";
        @android.provider.Settings.Readable
        public static final java.lang.String GPU_DEBUG_LAYER_APP = "gpu_debug_layer_app";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_PROCESSES = "show_processes";
        @android.provider.Settings.Readable
        public static final java.lang.String LOW_POWER_MODE = "low_power";
        @android.provider.Settings.Readable
        public static final java.lang.String LOW_POWER_MODE_STICKY = "low_power_sticky";
        @android.provider.Settings.Readable
        public static final java.lang.String LOW_POWER_MODE_STICKY_AUTO_DISABLE_LEVEL = "low_power_sticky_auto_disable_level";
        @android.provider.Settings.Readable
        public static final java.lang.String LOW_POWER_MODE_STICKY_AUTO_DISABLE_ENABLED = "low_power_sticky_auto_disable_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String LOW_POWER_MODE_TRIGGER_LEVEL = "low_power_trigger_level";
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOMATIC_POWER_SAVE_MODE = "automatic_power_save_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String DYNAMIC_POWER_SAVINGS_DISABLE_THRESHOLD = "dynamic_power_savings_disable_threshold";
        @android.provider.Settings.Readable
        public static final java.lang.String DYNAMIC_POWER_SAVINGS_ENABLED = "dynamic_power_savings_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String TIME_REMAINING_ESTIMATE_MILLIS = "time_remaining_estimate_millis";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String TIME_REMAINING_ESTIMATE_BASED_ON_USAGE = "time_remaining_estimate_based_on_usage";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String AVERAGE_TIME_TO_DISCHARGE = "average_time_to_discharge";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String BATTERY_ESTIMATES_LAST_UPDATE_TIME = "battery_estimates_last_update_time";
        @android.provider.Settings.Readable
        public static final java.lang.String LOW_POWER_MODE_TRIGGER_LEVEL_MAX = "low_power_trigger_level_max";
        @android.provider.Settings.Readable
        public static final java.lang.String LOW_POWER_MODE_SUGGESTION_PARAMS = "low_power_mode_suggestion_params";
        @android.provider.Settings.Readable
        public static final java.lang.String ALWAYS_FINISH_ACTIVITIES = "always_finish_activities";
        @android.provider.Settings.Readable
        public static final java.lang.String HIDE_ERROR_DIALOGS = "hide_error_dialogs";
        @android.provider.Settings.Readable
        public static final java.lang.String DOCK_AUDIO_MEDIA_ENABLED = "dock_audio_media_enabled";
        public static final int ENCODED_SURROUND_OUTPUT_AUTO = 0;
        public static final int ENCODED_SURROUND_OUTPUT_NEVER = 1;
        public static final int ENCODED_SURROUND_OUTPUT_ALWAYS = 2;
        public static final int ENCODED_SURROUND_OUTPUT_MANUAL = 3;
        public static final int ENCODED_SURROUND_SC_MAX = 3;
        @android.provider.Settings.Readable
        public static final java.lang.String ENCODED_SURROUND_OUTPUT = "encoded_surround_output";
        @android.provider.Settings.Readable
        public static final java.lang.String ENCODED_SURROUND_OUTPUT_ENABLED_FORMATS = "encoded_surround_output_enabled_formats";
        @android.provider.Settings.Readable
        public static final java.lang.String AUDIO_SAFE_VOLUME_STATE = "audio_safe_volume_state";
        @android.provider.Settings.Readable
        public static final java.lang.String TZINFO_UPDATE_CONTENT_URL = "tzinfo_content_url";
        @android.provider.Settings.Readable
        public static final java.lang.String TZINFO_UPDATE_METADATA_URL = "tzinfo_metadata_url";
        @android.provider.Settings.Readable
        public static final java.lang.String SELINUX_UPDATE_CONTENT_URL = "selinux_content_url";
        @android.provider.Settings.Readable
        public static final java.lang.String SELINUX_UPDATE_METADATA_URL = "selinux_metadata_url";
        @android.provider.Settings.Readable
        public static final java.lang.String SMS_SHORT_CODES_UPDATE_CONTENT_URL = "sms_short_codes_content_url";
        @android.provider.Settings.Readable
        public static final java.lang.String SMS_SHORT_CODES_UPDATE_METADATA_URL = "sms_short_codes_metadata_url";
        @android.provider.Settings.Readable
        public static final java.lang.String APN_DB_UPDATE_CONTENT_URL = "apn_db_content_url";
        @android.provider.Settings.Readable
        public static final java.lang.String APN_DB_UPDATE_METADATA_URL = "apn_db_metadata_url";
        @android.provider.Settings.Readable
        public static final java.lang.String CERT_PIN_UPDATE_CONTENT_URL = "cert_pin_content_url";
        @android.provider.Settings.Readable
        public static final java.lang.String CERT_PIN_UPDATE_METADATA_URL = "cert_pin_metadata_url";
        @android.provider.Settings.Readable
        public static final java.lang.String INTENT_FIREWALL_UPDATE_CONTENT_URL = "intent_firewall_content_url";
        @android.provider.Settings.Readable
        public static final java.lang.String INTENT_FIREWALL_UPDATE_METADATA_URL = "intent_firewall_metadata_url";
        @android.provider.Settings.Readable
        public static final java.lang.String LANG_ID_UPDATE_CONTENT_URL = "lang_id_content_url";
        @android.provider.Settings.Readable
        public static final java.lang.String LANG_ID_UPDATE_METADATA_URL = "lang_id_metadata_url";
        @android.provider.Settings.Readable
        public static final java.lang.String SMART_SELECTION_UPDATE_CONTENT_URL = "smart_selection_content_url";
        @android.provider.Settings.Readable
        public static final java.lang.String SMART_SELECTION_UPDATE_METADATA_URL = "smart_selection_metadata_url";
        @android.provider.Settings.Readable
        public static final java.lang.String CONVERSATION_ACTIONS_UPDATE_CONTENT_URL = "conversation_actions_content_url";
        @android.provider.Settings.Readable
        public static final java.lang.String CONVERSATION_ACTIONS_UPDATE_METADATA_URL = "conversation_actions_metadata_url";
        @android.provider.Settings.Readable
        public static final java.lang.String SELINUX_STATUS = "selinux_status";
        @android.provider.Settings.Readable
        public static final java.lang.String DEVELOPMENT_FORCE_RTL = "debug.force_rtl";
        @android.provider.Settings.Readable
        public static final java.lang.String LOW_BATTERY_SOUND_TIMEOUT = "low_battery_sound_timeout";
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_BOUNCE_DELAY_OVERRIDE_MS = "wifi_bounce_delay_override_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String POLICY_CONTROL = "policy_control";
        @android.provider.Settings.Readable
        public static final java.lang.String EMULATE_DISPLAY_CUTOUT = "emulate_display_cutout";
        public static final int EMULATE_DISPLAY_CUTOUT_OFF = 0;
        public static final int EMULATE_DISPLAY_CUTOUT_ON = 1;
        @android.provider.Settings.Readable
        public static final java.lang.String BLOCKED_SLICES = "blocked_slices";
        @android.provider.Settings.Readable
        public static final java.lang.String ZEN_MODE = "zen_mode";
        public static final int ZEN_MODE_OFF = 0;
        public static final int ZEN_MODE_IMPORTANT_INTERRUPTIONS = 1;
        public static final int ZEN_MODE_NO_INTERRUPTIONS = 2;
        public static final int ZEN_MODE_ALARMS = 3;
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String USER_DISABLED_HDR_FORMATS = "user_disabled_hdr_formats";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String ARE_USER_DISABLED_HDR_FORMATS_ALLOWED = "are_user_disabled_hdr_formats_allowed";
        public static final java.lang.String DEVICE_CONFIG_SYNC_DISABLED = "device_config_sync_disabled";
        public static final java.lang.String ENABLE_BACK_ANIMATION = "enable_back_animation";
        @android.provider.Settings.Readable
        public static final java.lang.String ZEN_MODE_RINGER_LEVEL = "zen_mode_ringer_level";
        @android.provider.Settings.Readable
        public static final java.lang.String ZEN_MODE_CONFIG_ETAG = "zen_mode_config_etag";
        @java.lang.Deprecated
        public static final java.lang.String ZEN_DURATION = "zen_duration";
        @java.lang.Deprecated
        public static final int ZEN_DURATION_PROMPT = -1;
        @java.lang.Deprecated
        public static final int ZEN_DURATION_FOREVER = 0;
        @android.provider.Settings.Readable
        public static final java.lang.String HEADS_UP_NOTIFICATIONS_ENABLED = "heads_up_notifications_enabled";
        public static final int HEADS_UP_OFF = 0;
        public static final int HEADS_UP_ON = 1;
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String USER_PREFERRED_REFRESH_RATE = "user_preferred_refresh_rate";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String USER_PREFERRED_RESOLUTION_HEIGHT = "user_preferred_resolution_height";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String USER_PREFERRED_RESOLUTION_WIDTH = "user_preferred_resolution_width";
        @android.provider.Settings.Readable
        public static final java.lang.String DEVICE_NAME = "device_name";
        @android.provider.Settings.Readable
        public static final java.lang.String NETWORK_SCORING_PROVISIONED = "network_scoring_provisioned";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String REQUIRE_PASSWORD_TO_DECRYPT = "require_password_to_decrypt";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String ENHANCED_4G_MODE_ENABLED = "volte_vt_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String VT_IMS_ENABLED = "vt_ims_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WFC_IMS_ENABLED = "wfc_ims_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WFC_IMS_MODE = "wfc_ims_mode";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WFC_IMS_ROAMING_MODE = "wfc_ims_roaming_mode";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WFC_IMS_ROAMING_ENABLED = "wfc_ims_roaming_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String LTE_SERVICE_FORCED = "lte_service_forced";
        @android.provider.Settings.Readable
        public static final java.lang.String LID_BEHAVIOR = "lid_behavior";
        @android.provider.Settings.Readable
        public static final java.lang.String EPHEMERAL_COOKIE_MAX_SIZE_BYTES = "ephemeral_cookie_max_size_bytes";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLE_EPHEMERAL_FEATURE = "enable_ephemeral_feature";
        @android.provider.Settings.Readable
        public static final java.lang.String INSTANT_APP_DEXOPT_ENABLED = "instant_app_dexopt_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String INSTALLED_INSTANT_APP_MIN_CACHE_PERIOD = "installed_instant_app_min_cache_period";
        @android.provider.Settings.Readable
        public static final java.lang.String INSTALLED_INSTANT_APP_MAX_CACHE_PERIOD = "installed_instant_app_max_cache_period";
        @android.provider.Settings.Readable
        public static final java.lang.String UNINSTALLED_INSTANT_APP_MIN_CACHE_PERIOD = "uninstalled_instant_app_min_cache_period";
        @android.provider.Settings.Readable
        public static final java.lang.String UNINSTALLED_INSTANT_APP_MAX_CACHE_PERIOD = "uninstalled_instant_app_max_cache_period";
        @android.provider.Settings.Readable
        public static final java.lang.String UNUSED_STATIC_SHARED_LIB_MIN_CACHE_PERIOD = "unused_static_shared_lib_min_cache_period";
        @android.provider.Settings.Readable
        public static final java.lang.String ALLOW_USER_SWITCHING_WHEN_SYSTEM_USER_LOCKED = "allow_user_switching_when_system_user_locked";
        @android.provider.Settings.Readable
        public static final java.lang.String BOOT_COUNT = "boot_count";
        @android.provider.Settings.Readable
        public static final java.lang.String SAFE_BOOT_DISALLOWED = "safe_boot_disallowed";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String DEVICE_DEMO_MODE = "device_demo_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String DATABASE_DOWNGRADE_REASON = "database_downgrade_reason";
        @android.provider.Settings.Readable
        public static final java.lang.String DATABASE_CREATION_BUILDID = "database_creation_buildid";
        @android.provider.Settings.Readable
        public static final java.lang.String CONTACTS_DATABASE_WAL_ENABLED = "contacts_database_wal_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCATION_SETTINGS_LINK_TO_PERMISSIONS_ENABLED = "location_settings_link_to_permissions_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String EUICC_REMOVING_INVISIBLE_PROFILES_TIMEOUT_MILLIS = "euicc_removing_invisible_profiles_timeout_millis";
        @android.provider.Settings.Readable
        public static final java.lang.String EUICC_FACTORY_RESET_TIMEOUT_MILLIS = "euicc_factory_reset_timeout_millis";
        public static final java.lang.String EUICC_SWITCH_SLOT_TIMEOUT_MILLIS = "euicc_switch_slot_timeout_millis";
        public static final java.lang.String ENABLE_MULTI_SLOT_TIMEOUT_MILLIS = "enable_multi_slot_timeout_millis";
        @android.provider.Settings.Readable
        public static final java.lang.String STORAGE_SETTINGS_CLOBBER_THRESHOLD = "storage_settings_clobber_threshold";
        @android.provider.Settings.Readable
        public static final java.lang.String OVERRIDE_SETTINGS_PROVIDER_RESTORE_ANY_VERSION = "override_settings_provider_restore_any_version";
        @android.provider.Settings.Readable
        public static final java.lang.String CHAINED_BATTERY_ATTRIBUTION_ENABLED = "chained_battery_attribution_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLE_ADB_INCREMENTAL_INSTALL_DEFAULT = "enable_adb_incremental_install_default";
        @java.lang.Deprecated
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOFILL_COMPAT_MODE_ALLOWED_PACKAGES = "autofill_compat_mode_allowed_packages";
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOFILL_LOGGING_LEVEL = "autofill_logging_level";
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOFILL_MAX_PARTITIONS_SIZE = "autofill_max_partitions_size";
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOFILL_MAX_VISIBLE_DATASETS = "autofill_max_visible_datasets";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String STYLUS_HANDWRITING_ENABLED = "stylus_handwriting_enabled";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String STYLUS_EVER_USED = "stylus_ever_used";
        @android.provider.Settings.Readable
        public static final java.lang.String HIDDEN_API_BLACKLIST_EXEMPTIONS = "hidden_api_blacklist_exemptions";
        @android.provider.Settings.Readable
        public static final java.lang.String HIDDEN_API_POLICY = "hidden_api_policy";
        public static final java.lang.String FORCE_NON_DEBUGGABLE_FINAL_BUILD_FOR_COMPAT = "force_non_debuggable_final_build_for_compat";
        @android.provider.Settings.Readable
        public static final java.lang.String SIGNED_CONFIG_VERSION = "signed_config_version";
        @android.provider.Settings.Readable
        public static final java.lang.String SOUND_TRIGGER_DETECTION_SERVICE_OP_TIMEOUT = "sound_trigger_detection_service_op_timeout";
        @android.provider.Settings.Readable
        public static final java.lang.String MAX_SOUND_TRIGGER_DETECTION_SERVICE_OPS_PER_DAY = "max_sound_trigger_detection_service_ops_per_day";
        public static final java.lang.String CLOCKWORK_HOME_READY = "clockwork_home_ready";
        @android.provider.Settings.Readable
        public static final java.lang.String AWARE_ALLOWED = "aware_allowed";
        @android.provider.Settings.Readable
        public static final java.lang.String POWER_BUTTON_LONG_PRESS = "power_button_long_press";
        @android.provider.Settings.Readable
        public static final java.lang.String POWER_BUTTON_LONG_PRESS_DURATION_MS = "power_button_long_press_duration_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String POWER_BUTTON_VERY_LONG_PRESS = "power_button_very_long_press";
        @android.provider.Settings.Readable
        public static final java.lang.String KEY_CHORD_POWER_VOLUME_UP = "key_chord_power_volume_up";
        public static final int ONE_HANDED_KEYGUARD_SIDE_LEFT = 0;
        public static final int ONE_HANDED_KEYGUARD_SIDE_RIGHT = 1;
        public static final java.lang.String ONE_HANDED_KEYGUARD_SIDE = "one_handed_keyguard_side";
        public static final java.lang.String[] TRANSIENT_SETTINGS = null;
        public static final java.lang.String[] LEGACY_RESTORE_SETTINGS = null;
        @android.provider.Settings.Readable
        public static final java.lang.String MULTI_SIM_VOICE_CALL_SUBSCRIPTION = "multi_sim_voice_call";
        @android.provider.Settings.Readable
        public static final java.lang.String MULTI_SIM_VOICE_PROMPT = "multi_sim_voice_prompt";
        @android.provider.Settings.Readable
        public static final java.lang.String MULTI_SIM_DATA_CALL_SUBSCRIPTION = "multi_sim_data_call";
        @android.provider.Settings.Readable
        public static final java.lang.String MULTI_SIM_SMS_SUBSCRIPTION = "multi_sim_sms";
        @android.provider.Settings.Readable
        public static final java.lang.String MULTI_SIM_SMS_PROMPT = "multi_sim_sms_prompt";
        @android.provider.Settings.Readable
        public static final java.lang.String[] MULTI_SIM_USER_PREFERRED_SUBS = null;
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLED_SUBSCRIPTION_FOR_SLOT = "enabled_subscription_for_slot";
        @android.provider.Settings.Readable
        public static final java.lang.String MODEM_STACK_ENABLED_FOR_SLOT = "modem_stack_enabled_for_slot";
        @android.provider.Settings.Readable
        public static final java.lang.String NEW_CONTACT_AGGREGATOR = "new_contact_aggregator";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String CONTACT_METADATA_SYNC = "contact_metadata_sync";
        @android.provider.Settings.Readable
        public static final java.lang.String CONTACT_METADATA_SYNC_ENABLED = "contact_metadata_sync_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLE_CELLULAR_ON_BOOT = "enable_cellular_on_boot";
        @android.provider.Settings.Readable
        public static final java.lang.String MAX_NOTIFICATION_ENQUEUE_RATE = "max_notification_enqueue_rate";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_NOTIFICATION_CHANNEL_WARNINGS = "show_notification_channel_warnings";
        @android.provider.Settings.Readable
        public static final java.lang.String CELL_ON = "cell_on";
        public static final java.util.Set<java.lang.String> INSTANT_APP_SETTINGS = null;
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_TEMPERATURE_WARNING = "show_temperature_warning";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_USB_TEMPERATURE_ALARM = "show_usb_temperature_alarm";
        @android.provider.Settings.Readable
        public static final java.lang.String WARNING_TEMPERATURE = "warning_temperature";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLE_DISKSTATS_LOGGING = "enable_diskstats_logging";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLE_CACHE_QUOTA_CALCULATION = "enable_cache_quota_calculation";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLE_DELETION_HELPER_NO_THRESHOLD_TOGGLE = "enable_deletion_helper_no_threshold_toggle";
        @android.provider.Settings.Readable
        public static final java.lang.String NOTIFICATION_SNOOZE_OPTIONS = "notification_snooze_options";
        public static final java.lang.String NOTIFICATION_FEEDBACK_ENABLED = "notification_feedback_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String BLOCKING_HELPER_DISMISS_TO_VIEW_RATIO_LIMIT = "blocking_helper_dismiss_to_view_ratio";
        @android.provider.Settings.Readable
        public static final java.lang.String BLOCKING_HELPER_STREAK_LIMIT = "blocking_helper_streak_limit";
        @android.provider.Settings.Readable
        public static final java.lang.String SQLITE_COMPATIBILITY_WAL_FLAGS = "sqlite_compatibility_wal_flags";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLE_GNSS_RAW_MEAS_FULL_TRACKING = "enable_gnss_raw_meas_full_tracking";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String INSTALL_CARRIER_APP_NOTIFICATION_PERSISTENT = "install_carrier_app_notification_persistent";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String INSTALL_CARRIER_APP_NOTIFICATION_SLEEP_MILLIS = "install_carrier_app_notification_sleep_millis";
        @android.provider.Settings.Readable
        public static final java.lang.String ZRAM_ENABLED = "zram_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String CACHED_APPS_FREEZER_ENABLED = "cached_apps_freezer";
        @android.provider.Settings.Readable
        public static final java.lang.String SMART_REPLIES_IN_NOTIFICATIONS_FLAGS = "smart_replies_in_notifications_flags";
        @android.provider.Settings.Readable
        public static final java.lang.String SMART_SUGGESTIONS_IN_NOTIFICATIONS_FLAGS = "smart_suggestions_in_notifications_flags";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String SHOW_FIRST_CRASH_DIALOG = "show_first_crash_dialog";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_RESTART_IN_CRASH_DIALOG = "show_restart_in_crash_dialog";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_MUTE_IN_CRASH_DIALOG = "show_mute_in_crash_dialog";
        @java.lang.Deprecated
        public static final java.lang.String SHOW_ZEN_UPGRADE_NOTIFICATION = "show_zen_upgrade_notification";
        @java.lang.Deprecated
        public static final java.lang.String SHOW_ZEN_SETTINGS_SUGGESTION = "show_zen_settings_suggestion";
        @java.lang.Deprecated
        public static final java.lang.String ZEN_SETTINGS_UPDATED = "zen_settings_updated";
        @java.lang.Deprecated
        public static final java.lang.String ZEN_SETTINGS_SUGGESTION_VIEWED = "zen_settings_suggestion_viewed";
        @android.provider.Settings.Readable
        public static final java.lang.String BACKUP_AGENT_TIMEOUT_PARAMETERS = "backup_agent_timeout_parameters";
        public static final java.lang.String GNSS_SATELLITE_BLOCKLIST = "gnss_satellite_blocklist";
        @android.provider.Settings.Readable
        public static final java.lang.String GNSS_HAL_LOCATION_REQUEST_DURATION_MILLIS = "gnss_hal_location_request_duration_millis";
        @android.provider.Settings.Readable
        public static final java.lang.String BINDER_CALLS_STATS = "binder_calls_stats";
        @android.provider.Settings.Readable
        public static final java.lang.String LOOPER_STATS = "looper_stats";
        @android.provider.Settings.Readable
        public static final java.lang.String KERNEL_CPU_THREAD_READER = "kernel_cpu_thread_reader";
        @android.provider.Settings.Readable
        public static final java.lang.String NATIVE_FLAGS_HEALTH_CHECK_ENABLED = "native_flags_health_check_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String APPOP_HISTORY_MODE = "mode";
        @android.provider.Settings.Readable
        public static final java.lang.String APPOP_HISTORY_BASE_INTERVAL_MILLIS = "baseIntervalMillis";
        @android.provider.Settings.Readable
        public static final java.lang.String APPOP_HISTORY_INTERVAL_MULTIPLIER = "intervalMultiplier";
        @android.provider.Settings.Readable
        public static final java.lang.String APPOP_HISTORY_PARAMETERS = "appop_history_parameters";
        @android.provider.Settings.Readable
        public static final java.lang.String AUTO_REVOKE_PARAMETERS = "auto_revoke_parameters";
        @android.provider.Settings.Readable
        public static final java.lang.String BATTERY_CHARGING_STATE_UPDATE_DELAY = "battery_charging_state_update_delay";
        @android.provider.Settings.Readable
        public static final java.lang.String TEXT_CLASSIFIER_ACTION_MODEL_PARAMS = "text_classifier_action_model_params";
        @android.provider.Settings.Readable
        public static final java.lang.String POWER_BUTTON_SUPPRESSION_DELAY_AFTER_GESTURE_WAKE = "power_button_suppression_delay_after_gesture_wake";
        @android.provider.Settings.Readable
        public static final java.lang.String ADVANCED_BATTERY_USAGE_AMOUNT = "advanced_battery_usage_amount";
        @android.provider.Settings.Readable
        public static final java.lang.String NR_NSA_TRACKING_SCREEN_OFF_MODE = "nr_nsa_tracking_screen_off_mode";
        public static final java.lang.String SHOW_PEOPLE_SPACE = "show_people_space";
        public static final java.lang.String PEOPLE_SPACE_CONVERSATION_TYPE = "people_space_conversation_type";
        public static final java.lang.String SHOW_NEW_NOTIF_DISMISS = "show_new_notif_dismiss";
        @android.provider.Settings.Readable
        public static final java.lang.String BLOCK_UNTRUSTED_TOUCHES_MODE = "block_untrusted_touches";
        @android.provider.Settings.Readable
        public static final java.lang.String MAXIMUM_OBSCURING_OPACITY_FOR_TOUCH = "maximum_obscuring_opacity_for_touch";
        public static final java.lang.String RESTRICTED_NETWORKING_MODE = "restricted_networking_mode";
        public static final java.lang.String LOW_POWER_STANDBY_ENABLED = "low_power_standby_enabled";
        public static final java.lang.String LOW_POWER_STANDBY_ACTIVE_DURING_MAINTENANCE = "low_power_standby_active_during_maintenance";
        public static final java.lang.String WATCHDOG_TIMEOUT_MILLIS = "system_server_watchdog_timeout_ms";
        public static final java.lang.String MANAGED_PROVISIONING_DEFER_PROVISIONING_TO_ROLE_HOLDER = "managed_provisioning_defer_provisioning_to_role_holder";
        public static final java.lang.String REVIEW_PERMISSIONS_NOTIFICATION_STATE = "review_permissions_notification_state";
        public Global() { super(); }
        public static java.lang.String zenModeToString(int p0) { return null; }
        public static boolean isValidZenMode(int p0) { return false; }
        public static void getMovedToSecureSettings(java.util.Set<java.lang.String> p0) {}
        public static void getMovedToSystemSettings(java.util.Set<java.lang.String> p0) {}
        public static void clearProviderForTest() {}
        public static void getPublicSettings(java.util.Set<java.lang.String> p0, java.util.Set<java.lang.String> p1, android.util.ArrayMap<java.lang.String, java.lang.Integer> p2) {}
        public static java.lang.String getString(android.content.ContentResolver p0, java.lang.String p1) { return null; }
        public static java.lang.String getStringForUser(android.content.ContentResolver p0, java.lang.String p1, int p2) { return null; }
        public static boolean putString(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2) { return false; }
        @android.annotation.RequiresPermission("android.permission.MODIFY_SETTINGS_OVERRIDEABLE_BY_RESTORE")
        public static boolean putString(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5) { return false; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
        public static boolean putString(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) { return false; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
        public static void resetToDefaults(android.content.ContentResolver p0, java.lang.String p1) {}
        public static void resetToDefaultsAsUser(android.content.ContentResolver p0, java.lang.String p1, int p2, int p3) {}
        public static boolean putStringForUser(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, int p3) { return false; }
        public static boolean putStringForUser(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4, int p5, boolean p6) { return false; }
        public static android.net.Uri getUriFor(java.lang.String p0) { return null; }
        public static int getInt(android.content.ContentResolver p0, java.lang.String p1, int p2) { return 0; }
        public static int getInt(android.content.ContentResolver p0, java.lang.String p1) throws android.provider.Settings.SettingNotFoundException { return 0; }
        public static boolean putInt(android.content.ContentResolver p0, java.lang.String p1, int p2) { return false; }
        public static long getLong(android.content.ContentResolver p0, java.lang.String p1, long p2) { return 0L; }
        public static long getLong(android.content.ContentResolver p0, java.lang.String p1) throws android.provider.Settings.SettingNotFoundException { return 0L; }
        public static boolean putLong(android.content.ContentResolver p0, java.lang.String p1, long p2) { return false; }
        public static float getFloat(android.content.ContentResolver p0, java.lang.String p1, float p2) { return 0.0f; }
        public static float getFloat(android.content.ContentResolver p0, java.lang.String p1) throws android.provider.Settings.SettingNotFoundException { return 0.0f; }
        public static boolean putFloat(android.content.ContentResolver p0, java.lang.String p1, float p2) { return false; }

        public static class Wearable {
            public static final java.lang.String HAS_PAY_TOKENS = "has_pay_tokens";
            public static final java.lang.String GMS_CHECKIN_TIMEOUT_MIN = "gms_checkin_timeout_min";
            public static final java.lang.String HOTWORD_DETECTION_ENABLED = "hotword_detection_enabled";
            public static final java.lang.String SMART_REPLIES_ENABLED = "smart_replies_enabled";
            public static final java.lang.String DEFAULT_VIBRATION = "default_vibration";
            public static final java.lang.String OBTAIN_PAIRED_DEVICE_LOCATION = "obtain_paired_device_location";
            public static final java.lang.String RETAIL_MODE = "retail_mode";
            public static final int RETAIL_MODE_CONSUMER = 0;
            public static final int RETAIL_MODE_RETAIL = 1;
            public static final java.lang.String PHONE_PLAY_STORE_AVAILABILITY = "phone_play_store_availability";
            public static final int PHONE_PLAY_STORE_AVAILABILITY_UNKNOWN = 0;
            public static final int PHONE_PLAY_STORE_AVAILABLE = 1;
            public static final int PHONE_PLAY_STORE_UNAVAILABLE = 2;
            public static final java.lang.String BUG_REPORT = "bug_report";
            public static final int BUG_REPORT_DISABLED = 0;
            public static final int BUG_REPORT_ENABLED = 1;
            public static final java.lang.String SMART_ILLUMINATE_ENABLED = "smart_illuminate_enabled";
            public static final java.lang.String CLOCKWORK_AUTO_TIME = "clockwork_auto_time";
            public static final int SYNC_TIME_FROM_PHONE = 0;
            public static final int SYNC_TIME_FROM_NETWORK = 1;
            public static final int AUTO_TIME_OFF = 2;
            public static final int INVALID_AUTO_TIME_STATE = 3;
            public static final java.lang.String CLOCKWORK_AUTO_TIME_ZONE = "clockwork_auto_time_zone";
            public static final int SYNC_TIME_ZONE_FROM_PHONE = 0;
            public static final int SYNC_TIME_ZONE_FROM_NETWORK = 1;
            public static final int AUTO_TIME_ZONE_OFF = 2;
            public static final int INVALID_AUTO_TIME_ZONE_STATE = 3;
            public static final java.lang.String CLOCKWORK_24HR_TIME = "clockwork_24hr_time";
            public static final java.lang.String AUTO_WIFI = "auto_wifi";
            public static final int AUTO_WIFI_DISABLED = 0;
            public static final int AUTO_WIFI_ENABLED = 1;
            public static final java.lang.String WIFI_POWER_SAVE = "wifi_power_save";
            public static final java.lang.String ALT_BYPASS_WIFI_REQUIREMENT_TIME_MILLIS = "alt_bypass_wifi_requirement_time_millis";
            public static final java.lang.String SETUP_SKIPPED = "setup_skipped";
            public static final int SETUP_SKIPPED_UNKNOWN = 0;
            public static final int SETUP_SKIPPED_YES = 1;
            public static final int SETUP_SKIPPED_NO = 2;
            public static final java.lang.String LAST_CALL_FORWARD_ACTION = "last_call_forward_action";
            public static final int CALL_FORWARD_ACTION_ON = 1;
            public static final int CALL_FORWARD_ACTION_OFF = 2;
            public static final int CALL_FORWARD_NO_LAST_ACTION = -1;
            public static final java.lang.String STEM_1_TYPE = "STEM_1_TYPE";
            public static final java.lang.String STEM_1_DATA = "STEM_1_DATA";
            public static final java.lang.String STEM_1_DEFAULT_DATA = "STEM_1_DEFAULT_DATA";
            public static final java.lang.String STEM_2_TYPE = "STEM_2_TYPE";
            public static final java.lang.String STEM_2_DATA = "STEM_2_DATA";
            public static final java.lang.String STEM_2_DEFAULT_DATA = "STEM_2_DEFAULT_DATA";
            public static final java.lang.String STEM_3_TYPE = "STEM_3_TYPE";
            public static final java.lang.String STEM_3_DATA = "STEM_3_DATA";
            public static final java.lang.String STEM_3_DEFAULT_DATA = "STEM_3_DEFAULT_DATA";
            public static final int STEM_TYPE_UNKNOWN = -1;
            public static final int STEM_TYPE_APP_LAUNCH = 0;
            public static final int STEM_TYPE_CONTACT_LAUNCH = 1;
            public static final java.lang.String MUTE_WHEN_OFF_BODY_ENABLED = "obtain_mute_when_off_body";
            public static final java.lang.String WEAR_OS_VERSION_STRING = "wear_os_version_string";
            public static final java.lang.String CORNER_ROUNDNESS = "corner_roundness";
            public static final java.lang.String BUTTON_SET = "button_set";
            public static final java.lang.String SIDE_BUTTON = "side_button";
            public static final java.lang.String ANDROID_WEAR_VERSION = "android_wear_version";
            public static final java.lang.String SYSTEM_CAPABILITIES = "system_capabilities";
            public static final java.lang.String SYSTEM_EDITION = "android_wear_system_edition";
            public static final java.lang.String WEAR_PLATFORM_MR_NUMBER = "wear_platform_mr_number";
            public static final java.lang.String MOBILE_SIGNAL_DETECTOR = "mobile_signal_detector";
            public static final java.lang.String AMBIENT_ENABLED = "ambient_enabled";
            public static final java.lang.String AMBIENT_TILT_TO_WAKE = "ambient_tilt_to_wake";
            public static final java.lang.String AMBIENT_LOW_BIT_ENABLED_DEV = "ambient_low_bit_enabled_dev";
            public static final java.lang.String AMBIENT_TOUCH_TO_WAKE = "ambient_touch_to_wake";
            public static final java.lang.String AMBIENT_TILT_TO_BRIGHT = "ambient_tilt_to_bright";
            public static final java.lang.String DECOMPOSABLE_WATCHFACE = "current_watchface_decomposable";
            public static final java.lang.String AMBIENT_FORCE_WHEN_DOCKED = "ambient_force_when_docked";
            public static final java.lang.String AMBIENT_LOW_BIT_ENABLED = "ambient_low_bit_enabled";
            public static final java.lang.String AMBIENT_PLUGGED_TIMEOUT_MIN = "ambient_plugged_timeout_min";
            public static final java.lang.String PAIRED_DEVICE_OS_TYPE = "paired_device_os_type";
            public static final int PAIRED_DEVICE_OS_TYPE_UNKNOWN = 0;
            public static final int PAIRED_DEVICE_OS_TYPE_ANDROID = 1;
            public static final int PAIRED_DEVICE_OS_TYPE_IOS = 2;
            public static final java.lang.String COMPANION_BLE_ROLE = "companion_ble_role";
            public static final int BLUETOOTH_ROLE_CENTRAL = 1;
            public static final int BLUETOOTH_ROLE_PERIPHERAL = 2;
            public static final java.lang.String COMPANION_NAME = "companion_bt_name";
            public static final java.lang.String USER_HFP_CLIENT_SETTING = "user_hfp_client_setting";
            public static final int HFP_CLIENT_UNSET = 0;
            public static final int HFP_CLIENT_ENABLED = 1;
            public static final int HFP_CLIENT_DISABLED = 2;
            public static final java.lang.String COMPANION_OS_VERSION = "wear_companion_os_version";
            public static final int COMPANION_OS_VERSION_UNDEFINED = -1;
            public static final java.lang.String ENABLE_ALL_LANGUAGES = "enable_all_languages";
            public static final java.lang.String SETUP_LOCALE = "setup_locale";
            public static final java.lang.String OEM_SETUP_VERSION = "oem_setup_version";
            public static final java.lang.String MASTER_GESTURES_ENABLED = "master_gestures_enabled";
            public static final java.lang.String UNGAZE_ENABLED = "ungaze_enabled";
            public static final java.lang.String BATTERY_SAVER_MODE = "battery_saver_mode";
            public static final int BATTERY_SAVER_MODE_NONE = 0;
            public static final int BATTERY_SAVER_MODE_LIGHT = 1;
            public static final int BATTERY_SAVER_MODE_TRADITIONAL_WATCH = 2;
            public static final int BATTERY_SAVER_MODE_TIME_ONLY = 3;
            public static final int BATTERY_SAVER_MODE_CUSTOM = 4;
            public static final java.lang.String WEAR_ACTIVITY_AUTO_RESUME_TIMEOUT_MS = "wear_activity_auto_resume_timeout_ms";
            public static final java.lang.String WEAR_ACTIVITY_AUTO_RESUME_TIMEOUT_SET_BY_USER = "wear_activity_auto_resume_timeout_set_by_user";
            public static final java.lang.String BURN_IN_PROTECTION_ENABLED = "burn_in_protection";
            public static final java.lang.String COMBINED_LOCATION_ENABLED = "combined_location_enable";
            public static final java.lang.String WRIST_ORIENTATION_MODE = "wear_wrist_orientation_mode";
            public static final java.lang.String CLOCKWORK_SYSUI_PACKAGE = "clockwork_sysui_package";
            public static final java.lang.String CLOCKWORK_SYSUI_MAIN_ACTIVITY = "clockwork_sysui_main_activity";
            public static final java.lang.String CLOCKWORK_LONG_PRESS_TO_ASSISTANT_ENABLED = "clockwork_long_press_to_assistant_enabled";
            public static final java.lang.String COOLDOWN_MODE_ON = "cooldown_mode_on";
            public static final java.lang.String WET_MODE_ON = "wet_mode_on";
            public Wearable() {}
        }
    }

    private static class NameValueCache {
        <T extends android.provider.Settings.NameValueTable> NameValueCache(android.net.Uri p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.provider.Settings.ContentProviderHolder p4, java.lang.Class<T> p5) {}
        public boolean putStringForUser(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4, int p5, boolean p6) { return false; }
        public int setStringsForPrefix(android.content.ContentResolver p0, java.lang.String p1, java.util.HashMap<java.lang.String, java.lang.String> p2) { return 0; }
        public boolean deleteStringForUser(android.content.ContentResolver p0, java.lang.String p1, int p2) { return false; }
        public java.lang.String getStringForUser(android.content.ContentResolver p0, java.lang.String p1, int p2) { return null; }
        public android.util.ArrayMap<java.lang.String, java.lang.String> getStringsForPrefix(android.content.ContentResolver p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return null; }
        public void clearGenerationTrackerForTest() {}
    }

    public static class NameValueTable implements android.provider.BaseColumns {
        public static final java.lang.String NAME = "name";
        public static final java.lang.String VALUE = "value";
        public static final java.lang.String IS_PRESERVED_IN_RESTORE = "is_preserved_in_restore";
        public NameValueTable() {}
        protected static boolean putString(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String p2, java.lang.String p3) { return false; }
        public static android.net.Uri getUriFor(android.net.Uri p0, java.lang.String p1) { return null; }
    }

    public static final class Panel {
        public static final java.lang.String ACTION_INTERNET_CONNECTIVITY = "android.settings.panel.action.INTERNET_CONNECTIVITY";
        public static final java.lang.String ACTION_NFC = "android.settings.panel.action.NFC";
        public static final java.lang.String ACTION_WIFI = "android.settings.panel.action.WIFI";
        public static final java.lang.String ACTION_VOLUME = "android.settings.panel.action.VOLUME";
    }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    private static @interface Readable {
        public int maxTargetSdk() default 0;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResetMode {
    }

    public static final class Secure extends android.provider.Settings.NameValueTable {
        public static final android.net.Uri CONTENT_URI = null;
        @android.provider.Settings.Readable
        public static final java.lang.String ADAPTIVE_SLEEP = "adaptive_sleep";
        public static final java.lang.String CAMERA_AUTOROTATE = "camera_autorotate";
        @java.lang.Deprecated
        public static final java.lang.String DEVELOPMENT_SETTINGS_ENABLED = "development_settings_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String BUGREPORT_IN_POWER_MENU = "bugreport_in_power_menu";
        @java.lang.Deprecated
        public static final java.lang.String ADB_ENABLED = "adb_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String ALLOW_MOCK_LOCATION = "mock_location";
        @android.provider.Settings.Readable(maxTargetSdk=31)
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLUETOOTH_NAME = "bluetooth_name";
        @android.provider.Settings.Readable(maxTargetSdk=31)
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLUETOOTH_ADDRESS = "bluetooth_address";
        @android.provider.Settings.Readable(maxTargetSdk=31)
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String BLUETOOTH_ADDR_VALID = "bluetooth_addr_valid";
        public static final java.lang.String BLUETOOTH_LE_BROADCAST_PROGRAM_INFO = "bluetooth_le_broadcast_program_info";
        public static final java.lang.String BLUETOOTH_LE_BROADCAST_CODE = "bluetooth_le_broadcast_code";
        public static final java.lang.String BLUETOOTH_LE_BROADCAST_APP_SOURCE_NAME = "bluetooth_le_broadcast_app_source_name";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String ODI_CAPTIONS_ENABLED = "odi_captions_enabled";
        public static final java.lang.String ODI_CAPTIONS_VOLUME_UI_ENABLED = "odi_captions_volume_ui_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ANDROID_ID = "android_id";
        @java.lang.Deprecated
        public static final java.lang.String BLUETOOTH_ON = "bluetooth_on";
        @java.lang.Deprecated
        public static final java.lang.String DATA_ROAMING = "data_roaming";
        @android.provider.Settings.Readable
        public static final java.lang.String DEFAULT_INPUT_METHOD = "default_input_method";
        @android.provider.Settings.Readable
        public static final java.lang.String SELECTED_INPUT_METHOD_SUBTYPE = "selected_input_method_subtype";
        public static final java.lang.String DEFAULT_VOICE_INPUT_METHOD = "default_voice_input_method";
        @android.provider.Settings.Readable
        public static final java.lang.String INPUT_METHODS_SUBTYPE_HISTORY = "input_methods_subtype_history";
        @android.provider.Settings.Readable
        public static final java.lang.String INPUT_METHOD_SELECTOR_VISIBILITY = "input_method_selector_visibility";
        @android.provider.Settings.Readable
        public static final java.lang.String VOICE_INTERACTION_SERVICE = "voice_interaction_service";
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOFILL_SERVICE = "autofill_service";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOFILL_FEATURE_FIELD_CLASSIFICATION = "autofill_field_classification";
        @android.provider.Settings.Readable
        public static final java.lang.String DARK_MODE_DIALOG_SEEN = "dark_mode_dialog_seen";
        @android.provider.Settings.Readable
        public static final java.lang.String DARK_THEME_CUSTOM_START_TIME = "dark_theme_custom_start_time";
        @android.provider.Settings.Readable
        public static final java.lang.String DARK_THEME_CUSTOM_END_TIME = "dark_theme_custom_end_time";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOFILL_USER_DATA_MAX_USER_DATA_SIZE = "autofill_user_data_max_user_data_size";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOFILL_USER_DATA_MAX_FIELD_CLASSIFICATION_IDS_SIZE = "autofill_user_data_max_field_classification_size";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOFILL_USER_DATA_MAX_CATEGORY_COUNT = "autofill_user_data_max_category_count";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOFILL_USER_DATA_MAX_VALUE_LENGTH = "autofill_user_data_max_value_length";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOFILL_USER_DATA_MIN_VALUE_LENGTH = "autofill_user_data_min_value_length";
        @android.provider.Settings.Readable
        public static final java.lang.String CONTENT_CAPTURE_ENABLED = "content_capture_enabled";
        @java.lang.Deprecated
        public static final java.lang.String DEVICE_PROVISIONED = "device_provisioned";
        @android.provider.Settings.Readable
        public static final java.lang.String MANAGED_PROVISIONING_DPC_DOWNLOADED = "managed_provisioning_dpc_downloaded";
        @android.provider.Settings.Readable
        public static final java.lang.String SECURE_FRP_MODE = "secure_frp_mode";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String USER_SETUP_COMPLETE = "user_setup_complete";
        @android.annotation.SystemApi
        public static final int USER_SETUP_PERSONALIZATION_NOT_STARTED = 0;
        @android.annotation.SystemApi
        public static final int USER_SETUP_PERSONALIZATION_STARTED = 1;
        @android.annotation.SystemApi
        public static final int USER_SETUP_PERSONALIZATION_PAUSED = 2;
        @android.annotation.SystemApi
        public static final int USER_SETUP_PERSONALIZATION_COMPLETE = 10;
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String USER_SETUP_PERSONALIZATION_STATE = "user_setup_personalization_state";
        @android.provider.Settings.Readable
        public static final java.lang.String TV_USER_SETUP_COMPLETE = "tv_user_setup_complete";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String COMPLETED_CATEGORY_PREFIX = "suggested.completed_category.";
        public static final java.lang.String RELEASE_COMPRESS_BLOCKS_ON_INSTALL = "release_compress_blocks_on_install";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLED_INPUT_METHODS = "enabled_input_methods";
        @android.provider.Settings.Readable
        public static final java.lang.String DISABLED_SYSTEM_INPUT_METHODS = "disabled_system_input_methods";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String SHOW_IME_WITH_HARD_KEYBOARD = "show_ime_with_hard_keyboard";
        @java.lang.Deprecated
        public static final java.lang.String HTTP_PROXY = "http_proxy";
        public static final java.lang.String ALWAYS_ON_VPN_APP = "always_on_vpn_app";
        @android.provider.Settings.Readable
        public static final java.lang.String ALWAYS_ON_VPN_LOCKDOWN = "always_on_vpn_lockdown";
        @android.provider.Settings.Readable(maxTargetSdk=31)
        public static final java.lang.String ALWAYS_ON_VPN_LOCKDOWN_WHITELIST = "always_on_vpn_lockdown_whitelist";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String INSTALL_NON_MARKET_APPS = "install_non_market_apps";
        @android.provider.Settings.Readable
        public static final java.lang.String UNKNOWN_SOURCES_DEFAULT_REVERSED = "unknown_sources_default_reversed";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String LOCATION_PROVIDERS_ALLOWED = "location_providers_allowed";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String LOCATION_MODE = "location_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCATION_CHANGER = "location_changer";
        public static final int LOCATION_CHANGER_UNKNOWN = 0;
        public static final int LOCATION_CHANGER_SYSTEM_SETTINGS = 1;
        public static final int LOCATION_CHANGER_QUICK_SETTINGS = 2;
        public static final int LOCATION_MODE_OFF = 0;
        @java.lang.Deprecated
        public static final int LOCATION_MODE_SENSORS_ONLY = 1;
        @java.lang.Deprecated
        public static final int LOCATION_MODE_BATTERY_SAVING = 2;
        @java.lang.Deprecated
        public static final int LOCATION_MODE_HIGH_ACCURACY = 3;
        @android.annotation.SystemApi
        public static final int LOCATION_MODE_ON = 3;
        public static final java.lang.String LOCATION_TIME_ZONE_DETECTION_ENABLED = "location_time_zone_detection_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCATION_COARSE_ACCURACY_M = "locationCoarseAccuracy";
        public static final java.lang.String LOCATION_SHOW_SYSTEM_OPS = "locationShowSystemOps";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_BIOMETRIC_WEAK_FLAGS = "lock_biometric_weak_flags";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_TO_APP_EXIT_LOCKED = "lock_to_app_exit_locked";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_PATTERN_ENABLED = "lock_pattern_autolock";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_PATTERN_VISIBLE = "lock_pattern_visible_pattern";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED = "lock_pattern_tactile_feedback_enabled";
        public static final java.lang.String LOCK_PATTERN_SIZE = "lock_pattern_size";
        public static final java.lang.String LOCK_DOTS_VISIBLE = "lock_pattern_dotsvisible";
        public static final java.lang.String LOCK_SHOW_ERROR_PATH = "lock_pattern_show_error_path";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_SCREEN_LOCK_AFTER_TIMEOUT = "lock_screen_lock_after_timeout";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_SCREEN_OWNER_INFO = "lock_screen_owner_info";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_SCREEN_APPWIDGET_IDS = "lock_screen_appwidget_ids";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_SCREEN_FALLBACK_APPWIDGET_ID = "lock_screen_fallback_appwidget_id";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_SCREEN_STICKY_APPWIDGET = "lock_screen_sticky_appwidget";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_SCREEN_OWNER_INFO_ENABLED = "lock_screen_owner_info_enabled";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_SCREEN_ALLOW_PRIVATE_NOTIFICATIONS = "lock_screen_allow_private_notifications";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_SCREEN_ALLOW_REMOTE_INPUT = "lock_screen_allow_remote_input";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_SCREEN_CUSTOM_CLOCK_FACE = "lock_screen_custom_clock_face";
        @android.provider.Settings.Readable
        public static final java.lang.String DOCKED_CLOCK_FACE = "docked_clock_face";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_NOTE_ABOUT_NOTIFICATION_HIDING = "show_note_about_notification_hiding";
        @android.provider.Settings.Readable
        public static final java.lang.String TRUST_AGENTS_INITIALIZED = "trust_agents_initialized";
        public static final java.lang.String KNOWN_TRUST_AGENTS_INITIALIZED = "known_trust_agents_initialized";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String LOGGING_ID = "logging_id";
        @java.lang.Deprecated
        public static final java.lang.String NETWORK_PREFERENCE = "network_preference";
        @android.provider.Settings.Readable
        public static final java.lang.String PARENTAL_CONTROL_ENABLED = "parental_control_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String PARENTAL_CONTROL_LAST_UPDATE = "parental_control_last_update";
        @android.provider.Settings.Readable
        public static final java.lang.String PARENTAL_CONTROL_REDIRECT_URL = "parental_control_redirect_url";
        @android.provider.Settings.Readable
        public static final java.lang.String SETTINGS_CLASSNAME = "settings_classname";
        @java.lang.Deprecated
        public static final java.lang.String USB_MASS_STORAGE_ENABLED = "usb_mass_storage_enabled";
        @java.lang.Deprecated
        public static final java.lang.String USE_GOOGLE_MAIL = "use_google_mail";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_ENABLED = "accessibility_enabled";
        public static final java.lang.String ENABLED_ACCESSIBILITY_AUDIO_DESCRIPTION_BY_DEFAULT = "enabled_accessibility_audio_description_by_default";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_SHORTCUT_ON_LOCK_SCREEN = "accessibility_shortcut_on_lock_screen";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_SHORTCUT_DIALOG_SHOWN = "accessibility_shortcut_dialog_shown";
        public static final java.lang.String SKIP_ACCESSIBILITY_SHORTCUT_DIALOG_TIMEOUT_RESTRICTION = "skip_accessibility_shortcut_dialog_timeout_restriction";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_SHORTCUT_TARGET_SERVICE = "accessibility_shortcut_target_service";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_BUTTON_TARGET_COMPONENT = "accessibility_button_target_component";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_BUTTON_TARGETS = "accessibility_button_targets";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_SHORTCUT_TARGET_MAGNIFICATION_CONTROLLER = "com.android.server.accessibility.MagnificationController";
        @android.provider.Settings.Readable
        public static final java.lang.String TOUCH_EXPLORATION_ENABLED = "touch_exploration_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLED_ACCESSIBILITY_SERVICES = "enabled_accessibility_services";
        @android.provider.Settings.Readable
        public static final java.lang.String NOTIFIED_NON_ACCESSIBILITY_CATEGORY_SERVICES = "notified_non_accessibility_category_services";
        @android.provider.Settings.Readable
        public static final java.lang.String TOUCH_EXPLORATION_GRANTED_ACCESSIBILITY_SERVICES = "touch_exploration_granted_accessibility_services";
        public static final java.lang.String WEAR_TALKBACK_ENABLED = "wear_talkback_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String GLOBAL_ACTIONS_PANEL_ENABLED = "global_actions_panel_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String GLOBAL_ACTIONS_PANEL_AVAILABLE = "global_actions_panel_available";
        @android.provider.Settings.Readable
        public static final java.lang.String GLOBAL_ACTIONS_PANEL_DEBUG_ENABLED = "global_actions_panel_debug_enabled";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String HUSH_GESTURE_USED = "hush_gesture_used";
        @android.provider.Settings.Readable
        public static final java.lang.String MANUAL_RINGER_TOGGLE_COUNT = "manual_ringer_toggle_count";
        @android.provider.Settings.Readable
        public static final java.lang.String CHARGING_SOUNDS_ENABLED = "charging_sounds_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String CHARGING_VIBRATION_ENABLED = "charging_vibration_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ZEN_DURATION = "zen_duration";
        public static final int ZEN_DURATION_PROMPT = -1;
        public static final int ZEN_DURATION_FOREVER = 0;
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_ZEN_UPGRADE_NOTIFICATION = "show_zen_upgrade_notification";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_ZEN_SETTINGS_SUGGESTION = "show_zen_settings_suggestion";
        @android.provider.Settings.Readable
        public static final java.lang.String ZEN_SETTINGS_UPDATED = "zen_settings_updated";
        @android.provider.Settings.Readable
        public static final java.lang.String ZEN_SETTINGS_SUGGESTION_VIEWED = "zen_settings_suggestion_viewed";
        @android.provider.Settings.Readable
        public static final java.lang.String IN_CALL_NOTIFICATION_ENABLED = "in_call_notification_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String KEYGUARD_SLICE_URI = "keyguard_slice_uri";
        @android.provider.Settings.Readable
        public static final java.lang.String FONT_WEIGHT_ADJUSTMENT = "font_weight_adjustment";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_SPEAK_PASSWORD = "speak_password";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_HIGH_TEXT_CONTRAST_ENABLED = "high_text_contrast_enabled";
        public static final java.lang.String CONTRAST_LEVEL = "contrast_level";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_DISPLAY_MAGNIFICATION_ENABLED = "accessibility_display_magnification_enabled";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_DISPLAY_MAGNIFICATION_NAVBAR_ENABLED = "accessibility_display_magnification_navbar_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_DISPLAY_MAGNIFICATION_SCALE = "accessibility_display_magnification_scale";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_DISPLAY_MAGNIFICATION_AUTO_UPDATE = "accessibility_display_magnification_auto_update";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_SOFT_KEYBOARD_MODE = "accessibility_soft_keyboard_mode";
        public static final int SHOW_MODE_AUTO = 0;
        public static final int SHOW_MODE_HIDDEN = 1;
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_CAPTIONING_ENABLED = "accessibility_captioning_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_CAPTIONING_LOCALE = "accessibility_captioning_locale";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_CAPTIONING_PRESET = "accessibility_captioning_preset";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_CAPTIONING_BACKGROUND_COLOR = "accessibility_captioning_background_color";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_CAPTIONING_FOREGROUND_COLOR = "accessibility_captioning_foreground_color";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_CAPTIONING_EDGE_TYPE = "accessibility_captioning_edge_type";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_CAPTIONING_EDGE_COLOR = "accessibility_captioning_edge_color";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_CAPTIONING_WINDOW_COLOR = "accessibility_captioning_window_color";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_CAPTIONING_TYPEFACE = "accessibility_captioning_typeface";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_CAPTIONING_FONT_SCALE = "accessibility_captioning_font_scale";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_DISPLAY_INVERSION_ENABLED = "accessibility_display_inversion_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_FONT_SCALING_HAS_BEEN_CHANGED = "accessibility_font_scaling_has_been_changed";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_DISPLAY_DALTONIZER_ENABLED = "accessibility_display_daltonizer_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_DISPLAY_DALTONIZER = "accessibility_display_daltonizer";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_AUTOCLICK_ENABLED = "accessibility_autoclick_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_AUTOCLICK_DELAY = "accessibility_autoclick_delay";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_LARGE_POINTER_ICON = "accessibility_large_pointer_icon";
        @android.provider.Settings.Readable
        public static final java.lang.String LONG_PRESS_TIMEOUT = "long_press_timeout";
        @android.provider.Settings.Readable
        public static final java.lang.String MULTI_PRESS_TIMEOUT = "multi_press_timeout";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_NON_INTERACTIVE_UI_TIMEOUT_MS = "accessibility_non_interactive_ui_timeout_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_INTERACTIVE_UI_TIMEOUT_MS = "accessibility_interactive_ui_timeout_ms";
        public static final java.lang.String REDUCE_BRIGHT_COLORS_ACTIVATED = "reduce_bright_colors_activated";
        public static final java.lang.String REDUCE_BRIGHT_COLORS_LEVEL = "reduce_bright_colors_level";
        public static final java.lang.String REDUCE_BRIGHT_COLORS_PERSIST_ACROSS_REBOOTS = "reduce_bright_colors_persist_across_reboots";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLED_PRINT_SERVICES = "enabled_print_services";
        @android.provider.Settings.Readable
        public static final java.lang.String DISABLED_PRINT_SERVICES = "disabled_print_services";
        @android.provider.Settings.Readable
        public static final java.lang.String DISPLAY_DENSITY_FORCED = "display_density_forced";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String TTS_USE_DEFAULTS = "tts_use_defaults";
        @android.provider.Settings.Readable
        public static final java.lang.String TTS_DEFAULT_RATE = "tts_default_rate";
        @android.provider.Settings.Readable
        public static final java.lang.String TTS_DEFAULT_PITCH = "tts_default_pitch";
        @android.provider.Settings.Readable
        public static final java.lang.String TTS_DEFAULT_SYNTH = "tts_default_synth";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String TTS_DEFAULT_LANG = "tts_default_lang";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String TTS_DEFAULT_COUNTRY = "tts_default_country";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String TTS_DEFAULT_VARIANT = "tts_default_variant";
        @android.provider.Settings.Readable
        public static final java.lang.String TTS_DEFAULT_LOCALE = "tts_default_locale";
        @android.provider.Settings.Readable
        public static final java.lang.String TTS_ENABLED_PLUGINS = "tts_enabled_plugins";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wifi_networks_available_notification_on";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY = "wifi_networks_available_repeat_delay";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_NUM_OPEN_NETWORKS_KEPT = "wifi_num_open_networks_kept";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_ON = "wifi_on";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE = "wifi_watchdog_acceptable_packet_loss_percentage";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_AP_COUNT = "wifi_watchdog_ap_count";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS = "wifi_watchdog_background_check_delay_ms";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED = "wifi_watchdog_background_check_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS = "wifi_watchdog_background_check_timeout_ms";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT = "wifi_watchdog_initial_ignored_ping_count";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_MAX_AP_CHECKS = "wifi_watchdog_max_ap_checks";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_ON = "wifi_watchdog_on";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_WATCH_LIST = "wifi_watchdog_watch_list";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_PING_COUNT = "wifi_watchdog_ping_count";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_PING_DELAY_MS = "wifi_watchdog_ping_delay_ms";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_PING_TIMEOUT_MS = "wifi_watchdog_ping_timeout_ms";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_MAX_DHCP_RETRY_COUNT = "wifi_max_dhcp_retry_count";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = "wifi_mobile_data_transition_wakelock_timeout_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String CONNECTIVITY_RELEASE_PENDING_INTENT_DELAY_MS = "connectivity_release_pending_intent_delay_ms";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String BACKGROUND_DATA = "background_data";
        @android.provider.Settings.Readable
        public static final java.lang.String ALLOWED_GEOLOCATION_ORIGINS = "allowed_geolocation_origins";
        @android.provider.Settings.Readable
        public static final java.lang.String PREFERRED_TTY_MODE = "preferred_tty_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String ENHANCED_VOICE_PRIVACY_ENABLED = "enhanced_voice_privacy_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String TTY_MODE_ENABLED = "tty_mode_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String RTT_CALLING_MODE = "rtt_calling_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String BACKUP_ENABLED = "backup_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String BACKUP_AUTO_RESTORE = "backup_auto_restore";
        @android.provider.Settings.Readable
        public static final java.lang.String BACKUP_PROVISIONED = "backup_provisioned";
        @android.provider.Settings.Readable
        public static final java.lang.String BACKUP_TRANSPORT = "backup_transport";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String LAST_SETUP_SHOWN = "last_setup_shown";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_IDLE_MS = "wifi_idle_ms";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_GLOBAL_SEARCH_ACTIVITY = "search_global_search_activity";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_NUM_PROMOTED_SOURCES = "search_num_promoted_sources";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_MAX_RESULTS_TO_DISPLAY = "search_max_results_to_display";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_MAX_RESULTS_PER_SOURCE = "search_max_results_per_source";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_WEB_RESULTS_OVERRIDE_LIMIT = "search_web_results_override_limit";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_PROMOTED_SOURCE_DEADLINE_MILLIS = "search_promoted_source_deadline_millis";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_SOURCE_TIMEOUT_MILLIS = "search_source_timeout_millis";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_PREFILL_MILLIS = "search_prefill_millis";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_MAX_STAT_AGE_MILLIS = "search_max_stat_age_millis";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_MAX_SOURCE_EVENT_AGE_MILLIS = "search_max_source_event_age_millis";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_MIN_IMPRESSIONS_FOR_SOURCE_RANKING = "search_min_impressions_for_source_ranking";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_MIN_CLICKS_FOR_SOURCE_RANKING = "search_min_clicks_for_source_ranking";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_MAX_SHORTCUTS_RETURNED = "search_max_shortcuts_returned";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_QUERY_THREAD_CORE_POOL_SIZE = "search_query_thread_core_pool_size";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_QUERY_THREAD_MAX_POOL_SIZE = "search_query_thread_max_pool_size";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_SHORTCUT_REFRESH_CORE_POOL_SIZE = "search_shortcut_refresh_core_pool_size";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_SHORTCUT_REFRESH_MAX_POOL_SIZE = "search_shortcut_refresh_max_pool_size";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_THREAD_KEEPALIVE_SECONDS = "search_thread_keepalive_seconds";
        @android.provider.Settings.Readable
        public static final java.lang.String SEARCH_PER_SOURCE_CONCURRENT_QUERY_LIMIT = "search_per_source_concurrent_query_limit";
        @android.provider.Settings.Readable
        public static final java.lang.String MOUNT_PLAY_NOTIFICATION_SND = "mount_play_not_snd";
        @android.provider.Settings.Readable
        public static final java.lang.String MOUNT_UMS_AUTOSTART = "mount_ums_autostart";
        @android.provider.Settings.Readable
        public static final java.lang.String MOUNT_UMS_PROMPT = "mount_ums_prompt";
        @android.provider.Settings.Readable
        public static final java.lang.String MOUNT_UMS_NOTIFY_ENABLED = "mount_ums_notify_enabled";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String ANR_SHOW_BACKGROUND = "anr_show_background";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String SHOW_FIRST_CRASH_DIALOG_DEV_OPTION = "show_first_crash_dialog_dev_option";
        @android.provider.Settings.Readable
        public static final java.lang.String VOICE_RECOGNITION_SERVICE = "voice_recognition_service";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String SELECTED_SPELL_CHECKER = "selected_spell_checker";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String SELECTED_SPELL_CHECKER_SUBTYPE = "selected_spell_checker_subtype";
        @android.provider.Settings.Readable
        public static final java.lang.String SPELL_CHECKER_ENABLED = "spell_checker_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String INCALL_POWER_BUTTON_BEHAVIOR = "incall_power_button_behavior";
        @android.provider.Settings.Readable
        public static final java.lang.String MINIMAL_POST_PROCESSING_ALLOWED = "minimal_post_processing_allowed";
        public static final int MATCH_CONTENT_FRAMERATE_NEVER = 0;
        public static final int MATCH_CONTENT_FRAMERATE_SEAMLESSS_ONLY = 1;
        public static final int MATCH_CONTENT_FRAMERATE_ALWAYS = 2;
        public static final java.lang.String MATCH_CONTENT_FRAME_RATE = "match_content_frame_rate";
        public static final int INCALL_POWER_BUTTON_BEHAVIOR_SCREEN_OFF = 1;
        public static final int INCALL_POWER_BUTTON_BEHAVIOR_HANGUP = 2;
        public static final int INCALL_POWER_BUTTON_BEHAVIOR_DEFAULT = 1;
        @android.provider.Settings.Readable
        public static final java.lang.String INCALL_BACK_BUTTON_BEHAVIOR = "incall_back_button_behavior";
        public static final int INCALL_BACK_BUTTON_BEHAVIOR_NONE = 0;
        public static final int INCALL_BACK_BUTTON_BEHAVIOR_HANGUP = 1;
        public static final int INCALL_BACK_BUTTON_BEHAVIOR_DEFAULT = 0;
        @android.provider.Settings.Readable
        public static final java.lang.String WAKE_GESTURE_ENABLED = "wake_gesture_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String DOZE_ENABLED = "doze_enabled";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String DOZE_ALWAYS_ON = "doze_always_on";
        @android.provider.Settings.Readable
        public static final java.lang.String DOZE_PICK_UP_GESTURE = "doze_pulse_on_pick_up";
        @android.provider.Settings.Readable
        public static final java.lang.String DOZE_PULSE_ON_LONG_PRESS = "doze_pulse_on_long_press";
        @android.provider.Settings.Readable
        public static final java.lang.String DOZE_DOUBLE_TAP_GESTURE = "doze_pulse_on_double_tap";
        @android.provider.Settings.Readable
        public static final java.lang.String DOZE_TAP_SCREEN_GESTURE = "doze_tap_gesture";
        @android.provider.Settings.Readable
        public static final java.lang.String DOZE_WAKE_LOCK_SCREEN_GESTURE = "doze_wake_screen_gesture";
        @android.provider.Settings.Readable
        public static final java.lang.String DOZE_WAKE_DISPLAY_GESTURE = "doze_wake_display_gesture";
        public static final java.lang.String DOZE_QUICK_PICKUP_GESTURE = "doze_quick_pickup_gesture";
        @android.provider.Settings.Readable
        public static final java.lang.String SUPPRESS_DOZE = "suppress_doze";
        @android.provider.Settings.Readable
        public static final java.lang.String SKIP_GESTURE = "skip_gesture";
        @android.provider.Settings.Readable
        public static final java.lang.String SKIP_GESTURE_COUNT = "skip_gesture_count";
        @android.provider.Settings.Readable
        public static final java.lang.String SKIP_TOUCH_COUNT = "skip_touch_count";
        @android.provider.Settings.Readable
        public static final java.lang.String SKIP_DIRECTION = "skip_gesture_direction";
        @android.provider.Settings.Readable
        public static final java.lang.String SILENCE_GESTURE = "silence_gesture";
        @android.provider.Settings.Readable
        public static final java.lang.String SILENCE_ALARMS_GESTURE_COUNT = "silence_alarms_gesture_count";
        @android.provider.Settings.Readable
        public static final java.lang.String SILENCE_TIMER_GESTURE_COUNT = "silence_timer_gesture_count";
        @android.provider.Settings.Readable
        public static final java.lang.String SILENCE_CALL_GESTURE_COUNT = "silence_call_gesture_count";
        @android.provider.Settings.Readable
        public static final java.lang.String SILENCE_ALARMS_TOUCH_COUNT = "silence_alarms_touch_count";
        @android.provider.Settings.Readable
        public static final java.lang.String SILENCE_TIMER_TOUCH_COUNT = "silence_timer_touch_count";
        @android.provider.Settings.Readable
        public static final java.lang.String SILENCE_CALL_TOUCH_COUNT = "silence_call_touch_count";
        @android.provider.Settings.Readable
        public static final java.lang.String AWARE_TAP_PAUSE_GESTURE_COUNT = "aware_tap_pause_gesture_count";
        @android.provider.Settings.Readable
        public static final java.lang.String AWARE_TAP_PAUSE_TOUCH_COUNT = "aware_tap_pause_touch_count";
        public static final java.lang.String SWIPE_BOTTOM_TO_NOTIFICATION_ENABLED = "swipe_bottom_to_notification_enabled";
        public static final java.lang.String ONE_HANDED_MODE_ACTIVATED = "one_handed_mode_activated";
        public static final java.lang.String ONE_HANDED_MODE_ENABLED = "one_handed_mode_enabled";
        public static final java.lang.String ONE_HANDED_MODE_TIMEOUT = "one_handed_mode_timeout";
        public static final java.lang.String TAPS_APP_TO_EXIT = "taps_app_to_exit";
        public static final java.lang.String ONE_HANDED_TUTORIAL_SHOW_COUNT = "one_handed_tutorial_show_count";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String UI_TRANSLATION_ENABLED = "ui_translation_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String UI_NIGHT_MODE = "ui_night_mode";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String UI_NIGHT_MODE_CUSTOM_TYPE = "ui_night_mode_custom_type";
        @android.provider.Settings.Readable
        public static final java.lang.String UI_NIGHT_MODE_OVERRIDE_ON = "ui_night_mode_override_on";
        public static final java.lang.String UI_NIGHT_MODE_LAST_COMPUTED = "ui_night_mode_last_computed";
        @android.provider.Settings.Readable
        public static final java.lang.String UI_NIGHT_MODE_OVERRIDE_OFF = "ui_night_mode_override_off";
        @android.provider.Settings.Readable
        public static final java.lang.String SCREENSAVER_ENABLED = "screensaver_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String SCREENSAVER_COMPONENTS = "screensaver_components";
        @android.provider.Settings.Readable
        public static final java.lang.String SCREENSAVER_ACTIVATE_ON_DOCK = "screensaver_activate_on_dock";
        @android.provider.Settings.Readable
        public static final java.lang.String SCREENSAVER_ACTIVATE_ON_SLEEP = "screensaver_activate_on_sleep";
        @android.provider.Settings.Readable
        public static final java.lang.String SCREENSAVER_DEFAULT_COMPONENT = "screensaver_default_component";
        public static final java.lang.String SCREENSAVER_COMPLICATIONS_ENABLED = "screensaver_complications_enabled";
        public static final java.lang.String SCREENSAVER_HOME_CONTROLS_ENABLED = "screensaver_home_controls_enabled";
        public static final int DOCK_SETUP_NOT_STARTED = 0;
        public static final int DOCK_SETUP_STARTED = 1;
        public static final int DOCK_SETUP_PAUSED = 2;
        public static final int DOCK_SETUP_PROMPTED = 3;
        public static final int DOCK_SETUP_INCOMPLETE = 4;
        public static final int DOCK_SETUP_COMPLETED = 10;
        public static final int DOCK_SETUP_TIMED_OUT = 11;
        public static final java.lang.String DOCK_SETUP_STATE = "dock_setup_state";
        public static final java.lang.String NFC_PAYMENT_DEFAULT_COMPONENT = "nfc_payment_default_component";
        @android.provider.Settings.Readable
        public static final java.lang.String NFC_PAYMENT_FOREGROUND = "nfc_payment_foreground";
        @android.provider.Settings.Readable
        public static final java.lang.String SMS_DEFAULT_APPLICATION = "sms_default_application";
        @android.provider.Settings.Readable
        public static final java.lang.String DIALER_DEFAULT_APPLICATION = "dialer_default_application";
        @android.provider.Settings.Readable
        public static final java.lang.String CALL_SCREENING_DEFAULT_COMPONENT = "call_screening_default_component";
        @android.provider.Settings.Readable
        public static final java.lang.String EMERGENCY_ASSISTANCE_APPLICATION = "emergency_assistance_application";
        @android.provider.Settings.Readable
        public static final java.lang.String ASSIST_STRUCTURE_ENABLED = "assist_structure_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ASSIST_SCREENSHOT_ENABLED = "assist_screenshot_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ASSIST_DISCLOSURE_ENABLED = "assist_disclosure_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_ROTATION_SUGGESTIONS = "show_rotation_suggestions";
        public static final int SHOW_ROTATION_SUGGESTIONS_DISABLED = 0;
        public static final int SHOW_ROTATION_SUGGESTIONS_ENABLED = 1;
        public static final int SHOW_ROTATION_SUGGESTIONS_DEFAULT = 1;
        @android.provider.Settings.Readable
        public static final java.lang.String NUM_ROTATION_SUGGESTIONS_ACCEPTED = "num_rotation_suggestions_accepted";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLED_NOTIFICATION_ASSISTANT = "enabled_notification_assistant";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLED_NOTIFICATION_POLICY_ACCESS_PACKAGES = "enabled_notification_policy_access_packages";
        @android.provider.Settings.Readable
        @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
        public static final java.lang.String SYNC_PARENT_SOUNDS = "sync_parent_sounds";
        @android.provider.Settings.Readable
        public static final java.lang.String IMMERSIVE_MODE_CONFIRMATIONS = "immersive_mode_confirmations";
        @android.provider.Settings.Readable
        public static final java.lang.String PRINT_SERVICE_SEARCH_URI = "print_service_search_uri";
        @android.provider.Settings.Readable
        public static final java.lang.String PAYMENT_SERVICE_SEARCH_URI = "payment_service_search_uri";
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOFILL_SERVICE_SEARCH_URI = "autofill_service_search_uri";
        @android.provider.Settings.Readable
        public static final java.lang.String SKIP_FIRST_USE_HINTS = "skip_first_use_hints";
        @android.provider.Settings.Readable
        public static final java.lang.String UNSAFE_VOLUME_MUSIC_ACTIVE_MS = "unsafe_volume_music_active_ms";
        public static final java.lang.String SPATIAL_AUDIO_ENABLED = "spatial_audio_enabled";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_SCREEN_SHOW_NOTIFICATIONS = "lock_screen_show_notifications";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_SCREEN_SHOW_SILENT_NOTIFICATIONS = "lock_screen_show_silent_notifications";
        public static final java.lang.String LOCK_SCREEN_SHOW_ONLY_UNSEEN_NOTIFICATIONS = "lock_screen_show_only_unseen_notifications";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_NOTIFICATION_SNOOZE = "show_notification_snooze";
        @android.provider.Settings.Readable
        public static final java.lang.String TV_INPUT_HIDDEN_INPUTS = "tv_input_hidden_inputs";
        @android.provider.Settings.Readable
        public static final java.lang.String TV_INPUT_CUSTOM_LABELS = "tv_input_custom_labels";
        @android.provider.Settings.Readable
        public static final java.lang.String TV_APP_USES_NON_SYSTEM_INPUTS = "tv_app_uses_non_system_inputs";
        @android.provider.Settings.Readable
        public static final java.lang.String USB_AUDIO_AUTOMATIC_ROUTING_DISABLED = "usb_audio_automatic_routing_disabled";
        @android.provider.Settings.Readable
        public static final java.lang.String SLEEP_TIMEOUT = "sleep_timeout";
        @android.provider.Settings.Readable
        public static final java.lang.String ATTENTIVE_TIMEOUT = "attentive_timeout";
        @android.provider.Settings.Readable
        public static final java.lang.String DOUBLE_TAP_TO_WAKE = "double_tap_to_wake";
        @android.provider.Settings.Readable
        public static final java.lang.String ASSISTANT = "assistant";
        @android.provider.Settings.Readable
        public static final java.lang.String CAMERA_GESTURE_DISABLED = "camera_gesture_disabled";
        public static final java.lang.String EMERGENCY_GESTURE_ENABLED = "emergency_gesture_enabled";
        public static final java.lang.String EMERGENCY_GESTURE_SOUND_ENABLED = "emergency_gesture_sound_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String CAMERA_DOUBLE_TAP_POWER_GESTURE_DISABLED = "camera_double_tap_power_gesture_disabled";
        @android.provider.Settings.Readable
        public static final java.lang.String CAMERA_DOUBLE_TWIST_TO_FLIP_ENABLED = "camera_double_twist_to_flip_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String CAMERA_LIFT_TRIGGER_ENABLED = "camera_lift_trigger_enabled";
        public static final int CAMERA_LIFT_TRIGGER_ENABLED_DEFAULT = 1;
        @android.provider.Settings.Readable
        public static final java.lang.String FLASHLIGHT_AVAILABLE = "flashlight_available";
        @android.provider.Settings.Readable
        public static final java.lang.String FLASHLIGHT_ENABLED = "flashlight_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String FACE_UNLOCK_KEYGUARD_ENABLED = "face_unlock_keyguard_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String FACE_UNLOCK_DISMISSES_KEYGUARD = "face_unlock_dismisses_keyguard";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_MEDIA_WHEN_BYPASSING = "show_media_when_bypassing";
        @android.provider.Settings.Readable
        public static final java.lang.String FACE_UNLOCK_ATTENTION_REQUIRED = "face_unlock_attention_required";
        @android.provider.Settings.Readable
        public static final java.lang.String FACE_UNLOCK_DIVERSITY_REQUIRED = "face_unlock_diversity_required";
        @android.provider.Settings.Readable
        public static final java.lang.String FACE_UNLOCK_APP_ENABLED = "face_unlock_app_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String FACE_UNLOCK_ALWAYS_REQUIRE_CONFIRMATION = "face_unlock_always_require_confirmation";
        @android.provider.Settings.Readable
        public static final java.lang.String FACE_UNLOCK_RE_ENROLL = "face_unlock_re_enroll";
        @android.provider.Settings.Readable
        public static final java.lang.String FINGERPRINT_SIDE_FPS_KG_POWER_WINDOW = "fingerprint_side_fps_kg_power_window";
        @android.provider.Settings.Readable
        public static final java.lang.String FINGERPRINT_SIDE_FPS_BP_POWER_WINDOW = "fingerprint_side_fps_bp_power_window";
        @android.provider.Settings.Readable
        public static final java.lang.String FINGERPRINT_SIDE_FPS_ENROLL_TAP_WINDOW = "fingerprint_side_fps_enroll_tap_window";
        @android.provider.Settings.Readable
        public static final java.lang.String FINGERPRINT_SIDE_FPS_AUTH_DOWNTIME = "fingerprint_side_fps_auth_downtime";
        public static final java.lang.String SFPS_PERFORMANT_AUTH_ENABLED = "sfps_performant_auth_enabled_v2";
        @android.provider.Settings.Readable
        public static final java.lang.String BIOMETRIC_DEBUG_ENABLED = "biometric_debug_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String BIOMETRIC_KEYGUARD_ENABLED = "biometric_keyguard_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String BIOMETRIC_APP_ENABLED = "biometric_app_enabled";
        public static final java.lang.String ACTIVE_UNLOCK_ON_WAKE = "active_unlock_on_wake";
        public static final java.lang.String ACTIVE_UNLOCK_ON_UNLOCK_INTENT = "active_unlock_on_unlock_intent";
        public static final java.lang.String ACTIVE_UNLOCK_ON_BIOMETRIC_FAIL = "active_unlock_on_biometric_fail";
        public static final java.lang.String ACTIVE_UNLOCK_ON_FACE_ERRORS = "active_unlock_on_face_errors";
        public static final java.lang.String ACTIVE_UNLOCK_ON_FACE_ACQUIRE_INFO = "active_unlock_on_face_acquire_info";
        public static final java.lang.String ACTIVE_UNLOCK_ON_UNLOCK_INTENT_WHEN_BIOMETRIC_ENROLLED = "active_unlock_on_unlock_intent_when_biometric_enrolled";
        public static final java.lang.String ACTIVE_UNLOCK_WAKEUPS_CONSIDERED_UNLOCK_INTENTS = "active_unlock_wakeups_considered_unlock_intents";
        public static final java.lang.String ACTIVE_UNLOCK_WAKEUPS_TO_FORCE_DISMISS_KEYGUARD = "active_unlock_wakeups_to_force_dismiss_keyguard";
        @android.provider.Settings.Readable
        public static final java.lang.String ASSIST_GESTURE_ENABLED = "assist_gesture_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ASSIST_GESTURE_SENSITIVITY = "assist_gesture_sensitivity";
        @android.provider.Settings.Readable
        public static final java.lang.String ASSIST_GESTURE_SILENCE_ALERTS_ENABLED = "assist_gesture_silence_alerts_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ASSIST_GESTURE_WAKE_ENABLED = "assist_gesture_wake_enabled";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String ASSIST_GESTURE_SETUP_COMPLETE = "assist_gesture_setup_complete";
        public static final java.lang.String ASSIST_TOUCH_GESTURE_ENABLED = "assist_touch_gesture_enabled";
        public static final java.lang.String ASSIST_LONG_PRESS_HOME_ENABLED = "assist_long_press_home_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String TRUST_AGENTS_EXTEND_UNLOCK = "trust_agents_extend_unlock";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_SCREEN_WHEN_TRUST_LOST = "lock_screen_when_trust_lost";
        @android.provider.Settings.Readable
        public static final java.lang.String NIGHT_DISPLAY_ACTIVATED = "night_display_activated";
        @android.provider.Settings.Readable
        public static final java.lang.String NIGHT_DISPLAY_AUTO_MODE = "night_display_auto_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String NIGHT_DISPLAY_COLOR_TEMPERATURE = "night_display_color_temperature";
        @android.provider.Settings.Readable
        public static final java.lang.String NIGHT_DISPLAY_CUSTOM_START_TIME = "night_display_custom_start_time";
        @android.provider.Settings.Readable
        public static final java.lang.String NIGHT_DISPLAY_CUSTOM_END_TIME = "night_display_custom_end_time";
        @android.provider.Settings.Readable
        public static final java.lang.String NIGHT_DISPLAY_LAST_ACTIVATED_TIME = "night_display_last_activated_time";
        @android.provider.Settings.Readable
        public static final java.lang.String DISPLAY_WHITE_BALANCE_ENABLED = "display_white_balance_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ENABLED_VR_LISTENERS = "enabled_vr_listeners";
        @android.provider.Settings.Readable
        public static final java.lang.String VR_DISPLAY_MODE = "vr_display_mode";
        public static final int VR_DISPLAY_MODE_LOW_PERSISTENCE = 0;
        public static final int VR_DISPLAY_MODE_OFF = 1;
        @android.provider.Settings.Readable
        public static final java.lang.String CARRIER_APPS_HANDLED = "carrier_apps_handled";
        @android.provider.Settings.Readable
        public static final java.lang.String MANAGED_PROFILE_CONTACT_REMOTE_SEARCH = "managed_profile_contact_remote_search";
        @android.provider.Settings.Readable
        public static final java.lang.String CROSS_PROFILE_CALENDAR_ENABLED = "cross_profile_calendar_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOMATIC_STORAGE_MANAGER_ENABLED = "automatic_storage_manager_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOMATIC_STORAGE_MANAGER_DAYS_TO_RETAIN = "automatic_storage_manager_days_to_retain";
        public static final int AUTOMATIC_STORAGE_MANAGER_DAYS_TO_RETAIN_DEFAULT = 90;
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOMATIC_STORAGE_MANAGER_BYTES_CLEARED = "automatic_storage_manager_bytes_cleared";
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOMATIC_STORAGE_MANAGER_LAST_RUN = "automatic_storage_manager_last_run";
        @android.provider.Settings.Readable
        public static final java.lang.String AUTOMATIC_STORAGE_MANAGER_TURNED_OFF_BY_POLICY = "automatic_storage_manager_turned_off_by_policy";
        @android.provider.Settings.Readable
        public static final java.lang.String SYSTEM_NAVIGATION_KEYS_ENABLED = "system_navigation_keys_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String QS_TILES = "sysui_qs_tiles";
        @android.provider.Settings.Readable
        @java.lang.Deprecated
        public static final java.lang.String CONTROLS_ENABLED = "controls_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String POWER_MENU_LOCKED_SHOW_CONTENT = "power_menu_locked_show_content";
        public static final java.lang.String LOCKSCREEN_SHOW_CONTROLS = "lockscreen_show_controls";
        public static final java.lang.String LOCKSCREEN_ALLOW_TRIVIAL_CONTROLS = "lockscreen_allow_trivial_controls";
        public static final java.lang.String LOCKSCREEN_SHOW_WALLET = "lockscreen_show_wallet";
        public static final java.lang.String LOCKSCREEN_USE_DOUBLE_LINE_CLOCK = "lockscreen_use_double_line_clock";
        public static final java.lang.String STATUS_BAR_SHOW_VIBRATE_ICON = "status_bar_show_vibrate_icon";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String INSTANT_APPS_ENABLED = "instant_apps_enabled";
        public static final java.lang.String LOCK_SCREEN_SHOW_QR_CODE_SCANNER = "lock_screen_show_qr_code_scanner";
        public static final java.lang.String SHOW_QR_CODE_SCANNER_SETTING = "show_qr_code_scanner_setting";
        @android.provider.Settings.Readable
        public static final java.lang.String DEVICE_PAIRED = "device_paired";
        @android.provider.Settings.Readable
        public static final java.lang.String CMAS_ADDITIONAL_BROADCAST_PKG = "cmas_additional_broadcast_pkg";
        @android.provider.Settings.Readable
        public static final java.lang.String NOTIFICATION_BADGING = "notification_badging";
        @android.provider.Settings.Readable
        public static final java.lang.String NOTIFICATION_HISTORY_ENABLED = "notification_history_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String BUBBLE_IMPORTANT_CONVERSATIONS = "bubble_important_conversations";
        @android.provider.Settings.Readable
        @android.annotation.SuppressLint("NoSettingsProvider")
        public static final java.lang.String NOTIFICATION_BUBBLES = "notification_bubbles";
        @android.provider.Settings.Readable
        public static final java.lang.String NOTIFICATION_DISMISS_RTL = "notification_dismiss_rtl";
        @android.provider.Settings.Readable
        public static final java.lang.String QS_AUTO_ADDED_TILES = "qs_auto_tiles";
        public static final java.lang.String TIMEOUT_TO_DOCK_USER = "timeout_to_dock_user";
        @android.provider.Settings.Readable
        public static final java.lang.String BACKUP_MANAGER_CONSTANTS = "backup_manager_constants";
        @android.provider.Settings.Readable
        public static final java.lang.String BACKUP_LOCAL_TRANSPORT_PARAMETERS = "backup_local_transport_parameters";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_ON_WHILE_DRIVING = "bluetooth_on_while_driving";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String VOLUME_HUSH_GESTURE = "volume_hush_gesture";
        @android.annotation.SystemApi
        public static final int VOLUME_HUSH_OFF = 0;
        @android.annotation.SystemApi
        public static final int VOLUME_HUSH_VIBRATE = 1;
        @android.annotation.SystemApi
        public static final int VOLUME_HUSH_MUTE = 2;
        @android.provider.Settings.Readable
        public static final java.lang.String LOW_POWER_MANUAL_ACTIVATION_COUNT = "low_power_manual_activation_count";
        @android.provider.Settings.Readable
        public static final java.lang.String LOW_POWER_WARNING_ACKNOWLEDGED = "low_power_warning_acknowledged";
        @android.provider.Settings.Readable
        public static final java.lang.String SUPPRESS_AUTO_BATTERY_SAVER_SUGGESTION = "suppress_auto_battery_saver_suggestion";
        @android.provider.Settings.Readable
        public static final java.lang.String PACKAGES_TO_CLEAR_DATA_BEFORE_FULL_RESTORE = "packages_to_clear_data_before_full_restore";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String LOCATION_ACCESS_CHECK_INTERVAL_MILLIS = "location_access_check_interval_millis";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String LOCATION_ACCESS_CHECK_DELAY_MILLIS = "location_access_check_delay_millis";
        @android.annotation.SystemApi
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String LOCATION_PERMISSIONS_UPGRADE_TO_Q_MODE = "location_permissions_upgrade_to_q_mode";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String AUTO_REVOKE_DISABLED = "auto_revoke_disabled";
        @android.annotation.SystemApi
        @android.provider.Settings.Readable
        public static final java.lang.String THEME_CUSTOMIZATION_OVERLAY_PACKAGES = "theme_customization_overlay_packages";
        public static final java.lang.String NAV_BAR_FORCE_VISIBLE = "nav_bar_force_visible";
        public static final java.lang.String NAV_BAR_KIDS_MODE = "nav_bar_kids_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String NAVIGATION_MODE = "navigation_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String BACK_GESTURE_INSET_SCALE_LEFT = "back_gesture_inset_scale_left";
        @android.provider.Settings.Readable
        public static final java.lang.String BACK_GESTURE_INSET_SCALE_RIGHT = "back_gesture_inset_scale_right";
        @android.provider.Settings.Readable
        public static final java.lang.String NEARBY_SHARING_COMPONENT = "nearby_sharing_component";
        public static final java.lang.String NEARBY_SHARING_SLICE_URI = "nearby_sharing_slice_uri";
        public static final java.lang.String NEARBY_FAST_PAIR_SETTINGS_DEVICES_COMPONENT = "nearby_fast_pair_settings_devices_component";
        public static final java.lang.String AMBIENT_CONTEXT_CONSENT_COMPONENT = "ambient_context_consent_component";
        public static final java.lang.String AMBIENT_CONTEXT_PACKAGE_NAME_EXTRA_KEY = "ambient_context_package_name_key";
        public static final java.lang.String AMBIENT_CONTEXT_EVENT_ARRAY_EXTRA_KEY = "ambient_context_event_array_key";
        @android.provider.Settings.Readable
        public static final java.lang.String AWARE_ENABLED = "aware_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String AWARE_LOCK_ENABLED = "aware_lock_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String TAP_GESTURE = "tap_gesture";
        @android.provider.Settings.Readable
        public static final java.lang.String PEOPLE_STRIP = "people_strip";
        @android.provider.Settings.Readable
        public static final java.lang.String MEDIA_CONTROLS_RESUME = "qs_media_resumption";
        public static final java.lang.String MEDIA_CONTROLS_LOCK_SCREEN = "media_controls_lock_screen";
        public static final java.lang.String MEDIA_CONTROLS_RECOMMENDATION = "qs_media_recommend";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_MAGNIFICATION_MODE = "accessibility_magnification_mode";
        public static final int ACCESSIBILITY_MAGNIFICATION_MODE_NONE = 0;
        public static final int ACCESSIBILITY_MAGNIFICATION_MODE_FULLSCREEN = 1;
        public static final int ACCESSIBILITY_MAGNIFICATION_MODE_WINDOW = 2;
        public static final int ACCESSIBILITY_MAGNIFICATION_MODE_ALL = 3;
        public static final java.lang.String ACCESSIBILITY_MAGNIFICATION_FOLLOW_TYPING_ENABLED = "accessibility_magnification_follow_typing_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCESSIBILITY_MAGNIFICATION_CAPABILITY = "accessibility_magnification_capability";
        public static final java.lang.String ACCESSIBILITY_SHOW_WINDOW_MAGNIFICATION_PROMPT = "accessibility_show_window_magnification_prompt";
        public static final java.lang.String ACCESSIBILITY_BUTTON_MODE = "accessibility_button_mode";
        public static final int ACCESSIBILITY_BUTTON_MODE_NAVIGATION_BAR = 0;
        public static final int ACCESSIBILITY_BUTTON_MODE_FLOATING_MENU = 1;
        public static final int ACCESSIBILITY_BUTTON_MODE_GESTURE = 2;
        public static final java.lang.String ACCESSIBILITY_FLOATING_MENU_SIZE = "accessibility_floating_menu_size";
        public static final java.lang.String ACCESSIBILITY_FLOATING_MENU_ICON_TYPE = "accessibility_floating_menu_icon_type";
        public static final java.lang.String ACCESSIBILITY_FLOATING_MENU_FADE_ENABLED = "accessibility_floating_menu_fade_enabled";
        public static final java.lang.String ACCESSIBILITY_FLOATING_MENU_OPACITY = "accessibility_floating_menu_opacity";
        public static final java.lang.String ACCESSIBILITY_FLOATING_MENU_MIGRATION_TOOLTIP_PROMPT = "accessibility_floating_menu_migration_tooltip_prompt";
        public static final java.lang.String ADAPTIVE_CONNECTIVITY_ENABLED = "adaptive_connectivity_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String[] LEGACY_RESTORE_SETTINGS = null;
        public static final java.lang.String ASSIST_HANDLES_LEARNING_TIME_ELAPSED_MILLIS = "reminder_exp_learning_time_elapsed";
        public static final java.lang.String ASSIST_HANDLES_LEARNING_EVENT_COUNT = "reminder_exp_learning_event_count";
        public static final java.lang.String CLIPBOARD_SHOW_ACCESS_NOTIFICATIONS = "clipboard_show_access_notifications";
        @android.provider.Settings.Readable
        public static final java.lang.String NAS_SETTINGS_UPDATED = "nas_settings_updated";
        @android.provider.Settings.Readable
        public static final java.lang.String GAME_DASHBOARD_ALWAYS_ON = "game_dashboard_always_on";
        public static final int DEVICE_STATE_ROTATION_LOCK_IGNORED = 0;
        public static final int DEVICE_STATE_ROTATION_LOCK_LOCKED = 1;
        public static final int DEVICE_STATE_ROTATION_LOCK_UNLOCKED = 2;
        public static final int DEVICE_STATE_ROTATION_KEY_UNKNOWN = -1;
        public static final int DEVICE_STATE_ROTATION_KEY_FOLDED = 0;
        public static final int DEVICE_STATE_ROTATION_KEY_HALF_FOLDED = 1;
        public static final int DEVICE_STATE_ROTATION_KEY_UNFOLDED = 2;
        public static final java.lang.String DEVICE_STATE_ROTATION_LOCK = "device_state_rotation_lock";
        public static final java.lang.String COMMUNAL_MODE_ENABLED = "communal_mode_enabled";
        public static final java.lang.String COMMUNAL_MODE_TRUSTED_NETWORKS = "communal_mode_trusted_networks";
        public static final java.lang.String HDMI_CEC_SET_MENU_LANGUAGE_DENYLIST = "hdmi_cec_set_menu_language_denylist";
        public static final java.lang.String LAUNCHER_TASKBAR_EDUCATION_SHOWING = "launcher_taskbar_education_showing";
        public static final java.lang.String ADAPTIVE_CHARGING_ENABLED = "adaptive_charging_enabled";
        public static final java.lang.String EXTRA_AUTOMATIC_POWER_SAVE_MODE = "extra_automatic_power_save_mode";
        public static final java.lang.String LOCK_SCREEN_WEATHER_ENABLED = "lockscreen_weather_enabled";
        public static final java.util.Set<java.lang.String> INSTANT_APP_SETTINGS = null;
        public Secure() { super(); }
        public static void getMovedToGlobalSettings(java.util.Set<java.lang.String> p0) {}
        public static void getMovedToSystemSettings(java.util.Set<java.lang.String> p0) {}
        public static void clearProviderForTest() {}
        public static void getPublicSettings(java.util.Set<java.lang.String> p0, java.util.Set<java.lang.String> p1, android.util.ArrayMap<java.lang.String, java.lang.Integer> p2) {}
        public static java.lang.String getString(android.content.ContentResolver p0, java.lang.String p1) { return null; }
        public static java.lang.String getStringForUser(android.content.ContentResolver p0, java.lang.String p1, int p2) { return null; }
        @android.annotation.RequiresPermission("android.permission.MODIFY_SETTINGS_OVERRIDEABLE_BY_RESTORE")
        public static boolean putString(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, boolean p3) { return false; }
        public static boolean putString(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2) { return false; }
        public static boolean putStringForUser(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, int p3) { return false; }
        public static boolean putStringForUser(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4, int p5, boolean p6) { return false; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
        public static boolean putString(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) { return false; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
        public static void resetToDefaults(android.content.ContentResolver p0, java.lang.String p1) {}
        public static void resetToDefaultsAsUser(android.content.ContentResolver p0, java.lang.String p1, int p2, int p3) {}
        public static android.net.Uri getUriFor(java.lang.String p0) { return null; }
        public static int getInt(android.content.ContentResolver p0, java.lang.String p1, int p2) { return 0; }
        public static int getIntForUser(android.content.ContentResolver p0, java.lang.String p1, int p2, int p3) { return 0; }
        public static int getInt(android.content.ContentResolver p0, java.lang.String p1) throws android.provider.Settings.SettingNotFoundException { return 0; }
        public static int getIntForUser(android.content.ContentResolver p0, java.lang.String p1, int p2) throws android.provider.Settings.SettingNotFoundException { return 0; }
        public static boolean putInt(android.content.ContentResolver p0, java.lang.String p1, int p2) { return false; }
        public static boolean putIntForUser(android.content.ContentResolver p0, java.lang.String p1, int p2, int p3) { return false; }
        public static long getLong(android.content.ContentResolver p0, java.lang.String p1, long p2) { return 0L; }
        public static long getLongForUser(android.content.ContentResolver p0, java.lang.String p1, long p2, int p3) { return 0L; }
        public static long getLong(android.content.ContentResolver p0, java.lang.String p1) throws android.provider.Settings.SettingNotFoundException { return 0L; }
        public static long getLongForUser(android.content.ContentResolver p0, java.lang.String p1, int p2) throws android.provider.Settings.SettingNotFoundException { return 0L; }
        public static boolean putLong(android.content.ContentResolver p0, java.lang.String p1, long p2) { return false; }
        public static boolean putLongForUser(android.content.ContentResolver p0, java.lang.String p1, long p2, int p3) { return false; }
        public static float getFloat(android.content.ContentResolver p0, java.lang.String p1, float p2) { return 0.0f; }
        public static float getFloatForUser(android.content.ContentResolver p0, java.lang.String p1, float p2, int p3) { return 0.0f; }
        public static float getFloat(android.content.ContentResolver p0, java.lang.String p1) throws android.provider.Settings.SettingNotFoundException { return 0.0f; }
        public static float getFloatForUser(android.content.ContentResolver p0, java.lang.String p1, int p2) throws android.provider.Settings.SettingNotFoundException { return 0.0f; }
        public static boolean putFloat(android.content.ContentResolver p0, java.lang.String p1, float p2) { return false; }
        public static boolean putFloatForUser(android.content.ContentResolver p0, java.lang.String p1, float p2, int p3) { return false; }
        public static void getCloneToManagedProfileSettings(java.util.Set<java.lang.String> p0) {}
        @java.lang.Deprecated
        public static boolean isLocationProviderEnabled(android.content.ContentResolver p0, java.lang.String p1) { return false; }
        @java.lang.Deprecated
        public static void setLocationProviderEnabled(android.content.ContentResolver p0, java.lang.String p1, boolean p2) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DeviceStateRotationLockKey {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DeviceStateRotationLockSetting {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DockSetupState {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UserSetupPersonalization {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface SetAllResult {
    }

    public static class SettingNotFoundException extends android.util.AndroidException {
        public SettingNotFoundException(java.lang.String p0) { super(); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SupervisorVerificationSetting {
    }

    public static final class System extends android.provider.Settings.NameValueTable {
        public static final android.net.Uri CONTENT_URI = null;
        @java.lang.Deprecated
        public static final java.lang.String STAY_ON_WHILE_PLUGGED_IN = "stay_on_while_plugged_in";
        @android.provider.Settings.Readable
        public static final java.lang.String END_BUTTON_BEHAVIOR = "end_button_behavior";
        public static final int END_BUTTON_BEHAVIOR_HOME = 1;
        public static final int END_BUTTON_BEHAVIOR_SLEEP = 2;
        public static final int END_BUTTON_BEHAVIOR_DEFAULT = 2;
        @android.provider.Settings.Readable
        public static final java.lang.String ADVANCED_SETTINGS = "advanced_settings";
        public static final int ADVANCED_SETTINGS_DEFAULT = 0;
        public static final java.lang.String WEAR_ACCESSIBILITY_GESTURE_ENABLED = "wear_accessibility_gesture_enabled";
        @java.lang.Deprecated
        public static final java.lang.String AIRPLANE_MODE_ON = "airplane_mode_on";
        @java.lang.Deprecated
        public static final java.lang.String RADIO_BLUETOOTH = "bluetooth";
        @java.lang.Deprecated
        public static final java.lang.String RADIO_WIFI = "wifi";
        @java.lang.Deprecated
        public static final java.lang.String RADIO_WIMAX = "wimax";
        @java.lang.Deprecated
        public static final java.lang.String RADIO_CELL = "cell";
        @java.lang.Deprecated
        public static final java.lang.String RADIO_NFC = "nfc";
        @java.lang.Deprecated
        public static final java.lang.String AIRPLANE_MODE_RADIOS = "airplane_mode_radios";
        @java.lang.Deprecated
        public static final java.lang.String AIRPLANE_MODE_TOGGLEABLE_RADIOS = "airplane_mode_toggleable_radios";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_SLEEP_POLICY = "wifi_sleep_policy";
        @java.lang.Deprecated
        public static final int WIFI_SLEEP_POLICY_DEFAULT = 0;
        @java.lang.Deprecated
        public static final int WIFI_SLEEP_POLICY_NEVER_WHILE_PLUGGED = 1;
        @java.lang.Deprecated
        public static final int WIFI_SLEEP_POLICY_NEVER = 2;
        @java.lang.Deprecated
        public static final java.lang.String MODE_RINGER = "mode_ringer";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_USE_STATIC_IP = "wifi_use_static_ip";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_STATIC_IP = "wifi_static_ip";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_STATIC_GATEWAY = "wifi_static_gateway";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_STATIC_NETMASK = "wifi_static_netmask";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_STATIC_DNS1 = "wifi_static_dns1";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_STATIC_DNS2 = "wifi_static_dns2";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_DISCOVERABILITY = "bluetooth_discoverability";
        @android.provider.Settings.Readable
        public static final java.lang.String BLUETOOTH_DISCOVERABILITY_TIMEOUT = "bluetooth_discoverability_timeout";
        @java.lang.Deprecated
        public static final java.lang.String LOCK_PATTERN_ENABLED = "lock_pattern_autolock";
        @java.lang.Deprecated
        public static final java.lang.String LOCK_PATTERN_VISIBLE = "lock_pattern_visible_pattern";
        @java.lang.Deprecated
        public static final java.lang.String LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED = "lock_pattern_tactile_feedback_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String NEXT_ALARM_FORMATTED = "next_alarm_formatted";
        @android.provider.Settings.Readable
        public static final java.lang.String FONT_SCALE = "font_scale";
        @android.provider.Settings.Readable
        public static final java.lang.String SYSTEM_LOCALES = "system_locales";
        @java.lang.Deprecated
        public static final java.lang.String DEBUG_APP = "debug_app";
        @java.lang.Deprecated
        public static final java.lang.String WAIT_FOR_DEBUGGER = "wait_for_debugger";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String DIM_SCREEN = "dim_screen";
        @android.provider.Settings.Readable
        public static final java.lang.String DISPLAY_COLOR_MODE = "display_color_mode";
        public static final java.lang.String DISPLAY_COLOR_MODE_VENDOR_HINT = "display_color_mode_vendor_hint";
        @android.provider.Settings.Readable
        public static final java.lang.String MIN_REFRESH_RATE = "min_refresh_rate";
        @android.provider.Settings.Readable
        public static final java.lang.String PEAK_REFRESH_RATE = "peak_refresh_rate";
        @android.provider.Settings.Readable
        public static final java.lang.String SCREEN_OFF_TIMEOUT = "screen_off_timeout";
        @android.provider.Settings.Readable
        public static final java.lang.String SCREEN_BRIGHTNESS = "screen_brightness";
        @android.provider.Settings.Readable
        public static final java.lang.String SCREEN_BRIGHTNESS_FOR_VR = "screen_brightness_for_vr";
        @android.provider.Settings.Readable
        public static final java.lang.String SCREEN_BRIGHTNESS_FOR_VR_FLOAT = "screen_brightness_for_vr_float";
        @android.provider.Settings.Readable
        public static final java.lang.String SCREEN_BRIGHTNESS_FLOAT = "screen_brightness_float";
        @android.provider.Settings.Readable
        public static final java.lang.String SCREEN_BRIGHTNESS_MODE = "screen_brightness_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String SCREEN_AUTO_BRIGHTNESS_ADJ = "screen_auto_brightness_adj";
        public static final int SCREEN_BRIGHTNESS_MODE_MANUAL = 0;
        public static final int SCREEN_BRIGHTNESS_MODE_AUTOMATIC = 1;
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String ADAPTIVE_SLEEP = "adaptive_sleep";
        @java.lang.Deprecated
        public static final java.lang.String SHOW_PROCESSES = "show_processes";
        @java.lang.Deprecated
        public static final java.lang.String ALWAYS_FINISH_ACTIVITIES = "always_finish_activities";
        @android.provider.Settings.Readable
        public static final java.lang.String MODE_RINGER_STREAMS_AFFECTED = "mode_ringer_streams_affected";
        @android.provider.Settings.Readable
        public static final java.lang.String MUTE_STREAMS_AFFECTED = "mute_streams_affected";
        @android.provider.Settings.Readable
        public static final java.lang.String VIBRATE_ON = "vibrate_on";
        @android.provider.Settings.Readable
        public static final java.lang.String APPLY_RAMPING_RINGER = "apply_ramping_ringer";
        @android.provider.Settings.Readable
        public static final java.lang.String VIBRATE_INPUT_DEVICES = "vibrate_input_devices";
        public static final java.lang.String ALARM_VIBRATION_INTENSITY = "alarm_vibration_intensity";
        public static final java.lang.String MEDIA_VIBRATION_INTENSITY = "media_vibration_intensity";
        @android.provider.Settings.Readable
        public static final java.lang.String NOTIFICATION_VIBRATION_INTENSITY = "notification_vibration_intensity";
        @android.provider.Settings.Readable
        public static final java.lang.String RING_VIBRATION_INTENSITY = "ring_vibration_intensity";
        @android.provider.Settings.Readable
        public static final java.lang.String HAPTIC_FEEDBACK_INTENSITY = "haptic_feedback_intensity";
        public static final java.lang.String HARDWARE_HAPTIC_FEEDBACK_INTENSITY = "hardware_haptic_feedback_intensity";
        @android.provider.Settings.Readable
        public static final java.lang.String VOLUME_RING = "volume_ring";
        @android.provider.Settings.Readable
        public static final java.lang.String VOLUME_SYSTEM = "volume_system";
        @android.provider.Settings.Readable
        public static final java.lang.String VOLUME_VOICE = "volume_voice";
        @android.provider.Settings.Readable
        public static final java.lang.String VOLUME_MUSIC = "volume_music";
        @android.provider.Settings.Readable
        public static final java.lang.String VOLUME_ALARM = "volume_alarm";
        @android.provider.Settings.Readable
        public static final java.lang.String VOLUME_NOTIFICATION = "volume_notification";
        @android.provider.Settings.Readable
        public static final java.lang.String VOLUME_BLUETOOTH_SCO = "volume_bluetooth_sco";
        @android.provider.Settings.Readable
        public static final java.lang.String VOLUME_ACCESSIBILITY = "volume_a11y";
        @android.provider.Settings.Readable
        public static final java.lang.String VOLUME_ASSISTANT = "volume_assistant";
        @android.provider.Settings.Readable
        public static final java.lang.String VOLUME_MASTER = "volume_master";
        @android.provider.Settings.Readable
        public static final java.lang.String MASTER_MONO = "master_mono";
        @android.provider.Settings.Readable
        public static final java.lang.String MASTER_BALANCE = "master_balance";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String NOTIFICATIONS_USE_RING_VOLUME = "notifications_use_ring_volume";
        @android.provider.Settings.Readable
        public static final java.lang.String VIBRATE_IN_SILENT = "vibrate_in_silent";
        public static final java.lang.String[] VOLUME_SETTINGS = null;
        public static final java.lang.String[] VOLUME_SETTINGS_INT = null;
        @android.provider.Settings.Readable
        public static final java.lang.String APPEND_FOR_LAST_AUDIBLE = "_last_audible";
        @android.provider.Settings.Readable
        public static final java.lang.String RINGTONE = "ringtone";
        public static final android.net.Uri DEFAULT_RINGTONE_URI = null;
        @android.provider.Settings.Readable
        public static final java.lang.String RINGTONE_CACHE = "ringtone_cache";
        public static final android.net.Uri RINGTONE_CACHE_URI = null;
        @android.provider.Settings.Readable
        public static final java.lang.String NOTIFICATION_SOUND = "notification_sound";
        public static final android.net.Uri DEFAULT_NOTIFICATION_URI = null;
        @android.provider.Settings.Readable
        public static final java.lang.String NOTIFICATION_SOUND_CACHE = "notification_sound_cache";
        public static final android.net.Uri NOTIFICATION_SOUND_CACHE_URI = null;
        @android.provider.Settings.Readable
        public static final java.lang.String ALARM_ALERT = "alarm_alert";
        public static final android.net.Uri DEFAULT_ALARM_ALERT_URI = null;
        @android.provider.Settings.Readable
        public static final java.lang.String ALARM_ALERT_CACHE = "alarm_alert_cache";
        public static final android.net.Uri ALARM_ALERT_CACHE_URI = null;
        @android.provider.Settings.Readable(maxTargetSdk=30)
        public static final java.lang.String MEDIA_BUTTON_RECEIVER = "media_button_receiver";
        @android.provider.Settings.Readable
        public static final java.lang.String TEXT_AUTO_REPLACE = "auto_replace";
        @android.provider.Settings.Readable
        public static final java.lang.String TEXT_AUTO_CAPS = "auto_caps";
        @android.provider.Settings.Readable
        public static final java.lang.String TEXT_AUTO_PUNCTUATE = "auto_punctuate";
        @android.provider.Settings.Readable
        public static final java.lang.String TEXT_SHOW_PASSWORD = "show_password";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_GTALK_SERVICE_STATUS = "SHOW_GTALK_SERVICE_STATUS";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WALLPAPER_ACTIVITY = "wallpaper_activity";
        @java.lang.Deprecated
        public static final java.lang.String AUTO_TIME = "auto_time";
        @java.lang.Deprecated
        public static final java.lang.String AUTO_TIME_ZONE = "auto_time_zone";
        @android.provider.Settings.Readable
        public static final java.lang.String TIME_12_24 = "time_12_24";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String DATE_FORMAT = "date_format";
        @android.provider.Settings.Readable
        public static final java.lang.String SETUP_WIZARD_HAS_RUN = "setup_wizard_has_run";
        @java.lang.Deprecated
        public static final java.lang.String WINDOW_ANIMATION_SCALE = "window_animation_scale";
        @java.lang.Deprecated
        public static final java.lang.String TRANSITION_ANIMATION_SCALE = "transition_animation_scale";
        @java.lang.Deprecated
        public static final java.lang.String ANIMATOR_DURATION_SCALE = "animator_duration_scale";
        @android.provider.Settings.Readable
        public static final java.lang.String ACCELEROMETER_ROTATION = "accelerometer_rotation";
        public static final java.lang.String ACCELEROMETER_ROTATION_ANGLES = "accelerometer_rotation_angles";
        @android.provider.Settings.Readable
        public static final java.lang.String USER_ROTATION = "user_rotation";
        @android.provider.Settings.Readable
        public static final java.lang.String HIDE_ROTATION_LOCK_TOGGLE_FOR_ACCESSIBILITY = "hide_rotation_lock_toggle_for_accessibility";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String VIBRATE_WHEN_RINGING = "vibrate_when_ringing";
        @android.provider.Settings.Readable
        public static final java.lang.String DEBUG_ENABLE_ENHANCED_CALL_BLOCKING = "debug.enable_enhanced_calling";
        @android.provider.Settings.Readable
        public static final java.lang.String DTMF_TONE_WHEN_DIALING = "dtmf_tone";
        @android.provider.Settings.Readable
        public static final java.lang.String DTMF_TONE_TYPE_WHEN_DIALING = "dtmf_tone_type";
        @android.provider.Settings.Readable
        public static final java.lang.String HEARING_AID = "hearing_aid";
        @android.provider.Settings.Readable
        public static final java.lang.String TTY_MODE = "tty_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String SOUND_EFFECTS_ENABLED = "sound_effects_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String HAPTIC_FEEDBACK_ENABLED = "haptic_feedback_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_WEB_SUGGESTIONS = "show_web_suggestions";
        @android.provider.Settings.Readable
        public static final java.lang.String NOTIFICATION_LIGHT_PULSE = "notification_light_pulse";
        @android.provider.Settings.Readable
        public static final java.lang.String POINTER_LOCATION = "pointer_location";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_TOUCHES = "show_touches";
        @android.provider.Settings.Readable
        public static final java.lang.String WINDOW_ORIENTATION_LISTENER_LOG = "window_orientation_listener_log";
        @java.lang.Deprecated
        public static final java.lang.String POWER_SOUNDS_ENABLED = "power_sounds_enabled";
        @java.lang.Deprecated
        public static final java.lang.String DOCK_SOUNDS_ENABLED = "dock_sounds_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCKSCREEN_SOUNDS_ENABLED = "lockscreen_sounds_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCKSCREEN_DISABLED = "lockscreen.disabled";
        @java.lang.Deprecated
        public static final java.lang.String LOW_BATTERY_SOUND = "low_battery_sound";
        @java.lang.Deprecated
        public static final java.lang.String DESK_DOCK_SOUND = "desk_dock_sound";
        @java.lang.Deprecated
        public static final java.lang.String DESK_UNDOCK_SOUND = "desk_undock_sound";
        @java.lang.Deprecated
        public static final java.lang.String CAR_DOCK_SOUND = "car_dock_sound";
        @java.lang.Deprecated
        public static final java.lang.String CAR_UNDOCK_SOUND = "car_undock_sound";
        @java.lang.Deprecated
        public static final java.lang.String LOCK_SOUND = "lock_sound";
        @java.lang.Deprecated
        public static final java.lang.String UNLOCK_SOUND = "unlock_sound";
        @android.provider.Settings.Readable
        public static final java.lang.String SIP_RECEIVE_CALLS = "sip_receive_calls";
        @android.provider.Settings.Readable
        public static final java.lang.String SIP_CALL_OPTIONS = "sip_call_options";
        @android.provider.Settings.Readable
        public static final java.lang.String SIP_ALWAYS = "SIP_ALWAYS";
        @android.provider.Settings.Readable
        public static final java.lang.String SIP_ADDRESS_ONLY = "SIP_ADDRESS_ONLY";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String SIP_ASK_ME_EACH_TIME = "SIP_ASK_ME_EACH_TIME";
        @android.provider.Settings.Readable
        public static final java.lang.String POINTER_SPEED = "pointer_speed";
        @android.provider.Settings.Readable
        public static final java.lang.String LOCK_TO_APP_ENABLED = "lock_to_app_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String EGG_MODE = "egg_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String SHOW_BATTERY_PERCENT = "status_bar_show_battery_percent";
        @android.provider.Settings.Readable
        public static final java.lang.String MULTI_AUDIO_FOCUS_ENABLED = "multi_audio_focus_enabled";
        @android.provider.Settings.Readable
        public static final java.lang.String DESKTOP_MODE = "desktop_mode";
        @android.provider.Settings.Readable
        public static final java.lang.String VOLUME_KEY_CURSOR_CONTROL = "volume_key_cursor_control";
        public static final java.lang.String[] LEGACY_RESTORE_SETTINGS = null;
        public static final java.util.Set<java.lang.String> PUBLIC_SETTINGS = null;
        public static final java.util.Set<java.lang.String> PRIVATE_SETTINGS = null;
        public static final java.util.Map<java.lang.String, java.lang.String> CLONE_FROM_PARENT_ON_VALUE = null;
        public static final java.util.Set<java.lang.String> INSTANT_APP_SETTINGS = null;
        @android.provider.Settings.Readable
        public static final java.lang.String WHEN_TO_MAKE_WIFI_CALLS = "when_to_make_wifi_calls";
        @java.lang.Deprecated
        public static final java.lang.String ADB_ENABLED = "adb_enabled";
        @java.lang.Deprecated
        public static final java.lang.String ANDROID_ID = "android_id";
        @java.lang.Deprecated
        public static final java.lang.String BLUETOOTH_ON = "bluetooth_on";
        @java.lang.Deprecated
        public static final java.lang.String DATA_ROAMING = "data_roaming";
        @java.lang.Deprecated
        public static final java.lang.String DEVICE_PROVISIONED = "device_provisioned";
        @java.lang.Deprecated
        public static final java.lang.String HTTP_PROXY = "http_proxy";
        @java.lang.Deprecated
        public static final java.lang.String INSTALL_NON_MARKET_APPS = "install_non_market_apps";
        @java.lang.Deprecated
        public static final java.lang.String LOCATION_PROVIDERS_ALLOWED = "location_providers_allowed";
        @java.lang.Deprecated
        public static final java.lang.String LOGGING_ID = "logging_id";
        @java.lang.Deprecated
        public static final java.lang.String NETWORK_PREFERENCE = "network_preference";
        @java.lang.Deprecated
        public static final java.lang.String PARENTAL_CONTROL_ENABLED = "parental_control_enabled";
        @java.lang.Deprecated
        public static final java.lang.String PARENTAL_CONTROL_LAST_UPDATE = "parental_control_last_update";
        @java.lang.Deprecated
        public static final java.lang.String PARENTAL_CONTROL_REDIRECT_URL = "parental_control_redirect_url";
        @java.lang.Deprecated
        public static final java.lang.String SETTINGS_CLASSNAME = "settings_classname";
        @java.lang.Deprecated
        public static final java.lang.String USB_MASS_STORAGE_ENABLED = "usb_mass_storage_enabled";
        @java.lang.Deprecated
        public static final java.lang.String USE_GOOGLE_MAIL = "use_google_mail";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_MAX_DHCP_RETRY_COUNT = "wifi_max_dhcp_retry_count";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = "wifi_mobile_data_transition_wakelock_timeout_ms";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wifi_networks_available_notification_on";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY = "wifi_networks_available_repeat_delay";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_NUM_OPEN_NETWORKS_KEPT = "wifi_num_open_networks_kept";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_ON = "wifi_on";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE = "wifi_watchdog_acceptable_packet_loss_percentage";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_WATCHDOG_AP_COUNT = "wifi_watchdog_ap_count";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS = "wifi_watchdog_background_check_delay_ms";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED = "wifi_watchdog_background_check_enabled";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS = "wifi_watchdog_background_check_timeout_ms";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT = "wifi_watchdog_initial_ignored_ping_count";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_WATCHDOG_MAX_AP_CHECKS = "wifi_watchdog_max_ap_checks";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_WATCHDOG_ON = "wifi_watchdog_on";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_WATCHDOG_PING_COUNT = "wifi_watchdog_ping_count";
        @java.lang.Deprecated
        public static final java.lang.String WIFI_WATCHDOG_PING_DELAY_MS = "wifi_watchdog_ping_delay_ms";
        @java.lang.Deprecated
        @android.provider.Settings.Readable
        public static final java.lang.String WIFI_WATCHDOG_PING_TIMEOUT_MS = "wifi_watchdog_ping_timeout_ms";
        public System() { super(); }
        public static void getMovedToGlobalSettings(java.util.Set<java.lang.String> p0) {}
        public static void getMovedToSecureSettings(java.util.Set<java.lang.String> p0) {}
        public static void getNonLegacyMovedKeys(java.util.HashSet<java.lang.String> p0) {}
        public static void clearProviderForTest() {}
        public static void getPublicSettings(java.util.Set<java.lang.String> p0, java.util.Set<java.lang.String> p1, android.util.ArrayMap<java.lang.String, java.lang.Integer> p2) {}
        public static java.lang.String getString(android.content.ContentResolver p0, java.lang.String p1) { return null; }
        public static java.lang.String getStringForUser(android.content.ContentResolver p0, java.lang.String p1, int p2) { return null; }
        public static boolean putString(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2) { return false; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.MODIFY_SETTINGS_OVERRIDEABLE_BY_RESTORE")
        public static boolean putString(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, boolean p3) { return false; }
        public static boolean putStringForUser(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, int p3) { return false; }
        public static android.net.Uri getUriFor(java.lang.String p0) { return null; }
        public static int getInt(android.content.ContentResolver p0, java.lang.String p1, int p2) { return 0; }
        public static int getIntForUser(android.content.ContentResolver p0, java.lang.String p1, int p2, int p3) { return 0; }
        public static int getInt(android.content.ContentResolver p0, java.lang.String p1) throws android.provider.Settings.SettingNotFoundException { return 0; }
        public static int getIntForUser(android.content.ContentResolver p0, java.lang.String p1, int p2) throws android.provider.Settings.SettingNotFoundException { return 0; }
        public static boolean putInt(android.content.ContentResolver p0, java.lang.String p1, int p2) { return false; }
        public static boolean putIntForUser(android.content.ContentResolver p0, java.lang.String p1, int p2, int p3) { return false; }
        public static long getLong(android.content.ContentResolver p0, java.lang.String p1, long p2) { return 0L; }
        public static long getLongForUser(android.content.ContentResolver p0, java.lang.String p1, long p2, int p3) { return 0L; }
        public static long getLong(android.content.ContentResolver p0, java.lang.String p1) throws android.provider.Settings.SettingNotFoundException { return 0L; }
        public static long getLongForUser(android.content.ContentResolver p0, java.lang.String p1, int p2) throws android.provider.Settings.SettingNotFoundException { return 0L; }
        public static boolean putLong(android.content.ContentResolver p0, java.lang.String p1, long p2) { return false; }
        public static boolean putLongForUser(android.content.ContentResolver p0, java.lang.String p1, long p2, int p3) { return false; }
        public static float getFloat(android.content.ContentResolver p0, java.lang.String p1, float p2) { return 0.0f; }
        public static float getFloatForUser(android.content.ContentResolver p0, java.lang.String p1, float p2, int p3) { return 0.0f; }
        public static float getFloat(android.content.ContentResolver p0, java.lang.String p1) throws android.provider.Settings.SettingNotFoundException { return 0.0f; }
        public static float getFloatForUser(android.content.ContentResolver p0, java.lang.String p1, int p2) throws android.provider.Settings.SettingNotFoundException { return 0.0f; }
        public static boolean putFloat(android.content.ContentResolver p0, java.lang.String p1, float p2) { return false; }
        public static boolean putFloatForUser(android.content.ContentResolver p0, java.lang.String p1, float p2, int p3) { return false; }
        public static void getConfiguration(android.content.ContentResolver p0, android.content.res.Configuration p1) {}
        public static void adjustConfigurationForUser(android.content.ContentResolver p0, android.content.res.Configuration p1, int p2, boolean p3) {}
        public static void clearConfiguration(android.content.res.Configuration p0) {}
        public static boolean putConfiguration(android.content.ContentResolver p0, android.content.res.Configuration p1) { return false; }
        public static boolean putConfigurationForUser(android.content.ContentResolver p0, android.content.res.Configuration p1, int p2) { return false; }
        public static boolean hasInterestingConfigurationChanges(int p0) { return false; }
        @java.lang.Deprecated
        public static boolean getShowGTalkServiceStatus(android.content.ContentResolver p0) { return false; }
        @java.lang.Deprecated
        public static boolean getShowGTalkServiceStatusForUser(android.content.ContentResolver p0, int p1) { return false; }
        @java.lang.Deprecated
        public static void setShowGTalkServiceStatus(android.content.ContentResolver p0, boolean p1) {}
        @java.lang.Deprecated
        public static void setShowGTalkServiceStatusForUser(android.content.ContentResolver p0, boolean p1, int p2) {}
        public static void getCloneToManagedProfileSettings(java.util.Set<java.lang.String> p0) {}
        public static void getCloneFromParentOnValueSettings(java.util.Map<java.lang.String, java.lang.String> p0) {}
        public static boolean canWrite(android.content.Context p0) { return false; }
    }
}
