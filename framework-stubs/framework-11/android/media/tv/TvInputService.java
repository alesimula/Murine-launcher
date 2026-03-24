package android.media.tv;

public abstract class TvInputService extends android.app.Service {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "TvInputService";
    private static final int DETACH_OVERLAY_VIEW_TIMEOUT_MS = 5000;
    public static final java.lang.String SERVICE_INTERFACE = "android.media.tv.TvInputService";
    public static final java.lang.String SERVICE_META_DATA = "android.media.tv.input";
    public static final int PRIORITY_HINT_USE_CASE_TYPE_BACKGROUND = 100;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_SCAN = 200;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_PLAYBACK = 300;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_LIVE = 400;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_RECORD = 500;
    private final android.os.Handler mServiceHandler = null;
    private final android.os.RemoteCallbackList<android.media.tv.ITvInputServiceCallback> mCallbacks = null;
    private android.media.tv.TvInputManager mTvInputManager;
    public TvInputService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract android.media.tv.TvInputService.Session onCreateSession(java.lang.String p0);
    public android.media.tv.TvInputService.RecordingSession onCreateRecordingSession(java.lang.String p0) { return null; }
    public android.media.tv.TvInputService.Session onCreateSession(java.lang.String p0, java.lang.String p1) { return null; }
    public android.media.tv.TvInputService.RecordingSession onCreateRecordingSession(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi
    public android.media.tv.TvInputInfo onHardwareAdded(android.media.tv.TvInputHardwareInfo p0) { return null; }
    @android.annotation.SystemApi
    public java.lang.String onHardwareRemoved(android.media.tv.TvInputHardwareInfo p0) { return null; }
    @android.annotation.SystemApi
    public android.media.tv.TvInputInfo onHdmiDeviceAdded(android.hardware.hdmi.HdmiDeviceInfo p0) { return null; }
    @android.annotation.SystemApi
    public java.lang.String onHdmiDeviceRemoved(android.hardware.hdmi.HdmiDeviceInfo p0) { return null; }
    @android.annotation.SystemApi
    public void onHdmiDeviceUpdated(android.hardware.hdmi.HdmiDeviceInfo p0) {}
    private boolean isPassthroughInput(java.lang.String p0) { return false; }
    public static boolean isNavigationKey(int p0) { return false; }

    public static abstract class HardwareSession extends android.media.tv.TvInputService.Session {
        private android.media.tv.TvInputManager.Session mHardwareSession;
        private android.media.tv.ITvInputSession mProxySession;
        private android.media.tv.ITvInputSessionCallback mProxySessionCallback;
        private android.os.Handler mServiceHandler;
        private final android.media.tv.TvInputManager.SessionCallback mHardwareSessionCallback = null;
        public HardwareSession(android.content.Context p0) { super(null); }
        public abstract java.lang.String getHardwareInputId();
        public final boolean onSetSurface(android.view.Surface p0) { return false; }
        public void onHardwareVideoAvailable() {}
        public void onHardwareVideoUnavailable(int p0) {}
        void release() {}
    }

    private static final class OverlayViewCleanUpTask extends android.os.AsyncTask<android.view.View, java.lang.Void, java.lang.Void> {
        private OverlayViewCleanUpTask() { super(); }
        protected java.lang.Void doInBackground(android.view.View... p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PriorityHintUseCaseType {
    }

    public static abstract class RecordingSession {
        final android.os.Handler mHandler = null;
        private final java.lang.Object mLock = null;
        private android.media.tv.ITvInputSessionCallback mSessionCallback;
        private final java.util.List<java.lang.Runnable> mPendingActions = null;
        public RecordingSession(android.content.Context p0) {}
        public void notifyTuned(android.net.Uri p0) {}
        public void notifyRecordingStopped(android.net.Uri p0) {}
        public void notifyError(int p0) {}
        @android.annotation.SystemApi
        public void notifySessionEvent(java.lang.String p0, android.os.Bundle p1) {}
        public abstract void onTune(android.net.Uri p0);
        public void onTune(android.net.Uri p0, android.os.Bundle p1) {}
        public abstract void onStartRecording(android.net.Uri p0);
        public void onStartRecording(android.net.Uri p0, android.os.Bundle p1) {}
        public abstract void onStopRecording();
        public abstract void onRelease();
        public void onAppPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
        void tune(android.net.Uri p0, android.os.Bundle p1) {}
        void release() {}
        void startRecording(android.net.Uri p0, android.os.Bundle p1) {}
        void stopRecording() {}
        void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
        private void initialize(android.media.tv.ITvInputSessionCallback p0) {}
        private void executeOrPostRunnableOnMainThread(java.lang.Runnable p0) {}
    }

    @android.annotation.SuppressLint("HandlerLeak")
    private final class ServiceHandler extends android.os.Handler {
        private static final int DO_CREATE_SESSION = 1;
        private static final int DO_NOTIFY_SESSION_CREATED = 2;
        private static final int DO_CREATE_RECORDING_SESSION = 3;
        private static final int DO_ADD_HARDWARE_INPUT = 4;
        private static final int DO_REMOVE_HARDWARE_INPUT = 5;
        private static final int DO_ADD_HDMI_INPUT = 6;
        private static final int DO_REMOVE_HDMI_INPUT = 7;
        private static final int DO_UPDATE_HDMI_INPUT = 8;
        private ServiceHandler(android.media.tv.TvInputService p0) { super(); }
        private void broadcastAddHardwareInput(int p0, android.media.tv.TvInputInfo p1) {}
        private void broadcastAddHdmiInput(int p0, android.media.tv.TvInputInfo p1) {}
        private void broadcastRemoveHardwareInput(java.lang.String p0) {}
        public final void handleMessage(android.os.Message p0) {}
    }

    public static abstract class Session implements android.view.KeyEvent.Callback {
        private static final int POSITION_UPDATE_INTERVAL_MS = 1000;
        private final android.view.KeyEvent.DispatcherState mDispatcherState = null;
        private final android.view.WindowManager mWindowManager = null;
        final android.os.Handler mHandler = null;
        private android.view.WindowManager.LayoutParams mWindowParams;
        private android.view.Surface mSurface;
        private final android.content.Context mContext = null;
        private android.widget.FrameLayout mOverlayViewContainer;
        private android.view.View mOverlayView;
        private android.media.tv.TvInputService.OverlayViewCleanUpTask mOverlayViewCleanUpTask;
        private boolean mOverlayViewEnabled;
        private android.os.IBinder mWindowToken;
        private android.graphics.Rect mOverlayFrame;
        private long mStartPositionMs;
        private long mCurrentPositionMs;
        private final android.media.tv.TvInputService.Session.TimeShiftPositionTrackingRunnable mTimeShiftPositionTrackingRunnable = null;
        private final java.lang.Object mLock = null;
        private android.media.tv.ITvInputSessionCallback mSessionCallback;
        private final java.util.List<java.lang.Runnable> mPendingActions = null;
        public Session(android.content.Context p0) {}
        public void setOverlayViewEnabled(boolean p0) {}
        @android.annotation.SystemApi
        public void notifySessionEvent(java.lang.String p0, android.os.Bundle p1) {}
        public void notifyChannelRetuned(android.net.Uri p0) {}
        public void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public void notifyTrackSelected(int p0, java.lang.String p1) {}
        public void notifyVideoAvailable() {}
        public void notifyVideoUnavailable(int p0) {}
        public void notifyContentAllowed() {}
        public void notifyContentBlocked(android.media.tv.TvContentRating p0) {}
        public void notifyTimeShiftStatusChanged(int p0) {}
        private void notifyTimeShiftStartPositionChanged(long p0) {}
        private void notifyTimeShiftCurrentPositionChanged(long p0) {}
        public void layoutSurface(int p0, int p1, int p2, int p3) {}
        public abstract void onRelease();
        @android.annotation.SystemApi
        public void onSetMain(boolean p0) {}
        public abstract boolean onSetSurface(android.view.Surface p0);
        public void onSurfaceChanged(int p0, int p1, int p2) {}
        public void onOverlayViewSizeChanged(int p0, int p1) {}
        public abstract void onSetStreamVolume(float p0);
        public abstract boolean onTune(android.net.Uri p0);
        public boolean onTune(android.net.Uri p0, android.os.Bundle p1) { return false; }
        public abstract void onSetCaptionEnabled(boolean p0);
        public void onUnblockContent(android.media.tv.TvContentRating p0) {}
        public boolean onSelectTrack(int p0, java.lang.String p1) { return false; }
        public void onAppPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
        public android.view.View onCreateOverlayView() { return null; }
        public void onTimeShiftPlay(android.net.Uri p0) {}
        public void onTimeShiftPause() {}
        public void onTimeShiftResume() {}
        public void onTimeShiftSeekTo(long p0) {}
        public void onTimeShiftSetPlaybackParams(android.media.PlaybackParams p0) {}
        public long onTimeShiftGetStartPosition() { return 0L; }
        public long onTimeShiftGetCurrentPosition() { return 0L; }
        public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
        public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
        public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
        void release() {}
        void setMain(boolean p0) {}
        void setSurface(android.view.Surface p0) {}
        void dispatchSurfaceChanged(int p0, int p1, int p2) {}
        void setStreamVolume(float p0) {}
        void tune(android.net.Uri p0, android.os.Bundle p1) {}
        void setCaptionEnabled(boolean p0) {}
        void selectTrack(int p0, java.lang.String p1) {}
        void unblockContent(java.lang.String p0) {}
        void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
        void createOverlayView(android.os.IBinder p0, android.graphics.Rect p1) {}
        void relayoutOverlayView(android.graphics.Rect p0) {}
        void removeOverlayView(boolean p0) {}
        void timeShiftPlay(android.net.Uri p0) {}
        void timeShiftPause() {}
        void timeShiftResume() {}
        void timeShiftSeekTo(long p0) {}
        void timeShiftSetPlaybackParams(android.media.PlaybackParams p0) {}
        void timeShiftEnablePositionTracking(boolean p0) {}
        void scheduleOverlayViewCleanup() {}
        int dispatchInputEvent(android.view.InputEvent p0, android.view.InputEventReceiver p1) { return 0; }
        private void initialize(android.media.tv.ITvInputSessionCallback p0) {}
        private void executeOrPostRunnableOnMainThread(java.lang.Runnable p0) {}

        private final class TimeShiftPositionTrackingRunnable implements java.lang.Runnable {
            private TimeShiftPositionTrackingRunnable(android.media.tv.TvInputService.Session p0) {}
            public void run() {}
        }
    }
}
