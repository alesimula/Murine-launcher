package com.android.internal;

public class BrightnessSynchronizer {
    private static final int MSG_UPDATE_FLOAT = 1;
    private static final int MSG_UPDATE_INT = 2;
    private static final java.lang.String TAG = "BrightnessSynchronizer";
    private static final android.net.Uri BRIGHTNESS_URI = null;
    private static final android.net.Uri BRIGHTNESS_FLOAT_URI = null;
    public static final float EPSILON = 0.0010000000474974513f;
    private final android.content.Context mContext = null;
    private final java.util.Queue<java.lang.Object> mWriteHistory = null;
    private final android.os.Handler mHandler = null;
    private float mPreferredSettingValue;
    public BrightnessSynchronizer(android.content.Context p0) {}
    public static float brightnessIntToFloat(android.content.Context p0, int p1) { return 0.0f; }
    public static float brightnessIntToFloat(int p0, int p1, int p2, float p3, float p4) { return 0.0f; }
    public static int brightnessFloatToInt(android.content.Context p0, float p1) { return 0; }
    public static float brightnessFloatToIntRange(android.content.Context p0, float p1) { return 0.0f; }
    private static float brightnessFloatToIntRange(float p0, float p1, float p2, float p3, float p4) { return 0.0f; }
    private static float getScreenBrightnessFloat(android.content.Context p0) { return 0.0f; }
    private static int getScreenBrightnessInt(android.content.Context p0) { return 0; }
    private void updateBrightnessFloatFromInt(int p0) {}
    private void updateBrightnessIntFromFloat(float p0) {}
    public static boolean floatEquals(float p0, float p1) { return false; }

    private class BrightnessSyncObserver extends android.database.ContentObserver {
        BrightnessSyncObserver(com.android.internal.BrightnessSynchronizer p0, android.os.Handler p1) { super(null); }
        public void onChange(boolean p0) {}
        public void onChange(boolean p0, android.net.Uri p1) {}
        public void startObserving() {}
        public void stopObserving() {}
    }
}
