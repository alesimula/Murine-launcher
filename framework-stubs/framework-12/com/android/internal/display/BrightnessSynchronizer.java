package com.android.internal.display;

public class BrightnessSynchronizer {
    private static final int MSG_UPDATE_FLOAT = 1;
    private static final int MSG_UPDATE_INT = 2;
    private static final int MSG_UPDATE_BOTH = 3;
    private static final java.lang.String TAG = "BrightnessSynchronizer";
    private static final android.net.Uri BRIGHTNESS_URI = null;
    public static final float EPSILON = 0.0010000000474974513f;
    private android.hardware.display.DisplayManager mDisplayManager;
    private final android.content.Context mContext = null;
    private final android.os.Handler mHandler = null;
    private float mPreferredSettingValue;
    public BrightnessSynchronizer(android.content.Context p0) {}
    public void startSynchronizing() {}
    public static float brightnessIntToFloat(int p0) { return 0.0f; }
    public static int brightnessFloatToInt(float p0) { return 0; }
    public static float brightnessFloatToIntRange(float p0) { return 0.0f; }
    private float getScreenBrightnessFloat() { return 0.0f; }
    private static int getScreenBrightnessInt(android.content.Context p0) { return 0; }
    private void updateBrightnessFloatFromInt(int p0) {}
    private void updateBrightnessIntFromFloat(float p0) {}
    private void updateBoth(float p0) {}
    public static boolean floatEquals(float p0, float p1) { return false; }

    private class BrightnessSyncObserver {
        private final android.hardware.display.DisplayManager.DisplayListener mListener = null;
        private final android.database.ContentObserver mContentObserver = null;
        private BrightnessSyncObserver(com.android.internal.display.BrightnessSynchronizer p0) {}
        public void startObserving() {}
        public void stopObserving() {}
    }
}
