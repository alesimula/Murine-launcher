package android.hardware.display;

public abstract class DisplayManagerInternal {
    public DisplayManagerInternal() {}
    public abstract void initPowerManagement(android.hardware.display.DisplayManagerInternal.DisplayPowerCallbacks p0, android.os.Handler p1, android.hardware.SensorManager p2);
    public abstract boolean requestPowerState(android.hardware.display.DisplayManagerInternal.DisplayPowerRequest p0, boolean p1);
    public abstract boolean isProximitySensorAvailable();
    public abstract android.view.SurfaceControl.ScreenshotGraphicBuffer systemScreenshot(int p0);
    public abstract android.view.SurfaceControl.ScreenshotGraphicBuffer userScreenshot(int p0);
    public abstract android.view.DisplayInfo getDisplayInfo(int p0);
    public abstract android.graphics.Point getDisplayPosition(int p0);
    public abstract void registerDisplayTransactionListener(android.hardware.display.DisplayManagerInternal.DisplayTransactionListener p0);
    public abstract void unregisterDisplayTransactionListener(android.hardware.display.DisplayManagerInternal.DisplayTransactionListener p0);
    public abstract void setDisplayInfoOverrideFromWindowManager(int p0, android.view.DisplayInfo p1);
    public abstract void getNonOverrideDisplayInfo(int p0, android.view.DisplayInfo p1);
    public abstract void performTraversal(android.view.SurfaceControl.Transaction p0);
    public abstract void setDisplayProperties(int p0, boolean p1, float p2, int p3, boolean p4, boolean p5);
    public abstract void setDisplayOffsets(int p0, int p1, int p2);
    public abstract void setDisplayScalingDisabled(int p0, boolean p1);
    public abstract void setDisplayAccessUIDs(android.util.SparseArray<android.util.IntArray> p0);
    public abstract void persistBrightnessTrackerState();
    public abstract void onOverlayChanged();
    public abstract android.hardware.display.DisplayedContentSamplingAttributes getDisplayedContentSamplingAttributes(int p0);
    public abstract boolean setDisplayedContentSamplingEnabled(int p0, boolean p1, int p2, int p3);
    public abstract android.hardware.display.DisplayedContentSample getDisplayedContentSample(int p0, long p1, long p2);
    public abstract void ignoreProximitySensorUntilChanged();

    public static interface DisplayPowerCallbacks {
        public void onStateChanged();
        public void onProximityPositive();
        public void onProximityNegative();
        public void onDisplayStateChange(int p0);
        public void acquireSuspendBlocker();
        public void releaseSuspendBlocker();
    }

    public static final class DisplayPowerRequest {
        public static final int POLICY_OFF = 0;
        public static final int POLICY_DOZE = 1;
        public static final int POLICY_DIM = 2;
        public static final int POLICY_BRIGHT = 3;
        public static final int POLICY_VR = 4;
        public int policy;
        public boolean useProximitySensor;
        public float screenBrightnessOverride;
        public float screenAutoBrightnessAdjustmentOverride;
        public boolean useAutoBrightness;
        public boolean lowPowerMode;
        public float screenLowPowerBrightnessFactor;
        public boolean boostScreenBrightness;
        public boolean blockScreenOn;
        public int dozeScreenState;
        public float dozeScreenBrightness;
        public DisplayPowerRequest() {}
        public DisplayPowerRequest(android.hardware.display.DisplayManagerInternal.DisplayPowerRequest p0) {}
        public boolean isBrightOrDim() { return false; }
        public boolean isVr() { return false; }
        public void copyFrom(android.hardware.display.DisplayManagerInternal.DisplayPowerRequest p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public boolean equals(android.hardware.display.DisplayManagerInternal.DisplayPowerRequest p0) { return false; }
        private boolean floatEquals(float p0, float p1) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public static java.lang.String policyToString(int p0) { return null; }
    }

    public static interface DisplayTransactionListener {
        public void onDisplayTransaction(android.view.SurfaceControl.Transaction p0);
    }
}
