package com.android.internal.accessibility.util;

public final class AccessibilityStatsLogUtils {
    private static final int UNKNOWN_STATUS = 0;
    private AccessibilityStatsLogUtils() {}
    public static void logAccessibilityShortcutActivated(android.content.Context p0, android.content.ComponentName p1, int p2) {}
    public static void logAccessibilityShortcutActivated(android.content.Context p0, android.content.ComponentName p1, int p2, boolean p3) {}
    private static void logAccessibilityShortcutActivatedInternal(android.content.ComponentName p0, int p1, int p2) {}
    public static void logMagnificationTripleTap(boolean p0) {}
    public static void logAccessibilityButtonLongPressStatus(android.content.ComponentName p0) {}
    public static void logMagnificationUsageState(int p0, long p1) {}
    public static void logMagnificationModeWithImeOn(int p0) {}
    private static boolean isFloatingMenuEnabled(android.content.Context p0) { return false; }
    private static int convertToLoggingShortcutType(android.content.Context p0, int p1) { return 0; }
    private static int convertToLoggingServiceStatus(boolean p0) { return 0; }
    private static int convertToLoggingMagnificationMode(int p0) { return 0; }
}
