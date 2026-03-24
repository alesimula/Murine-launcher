package com.android.internal.display;

public class BrightnessSynchronizer {
    public static final float EPSILON = 0.0010000000474974513f;
    public BrightnessSynchronizer(android.content.Context p0) {}
    public BrightnessSynchronizer(android.content.Context p0, android.os.Looper p1, com.android.internal.display.BrightnessSynchronizer.Clock p2) {}
    public void startSynchronizing() {}
    public void dump(java.io.PrintWriter p0) {}
    public static float brightnessIntToFloat(int p0) { return 0.0f; }
    public static int brightnessFloatToInt(float p0) { return 0; }
    public static float brightnessFloatToIntRange(float p0) { return 0.0f; }
    public static boolean floatEquals(float p0, float p1) { return false; }

    private class BrightnessSyncObserver {
        boolean isObserving() { return false; }
        void startObserving() {}
    }

    class BrightnessSynchronizerHandler extends android.os.Handler {
        BrightnessSynchronizerHandler(com.android.internal.display.BrightnessSynchronizer p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public class BrightnessUpdate {
        static final int TYPE_INT = 1;
        static final int TYPE_FLOAT = 2;
        BrightnessUpdate(com.android.internal.display.BrightnessSynchronizer p0, int p1, float p2) {}
        public java.lang.String toString() { return null; }
        void update() {}
        boolean swallowUpdate(int p0, float p1) { return false; }
        boolean isRunning() { return false; }
        boolean isCompleted() { return false; }
        boolean madeUpdates() { return false; }
    }

    public static interface Clock {
        public long uptimeMillis();
    }
}
