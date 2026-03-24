package android.media.projection;

public final class MediaProjection {
    static final long MEDIA_PROJECTION_REQUIRES_CALLBACK = 269849258L;
    public MediaProjection(android.content.Context p0, android.media.projection.IMediaProjection p1) {}
    public MediaProjection(android.content.Context p0, android.media.projection.IMediaProjection p1, android.hardware.display.DisplayManager p2) {}
    public void registerCallback(android.media.projection.MediaProjection.Callback p0, android.os.Handler p1) {}
    public void unregisterCallback(android.media.projection.MediaProjection.Callback p0) {}
    @android.annotation.Nullable
    public android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, boolean p4, android.view.Surface p5, android.hardware.display.VirtualDisplay.Callback p6, android.os.Handler p7) { return null; }
    @android.annotation.Nullable
    public android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, int p4, android.view.Surface p5, android.hardware.display.VirtualDisplay.Callback p6, android.os.Handler p7) { return null; }
    @android.annotation.Nullable
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.hardware.display.VirtualDisplayConfig.Builder p0, android.hardware.display.VirtualDisplay.Callback p1, android.os.Handler p2) { return null; }
    public void stop() {}
    public void stop(int p0) {}
    public android.media.projection.IMediaProjection getProjection() { return null; }

    public static abstract class Callback {
        public Callback() {}
        public void onStop() {}
        public void onCapturedContentResize(int p0, int p1) {}
        public void onCapturedContentVisibilityChanged(boolean p0) {}
    }

    private static final class CallbackRecord extends android.media.projection.MediaProjection.Callback {
        public CallbackRecord(android.media.projection.MediaProjection.Callback p0, android.os.Handler p1) { super(); }
        public void onStop() {}
        public void onCapturedContentResize(int p0, int p1) {}
        public void onCapturedContentVisibilityChanged(boolean p0) {}
    }

    private final class MediaProjectionCallback extends android.media.projection.IMediaProjectionCallback.Stub {
        public void onStop() {}
        public void onCapturedContentResize(int p0, int p1) {}
        public void onCapturedContentVisibilityChanged(boolean p0) {}
    }
}
