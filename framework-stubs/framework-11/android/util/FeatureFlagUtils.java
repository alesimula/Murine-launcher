package android.util;

public class FeatureFlagUtils {
    public static final java.lang.String FFLAG_PREFIX = "sys.fflag.";
    public static final java.lang.String FFLAG_OVERRIDE_PREFIX = "sys.fflag.override.";
    public static final java.lang.String PERSIST_PREFIX = "persist.sys.fflag.override.";
    public static final java.lang.String SEAMLESS_TRANSFER = "settings_seamless_transfer";
    public static final java.lang.String HEARING_AID_SETTINGS = "settings_bluetooth_hearing_aid";
    public static final java.lang.String SCREENRECORD_LONG_PRESS = "settings_screenrecord_long_press";
    public static final java.lang.String DYNAMIC_SYSTEM = "settings_dynamic_system";
    public static final java.lang.String SETTINGS_WIFITRACKER2 = "settings_wifitracker2";
    public static final java.lang.String SETTINGS_FUSE_FLAG = "settings_fuse";
    public static final java.lang.String SETTINGS_DO_NOT_RESTORE_PRESERVED = "settings_do_not_restore_preserved";
    private static final java.util.Map<java.lang.String, java.lang.String> DEFAULT_FLAGS = null;
    public FeatureFlagUtils() {}
    public static boolean isEnabled(android.content.Context p0, java.lang.String p1) { return false; }
    public static void setEnabled(android.content.Context p0, java.lang.String p1, boolean p2) {}
    public static java.util.Map<java.lang.String, java.lang.String> getAllFeatureFlags() { return null; }
}
