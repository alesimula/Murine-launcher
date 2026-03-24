package android.app;

public interface IUriGrantsManager extends android.os.IInterface {
    public void takePersistableUriPermission(android.net.Uri p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void releasePersistableUriPermission(android.net.Uri p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void grantUriPermissionFromOwner(android.os.IBinder p0, int p1, java.lang.String p2, android.net.Uri p3, int p4, int p5, int p6) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getGrantedUriPermissions(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void clearGrantedUriPermissions(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getUriPermissions(java.lang.String p0, boolean p1, boolean p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.IUriGrantsManager {
        private static final java.lang.String DESCRIPTOR = "android.app.IUriGrantsManager";
        static final int TRANSACTION_takePersistableUriPermission = 1;
        static final int TRANSACTION_releasePersistableUriPermission = 2;
        static final int TRANSACTION_grantUriPermissionFromOwner = 3;
        static final int TRANSACTION_getGrantedUriPermissions = 4;
        static final int TRANSACTION_clearGrantedUriPermissions = 5;
        static final int TRANSACTION_getUriPermissions = 6;
        public Stub() { super(); }
        public static android.app.IUriGrantsManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IUriGrantsManager p0) { return false; }
        public static android.app.IUriGrantsManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IUriGrantsManager {
            private android.os.IBinder mRemote;
            public static android.app.IUriGrantsManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void takePersistableUriPermission(android.net.Uri p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void releasePersistableUriPermission(android.net.Uri p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void grantUriPermissionFromOwner(android.os.IBinder p0, int p1, java.lang.String p2, android.net.Uri p3, int p4, int p5, int p6) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getGrantedUriPermissions(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void clearGrantedUriPermissions(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getUriPermissions(java.lang.String p0, boolean p1, boolean p2) throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.app.IUriGrantsManager {
        public Default() {}
        public void takePersistableUriPermission(android.net.Uri p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void releasePersistableUriPermission(android.net.Uri p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void grantUriPermissionFromOwner(android.os.IBinder p0, int p1, java.lang.String p2, android.net.Uri p3, int p4, int p5, int p6) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getGrantedUriPermissions(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void clearGrantedUriPermissions(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getUriPermissions(java.lang.String p0, boolean p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
