package android.permission;

public interface IPermissionManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.permission.IPermissionManager";
    public android.content.pm.ParceledListSlice getAllPermissionGroups(int p0) throws android.os.RemoteException;
    public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryPermissionsByGroup(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean addPermission(android.content.pm.PermissionInfo p0, boolean p1) throws android.os.RemoteException;
    public void removePermission(java.lang.String p0) throws android.os.RemoteException;
    public int getPermissionFlags(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, boolean p4, java.lang.String p5, int p6) throws android.os.RemoteException;
    public void updatePermissionFlagsForAllApps(int p0, int p1, int p2) throws android.os.RemoteException;
    public void addOnPermissionsChangeListener(android.permission.IOnPermissionsChangeListener p0) throws android.os.RemoteException;
    public void removeOnPermissionsChangeListener(android.permission.IOnPermissionsChangeListener p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllowlistedRestrictedPermissions(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean addAllowlistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public boolean removeAllowlistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public void revokePostNotificationPermissionWithoutKillForTest(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean shouldShowRequestPermissionRationale(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public java.util.List<android.content.pm.permission.SplitPermissionInfoParcelable> getSplitPermissions() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_ONE_TIME_PERMISSION_SESSIONS")
    public void startOneTimePermissionSession(java.lang.String p0, int p1, int p2, long p3, long p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_ONE_TIME_PERMISSION_SESSIONS")
    public void stopOneTimePermissionSession(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAutoRevokeExemptionRequestedPackages(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAutoRevokeExemptionGrantedPackages(int p0) throws android.os.RemoteException;
    public boolean setAutoRevokeExempted(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean isAutoRevokeExempted(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.os.IBinder registerAttributionSource(android.content.AttributionSourceState p0) throws android.os.RemoteException;
    public int getRegisteredAttributionSourceCount(int p0) throws android.os.RemoteException;
    public boolean isRegisteredAttributionSource(android.content.AttributionSourceState p0) throws android.os.RemoteException;
    public int checkPermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public int checkUidPermission(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.util.Map<java.lang.String, android.permission.PermissionManager.PermissionState> getAllPermissionStates(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.permission.IPermissionManager {
        public Default() {}
        public android.content.pm.ParceledListSlice getAllPermissionGroups(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryPermissionsByGroup(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean addPermission(android.content.pm.PermissionInfo p0, boolean p1) throws android.os.RemoteException { return false; }
        public void removePermission(java.lang.String p0) throws android.os.RemoteException {}
        public int getPermissionFlags(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
        public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, boolean p4, java.lang.String p5, int p6) throws android.os.RemoteException {}
        public void updatePermissionFlagsForAllApps(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void addOnPermissionsChangeListener(android.permission.IOnPermissionsChangeListener p0) throws android.os.RemoteException {}
        public void removeOnPermissionsChangeListener(android.permission.IOnPermissionsChangeListener p0) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getAllowlistedRestrictedPermissions(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public boolean addAllowlistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public boolean removeAllowlistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
        public void revokePostNotificationPermissionWithoutKillForTest(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean shouldShowRequestPermissionRationale(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public java.util.List<android.content.pm.permission.SplitPermissionInfoParcelable> getSplitPermissions() throws android.os.RemoteException { return null; }
        public void startOneTimePermissionSession(java.lang.String p0, int p1, int p2, long p3, long p4) throws android.os.RemoteException {}
        public void stopOneTimePermissionSession(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getAutoRevokeExemptionRequestedPackages(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getAutoRevokeExemptionGrantedPackages(int p0) throws android.os.RemoteException { return null; }
        public boolean setAutoRevokeExempted(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isAutoRevokeExempted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder registerAttributionSource(android.content.AttributionSourceState p0) throws android.os.RemoteException { return null; }
        public int getRegisteredAttributionSourceCount(int p0) throws android.os.RemoteException { return 0; }
        public boolean isRegisteredAttributionSource(android.content.AttributionSourceState p0) throws android.os.RemoteException { return false; }
        public int checkPermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
        public int checkUidPermission(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public java.util.Map<java.lang.String, android.permission.PermissionManager.PermissionState> getAllPermissionStates(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.permission.IPermissionManager {
        static final int TRANSACTION_getAllPermissionGroups = 1;
        static final int TRANSACTION_getPermissionGroupInfo = 2;
        static final int TRANSACTION_getPermissionInfo = 3;
        static final int TRANSACTION_queryPermissionsByGroup = 4;
        static final int TRANSACTION_addPermission = 5;
        static final int TRANSACTION_removePermission = 6;
        static final int TRANSACTION_getPermissionFlags = 7;
        static final int TRANSACTION_updatePermissionFlags = 8;
        static final int TRANSACTION_updatePermissionFlagsForAllApps = 9;
        static final int TRANSACTION_addOnPermissionsChangeListener = 10;
        static final int TRANSACTION_removeOnPermissionsChangeListener = 11;
        static final int TRANSACTION_getAllowlistedRestrictedPermissions = 12;
        static final int TRANSACTION_addAllowlistedRestrictedPermission = 13;
        static final int TRANSACTION_removeAllowlistedRestrictedPermission = 14;
        static final int TRANSACTION_grantRuntimePermission = 15;
        static final int TRANSACTION_revokeRuntimePermission = 16;
        static final int TRANSACTION_revokePostNotificationPermissionWithoutKillForTest = 17;
        static final int TRANSACTION_shouldShowRequestPermissionRationale = 18;
        static final int TRANSACTION_isPermissionRevokedByPolicy = 19;
        static final int TRANSACTION_getSplitPermissions = 20;
        static final int TRANSACTION_startOneTimePermissionSession = 21;
        static final int TRANSACTION_stopOneTimePermissionSession = 22;
        static final int TRANSACTION_getAutoRevokeExemptionRequestedPackages = 23;
        static final int TRANSACTION_getAutoRevokeExemptionGrantedPackages = 24;
        static final int TRANSACTION_setAutoRevokeExempted = 25;
        static final int TRANSACTION_isAutoRevokeExempted = 26;
        static final int TRANSACTION_registerAttributionSource = 27;
        static final int TRANSACTION_getRegisteredAttributionSourceCount = 28;
        static final int TRANSACTION_isRegisteredAttributionSource = 29;
        static final int TRANSACTION_checkPermission = 30;
        static final int TRANSACTION_checkUidPermission = 31;
        static final int TRANSACTION_getAllPermissionStates = 32;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.permission.IPermissionManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void startOneTimePermissionSession_enforcePermission() throws java.lang.SecurityException {}
        protected void stopOneTimePermissionSession_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.permission.IPermissionManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.content.pm.ParceledListSlice getAllPermissionGroups(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryPermissionsByGroup(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public boolean addPermission(android.content.pm.PermissionInfo p0, boolean p1) throws android.os.RemoteException { return false; }
            public void removePermission(java.lang.String p0) throws android.os.RemoteException {}
            public int getPermissionFlags(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
            public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, boolean p4, java.lang.String p5, int p6) throws android.os.RemoteException {}
            public void updatePermissionFlagsForAllApps(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void addOnPermissionsChangeListener(android.permission.IOnPermissionsChangeListener p0) throws android.os.RemoteException {}
            public void removeOnPermissionsChangeListener(android.permission.IOnPermissionsChangeListener p0) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getAllowlistedRestrictedPermissions(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public boolean addAllowlistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public boolean removeAllowlistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
            public void revokePostNotificationPermissionWithoutKillForTest(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean shouldShowRequestPermissionRationale(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public java.util.List<android.content.pm.permission.SplitPermissionInfoParcelable> getSplitPermissions() throws android.os.RemoteException { return null; }
            public void startOneTimePermissionSession(java.lang.String p0, int p1, int p2, long p3, long p4) throws android.os.RemoteException {}
            public void stopOneTimePermissionSession(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getAutoRevokeExemptionRequestedPackages(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getAutoRevokeExemptionGrantedPackages(int p0) throws android.os.RemoteException { return null; }
            public boolean setAutoRevokeExempted(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isAutoRevokeExempted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.os.IBinder registerAttributionSource(android.content.AttributionSourceState p0) throws android.os.RemoteException { return null; }
            public int getRegisteredAttributionSourceCount(int p0) throws android.os.RemoteException { return 0; }
            public boolean isRegisteredAttributionSource(android.content.AttributionSourceState p0) throws android.os.RemoteException { return false; }
            public int checkPermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
            public int checkUidPermission(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public java.util.Map<java.lang.String, android.permission.PermissionManager.PermissionState> getAllPermissionStates(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        }
    }
}
