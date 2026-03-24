package android.media.tv.ad;

@android.annotation.FlaggedApi("android.media.tv.flags.enable_ad_service_fw")
public abstract class TvAdService extends android.app.Service {
    public static final java.lang.String SERVICE_META_DATA = "android.media.tv.ad.service";
    public static final java.lang.String SERVICE_INTERFACE = "android.media.tv.ad.TvAdService";
    public TvAdService() { super(); }
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onAppLinkCommand(android.os.Bundle p0) {}
    @android.annotation.Nullable
    public abstract android.media.tv.ad.TvAdService.Session onCreateSession(java.lang.String p0, java.lang.String p1);

    private static final class MediaViewCleanUpTask extends android.os.AsyncTask<android.view.View, java.lang.Void, java.lang.Void> {
        protected java.lang.Void doInBackground(android.view.View... p0) { return null; }
    }

    @android.annotation.SuppressLint("HandlerLeak")
    private final class ServiceHandler extends android.os.Handler {
        public void handleMessage(android.os.Message p0) {}
    }

    public static abstract class Session implements android.view.KeyEvent.Callback {
        final android.os.Handler mHandler = null;
        public Session(android.content.Context p0) {}
        public void setMediaViewEnabled(boolean p0) {}
        public boolean isMediaViewEnabled() { return false; }
        public abstract void onRelease();
        void release() {}
        public void onStartAdService() {}
        public void onStopAdService() {}
        public void onResetAdService() {}
        void startAdService() {}
        void stopAdService() {}
        void resetAdService() {}
        public void requestCurrentVideoBounds() {}
        public void requestCurrentChannelUri() {}
        public void requestTrackInfoList() {}
        public void requestCurrentTvInputId() {}
        public void requestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) {}
        public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
        public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
        public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
        public void layoutSurface(int p0, int p1, int p2, int p3) {}
        public abstract boolean onSetSurface(android.view.Surface p0);
        public void onSurfaceChanged(int p0, int p1, int p2) {}
        public void onCurrentVideoBounds(android.graphics.Rect p0) {}
        public void onCurrentChannelUri(android.net.Uri p0) {}
        public void onTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public void onCurrentTvInputId(java.lang.String p0) {}
        public void onSigningResult(java.lang.String p0, byte[] p1) {}
        public void onError(java.lang.String p0, android.os.Bundle p1) {}
        public void onTvMessage(int p0, android.os.Bundle p1) {}
        public void onTvInputSessionData(java.lang.String p0, android.os.Bundle p1) {}
        public void onMediaViewSizeChanged(int p0, int p1) {}
        @android.annotation.Nullable
        public android.view.View onCreateMediaView() { return null; }
        public void sendTvAdSessionData(java.lang.String p0, android.os.Bundle p1) {}
        public void notifySessionStateChanged(int p0, int p1) {}
        int dispatchInputEvent(android.view.InputEvent p0, android.view.InputEventReceiver p1) { return 0; }
        void setSurface(android.view.Surface p0) {}
        void dispatchSurfaceChanged(int p0, int p1, int p2) {}
        void sendCurrentVideoBounds(android.graphics.Rect p0) {}
        void sendCurrentChannelUri(android.net.Uri p0) {}
        void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        void sendCurrentTvInputId(java.lang.String p0) {}
        void sendSigningResult(java.lang.String p0, byte[] p1) {}
        void notifyError(java.lang.String p0, android.os.Bundle p1) {}
        void notifyTvMessage(int p0, android.os.Bundle p1) {}
        void notifyTvInputSessionData(java.lang.String p0, android.os.Bundle p1) {}
        void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) {}
        void relayoutMediaView(android.graphics.Rect p0) {}
        void removeMediaView(boolean p0) {}
        void scheduleMediaViewCleanup() {}
    }
}
