package com.android.internal.util;

public class ScreenshotRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.android.internal.util.ScreenshotRequest> CREATOR = null;
    ScreenshotRequest(android.os.Parcel p0) {}
    @android.view.WindowManager.ScreenshotType
    public int getType() { return 0; }
    @android.view.WindowManager.ScreenshotSource
    public int getSource() { return 0; }
    public android.graphics.Bitmap getBitmap() { return null; }
    public android.graphics.Rect getBoundsInScreen() { return null; }
    public android.graphics.Insets getInsets() { return null; }
    public int getTaskId() { return 0; }
    public int getUserId() { return 0; }
    public android.content.ComponentName getTopComponent() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        public Builder(int p0, int p1) {}
        public com.android.internal.util.ScreenshotRequest build() { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setTopComponent(android.content.ComponentName p0) { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setTaskId(int p0) { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setUserId(int p0) { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setBitmap(android.graphics.Bitmap p0) { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setBoundsOnScreen(android.graphics.Rect p0) { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setInsets(android.graphics.Insets p0) { return null; }
    }

    private static final class HardwareBitmapBundler {
    }
}
