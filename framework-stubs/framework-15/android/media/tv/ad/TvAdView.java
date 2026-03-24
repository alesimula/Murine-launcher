package android.media.tv.ad;

@android.annotation.FlaggedApi("android.media.tv.flags.enable_ad_service_fw")
public class TvAdView extends android.view.ViewGroup {
    public static final java.lang.String ERROR_KEY_METHOD_NAME = "method_name";
    public static final java.lang.String ERROR_KEY_ERROR_CODE = "error_code";
    public TvAdView(android.content.Context p0) { super((android.content.Context)null); }
    public TvAdView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TvAdView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public boolean setTvView(android.media.tv.TvView p0) { return false; }
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void onMeasure(int p0, int p1) {}
    public void onVisibilityChanged(android.view.View p0, int p1) {}
    public void reset() {}
    public boolean dispatchUnhandledInputEvent(android.view.InputEvent p0) { return false; }
    public boolean onUnhandledInputEvent(android.view.InputEvent p0) { return false; }
    public void setOnUnhandledInputEventListener(android.media.tv.ad.TvAdView.OnUnhandledInputEventListener p0) {}
    @android.annotation.Nullable
    public android.media.tv.ad.TvAdView.OnUnhandledInputEventListener getOnUnhandledInputEventListener() { return null; }
    public void clearOnUnhandledInputEventListener() {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public void prepareAdService(java.lang.String p0, java.lang.String p1) {}
    public void startAdService() {}
    public void stopAdService() {}
    public void resetAdService() {}
    public void sendCurrentVideoBounds(android.graphics.Rect p0) {}
    public void sendCurrentChannelUri(android.net.Uri p0) {}
    public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
    public void sendCurrentTvInputId(java.lang.String p0) {}
    public void sendSigningResult(java.lang.String p0, byte[] p1) {}
    public void notifyError(java.lang.String p0, android.os.Bundle p1) {}
    public void notifyTvMessage(int p0, android.os.Bundle p1) {}
    public void setCallback(java.util.concurrent.Executor p0, android.media.tv.ad.TvAdView.TvAdCallback p1) {}
    public void clearCallback() {}
    public android.media.tv.ad.TvAdManager.Session getAdSession() { return null; }

    private class MySessionCallback extends android.media.tv.ad.TvAdManager.SessionCallback {
        final java.lang.String mServiceId = null;
        MySessionCallback(android.media.tv.ad.TvAdView p0, java.lang.String p1) { super(); }
        public void onSessionCreated(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onSessionReleased(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onLayoutSurface(android.media.tv.ad.TvAdManager.Session p0, int p1, int p2, int p3, int p4) {}
        public void onRequestCurrentVideoBounds(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onRequestCurrentChannelUri(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onRequestTrackInfoList(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onRequestCurrentTvInputId(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onRequestSigning(android.media.tv.ad.TvAdManager.Session p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, byte[] p4) {}
    }

    public static interface OnUnhandledInputEventListener {
        public boolean onUnhandledInputEvent(android.view.InputEvent p0);
    }

    public static abstract class TvAdCallback {
        public TvAdCallback() {}
        public void onRequestCurrentVideoBounds(java.lang.String p0) {}
        public void onRequestCurrentChannelUri(java.lang.String p0) {}
        public void onRequestTrackInfoList(java.lang.String p0) {}
        public void onRequestCurrentTvInputId(java.lang.String p0) {}
        public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, byte[] p4) {}
        public void onStateChanged(java.lang.String p0, int p1, int p2) {}
    }
}
