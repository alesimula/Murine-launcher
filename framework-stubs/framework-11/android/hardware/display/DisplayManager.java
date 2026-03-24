package android.hardware.display;

public final class DisplayManager {
    private static final java.lang.String TAG = "DisplayManager";
    private static final boolean DEBUG = false;
    private final android.content.Context mContext = null;
    private final android.hardware.display.DisplayManagerGlobal mGlobal = null;
    private final java.lang.Object mLock = null;
    private final android.util.SparseArray<android.view.Display> mDisplays = null;
    private final java.util.ArrayList<android.view.Display> mTempDisplays = null;
    public static final java.lang.String ACTION_WIFI_DISPLAY_STATUS_CHANGED = "android.hardware.display.action.WIFI_DISPLAY_STATUS_CHANGED";
    public static final java.lang.String EXTRA_WIFI_DISPLAY_STATUS = "android.hardware.display.extra.WIFI_DISPLAY_STATUS";
    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    public static final int VIRTUAL_DISPLAY_FLAG_PUBLIC = 1;
    public static final int VIRTUAL_DISPLAY_FLAG_PRESENTATION = 2;
    public static final int VIRTUAL_DISPLAY_FLAG_SECURE = 4;
    public static final int VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY = 8;
    public static final int VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR = 16;
    public static final int VIRTUAL_DISPLAY_FLAG_CAN_SHOW_WITH_INSECURE_KEYGUARD = 32;
    public static final int VIRTUAL_DISPLAY_FLAG_SUPPORTS_TOUCH = 64;
    public static final int VIRTUAL_DISPLAY_FLAG_ROTATES_WITH_CONTENT = 128;
    public static final int VIRTUAL_DISPLAY_FLAG_DESTROY_CONTENT_ON_REMOVAL = 256;
    public static final int VIRTUAL_DISPLAY_FLAG_SHOULD_SHOW_SYSTEM_DECORATIONS = 512;
    public static final int VIRTUAL_DISPLAY_FLAG_TRUSTED = 1024;
    public DisplayManager(android.content.Context p0) {}
    public android.view.Display getDisplay(int p0) { return null; }
    public android.view.Display[] getDisplays() { return null; }
    public android.view.Display[] getDisplays(java.lang.String p0) { return null; }
    private void addAllDisplaysLocked(java.util.ArrayList<android.view.Display> p0, int[] p1) {}
    private void addPresentationDisplaysLocked(java.util.ArrayList<android.view.Display> p0, int[] p1, int p2) {}
    private android.view.Display getOrCreateDisplayLocked(int p0, boolean p1) { return null; }
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Handler p1) {}
    public void unregisterDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0) {}
    public void startWifiDisplayScan() {}
    public void stopWifiDisplayScan() {}
    public void connectWifiDisplay(java.lang.String p0) {}
    public void pauseWifiDisplay() {}
    public void resumeWifiDisplay() {}
    public void disconnectWifiDisplay() {}
    public void renameWifiDisplay(java.lang.String p0, java.lang.String p1) {}
    public void forgetWifiDisplay(java.lang.String p0) {}
    public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() { return null; }
    @android.annotation.SystemApi
    public void setSaturationLevel(float p0) {}
    public android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, android.view.Surface p4, int p5) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, android.view.Surface p4, int p5, android.hardware.display.VirtualDisplay.Callback p6, android.os.Handler p7) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.media.projection.MediaProjection p0, java.lang.String p1, int p2, int p3, int p4, android.view.Surface p5, int p6, android.hardware.display.VirtualDisplay.Callback p7, android.os.Handler p8, java.lang.String p9) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.media.projection.MediaProjection p0, android.hardware.display.VirtualDisplayConfig p1, android.hardware.display.VirtualDisplay.Callback p2, android.os.Handler p3) { return null; }
    @android.annotation.SystemApi
    public android.graphics.Point getStableDisplaySize() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.hardware.display.BrightnessChangeEvent> getBrightnessEvents() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.hardware.display.AmbientBrightnessDayStats> getAmbientBrightnessStats() { return null; }
    @android.annotation.SystemApi
    public void setBrightnessConfiguration(android.hardware.display.BrightnessConfiguration p0) {}
    public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) {}
    @android.annotation.SystemApi
    public android.hardware.display.BrightnessConfiguration getBrightnessConfiguration() { return null; }
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) { return null; }
    @android.annotation.SystemApi
    public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() { return null; }
    public boolean isMinimalPostProcessingRequested(int p0) { return false; }
    public void setTemporaryBrightness(float p0) {}
    public void setTemporaryAutoBrightnessAdjustment(float p0) {}
    @android.annotation.SystemApi
    public android.util.Pair<float[], float[]> getMinimumBrightnessCurve() { return null; }

    public static interface DeviceConfig {
        public static final java.lang.String KEY_REFRESH_RATE_IN_ZONE = "refresh_rate_in_zone";
        public static final java.lang.String KEY_PEAK_REFRESH_RATE_DISPLAY_BRIGHTNESS_THRESHOLDS = "peak_refresh_rate_brightness_thresholds";
        public static final java.lang.String KEY_PEAK_REFRESH_RATE_AMBIENT_BRIGHTNESS_THRESHOLDS = "peak_refresh_rate_ambient_thresholds";
        public static final java.lang.String KEY_PEAK_REFRESH_RATE_DEFAULT = "peak_refresh_rate_default";
        public static final java.lang.String KEY_HIGH_REFRESH_RATE_BLACKLIST = "high_refresh_rate_blacklist";
    }

    public static interface DisplayListener {
        public void onDisplayAdded(int p0);
        public void onDisplayRemoved(int p0);
        public void onDisplayChanged(int p0);
    }
}
