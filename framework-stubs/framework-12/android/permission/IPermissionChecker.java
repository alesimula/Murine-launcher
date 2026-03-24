package android.permission;

public interface IPermissionChecker extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final int PERMISSION_GRANTED = 0;
    public static final int PERMISSION_SOFT_DENIED = 1;
    public static final int PERMISSION_HARD_DENIED = 2;
    public int checkPermission(java.lang.String p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4, boolean p5, int p6) throws android.os.RemoteException;
    public void finishDataDelivery(int p0, android.content.AttributionSourceState p1, boolean p2) throws android.os.RemoteException;
    public int checkOp(int p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException;

    public static class Default implements android.permission.IPermissionChecker {
        public Default() {}
        public int checkPermission(java.lang.String p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4, boolean p5, int p6) throws android.os.RemoteException { return 0; }
        public void finishDataDelivery(int p0, android.content.AttributionSourceState p1, boolean p2) throws android.os.RemoteException {}
        public int checkOp(int p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.permission.IPermissionChecker {
        static final int TRANSACTION_checkPermission = 1;
        static final int TRANSACTION_finishDataDelivery = 2;
        static final int TRANSACTION_checkOp = 3;
        public Stub() { super(); }
        public static android.permission.IPermissionChecker asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.permission.IPermissionChecker p0) { return false; }
        public static android.permission.IPermissionChecker getDefaultImpl() { return null; }

        private static class Proxy implements android.permission.IPermissionChecker {
            private android.os.IBinder mRemote;
            public static android.permission.IPermissionChecker sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int checkPermission(java.lang.String p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4, boolean p5, int p6) throws android.os.RemoteException { return 0; }
            public void finishDataDelivery(int p0, android.content.AttributionSourceState p1, boolean p2) throws android.os.RemoteException {}
            public int checkOp(int p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException { return 0; }
        }
    }
}
