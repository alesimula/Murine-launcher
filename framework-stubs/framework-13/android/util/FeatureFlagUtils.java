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
    public static final java.lang.String SETTINGS_HIDE_SECOND_LAYER_PAGE_NAVIGATE_UP_BUTTON_IN_TWO_PANE = "settings_hide_second_layer_page_navigate_up_button_in_two_pane";
    public FeatureFlagUtils() {}
    public static boolean isEnabled(android.content.Context p0, java.lang.String p1) { return false; }
    public static void setEnabled(android.content.Context p0, java.lang.String p1, boolean p2) {}
    public static java.util.Map<java.lang.String, java.lang.String> getAllFeatureFlags() { return null; }
}
