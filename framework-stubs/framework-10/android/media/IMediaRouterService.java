package android.media;

public interface IMediaRouterService extends android.os.IInterface {
    public void registerClientAsUser(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void unregisterClient(android.media.IMediaRouterClient p0) throws android.os.RemoteException;
    public void registerClientGroupId(android.media.IMediaRouterClient p0, java.lang.String p1) throws android.os.RemoteException;
    public android.media.MediaRouterClientState getState(android.media.IMediaRouterClient p0) throws android.os.RemoteException;
    public boolean isPlaybackActive(android.media.IMediaRouterClient p0) throws android.os.RemoteException;
    public void setDiscoveryRequest(android.media.IMediaRouterClient p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setSelectedRoute(android.media.IMediaRouterClient p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void requestSetVolume(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void requestUpdateVolume(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.IMediaRouterService {
        private static final java.lang.String DESCRIPTOR = "android.media.IMediaRouterService";
        static final int TRANSACTION_registerClientAsUser = 1;
        static final int TRANSACTION_unregisterClient = 2;
        static final int TRANSACTION_registerClientGroupId = 3;
        static final int TRANSACTION_getState = 4;
        static final int TRANSACTION_isPlaybackActive = 5;
        static final int TRANSACTION_setDiscoveryRequest = 6;
        static final int TRANSACTION_setSelectedRoute = 7;
        static final int TRANSACTION_requestSetVolume = 8;
        static final int TRANSACTION_requestUpdateVolume = 9;
        public Stub() { super(); }
        public static android.media.IMediaRouterService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IMediaRouterService p0) { return false; }
        public static android.media.IMediaRouterService getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IMediaRouterService {
            private android.os.IBinder mRemote;
            public static android.media.IMediaRouterService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerClientAsUser(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void unregisterClient(android.media.IMediaRouterClient p0) throws android.os.RemoteException {}
            public void registerClientGroupId(android.media.IMediaRouterClient p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.media.MediaRouterClientState getState(android.media.IMediaRouterClient p0) throws android.os.RemoteException { return null; }
            public boolean isPlaybackActive(android.media.IMediaRouterClient p0) throws android.os.RemoteException { return false; }
            public void setDiscoveryRequest(android.media.IMediaRouterClient p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setSelectedRoute(android.media.IMediaRouterClient p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void requestSetVolume(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void requestUpdateVolume(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.media.IMediaRouterService {
        public Default() {}
        public void registerClientAsUser(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void unregisterClient(android.media.IMediaRouterClient p0) throws android.os.RemoteException {}
        public void registerClientGroupId(android.media.IMediaRouterClient p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.media.MediaRouterClientState getState(android.media.IMediaRouterClient p0) throws android.os.RemoteException { return null; }
        public boolean isPlaybackActive(android.media.IMediaRouterClient p0) throws android.os.RemoteException { return false; }
        public void setDiscoveryRequest(android.media.IMediaRouterClient p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setSelectedRoute(android.media.IMediaRouterClient p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void requestSetVolume(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void requestUpdateVolume(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
