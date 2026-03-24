package com.android.internal.compat;

public interface IPlatformCompat extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.compat.IPlatformCompat";
    @android.annotation.EnforcePermission("android.permission.LOG_COMPAT_CHANGE")
    public void reportChange(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.LOG_COMPAT_CHANGE")
    public void reportChangeByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.LOG_COMPAT_CHANGE")
    public void reportChangeByUid(long p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(allOf={"android.permission.LOG_COMPAT_CHANGE", "android.permission.READ_COMPAT_CHANGE_CONFIG"})
    public boolean isChangeEnabled(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(allOf={"android.permission.LOG_COMPAT_CHANGE", "android.permission.READ_COMPAT_CHANGE_CONFIG"})
    public boolean isChangeEnabledByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(allOf={"android.permission.LOG_COMPAT_CHANGE", "android.permission.READ_COMPAT_CHANGE_CONFIG"})
    public boolean isChangeEnabledByUid(long p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG")
    public void setOverrides(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG_ON_RELEASE_BUILD")
    public void putAllOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesByPackageConfig p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG_ON_RELEASE_BUILD")
    public void putOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverrideConfig p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG")
    public void setOverridesForTest(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG")
    public boolean clearOverride(long p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG")
    public boolean clearOverrideForTest(long p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG_ON_RELEASE_BUILD")
    public void removeAllOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesToRemoveByPackageConfig p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG_ON_RELEASE_BUILD")
    public void removeOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesToRemoveConfig p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG")
    public int enableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG")
    public int disableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG")
    public void clearOverrides(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG")
    public void clearOverridesForTest(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(allOf={"android.permission.LOG_COMPAT_CHANGE", "android.permission.READ_COMPAT_CHANGE_CONFIG"})
    public com.android.internal.compat.CompatibilityChangeConfig getAppConfig(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.READ_COMPAT_CHANGE_CONFIG")
    public com.android.internal.compat.CompatibilityChangeInfo[] listAllChanges() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public com.android.internal.compat.CompatibilityChangeInfo[] listUIChanges() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public com.android.internal.compat.IOverrideValidator getOverrideValidator() throws android.os.RemoteException;

    public static class Default implements com.android.internal.compat.IPlatformCompat {
        public Default() {}
        public void reportChange(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException {}
        public void reportChangeByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void reportChangeByUid(long p0, int p1) throws android.os.RemoteException {}
        public boolean isChangeEnabled(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException { return false; }
        public boolean isChangeEnabledByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isChangeEnabledByUid(long p0, int p1) throws android.os.RemoteException { return false; }
        public void setOverrides(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException {}
        public void putAllOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesByPackageConfig p0) throws android.os.RemoteException {}
        public void putOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverrideConfig p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setOverridesForTest(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean clearOverride(long p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean clearOverrideForTest(long p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void removeAllOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesToRemoveByPackageConfig p0) throws android.os.RemoteException {}
        public void removeOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesToRemoveConfig p0, java.lang.String p1) throws android.os.RemoteException {}
        public int enableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int disableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void clearOverrides(java.lang.String p0) throws android.os.RemoteException {}
        public void clearOverridesForTest(java.lang.String p0) throws android.os.RemoteException {}
        public com.android.internal.compat.CompatibilityChangeConfig getAppConfig(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException { return null; }
        public com.android.internal.compat.CompatibilityChangeInfo[] listAllChanges() throws android.os.RemoteException { return null; }
        public com.android.internal.compat.CompatibilityChangeInfo[] listUIChanges() throws android.os.RemoteException { return null; }
        public com.android.internal.compat.IOverrideValidator getOverrideValidator() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.compat.IPlatformCompat {
        static final int TRANSACTION_reportChange = 1;
        static final int TRANSACTION_reportChangeByPackageName = 2;
        static final int TRANSACTION_reportChangeByUid = 3;
        static final int TRANSACTION_isChangeEnabled = 4;
        static final java.lang.String[] PERMISSIONS_isChangeEnabled = null;
        static final int TRANSACTION_isChangeEnabledByPackageName = 5;
        static final java.lang.String[] PERMISSIONS_isChangeEnabledByPackageName = null;
        static final int TRANSACTION_isChangeEnabledByUid = 6;
        static final java.lang.String[] PERMISSIONS_isChangeEnabledByUid = null;
        static final int TRANSACTION_setOverrides = 7;
        static final int TRANSACTION_putAllOverridesOnReleaseBuilds = 8;
        static final int TRANSACTION_putOverridesOnReleaseBuilds = 9;
        static final int TRANSACTION_setOverridesForTest = 10;
        static final int TRANSACTION_clearOverride = 11;
        static final int TRANSACTION_clearOverrideForTest = 12;
        static final int TRANSACTION_removeAllOverridesOnReleaseBuilds = 13;
        static final int TRANSACTION_removeOverridesOnReleaseBuilds = 14;
        static final int TRANSACTION_enableTargetSdkChanges = 15;
        static final int TRANSACTION_disableTargetSdkChanges = 16;
        static final int TRANSACTION_clearOverrides = 17;
        static final int TRANSACTION_clearOverridesForTest = 18;
        static final int TRANSACTION_getAppConfig = 19;
        static final java.lang.String[] PERMISSIONS_getAppConfig = null;
        static final int TRANSACTION_listAllChanges = 20;
        static final int TRANSACTION_listUIChanges = 21;
        static final int TRANSACTION_getOverrideValidator = 22;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static com.android.internal.compat.IPlatformCompat asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void reportChange_enforcePermission() throws java.lang.SecurityException {}
        protected void reportChangeByPackageName_enforcePermission() throws java.lang.SecurityException {}
        protected void reportChangeByUid_enforcePermission() throws java.lang.SecurityException {}
        protected void isChangeEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void isChangeEnabledByPackageName_enforcePermission() throws java.lang.SecurityException {}
        protected void isChangeEnabledByUid_enforcePermission() throws java.lang.SecurityException {}
        protected void setOverrides_enforcePermission() throws java.lang.SecurityException {}
        protected void putAllOverridesOnReleaseBuilds_enforcePermission() throws java.lang.SecurityException {}
        protected void putOverridesOnReleaseBuilds_enforcePermission() throws java.lang.SecurityException {}
        protected void setOverridesForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void clearOverride_enforcePermission() throws java.lang.SecurityException {}
        protected void clearOverrideForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void removeAllOverridesOnReleaseBuilds_enforcePermission() throws java.lang.SecurityException {}
        protected void removeOverridesOnReleaseBuilds_enforcePermission() throws java.lang.SecurityException {}
        protected void enableTargetSdkChanges_enforcePermission() throws java.lang.SecurityException {}
        protected void disableTargetSdkChanges_enforcePermission() throws java.lang.SecurityException {}
        protected void clearOverrides_enforcePermission() throws java.lang.SecurityException {}
        protected void clearOverridesForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void getAppConfig_enforcePermission() throws java.lang.SecurityException {}
        protected void listAllChanges_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.compat.IPlatformCompat {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void reportChange(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException {}
            public void reportChangeByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void reportChangeByUid(long p0, int p1) throws android.os.RemoteException {}
            public boolean isChangeEnabled(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException { return false; }
            public boolean isChangeEnabledByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isChangeEnabledByUid(long p0, int p1) throws android.os.RemoteException { return false; }
            public void setOverrides(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException {}
            public void putAllOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesByPackageConfig p0) throws android.os.RemoteException {}
            public void putOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverrideConfig p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setOverridesForTest(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean clearOverride(long p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean clearOverrideForTest(long p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void removeAllOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesToRemoveByPackageConfig p0) throws android.os.RemoteException {}
            public void removeOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesToRemoveConfig p0, java.lang.String p1) throws android.os.RemoteException {}
            public int enableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int disableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void clearOverrides(java.lang.String p0) throws android.os.RemoteException {}
            public void clearOverridesForTest(java.lang.String p0) throws android.os.RemoteException {}
            public com.android.internal.compat.CompatibilityChangeConfig getAppConfig(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException { return null; }
            public com.android.internal.compat.CompatibilityChangeInfo[] listAllChanges() throws android.os.RemoteException { return null; }
            public com.android.internal.compat.CompatibilityChangeInfo[] listUIChanges() throws android.os.RemoteException { return null; }
            public com.android.internal.compat.IOverrideValidator getOverrideValidator() throws android.os.RemoteException { return null; }
        }
    }
}
