package android.media;

public interface IRemoteDisplayProvider extends android.os.IInterface {
    public void setCallback(android.media.IRemoteDisplayCallback p0) throws android.os.RemoteException;
    public void setDiscoveryMode(int p0) throws android.os.RemoteException;
    public void connect(java.lang.String p0) throws android.os.RemoteException;
    public void disconnect(java.lang.String p0) throws android.os.RemoteException;
    public void setVolume(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void adjustVolume(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.IRemoteDisplayProvider {
        private static final java.lang.String DESCRIPTOR = "android.media.IRemoteDisplayProvider";
        static final int TRANSACTION_setCallback = 1;
        static final int TRANSACTION_setDiscoveryMode = 2;
        static final int TRANSACTION_connect = 3;
        static final int TRANSACTION_disconnect = 4;
        static final int TRANSACTION_setVolume = 5;
        static final int TRANSACTION_adjustVolume = 6;
        public Stub() { super(); }
        public static android.media.IRemoteDisplayProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IRemoteDisplayProvider p0) { return false; }
        public static android.media.IRemoteDisplayProvider getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IRemoteDisplayProvider {
            private android.os.IBinder mRemote;
            public static android.media.IRemoteDisplayProvider sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setCallback(android.media.IRemoteDisplayCallback p0) throws android.os.RemoteException {}
            public void setDiscoveryMode(int p0) throws android.os.RemoteException {}
            public void connect(java.lang.String p0) throws android.os.RemoteException {}
            public void disconnect(java.lang.String p0) throws android.os.RemoteException {}
            public void setVolume(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void adjustVolume(java.lang.String p0, int p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.media.IRemoteDisplayProvider {
        public Default() {}
        public void setCallback(android.media.IRemoteDisplayCallback p0) throws android.os.RemoteException {}
        public void setDiscoveryMode(int p0) throws android.os.RemoteException {}
        public void connect(java.lang.String p0) throws android.os.RemoteException {}
        public void disconnect(java.lang.String p0) throws android.os.RemoteException {}
        public void setVolume(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void adjustVolume(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
