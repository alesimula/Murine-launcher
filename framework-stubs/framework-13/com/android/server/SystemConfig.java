package com.android.server;

public class SystemConfig {
    static final java.lang.String TAG = "SystemConfig";
    static com.android.server.SystemConfig sInstance;
    int[] mGlobalGids;
    final android.util.SparseArray<android.util.ArraySet<java.lang.String>> mSystemPermissions = null;
    final java.util.ArrayList<android.permission.PermissionManager.SplitPermissionInfo> mSplitPermissions = null;
    final android.util.ArrayMap<java.lang.String, com.android.server.SystemConfig.SharedLibraryEntry> mSharedLibraries = null;
    final android.util.ArrayMap<java.lang.String, android.content.pm.FeatureInfo> mAvailableFeatures = null;
    final android.util.ArraySet<java.lang.String> mUnavailableFeatures = null;
    final android.util.ArrayMap<java.lang.String, com.android.server.SystemConfig.PermissionEntry> mPermissions = null;
    final android.util.ArraySet<java.lang.String> mAllowInPowerSaveExceptIdle = null;
    final android.util.ArraySet<java.lang.String> mAllowInPowerSave = null;
    final android.util.ArraySet<java.lang.String> mAllowInDataUsageSave = null;
    final android.util.ArraySet<java.lang.String> mAllowUnthrottledLocation = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mAllowAdasSettings = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mAllowIgnoreLocationSettings = null;
    final android.util.ArraySet<java.lang.String> mAllowImplicitBroadcasts = null;
    final android.util.ArraySet<java.lang.String> mBgRestrictionExemption = null;
    final android.util.ArraySet<java.lang.String> mLinkedApps = null;
    final android.util.ArraySet<android.content.ComponentName> mDefaultVrComponents = null;
    final android.util.ArraySet<android.content.ComponentName> mBackupTransportWhitelist = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArrayMap<java.lang.String, java.lang.Boolean>> mPackageComponentEnabledState = null;
    final android.util.ArraySet<java.lang.String> mHiddenApiPackageWhitelist = null;
    final android.util.ArraySet<java.lang.String> mDisabledUntilUsedPreinstalledCarrierApps = null;
    final android.util.ArrayMap<java.lang.String, java.util.List<android.os.CarrierAssociatedAppEntry>> mDisabledUntilUsedPreinstalledCarrierAssociatedApps = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mPrivAppPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mPrivAppDenyPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mVendorPrivAppPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mVendorPrivAppDenyPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mProductPrivAppPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mProductPrivAppDenyPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mSystemExtPrivAppPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mSystemExtPrivAppDenyPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>>> mApexPrivAppPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>>> mApexPrivAppDenyPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArrayMap<java.lang.String, java.lang.Boolean>> mOemPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mAllowedAssociations = null;
    public static com.android.server.SystemConfig getInstance() { return null; }
    public int[] getGlobalGids() { return null; }
    public android.util.SparseArray<android.util.ArraySet<java.lang.String>> getSystemPermissions() { return null; }
    public java.util.ArrayList<android.permission.PermissionManager.SplitPermissionInfo> getSplitPermissions() { return null; }
    public android.util.ArrayMap<java.lang.String, com.android.server.SystemConfig.SharedLibraryEntry> getSharedLibraries() { return null; }
    public android.util.ArrayMap<java.lang.String, android.content.pm.FeatureInfo> getAvailableFeatures() { return null; }
    public android.util.ArrayMap<java.lang.String, com.android.server.SystemConfig.PermissionEntry> getPermissions() { return null; }
    public android.util.ArraySet<java.lang.String> getAllowImplicitBroadcasts() { return null; }
    public android.util.ArraySet<java.lang.String> getAllowInPowerSaveExceptIdle() { return null; }
    public android.util.ArraySet<java.lang.String> getAllowInPowerSave() { return null; }
    public android.util.ArraySet<java.lang.String> getAllowInDataUsageSave() { return null; }
    public android.util.ArraySet<java.lang.String> getAllowUnthrottledLocation() { return null; }
    public android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> getAllowAdasLocationSettings() { return null; }
    public android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> getAllowIgnoreLocationSettings() { return null; }
    public android.util.ArraySet<java.lang.String> getBgRestrictionExemption() { return null; }
    public android.util.ArraySet<java.lang.String> getLinkedApps() { return null; }
    public android.util.ArraySet<java.lang.String> getHiddenApiWhitelistedApps() { return null; }
    public android.util.ArraySet<android.content.ComponentName> getDefaultVrComponents() { return null; }
    public android.util.ArraySet<android.content.ComponentName> getBackupTransportWhitelist() { return null; }
    public android.util.ArrayMap<java.lang.String, java.lang.Boolean> getComponentsEnabledStates(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getDisabledUntilUsedPreinstalledCarrierApps() { return null; }
    public android.util.ArrayMap<java.lang.String, java.util.List<android.os.CarrierAssociatedAppEntry>> getDisabledUntilUsedPreinstalledCarrierAssociatedApps() { return null; }
    public android.util.ArraySet<java.lang.String> getPrivAppPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getPrivAppDenyPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getApexPrivAppPermissions(java.lang.String p0, java.lang.String p1) { return null; }
    public android.util.ArraySet<java.lang.String> getApexPrivAppDenyPermissions(java.lang.String p0, java.lang.String p1) { return null; }
    public android.util.ArraySet<java.lang.String> getVendorPrivAppPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getVendorPrivAppDenyPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getProductPrivAppPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getProductPrivAppDenyPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getSystemExtPrivAppPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getSystemExtPrivAppDenyPermissions(java.lang.String p0) { return null; }
    public java.util.Map<java.lang.String, java.lang.Boolean> getOemPermissions(java.lang.String p0) { return null; }
    public android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> getAllowedAssociations() { return null; }
    public android.util.ArraySet<java.lang.String> getBugreportWhitelistedPackages() { return null; }
    public java.util.Set<java.lang.String> getRollbackWhitelistedPackages() { return null; }
    public java.util.Set<java.lang.String> getWhitelistedStagedInstallers() { return null; }
    public java.util.Map<java.lang.String, java.lang.String> getAllowedVendorApexes() { return null; }
    public java.lang.String getModulesInstallerPackageName() { return null; }
    public android.util.ArraySet<java.lang.String> getAppDataIsolationWhitelistedApps() { return null; }
    public android.util.ArrayMap<java.lang.String, java.util.Set<java.lang.String>> getAndClearPackageToUserTypeWhitelist() { return null; }
    public android.util.ArrayMap<java.lang.String, java.util.Set<java.lang.String>> getAndClearPackageToUserTypeBlacklist() { return null; }
    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> getNamedActors() { return null; }
    public java.lang.String getOverlayConfigSignaturePackage() { return null; }
    public SystemConfig(boolean p0) {}
    SystemConfig() {}
    public void readPermissions(org.xmlpull.v1.XmlPullParser p0, java.io.File p1, int p2) {}
    void readPermission(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    void readOemPermissions(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public void readApexPrivAppPermissions(org.xmlpull.v1.XmlPullParser p0, java.io.File p1, java.nio.file.Path p2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}

    public static final class PermissionEntry {
        public final java.lang.String name = null;
        public int[] gids;
        public boolean perUser;
        PermissionEntry(java.lang.String p0, boolean p1) {}
    }

    public static final class SharedLibraryEntry {
        public final java.lang.String name = null;
        public final java.lang.String filename = null;
        public final java.lang.String[] dependencies = null;
        public final java.lang.String onBootclasspathSince = null;
        public final java.lang.String onBootclasspathBefore = null;
        public final boolean canBeSafelyIgnored = false;
        public final boolean isNative = false;
        public SharedLibraryEntry(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, boolean p3) {}
        public SharedLibraryEntry(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, java.lang.String p4) {}
        SharedLibraryEntry(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, java.lang.String p4, boolean p5) {}
    }
}
