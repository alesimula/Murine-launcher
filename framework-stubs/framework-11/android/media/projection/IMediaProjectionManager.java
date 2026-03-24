package android.media.projection;

public interface IMediaProjectionManager extends android.os.IInterface {
    public boolean hasProjectionPermission(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.media.projection.IMediaProjection createProjection(int p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public boolean isValidMediaProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException;
    public android.media.projection.MediaProjectionInfo getActiveProjectionInfo() throws android.os.RemoteException;
    public void stopActiveProjection() throws android.os.RemoteException;
    public void addCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException;
    public void removeCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException;

    public static class Default implements android.media.projection.IMediaProjectionManager {
        public Default() {}
        public boolean hasProjectionPermission(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public android.media.projection.IMediaProjection createProjection(int p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
        public boolean isValidMediaProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException { return false; }
        public android.media.projection.MediaProjectionInfo getActiveProjectionInfo() throws android.os.RemoteException { return null; }
        public void stopActiveProjection() throws android.os.RemoteException {}
        public void addCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException {}
        public void removeCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.projection.IMediaProjectionManager {
        private static final java.lang.String DESCRIPTOR = "android.media.projection.IMediaProjectionManager";
        static final int TRANSACTION_hasProjectionPermission = 1;
        static final int TRANSACTION_createProjection = 2;
        static final int TRANSACTION_isValidMediaProjection = 3;
        static final int TRANSACTION_getActiveProjectionInfo = 4;
        static final int TRANSACTION_stopActiveProjection = 5;
        static final int TRANSACTION_addCallback = 6;
        static final int TRANSACTION_removeCallback = 7;
        public Stub() { super(); }
        public static android.media.projection.IMediaProjectionManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.projection.IMediaProjectionManager p0) { return false; }
        public static android.media.projection.IMediaProjectionManager getDefaultImpl() { return null; }

        private static class Proxy implements android.media.projection.IMediaProjectionManager {
            private android.os.IBinder mRemote;
            public static android.media.projection.IMediaProjectionManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean hasProjectionPermission(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public android.media.projection.IMediaProjection createProjection(int p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
            public boolean isValidMediaProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException { return false; }
            public android.media.projection.MediaProjectionInfo getActiveProjectionInfo() throws android.os.RemoteException { return null; }
            public void stopActiveProjection() throws android.os.RemoteException {}
            public void addCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException {}
            public void removeCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException {}
        }
    }
}
