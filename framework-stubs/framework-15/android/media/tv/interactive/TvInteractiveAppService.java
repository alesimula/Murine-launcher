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
    public static final java.lang.String PLAYBACK_COMMAND_TYPE_FREEZE = "freeze";
    public static final int COMMAND_PARAMETER_VALUE_STOP_MODE_BLANK = 1;
    public static final int COMMAND_PARAMETER_VALUE_STOP_MODE_FREEZE = 2;
    public static final java.lang.String COMMAND_PARAMETER_KEY_STOP_MODE = "command_stop_mode";
    public static final java.lang.String COMMAND_PARAMETER_KEY_CHANNEL_URI = "command_channel_uri";
    public static final java.lang.String COMMAND_PARAMETER_KEY_INPUT_ID = "command_input_id";
    public static final java.lang.String COMMAND_PARAMETER_KEY_VOLUME = "command_volume";
    public static final java.lang.String COMMAND_PARAMETER_KEY_TRACK_TYPE = "command_track_type";
    public static final java.lang.String COMMAND_PARAMETER_KEY_TRACK_ID = "command_track_id";
    public static final java.lang.String COMMAND_PARAMETER_KEY_CHANGE_CHANNEL_QUIETLY = "command_change_channel_quietly";
    public static final java.lang.String TIME_SHIFT_COMMAND_TYPE_PLAY = "play";
    public static final java.lang.String TIME_SHIFT_COMMAND_TYPE_PAUSE = "pause";
    public static final java.lang.String TIME_SHIFT_COMMAND_TYPE_RESUME = "resume";
    public static final java.lang.String TIME_SHIFT_COMMAND_TYPE_SEEK_TO = "seek_to";
    public static final java.lang.String TIME_SHIFT_COMMAND_TYPE_SET_PLAYBACK_PARAMS = "set_playback_params";
    public static final java.lang.String TIME_SHIFT_COMMAND_TYPE_SET_MODE = "set_mode";
    public static final java.lang.String COMMAND_PARAMETER_KEY_PROGRAM_URI = "command_program_uri";
    public static final java.lang.String COMMAND_PARAMETER_KEY_TIME_POSITION = "command_time_position";
    public static final java.lang.String COMMAND_PARAMETER_KEY_PLAYBACK_PARAMS = "command_playback_params";
    public static final java.lang.String COMMAND_PARAMETER_KEY_TIME_SHIFT_MODE = "command_time_shift_mode";
    public TvInteractiveAppService() { super(); }
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onRegisterAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) {}
    public void onUnregisterAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) {}
    public void onAppLinkCommand(android.os.Bundle p0) {}
    @android.annotation.Nullable
    public abstract android.media.tv.interactive.TvInteractiveAppService.Session onCreateSession(java.lang.String p0, int p1);
    public final void notifyStateChanged(int p0, int p1, int p2) {}

    private static final class MediaViewCleanUpTask extends android.os.AsyncTask<android.view.View, java.lang.Void, java.lang.Void> {
        protected java.lang.Void doInBackground(android.view.View... p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlaybackCommandStopMode {
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
        public void onCurrentVideoBounds(android.graphics.Rect p0) {}
        public void onCurrentChannelUri(android.net.Uri p0) {}
        public void onCurrentChannelLcn(int p0) {}
        public void onStreamVolume(float p0) {}
        public void onTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public void onCurrentTvInputId(java.lang.String p0) {}
        public void onTimeShiftMode(int p0) {}
        public void onAvailableSpeeds(float[] p0) {}
        public void onTvRecordingInfo(android.media.tv.TvRecordingInfo p0) {}
        public void onTvRecordingInfoList(java.util.List<android.media.tv.TvRecordingInfo> p0) {}
        public void onRecordingStarted(java.lang.String p0, java.lang.String p1) {}
        public void onRecordingStopped(java.lang.String p0) {}
        public void onRecordingConnectionFailed(java.lang.String p0, java.lang.String p1) {}
        public void onRecordingDisconnected(java.lang.String p0, java.lang.String p1) {}
        public void onRecordingTuned(java.lang.String p0, android.net.Uri p1) {}
        public void onRecordingError(java.lang.String p0, int p1) {}
        public void onRecordingScheduled(java.lang.String p0, java.lang.String p1) {}
        public void onSigningResult(java.lang.String p0, byte[] p1) {}
        @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
        public void onCertificate(java.lang.String p0, int p1, android.net.http.SslCertificate p2) {}
        public void onError(java.lang.String p0, android.os.Bundle p1) {}
        public void onTimeShiftPlaybackParams(android.media.PlaybackParams p0) {}
        public void onTimeShiftStatusChanged(java.lang.String p0, int p1) {}
        public void onTimeShiftStartPositionChanged(java.lang.String p0, long p1) {}
        public void onTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) {}
        public abstract boolean onSetSurface(android.view.Surface p0);
        public void onSurfaceChanged(int p0, int p1, int p2) {}
        public void onMediaViewSizeChanged(int p0, int p1) {}
        @android.annotation.Nullable
        public android.view.View onCreateMediaView() { return null; }
        public abstract void onRelease();
        public void onTuned(android.net.Uri p0) {}
        public void onTrackSelected(int p0, java.lang.String p1) {}
        public void onTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public void onVideoAvailable() {}
        public void onVideoUnavailable(int p0) {}
        @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
        public void onVideoFreezeUpdated(boolean p0) {}
        public void onContentAllowed() {}
        public void onContentBlocked(android.media.tv.TvContentRating p0) {}
        public void onSignalStrength(int p0) {}
        public void onBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) {}
        public void onAdResponse(android.media.tv.AdResponse p0) {}
        public void onAdBufferConsumed(android.media.tv.AdBuffer p0) {}
        public void onTvMessage(int p0, android.os.Bundle p1) {}
        @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
        public void onSelectedTrackInfo(java.util.List<android.media.tv.TvTrackInfo> p0) {}
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
        public void sendTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1) {}
        public void setVideoBounds(android.graphics.Rect p0) {}
        public void requestCurrentVideoBounds() {}
        public void requestCurrentChannelUri() {}
        public void requestCurrentChannelLcn() {}
        public void requestStreamVolume() {}
        public void requestTrackInfoList() {}
        public void requestCurrentTvInputId() {}
        public void requestTimeShiftMode() {}
        public void requestAvailableSpeeds() {}
        @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
        public void requestSelectedTrackInfo() {}
        public void requestStartRecording(java.lang.String p0, android.net.Uri p1) {}
        public void requestStopRecording(java.lang.String p0) {}
        public void requestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4) {}
        public void requestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6) {}
        public void setTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1) {}
        public void requestTvRecordingInfo(java.lang.String p0) {}
        public void requestTvRecordingInfoList(int p0) {}
        public void requestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) {}
        @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
        public void requestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, byte[] p4) {}
        @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
        public void requestCertificate(java.lang.String p0, int p1) {}
        public void requestAd(android.media.tv.AdRequest p0) {}
        void startInteractiveApp() {}
        void stopInteractiveApp() {}
        void resetInteractiveApp() {}
        void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) {}
        void destroyBiInteractiveApp(java.lang.String p0) {}
        void setTeletextAppEnabled(boolean p0) {}
        void sendCurrentVideoBounds(android.graphics.Rect p0) {}
        void sendCurrentChannelUri(android.net.Uri p0) {}
        void sendCurrentChannelLcn(int p0) {}
        void sendStreamVolume(float p0) {}
        void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        void sendCurrentTvInputId(java.lang.String p0) {}
        void sendTimeShiftMode(int p0) {}
        void sendAvailableSpeeds(float[] p0) {}
        void sendTvRecordingInfo(android.media.tv.TvRecordingInfo p0) {}
        void sendTvRecordingInfoList(java.util.List<android.media.tv.TvRecordingInfo> p0) {}
        void sendSigningResult(java.lang.String p0, byte[] p1) {}
        void sendCertificate(java.lang.String p0, int p1, android.os.Bundle p2) {}
        void notifyError(java.lang.String p0, android.os.Bundle p1) {}
        void release() {}
        void notifyTuned(android.net.Uri p0) {}
        void notifyTrackSelected(int p0, java.lang.String p1) {}
        void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        void notifyVideoAvailable() {}
        void notifyVideoUnavailable(int p0) {}
        void notifyVideoFreezeUpdated(boolean p0) {}
        void notifyContentAllowed() {}
        void notifyContentBlocked(android.media.tv.TvContentRating p0) {}
        void notifySignalStrength(int p0) {}
        void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) {}
        void notifyAdResponse(android.media.tv.AdResponse p0) {}
        void notifyTvMessage(int p0, android.os.Bundle p1) {}
        void sendSelectedTrackInfo(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        void notifyAdBufferConsumed(android.media.tv.AdBuffer p0) {}
        void notifyRecordingStarted(java.lang.String p0, java.lang.String p1) {}
        void notifyRecordingStopped(java.lang.String p0) {}
        void notifyRecordingConnectionFailed(java.lang.String p0, java.lang.String p1) {}
        void notifyRecordingDisconnected(java.lang.String p0, java.lang.String p1) {}
        void notifyRecordingTuned(java.lang.String p0, android.net.Uri p1) {}
        void notifyRecordingError(java.lang.String p0, int p1) {}
        void notifyRecordingScheduled(java.lang.String p0, java.lang.String p1) {}
        void notifyTimeShiftPlaybackParams(android.media.PlaybackParams p0) {}
        void notifyTimeShiftStatusChanged(java.lang.String p0, int p1) {}
        void notifyTimeShiftStartPositionChanged(java.lang.String p0, long p1) {}
        void notifyTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) {}
        public void notifySessionStateChanged(int p0, int p1) {}
        public final void notifyBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1) {}
        public final void notifyTeletextAppStateChanged(int p0) {}
        public void notifyAdBufferReady(android.media.tv.AdBuffer p0) {}
        int dispatchInputEvent(android.view.InputEvent p0, android.view.InputEventReceiver p1) { return 0; }
        void setSurface(android.view.Surface p0) {}
        void dispatchSurfaceChanged(int p0, int p1, int p2) {}
        void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) {}
        void relayoutMediaView(android.graphics.Rect p0) {}
        void removeMediaView(boolean p0) {}
        void scheduleMediaViewCleanup() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TimeShiftCommandType {
    }
}
