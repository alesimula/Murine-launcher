package com.android.internal.jank;

public class DisplayResolutionTracker {
    public static final int RESOLUTION_UNKNOWN = 0;
    public static final int RESOLUTION_SD = 1;
    public static final int RESOLUTION_HD = 2;
    public static final int RESOLUTION_FHD = 3;
    public static final int RESOLUTION_QHD = 4;
    public DisplayResolutionTracker(android.os.Handler p0) {}
    public DisplayResolutionTracker(com.android.internal.jank.DisplayResolutionTracker.DisplayInterface p0) {}
    public int getResolution(int p0) { return 0; }
    public static int getResolution(android.view.DisplayInfo p0) { return 0; }

    public static interface DisplayInterface {
        public static com.android.internal.jank.DisplayResolutionTracker.DisplayInterface getDefault(android.os.Handler p0) { return null; }
        public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0);
        public android.view.DisplayInfo getDisplayInfo(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Resolution {
    }
}
