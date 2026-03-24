package android.media.tv;

public class TvView extends android.view.ViewGroup {
    public TvView(android.content.Context p0) { super((android.content.Context)null); }
    public TvView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TvView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public void setCallback(android.media.tv.TvView.TvInputCallback p0) {}
    public android.media.tv.TvInputManager.Session getInputSession() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CHANGE_HDMI_CEC_ACTIVE_SOURCE")
    public void setMain() {}
    public void setZOrderMediaOverlay(boolean p0) {}
    public void setZOrderOnTop(boolean p0) {}
    public void setStreamVolume(float p0) {}
    public void tune(java.lang.String p0, android.net.Uri p1) {}
    public void tune(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2) {}
    public void reset() {}
    public void requestUnblockContent(android.media.tv.TvContentRating p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PARENTAL_CONTROLS")
    public void unblockContent(android.media.tv.TvContentRating p0) {}
    public void setCaptionEnabled(boolean p0) {}
    public void selectTrack(int p0, java.lang.String p1) {}
    public java.util.List<android.media.tv.TvTrackInfo> getTracks(int p0) { return null; }
    public java.lang.String getSelectedTrack(int p0) { return null; }
    public void setInteractiveAppNotificationEnabled(boolean p0) {}
    public void timeShiftPlay(java.lang.String p0, android.net.Uri p1) {}
    public void timeShiftPause() {}
    public void timeShiftResume() {}
    public void timeShiftSeekTo(long p0) {}
    public void timeShiftSetPlaybackParams(android.media.PlaybackParams p0) {}
    public void setTimeShiftPositionCallback(android.media.tv.TvView.TimeShiftPositionCallback p0) {}
    public void sendAppPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    public boolean dispatchUnhandledInputEvent(android.view.InputEvent p0) { return false; }
    public boolean onUnhandledInputEvent(android.view.InputEvent p0) { return false; }
    public void setOnUnhandledInputEventListener(android.media.tv.TvView.OnUnhandledInputEventListener p0) {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public void dispatchWindowFocusChanged(boolean p0) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    public void draw(android.graphics.Canvas p0) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    protected void onVisibilityChanged(android.view.View p0, int p1) {}

    private class MySessionCallback extends android.media.tv.TvInputManager.SessionCallback {
        final java.lang.String mInputId = null;
        android.net.Uri mChannelUri;
        android.os.Bundle mTuneParams;
        android.net.Uri mRecordedProgramUri;
        MySessionCallback(android.media.tv.TvView p0, java.lang.String p1, android.net.Uri p2, android.os.Bundle p3) { super(); }
        MySessionCallback(android.media.tv.TvView p0, java.lang.String p1, android.net.Uri p2) { super(); }
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
        public void onAitInfoUpdated(android.media.tv.TvInputManager.Session p0, android.media.tv.AitInfo p1) {}
        public void onSignalStrengthUpdated(android.media.tv.TvInputManager.Session p0, int p1) {}
        public void onTuned(android.media.tv.TvInputManager.Session p0, android.net.Uri p1) {}
    }

    public static interface OnUnhandledInputEventListener {
        public boolean onUnhandledInputEvent(android.view.InputEvent p0);
    }

    public static abstract class TimeShiftPositionCallback {
        public TimeShiftPositionCallback() {}
        public void onTimeShiftStartPositionChanged(java.lang.String p0, long p1) {}
        public void onTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) {}
    }

    public static abstract class TvInputCallback {
        public TvInputCallback() {}
        public void onConnectionFailed(java.lang.String p0) {}
        public void onDisconnected(java.lang.String p0) {}
        public void onChannelRetuned(java.lang.String p0, android.net.Uri p1) {}
        public void onTracksChanged(java.lang.String p0, java.util.List<android.media.tv.TvTrackInfo> p1) {}
        public void onTrackSelected(java.lang.String p0, int p1, java.lang.String p2) {}
        public void onVideoSizeChanged(java.lang.String p0, int p1, int p2) {}
        public void onVideoAvailable(java.lang.String p0) {}
        public void onVideoUnavailable(java.lang.String p0, int p1) {}
        public void onContentAllowed(java.lang.String p0) {}
        public void onContentBlocked(java.lang.String p0, android.media.tv.TvContentRating p1) {}
        @android.annotation.SystemApi
        public void onEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onTimeShiftStatusChanged(java.lang.String p0, int p1) {}
        public void onAitInfoUpdated(java.lang.String p0, android.media.tv.AitInfo p1) {}
        public void onSignalStrengthUpdated(java.lang.String p0, int p1) {}
        public void onTuned(java.lang.String p0, android.net.Uri p1) {}
    }
}
