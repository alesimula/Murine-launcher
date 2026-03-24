package android.util;

public class FeatureFlagUtils {
    public static final java.lang.String FFLAG_PREFIX = "sys.fflag.";
    public static final java.lang.String FFLAG_OVERRIDE_PREFIX = "sys.fflag.override.";
    public static final java.lang.String PERSIST_PREFIX = "persist.sys.fflag.override.";
    public static final java.lang.String HEARING_AID_SETTINGS = "settings_bluetooth_hearing_aid";
    public static final java.lang.String SETTINGS_WIFITRACKER2 = "settings_wifitracker2";
    public static final java.lang.String SETTINGS_DO_NOT_RESTORE_PRESERVED = "settings_do_not_restore_preserved";
    public static final java.lang.String SETTINGS_PROVIDER_MODEL = "settings_provider_model";
    public static final java.lang.String SETTINGS_USE_NEW_BACKUP_ELIGIBILITY_RULES = "settings_use_new_backup_eligibility_rules";
    public static final java.lang.String SETTINGS_ENABLE_SECURITY_HUB = "settings_enable_security_hub";
    private static final java.util.Map<java.lang.String, java.lang.String> DEFAULT_FLAGS = null;
    private static final java.util.Set<java.lang.String> PERSISTENT_FLAGS = null;
    public FeatureFlagUtils() {}
    public static boolean isEnabled(android.content.Context p0, java.lang.String p1) { return false; }
    public static void setEnabled(android.content.Context p0, java.lang.String p1, boolean p2) {}
    public static java.util.Map<java.lang.String, java.lang.String> getAllFeatureFlags() { return null; }
    private static java.lang.String getSystemPropertyPrefix(java.lang.String p0) { return null; }
}
