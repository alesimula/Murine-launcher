package android.companion;

public interface IFindDeviceCallback extends android.os.IInterface {
    public void onSuccess(android.app.PendingIntent p0) throws android.os.RemoteException;
    public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException;

    public static class Default implements android.companion.IFindDeviceCallback {
        public Default() {}
        public void onSuccess(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.IFindDeviceCallback {
        private static final java.lang.String DESCRIPTOR = "android.companion.IFindDeviceCallback";
        static final int TRANSACTION_onSuccess = 1;
        static final int TRANSACTION_onFailure = 2;
        public Stub() { super(); }
        public static android.companion.IFindDeviceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.companion.IFindDeviceCallback p0) { return false; }
        public static android.companion.IFindDeviceCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.companion.IFindDeviceCallback {
            private android.os.IBinder mRemote;
            public static android.companion.IFindDeviceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess(android.app.PendingIntent p0) throws android.os.RemoteException {}
            public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException {}
        }
    }
}
