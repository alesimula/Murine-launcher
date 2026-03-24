package android.media.tv;

public class ITvInputSessionWrapper extends android.media.tv.ITvInputSession.Stub implements com.android.internal.os.HandlerCaller.Callback {
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
    public void selectAudioPresentation(int p0, int p1) {}
    public void selectTrack(int p0, java.lang.String p1) {}
    public void setInteractiveAppNotificationEnabled(boolean p0) {}
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
    public void timeShiftSetMode(int p0) {}
    public void timeShiftEnablePositionTracking(boolean p0) {}
    public void startRecording(android.net.Uri p0, android.os.Bundle p1) {}
    public void stopRecording() {}
    public void pauseRecording(android.os.Bundle p0) {}
    public void resumeRecording(android.os.Bundle p0) {}
    public void requestBroadcastInfo(android.media.tv.BroadcastInfoRequest p0) {}
    public void removeBroadcastInfo(int p0) {}
    public void requestAd(android.media.tv.AdRequest p0) {}
    public void notifyAdBufferReady(android.media.tv.AdBuffer p0) {}
    public void notifyTvMessage(int p0, android.os.Bundle p1) {}
    public void setTvMessageEnabled(int p0, boolean p1) {}

    private final class TvInputEventReceiver extends android.view.InputEventReceiver {
        TvInputEventReceiver(android.media.tv.ITvInputSessionWrapper p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}
    }
}
