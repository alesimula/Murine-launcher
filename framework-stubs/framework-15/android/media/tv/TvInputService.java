package android.media.tv;

public abstract class TvInputService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.media.tv.TvInputService";
    public static final java.lang.String SERVICE_META_DATA = "android.media.tv.input";
    public static final int PRIORITY_HINT_USE_CASE_TYPE_BACKGROUND = 100;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_SCAN = 200;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_PLAYBACK = 300;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_LIVE = 400;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_RECORD = 500;
    public TvInputService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.os.IBinder createExtension() { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAvailableExtensionInterfaceNames() { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.os.IBinder getExtensionInterface(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public java.lang.String getExtensionInterfacePermission(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public abstract android.media.tv.TvInputService.Session onCreateSession(java.lang.String p0);
    @android.annotation.Nullable
    public android.media.tv.TvInputService.RecordingSession onCreateRecordingSession(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public android.media.tv.TvInputService.Session onCreateSession(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.Nullable
    public android.media.tv.TvInputService.Session onCreateSession(java.lang.String p0, java.lang.String p1, android.content.AttributionSource p2) { return null; }
    @android.annotation.Nullable
    public android.media.tv.TvInputService.RecordingSession onCreateRecordingSession(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.media.tv.TvInputInfo onHardwareAdded(android.media.tv.TvInputHardwareInfo p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public java.lang.String onHardwareRemoved(android.media.tv.TvInputHardwareInfo p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.media.tv.TvInputInfo onHdmiDeviceAdded(android.hardware.hdmi.HdmiDeviceInfo p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public java.lang.String onHdmiDeviceRemoved(android.hardware.hdmi.HdmiDeviceInfo p0) { return null; }
    @android.annotation.SystemApi
    public void onHdmiDeviceUpdated(android.hardware.hdmi.HdmiDeviceInfo p0) {}
    public static boolean isNavigationKey(int p0) { return false; }

    public static abstract class HardwareSession extends android.media.tv.TvInputService.Session {
        public HardwareSession(android.content.Context p0) { super(null); }
        public abstract java.lang.String getHardwareInputId();
        public final boolean onSetSurface(android.view.Surface p0) { return false; }
        public void onHardwareVideoAvailable() {}
        public void onHardwareVideoUnavailable(int p0) {}
        void release() {}
    }

    private static final class OverlayViewCleanUpTask extends android.os.AsyncTask<android.view.View, java.lang.Void, java.lang.Void> {
        protected java.lang.Void doInBackground(android.view.View... p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PriorityHintUseCaseType {
    }

    public static abstract class RecordingSession {
        final android.os.Handler mHandler = null;
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
        public void onPauseRecording(android.os.Bundle p0) {}
        public void onResumeRecording(android.os.Bundle p0) {}
        public abstract void onRelease();
        public void onAppPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
        void tune(android.net.Uri p0, android.os.Bundle p1) {}
        void release() {}
        void startRecording(android.net.Uri p0, android.os.Bundle p1) {}
        void stopRecording() {}
        void pauseRecording(android.os.Bundle p0) {}
        void resumeRecording(android.os.Bundle p0) {}
        void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    }

    @android.annotation.SuppressLint("HandlerLeak")
    private final class ServiceHandler extends android.os.Handler {
        public final void handleMessage(android.os.Message p0) {}
    }

    public static abstract class Session implements android.view.KeyEvent.Callback {
        final android.os.Handler mHandler = null;
        public Session(android.content.Context p0) {}
        public void setOverlayViewEnabled(boolean p0) {}
        @android.annotation.SystemApi
        public void notifySessionEvent(java.lang.String p0, android.os.Bundle p1) {}
        public void notifyChannelRetuned(android.net.Uri p0) {}
        public void notifyTuned(android.net.Uri p0) {}
        public void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public void notifyTrackSelected(int p0, java.lang.String p1) {}
        public void notifyVideoAvailable() {}
        public void notifyVideoUnavailable(int p0) {}
        @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
        public void notifyVideoFreezeUpdated(boolean p0) {}
        public void notifyAudioPresentationChanged(java.util.List<android.media.AudioPresentation> p0) {}
        public void notifyAudioPresentationSelected(int p0, int p1) {}
        public void notifyContentAllowed() {}
        public void notifyContentBlocked(android.media.tv.TvContentRating p0) {}
        public void notifyTimeShiftStatusChanged(int p0) {}
        public void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) {}
        public void notifyAdResponse(android.media.tv.AdResponse p0) {}
        public void notifyAdBufferConsumed(android.media.tv.AdBuffer p0) {}
        public void notifyTvMessage(int p0, android.os.Bundle p1) {}
        public void notifyAitInfoUpdated(android.media.tv.AitInfo p0) {}
        public void notifyTimeShiftMode(int p0) {}
        public void notifyAvailableSpeeds(float[] p0) {}
        public void notifySignalStrength(int p0) {}
        public void notifyCueingMessageAvailability(boolean p0) {}
        @android.annotation.FlaggedApi("android.media.tv.flags.enable_ad_service_fw")
        public void sendTvInputSessionData(java.lang.String p0, android.os.Bundle p1) {}
        public void layoutSurface(int p0, int p1, int p2, int p3) {}
        public abstract void onRelease();
        @android.annotation.SystemApi
        public void onSetMain(boolean p0) {}
        public abstract boolean onSetSurface(android.view.Surface p0);
        public void onSurfaceChanged(int p0, int p1, int p2) {}
        public void onOverlayViewSizeChanged(int p0, int p1) {}
        public abstract void onSetStreamVolume(float p0);
        public void onRequestBroadcastInfo(android.media.tv.BroadcastInfoRequest p0) {}
        public void onRemoveBroadcastInfo(int p0) {}
        public void onRequestAd(android.media.tv.AdRequest p0) {}
        public void onAdBufferReady(android.media.tv.AdBuffer p0) {}
        @android.annotation.FlaggedApi("android.media.tv.flags.enable_ad_service_fw")
        public void onTvAdSessionData(java.lang.String p0, android.os.Bundle p1) {}
        public abstract boolean onTune(android.net.Uri p0);
        public boolean onTune(android.net.Uri p0, android.os.Bundle p1) { return false; }
        public abstract void onSetCaptionEnabled(boolean p0);
        public void onUnblockContent(android.media.tv.TvContentRating p0) {}
        public boolean onSelectTrack(int p0, java.lang.String p1) { return false; }
        public void onSetInteractiveAppNotificationEnabled(boolean p0) {}
        public boolean onSelectAudioPresentation(int p0, int p1) { return false; }
        public void onAppPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
        public android.view.View onCreateOverlayView() { return null; }
        public void onSetTvMessageEnabled(int p0, boolean p1) {}
        public void onTvMessage(int p0, android.os.Bundle p1) {}
        @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
        public void onStopPlayback(int p0) {}
        @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
        public void onResumePlayback() {}
        public void onSetVideoFrozen(boolean p0) {}
        public void onTimeShiftPlay(android.net.Uri p0) {}
        public void onTimeShiftPause() {}
        public void onTimeShiftResume() {}
        public void onTimeShiftSeekTo(long p0) {}
        public void onTimeShiftSetPlaybackParams(android.media.PlaybackParams p0) {}
        public void onTimeShiftSetMode(int p0) {}
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
        void selectAudioPresentation(int p0, int p1) {}
        void selectTrack(int p0, java.lang.String p1) {}
        void unblockContent(java.lang.String p0) {}
        void setInteractiveAppNotificationEnabled(boolean p0) {}
        void setTvMessageEnabled(int p0, boolean p1) {}
        void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
        void createOverlayView(android.os.IBinder p0, android.graphics.Rect p1) {}
        void relayoutOverlayView(android.graphics.Rect p0) {}
        void removeOverlayView(boolean p0) {}
        void stopPlayback(int p0) {}
        void resumePlayback() {}
        void setVideoFrozen(boolean p0) {}
        void timeShiftPlay(android.net.Uri p0) {}
        void timeShiftPause() {}
        void timeShiftResume() {}
        void timeShiftSeekTo(long p0) {}
        void timeShiftSetPlaybackParams(android.media.PlaybackParams p0) {}
        void timeShiftSetMode(int p0) {}
        void timeShiftEnablePositionTracking(boolean p0) {}
        void scheduleOverlayViewCleanup() {}
        void requestBroadcastInfo(android.media.tv.BroadcastInfoRequest p0) {}
        void removeBroadcastInfo(int p0) {}
        void requestAd(android.media.tv.AdRequest p0) {}
        void notifyAdBufferReady(android.media.tv.AdBuffer p0) {}
        void notifyTvAdSessionData(java.lang.String p0, android.os.Bundle p1) {}
        void onTvMessageReceived(int p0, android.os.Bundle p1) {}
        int dispatchInputEvent(android.view.InputEvent p0, android.view.InputEventReceiver p1) { return 0; }

        private final class TimeShiftPositionTrackingRunnable implements java.lang.Runnable {
            public void run() {}
        }
    }
}
