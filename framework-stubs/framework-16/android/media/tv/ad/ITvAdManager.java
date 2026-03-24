package android.media.tv.ad;

public interface ITvAdManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.ad.ITvAdManager";
    public java.util.List<android.media.tv.ad.TvAdServiceInfo> getTvAdServiceList(int p0) throws android.os.RemoteException;
    public void sendAppLinkCommand(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public void createSession(android.media.tv.ad.ITvAdClient p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException;
    public void releaseSession(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void startAdService(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void stopAdService(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void resetAdService(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void setSurface(android.os.IBinder p0, android.view.Surface p1, int p2) throws android.os.RemoteException;
    public void dispatchSurfaceChanged(android.os.IBinder p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void sendCurrentVideoBounds(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException;
    public void sendCurrentChannelUri(android.os.IBinder p0, android.net.Uri p1, int p2) throws android.os.RemoteException;
    public void sendTrackInfoList(android.os.IBinder p0, java.util.List<android.media.tv.TvTrackInfo> p1, int p2) throws android.os.RemoteException;
    public void sendCurrentTvInputId(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void sendSigningResult(android.os.IBinder p0, java.lang.String p1, byte[] p2, int p3) throws android.os.RemoteException;
    public void notifyError(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;
    public void notifyTvMessage(android.os.IBinder p0, int p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;
    public void registerCallback(android.media.tv.ad.ITvAdManagerCallback p0, int p1) throws android.os.RemoteException;
    public void unregisterCallback(android.media.tv.ad.ITvAdManagerCallback p0, int p1) throws android.os.RemoteException;
    public void createMediaView(android.os.IBinder p0, android.os.IBinder p1, android.graphics.Rect p2, int p3) throws android.os.RemoteException;
    public void relayoutMediaView(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException;
    public void removeMediaView(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void notifyTvInputSessionData(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.media.tv.ad.ITvAdManager {
        public Default() {}
        public java.util.List<android.media.tv.ad.TvAdServiceInfo> getTvAdServiceList(int p0) throws android.os.RemoteException { return null; }
        public void sendAppLinkCommand(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public void createSession(android.media.tv.ad.ITvAdClient p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
        public void releaseSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void startAdService(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void stopAdService(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void resetAdService(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void setSurface(android.os.IBinder p0, android.view.Surface p1, int p2) throws android.os.RemoteException {}
        public void dispatchSurfaceChanged(android.os.IBinder p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void sendCurrentVideoBounds(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
        public void sendCurrentChannelUri(android.os.IBinder p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
        public void sendTrackInfoList(android.os.IBinder p0, java.util.List<android.media.tv.TvTrackInfo> p1, int p2) throws android.os.RemoteException {}
        public void sendCurrentTvInputId(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void sendSigningResult(android.os.IBinder p0, java.lang.String p1, byte[] p2, int p3) throws android.os.RemoteException {}
        public void notifyError(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public void notifyTvMessage(android.os.IBinder p0, int p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public void registerCallback(android.media.tv.ad.ITvAdManagerCallback p0, int p1) throws android.os.RemoteException {}
        public void unregisterCallback(android.media.tv.ad.ITvAdManagerCallback p0, int p1) throws android.os.RemoteException {}
        public void createMediaView(android.os.IBinder p0, android.os.IBinder p1, android.graphics.Rect p2, int p3) throws android.os.RemoteException {}
        public void relayoutMediaView(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
        public void removeMediaView(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void notifyTvInputSessionData(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ad.ITvAdManager {
        static final int TRANSACTION_getTvAdServiceList = 1;
        static final int TRANSACTION_sendAppLinkCommand = 2;
        static final int TRANSACTION_createSession = 3;
        static final int TRANSACTION_releaseSession = 4;
        static final int TRANSACTION_startAdService = 5;
        static final int TRANSACTION_stopAdService = 6;
        static final int TRANSACTION_resetAdService = 7;
        static final int TRANSACTION_setSurface = 8;
        static final int TRANSACTION_dispatchSurfaceChanged = 9;
        static final int TRANSACTION_sendCurrentVideoBounds = 10;
        static final int TRANSACTION_sendCurrentChannelUri = 11;
        static final int TRANSACTION_sendTrackInfoList = 12;
        static final int TRANSACTION_sendCurrentTvInputId = 13;
        static final int TRANSACTION_sendSigningResult = 14;
        static final int TRANSACTION_notifyError = 15;
        static final int TRANSACTION_notifyTvMessage = 16;
        static final int TRANSACTION_registerCallback = 17;
        static final int TRANSACTION_unregisterCallback = 18;
        static final int TRANSACTION_createMediaView = 19;
        static final int TRANSACTION_relayoutMediaView = 20;
        static final int TRANSACTION_removeMediaView = 21;
        static final int TRANSACTION_notifyTvInputSessionData = 22;
        public Stub() { super(); }
        public static android.media.tv.ad.ITvAdManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.ad.ITvAdManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.media.tv.ad.TvAdServiceInfo> getTvAdServiceList(int p0) throws android.os.RemoteException { return null; }
            public void sendAppLinkCommand(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
            public void createSession(android.media.tv.ad.ITvAdClient p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
            public void releaseSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void startAdService(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void stopAdService(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void resetAdService(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void setSurface(android.os.IBinder p0, android.view.Surface p1, int p2) throws android.os.RemoteException {}
            public void dispatchSurfaceChanged(android.os.IBinder p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void sendCurrentVideoBounds(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
            public void sendCurrentChannelUri(android.os.IBinder p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
            public void sendTrackInfoList(android.os.IBinder p0, java.util.List<android.media.tv.TvTrackInfo> p1, int p2) throws android.os.RemoteException {}
            public void sendCurrentTvInputId(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void sendSigningResult(android.os.IBinder p0, java.lang.String p1, byte[] p2, int p3) throws android.os.RemoteException {}
            public void notifyError(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
            public void notifyTvMessage(android.os.IBinder p0, int p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
            public void registerCallback(android.media.tv.ad.ITvAdManagerCallback p0, int p1) throws android.os.RemoteException {}
            public void unregisterCallback(android.media.tv.ad.ITvAdManagerCallback p0, int p1) throws android.os.RemoteException {}
            public void createMediaView(android.os.IBinder p0, android.os.IBinder p1, android.graphics.Rect p2, int p3) throws android.os.RemoteException {}
            public void relayoutMediaView(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
            public void removeMediaView(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void notifyTvInputSessionData(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        }
    }
}
