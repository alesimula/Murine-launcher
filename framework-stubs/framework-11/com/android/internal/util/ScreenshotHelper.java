package com.android.internal.util;

public class ScreenshotHelper {
    public static final int SCREENSHOT_MSG_URI = 1;
    public static final int SCREENSHOT_MSG_PROCESS_COMPLETE = 2;
    private static final java.lang.String TAG = "ScreenshotHelper";
    private final int SCREENSHOT_TIMEOUT_MS = 0;
    private final java.lang.Object mScreenshotLock = null;
    private android.os.IBinder mScreenshotService;
    private android.content.ServiceConnection mScreenshotConnection;
    private final android.content.Context mContext = null;
    public ScreenshotHelper(android.content.Context p0) {}
    public void takeScreenshot(int p0, boolean p1, boolean p2, int p3, android.os.Handler p4, java.util.function.Consumer<android.net.Uri> p5) {}
    public void takeScreenshot(int p0, boolean p1, boolean p2, android.os.Handler p3, java.util.function.Consumer<android.net.Uri> p4) {}
    public void takeScreenshot(int p0, boolean p1, boolean p2, long p3, android.os.Handler p4, java.util.function.Consumer<android.net.Uri> p5) {}
    public void provideScreenshot(android.os.Bundle p0, android.graphics.Rect p1, android.graphics.Insets p2, int p3, int p4, android.content.ComponentName p5, int p6, android.os.Handler p7, java.util.function.Consumer<android.net.Uri> p8) {}
    private void takeScreenshot(int p0, long p1, android.os.Handler p2, com.android.internal.util.ScreenshotHelper.ScreenshotRequest p3, java.util.function.Consumer<android.net.Uri> p4) {}
    private void notifyScreenshotError() {}

    public static class ScreenshotRequest implements android.os.Parcelable {
        private int mSource;
        private boolean mHasStatusBar;
        private boolean mHasNavBar;
        private android.os.Bundle mBitmapBundle;
        private android.graphics.Rect mBoundsInScreen;
        private android.graphics.Insets mInsets;
        private int mTaskId;
        private int mUserId;
        private android.content.ComponentName mTopComponent;
        public static final android.os.Parcelable.Creator<com.android.internal.util.ScreenshotHelper.ScreenshotRequest> CREATOR = null;
        ScreenshotRequest(int p0, boolean p1, boolean p2) {}
        ScreenshotRequest(int p0, android.os.Bundle p1, android.graphics.Rect p2, android.graphics.Insets p3, int p4, int p5, android.content.ComponentName p6) {}
        ScreenshotRequest(android.os.Parcel p0) {}
        public int getSource() { return 0; }
        public boolean getHasStatusBar() { return false; }
        public boolean getHasNavBar() { return false; }
        public android.os.Bundle getBitmapBundle() { return null; }
        public android.graphics.Rect getBoundsInScreen() { return null; }
        public android.graphics.Insets getInsets() { return null; }
        public int getTaskId() { return 0; }
        public int getUserId() { return 0; }
        public android.content.ComponentName getTopComponent() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
