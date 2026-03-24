package android.hardware.display;

public final class DisplayManagerGlobal {
    public static final int EVENT_DISPLAY_ADDED = 1;
    public static final int EVENT_DISPLAY_BASIC_CHANGED = 2;
    public static final int EVENT_DISPLAY_REMOVED = 3;
    public static final int EVENT_DISPLAY_BRIGHTNESS_CHANGED = 4;
    public static final int EVENT_DISPLAY_HDR_SDR_RATIO_CHANGED = 5;
    public static final int EVENT_DISPLAY_CONNECTED = 6;
    public static final int EVENT_DISPLAY_DISCONNECTED = 7;
    public static final int EVENT_DISPLAY_REFRESH_RATE_CHANGED = 8;
    public static final int EVENT_DISPLAY_STATE_CHANGED = 9;
    public static final int EVENT_DISPLAY_COMMITTED_STATE_CHANGED = 10;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_ADDED = 1L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_BASIC_CHANGED = 2L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_REMOVED = 4L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_BRIGHTNESS_CHANGED = 8L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_HDR_SDR_RATIO_CHANGED = 16L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_CONNECTION_CHANGED = 32L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_REFRESH_RATE = 64L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_STATE = 128L;
    public static final long INTERNAL_EVENT_FLAG_TOPOLOGY_UPDATED = 256L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_COMMITTED_STATE_CHANGED = 512L;
    public DisplayManagerGlobal(android.hardware.display.IDisplayManager p0) {}
    public static android.hardware.display.DisplayManagerGlobal getInstance() { return null; }
    public android.view.DisplayInfo getDisplayInfo(int p0) { return null; }
    public int[] getDisplayIds() { return null; }
    public int[] getDisplayIds(boolean p0) { return null; }
    public boolean isUidPresentOnDisplay(int p0, int p1) { return false; }
    public android.view.Display getCompatibleDisplay(int p0, android.view.DisplayAdjustments p1) { return null; }
    public android.view.Display getCompatibleDisplay(int p0, android.content.res.Resources p1) { return null; }
    public android.view.Display getRealDisplay(int p0) { return null; }
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Handler p1, long p2, java.lang.String p3, boolean p4) {}
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Handler p1, long p2, java.lang.String p3) {}
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, java.util.concurrent.Executor p1, long p2, java.lang.String p3, boolean p4) {}
    public void registerForRefreshRateChanges() {}
    public void unregisterDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0) {}
    public void handleDisplayChangeFromWindowManager(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_DISPLAYS")
    public void enableConnectedDisplay(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_DISPLAYS")
    public void disableConnectedDisplay(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_DISPLAYS")
    public boolean requestDisplayPower(int p0, int p1) { return false; }
    public void startWifiDisplayScan() {}
    public void stopWifiDisplayScan() {}
    public void connectWifiDisplay(java.lang.String p0) {}
    public void pauseWifiDisplay() {}
    public void resumeWifiDisplay() {}
    public void disconnectWifiDisplay() {}
    public void renameWifiDisplay(java.lang.String p0, java.lang.String p1) {}
    public void forgetWifiDisplay(java.lang.String p0) {}
    public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() { return null; }
    public void setUserDisabledHdrTypes(int[] p0) {}
    public void setAreUserDisabledHdrTypesAllowed(boolean p0) {}
    public boolean areUserDisabledHdrTypesAllowed() { return false; }
    public int[] getUserDisabledHdrTypes() { return null; }
    public void resetImplicitRefreshRateCallbackStatus() {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_SURFACE_FLINGER")
    public void overrideHdrTypes(int p0, int[] p1) {}
    public void requestColorMode(int p0, int p1) {}
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.content.Context p0, android.media.projection.MediaProjection p1, android.hardware.display.VirtualDisplayConfig p2, android.hardware.display.VirtualDisplay.Callback p3, java.util.concurrent.Executor p4) { return null; }
    @android.annotation.Nullable
    public android.hardware.display.VirtualDisplay createVirtualDisplayWrapper(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, int p2) { return null; }
    public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback p0, android.view.Surface p1) {}
    public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, int p1, int p2, int p3) {}
    public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0) {}
    void setVirtualDisplayRotation(android.hardware.display.IVirtualDisplayCallback p0, int p1) {}
    public android.graphics.Point getStableDisplaySize() { return null; }
    public java.util.List<android.hardware.display.BrightnessChangeEvent> getBrightnessEvents(java.lang.String p0) { return null; }
    public android.hardware.display.BrightnessInfo getBrightnessInfo(int p0) { return null; }
    public android.graphics.ColorSpace getPreferredWideGamutColorSpace() { return null; }
    public android.hardware.OverlayProperties getOverlaySupport() { return null; }
    public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) {}
    public void setBrightnessConfigurationForDisplay(android.hardware.display.BrightnessConfiguration p0, java.lang.String p1, int p2, java.lang.String p3) {}
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForDisplay(java.lang.String p0, int p1) { return null; }
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) { return null; }
    public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() { return null; }
    public boolean isMinimalPostProcessingRequested(int p0) { return false; }
    public void setTemporaryBrightness(int p0, float p1) {}
    public void setBrightness(int p0, float p1) {}
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public void setBrightness(int p0, float p1, int p2) {}
    public android.hardware.graphics.common.DisplayDecorationSupport getDisplayDecorationSupport(int p0) { return null; }
    public float getBrightness(int p0) { return 0.0f; }
    public float getBrightness(int p0, int p1) { return 0.0f; }
    public void setTemporaryAutoBrightnessAdjustment(float p0) {}
    public android.util.Pair<float[], float[]> getMinimumBrightnessCurve() { return null; }
    public java.util.List<android.hardware.display.AmbientBrightnessDayStats> getAmbientBrightnessStats() { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_USER_PREFERRED_DISPLAY_MODE")
    public void setUserPreferredDisplayMode(int p0, android.view.Display.Mode p1) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_USER_PREFERRED_DISPLAY_MODE")
    public void setUserPreferredDisplayMode(int p0, android.view.Display.Mode p1, boolean p2) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_USER_PREFERRED_DISPLAY_MODE")
    public void resetUserPreferredDisplayMode(int p0) {}
    public android.view.Display.Mode getUserPreferredDisplayMode(int p0) { return null; }
    public android.view.Display.Mode getSystemPreferredDisplayMode(int p0) { return null; }
    public void setHdrConversionMode(android.hardware.display.HdrConversionMode p0) {}
    public android.hardware.display.HdrConversionMode getHdrConversionModeSetting() { return null; }
    public android.hardware.display.HdrConversionMode getHdrConversionMode() { return null; }
    public int[] getSupportedHdrOutputTypes() { return null; }
    public void setShouldAlwaysRespectAppRequestedMode(boolean p0) {}
    public boolean shouldAlwaysRespectAppRequestedMode() { return false; }
    public void setRefreshRateSwitchingType(int p0) {}
    public int getRefreshRateSwitchingType() { return 0; }
    @android.annotation.RequiresPermission("android.permission.RESTRICT_DISPLAY_MODES")
    public void requestDisplayModes(int p0, int[] p1) {}
    @android.annotation.FlaggedApi("com.android.server.display.feature.flags.highest_hdr_sdr_ratio_api")
    public float getHighestHdrSdrRatio(int p0) { return 0.0f; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_DISPLAY_BRIGHTNESS")
    @android.annotation.Nullable
    public float[] getDozeBrightnessSensorValueToBrightness(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_DISPLAY_BRIGHTNESS")
    public float getDefaultDozeBrightness(int p0) { return 0.0f; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DISPLAYS")
    @android.annotation.Nullable
    public android.hardware.display.DisplayTopology getDisplayTopology() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DISPLAYS")
    public void setDisplayTopology(android.hardware.display.DisplayTopology p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_DISPLAYS")
    public void registerTopologyListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.hardware.display.DisplayTopology> p1, java.lang.String p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_DISPLAYS")
    public void unregisterTopologyListener(java.util.function.Consumer<android.hardware.display.DisplayTopology> p0) {}
    public static void invalidateLocalDisplayInfoCaches() {}
    public void disableLocalDisplayInfoCaches() {}
    public void registerNativeChoreographerForRefreshRateCallbacks() {}
    public void unregisterNativeChoreographerForRefreshRateCallbacks() {}
    public long mapFiltersToInternalEventFlag(long p0, long p1) { return 0L; }
    public java.util.concurrent.CopyOnWriteArrayList<android.hardware.display.DisplayManagerGlobal.DisplayListenerDelegate> getDisplayListeners() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisplayEvent {
    }

    public static final class DisplayListenerDelegate {
        public final android.hardware.display.DisplayManager.DisplayListener mListener = null;
        public volatile long mInternalEventFlagsMask;
        DisplayListenerDelegate(android.hardware.display.DisplayManager.DisplayListener p0, java.util.concurrent.Executor p1, long p2, java.lang.String p3, boolean p4) {}
        void sendDisplayEvent(int p0, int p1, android.view.DisplayInfo p2, boolean p3) {}
        public boolean isEventFilterExplicit() { return false; }
        void clearEvents() {}
        void setEventsMask(long p0) {}
        public java.lang.String toString() { return null; }
    }

    private final class DisplayManagerCallback extends android.hardware.display.IDisplayManagerCallback.Stub {
        public void onDisplayEvent(int p0, int p1) {}
        public void onTopologyChanged(android.hardware.display.DisplayTopology p0) {}
    }

    private static final class DisplayTopologyListenerDelegate {
        DisplayTopologyListenerDelegate(java.util.function.Consumer<android.hardware.display.DisplayTopology> p0, java.util.concurrent.Executor p1, java.lang.String p2) {}
        public java.lang.String toString() { return null; }
        void onTopologyChanged(android.hardware.display.DisplayTopology p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InternalEventFlag {
    }

    public static final class VirtualDisplayCallback extends android.hardware.display.IVirtualDisplayCallback.Stub {
        public VirtualDisplayCallback(android.hardware.display.VirtualDisplay.Callback p0, java.util.concurrent.Executor p1) { super(); }
        public void onPaused() {}
        public void onResumed() {}
        public void onStopped() {}
    }
}
