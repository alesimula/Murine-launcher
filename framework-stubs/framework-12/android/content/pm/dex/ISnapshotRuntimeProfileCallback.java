package android.content.pm.dex;

public interface ISnapshotRuntimeProfileCallback extends android.os.IInterface {
    public void onSuccess(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public void onError(int p0) throws android.os.RemoteException;

    public static class Default implements android.content.pm.dex.ISnapshotRuntimeProfileCallback {
        public Default() {}
        public void onSuccess(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.dex.ISnapshotRuntimeProfileCallback {
        public static final java.lang.String DESCRIPTOR = "android.content.pm.dex.ISnapshotRuntimeProfileCallback";
        static final int TRANSACTION_onSuccess = 1;
        static final int TRANSACTION_onError = 2;
        public Stub() { super(); }
        public static android.content.pm.dex.ISnapshotRuntimeProfileCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.dex.ISnapshotRuntimeProfileCallback p0) { return false; }
        public static android.content.pm.dex.ISnapshotRuntimeProfileCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.dex.ISnapshotRuntimeProfileCallback {
            private android.os.IBinder mRemote;
            public static android.content.pm.dex.ISnapshotRuntimeProfileCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
            public void onError(int p0) throws android.os.RemoteException {}
        }
    }
}
