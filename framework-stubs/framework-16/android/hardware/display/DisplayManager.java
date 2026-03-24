package android.hardware.display;

public final class DisplayManager {
    static final boolean DEBUG = Boolean.valueOf(false);
    public static final java.lang.String HDR_OUTPUT_CONTROL_FLAG = "enable_hdr_output_control";
    public static final java.lang.String ACTION_WIFI_DISPLAY_STATUS_CHANGED = "android.hardware.display.action.WIFI_DISPLAY_STATUS_CHANGED";
    public static final java.lang.String EXTRA_WIFI_DISPLAY_STATUS = "android.hardware.display.extra.WIFI_DISPLAY_STATUS";
    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.display_category_built_in")
    public static final java.lang.String DISPLAY_CATEGORY_BUILT_IN_DISPLAYS = "android.hardware.display.category.BUILT_IN_DISPLAYS";
    public static final java.lang.String DISPLAY_CATEGORY_REAR = "android.hardware.display.category.REAR";
    @android.annotation.SuppressLint("UnflaggedApi")
    public static final java.lang.String DISPLAY_CATEGORY_ALL_INCLUDING_DISABLED = "android.hardware.display.category.ALL_INCLUDING_DISABLED";
    public static final int VIRTUAL_DISPLAY_FLAG_PUBLIC = 1;
    public static final int VIRTUAL_DISPLAY_FLAG_PRESENTATION = 2;
    public static final int VIRTUAL_DISPLAY_FLAG_SECURE = 4;
    public static final int VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY = 8;
    public static final int VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR = 16;
    public static final int VIRTUAL_DISPLAY_FLAG_CAN_SHOW_WITH_INSECURE_KEYGUARD = 32;
    @android.annotation.SuppressLint("UnflaggedApi")
    public static final int VIRTUAL_DISPLAY_FLAG_SUPPORTS_TOUCH = 64;
    @android.annotation.SystemApi
    public static final int VIRTUAL_DISPLAY_FLAG_ROTATES_WITH_CONTENT = 128;
    public static final int VIRTUAL_DISPLAY_FLAG_DESTROY_CONTENT_ON_REMOVAL = 256;
    public static final int VIRTUAL_DISPLAY_FLAG_SHOULD_SHOW_SYSTEM_DECORATIONS = 512;
    @android.annotation.SystemApi
    public static final int VIRTUAL_DISPLAY_FLAG_TRUSTED = 1024;
    public static final int VIRTUAL_DISPLAY_FLAG_OWN_DISPLAY_GROUP = 2048;
    public static final int VIRTUAL_DISPLAY_FLAG_ALWAYS_UNLOCKED = 4096;
    public static final int VIRTUAL_DISPLAY_FLAG_TOUCH_FEEDBACK_DISABLED = 8192;
    public static final int VIRTUAL_DISPLAY_FLAG_OWN_FOCUS = 16384;
    public static final int VIRTUAL_DISPLAY_FLAG_DEVICE_DISPLAY_GROUP = 32768;
    @android.annotation.SystemApi
    public static final int VIRTUAL_DISPLAY_FLAG_STEAL_TOP_FOCUS_DISABLED = 65536;
    public static final int MATCH_CONTENT_FRAMERATE_UNKNOWN = -1;
    public static final int MATCH_CONTENT_FRAMERATE_NEVER = 0;
    public static final int MATCH_CONTENT_FRAMERATE_SEAMLESSS_ONLY = 1;
    public static final int MATCH_CONTENT_FRAMERATE_ALWAYS = 2;
    public static final int SWITCHING_TYPE_NONE = 0;
    public static final int SWITCHING_TYPE_WITHIN_GROUPS = 1;
    public static final int SWITCHING_TYPE_ACROSS_AND_WITHIN_GROUPS = 2;
    public static final int SWITCHING_TYPE_RENDER_FRAME_RATE_ONLY = 3;
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.display_listener_performance_improvements")
    public static final long EVENT_TYPE_DISPLAY_ADDED = 1L;
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.display_listener_performance_improvements")
    public static final long EVENT_TYPE_DISPLAY_REMOVED = 2L;
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.display_listener_performance_improvements")
    public static final long EVENT_TYPE_DISPLAY_CHANGED = 4L;
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.display_listener_performance_improvements")
    public static final long EVENT_TYPE_DISPLAY_REFRESH_RATE = 8L;
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.display_listener_performance_improvements")
    public static final long EVENT_TYPE_DISPLAY_STATE = 16L;
    public static final long PRIVATE_EVENT_TYPE_DISPLAY_BRIGHTNESS = 1L;
    public static final long PRIVATE_EVENT_TYPE_HDR_SDR_RATIO_CHANGED = 2L;
    public static final long PRIVATE_EVENT_TYPE_DISPLAY_CONNECTION_CHANGED = 4L;
    public static final long PRIVATE_EVENT_TYPE_DISPLAY_COMMITTED_STATE_CHANGED = 8L;
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.set_brightness_by_unit")
    public static final int BRIGHTNESS_UNIT_PERCENTAGE = 0;
    public static java.lang.String brightnessUnitToString(int p0) { return null; }
    public DisplayManager(android.content.Context p0) {}
    public android.view.Display getDisplay(int p0) { return null; }
    public android.view.Display[] getDisplays() { return null; }
    public android.view.Display[] getDisplays(java.lang.String p0) { return null; }
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Handler p1) {}
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Handler p1, long p2) {}
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.display_listener_performance_improvements")
    public void registerDisplayListener(java.util.concurrent.Executor p0, long p1, android.hardware.display.DisplayManager.DisplayListener p2) {}
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Handler p1, long p2, long p3) {}
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
    @android.annotation.RequiresPermission("android.permission.MANAGE_DISPLAYS")
    public void enableConnectedDisplay(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_DISPLAYS")
    public void disableConnectedDisplay(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CONTROL_DISPLAY_SATURATION")
    public void setSaturationLevel(float p0) {}
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setUserDisabledHdrTypes(int[] p0) {}
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setAreUserDisabledHdrTypesAllowed(boolean p0) {}
    public boolean areUserDisabledHdrTypesAllowed() { return false; }
    @android.annotation.NonNull
    public int[] getUserDisabledHdrTypes() { return null; }
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.delay_implicit_rr_registration_until_rr_accessed")
    public void resetImplicitRefreshRateCallbackStatus() {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_SURFACE_FLINGER")
    public void overrideHdrTypes(int p0, int[] p1) {}
    public android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, android.view.Surface p4, int p5) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, android.view.Surface p4, int p5, android.hardware.display.VirtualDisplay.Callback p6, android.os.Handler p7) { return null; }
    @android.annotation.Nullable
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0) { return null; }
    @android.annotation.Nullable
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.os.Handler p1, android.hardware.display.VirtualDisplay.Callback p2) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.media.projection.MediaProjection p0, java.lang.String p1, int p2, int p3, int p4, android.view.Surface p5, int p6, android.hardware.display.VirtualDisplay.Callback p7, android.os.Handler p8, java.lang.String p9) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.media.projection.MediaProjection p0, android.hardware.display.VirtualDisplayConfig p1, android.hardware.display.VirtualDisplay.Callback p2, android.os.Handler p3) { return null; }
    @android.annotation.SystemApi
    public android.graphics.Point getStableDisplaySize() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BRIGHTNESS_SLIDER_USAGE")
    public java.util.List<android.hardware.display.BrightnessChangeEvent> getBrightnessEvents() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_AMBIENT_LIGHT_STATS")
    public java.util.List<android.hardware.display.AmbientBrightnessDayStats> getAmbientBrightnessStats() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CONFIGURE_DISPLAY_BRIGHTNESS")
    public void setBrightnessConfiguration(android.hardware.display.BrightnessConfiguration p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CONFIGURE_DISPLAY_BRIGHTNESS")
    public void setBrightnessConfigurationForDisplay(android.hardware.display.BrightnessConfiguration p0, java.lang.String p1) {}
    @android.annotation.SystemApi
    @android.annotation.Nullable
    @android.annotation.RequiresPermission("android.permission.CONFIGURE_DISPLAY_BRIGHTNESS")
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForDisplay(java.lang.String p0) { return null; }
    public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CONFIGURE_DISPLAY_BRIGHTNESS")
    public android.hardware.display.BrightnessConfiguration getBrightnessConfiguration() { return null; }
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CONFIGURE_DISPLAY_BRIGHTNESS")
    @android.annotation.Nullable
    public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() { return null; }
    public boolean isMinimalPostProcessingRequested(int p0) { return false; }
    public void setTemporaryBrightness(int p0, float p1) {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_DISPLAY_BRIGHTNESS")
    public void setBrightness(int p0, float p1) {}
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.set_brightness_by_unit")
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public void setBrightness(int p0, float p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_DISPLAY_BRIGHTNESS")
    public float getBrightness(int p0) { return 0.0f; }
    public float getBrightness(int p0, int p1) { return 0.0f; }
    public void setTemporaryAutoBrightnessAdjustment(float p0) {}
    @android.annotation.SystemApi
    public android.util.Pair<float[], float[]> getMinimumBrightnessCurve() { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_USER_PREFERRED_DISPLAY_MODE")
    public void setGlobalUserPreferredDisplayMode(android.view.Display.Mode p0) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_USER_PREFERRED_DISPLAY_MODE")
    public void clearGlobalUserPreferredDisplayMode() {}
    @android.annotation.Nullable
    public android.view.Display.Mode getGlobalUserPreferredDisplayMode() { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_HDR_CONVERSION_MODE")
    public void setHdrConversionMode(android.hardware.display.HdrConversionMode p0) {}
    @android.annotation.NonNull
    public android.hardware.display.HdrConversionMode getHdrConversionMode() { return null; }
    @android.annotation.NonNull
    public android.hardware.display.HdrConversionMode getHdrConversionModeSetting() { return null; }
    @android.annotation.NonNull
    public int[] getSupportedHdrOutputTypes() { return null; }
    @android.annotation.RequiresPermission("android.permission.OVERRIDE_DISPLAY_MODE_REQUESTS")
    public void setShouldAlwaysRespectAppRequestedMode(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.OVERRIDE_DISPLAY_MODE_REQUESTS")
    public boolean shouldAlwaysRespectAppRequestedMode() { return false; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.is_always_on_available_api")
    public boolean isAlwaysOnDisplayCurrentlyAvailable() { return false; }
    public boolean supportsSeamlessRefreshRateSwitching() { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_REFRESH_RATE_SWITCHING_TYPE")
    public void setRefreshRateSwitchingType(int p0) {}
    public int getMatchContentFrameRateUserPreference() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CAPTURE_VIDEO_OUTPUT")
    @android.annotation.Nullable
    public static android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, android.view.Surface p4) { return null; }
    @android.annotation.RequiresPermission("android.permission.RESTRICT_DISPLAY_MODES")
    public void requestDisplayModes(int p0, int[] p1) {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_DISPLAY_BRIGHTNESS")
    @android.annotation.Nullable
    public float[] getDozeBrightnessSensorValueToBrightness(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_DISPLAY_BRIGHTNESS")
    public float getDefaultDozeBrightness(int p0) { return 0.0f; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DISPLAYS")
    @android.annotation.Nullable
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.display_topology_api")
    public android.hardware.display.DisplayTopology getDisplayTopology() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DISPLAYS")
    public void setDisplayTopology(android.hardware.display.DisplayTopology p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_DISPLAYS")
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.display_topology_api")
    public void registerTopologyListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.hardware.display.DisplayTopology> p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_DISPLAYS")
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.display_topology_api")
    public void unregisterTopologyListener(java.util.function.Consumer<android.hardware.display.DisplayTopology> p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BrightnessUnit {
    }

    public static interface DeviceConfig {
        public static final java.lang.String KEY_REFRESH_RATE_IN_LOW_ZONE = "refresh_rate_in_zone";
        public static final java.lang.String KEY_FIXED_REFRESH_RATE_LOW_DISPLAY_BRIGHTNESS_THRESHOLDS = "peak_refresh_rate_brightness_thresholds";
        public static final java.lang.String KEY_FIXED_REFRESH_RATE_LOW_AMBIENT_BRIGHTNESS_THRESHOLDS = "peak_refresh_rate_ambient_thresholds";
        public static final java.lang.String KEY_REFRESH_RATE_IN_HIGH_ZONE = "refresh_rate_in_high_zone";
        public static final java.lang.String KEY_FIXED_REFRESH_RATE_HIGH_DISPLAY_BRIGHTNESS_THRESHOLDS = "fixed_refresh_rate_high_display_brightness_thresholds";
        public static final java.lang.String KEY_FIXED_REFRESH_RATE_HIGH_AMBIENT_BRIGHTNESS_THRESHOLDS = "fixed_refresh_rate_high_ambient_brightness_thresholds";
        public static final java.lang.String KEY_REFRESH_RATE_IN_HBM_SUNLIGHT = "refresh_rate_in_hbm_sunlight";
        public static final java.lang.String KEY_REFRESH_RATE_IN_HBM_HDR = "refresh_rate_in_hbm_hdr";
        public static final java.lang.String KEY_PEAK_REFRESH_RATE_DEFAULT = "peak_refresh_rate_default";
        public static final java.lang.String KEY_HIGH_REFRESH_RATE_BLACKLIST = "high_refresh_rate_blacklist";
        public static final java.lang.String KEY_BRIGHTNESS_THROTTLING_DATA = "brightness_throttling_data";
        public static final java.lang.String KEY_POWER_THROTTLING_DATA = "power_throttling_data";
        public static final java.lang.String KEY_USE_NORMAL_BRIGHTNESS_MODE_CONTROLLER = "use_normal_brightness_mode_controller";
        public static final java.lang.String KEY_DISABLE_SCREEN_WAKE_LOCKS_WHILE_CACHED = "disable_screen_wake_locks_while_cached";
    }

    public static interface DisplayListener {
        public void onDisplayAdded(int p0);
        public void onDisplayRemoved(int p0);
        public void onDisplayChanged(int p0);
        default public void onDisplayConnected(int p0) {}
        default public void onDisplayDisconnected(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MatchContentFrameRateType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PrivateEventType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SwitchingType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VirtualDisplayFlag {
    }

    private static final class WeakDisplayCache {
        android.view.Display get(int p0) { return null; }
        void put(android.view.Display p0) {}
    }
}
