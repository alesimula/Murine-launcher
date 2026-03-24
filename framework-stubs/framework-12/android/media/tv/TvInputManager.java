package android.media.tv;

public final class TvInputManager {
    private static final java.lang.String TAG = "TvInputManager";
    static final int DVB_DEVICE_START = 0;
    static final int DVB_DEVICE_END = 2;
    public static final int DVB_DEVICE_DEMUX = 0;
    public static final int DVB_DEVICE_DVR = 1;
    public static final int DVB_DEVICE_FRONTEND = 2;
    static final int VIDEO_UNAVAILABLE_REASON_START = 0;
    static final int VIDEO_UNAVAILABLE_REASON_END = 18;
    public static final int VIDEO_UNAVAILABLE_REASON_UNKNOWN = 0;
    public static final int VIDEO_UNAVAILABLE_REASON_TUNING = 1;
    public static final int VIDEO_UNAVAILABLE_REASON_WEAK_SIGNAL = 2;
    public static final int VIDEO_UNAVAILABLE_REASON_BUFFERING = 3;
    public static final int VIDEO_UNAVAILABLE_REASON_AUDIO_ONLY = 4;
    public static final int VIDEO_UNAVAILABLE_REASON_NOT_CONNECTED = 5;
    public static final int VIDEO_UNAVAILABLE_REASON_INSUFFICIENT_RESOURCE = 6;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_INSUFFICIENT_OUTPUT_PROTECTION = 7;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_PVR_RECORDING_NOT_ALLOWED = 8;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NO_LICENSE = 9;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_LICENSE_EXPIRED = 10;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NEED_ACTIVATION = 11;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NEED_PAIRING = 12;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NO_CARD = 13;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_CARD_MUTE = 14;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_CARD_INVALID = 15;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_BLACKOUT = 16;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_REBOOTING = 17;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_UNKNOWN = 18;
    public static final int TIME_SHIFT_STATUS_UNKNOWN = 0;
    public static final int TIME_SHIFT_STATUS_UNSUPPORTED = 1;
    public static final int TIME_SHIFT_STATUS_UNAVAILABLE = 2;
    public static final int TIME_SHIFT_STATUS_AVAILABLE = 3;
    public static final long TIME_SHIFT_INVALID_TIME = -9223372036854775808L;
    static final int RECORDING_ERROR_START = 0;
    static final int RECORDING_ERROR_END = 2;
    public static final int RECORDING_ERROR_UNKNOWN = 0;
    public static final int RECORDING_ERROR_INSUFFICIENT_SPACE = 1;
    public static final int RECORDING_ERROR_RESOURCE_BUSY = 2;
    public static final int INPUT_STATE_CONNECTED = 0;
    public static final int INPUT_STATE_CONNECTED_STANDBY = 1;
    public static final int INPUT_STATE_DISCONNECTED = 2;
    public static final int UNKNOWN_CLIENT_PID = -1;
    public static final java.lang.String ACTION_BLOCKED_RATINGS_CHANGED = "android.media.tv.action.BLOCKED_RATINGS_CHANGED";
    public static final java.lang.String ACTION_PARENTAL_CONTROLS_ENABLED_CHANGED = "android.media.tv.action.PARENTAL_CONTROLS_ENABLED_CHANGED";
    public static final java.lang.String ACTION_QUERY_CONTENT_RATING_SYSTEMS = "android.media.tv.action.QUERY_CONTENT_RATING_SYSTEMS";
    public static final java.lang.String META_DATA_CONTENT_RATING_SYSTEMS = "android.media.tv.metadata.CONTENT_RATING_SYSTEMS";
    public static final java.lang.String ACTION_SETUP_INPUTS = "android.media.tv.action.SETUP_INPUTS";
    public static final java.lang.String ACTION_VIEW_RECORDING_SCHEDULES = "android.media.tv.action.VIEW_RECORDING_SCHEDULES";
    private final android.media.tv.ITvInputManager mService = null;
    private final java.lang.Object mLock = null;
    private final java.util.List<android.media.tv.TvInputManager.TvInputCallbackRecord> mCallbackRecords = null;
    private final java.util.Map<java.lang.String, java.lang.Integer> mStateMap = null;
    private final android.util.SparseArray<android.media.tv.TvInputManager.SessionCallbackRecord> mSessionCallbackRecordMap = null;
    private int mNextSeq;
    private final android.media.tv.ITvInputClient mClient = null;
    private final int mUserId = 0;
    public TvInputManager(android.media.tv.ITvInputManager p0, int p1) {}
    public java.util.List<android.media.tv.TvInputInfo> getTvInputList() { return null; }
    public android.media.tv.TvInputInfo getTvInputInfo(java.lang.String p0) { return null; }
    public void updateTvInputInfo(android.media.tv.TvInputInfo p0) {}
    public int getInputState(java.lang.String p0) { return 0; }
    public void registerCallback(android.media.tv.TvInputManager.TvInputCallback p0, android.os.Handler p1) {}
    public void unregisterCallback(android.media.tv.TvInputManager.TvInputCallback p0) {}
    public boolean isParentalControlsEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PARENTAL_CONTROLS")
    public void setParentalControlsEnabled(boolean p0) {}
    public boolean isRatingBlocked(android.media.tv.TvContentRating p0) { return false; }
    public java.util.List<android.media.tv.TvContentRating> getBlockedRatings() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PARENTAL_CONTROLS")
    public void addBlockedRating(android.media.tv.TvContentRating p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PARENTAL_CONTROLS")
    public void removeBlockedRating(android.media.tv.TvContentRating p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_CONTENT_RATING_SYSTEMS")
    public java.util.List<android.media.tv.TvContentRatingSystemInfo> getTvContentRatingSystemList() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.NOTIFY_TV_INPUTS")
    public void notifyPreviewProgramBrowsableDisabled(java.lang.String p0, long p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.NOTIFY_TV_INPUTS")
    public void notifyWatchNextProgramBrowsableDisabled(java.lang.String p0, long p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.NOTIFY_TV_INPUTS")
    public void notifyPreviewProgramAddedToWatchNext(java.lang.String p0, long p1, long p2) {}
    public void createSession(java.lang.String p0, android.media.tv.TvInputManager.SessionCallback p1, android.os.Handler p2) {}
    @android.annotation.RequiresPermission("android.permission.TUNER_RESOURCE_ACCESS")
    public int getClientPid(java.lang.String p0) { return 0; }
    public void createRecordingSession(java.lang.String p0, android.media.tv.TvInputManager.SessionCallback p1, android.os.Handler p2) {}
    private void createSessionInternal(java.lang.String p0, boolean p1, android.media.tv.TvInputManager.SessionCallback p2, android.os.Handler p3) {}
    private int getClientPidInternal(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CAPTURE_TV_INPUT")
    public java.util.List<android.media.tv.TvStreamConfig> getAvailableTvStreamConfigList(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CAPTURE_TV_INPUT")
    public boolean captureFrame(java.lang.String p0, android.view.Surface p1, android.media.tv.TvStreamConfig p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CAPTURE_TV_INPUT")
    public boolean isSingleSessionActive() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.TV_INPUT_HARDWARE")
    public java.util.List<android.media.tv.TvInputHardwareInfo> getHardwareList() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.TV_INPUT_HARDWARE")
    public android.media.tv.TvInputManager.Hardware acquireTvInputHardware(int p0, android.media.tv.TvInputManager.HardwareCallback p1, android.media.tv.TvInputInfo p2) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.TV_INPUT_HARDWARE")
    public android.media.tv.TvInputManager.Hardware acquireTvInputHardware(int p0, android.media.tv.TvInputInfo p1, android.media.tv.TvInputManager.HardwareCallback p2) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.TV_INPUT_HARDWARE")
    public android.media.tv.TvInputManager.Hardware acquireTvInputHardware(int p0, android.media.tv.TvInputInfo p1, java.lang.String p2, int p3, java.util.concurrent.Executor p4, android.media.tv.TvInputManager.HardwareCallback p5) { return null; }
    public void addHardwareDevice(int p0) {}
    public void removeHardwareDevice(int p0) {}
    private android.media.tv.TvInputManager.Hardware acquireTvInputHardwareInternal(int p0, android.media.tv.TvInputInfo p1, java.lang.String p2, int p3, java.util.concurrent.Executor p4, android.media.tv.TvInputManager.HardwareCallback p5) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.TV_INPUT_HARDWARE")
    public void releaseTvInputHardware(int p0, android.media.tv.TvInputManager.Hardware p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.DVB_DEVICE")
    public java.util.List<android.media.tv.DvbDeviceInfo> getDvbDeviceList() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.DVB_DEVICE")
    public android.os.ParcelFileDescriptor openDvbDevice(android.media.tv.DvbDeviceInfo p0, int p1) { return null; }
    public void requestChannelBrowsable(android.net.Uri p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_TUNED_INFO")
    public java.util.List<android.media.tv.TunedInfo> getCurrentTunedInfos() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DvbDeviceType {
    }

    @android.annotation.SystemApi
    public static final class Hardware {
        private final android.media.tv.ITvInputHardware mInterface = null;
        private Hardware(android.media.tv.ITvInputHardware p0) {}
        private android.media.tv.ITvInputHardware getInterface() { return null; }
        public boolean setSurface(android.view.Surface p0, android.media.tv.TvStreamConfig p1) { return false; }
        public void setStreamVolume(float p0) {}
        @android.annotation.SystemApi
        public boolean dispatchKeyEventToHdmi(android.view.KeyEvent p0) { return false; }
        public void overrideAudioSink(int p0, java.lang.String p1, int p2, int p3, int p4) {}
    }

    @android.annotation.SystemApi
    public static abstract class HardwareCallback {
        public HardwareCallback() {}
        public abstract void onReleased();
        public abstract void onStreamConfigChanged(android.media.tv.TvStreamConfig[] p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InputState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecordingError {
    }

    public static final class Session {
        static final int DISPATCH_IN_PROGRESS = -1;
        static final int DISPATCH_NOT_HANDLED = 0;
        static final int DISPATCH_HANDLED = 1;
        private static final long INPUT_SESSION_NOT_RESPONDING_TIMEOUT = 2500L;
        private final android.media.tv.ITvInputManager mService = null;
        private final int mUserId = 0;
        private final int mSeq = 0;
        private final android.media.tv.TvInputManager.Session.InputEventHandler mHandler = null;
        private final android.util.Pools.Pool<android.media.tv.TvInputManager.Session.PendingEvent> mPendingEventPool = null;
        private final android.util.SparseArray<android.media.tv.TvInputManager.Session.PendingEvent> mPendingEvents = null;
        private final android.util.SparseArray<android.media.tv.TvInputManager.SessionCallbackRecord> mSessionCallbackRecordMap = null;
        private android.os.IBinder mToken;
        private android.media.tv.TvInputManager.Session.TvInputEventSender mSender;
        private android.view.InputChannel mChannel;
        private final java.lang.Object mMetadataLock = null;
        private final java.util.List<android.media.tv.TvTrackInfo> mAudioTracks = null;
        private final java.util.List<android.media.tv.TvTrackInfo> mVideoTracks = null;
        private final java.util.List<android.media.tv.TvTrackInfo> mSubtitleTracks = null;
        private java.lang.String mSelectedAudioTrackId;
        private java.lang.String mSelectedVideoTrackId;
        private java.lang.String mSelectedSubtitleTrackId;
        private int mVideoWidth;
        private int mVideoHeight;
        private Session(android.os.IBinder p0, android.view.InputChannel p1, android.media.tv.ITvInputManager p2, int p3, int p4, android.util.SparseArray<android.media.tv.TvInputManager.SessionCallbackRecord> p5) {}
        public void release() {}
        void setMain() {}
        public void setSurface(android.view.Surface p0) {}
        public void dispatchSurfaceChanged(int p0, int p1, int p2) {}
        public void setStreamVolume(float p0) {}
        public void tune(android.net.Uri p0) {}
        public void tune(android.net.Uri p0, android.os.Bundle p1) {}
        public void setCaptionEnabled(boolean p0) {}
        public void selectTrack(int p0, java.lang.String p1) {}
        private boolean containsTrack(java.util.List<android.media.tv.TvTrackInfo> p0, java.lang.String p1) { return false; }
        public java.util.List<android.media.tv.TvTrackInfo> getTracks(int p0) { return null; }
        public java.lang.String getSelectedTrack(int p0) { return null; }
        boolean updateTracks(java.util.List<android.media.tv.TvTrackInfo> p0) { return false; }
        boolean updateTrackSelection(int p0, java.lang.String p1) { return false; }
        android.media.tv.TvTrackInfo getVideoTrackToNotify() { return null; }
        void timeShiftPlay(android.net.Uri p0) {}
        void timeShiftPause() {}
        void timeShiftResume() {}
        void timeShiftSeekTo(long p0) {}
        void timeShiftSetPlaybackParams(android.media.PlaybackParams p0) {}
        void timeShiftEnablePositionTracking(boolean p0) {}
        void startRecording(android.net.Uri p0) {}
        void startRecording(android.net.Uri p0, android.os.Bundle p1) {}
        void stopRecording() {}
        void pauseRecording(android.os.Bundle p0) {}
        void resumeRecording(android.os.Bundle p0) {}
        public void sendAppPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
        void createOverlayView(android.view.View p0, android.graphics.Rect p1) {}
        void relayoutOverlayView(android.graphics.Rect p0) {}
        void removeOverlayView() {}
        void unblockContent(android.media.tv.TvContentRating p0) {}
        public int dispatchInputEvent(android.view.InputEvent p0, java.lang.Object p1, android.media.tv.TvInputManager.Session.FinishedInputEventCallback p2, android.os.Handler p3) { return 0; }
        private void sendInputEventAndReportResultOnMainLooper(android.media.tv.TvInputManager.Session.PendingEvent p0) {}
        private int sendInputEventOnMainLooperLocked(android.media.tv.TvInputManager.Session.PendingEvent p0) { return 0; }
        void finishedInputEvent(int p0, boolean p1, boolean p2) {}
        void invokeFinishedInputEventCallback(android.media.tv.TvInputManager.Session.PendingEvent p0, boolean p1) {}
        private void flushPendingEventsLocked() {}
        private android.media.tv.TvInputManager.Session.PendingEvent obtainPendingEventLocked(android.view.InputEvent p0, java.lang.Object p1, android.media.tv.TvInputManager.Session.FinishedInputEventCallback p2, android.os.Handler p3) { return null; }
        private void recyclePendingEventLocked(android.media.tv.TvInputManager.Session.PendingEvent p0) {}
        android.os.IBinder getToken() { return null; }
        private void releaseInternal() {}

        public static interface FinishedInputEventCallback {
            public void onFinishedInputEvent(java.lang.Object p0, boolean p1);
        }

        private final class InputEventHandler extends android.os.Handler {
            public static final int MSG_SEND_INPUT_EVENT = 1;
            public static final int MSG_TIMEOUT_INPUT_EVENT = 2;
            public static final int MSG_FLUSH_INPUT_EVENT = 3;
            InputEventHandler(android.media.tv.TvInputManager.Session p0, android.os.Looper p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }

        private final class PendingEvent implements java.lang.Runnable {
            public android.view.InputEvent mEvent;
            public java.lang.Object mEventToken;
            public android.media.tv.TvInputManager.Session.FinishedInputEventCallback mCallback;
            public android.os.Handler mEventHandler;
            public boolean mHandled;
            private PendingEvent(android.media.tv.TvInputManager.Session p0) {}
            public void recycle() {}
            public void run() {}
        }

        private final class TvInputEventSender extends android.view.InputEventSender {
            public TvInputEventSender(android.media.tv.TvInputManager.Session p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
            public void onInputEventFinished(int p0, boolean p1) {}
        }
    }

    public static abstract class SessionCallback {
        public SessionCallback() {}
        public void onSessionCreated(android.media.tv.TvInputManager.Session p0) {}
        public void onSessionReleased(android.media.tv.TvInputManager.Session p0) {}
        public void onChannelRetuned(android.media.tv.TvInputManager.Session p0, android.net.Uri p1) {}
        public void onTracksChanged(android.media.tv.TvInputManager.Session p0, java.util.List<android.media.tv.TvTrackInfo> p1) {}
        public void onTrackSelected(android.media.tv.TvInputManager.Session p0, int p1, java.lang.String p2) {}
        public void onVideoSizeChanged(android.media.tv.TvInputManager.Session p0, int p1, int p2) {}
        public void onVideoAvailable(android.media.tv.TvInputManager.Session p0) {}
        public void onVideoUnavailable(android.media.tv.TvInputManager.Session p0, int p1) {}
        public void onContentAllowed(android.media.tv.TvInputManager.Session p0) {}
        public void onContentBlocked(android.media.tv.TvInputManager.Session p0, android.media.tv.TvContentRating p1) {}
        public void onLayoutSurface(android.media.tv.TvInputManager.Session p0, int p1, int p2, int p3, int p4) {}
        public void onSessionEvent(android.media.tv.TvInputManager.Session p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onTimeShiftStatusChanged(android.media.tv.TvInputManager.Session p0, int p1) {}
        public void onTimeShiftStartPositionChanged(android.media.tv.TvInputManager.Session p0, long p1) {}
        public void onTimeShiftCurrentPositionChanged(android.media.tv.TvInputManager.Session p0, long p1) {}
        void onTuned(android.media.tv.TvInputManager.Session p0, android.net.Uri p1) {}
        void onRecordingStopped(android.media.tv.TvInputManager.Session p0, android.net.Uri p1) {}
        void onError(android.media.tv.TvInputManager.Session p0, int p1) {}
    }

    private static final class SessionCallbackRecord {
        private final android.media.tv.TvInputManager.SessionCallback mSessionCallback = null;
        private final android.os.Handler mHandler = null;
        private android.media.tv.TvInputManager.Session mSession;
        SessionCallbackRecord(android.media.tv.TvInputManager.SessionCallback p0, android.os.Handler p1) {}
        void postSessionCreated(android.media.tv.TvInputManager.Session p0) {}
        void postSessionReleased() {}
        void postChannelRetuned(android.net.Uri p0) {}
        void postTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        void postTrackSelected(int p0, java.lang.String p1) {}
        void postVideoSizeChanged(int p0, int p1) {}
        void postVideoAvailable() {}
        void postVideoUnavailable(int p0) {}
        void postContentAllowed() {}
        void postContentBlocked(android.media.tv.TvContentRating p0) {}
        void postLayoutSurface(int p0, int p1, int p2, int p3) {}
        void postSessionEvent(java.lang.String p0, android.os.Bundle p1) {}
        void postTimeShiftStatusChanged(int p0) {}
        void postTimeShiftStartPositionChanged(long p0) {}
        void postTimeShiftCurrentPositionChanged(long p0) {}
        void postTuned(android.net.Uri p0) {}
        void postRecordingStopped(android.net.Uri p0) {}
        void postError(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TimeShiftStatus {
    }

    public static abstract class TvInputCallback {
        public TvInputCallback() {}
        public void onInputStateChanged(java.lang.String p0, int p1) {}
        public void onInputAdded(java.lang.String p0) {}
        public void onInputRemoved(java.lang.String p0) {}
        public void onInputUpdated(java.lang.String p0) {}
        public void onTvInputInfoUpdated(android.media.tv.TvInputInfo p0) {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.ACCESS_TUNED_INFO")
        public void onCurrentTunedInfosUpdated(java.util.List<android.media.tv.TunedInfo> p0) {}
    }

    private static final class TvInputCallbackRecord {
        private final android.media.tv.TvInputManager.TvInputCallback mCallback = null;
        private final android.os.Handler mHandler = null;
        public TvInputCallbackRecord(android.media.tv.TvInputManager.TvInputCallback p0, android.os.Handler p1) {}
        public android.media.tv.TvInputManager.TvInputCallback getCallback() { return null; }
        public void postInputAdded(java.lang.String p0) {}
        public void postInputRemoved(java.lang.String p0) {}
        public void postInputUpdated(java.lang.String p0) {}
        public void postInputStateChanged(java.lang.String p0, int p1) {}
        public void postTvInputInfoUpdated(android.media.tv.TvInputInfo p0) {}
        public void postCurrentTunedInfosUpdated(java.util.List<android.media.tv.TunedInfo> p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VideoUnavailableReason {
    }
}
