package android.permission;

public interface ILegacyPermissionManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.permission.ILegacyPermissionManager";
    public int checkDeviceIdentifierAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException;
    public int checkPhoneNumberAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException;
    public void grantDefaultPermissionsToEnabledCarrierApps(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void grantDefaultPermissionsToEnabledImsServices(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void grantDefaultPermissionsToEnabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void revokeDefaultPermissionsFromDisabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void grantDefaultPermissionsToActiveLuiApp(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void revokeDefaultPermissionsFromLuiApps(java.lang.String[] p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.permission.ILegacyPermissionManager {
        public Default() {}
        public int checkDeviceIdentifierAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException { return 0; }
        public int checkPhoneNumberAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException { return 0; }
        public void grantDefaultPermissionsToEnabledCarrierApps(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public void grantDefaultPermissionsToEnabledImsServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public void grantDefaultPermissionsToEnabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public void revokeDefaultPermissionsFromDisabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public void grantDefaultPermissionsToActiveLuiApp(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void revokeDefaultPermissionsFromLuiApps(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.permission.ILegacyPermissionManager {
        static final int TRANSACTION_checkDeviceIdentifierAccess = 1;
        static final int TRANSACTION_checkPhoneNumberAccess = 2;
        static final int TRANSACTION_grantDefaultPermissionsToEnabledCarrierApps = 3;
        static final int TRANSACTION_grantDefaultPermissionsToEnabledImsServices = 4;
        static final int TRANSACTION_grantDefaultPermissionsToEnabledTelephonyDataServices = 5;
        static final int TRANSACTION_revokeDefaultPermissionsFromDisabledTelephonyDataServices = 6;
        static final int TRANSACTION_grantDefaultPermissionsToActiveLuiApp = 7;
        static final int TRANSACTION_revokeDefaultPermissionsFromLuiApps = 8;
        public Stub() { super(); }
        public static android.permission.ILegacyPermissionManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.permission.ILegacyPermissionManager p0) { return false; }
        public static android.permission.ILegacyPermissionManager getDefaultImpl() { return null; }

        private static class Proxy implements android.permission.ILegacyPermissionManager {
            private android.os.IBinder mRemote;
            public static android.permission.ILegacyPermissionManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int checkDeviceIdentifierAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException { return 0; }
            public int checkPhoneNumberAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException { return 0; }
            public void grantDefaultPermissionsToEnabledCarrierApps(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public void grantDefaultPermissionsToEnabledImsServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public void grantDefaultPermissionsToEnabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public void revokeDefaultPermissionsFromDisabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public void grantDefaultPermissionsToActiveLuiApp(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void revokeDefaultPermissionsFromLuiApps(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        }
    }
}
