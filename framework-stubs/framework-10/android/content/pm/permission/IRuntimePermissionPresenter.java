package android.content.pm.permission;

public interface IRuntimePermissionPresenter extends android.os.IInterface {
    public void getAppPermissions(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.pm.permission.IRuntimePermissionPresenter {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.permission.IRuntimePermissionPresenter";
        static final int TRANSACTION_getAppPermissions = 1;
        public Stub() { super(); }
        public static android.content.pm.permission.IRuntimePermissionPresenter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.permission.IRuntimePermissionPresenter p0) { return false; }
        public static android.content.pm.permission.IRuntimePermissionPresenter getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.permission.IRuntimePermissionPresenter {
            private android.os.IBinder mRemote;
            public static android.content.pm.permission.IRuntimePermissionPresenter sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getAppPermissions(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.content.pm.permission.IRuntimePermissionPresenter {
        public Default() {}
        public void getAppPermissions(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
