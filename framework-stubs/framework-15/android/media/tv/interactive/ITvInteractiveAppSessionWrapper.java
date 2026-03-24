package android.media.tv.interactive;

public class ITvInteractiveAppSessionWrapper extends android.media.tv.interactive.ITvInteractiveAppSession.Stub implements com.android.internal.os.HandlerCaller.Callback {
    public ITvInteractiveAppSessionWrapper(android.content.Context p0, android.media.tv.interactive.TvInteractiveAppService.Session p1, android.view.InputChannel p2) { super(); }
    public void executeMessage(android.os.Message p0) {}
    public void startInteractiveApp() {}
    public void stopInteractiveApp() {}
    public void resetInteractiveApp() {}
    public void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) {}
    public void destroyBiInteractiveApp(java.lang.String p0) {}
    public void setTeletextAppEnabled(boolean p0) {}
    public void sendCurrentVideoBounds(android.graphics.Rect p0) {}
    public void sendCurrentChannelUri(android.net.Uri p0) {}
    public void sendCurrentChannelLcn(int p0) {}
    public void sendStreamVolume(float p0) {}
    public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
    public void sendCurrentTvInputId(java.lang.String p0) {}
    public void sendTimeShiftMode(int p0) {}
    public void sendAvailableSpeeds(float[] p0) {}
    public void sendTvRecordingInfo(android.media.tv.TvRecordingInfo p0) {}
    public void sendTvRecordingInfoList(java.util.List<android.media.tv.TvRecordingInfo> p0) {}
    public void sendSigningResult(java.lang.String p0, byte[] p1) {}
    public void sendCertificate(java.lang.String p0, int p1, android.os.Bundle p2) {}
    public void notifyError(java.lang.String p0, android.os.Bundle p1) {}
    public void notifyTimeShiftPlaybackParams(android.media.PlaybackParams p0) {}
    public void notifyTimeShiftStatusChanged(java.lang.String p0, int p1) {}
    public void notifyTimeShiftStartPositionChanged(java.lang.String p0, long p1) {}
    public void notifyTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) {}
    public void release() {}
    public void notifyTuned(android.net.Uri p0) {}
    public void notifyTrackSelected(int p0, java.lang.String p1) {}
    public void notifyTvMessage(int p0, android.os.Bundle p1) {}
    public void sendSelectedTrackInfo(java.util.List<android.media.tv.TvTrackInfo> p0) {}
    public void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) {}
    public void notifyVideoAvailable() {}
    public void notifyVideoUnavailable(int p0) {}
    public void notifyVideoFreezeUpdated(boolean p0) {}
    public void notifyContentAllowed() {}
    public void notifyContentBlocked(java.lang.String p0) {}
    public void notifySignalStrength(int p0) {}
    public void notifyRecordingStarted(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingStopped(java.lang.String p0) {}
    public void notifyRecordingConnectionFailed(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingDisconnected(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingTuned(java.lang.String p0, android.net.Uri p1) {}
    public void notifyRecordingError(java.lang.String p0, int p1) {}
    public void notifyRecordingScheduled(java.lang.String p0, java.lang.String p1) {}
    public void setSurface(android.view.Surface p0) {}
    public void dispatchSurfaceChanged(int p0, int p1, int p2) {}
    public void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) {}
    public void notifyAdResponse(android.media.tv.AdResponse p0) {}
    public void notifyAdBufferConsumed(android.media.tv.AdBuffer p0) {}
    public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) {}
    public void relayoutMediaView(android.graphics.Rect p0) {}
    public void removeMediaView() {}

    private final class TvInteractiveAppEventReceiver extends android.view.InputEventReceiver {
        TvInteractiveAppEventReceiver(android.media.tv.interactive.ITvInteractiveAppSessionWrapper p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}
    }
}
