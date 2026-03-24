package android.media.tv.interactive;

public class TvInteractiveAppView extends android.view.ViewGroup {
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_CERTIFICATE = "certificate";
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_ALIAS = "alias";
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_PRIVATE_KEY = "private_key";
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_HTTP_ADDITIONAL_HEADERS = "http_additional_headers";
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_HTTP_USER_AGENT = "http_user_agent";
    public static final java.lang.String ERROR_KEY_METHOD_NAME = "method_name";
    public TvInteractiveAppView(android.content.Context p0) { super((android.content.Context)null); }
    public TvInteractiveAppView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TvInteractiveAppView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public void setCallback(java.util.concurrent.Executor p0, android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback p1) {}
    public void clearCallback() {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void onMeasure(int p0, int p1) {}
    public void onVisibilityChanged(android.view.View p0, int p1) {}
    @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
    public void setZOrderMediaOverlay(boolean p0) {}
    @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
    public void setZOrderOnTop(boolean p0) {}
    public void reset() {}
    public boolean dispatchUnhandledInputEvent(android.view.InputEvent p0) { return false; }
    public boolean onUnhandledInputEvent(android.view.InputEvent p0) { return false; }
    public void setOnUnhandledInputEventListener(java.util.concurrent.Executor p0, android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener p1) {}
    @android.annotation.Nullable
    public android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener getOnUnhandledInputEventListener() { return null; }
    public void clearOnUnhandledInputEventListener() {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public void prepareInteractiveApp(java.lang.String p0, int p1) {}
    public void startInteractiveApp() {}
    public void stopInteractiveApp() {}
    public void resetInteractiveApp() {}
    public void sendCurrentVideoBounds(android.graphics.Rect p0) {}
    public void sendCurrentChannelUri(android.net.Uri p0) {}
    public void sendCurrentChannelLcn(int p0) {}
    public void sendStreamVolume(float p0) {}
    public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
    @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
    public void sendSelectedTrackInfo(java.util.List<android.media.tv.TvTrackInfo> p0) {}
    public void sendCurrentTvInputId(java.lang.String p0) {}
    public void sendTimeShiftMode(int p0) {}
    public void sendAvailableSpeeds(float[] p0) {}
    public void sendTvRecordingInfo(android.media.tv.TvRecordingInfo p0) {}
    public void sendTvRecordingInfoList(java.util.List<android.media.tv.TvRecordingInfo> p0) {}
    public void notifyRecordingStarted(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingStopped(java.lang.String p0) {}
    @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
    public void notifyVideoFreezeUpdated(boolean p0) {}
    public void sendSigningResult(java.lang.String p0, byte[] p1) {}
    @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
    public void sendCertificate(java.lang.String p0, int p1, android.net.http.SslCertificate p2) {}
    public void notifyError(java.lang.String p0, android.os.Bundle p1) {}
    public void notifyTimeShiftPlaybackParams(android.media.PlaybackParams p0) {}
    public void notifyTimeShiftStatusChanged(java.lang.String p0, int p1) {}
    public void notifyTimeShiftStartPositionChanged(java.lang.String p0, long p1) {}
    public void notifyTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) {}
    public void notifyRecordingConnectionFailed(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingDisconnected(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingTuned(java.lang.String p0, android.net.Uri p1) {}
    public void notifyRecordingError(java.lang.String p0, int p1) {}
    public void notifyRecordingScheduled(java.lang.String p0, java.lang.String p1) {}
    public void notifyTvMessage(int p0, android.os.Bundle p1) {}
    public void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) {}
    public void destroyBiInteractiveApp(java.lang.String p0) {}
    public android.media.tv.interactive.TvInteractiveAppManager.Session getInteractiveAppSession() { return null; }
    public int setTvView(android.media.tv.TvView p0) { return 0; }
    public void setTeletextAppEnabled(boolean p0) {}

    private class MySessionCallback extends android.media.tv.interactive.TvInteractiveAppManager.SessionCallback {
        final java.lang.String mIAppServiceId = null;
        int mType;
        MySessionCallback(android.media.tv.interactive.TvInteractiveAppView p0, java.lang.String p1, int p2) { super(); }
        public void onSessionCreated(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onSessionReleased(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onLayoutSurface(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1, int p2, int p3, int p4) {}
        public void onCommandRequest(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onTimeShiftCommandRequest(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onSessionStateChanged(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1, int p2) {}
        public void onBiInteractiveAppCreated(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.net.Uri p1, java.lang.String p2) {}
        public void onTeletextAppStateChanged(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1) {}
        public void onSetVideoBounds(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.graphics.Rect p1) {}
        public void onRequestCurrentVideoBounds(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestCurrentChannelUri(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestCurrentChannelLcn(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestStreamVolume(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestTrackInfoList(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestSelectedTrackInfo(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestCurrentTvInputId(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestTimeShiftMode(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestAvailableSpeeds(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestStartRecording(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, android.net.Uri p2) {}
        public void onRequestStopRecording(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1) {}
        public void onSetTvRecordingInfo(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, android.media.tv.TvRecordingInfo p2) {}
        public void onRequestScheduleRecording(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, android.net.Uri p4, android.os.Bundle p5) {}
        public void onRequestScheduleRecording(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, long p4, long p5, int p6, android.os.Bundle p7) {}
        public void onRequestTvRecordingInfo(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1) {}
        public void onRequestTvRecordingInfoList(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1) {}
        public void onRequestSigning(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, byte[] p4) {}
        public void onRequestSigning(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, byte[] p5) {}
        public void onRequestCertificate(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, int p2) {}
    }

    public static interface OnUnhandledInputEventListener {
        public boolean onUnhandledInputEvent(android.view.InputEvent p0);
    }

    public static abstract class TvInteractiveAppCallback {
        public TvInteractiveAppCallback() {}
        public void onPlaybackCommandRequest(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onTimeShiftCommandRequest(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onStateChanged(java.lang.String p0, int p1, int p2) {}
        public void onBiInteractiveAppCreated(java.lang.String p0, android.net.Uri p1, java.lang.String p2) {}
        public void onTeletextAppStateChanged(java.lang.String p0, int p1) {}
        public void onSetVideoBounds(java.lang.String p0, android.graphics.Rect p1) {}
        public void onRequestCurrentVideoBounds(java.lang.String p0) {}
        public void onRequestCurrentChannelUri(java.lang.String p0) {}
        public void onRequestCurrentChannelLcn(java.lang.String p0) {}
        public void onRequestStreamVolume(java.lang.String p0) {}
        public void onRequestTrackInfoList(java.lang.String p0) {}
        @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
        public void onRequestSelectedTrackInfo(java.lang.String p0) {}
        public void onRequestCurrentTvInputId(java.lang.String p0) {}
        public void onRequestTimeShiftMode(java.lang.String p0) {}
        public void onRequestAvailableSpeeds(java.lang.String p0) {}
        public void onRequestStartRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2) {}
        public void onRequestStopRecording(java.lang.String p0, java.lang.String p1) {}
        public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, android.net.Uri p4, android.os.Bundle p5) {}
        public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, long p4, long p5, int p6, android.os.Bundle p7) {}
        public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, byte[] p4) {}
        @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
        public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, byte[] p5) {}
        @android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
        public void onRequestCertificate(java.lang.String p0, java.lang.String p1, int p2) {}
        public void onSetTvRecordingInfo(java.lang.String p0, java.lang.String p1, android.media.tv.TvRecordingInfo p2) {}
        public void onRequestTvRecordingInfo(java.lang.String p0, java.lang.String p1) {}
        public void onRequestTvRecordingInfoList(java.lang.String p0, int p1) {}
    }
}
