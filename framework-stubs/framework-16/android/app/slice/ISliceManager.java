package android.app.slice;

public interface ISliceManager extends android.os.IInterface {
    public void pinSlice(java.lang.String p0, android.net.Uri p1, android.app.slice.SliceSpec[] p2, android.os.IBinder p3) throws android.os.RemoteException;
    public void unpinSlice(java.lang.String p0, android.net.Uri p1, android.os.IBinder p2) throws android.os.RemoteException;
    public boolean hasSliceAccess(java.lang.String p0) throws android.os.RemoteException;
    public android.app.slice.SliceSpec[] getPinnedSpecs(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException;
    public android.net.Uri[] getPinnedSlices(java.lang.String p0) throws android.os.RemoteException;
    public byte[] getBackupPayload(int p0) throws android.os.RemoteException;
    public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException;
    public void grantSlicePermission(java.lang.String p0, java.lang.String p1, android.net.Uri p2) throws android.os.RemoteException;
    public void revokeSlicePermission(java.lang.String p0, java.lang.String p1, android.net.Uri p2) throws android.os.RemoteException;
    public int checkSlicePermission(android.net.Uri p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException;
    public void grantPermissionFromUser(android.net.Uri p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;

    public static class Default implements android.app.slice.ISliceManager {
        public Default() {}
        public void pinSlice(java.lang.String p0, android.net.Uri p1, android.app.slice.SliceSpec[] p2, android.os.IBinder p3) throws android.os.RemoteException {}
        public void unpinSlice(java.lang.String p0, android.net.Uri p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public boolean hasSliceAccess(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.app.slice.SliceSpec[] getPinnedSpecs(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.net.Uri[] getPinnedSlices(java.lang.String p0) throws android.os.RemoteException { return null; }
        public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
        public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException {}
        public void grantSlicePermission(java.lang.String p0, java.lang.String p1, android.net.Uri p2) throws android.os.RemoteException {}
        public void revokeSlicePermission(java.lang.String p0, java.lang.String p1, android.net.Uri p2) throws android.os.RemoteException {}
        public int checkSlicePermission(android.net.Uri p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException { return 0; }
        public void grantPermissionFromUser(android.net.Uri p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.slice.ISliceManager {
        public static final java.lang.String DESCRIPTOR = "android.app.slice.ISliceManager";
        static final int TRANSACTION_pinSlice = 1;
        static final int TRANSACTION_unpinSlice = 2;
        static final int TRANSACTION_hasSliceAccess = 3;
        static final int TRANSACTION_getPinnedSpecs = 4;
        static final int TRANSACTION_getPinnedSlices = 5;
        static final int TRANSACTION_getBackupPayload = 6;
        static final int TRANSACTION_applyRestore = 7;
        static final int TRANSACTION_grantSlicePermission = 8;
        static final int TRANSACTION_revokeSlicePermission = 9;
        static final int TRANSACTION_checkSlicePermission = 10;
        static final int TRANSACTION_grantPermissionFromUser = 11;
        public Stub() { super(); }
        public static android.app.slice.ISliceManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.slice.ISliceManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void pinSlice(java.lang.String p0, android.net.Uri p1, android.app.slice.SliceSpec[] p2, android.os.IBinder p3) throws android.os.RemoteException {}
            public void unpinSlice(java.lang.String p0, android.net.Uri p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public boolean hasSliceAccess(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.app.slice.SliceSpec[] getPinnedSpecs(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.net.Uri[] getPinnedSlices(java.lang.String p0) throws android.os.RemoteException { return null; }
            public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
            public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException {}
            public void grantSlicePermission(java.lang.String p0, java.lang.String p1, android.net.Uri p2) throws android.os.RemoteException {}
            public void revokeSlicePermission(java.lang.String p0, java.lang.String p1, android.net.Uri p2) throws android.os.RemoteException {}
            public int checkSlicePermission(android.net.Uri p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException { return 0; }
            public void grantPermissionFromUser(android.net.Uri p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        }
    }
}
