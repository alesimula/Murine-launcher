package android.media.tv.ad;

public interface ITvAdClient extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.ad.ITvAdClient";
    public void onSessionCreated(java.lang.String p0, android.os.IBinder p1, android.view.InputChannel p2, int p3) throws android.os.RemoteException;
    public void onSessionReleased(int p0) throws android.os.RemoteException;
    public void onLayoutSurface(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void onRequestCurrentVideoBounds(int p0) throws android.os.RemoteException;
    public void onRequestCurrentChannelUri(int p0) throws android.os.RemoteException;
    public void onRequestTrackInfoList(int p0) throws android.os.RemoteException;
    public void onRequestCurrentTvInputId(int p0) throws android.os.RemoteException;
    public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException;
    public void onTvAdSessionData(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.media.tv.ad.ITvAdClient {
        public Default() {}
        public void onSessionCreated(java.lang.String p0, android.os.IBinder p1, android.view.InputChannel p2, int p3) throws android.os.RemoteException {}
        public void onSessionReleased(int p0) throws android.os.RemoteException {}
        public void onLayoutSurface(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void onRequestCurrentVideoBounds(int p0) throws android.os.RemoteException {}
        public void onRequestCurrentChannelUri(int p0) throws android.os.RemoteException {}
        public void onRequestTrackInfoList(int p0) throws android.os.RemoteException {}
        public void onRequestCurrentTvInputId(int p0) throws android.os.RemoteException {}
        public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException {}
        public void onTvAdSessionData(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ad.ITvAdClient {
        static final int TRANSACTION_onSessionCreated = 1;
        static final int TRANSACTION_onSessionReleased = 2;
        static final int TRANSACTION_onLayoutSurface = 3;
        static final int TRANSACTION_onRequestCurrentVideoBounds = 4;
        static final int TRANSACTION_onRequestCurrentChannelUri = 5;
        static final int TRANSACTION_onRequestTrackInfoList = 6;
        static final int TRANSACTION_onRequestCurrentTvInputId = 7;
        static final int TRANSACTION_onRequestSigning = 8;
        static final int TRANSACTION_onTvAdSessionData = 9;
        public Stub() { super(); }
        public static android.media.tv.ad.ITvAdClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.ad.ITvAdClient {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSessionCreated(java.lang.String p0, android.os.IBinder p1, android.view.InputChannel p2, int p3) throws android.os.RemoteException {}
            public void onSessionReleased(int p0) throws android.os.RemoteException {}
            public void onLayoutSurface(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void onRequestCurrentVideoBounds(int p0) throws android.os.RemoteException {}
            public void onRequestCurrentChannelUri(int p0) throws android.os.RemoteException {}
            public void onRequestTrackInfoList(int p0) throws android.os.RemoteException {}
            public void onRequestCurrentTvInputId(int p0) throws android.os.RemoteException {}
            public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException {}
            public void onTvAdSessionData(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        }
    }
}
