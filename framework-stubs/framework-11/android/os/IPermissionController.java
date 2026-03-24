package android.os;

public interface IPermissionController extends android.os.IInterface {
    public boolean checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public int noteOp(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String[] getPackagesForUid(int p0) throws android.os.RemoteException;
    public boolean isRuntimePermission(java.lang.String p0) throws android.os.RemoteException;
    public int getPackageUid(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.os.IPermissionController {
        public Default() {}
        public boolean checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public int noteOp(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public java.lang.String[] getPackagesForUid(int p0) throws android.os.RemoteException { return null; }
        public boolean isRuntimePermission(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int getPackageUid(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IPermissionController {
        private static final java.lang.String DESCRIPTOR = "android.os.IPermissionController";
        static final int TRANSACTION_checkPermission = 1;
        static final int TRANSACTION_noteOp = 2;
        static final int TRANSACTION_getPackagesForUid = 3;
        static final int TRANSACTION_isRuntimePermission = 4;
        static final int TRANSACTION_getPackageUid = 5;
        public Stub() { super(); }
        public static android.os.IPermissionController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IPermissionController p0) { return false; }
        public static android.os.IPermissionController getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IPermissionController {
            private android.os.IBinder mRemote;
            public static android.os.IPermissionController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public int noteOp(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public java.lang.String[] getPackagesForUid(int p0) throws android.os.RemoteException { return null; }
            public boolean isRuntimePermission(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int getPackageUid(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        }
    }
}
