package com.android.internal.accessibility.util;

public final class ShortcutUtils {
    @java.lang.Deprecated
    public static void optInValueToSettings(android.content.Context p0, int p1, java.lang.String p2) {}
    @java.lang.Deprecated
    public static void optOutValueFromSettings(android.content.Context p0, int p1, java.lang.String p2) {}
    public static boolean isComponentIdExistingInSettings(android.content.Context p0, int p1, java.lang.String p2) { return false; }
    @android.annotation.SuppressLint("MissingPermission")
    public static boolean isShortcutContained(android.content.Context p0, int p1, java.lang.String p2) { return false; }
    public static int getEnabledShortcutTypes(android.content.Context p0, java.lang.String p1) { return 0; }
    @android.annotation.SuppressLint("SwitchIntDef")
    public static java.lang.String convertToKey(int p0) { return null; }
    public static int convertToType(java.lang.String p0) { return 0; }
    public static void updateInvisibleToggleAccessibilityServiceEnableState(android.content.Context p0, java.util.Set<java.lang.String> p1, int p2) {}
    @android.annotation.NonNull
    public static java.util.Set<java.lang.String> getShortcutTargetsFromSettings(android.content.Context p0, int p1, int p2) { return null; }
    public static int getButtonMode(android.content.Context p0, int p1) { return 0; }
    public static boolean setButtonMode(android.content.Context p0, int p1, int p2) { return false; }
}
