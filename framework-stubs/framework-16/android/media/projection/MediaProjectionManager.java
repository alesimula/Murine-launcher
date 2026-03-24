package android.media.projection;

public final class MediaProjectionManager {
    public static final long OVERRIDE_DISABLE_MEDIA_PROJECTION_SINGLE_APP_OPTION = 316897322L;
    public static final java.lang.String EXTRA_MEDIA_PROJECTION_CONFIG = "android.media.projection.extra.EXTRA_MEDIA_PROJECTION_CONFIG";
    public static final java.lang.String EXTRA_APP_TOKEN = "android.media.projection.extra.EXTRA_APP_TOKEN";
    public static final java.lang.String EXTRA_MEDIA_PROJECTION = "android.media.projection.extra.EXTRA_MEDIA_PROJECTION";
    public static final java.lang.String EXTRA_LAUNCH_COOKIE = "android.media.projection.extra.EXTRA_LAUNCH_COOKIE";
    public static final int TYPE_SCREEN_CAPTURE = 0;
    public static final int TYPE_MIRRORING = 1;
    public static final int TYPE_PRESENTATION = 2;
    public MediaProjectionManager(android.content.Context p0) {}
    @android.annotation.NonNull
    public android.content.Intent createScreenCaptureIntent() { return null; }
    @android.annotation.NonNull
    public android.content.Intent createScreenCaptureIntent(android.media.projection.MediaProjectionConfig p0) { return null; }
    @android.annotation.SuppressLint("UnflaggedApi")
    @android.annotation.NonNull
    public android.content.Intent createScreenCaptureIntent(android.app.ActivityOptions.LaunchCookie p0) { return null; }
    @android.annotation.Nullable
    public android.media.projection.MediaProjection getMediaProjection(int p0, android.content.Intent p1) { return null; }
    public android.media.projection.MediaProjectionInfo getActiveProjectionInfo() { return null; }
    public void stopActiveProjection(int p0) {}
    public void addCallback(android.media.projection.MediaProjectionManager.Callback p0, android.os.Handler p1) {}
    public void removeCallback(android.media.projection.MediaProjectionManager.Callback p0) {}

    public static abstract class Callback {
        public Callback() {}
        public abstract void onStart(android.media.projection.MediaProjectionInfo p0);
        public abstract void onStop(android.media.projection.MediaProjectionInfo p0);
        public void onRecordingSessionSet(android.media.projection.MediaProjectionInfo p0, android.view.ContentRecordingSession p1) {}
        public void onMediaProjectionEvent(android.media.projection.MediaProjectionEvent p0, android.media.projection.MediaProjectionInfo p1, android.view.ContentRecordingSession p2) {}
    }

    private static final class CallbackDelegate extends android.media.projection.IMediaProjectionWatcherCallback.Stub {
        public CallbackDelegate(android.media.projection.MediaProjectionManager.Callback p0, android.os.Handler p1) { super(); }
        public void onStart(android.media.projection.MediaProjectionInfo p0) {}
        public void onStop(android.media.projection.MediaProjectionInfo p0) {}
        public void onRecordingSessionSet(android.media.projection.MediaProjectionInfo p0, android.view.ContentRecordingSession p1) {}
        public void onMediaProjectionEvent(android.media.projection.MediaProjectionEvent p0, android.media.projection.MediaProjectionInfo p1, android.view.ContentRecordingSession p2) {}
    }
}
