package android.permission;

public interface IPermissionManager extends android.os.IInterface {
    public java.lang.String[] getAppOpPermissionPackages(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAllPermissionGroups(int p0) throws android.os.RemoteException;
    public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryPermissionsByGroup(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean addPermission(android.content.pm.PermissionInfo p0, boolean p1) throws android.os.RemoteException;
    public void removePermission(java.lang.String p0) throws android.os.RemoteException;
    public int getPermissionFlags(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, boolean p4, int p5) throws android.os.RemoteException;
    public void updatePermissionFlagsForAllApps(int p0, int p1, int p2) throws android.os.RemoteException;
    public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int checkUidPermission(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int checkDeviceIdentifierAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException;
    public void addOnPermissionsChangeListener(android.permission.IOnPermissionsChangeListener p0) throws android.os.RemoteException;
    public void removeOnPermissionsChangeListener(android.permission.IOnPermissionsChangeListener p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getWhitelistedRestrictedPermissions(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean addWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public boolean removeWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void resetRuntimePermissions() throws android.os.RemoteException;
    public boolean setDefaultBrowser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.lang.String getDefaultBrowser(int p0) throws android.os.RemoteException;
    public void grantDefaultPermissionsToEnabledCarrierApps(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void grantDefaultPermissionsToEnabledImsServices(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void grantDefaultPermissionsToEnabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void revokeDefaultPermissionsFromDisabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void grantDefaultPermissionsToActiveLuiApp(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void revokeDefaultPermissionsFromLuiApps(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void setPermissionEnforced(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean isPermissionEnforced(java.lang.String p0) throws android.os.RemoteException;
    public boolean shouldShowRequestPermissionRationale(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.util.List<android.content.pm.permission.SplitPermissionInfoParcelable> getSplitPermissions() throws android.os.RemoteException;
    public void startOneTimePermissionSession(java.lang.String p0, int p1, long p2, int p3, int p4) throws android.os.RemoteException;
    public void stopOneTimePermissionSession(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAutoRevokeExemptionRequestedPackages(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAutoRevokeExemptionGrantedPackages(int p0) throws android.os.RemoteException;
    public boolean setAutoRevokeWhitelisted(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean isAutoRevokeWhitelisted(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.permission.IPermissionManager {
        public Default() {}
        public java.lang.String[] getAppOpPermissionPackages(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getAllPermissionGroups(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryPermissionsByGroup(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean addPermission(android.content.pm.PermissionInfo p0, boolean p1) throws android.os.RemoteException { return false; }
        public void removePermission(java.lang.String p0) throws android.os.RemoteException {}
        public int getPermissionFlags(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, boolean p4, int p5) throws android.os.RemoteException {}
        public void updatePermissionFlagsForAllApps(int p0, int p1, int p2) throws android.os.RemoteException {}
        public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public int checkUidPermission(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int checkDeviceIdentifierAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException { return 0; }
        public void addOnPermissionsChangeListener(android.permission.IOnPermissionsChangeListener p0) throws android.os.RemoteException {}
        public void removeOnPermissionsChangeListener(android.permission.IOnPermissionsChangeListener p0) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getWhitelistedRestrictedPermissions(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public boolean addWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public boolean removeWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void resetRuntimePermissions() throws android.os.RemoteException {}
        public boolean setDefaultBrowser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public java.lang.String getDefaultBrowser(int p0) throws android.os.RemoteException { return null; }
        public void grantDefaultPermissionsToEnabledCarrierApps(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public void grantDefaultPermissionsToEnabledImsServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public void grantDefaultPermissionsToEnabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public void revokeDefaultPermissionsFromDisabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public void grantDefaultPermissionsToActiveLuiApp(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void revokeDefaultPermissionsFromLuiApps(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public void setPermissionEnforced(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public boolean isPermissionEnforced(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean shouldShowRequestPermissionRationale(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public java.util.List<android.content.pm.permission.SplitPermissionInfoParcelable> getSplitPermissions() throws android.os.RemoteException { return null; }
        public void startOneTimePermissionSession(java.lang.String p0, int p1, long p2, int p3, int p4) throws android.os.RemoteException {}
        public void stopOneTimePermissionSession(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getAutoRevokeExemptionRequestedPackages(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getAutoRevokeExemptionGrantedPackages(int p0) throws android.os.RemoteException { return null; }
        public boolean setAutoRevokeWhitelisted(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isAutoRevokeWhitelisted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.permission.IPermissionManager {
        private static final java.lang.String DESCRIPTOR = "android.permission.IPermissionManager";
        static final int TRANSACTION_getAppOpPermissionPackages = 1;
        static final int TRANSACTION_getAllPermissionGroups = 2;
        static final int TRANSACTION_getPermissionGroupInfo = 3;
        static final int TRANSACTION_getPermissionInfo = 4;
        static final int TRANSACTION_queryPermissionsByGroup = 5;
        static final int TRANSACTION_addPermission = 6;
        static final int TRANSACTION_removePermission = 7;
        static final int TRANSACTION_getPermissionFlags = 8;
        static final int TRANSACTION_updatePermissionFlags = 9;
        static final int TRANSACTION_updatePermissionFlagsForAllApps = 10;
        static final int TRANSACTION_checkPermission = 11;
        static final int TRANSACTION_checkUidPermission = 12;
        static final int TRANSACTION_checkDeviceIdentifierAccess = 13;
        static final int TRANSACTION_addOnPermissionsChangeListener = 14;
        static final int TRANSACTION_removeOnPermissionsChangeListener = 15;
        static final int TRANSACTION_getWhitelistedRestrictedPermissions = 16;
        static final int TRANSACTION_addWhitelistedRestrictedPermission = 17;
        static final int TRANSACTION_removeWhitelistedRestrictedPermission = 18;
        static final int TRANSACTION_grantRuntimePermission = 19;
        static final int TRANSACTION_revokeRuntimePermission = 20;
        static final int TRANSACTION_resetRuntimePermissions = 21;
        static final int TRANSACTION_setDefaultBrowser = 22;
        static final int TRANSACTION_getDefaultBrowser = 23;
        static final int TRANSACTION_grantDefaultPermissionsToEnabledCarrierApps = 24;
        static final int TRANSACTION_grantDefaultPermissionsToEnabledImsServices = 25;
        static final int TRANSACTION_grantDefaultPermissionsToEnabledTelephonyDataServices = 26;
        static final int TRANSACTION_revokeDefaultPermissionsFromDisabledTelephonyDataServices = 27;
        static final int TRANSACTION_grantDefaultPermissionsToActiveLuiApp = 28;
        static final int TRANSACTION_revokeDefaultPermissionsFromLuiApps = 29;
        static final int TRANSACTION_setPermissionEnforced = 30;
        static final int TRANSACTION_isPermissionEnforced = 31;
        static final int TRANSACTION_shouldShowRequestPermissionRationale = 32;
        static final int TRANSACTION_isPermissionRevokedByPolicy = 33;
        static final int TRANSACTION_getSplitPermissions = 34;
        static final int TRANSACTION_startOneTimePermissionSession = 35;
        static final int TRANSACTION_stopOneTimePermissionSession = 36;
        static final int TRANSACTION_getAutoRevokeExemptionRequestedPackages = 37;
        static final int TRANSACTION_getAutoRevokeExemptionGrantedPackages = 38;
        static final int TRANSACTION_setAutoRevokeWhitelisted = 39;
        static final int TRANSACTION_isAutoRevokeWhitelisted = 40;
        public Stub() { super(); }
        public static android.permission.IPermissionManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.permission.IPermissionManager p0) { return false; }
        public static android.permission.IPermissionManager getDefaultImpl() { return null; }

        private static class Proxy implements android.permission.IPermissionManager {
            private android.os.IBinder mRemote;
            public static android.permission.IPermissionManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String[] getAppOpPermissionPackages(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getAllPermissionGroups(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryPermissionsByGroup(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public boolean addPermission(android.content.pm.PermissionInfo p0, boolean p1) throws android.os.RemoteException { return false; }
            public void removePermission(java.lang.String p0) throws android.os.RemoteException {}
            public int getPermissionFlags(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, boolean p4, int p5) throws android.os.RemoteException {}
            public void updatePermissionFlagsForAllApps(int p0, int p1, int p2) throws android.os.RemoteException {}
            public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public int checkUidPermission(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int checkDeviceIdentifierAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException { return 0; }
            public void addOnPermissionsChangeListener(android.permission.IOnPermissionsChangeListener p0) throws android.os.RemoteException {}
            public void removeOnPermissionsChangeListener(android.permission.IOnPermissionsChangeListener p0) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getWhitelistedRestrictedPermissions(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public boolean addWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public boolean removeWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void resetRuntimePermissions() throws android.os.RemoteException {}
            public boolean setDefaultBrowser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public java.lang.String getDefaultBrowser(int p0) throws android.os.RemoteException { return null; }
            public void grantDefaultPermissionsToEnabledCarrierApps(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public void grantDefaultPermissionsToEnabledImsServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public void grantDefaultPermissionsToEnabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public void revokeDefaultPermissionsFromDisabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public void grantDefaultPermissionsToActiveLuiApp(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void revokeDefaultPermissionsFromLuiApps(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public void setPermissionEnforced(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public boolean isPermissionEnforced(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean shouldShowRequestPermissionRationale(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public java.util.List<android.content.pm.permission.SplitPermissionInfoParcelable> getSplitPermissions() throws android.os.RemoteException { return null; }
            public void startOneTimePermissionSession(java.lang.String p0, int p1, long p2, int p3, int p4) throws android.os.RemoteException {}
            public void stopOneTimePermissionSession(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getAutoRevokeExemptionRequestedPackages(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getAutoRevokeExemptionGrantedPackages(int p0) throws android.os.RemoteException { return null; }
            public boolean setAutoRevokeWhitelisted(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isAutoRevokeWhitelisted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        }
    }
}
