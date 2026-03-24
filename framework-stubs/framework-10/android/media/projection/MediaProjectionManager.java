package android.media.projection;

public final class MediaProjectionManager {
    private static final java.lang.String TAG = "MediaProjectionManager";
    public static final java.lang.String EXTRA_APP_TOKEN = "android.media.projection.extra.EXTRA_APP_TOKEN";
    public static final java.lang.String EXTRA_MEDIA_PROJECTION = "android.media.projection.extra.EXTRA_MEDIA_PROJECTION";
    public static final int TYPE_SCREEN_CAPTURE = 0;
    public static final int TYPE_MIRRORING = 1;
    public static final int TYPE_PRESENTATION = 2;
    private android.content.Context mContext;
    private java.util.Map<android.media.projection.MediaProjectionManager.Callback, android.media.projection.MediaProjectionManager.CallbackDelegate> mCallbacks;
    private android.media.projection.IMediaProjectionManager mService;
    public MediaProjectionManager(android.content.Context p0) {}
    public android.content.Intent createScreenCaptureIntent() { return null; }
    public android.media.projection.MediaProjection getMediaProjection(int p0, android.content.Intent p1) { return null; }
    public android.media.projection.MediaProjectionInfo getActiveProjectionInfo() { return null; }
    public void stopActiveProjection() {}
    public void addCallback(android.media.projection.MediaProjectionManager.Callback p0, android.os.Handler p1) {}
    public void removeCallback(android.media.projection.MediaProjectionManager.Callback p0) {}

    private static final class CallbackDelegate extends android.media.projection.IMediaProjectionWatcherCallback.Stub {
        private android.media.projection.MediaProjectionManager.Callback mCallback;
        private android.os.Handler mHandler;
        public CallbackDelegate(android.media.projection.MediaProjectionManager.Callback p0, android.os.Handler p1) { super(); }
        public void onStart(android.media.projection.MediaProjectionInfo p0) {}
        public void onStop(android.media.projection.MediaProjectionInfo p0) {}
    }

    public static abstract class Callback {
        public Callback() {}
        public abstract void onStart(android.media.projection.MediaProjectionInfo p0);
        public abstract void onStop(android.media.projection.MediaProjectionInfo p0);
    }
}
