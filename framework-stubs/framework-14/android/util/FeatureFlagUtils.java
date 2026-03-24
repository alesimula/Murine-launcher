package android.util;

public class FeatureFlagUtils {
    public static final java.lang.String FFLAG_PREFIX = "sys.fflag.";
    public static final java.lang.String FFLAG_OVERRIDE_PREFIX = "sys.fflag.override.";
    public static final java.lang.String PERSIST_PREFIX = "persist.sys.fflag.override.";
    public static final java.lang.String HEARING_AID_SETTINGS = "settings_bluetooth_hearing_aid";
    public static final java.lang.String SETTINGS_WIFITRACKER2 = "settings_wifitracker2";
    public static final java.lang.String SETTINGS_DO_NOT_RESTORE_PRESERVED = "settings_do_not_restore_preserved";
    public static final java.lang.String SETTINGS_USE_NEW_BACKUP_ELIGIBILITY_RULES = "settings_use_new_backup_eligibility_rules";
    public static final java.lang.String SETTINGS_ENABLE_SECURITY_HUB = "settings_enable_security_hub";
    public static final java.lang.String SETTINGS_SUPPORT_LARGE_SCREEN = "settings_support_large_screen";
    public static final java.lang.String SETTINGS_APP_LOCALE_OPT_IN_ENABLED = "settings_app_locale_opt_in_enabled";
    public static final java.lang.String SETTINGS_VOLUME_PANEL_IN_SYSTEMUI = "settings_volume_panel_in_systemui";
    public static final java.lang.String SETTINGS_ENABLE_MONITOR_PHANTOM_PROCS = "settings_enable_monitor_phantom_procs";
    public static final java.lang.String SETTINGS_APP_ALLOW_DARK_THEME_ACTIVATION_AT_BEDTIME = "settings_app_allow_dark_theme_activation_at_bedtime";
    public static final java.lang.String SETTINGS_NEED_CONNECTED_BLE_DEVICE_FOR_BROADCAST = "settings_need_connected_ble_device_for_broadcast";
    public static final java.lang.String SETTINGS_AUTO_TEXT_WRAPPING = "settings_auto_text_wrapping";
    public static final java.lang.String SETTINGS_NEW_KEYBOARD_UI = "settings_new_keyboard_ui";
    public static final java.lang.String SETTINGS_NEW_KEYBOARD_MODIFIER_KEY = "settings_new_keyboard_modifier_key";
    public static final java.lang.String SETTINGS_NEW_KEYBOARD_TRACKPAD = "settings_new_keyboard_trackpad";
    public static final java.lang.String SETTINGS_NEW_KEYBOARD_TRACKPAD_GESTURE = "settings_new_keyboard_trackpad_gesture";
    public static final java.lang.String SETTINGS_ENABLE_SPA = "settings_enable_spa";
    public static final java.lang.String SETTINGS_ENABLE_SPA_PHASE2 = "settings_enable_spa_phase2";
    public static final java.lang.String SETTINGS_ENABLE_SPA_METRICS = "settings_enable_spa_metrics";
    public static final java.lang.String SETTINGS_ADB_METRICS_WRITER = "settings_adb_metrics_writer";
    public static final java.lang.String SETTINGS_SHOW_STYLUS_PREFERENCES = "settings_show_stylus_preferences";
    public static final java.lang.String SETTINGS_BIOMETRICS2_ENROLLMENT = "settings_biometrics2_enrollment";
    public static final java.lang.String SETTINGS_ACCESSIBILITY_HEARING_AID_PAGE = "settings_accessibility_hearing_aid_page";
    public static final java.lang.String SETTINGS_PREFER_ACCESSIBILITY_MENU_IN_SYSTEM = "settings_prefer_accessibility_menu_in_system";
    public static final java.lang.String SETTINGS_AUDIO_ROUTING = "settings_audio_routing";
    public static final java.lang.String SETTINGS_FLASH_NOTIFICATIONS = "settings_flash_notifications";
    public static final java.lang.String SETTINGS_SHOW_UDFPS_ENROLL_IN_SETTINGS = "settings_show_udfps_enroll_in_settings";
    public static final java.lang.String SETTINGS_ENABLE_LOCKSCREEN_TRANSFER_API = "settings_enable_lockscreen_transfer_api";
    public static final java.lang.String SETTINGS_REMOTE_DEVICE_CREDENTIAL_VALIDATION = "settings_remote_device_credential_validation";
    public FeatureFlagUtils() {}
    public static boolean isEnabled(android.content.Context p0, java.lang.String p1) { return false; }
    public static void setEnabled(android.content.Context p0, java.lang.String p1, boolean p2) {}
    public static java.util.Map<java.lang.String, java.lang.String> getAllFeatureFlags() { return null; }
}
