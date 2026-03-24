package android.media.projection;

public final class MediaProjection {
    private static final java.lang.String TAG = "MediaProjection";
    private final android.media.projection.IMediaProjection mImpl = null;
    private final android.content.Context mContext = null;
    private final java.util.Map<android.media.projection.MediaProjection.Callback, android.media.projection.MediaProjection.CallbackRecord> mCallbacks = null;
    public MediaProjection(android.content.Context p0, android.media.projection.IMediaProjection p1) {}
    public void registerCallback(android.media.projection.MediaProjection.Callback p0, android.os.Handler p1) {}
    public void unregisterCallback(android.media.projection.MediaProjection.Callback p0) {}
    public android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, boolean p4, android.view.Surface p5, android.hardware.display.VirtualDisplay.Callback p6, android.os.Handler p7) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, int p4, android.view.Surface p5, android.hardware.display.VirtualDisplay.Callback p6, android.os.Handler p7) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.VirtualDisplay.Callback p1, android.os.Handler p2) { return null; }
    public void stop() {}
    public android.media.projection.IMediaProjection getProjection() { return null; }

    public static abstract class Callback {
        public Callback() {}
        public void onStop() {}
    }

    private static final class CallbackRecord {
        private final android.media.projection.MediaProjection.Callback mCallback = null;
        private final android.os.Handler mHandler = null;
        public CallbackRecord(android.media.projection.MediaProjection.Callback p0, android.os.Handler p1) {}
        public void onStop() {}
    }

    private final class MediaProjectionCallback extends android.media.projection.IMediaProjectionCallback.Stub {
        private MediaProjectionCallback(android.media.projection.MediaProjection p0) { super(); }
        public void onStop() {}
    }
}
