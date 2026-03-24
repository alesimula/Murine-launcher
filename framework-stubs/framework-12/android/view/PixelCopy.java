package android.view;

public final class PixelCopy {
    public static final int SUCCESS = 0;
    public static final int ERROR_UNKNOWN = 1;
    public static final int ERROR_TIMEOUT = 2;
    public static final int ERROR_SOURCE_NO_DATA = 3;
    public static final int ERROR_SOURCE_INVALID = 4;
    public static final int ERROR_DESTINATION_INVALID = 5;
    public static void request(android.view.SurfaceView p0, android.graphics.Bitmap p1, android.view.PixelCopy.OnPixelCopyFinishedListener p2, android.os.Handler p3) {}
    public static void request(android.view.SurfaceView p0, android.graphics.Rect p1, android.graphics.Bitmap p2, android.view.PixelCopy.OnPixelCopyFinishedListener p3, android.os.Handler p4) {}
    public static void request(android.view.Surface p0, android.graphics.Bitmap p1, android.view.PixelCopy.OnPixelCopyFinishedListener p2, android.os.Handler p3) {}
    public static void request(android.view.Surface p0, android.graphics.Rect p1, android.graphics.Bitmap p2, android.view.PixelCopy.OnPixelCopyFinishedListener p3, android.os.Handler p4) {}
    public static void request(android.view.Window p0, android.graphics.Bitmap p1, android.view.PixelCopy.OnPixelCopyFinishedListener p2, android.os.Handler p3) {}
    public static void request(android.view.Window p0, android.graphics.Rect p1, android.graphics.Bitmap p2, android.view.PixelCopy.OnPixelCopyFinishedListener p3, android.os.Handler p4) {}
    private static void validateBitmapDest(android.graphics.Bitmap p0) {}
    private PixelCopy() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CopyResultStatus {
    }

    public static interface OnPixelCopyFinishedListener {
        public void onPixelCopyFinished(int p0);
    }
}
