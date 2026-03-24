package android.media.projection;

public interface IMediaProjection extends android.os.IInterface {
    public void start(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException;
    public void stop() throws android.os.RemoteException;
    public boolean canProjectAudio() throws android.os.RemoteException;
    public boolean canProjectVideo() throws android.os.RemoteException;
    public boolean canProjectSecureVideo() throws android.os.RemoteException;
    public int applyVirtualDisplayFlags(int p0) throws android.os.RemoteException;
    public void registerCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException;
    public void unregisterCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException;

    public static class Default implements android.media.projection.IMediaProjection {
        public Default() {}
        public void start(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
        public void stop() throws android.os.RemoteException {}
        public boolean canProjectAudio() throws android.os.RemoteException { return false; }
        public boolean canProjectVideo() throws android.os.RemoteException { return false; }
        public boolean canProjectSecureVideo() throws android.os.RemoteException { return false; }
        public int applyVirtualDisplayFlags(int p0) throws android.os.RemoteException { return 0; }
        public void registerCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
        public void unregisterCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.projection.IMediaProjection {
        public static final java.lang.String DESCRIPTOR = "android.media.projection.IMediaProjection";
        static final int TRANSACTION_start = 1;
        static final int TRANSACTION_stop = 2;
        static final int TRANSACTION_canProjectAudio = 3;
        static final int TRANSACTION_canProjectVideo = 4;
        static final int TRANSACTION_canProjectSecureVideo = 5;
        static final int TRANSACTION_applyVirtualDisplayFlags = 6;
        static final int TRANSACTION_registerCallback = 7;
        static final int TRANSACTION_unregisterCallback = 8;
        public Stub() { super(); }
        public static android.media.projection.IMediaProjection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.projection.IMediaProjection p0) { return false; }
        public static android.media.projection.IMediaProjection getDefaultImpl() { return null; }

        private static class Proxy implements android.media.projection.IMediaProjection {
            private android.os.IBinder mRemote;
            public static android.media.projection.IMediaProjection sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void start(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
            public void stop() throws android.os.RemoteException {}
            public boolean canProjectAudio() throws android.os.RemoteException { return false; }
            public boolean canProjectVideo() throws android.os.RemoteException { return false; }
            public boolean canProjectSecureVideo() throws android.os.RemoteException { return false; }
            public int applyVirtualDisplayFlags(int p0) throws android.os.RemoteException { return 0; }
            public void registerCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
            public void unregisterCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
        }
    }
}
