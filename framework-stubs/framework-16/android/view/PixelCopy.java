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
    public static void request(android.view.PixelCopy.Request p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.view.PixelCopy.Result> p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CopyResultStatus {
    }

    public static interface OnPixelCopyFinishedListener {
        public void onPixelCopyFinished(int p0);
    }

    public static final class Request {
        @android.annotation.Nullable
        public android.graphics.Bitmap getDestinationBitmap() { return null; }
        @android.annotation.Nullable
        public android.graphics.Rect getSourceRect() { return null; }
        public void request(java.util.concurrent.Executor p0, java.util.function.Consumer<android.view.PixelCopy.Result> p1) {}

        public static final class Builder {
            @android.annotation.SuppressLint("BuilderSetStyle")
            @android.annotation.NonNull
            public static android.view.PixelCopy.Request.Builder ofWindow(android.view.Window p0) { return null; }
            @android.annotation.SuppressLint("BuilderSetStyle")
            @android.annotation.NonNull
            public static android.view.PixelCopy.Request.Builder ofWindow(android.view.View p0) { return null; }
            @android.annotation.SuppressLint("BuilderSetStyle")
            @android.annotation.NonNull
            public static android.view.PixelCopy.Request.Builder ofSurface(android.view.Surface p0) { return null; }
            @android.annotation.SuppressLint("BuilderSetStyle")
            @android.annotation.NonNull
            public static android.view.PixelCopy.Request.Builder ofSurface(android.view.SurfaceView p0) { return null; }
            @android.annotation.NonNull
            public android.view.PixelCopy.Request.Builder setSourceRect(android.graphics.Rect p0) { return null; }
            @android.annotation.NonNull
            public android.view.PixelCopy.Request.Builder setDestinationBitmap(android.graphics.Bitmap p0) { return null; }
            @android.annotation.NonNull
            public android.view.PixelCopy.Request build() { return null; }
        }
    }

    public static final class Result {
        public int getStatus() { return 0; }
        @android.annotation.NonNull
        public android.graphics.Bitmap getBitmap() { return null; }
    }
}
