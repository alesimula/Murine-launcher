package android.hardware.display;

public final class DisplayManagerGlobal {
    private static final java.lang.String TAG = "DisplayManager";
    private static final boolean DEBUG = false;
    private static final boolean USE_CACHE = false;
    public static final int EVENT_DISPLAY_ADDED = 1;
    public static final int EVENT_DISPLAY_CHANGED = 2;
    public static final int EVENT_DISPLAY_REMOVED = 3;
    public static final int EVENT_DISPLAY_BRIGHTNESS_CHANGED = 4;
    private static android.hardware.display.DisplayManagerGlobal sInstance;
    private boolean mDispatchNativeCallbacks;
    private float mNativeCallbackReportedRefreshRate;
    private final java.lang.Object mLock = null;
    private final android.hardware.display.IDisplayManager mDm = null;
    private android.hardware.display.DisplayManagerGlobal.DisplayManagerCallback mCallback;
    private long mRegisteredEventsMask;
    private final java.util.ArrayList<android.hardware.display.DisplayManagerGlobal.DisplayListenerDelegate> mDisplayListeners = null;
    private final android.util.SparseArray<android.view.DisplayInfo> mDisplayInfoCache = null;
    private final android.graphics.ColorSpace mWideColorSpace = null;
    private int[] mDisplayIdCache;
    private int mWifiDisplayScanNestCount;
    private android.app.PropertyInvalidatedCache<java.lang.Integer, android.view.DisplayInfo> mDisplayCache;
    public static final java.lang.String CACHE_KEY_DISPLAY_INFO_PROPERTY = "cache_key.display_info";
    public DisplayManagerGlobal(android.hardware.display.IDisplayManager p0) {}
    public static android.hardware.display.DisplayManagerGlobal getInstance() { return null; }
    public android.view.DisplayInfo getDisplayInfo(int p0) { return null; }
    private android.view.DisplayInfo getDisplayInfoLocked(int p0) { return null; }
    public int[] getDisplayIds() { return null; }
    public boolean isUidPresentOnDisplay(int p0, int p1) { return false; }
    public android.view.Display getCompatibleDisplay(int p0, android.view.DisplayAdjustments p1) { return null; }
    public android.view.Display getCompatibleDisplay(int p0, android.content.res.Resources p1) { return null; }
    public android.view.Display getRealDisplay(int p0) { return null; }
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Handler p1, long p2) {}
    public void unregisterDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0) {}
    private static android.os.Looper getLooperForHandler(android.os.Handler p0) { return null; }
    private int findDisplayListenerLocked(android.hardware.display.DisplayManager.DisplayListener p0) { return 0; }
    private int calculateEventsMaskLocked() { return 0; }
    private void registerCallbackIfNeededLocked() {}
    private void updateCallbackIfNeededLocked() {}
    private void handleDisplayEvent(int p0, int p1) {}
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
    public void requestColorMode(int p0, int p1) {}
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.content.Context p0, android.media.projection.MediaProjection p1, android.hardware.display.VirtualDisplayConfig p2, android.hardware.display.VirtualDisplay.Callback p3, android.os.Handler p4) { return null; }
    public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback p0, android.view.Surface p1) {}
    public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, int p1, int p2, int p3) {}
    public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0) {}
    void setVirtualDisplayState(android.hardware.display.IVirtualDisplayCallback p0, boolean p1) {}
    public android.graphics.Point getStableDisplaySize() { return null; }
    public java.util.List<android.hardware.display.BrightnessChangeEvent> getBrightnessEvents(java.lang.String p0) { return null; }
    public android.hardware.display.BrightnessInfo getBrightnessInfo(int p0) { return null; }
    public android.graphics.ColorSpace getPreferredWideGamutColorSpace() { return null; }
    public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) {}
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) { return null; }
    public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() { return null; }
    public boolean isMinimalPostProcessingRequested(int p0) { return false; }
    public void setTemporaryBrightness(int p0, float p1) {}
    public void setBrightness(int p0, float p1) {}
    public float getBrightness(int p0) { return 0.0f; }
    public void setTemporaryAutoBrightnessAdjustment(float p0) {}
    public android.util.Pair<float[], float[]> getMinimumBrightnessCurve() { return null; }
    public java.util.List<android.hardware.display.AmbientBrightnessDayStats> getAmbientBrightnessStats() { return null; }
    public void setShouldAlwaysRespectAppRequestedMode(boolean p0) {}
    public boolean shouldAlwaysRespectAppRequestedMode() { return false; }
    public void setRefreshRateSwitchingType(int p0) {}
    public int getRefreshRateSwitchingType() { return 0; }
    public static void invalidateLocalDisplayInfoCaches() {}
    public void disableLocalDisplayInfoCaches() {}
    private static native void nSignalNativeCallbacks(float p0);
    private void registerNativeChoreographerForRefreshRateCallbacks() {}
    private void unregisterNativeChoreographerForRefreshRateCallbacks() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisplayEvent {
    }

    private static final class DisplayListenerDelegate extends android.os.Handler {
        public final android.hardware.display.DisplayManager.DisplayListener mListener = null;
        public long mEventsMask;
        private final android.view.DisplayInfo mDisplayInfo = null;
        DisplayListenerDelegate(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Looper p1, long p2) { super(); }
        public void sendDisplayEvent(int p0, int p1, android.view.DisplayInfo p2) {}
        public void clearEvents() {}
        public synchronized void setEventsMask(long p0) {}
        public synchronized void handleMessage(android.os.Message p0) {}
    }

    private final class DisplayManagerCallback extends android.hardware.display.IDisplayManagerCallback.Stub {
        private DisplayManagerCallback(android.hardware.display.DisplayManagerGlobal p0) { super(); }
        public void onDisplayEvent(int p0, int p1) {}
    }

    private static final class VirtualDisplayCallback extends android.hardware.display.IVirtualDisplayCallback.Stub {
        private android.hardware.display.DisplayManagerGlobal.VirtualDisplayCallbackDelegate mDelegate;
        public VirtualDisplayCallback(android.hardware.display.VirtualDisplay.Callback p0, android.os.Handler p1) { super(); }
        public void onPaused() {}
        public void onResumed() {}
        public void onStopped() {}
    }

    private static final class VirtualDisplayCallbackDelegate extends android.os.Handler {
        public static final int MSG_DISPLAY_PAUSED = 0;
        public static final int MSG_DISPLAY_RESUMED = 1;
        public static final int MSG_DISPLAY_STOPPED = 2;
        private final android.hardware.display.VirtualDisplay.Callback mCallback = null;
        public VirtualDisplayCallbackDelegate(android.hardware.display.VirtualDisplay.Callback p0, android.os.Handler p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
