package android.media;

public interface IMediaRoute2ProviderServiceCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IMediaRoute2ProviderServiceCallback";
    public void notifyProviderUpdated(android.media.MediaRoute2ProviderInfo p0) throws android.os.RemoteException;
    public void notifySessionCreated(long p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException;
    public void notifySessionsUpdated(java.util.List<android.media.RoutingSessionInfo> p0) throws android.os.RemoteException;
    public void notifySessionReleased(android.media.RoutingSessionInfo p0) throws android.os.RemoteException;
    public void notifyRequestFailed(long p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.IMediaRoute2ProviderServiceCallback {
        public Default() {}
        public void notifyProviderUpdated(android.media.MediaRoute2ProviderInfo p0) throws android.os.RemoteException {}
        public void notifySessionCreated(long p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException {}
        public void notifySessionsUpdated(java.util.List<android.media.RoutingSessionInfo> p0) throws android.os.RemoteException {}
        public void notifySessionReleased(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
        public void notifyRequestFailed(long p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IMediaRoute2ProviderServiceCallback {
        static final int TRANSACTION_notifyProviderUpdated = 1;
        static final int TRANSACTION_notifySessionCreated = 2;
        static final int TRANSACTION_notifySessionsUpdated = 3;
        static final int TRANSACTION_notifySessionReleased = 4;
        static final int TRANSACTION_notifyRequestFailed = 5;
        public Stub() { super(); }
        public static android.media.IMediaRoute2ProviderServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IMediaRoute2ProviderServiceCallback p0) { return false; }
        public static android.media.IMediaRoute2ProviderServiceCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IMediaRoute2ProviderServiceCallback {
            private android.os.IBinder mRemote;
            public static android.media.IMediaRoute2ProviderServiceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyProviderUpdated(android.media.MediaRoute2ProviderInfo p0) throws android.os.RemoteException {}
            public void notifySessionCreated(long p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException {}
            public void notifySessionsUpdated(java.util.List<android.media.RoutingSessionInfo> p0) throws android.os.RemoteException {}
            public void notifySessionReleased(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
            public void notifyRequestFailed(long p0, int p1) throws android.os.RemoteException {}
        }
    }
}
