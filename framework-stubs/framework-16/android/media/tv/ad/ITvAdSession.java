package android.media.tv.ad;

public interface ITvAdSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.ad.ITvAdSession";
    public void release() throws android.os.RemoteException;
    public void startAdService() throws android.os.RemoteException;
    public void stopAdService() throws android.os.RemoteException;
    public void resetAdService() throws android.os.RemoteException;
    public void setSurface(android.view.Surface p0) throws android.os.RemoteException;
    public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException;
    public void sendCurrentVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException;
    public void sendCurrentChannelUri(android.net.Uri p0) throws android.os.RemoteException;
    public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException;
    public void sendCurrentTvInputId(java.lang.String p0) throws android.os.RemoteException;
    public void sendSigningResult(java.lang.String p0, byte[] p1) throws android.os.RemoteException;
    public void notifyError(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void notifyTvMessage(int p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void relayoutMediaView(android.graphics.Rect p0) throws android.os.RemoteException;
    public void removeMediaView() throws android.os.RemoteException;
    public void notifyTvInputSessionData(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.ad.ITvAdSession {
        public Default() {}
        public void release() throws android.os.RemoteException {}
        public void startAdService() throws android.os.RemoteException {}
        public void stopAdService() throws android.os.RemoteException {}
        public void resetAdService() throws android.os.RemoteException {}
        public void setSurface(android.view.Surface p0) throws android.os.RemoteException {}
        public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void sendCurrentVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void sendCurrentChannelUri(android.net.Uri p0) throws android.os.RemoteException {}
        public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
        public void sendCurrentTvInputId(java.lang.String p0) throws android.os.RemoteException {}
        public void sendSigningResult(java.lang.String p0, byte[] p1) throws android.os.RemoteException {}
        public void notifyError(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void notifyTvMessage(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void relayoutMediaView(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void removeMediaView() throws android.os.RemoteException {}
        public void notifyTvInputSessionData(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ad.ITvAdSession {
        static final int TRANSACTION_release = 1;
        static final int TRANSACTION_startAdService = 2;
        static final int TRANSACTION_stopAdService = 3;
        static final int TRANSACTION_resetAdService = 4;
        static final int TRANSACTION_setSurface = 5;
        static final int TRANSACTION_dispatchSurfaceChanged = 6;
        static final int TRANSACTION_sendCurrentVideoBounds = 7;
        static final int TRANSACTION_sendCurrentChannelUri = 8;
        static final int TRANSACTION_sendTrackInfoList = 9;
        static final int TRANSACTION_sendCurrentTvInputId = 10;
        static final int TRANSACTION_sendSigningResult = 11;
        static final int TRANSACTION_notifyError = 12;
        static final int TRANSACTION_notifyTvMessage = 13;
        static final int TRANSACTION_createMediaView = 14;
        static final int TRANSACTION_relayoutMediaView = 15;
        static final int TRANSACTION_removeMediaView = 16;
        static final int TRANSACTION_notifyTvInputSessionData = 17;
        public Stub() { super(); }
        public static android.media.tv.ad.ITvAdSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.ad.ITvAdSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void release() throws android.os.RemoteException {}
            public void startAdService() throws android.os.RemoteException {}
            public void stopAdService() throws android.os.RemoteException {}
            public void resetAdService() throws android.os.RemoteException {}
            public void setSurface(android.view.Surface p0) throws android.os.RemoteException {}
            public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void sendCurrentVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void sendCurrentChannelUri(android.net.Uri p0) throws android.os.RemoteException {}
            public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
            public void sendCurrentTvInputId(java.lang.String p0) throws android.os.RemoteException {}
            public void sendSigningResult(java.lang.String p0, byte[] p1) throws android.os.RemoteException {}
            public void notifyError(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void notifyTvMessage(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void relayoutMediaView(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void removeMediaView() throws android.os.RemoteException {}
            public void notifyTvInputSessionData(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        }
    }
}
