package android.media.tv.interactive;

public interface ITvInteractiveAppManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.interactive.ITvInteractiveAppManager";
    public java.util.List<android.media.tv.interactive.TvInteractiveAppServiceInfo> getTvInteractiveAppServiceList(int p0) throws android.os.RemoteException;
    public void registerAppLinkInfo(java.lang.String p0, android.media.tv.interactive.AppLinkInfo p1, int p2) throws android.os.RemoteException;
    public void unregisterAppLinkInfo(java.lang.String p0, android.media.tv.interactive.AppLinkInfo p1, int p2) throws android.os.RemoteException;
    public void sendAppLinkCommand(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public void startInteractiveApp(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void stopInteractiveApp(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void resetInteractiveApp(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void createBiInteractiveApp(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;
    public void destroyBiInteractiveApp(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setTeletextAppEnabled(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException;
    public void sendCurrentChannelUri(android.os.IBinder p0, android.net.Uri p1, int p2) throws android.os.RemoteException;
    public void sendCurrentChannelLcn(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public void sendStreamVolume(android.os.IBinder p0, float p1, int p2) throws android.os.RemoteException;
    public void sendTrackInfoList(android.os.IBinder p0, java.util.List<android.media.tv.TvTrackInfo> p1, int p2) throws android.os.RemoteException;
    public void sendCurrentTvInputId(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void sendSigningResult(android.os.IBinder p0, java.lang.String p1, byte[] p2, int p3) throws android.os.RemoteException;
    public void notifyError(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;
    public void createSession(android.media.tv.interactive.ITvInteractiveAppClient p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void releaseSession(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void notifyTuned(android.os.IBinder p0, android.net.Uri p1, int p2) throws android.os.RemoteException;
    public void notifyTrackSelected(android.os.IBinder p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void notifyTracksChanged(android.os.IBinder p0, java.util.List<android.media.tv.TvTrackInfo> p1, int p2) throws android.os.RemoteException;
    public void notifyVideoAvailable(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void notifyVideoUnavailable(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public void notifyContentAllowed(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void notifyContentBlocked(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void notifySignalStrength(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public void setSurface(android.os.IBinder p0, android.view.Surface p1, int p2) throws android.os.RemoteException;
    public void dispatchSurfaceChanged(android.os.IBinder p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void notifyBroadcastInfoResponse(android.os.IBinder p0, android.media.tv.BroadcastInfoResponse p1, int p2) throws android.os.RemoteException;
    public void notifyAdResponse(android.os.IBinder p0, android.media.tv.AdResponse p1, int p2) throws android.os.RemoteException;
    public void createMediaView(android.os.IBinder p0, android.os.IBinder p1, android.graphics.Rect p2, int p3) throws android.os.RemoteException;
    public void relayoutMediaView(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException;
    public void removeMediaView(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void registerCallback(android.media.tv.interactive.ITvInteractiveAppManagerCallback p0, int p1) throws android.os.RemoteException;
    public void unregisterCallback(android.media.tv.interactive.ITvInteractiveAppManagerCallback p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.interactive.ITvInteractiveAppManager {
        public Default() {}
        public java.util.List<android.media.tv.interactive.TvInteractiveAppServiceInfo> getTvInteractiveAppServiceList(int p0) throws android.os.RemoteException { return null; }
        public void registerAppLinkInfo(java.lang.String p0, android.media.tv.interactive.AppLinkInfo p1, int p2) throws android.os.RemoteException {}
        public void unregisterAppLinkInfo(java.lang.String p0, android.media.tv.interactive.AppLinkInfo p1, int p2) throws android.os.RemoteException {}
        public void sendAppLinkCommand(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public void startInteractiveApp(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void stopInteractiveApp(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void resetInteractiveApp(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void createBiInteractiveApp(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public void destroyBiInteractiveApp(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setTeletextAppEnabled(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void sendCurrentChannelUri(android.os.IBinder p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
        public void sendCurrentChannelLcn(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public void sendStreamVolume(android.os.IBinder p0, float p1, int p2) throws android.os.RemoteException {}
        public void sendTrackInfoList(android.os.IBinder p0, java.util.List<android.media.tv.TvTrackInfo> p1, int p2) throws android.os.RemoteException {}
        public void sendCurrentTvInputId(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void sendSigningResult(android.os.IBinder p0, java.lang.String p1, byte[] p2, int p3) throws android.os.RemoteException {}
        public void notifyError(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public void createSession(android.media.tv.interactive.ITvInteractiveAppClient p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void releaseSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void notifyTuned(android.os.IBinder p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
        public void notifyTrackSelected(android.os.IBinder p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void notifyTracksChanged(android.os.IBinder p0, java.util.List<android.media.tv.TvTrackInfo> p1, int p2) throws android.os.RemoteException {}
        public void notifyVideoAvailable(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void notifyVideoUnavailable(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public void notifyContentAllowed(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void notifyContentBlocked(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void notifySignalStrength(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public void setSurface(android.os.IBinder p0, android.view.Surface p1, int p2) throws android.os.RemoteException {}
        public void dispatchSurfaceChanged(android.os.IBinder p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void notifyBroadcastInfoResponse(android.os.IBinder p0, android.media.tv.BroadcastInfoResponse p1, int p2) throws android.os.RemoteException {}
        public void notifyAdResponse(android.os.IBinder p0, android.media.tv.AdResponse p1, int p2) throws android.os.RemoteException {}
        public void createMediaView(android.os.IBinder p0, android.os.IBinder p1, android.graphics.Rect p2, int p3) throws android.os.RemoteException {}
        public void relayoutMediaView(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
        public void removeMediaView(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void registerCallback(android.media.tv.interactive.ITvInteractiveAppManagerCallback p0, int p1) throws android.os.RemoteException {}
        public void unregisterCallback(android.media.tv.interactive.ITvInteractiveAppManagerCallback p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.interactive.ITvInteractiveAppManager {
        static final int TRANSACTION_getTvInteractiveAppServiceList = 1;
        static final int TRANSACTION_registerAppLinkInfo = 2;
        static final int TRANSACTION_unregisterAppLinkInfo = 3;
        static final int TRANSACTION_sendAppLinkCommand = 4;
        static final int TRANSACTION_startInteractiveApp = 5;
        static final int TRANSACTION_stopInteractiveApp = 6;
        static final int TRANSACTION_resetInteractiveApp = 7;
        static final int TRANSACTION_createBiInteractiveApp = 8;
        static final int TRANSACTION_destroyBiInteractiveApp = 9;
        static final int TRANSACTION_setTeletextAppEnabled = 10;
        static final int TRANSACTION_sendCurrentChannelUri = 11;
        static final int TRANSACTION_sendCurrentChannelLcn = 12;
        static final int TRANSACTION_sendStreamVolume = 13;
        static final int TRANSACTION_sendTrackInfoList = 14;
        static final int TRANSACTION_sendCurrentTvInputId = 15;
        static final int TRANSACTION_sendSigningResult = 16;
        static final int TRANSACTION_notifyError = 17;
        static final int TRANSACTION_createSession = 18;
        static final int TRANSACTION_releaseSession = 19;
        static final int TRANSACTION_notifyTuned = 20;
        static final int TRANSACTION_notifyTrackSelected = 21;
        static final int TRANSACTION_notifyTracksChanged = 22;
        static final int TRANSACTION_notifyVideoAvailable = 23;
        static final int TRANSACTION_notifyVideoUnavailable = 24;
        static final int TRANSACTION_notifyContentAllowed = 25;
        static final int TRANSACTION_notifyContentBlocked = 26;
        static final int TRANSACTION_notifySignalStrength = 27;
        static final int TRANSACTION_setSurface = 28;
        static final int TRANSACTION_dispatchSurfaceChanged = 29;
        static final int TRANSACTION_notifyBroadcastInfoResponse = 30;
        static final int TRANSACTION_notifyAdResponse = 31;
        static final int TRANSACTION_createMediaView = 32;
        static final int TRANSACTION_relayoutMediaView = 33;
        static final int TRANSACTION_removeMediaView = 34;
        static final int TRANSACTION_registerCallback = 35;
        static final int TRANSACTION_unregisterCallback = 36;
        public Stub() { super(); }
        public static android.media.tv.interactive.ITvInteractiveAppManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.interactive.ITvInteractiveAppManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.media.tv.interactive.TvInteractiveAppServiceInfo> getTvInteractiveAppServiceList(int p0) throws android.os.RemoteException { return null; }
            public void registerAppLinkInfo(java.lang.String p0, android.media.tv.interactive.AppLinkInfo p1, int p2) throws android.os.RemoteException {}
            public void unregisterAppLinkInfo(java.lang.String p0, android.media.tv.interactive.AppLinkInfo p1, int p2) throws android.os.RemoteException {}
            public void sendAppLinkCommand(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
            public void startInteractiveApp(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void stopInteractiveApp(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void resetInteractiveApp(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void createBiInteractiveApp(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
            public void destroyBiInteractiveApp(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setTeletextAppEnabled(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void sendCurrentChannelUri(android.os.IBinder p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
            public void sendCurrentChannelLcn(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
            public void sendStreamVolume(android.os.IBinder p0, float p1, int p2) throws android.os.RemoteException {}
            public void sendTrackInfoList(android.os.IBinder p0, java.util.List<android.media.tv.TvTrackInfo> p1, int p2) throws android.os.RemoteException {}
            public void sendCurrentTvInputId(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void sendSigningResult(android.os.IBinder p0, java.lang.String p1, byte[] p2, int p3) throws android.os.RemoteException {}
            public void notifyError(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
            public void createSession(android.media.tv.interactive.ITvInteractiveAppClient p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void releaseSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void notifyTuned(android.os.IBinder p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
            public void notifyTrackSelected(android.os.IBinder p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void notifyTracksChanged(android.os.IBinder p0, java.util.List<android.media.tv.TvTrackInfo> p1, int p2) throws android.os.RemoteException {}
            public void notifyVideoAvailable(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void notifyVideoUnavailable(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
            public void notifyContentAllowed(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void notifyContentBlocked(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void notifySignalStrength(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
            public void setSurface(android.os.IBinder p0, android.view.Surface p1, int p2) throws android.os.RemoteException {}
            public void dispatchSurfaceChanged(android.os.IBinder p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void notifyBroadcastInfoResponse(android.os.IBinder p0, android.media.tv.BroadcastInfoResponse p1, int p2) throws android.os.RemoteException {}
            public void notifyAdResponse(android.os.IBinder p0, android.media.tv.AdResponse p1, int p2) throws android.os.RemoteException {}
            public void createMediaView(android.os.IBinder p0, android.os.IBinder p1, android.graphics.Rect p2, int p3) throws android.os.RemoteException {}
            public void relayoutMediaView(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
            public void removeMediaView(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void registerCallback(android.media.tv.interactive.ITvInteractiveAppManagerCallback p0, int p1) throws android.os.RemoteException {}
            public void unregisterCallback(android.media.tv.interactive.ITvInteractiveAppManagerCallback p0, int p1) throws android.os.RemoteException {}
        }
    }
}
