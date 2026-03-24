package com.android.internal.accessibility.util;

public final class AccessibilityUtils {
    public static final int NONE = 0;
    public static final int TEXT = 1;
    public static final int PARCELABLE_SPAN = 2;
    public static final java.lang.String MENU_SERVICE_RELATIVE_CLASS_NAME = ".AccessibilityMenuService";
    public static final android.content.ComponentName ACCESSIBILITY_MENU_IN_SYSTEM = null;
    public static java.util.Set<android.content.ComponentName> getEnabledServicesFromSettings(android.content.Context p0, int p1) { return null; }
    public static void setAccessibilityServiceState(android.content.Context p0, android.content.ComponentName p1, boolean p2) {}
    public static void setAccessibilityServiceState(android.content.Context p0, android.content.ComponentName p1, boolean p2, int p3) {}
    public static int getAccessibilityServiceFragmentType(android.accessibilityservice.AccessibilityServiceInfo p0) { return 0; }
    public static boolean isAccessibilityServiceEnabled(android.content.Context p0, java.lang.String p1) { return false; }
    public static boolean interceptHeadsetHookForActiveCall(android.content.Context p0) { return false; }
    public static boolean isUserSetupCompleted(android.content.Context p0) { return false; }
    public static int textOrSpanChanged(java.lang.CharSequence p0, java.lang.CharSequence p1) { return 0; }
    public static android.content.ComponentName getAccessibilityMenuComponentToMigrate(android.content.pm.PackageManager p0, int p1) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface A11yTextChangeType {
    }
}
