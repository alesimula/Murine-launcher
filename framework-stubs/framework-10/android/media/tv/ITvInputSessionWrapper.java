package android.media.tv;

public class ITvInputSessionWrapper extends android.media.tv.ITvInputSession.Stub implements com.android.internal.os.HandlerCaller.Callback {
    private static final java.lang.String TAG = "TvInputSessionWrapper";
    private static final int EXECUTE_MESSAGE_TIMEOUT_SHORT_MILLIS = 50;
    private static final int EXECUTE_MESSAGE_TUNE_TIMEOUT_MILLIS = 2000;
    private static final int EXECUTE_MESSAGE_TIMEOUT_LONG_MILLIS = 5000;
    private static final int DO_RELEASE = 1;
    private static final int DO_SET_MAIN = 2;
    private static final int DO_SET_SURFACE = 3;
    private static final int DO_DISPATCH_SURFACE_CHANGED = 4;
    private static final int DO_SET_STREAM_VOLUME = 5;
    private static final int DO_TUNE = 6;
    private static final int DO_SET_CAPTION_ENABLED = 7;
    private static final int DO_SELECT_TRACK = 8;
    private static final int DO_APP_PRIVATE_COMMAND = 9;
    private static final int DO_CREATE_OVERLAY_VIEW = 10;
    private static final int DO_RELAYOUT_OVERLAY_VIEW = 11;
    private static final int DO_REMOVE_OVERLAY_VIEW = 12;
    private static final int DO_UNBLOCK_CONTENT = 13;
    private static final int DO_TIME_SHIFT_PLAY = 14;
    private static final int DO_TIME_SHIFT_PAUSE = 15;
    private static final int DO_TIME_SHIFT_RESUME = 16;
    private static final int DO_TIME_SHIFT_SEEK_TO = 17;
    private static final int DO_TIME_SHIFT_SET_PLAYBACK_PARAMS = 18;
    private static final int DO_TIME_SHIFT_ENABLE_POSITION_TRACKING = 19;
    private static final int DO_START_RECORDING = 20;
    private static final int DO_STOP_RECORDING = 21;
    private final boolean mIsRecordingSession = false;
    private final com.android.internal.os.HandlerCaller mCaller = null;
    private android.media.tv.TvInputService.Session mTvInputSessionImpl;
    private android.media.tv.TvInputService.RecordingSession mTvInputRecordingSessionImpl;
    private android.view.InputChannel mChannel;
    private android.media.tv.ITvInputSessionWrapper.TvInputEventReceiver mReceiver;
    public ITvInputSessionWrapper(android.content.Context p0, android.media.tv.TvInputService.Session p1, android.view.InputChannel p2) { super(); }
    public ITvInputSessionWrapper(android.content.Context p0, android.media.tv.TvInputService.RecordingSession p1) { super(); }
    public void executeMessage(android.os.Message p0) {}
    public void release() {}
    public void setMain(boolean p0) {}
    public void setSurface(android.view.Surface p0) {}
    public void dispatchSurfaceChanged(int p0, int p1, int p2) {}
    public final void setVolume(float p0) {}
    public void tune(android.net.Uri p0, android.os.Bundle p1) {}
    public void setCaptionEnabled(boolean p0) {}
    public void selectTrack(int p0, java.lang.String p1) {}
    public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    public void createOverlayView(android.os.IBinder p0, android.graphics.Rect p1) {}
    public void relayoutOverlayView(android.graphics.Rect p0) {}
    public void removeOverlayView() {}
    public void unblockContent(java.lang.String p0) {}
    public void timeShiftPlay(android.net.Uri p0) {}
    public void timeShiftPause() {}
    public void timeShiftResume() {}
    public void timeShiftSeekTo(long p0) {}
    public void timeShiftSetPlaybackParams(android.media.PlaybackParams p0) {}
    public void timeShiftEnablePositionTracking(boolean p0) {}
    public void startRecording(android.net.Uri p0) {}
    public void stopRecording() {}

    private final class TvInputEventReceiver extends android.view.InputEventReceiver {
        public TvInputEventReceiver(android.media.tv.ITvInputSessionWrapper p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}
    }
}
