package android.media.projection;

public interface IMediaProjectionCallback extends android.os.IInterface {
    public void onStop() throws android.os.RemoteException;

    public static class Default implements android.media.projection.IMediaProjectionCallback {
        public Default() {}
        public void onStop() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.projection.IMediaProjectionCallback {
        public static final java.lang.String DESCRIPTOR = "android.media.projection.IMediaProjectionCallback";
        static final int TRANSACTION_onStop = 1;
        public Stub() { super(); }
        public static android.media.projection.IMediaProjectionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.projection.IMediaProjectionCallback p0) { return false; }
        public static android.media.projection.IMediaProjectionCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.projection.IMediaProjectionCallback {
            private android.os.IBinder mRemote;
            public static android.media.projection.IMediaProjectionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStop() throws android.os.RemoteException {}
        }
    }
}
