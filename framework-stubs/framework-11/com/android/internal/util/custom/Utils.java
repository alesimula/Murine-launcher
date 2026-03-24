package com.android.internal.util.custom;

public class Utils {
    public Utils() {}
    public static boolean isWifiOnly(android.content.Context p0) { return false; }
    public static boolean hasFingerprintSupport(android.content.Context p0) { return false; }
    public static boolean hasFingerprintEnrolled(android.content.Context p0) { return false; }
    public static boolean hasCamera(android.content.Context p0) { return false; }
    public static boolean hasNFC(android.content.Context p0) { return false; }
    public static boolean hasWiFi(android.content.Context p0) { return false; }
    public static boolean hasBluetooth(android.content.Context p0) { return false; }
    public static boolean isABdevice(android.content.Context p0) { return false; }
    public static boolean deviceHasFlashlight(android.content.Context p0) { return false; }
    public static void toggleCameraFlash() {}

    private static final class FireActions {
        private static com.android.internal.statusbar.IStatusBarService mStatusBarService;
        private FireActions() {}
        private static com.android.internal.statusbar.IStatusBarService getStatusBarService() { return null; }
        public static void toggleCameraFlash() {}
    }
}
