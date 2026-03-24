package android.hardware.display;

public abstract class DisplayManagerInternal {
    public static final int REFRESH_RATE_LIMIT_HIGH_BRIGHTNESS_MODE = 1;
    public DisplayManagerInternal() {}
    public abstract void initPowerManagement(android.hardware.display.DisplayManagerInternal.DisplayPowerCallbacks p0, android.os.Handler p1, android.hardware.SensorManager p2);
    public abstract int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.companion.virtual.IVirtualDevice p2, android.window.DisplayWindowPolicyController p3, java.lang.String p4);
    public abstract boolean requestPowerState(int p0, android.hardware.display.DisplayManagerInternal.DisplayPowerRequest p1, boolean p2);
    public abstract boolean isProximitySensorAvailable();
    public abstract void registerDisplayGroupListener(android.hardware.display.DisplayManagerInternal.DisplayGroupListener p0);
    public abstract void unregisterDisplayGroupListener(android.hardware.display.DisplayManagerInternal.DisplayGroupListener p0);
    public abstract android.window.ScreenCapture.ScreenshotHardwareBuffer systemScreenshot(int p0);
    public abstract android.window.ScreenCapture.ScreenshotHardwareBuffer userScreenshot(int p0);
    public abstract android.view.DisplayInfo getDisplayInfo(int p0);
    public abstract java.util.Set<android.view.DisplayInfo> getPossibleDisplayInfo(int p0);
    public abstract android.graphics.Point getDisplayPosition(int p0);
    public abstract void registerDisplayTransactionListener(android.hardware.display.DisplayManagerInternal.DisplayTransactionListener p0);
    public abstract void unregisterDisplayTransactionListener(android.hardware.display.DisplayManagerInternal.DisplayTransactionListener p0);
    public abstract void setDisplayInfoOverrideFromWindowManager(int p0, android.view.DisplayInfo p1);
    public abstract void getNonOverrideDisplayInfo(int p0, android.view.DisplayInfo p1);
    public abstract void performTraversal(android.view.SurfaceControl.Transaction p0);
    public abstract void setDisplayProperties(int p0, boolean p1, float p2, int p3, float p4, float p5, boolean p6, boolean p7, boolean p8);
    public abstract void setDisplayOffsets(int p0, int p1, int p2);
    public abstract void setDisplayScalingDisabled(int p0, boolean p1);
    public abstract void setDisplayAccessUIDs(android.util.SparseArray<android.util.IntArray> p0);
    public abstract void persistBrightnessTrackerState();
    public abstract void onOverlayChanged();
    public abstract android.hardware.display.DisplayedContentSamplingAttributes getDisplayedContentSamplingAttributes(int p0);
    public abstract boolean setDisplayedContentSamplingEnabled(int p0, boolean p1, int p2, int p3);
    public abstract android.hardware.display.DisplayedContentSample getDisplayedContentSample(int p0, long p1, long p2);
    public abstract void ignoreProximitySensorUntilChanged();
    public abstract int getRefreshRateSwitchingType();
    public abstract android.view.SurfaceControl.RefreshRateRange getRefreshRateForDisplayAndSensor(int p0, java.lang.String p1, java.lang.String p2);
    public abstract java.util.List<android.hardware.display.DisplayManagerInternal.RefreshRateLimitation> getRefreshRateLimitations(int p0);
    public abstract void setWindowManagerMirroring(int p0, boolean p1);
    public abstract android.graphics.Point getDisplaySurfaceDefaultSize(int p0);
    public abstract int getDisplayIdToMirror(int p0);
    public abstract void onEarlyInteractivityChange(boolean p0);
    public abstract android.window.DisplayWindowPolicyController getDisplayWindowPolicyController(int p0);
    public abstract android.view.SurfaceControl.DisplayPrimaries getDisplayNativePrimaries(int p0);
    public abstract android.hardware.input.HostUsiVersion getHostUsiVersion(int p0);
    public abstract android.util.IntArray getDisplayGroupIds();

    public static interface DisplayGroupListener {
        public void onDisplayGroupAdded(int p0);
        public void onDisplayGroupRemoved(int p0);
        public void onDisplayGroupChanged(int p0);
    }

    public static interface DisplayPowerCallbacks {
        public void onStateChanged();
        public void onProximityPositive();
        public void onProximityNegative();
        public void onDisplayStateChange(boolean p0, boolean p1);
        public void acquireSuspendBlocker(java.lang.String p0);
        public void releaseSuspendBlocker(java.lang.String p0);
    }

    public static class DisplayPowerRequest {
        public static final int POLICY_OFF = 0;
        public static final int POLICY_DOZE = 1;
        public static final int POLICY_DIM = 2;
        public static final int POLICY_BRIGHT = 3;
        public int policy;
        public boolean useProximitySensor;
        public float screenBrightnessOverride;
        public float screenAutoBrightnessAdjustmentOverride;
        public boolean lowPowerMode;
        public float screenLowPowerBrightnessFactor;
        public boolean boostScreenBrightness;
        public boolean blockScreenOn;
        public int dozeScreenState;
        public float dozeScreenBrightness;
        public DisplayPowerRequest() {}
        public DisplayPowerRequest(android.hardware.display.DisplayManagerInternal.DisplayPowerRequest p0) {}
        public boolean isBrightOrDim() { return false; }
        public void copyFrom(android.hardware.display.DisplayManagerInternal.DisplayPowerRequest p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public boolean equals(android.hardware.display.DisplayManagerInternal.DisplayPowerRequest p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public static java.lang.String policyToString(int p0) { return null; }
    }

    public static interface DisplayTransactionListener {
        public void onDisplayTransaction(android.view.SurfaceControl.Transaction p0);
    }

    public static final class RefreshRateLimitation {
        public int type;
        public android.view.SurfaceControl.RefreshRateRange range;
        public RefreshRateLimitation(int p0, float p1, float p2) {}
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RefreshRateLimitType {
    }
}
