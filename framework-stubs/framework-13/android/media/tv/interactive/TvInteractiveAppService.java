package android.media.tv.interactive;

public abstract class TvInteractiveAppService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.media.tv.interactive.TvInteractiveAppService";
    public static final java.lang.String SERVICE_META_DATA = "android.media.tv.interactive.app";
    public static final java.lang.String PLAYBACK_COMMAND_TYPE_TUNE = "tune";
    public static final java.lang.String PLAYBACK_COMMAND_TYPE_TUNE_NEXT = "tune_next";
    public static final java.lang.String PLAYBACK_COMMAND_TYPE_TUNE_PREV = "tune_previous";
    public static final java.lang.String PLAYBACK_COMMAND_TYPE_STOP = "stop";
    public static final java.lang.String PLAYBACK_COMMAND_TYPE_SET_STREAM_VOLUME = "set_stream_volume";
    public static final java.lang.String PLAYBACK_COMMAND_TYPE_SELECT_TRACK = "select_track";
    public static final java.lang.String COMMAND_PARAMETER_KEY_CHANNEL_URI = "command_channel_uri";
    public static final java.lang.String COMMAND_PARAMETER_KEY_INPUT_ID = "command_input_id";
    public static final java.lang.String COMMAND_PARAMETER_KEY_VOLUME = "command_volume";
    public static final java.lang.String COMMAND_PARAMETER_KEY_TRACK_TYPE = "command_track_type";
    public static final java.lang.String COMMAND_PARAMETER_KEY_TRACK_ID = "command_track_id";
    public static final java.lang.String COMMAND_PARAMETER_KEY_CHANGE_CHANNEL_QUIETLY = "command_change_channel_quietly";
    public TvInteractiveAppService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onRegisterAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) {}
    public void onUnregisterAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) {}
    public void onAppLinkCommand(android.os.Bundle p0) {}
    public abstract android.media.tv.interactive.TvInteractiveAppService.Session onCreateSession(java.lang.String p0, int p1);
    public final void notifyStateChanged(int p0, int p1, int p2) {}

    public static class ITvInteractiveAppSessionWrapper extends android.media.tv.interactive.ITvInteractiveAppSession.Stub {
        public ITvInteractiveAppSessionWrapper(android.content.Context p0, android.media.tv.interactive.TvInteractiveAppService.Session p1, android.view.InputChannel p2) { super(); }
        public void startInteractiveApp() {}
        public void stopInteractiveApp() {}
        public void resetInteractiveApp() {}
        public void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) {}
        public void setTeletextAppEnabled(boolean p0) {}
        public void destroyBiInteractiveApp(java.lang.String p0) {}
        public void sendCurrentChannelUri(android.net.Uri p0) {}
        public void sendCurrentChannelLcn(int p0) {}
        public void sendStreamVolume(float p0) {}
        public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public void sendCurrentTvInputId(java.lang.String p0) {}
        public void sendSigningResult(java.lang.String p0, byte[] p1) {}
        public void notifyError(java.lang.String p0, android.os.Bundle p1) {}
        public void release() {}
        public void notifyTuned(android.net.Uri p0) {}
        public void notifyTrackSelected(int p0, java.lang.String p1) {}
        public void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public void notifyVideoAvailable() {}
        public void notifyVideoUnavailable(int p0) {}
        public void notifyContentAllowed() {}
        public void notifyContentBlocked(java.lang.String p0) {}
        public void notifySignalStrength(int p0) {}
        public void setSurface(android.view.Surface p0) {}
        public void dispatchSurfaceChanged(int p0, int p1, int p2) {}
        public void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) {}
        public void notifyAdResponse(android.media.tv.AdResponse p0) {}
        public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) {}
        public void relayoutMediaView(android.graphics.Rect p0) {}
        public void removeMediaView() {}

        private final class TvInteractiveAppEventReceiver extends android.view.InputEventReceiver {
            TvInteractiveAppEventReceiver(android.media.tv.interactive.TvInteractiveAppService.ITvInteractiveAppSessionWrapper p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
            public void onInputEvent(android.view.InputEvent p0) {}
        }
    }

    private static final class MediaViewCleanUpTask extends android.os.AsyncTask<android.view.View, java.lang.Void, java.lang.Void> {
        protected java.lang.Void doInBackground(android.view.View... p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlaybackCommandType {
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
        public void onStartInteractiveApp() {}
        public void onStopInteractiveApp() {}
        public void onResetInteractiveApp() {}
        public void onCreateBiInteractiveAppRequest(android.net.Uri p0, android.os.Bundle p1) {}
        public void onDestroyBiInteractiveAppRequest(java.lang.String p0) {}
        public void onSetTeletextAppEnabled(boolean p0) {}
        public void onCurrentChannelUri(android.net.Uri p0) {}
        public void onCurrentChannelLcn(int p0) {}
        public void onStreamVolume(float p0) {}
        public void onTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public void onCurrentTvInputId(java.lang.String p0) {}
        public void onSigningResult(java.lang.String p0, byte[] p1) {}
        public void onError(java.lang.String p0, android.os.Bundle p1) {}
        public abstract boolean onSetSurface(android.view.Surface p0);
        public void onSurfaceChanged(int p0, int p1, int p2) {}
        public void onMediaViewSizeChanged(int p0, int p1) {}
        public android.view.View onCreateMediaView() { return null; }
        public abstract void onRelease();
        public void onTuned(android.net.Uri p0) {}
        public void onTrackSelected(int p0, java.lang.String p1) {}
        public void onTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public void onVideoAvailable() {}
        public void onVideoUnavailable(int p0) {}
        public void onContentAllowed() {}
        public void onContentBlocked(android.media.tv.TvContentRating p0) {}
        public void onSignalStrength(int p0) {}
        public void onBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) {}
        public void onAdResponse(android.media.tv.AdResponse p0) {}
        public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
        public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
        public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
        public void layoutSurface(int p0, int p1, int p2, int p3) {}
        public void requestBroadcastInfo(android.media.tv.BroadcastInfoRequest p0) {}
        public void removeBroadcastInfo(int p0) {}
        public void sendPlaybackCommandRequest(java.lang.String p0, android.os.Bundle p1) {}
        public void setVideoBounds(android.graphics.Rect p0) {}
        public void requestCurrentChannelUri() {}
        public void requestCurrentChannelLcn() {}
        public void requestStreamVolume() {}
        public void requestTrackInfoList() {}
        public void requestCurrentTvInputId() {}
        public void requestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) {}
        public void requestAd(android.media.tv.AdRequest p0) {}
        void startInteractiveApp() {}
        void stopInteractiveApp() {}
        void resetInteractiveApp() {}
        void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) {}
        void destroyBiInteractiveApp(java.lang.String p0) {}
        void setTeletextAppEnabled(boolean p0) {}
        void sendCurrentChannelUri(android.net.Uri p0) {}
        void sendCurrentChannelLcn(int p0) {}
        void sendStreamVolume(float p0) {}
        void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        void sendCurrentTvInputId(java.lang.String p0) {}
        void sendSigningResult(java.lang.String p0, byte[] p1) {}
        void notifyError(java.lang.String p0, android.os.Bundle p1) {}
        void release() {}
        void notifyTuned(android.net.Uri p0) {}
        void notifyTrackSelected(int p0, java.lang.String p1) {}
        void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        void notifyVideoAvailable() {}
        void notifyVideoUnavailable(int p0) {}
        void notifyContentAllowed() {}
        void notifyContentBlocked(android.media.tv.TvContentRating p0) {}
        void notifySignalStrength(int p0) {}
        void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) {}
        void notifyAdResponse(android.media.tv.AdResponse p0) {}
        public void notifySessionStateChanged(int p0, int p1) {}
        public final void notifyBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1) {}
        public final void notifyTeletextAppStateChanged(int p0) {}
        int dispatchInputEvent(android.view.InputEvent p0, android.view.InputEventReceiver p1) { return 0; }
        void setSurface(android.view.Surface p0) {}
        void dispatchSurfaceChanged(int p0, int p1, int p2) {}
        void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) {}
        void relayoutMediaView(android.graphics.Rect p0) {}
        void removeMediaView(boolean p0) {}
        void scheduleMediaViewCleanup() {}
    }
}
