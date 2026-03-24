package android.media.projection;

public interface IMediaProjectionWatcherCallback extends android.os.IInterface {
    public void onStart(android.media.projection.MediaProjectionInfo p0) throws android.os.RemoteException;
    public void onStop(android.media.projection.MediaProjectionInfo p0) throws android.os.RemoteException;

    public static class Default implements android.media.projection.IMediaProjectionWatcherCallback {
        public Default() {}
        public void onStart(android.media.projection.MediaProjectionInfo p0) throws android.os.RemoteException {}
        public void onStop(android.media.projection.MediaProjectionInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.projection.IMediaProjectionWatcherCallback {
        public static final java.lang.String DESCRIPTOR = "android.media.projection.IMediaProjectionWatcherCallback";
        static final int TRANSACTION_onStart = 1;
        static final int TRANSACTION_onStop = 2;
        public Stub() { super(); }
        public static android.media.projection.IMediaProjectionWatcherCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.projection.IMediaProjectionWatcherCallback p0) { return false; }
        public static android.media.projection.IMediaProjectionWatcherCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.projection.IMediaProjectionWatcherCallback {
            private android.os.IBinder mRemote;
            public static android.media.projection.IMediaProjectionWatcherCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStart(android.media.projection.MediaProjectionInfo p0) throws android.os.RemoteException {}
            public void onStop(android.media.projection.MediaProjectionInfo p0) throws android.os.RemoteException {}
        }
    }
}
