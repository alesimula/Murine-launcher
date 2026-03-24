package android.media.tv.ad;

public class ITvAdSessionWrapper extends android.media.tv.ad.ITvAdSession.Stub implements com.android.internal.os.HandlerCaller.Callback {
    public ITvAdSessionWrapper(android.content.Context p0, android.media.tv.ad.TvAdService.Session p1, android.view.InputChannel p2) { super(); }
    public void release() {}
    public void executeMessage(android.os.Message p0) {}
    public void startAdService() throws android.os.RemoteException {}
    public void stopAdService() {}
    public void resetAdService() {}
    public void setSurface(android.view.Surface p0) {}
    public void dispatchSurfaceChanged(int p0, int p1, int p2) {}
    public void sendCurrentVideoBounds(android.graphics.Rect p0) {}
    public void sendCurrentChannelUri(android.net.Uri p0) {}
    public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
    public void sendCurrentTvInputId(java.lang.String p0) {}
    public void sendSigningResult(java.lang.String p0, byte[] p1) {}
    public void notifyError(java.lang.String p0, android.os.Bundle p1) {}
    public void notifyTvMessage(int p0, android.os.Bundle p1) {}
    public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) {}
    public void relayoutMediaView(android.graphics.Rect p0) {}
    public void removeMediaView() {}
    public void notifyTvInputSessionData(java.lang.String p0, android.os.Bundle p1) {}

    private final class TvAdEventReceiver extends android.view.InputEventReceiver {
        TvAdEventReceiver(android.media.tv.ad.ITvAdSessionWrapper p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}
    }
}
