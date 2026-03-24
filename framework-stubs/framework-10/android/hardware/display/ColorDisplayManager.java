package android.hardware.display;

@android.annotation.SystemApi
public final class ColorDisplayManager {
    @android.annotation.SystemApi
    public static final int CAPABILITY_NONE = 0;
    @android.annotation.SystemApi
    public static final int CAPABILITY_PROTECTED_CONTENT = 1;
    @android.annotation.SystemApi
    public static final int CAPABILITY_HARDWARE_ACCELERATION_GLOBAL = 2;
    @android.annotation.SystemApi
    public static final int CAPABILITY_HARDWARE_ACCELERATION_PER_APP = 4;
    @android.annotation.SystemApi
    public static final int AUTO_MODE_DISABLED = 0;
    @android.annotation.SystemApi
    public static final int AUTO_MODE_CUSTOM_TIME = 1;
    @android.annotation.SystemApi
    public static final int AUTO_MODE_TWILIGHT = 2;
    public static final int COLOR_MODE_NATURAL = 0;
    public static final int COLOR_MODE_BOOSTED = 1;
    public static final int COLOR_MODE_SATURATED = 2;
    public static final int COLOR_MODE_AUTOMATIC = 3;
    public static final int VENDOR_COLOR_MODE_RANGE_MIN = 256;
    public static final int VENDOR_COLOR_MODE_RANGE_MAX = 511;
    private final android.hardware.display.ColorDisplayManager.ColorDisplayManagerInternal mManager = null;
    private com.android.internal.logging.MetricsLogger mMetricsLogger;
    public ColorDisplayManager() {}
    public boolean setNightDisplayActivated(boolean p0) { return false; }
    public boolean isNightDisplayActivated() { return false; }
    public boolean setNightDisplayColorTemperature(int p0) { return false; }
    public int getNightDisplayColorTemperature() { return 0; }
    @android.annotation.SystemApi
    public int getNightDisplayAutoMode() { return 0; }
    public int getNightDisplayAutoModeRaw() { return 0; }
    @android.annotation.SystemApi
    public boolean setNightDisplayAutoMode(int p0) { return false; }
    public java.time.LocalTime getNightDisplayCustomStartTime() { return null; }
    @android.annotation.SystemApi
    public boolean setNightDisplayCustomStartTime(java.time.LocalTime p0) { return false; }
    public java.time.LocalTime getNightDisplayCustomEndTime() { return null; }
    @android.annotation.SystemApi
    public boolean setNightDisplayCustomEndTime(java.time.LocalTime p0) { return false; }
    public void setColorMode(int p0) {}
    public int getColorMode() { return 0; }
    public boolean isDeviceColorManaged() { return false; }
    @android.annotation.SystemApi
    public boolean setSaturationLevel(int p0) { return false; }
    public boolean isSaturationActivated() { return false; }
    @android.annotation.SystemApi
    public boolean setAppSaturationLevel(java.lang.String p0, int p1) { return false; }
    public boolean setDisplayWhiteBalanceEnabled(boolean p0) { return false; }
    public boolean isDisplayWhiteBalanceEnabled() { return false; }
    public static boolean isNightDisplayAvailable(android.content.Context p0) { return false; }
    public static int getMinimumColorTemperature(android.content.Context p0) { return 0; }
    public static int getMaximumColorTemperature(android.content.Context p0) { return 0; }
    public static boolean isDisplayWhiteBalanceAvailable(android.content.Context p0) { return false; }
    public static boolean isColorTransformAccelerated(android.content.Context p0) { return false; }
    @android.annotation.SystemApi
    public int getTransformCapabilities() { return 0; }
    public static boolean areAccessibilityTransformsEnabled(android.content.Context p0) { return false; }
    private com.android.internal.logging.MetricsLogger getMetricsLogger() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ColorMode {
    }

    private static class ColorDisplayManagerInternal {
        private static android.hardware.display.ColorDisplayManager.ColorDisplayManagerInternal sInstance;
        private final android.hardware.display.IColorDisplayManager mCdm = null;
        private ColorDisplayManagerInternal(android.hardware.display.IColorDisplayManager p0) {}
        public static android.hardware.display.ColorDisplayManager.ColorDisplayManagerInternal getInstance() { return null; }
        boolean isNightDisplayActivated() { return false; }
        boolean setNightDisplayActivated(boolean p0) { return false; }
        int getNightDisplayColorTemperature() { return 0; }
        boolean setNightDisplayColorTemperature(int p0) { return false; }
        int getNightDisplayAutoMode() { return 0; }
        int getNightDisplayAutoModeRaw() { return 0; }
        boolean setNightDisplayAutoMode(int p0) { return false; }
        android.hardware.display.Time getNightDisplayCustomStartTime() { return null; }
        boolean setNightDisplayCustomStartTime(android.hardware.display.Time p0) { return false; }
        android.hardware.display.Time getNightDisplayCustomEndTime() { return null; }
        boolean setNightDisplayCustomEndTime(android.hardware.display.Time p0) { return false; }
        boolean isDeviceColorManaged() { return false; }
        boolean setSaturationLevel(int p0) { return false; }
        boolean isSaturationActivated() { return false; }
        boolean setAppSaturationLevel(java.lang.String p0, int p1) { return false; }
        boolean isDisplayWhiteBalanceEnabled() { return false; }
        boolean setDisplayWhiteBalanceEnabled(boolean p0) { return false; }
        int getColorMode() { return 0; }
        void setColorMode(int p0) {}
        int getTransformCapabilities() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CapabilityType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutoMode {
    }
}
