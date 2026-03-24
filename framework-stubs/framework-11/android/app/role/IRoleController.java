package android.app.role;

public interface IRoleController extends android.os.IInterface {
    public void grantDefaultRoles(android.os.RemoteCallback p0) throws android.os.RemoteException;
    public void onAddRoleHolder(java.lang.String p0, java.lang.String p1, int p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public void onRemoveRoleHolder(java.lang.String p0, java.lang.String p1, int p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public void onClearRoleHolders(java.lang.String p0, int p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void isApplicationQualifiedForRole(java.lang.String p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void isApplicationVisibleForRole(java.lang.String p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void isRoleVisible(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException;

    public static class Default implements android.app.role.IRoleController {
        public Default() {}
        public void grantDefaultRoles(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public void onAddRoleHolder(java.lang.String p0, java.lang.String p1, int p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public void onRemoveRoleHolder(java.lang.String p0, java.lang.String p1, int p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public void onClearRoleHolders(java.lang.String p0, int p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void isApplicationQualifiedForRole(java.lang.String p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void isApplicationVisibleForRole(java.lang.String p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void isRoleVisible(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.role.IRoleController {
        private static final java.lang.String DESCRIPTOR = "android.app.role.IRoleController";
        static final int TRANSACTION_grantDefaultRoles = 1;
        static final int TRANSACTION_onAddRoleHolder = 2;
        static final int TRANSACTION_onRemoveRoleHolder = 3;
        static final int TRANSACTION_onClearRoleHolders = 4;
        static final int TRANSACTION_isApplicationQualifiedForRole = 5;
        static final int TRANSACTION_isApplicationVisibleForRole = 6;
        static final int TRANSACTION_isRoleVisible = 7;
        public Stub() { super(); }
        public static android.app.role.IRoleController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.role.IRoleController p0) { return false; }
        public static android.app.role.IRoleController getDefaultImpl() { return null; }

        private static class Proxy implements android.app.role.IRoleController {
            private android.os.IBinder mRemote;
            public static android.app.role.IRoleController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void grantDefaultRoles(android.os.RemoteCallback p0) throws android.os.RemoteException {}
            public void onAddRoleHolder(java.lang.String p0, java.lang.String p1, int p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public void onRemoveRoleHolder(java.lang.String p0, java.lang.String p1, int p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public void onClearRoleHolders(java.lang.String p0, int p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void isApplicationQualifiedForRole(java.lang.String p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void isApplicationVisibleForRole(java.lang.String p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void isRoleVisible(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        }
    }
}
