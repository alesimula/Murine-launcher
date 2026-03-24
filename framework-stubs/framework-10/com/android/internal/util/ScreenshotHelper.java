package com.android.internal.util;

public class ScreenshotHelper {
    private static final java.lang.String TAG = "ScreenshotHelper";
    private static final java.lang.String SYSUI_PACKAGE = "com.android.systemui";
    private static final java.lang.String SYSUI_SCREENSHOT_SERVICE = "com.android.systemui.screenshot.TakeScreenshotService";
    private static final java.lang.String SYSUI_SCREENSHOT_ERROR_RECEIVER = "com.android.systemui.screenshot.ScreenshotServiceErrorReceiver";
    private final int SCREENSHOT_TIMEOUT_MS = 0;
    private final java.lang.Object mScreenshotLock = null;
    private android.content.ServiceConnection mScreenshotConnection;
    private final android.content.Context mContext = null;
    public ScreenshotHelper(android.content.Context p0) {}
    public void takeScreenshot(int p0, boolean p1, boolean p2, android.os.Handler p3) {}
    private void notifyScreenshotError() {}
}
