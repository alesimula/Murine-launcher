package com.android.server.flags;

public final class Flags {
    public static final java.lang.String FLAG_DISABLE_SYSTEM_COMPACTION = "com.android.server.flags.disable_system_compaction";
    public static final java.lang.String FLAG_ENABLE_ODP_FEATURE_GUARD = "com.android.server.flags.enable_odp_feature_guard";
    public static final java.lang.String FLAG_NEW_BUGREPORT_KEYBOARD_SHORTCUT = "com.android.server.flags.new_bugreport_keyboard_shortcut";
    public static final java.lang.String FLAG_PIN_WEBVIEW = "com.android.server.flags.pin_webview";
    public static final java.lang.String FLAG_PKG_TARGETED_BATTERY_CHANGED_NOT_STICKY = "com.android.server.flags.pkg_targeted_battery_changed_not_sticky";
    public static final java.lang.String FLAG_SKIP_HOME_ART_PINS = "com.android.server.flags.skip_home_art_pins";
    public Flags() {}
    public static boolean disableSystemCompaction() { return false; }
    public static boolean enableOdpFeatureGuard() { return false; }
    public static boolean newBugreportKeyboardShortcut() { return false; }
    public static boolean pinWebview() { return false; }
    public static boolean pkgTargetedBatteryChangedNotSticky() { return false; }
    public static boolean skipHomeArtPins() { return false; }
}
