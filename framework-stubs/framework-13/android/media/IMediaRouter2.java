package android.media;

public interface IMediaRouter2 extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IMediaRouter2";
    public void notifyRouterRegistered(java.util.List<android.media.MediaRoute2Info> p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException;
    public void notifyRoutesAdded(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException;
    public void notifyRoutesRemoved(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException;
    public void notifyRoutesChanged(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException;
    public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException;
    public void notifySessionInfoChanged(android.media.RoutingSessionInfo p0) throws android.os.RemoteException;
    public void notifySessionReleased(android.media.RoutingSessionInfo p0) throws android.os.RemoteException;
    public void requestCreateSessionByManager(long p0, android.media.RoutingSessionInfo p1, android.media.MediaRoute2Info p2) throws android.os.RemoteException;

    public static class Default implements android.media.IMediaRouter2 {
        public Default() {}
        public void notifyRouterRegistered(java.util.List<android.media.MediaRoute2Info> p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException {}
        public void notifyRoutesAdded(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
        public void notifyRoutesRemoved(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
        public void notifyRoutesChanged(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
        public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException {}
        public void notifySessionInfoChanged(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
        public void notifySessionReleased(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
        public void requestCreateSessionByManager(long p0, android.media.RoutingSessionInfo p1, android.media.MediaRoute2Info p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IMediaRouter2 {
        static final int TRANSACTION_notifyRouterRegistered = 1;
        static final int TRANSACTION_notifyRoutesAdded = 2;
        static final int TRANSACTION_notifyRoutesRemoved = 3;
        static final int TRANSACTION_notifyRoutesChanged = 4;
        static final int TRANSACTION_notifySessionCreated = 5;
        static final int TRANSACTION_notifySessionInfoChanged = 6;
        static final int TRANSACTION_notifySessionReleased = 7;
        static final int TRANSACTION_requestCreateSessionByManager = 8;
        public Stub() { super(); }
        public static android.media.IMediaRouter2 asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.IMediaRouter2 {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyRouterRegistered(java.util.List<android.media.MediaRoute2Info> p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException {}
            public void notifyRoutesAdded(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
            public void notifyRoutesRemoved(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
            public void notifyRoutesChanged(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
            public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException {}
            public void notifySessionInfoChanged(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
            public void notifySessionReleased(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
            public void requestCreateSessionByManager(long p0, android.media.RoutingSessionInfo p1, android.media.MediaRoute2Info p2) throws android.os.RemoteException {}
        }
    }
}
