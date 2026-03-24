package android.app.backup;

public interface ISelectBackupTransportCallback extends android.os.IInterface {
    public void onSuccess(java.lang.String p0) throws android.os.RemoteException;
    public void onFailure(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.backup.ISelectBackupTransportCallback {
        private static final java.lang.String DESCRIPTOR = "android.app.backup.ISelectBackupTransportCallback";
        static final int TRANSACTION_onSuccess = 1;
        static final int TRANSACTION_onFailure = 2;
        public Stub() { super(); }
        public static android.app.backup.ISelectBackupTransportCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.backup.ISelectBackupTransportCallback p0) { return false; }
        public static android.app.backup.ISelectBackupTransportCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.app.backup.ISelectBackupTransportCallback {
            private android.os.IBinder mRemote;
            public static android.app.backup.ISelectBackupTransportCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess(java.lang.String p0) throws android.os.RemoteException {}
            public void onFailure(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.backup.ISelectBackupTransportCallback {
        public Default() {}
        public void onSuccess(java.lang.String p0) throws android.os.RemoteException {}
        public void onFailure(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
