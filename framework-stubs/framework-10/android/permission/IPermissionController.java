package android.permission;

public interface IPermissionController extends android.os.IInterface {
    public void revokeRuntimePermissions(android.os.Bundle p0, boolean p1, int p2, java.lang.String p3, android.os.RemoteCallback p4) throws android.os.RemoteException;
    public void getRuntimePermissionBackup(android.os.UserHandle p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException;
    public void restoreRuntimePermissionBackup(android.os.UserHandle p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException;
    public void restoreDelayedRuntimePermissionBackup(java.lang.String p0, android.os.UserHandle p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void getAppPermissions(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException;
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void countPermissionApps(java.util.List<java.lang.String> p0, int p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void getPermissionUsages(boolean p0, long p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void setRuntimePermissionGrantStateByDeviceAdmin(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.os.RemoteCallback p4) throws android.os.RemoteException;
    public void grantOrUpgradeDefaultRuntimePermissions(android.os.RemoteCallback p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.permission.IPermissionController {
        private static final java.lang.String DESCRIPTOR = "android.permission.IPermissionController";
        static final int TRANSACTION_revokeRuntimePermissions = 1;
        static final int TRANSACTION_getRuntimePermissionBackup = 2;
        static final int TRANSACTION_restoreRuntimePermissionBackup = 3;
        static final int TRANSACTION_restoreDelayedRuntimePermissionBackup = 4;
        static final int TRANSACTION_getAppPermissions = 5;
        static final int TRANSACTION_revokeRuntimePermission = 6;
        static final int TRANSACTION_countPermissionApps = 7;
        static final int TRANSACTION_getPermissionUsages = 8;
        static final int TRANSACTION_setRuntimePermissionGrantStateByDeviceAdmin = 9;
        static final int TRANSACTION_grantOrUpgradeDefaultRuntimePermissions = 10;
        public Stub() { super(); }
        public static android.permission.IPermissionController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.permission.IPermissionController p0) { return false; }
        public static android.permission.IPermissionController getDefaultImpl() { return null; }

        private static class Proxy implements android.permission.IPermissionController {
            private android.os.IBinder mRemote;
            public static android.permission.IPermissionController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void revokeRuntimePermissions(android.os.Bundle p0, boolean p1, int p2, java.lang.String p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
            public void getRuntimePermissionBackup(android.os.UserHandle p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
            public void restoreRuntimePermissionBackup(android.os.UserHandle p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
            public void restoreDelayedRuntimePermissionBackup(java.lang.String p0, android.os.UserHandle p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void getAppPermissions(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
            public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void countPermissionApps(java.util.List<java.lang.String> p0, int p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void getPermissionUsages(boolean p0, long p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void setRuntimePermissionGrantStateByDeviceAdmin(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
            public void grantOrUpgradeDefaultRuntimePermissions(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.permission.IPermissionController {
        public Default() {}
        public void revokeRuntimePermissions(android.os.Bundle p0, boolean p1, int p2, java.lang.String p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
        public void getRuntimePermissionBackup(android.os.UserHandle p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
        public void restoreRuntimePermissionBackup(android.os.UserHandle p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
        public void restoreDelayedRuntimePermissionBackup(java.lang.String p0, android.os.UserHandle p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void getAppPermissions(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void countPermissionApps(java.util.List<java.lang.String> p0, int p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void getPermissionUsages(boolean p0, long p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void setRuntimePermissionGrantStateByDeviceAdmin(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
        public void grantOrUpgradeDefaultRuntimePermissions(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
