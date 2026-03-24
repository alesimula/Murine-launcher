package android.media;

public interface IMediaRouter2Manager extends android.os.IInterface {
    public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException;
    public void notifySessionUpdated(android.media.RoutingSessionInfo p0) throws android.os.RemoteException;
    public void notifySessionReleased(android.media.RoutingSessionInfo p0) throws android.os.RemoteException;
    public void notifyPreferredFeaturesChanged(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public void notifyRoutesAdded(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException;
    public void notifyRoutesRemoved(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException;
    public void notifyRoutesChanged(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException;
    public void notifyRequestFailed(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.IMediaRouter2Manager {
        public Default() {}
        public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException {}
        public void notifySessionUpdated(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
        public void notifySessionReleased(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
        public void notifyPreferredFeaturesChanged(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public void notifyRoutesAdded(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
        public void notifyRoutesRemoved(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
        public void notifyRoutesChanged(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
        public void notifyRequestFailed(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IMediaRouter2Manager {
        private static final java.lang.String DESCRIPTOR = "android.media.IMediaRouter2Manager";
        static final int TRANSACTION_notifySessionCreated = 1;
        static final int TRANSACTION_notifySessionUpdated = 2;
        static final int TRANSACTION_notifySessionReleased = 3;
        static final int TRANSACTION_notifyPreferredFeaturesChanged = 4;
        static final int TRANSACTION_notifyRoutesAdded = 5;
        static final int TRANSACTION_notifyRoutesRemoved = 6;
        static final int TRANSACTION_notifyRoutesChanged = 7;
        static final int TRANSACTION_notifyRequestFailed = 8;
        public Stub() { super(); }
        public static android.media.IMediaRouter2Manager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IMediaRouter2Manager p0) { return false; }
        public static android.media.IMediaRouter2Manager getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IMediaRouter2Manager {
            private android.os.IBinder mRemote;
            public static android.media.IMediaRouter2Manager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException {}
            public void notifySessionUpdated(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
            public void notifySessionReleased(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
            public void notifyPreferredFeaturesChanged(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public void notifyRoutesAdded(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
            public void notifyRoutesRemoved(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
            public void notifyRoutesChanged(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
            public void notifyRequestFailed(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
