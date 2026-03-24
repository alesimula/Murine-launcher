package android.permission;

public interface IOnPermissionsChangeListener extends android.os.IInterface {
    public void onPermissionsChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.permission.IOnPermissionsChangeListener {
        public Default() {}
        public void onPermissionsChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.permission.IOnPermissionsChangeListener {
        private static final java.lang.String DESCRIPTOR = "android.permission.IOnPermissionsChangeListener";
        static final int TRANSACTION_onPermissionsChanged = 1;
        public Stub() { super(); }
        public static android.permission.IOnPermissionsChangeListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.permission.IOnPermissionsChangeListener p0) { return false; }
        public static android.permission.IOnPermissionsChangeListener getDefaultImpl() { return null; }

        private static class Proxy implements android.permission.IOnPermissionsChangeListener {
            private android.os.IBinder mRemote;
            public static android.permission.IOnPermissionsChangeListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPermissionsChanged(int p0) throws android.os.RemoteException {}
        }
    }
}
