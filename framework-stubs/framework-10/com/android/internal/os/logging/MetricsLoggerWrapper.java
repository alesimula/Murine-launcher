package com.android.internal.os.logging;

public class MetricsLoggerWrapper {
    private static final int METRIC_VALUE_DISMISSED_BY_TAP = 0;
    private static final int METRIC_VALUE_DISMISSED_BY_DRAG = 1;
    public MetricsLoggerWrapper() {}
    public static void logPictureInPictureDismissByTap(android.content.Context p0, android.util.Pair<android.content.ComponentName, java.lang.Integer> p1) {}
    public static void logPictureInPictureDismissByDrag(android.content.Context p0, android.util.Pair<android.content.ComponentName, java.lang.Integer> p1) {}
    public static void logPictureInPictureMinimize(android.content.Context p0, boolean p1, android.util.Pair<android.content.ComponentName, java.lang.Integer> p2) {}
    private static int getUid(android.content.Context p0, android.content.ComponentName p1, int p2) { return 0; }
    public static void logPictureInPictureMenuVisible(android.content.Context p0, boolean p1) {}
    public static void logPictureInPictureEnter(android.content.Context p0, int p1, java.lang.String p2, boolean p3) {}
    public static void logPictureInPictureFullScreen(android.content.Context p0, int p1, java.lang.String p2) {}
    public static void logAppOverlayEnter(int p0, java.lang.String p1, boolean p2, int p3, boolean p4) {}
    public static void logAppOverlayExit(int p0, java.lang.String p1, boolean p2, int p3, boolean p4) {}
}
