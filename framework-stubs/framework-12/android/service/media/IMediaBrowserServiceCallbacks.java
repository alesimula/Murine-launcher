package android.service.media;

public interface IMediaBrowserServiceCallbacks extends android.os.IInterface {
    public void onConnect(java.lang.String p0, android.media.session.MediaSession.Token p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void onConnectFailed() throws android.os.RemoteException;
    public void onLoadChildren(java.lang.String p0, android.content.pm.ParceledListSlice p1, android.os.Bundle p2) throws android.os.RemoteException;

    public static class Default implements android.service.media.IMediaBrowserServiceCallbacks {
        public Default() {}
        public void onConnect(java.lang.String p0, android.media.session.MediaSession.Token p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void onConnectFailed() throws android.os.RemoteException {}
        public void onLoadChildren(java.lang.String p0, android.content.pm.ParceledListSlice p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.media.IMediaBrowserServiceCallbacks {
        public static final java.lang.String DESCRIPTOR = "android.service.media.IMediaBrowserServiceCallbacks";
        static final int TRANSACTION_onConnect = 1;
        static final int TRANSACTION_onConnectFailed = 2;
        static final int TRANSACTION_onLoadChildren = 3;
        public Stub() { super(); }
        public static android.service.media.IMediaBrowserServiceCallbacks asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.media.IMediaBrowserServiceCallbacks p0) { return false; }
        public static android.service.media.IMediaBrowserServiceCallbacks getDefaultImpl() { return null; }

        private static class Proxy implements android.service.media.IMediaBrowserServiceCallbacks {
            private android.os.IBinder mRemote;
            public static android.service.media.IMediaBrowserServiceCallbacks sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConnect(java.lang.String p0, android.media.session.MediaSession.Token p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void onConnectFailed() throws android.os.RemoteException {}
            public void onLoadChildren(java.lang.String p0, android.content.pm.ParceledListSlice p1, android.os.Bundle p2) throws android.os.RemoteException {}
        }
    }
}
