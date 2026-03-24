package android.permission;

public interface IOnPermissionsChangeListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.permission.IOnPermissionsChangeListener";
    public void onPermissionsChanged(int p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.permission.IOnPermissionsChangeListener {
        public Default() {}
        public void onPermissionsChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.permission.IOnPermissionsChangeListener {
        static final int TRANSACTION_onPermissionsChanged = 1;
        public Stub() { super(); }
        public static android.permission.IOnPermissionsChangeListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.permission.IOnPermissionsChangeListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPermissionsChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
