package com.android.server;

public class SystemConfig {
    static final java.lang.String TAG = "SystemConfig";
    static com.android.server.SystemConfig sInstance;
    private static final int ALLOW_FEATURES = 1;
    private static final int ALLOW_LIBS = 2;
    private static final int ALLOW_PERMISSIONS = 4;
    private static final int ALLOW_APP_CONFIGS = 8;
    private static final int ALLOW_PRIVAPP_PERMISSIONS = 16;
    private static final int ALLOW_OEM_PERMISSIONS = 32;
    private static final int ALLOW_HIDDENAPI_WHITELISTING = 64;
    private static final int ALLOW_ASSOCIATIONS = 128;
    private static final int ALLOW_ALL = -1;
    private static final java.lang.String SKU_PROPERTY = "ro.boot.product.hardware.sku";
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
    final android.util.ArraySet<java.lang.String> mAllowIgnoreLocationSettings = null;
    final android.util.ArraySet<java.lang.String> mAllowImplicitBroadcasts = null;
    final android.util.ArraySet<java.lang.String> mLinkedApps = null;
    final android.util.ArraySet<java.lang.String> mSystemUserWhitelistedApps = null;
    final android.util.ArraySet<java.lang.String> mSystemUserBlacklistedApps = null;
    final android.util.ArraySet<android.content.ComponentName> mDefaultVrComponents = null;
    final android.util.ArraySet<android.content.ComponentName> mBackupTransportWhitelist = null;
    final android.util.ArraySet<java.lang.String> mHiddenApiPackageWhitelist = null;
    final android.util.ArraySet<java.lang.String> mDisabledUntilUsedPreinstalledCarrierApps = null;
    final android.util.ArrayMap<java.lang.String, java.util.List<java.lang.String>> mDisabledUntilUsedPreinstalledCarrierAssociatedApps = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mPrivAppPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mPrivAppDenyPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mVendorPrivAppPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mVendorPrivAppDenyPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mProductPrivAppPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mProductPrivAppDenyPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mProductServicesPrivAppPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mProductServicesPrivAppDenyPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArrayMap<java.lang.String, java.lang.Boolean>> mOemPermissions = null;
    final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mAllowedAssociations = null;
    private final android.util.ArraySet<java.lang.String> mBugreportWhitelistedPackages = null;
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
    public android.util.ArraySet<java.lang.String> getAllowIgnoreLocationSettings() { return null; }
    public android.util.ArraySet<java.lang.String> getLinkedApps() { return null; }
    public android.util.ArraySet<java.lang.String> getSystemUserWhitelistedApps() { return null; }
    public android.util.ArraySet<java.lang.String> getSystemUserBlacklistedApps() { return null; }
    public android.util.ArraySet<java.lang.String> getHiddenApiWhitelistedApps() { return null; }
    public android.util.ArraySet<android.content.ComponentName> getDefaultVrComponents() { return null; }
    public android.util.ArraySet<android.content.ComponentName> getBackupTransportWhitelist() { return null; }
    public android.util.ArraySet<java.lang.String> getDisabledUntilUsedPreinstalledCarrierApps() { return null; }
    public android.util.ArrayMap<java.lang.String, java.util.List<java.lang.String>> getDisabledUntilUsedPreinstalledCarrierAssociatedApps() { return null; }
    public android.util.ArraySet<java.lang.String> getPrivAppPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getPrivAppDenyPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getVendorPrivAppPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getVendorPrivAppDenyPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getProductPrivAppPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getProductPrivAppDenyPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getProductServicesPrivAppPermissions(java.lang.String p0) { return null; }
    public android.util.ArraySet<java.lang.String> getProductServicesPrivAppDenyPermissions(java.lang.String p0) { return null; }
    public java.util.Map<java.lang.String, java.lang.Boolean> getOemPermissions(java.lang.String p0) { return null; }
    public android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> getAllowedAssociations() { return null; }
    public android.util.ArraySet<java.lang.String> getBugreportWhitelistedPackages() { return null; }
    SystemConfig() {}
    void readPermissions(java.io.File p0, int p1) {}
    private void logNotAllowedInPartition(java.lang.String p0, java.io.File p1, org.xmlpull.v1.XmlPullParser p2) {}
    private void readPermissionsFromXml(java.io.File p0, int p1) {}
    private void addFeature(java.lang.String p0, int p1) {}
    private void removeFeature(java.lang.String p0) {}
    void readPermission(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    private void readPrivAppPermissions(org.xmlpull.v1.XmlPullParser p0, android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> p1, android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> p2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    void readOemPermissions(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    private void readSplitPermission(org.xmlpull.v1.XmlPullParser p0, java.io.File p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}

    public static final class SharedLibraryEntry {
        public final java.lang.String name = null;
        public final java.lang.String filename = null;
        public final java.lang.String[] dependencies = null;
        SharedLibraryEntry(java.lang.String p0, java.lang.String p1, java.lang.String[] p2) {}
    }

    public static final class PermissionEntry {
        public final java.lang.String name = null;
        public int[] gids;
        public boolean perUser;
        PermissionEntry(java.lang.String p0, boolean p1) {}
    }
}
