package android.app;

public class ApplicationPackageManager extends android.content.pm.PackageManager {
    private static final java.lang.String TAG = "ApplicationPackageManager";
    private static final boolean DEBUG_ICONS = false;
    private static final int DEFAULT_EPHEMERAL_COOKIE_MAX_SIZE_BYTES = 16384;
    private static final int sDefaultFlags = 1024;
    private static final int DEFAULT_CHECKSUMS = 127;
    public static final java.lang.String APP_PERMISSION_BUTTON_ALLOW_ALWAYS = "app_permission_button_allow_always";
    public static final java.lang.String PERMISSION_CONTROLLER_RESOURCE_PACKAGE = "com.android.permissioncontroller";
    private final java.lang.Object mLock = null;
    private android.os.UserManager mUserManager;
    private android.permission.PermissionManager mPermissionManager;
    private android.content.pm.PackageInstaller mInstaller;
    private android.content.pm.dex.ArtManager mArtManager;
    private final java.util.ArrayList<android.app.ApplicationPackageManager.MoveCallbackDelegate> mDelegates = null;
    private java.lang.String mPermissionsControllerPackageName;
    private static final android.app.PropertyInvalidatedCache<android.app.ApplicationPackageManager.HasSystemFeatureQuery, java.lang.Boolean> mHasSystemFeatureCache = null;
    private static final java.lang.String CACHE_KEY_PACKAGES_FOR_UID_PROPERTY = "cache_key.get_packages_for_uid";
    private static final android.app.PropertyInvalidatedCache<java.lang.Integer, android.app.ApplicationPackageManager.GetPackagesForUidResult> mGetPackagesForUidCache = null;
    volatile int mCachedSafeMode;
    private final android.app.ContextImpl mContext = null;
    private final android.content.pm.IPackageManager mPM = null;
    private volatile boolean mUserUnlocked;
    private static final java.lang.Object sSync = null;
    private static android.util.ArrayMap<android.app.ApplicationPackageManager.ResourceName, java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>> sIconCache;
    private static android.util.ArrayMap<android.app.ApplicationPackageManager.ResourceName, java.lang.ref.WeakReference<java.lang.CharSequence>> sStringCache;
    android.os.UserManager getUserManager() { return null; }
    private android.permission.PermissionManager getPermissionManager() { return null; }
    public int getUserId() { return 0; }
    public android.content.pm.PackageInfo getPackageInfo(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.pm.PackageInfo getPackageInfo(android.content.pm.VersionedPackage p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.pm.PackageInfo getPackageInfoAsUser(java.lang.String p0, int p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public java.lang.String[] currentToCanonicalPackageNames(java.lang.String[] p0) { return null; }
    public java.lang.String[] canonicalToCurrentPackageNames(java.lang.String[] p0) { return null; }
    public android.content.Intent getLaunchIntentForPackage(java.lang.String p0) { return null; }
    public android.content.Intent getLeanbackLaunchIntentForPackage(java.lang.String p0) { return null; }
    public android.content.Intent getCarLaunchIntentForPackage(java.lang.String p0) { return null; }
    private android.content.Intent getLaunchIntentForPackageAndCategory(java.lang.String p0, java.lang.String p1) { return null; }
    public int[] getPackageGids(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public int[] getPackageGids(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public int getPackageUid(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    public int getPackageUidAsUser(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    public int getPackageUidAsUser(java.lang.String p0, int p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    public java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int p0) { return null; }
    public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public void getPlatformPermissionsForGroup(java.lang.String p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.util.List<java.lang.String>> p2) {}
    public void getGroupOfPlatformPermission(java.lang.String p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.String> p2) {}
    public boolean arePermissionsIndividuallyControlled() { return false; }
    public boolean isWirelessConsentModeEnabled() { return false; }
    public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.pm.ApplicationInfo getApplicationInfoAsUser(java.lang.String p0, int p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    private static android.content.pm.ApplicationInfo maybeAdjustApplicationInfo(android.content.pm.ApplicationInfo p0) { return null; }
    public int getTargetSdkVersion(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public java.lang.String[] getSystemSharedLibraryNames() { return null; }
    public java.util.List<android.content.pm.SharedLibraryInfo> getSharedLibraries(int p0) { return null; }
    public java.util.List<android.content.pm.SharedLibraryInfo> getSharedLibrariesAsUser(int p0, int p1) { return null; }
    public java.util.List<android.content.pm.SharedLibraryInfo> getDeclaredSharedLibraries(java.lang.String p0, int p1) { return null; }
    public java.lang.String getServicesSystemSharedLibraryPackageName() { return null; }
    public java.lang.String getSharedSystemSharedLibraryPackageName() { return null; }
    public android.content.pm.ChangedPackages getChangedPackages(int p0) { return null; }
    public android.content.pm.FeatureInfo[] getSystemAvailableFeatures() { return null; }
    public boolean hasSystemFeature(java.lang.String p0) { return false; }
    public boolean hasSystemFeature(java.lang.String p0, int p1) { return false; }
    public void disableHasSystemFeatureCache() {}
    public static void invalidateHasSystemFeatureCache() {}
    public int checkPermission(java.lang.String p0, java.lang.String p1) { return 0; }
    public boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1) { return false; }
    public java.lang.String getPermissionControllerPackageName() { return null; }
    public boolean addPermission(android.content.pm.PermissionInfo p0) { return false; }
    public boolean addPermissionAsync(android.content.pm.PermissionInfo p0) { return false; }
    public void removePermission(java.lang.String p0) {}
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) {}
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) {}
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, java.lang.String p3) {}
    public int getPermissionFlags(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return 0; }
    public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.UserHandle p4) {}
    public java.util.Set<java.lang.String> getWhitelistedRestrictedPermissions(java.lang.String p0, int p1) { return null; }
    public boolean addWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    public boolean setAutoRevokeWhitelisted(java.lang.String p0, boolean p1) { return false; }
    public boolean isAutoRevokeWhitelisted(java.lang.String p0) { return false; }
    public boolean removeWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    public boolean shouldShowRequestPermissionRationale(java.lang.String p0) { return false; }
    public java.lang.CharSequence getBackgroundPermissionOptionLabel() { return null; }
    public int checkSignatures(java.lang.String p0, java.lang.String p1) { return 0; }
    public int checkSignatures(int p0, int p1) { return 0; }
    public boolean hasSigningCertificate(java.lang.String p0, byte[] p1, int p2) { return false; }
    public boolean hasSigningCertificate(int p0, byte[] p1, int p2) { return false; }
    private static java.util.List<byte[]> encodeCertificates(java.util.List<java.security.cert.Certificate> p0) throws java.security.cert.CertificateEncodingException { return null; }
    public void requestChecksums(java.lang.String p0, boolean p1, int p2, java.util.List<java.security.cert.Certificate> p3, android.content.pm.PackageManager.OnChecksumsReadyListener p4) throws java.security.cert.CertificateEncodingException, android.content.pm.PackageManager.NameNotFoundException {}
    public java.lang.String[] getPackagesForUid(int p0) { return null; }
    public static void disableGetPackagesForUidCache() {}
    public static void invalidateGetPackagesForUidCache() {}
    public java.lang.String getNameForUid(int p0) { return null; }
    public java.lang.String[] getNamesForUids(int[] p0) { return null; }
    public int getUidForSharedUser(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    public java.util.List<android.content.pm.ModuleInfo> getInstalledModules(int p0) { return null; }
    public android.content.pm.ModuleInfo getModuleInfo(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int p0) { return null; }
    public java.util.List<android.content.pm.PackageInfo> getInstalledPackagesAsUser(int p0, int p1) { return null; }
    public java.util.List<android.content.pm.PackageInfo> getPackagesHoldingPermissions(java.lang.String[] p0, int p1) { return null; }
    public java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(int p0) { return null; }
    public java.util.List<android.content.pm.ApplicationInfo> getInstalledApplicationsAsUser(int p0, int p1) { return null; }
    public java.util.List<android.content.pm.InstantAppInfo> getInstantApps() { return null; }
    public android.graphics.drawable.Drawable getInstantAppIcon(java.lang.String p0) { return null; }
    public boolean isInstantApp() { return false; }
    public boolean isInstantApp(java.lang.String p0) { return false; }
    public int getInstantAppCookieMaxBytes() { return 0; }
    public int getInstantAppCookieMaxSize() { return 0; }
    public byte[] getInstantAppCookie() { return null; }
    public void clearInstantAppCookie() {}
    public void updateInstantAppCookie(byte[] p0) {}
    public boolean setInstantAppCookie(byte[] p0) { return false; }
    public android.content.pm.ResolveInfo resolveActivity(android.content.Intent p0, int p1) { return null; }
    public android.content.pm.ResolveInfo resolveActivityAsUser(android.content.Intent p0, int p1, int p2) { return null; }
    public java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent p0, int p1) { return null; }
    public java.util.List<android.content.pm.ResolveInfo> queryIntentActivitiesAsUser(android.content.Intent p0, int p1, int p2) { return null; }
    public java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions(android.content.ComponentName p0, android.content.Intent[] p1, android.content.Intent p2, int p3) { return null; }
    public java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceiversAsUser(android.content.Intent p0, int p1, int p2) { return null; }
    public java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers(android.content.Intent p0, int p1) { return null; }
    public android.content.pm.ResolveInfo resolveServiceAsUser(android.content.Intent p0, int p1, int p2) { return null; }
    public android.content.pm.ResolveInfo resolveService(android.content.Intent p0, int p1) { return null; }
    public java.util.List<android.content.pm.ResolveInfo> queryIntentServicesAsUser(android.content.Intent p0, int p1, int p2) { return null; }
    public java.util.List<android.content.pm.ResolveInfo> queryIntentServices(android.content.Intent p0, int p1) { return null; }
    public java.util.List<android.content.pm.ResolveInfo> queryIntentContentProvidersAsUser(android.content.Intent p0, int p1, int p2) { return null; }
    public java.util.List<android.content.pm.ResolveInfo> queryIntentContentProviders(android.content.Intent p0, int p1) { return null; }
    public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String p0, int p1) { return null; }
    public android.content.pm.ProviderInfo resolveContentProviderAsUser(java.lang.String p0, int p1, int p2) { return null; }
    public java.util.List<android.content.pm.ProviderInfo> queryContentProviders(java.lang.String p0, int p1, int p2) { return null; }
    public java.util.List<android.content.pm.ProviderInfo> queryContentProviders(java.lang.String p0, int p1, int p2, java.lang.String p3) { return null; }
    public android.content.pm.InstrumentationInfo getInstrumentationInfo(android.content.ComponentName p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public java.util.List<android.content.pm.InstrumentationInfo> queryInstrumentation(java.lang.String p0, int p1) { return null; }
    public android.graphics.drawable.Drawable getDrawable(java.lang.String p0, int p1, android.content.pm.ApplicationInfo p2) { return null; }
    public android.graphics.drawable.Drawable getActivityIcon(android.content.ComponentName p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.graphics.drawable.Drawable getActivityIcon(android.content.Intent p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.graphics.drawable.Drawable getDefaultActivityIcon() { return null; }
    public android.graphics.drawable.Drawable getApplicationIcon(android.content.pm.ApplicationInfo p0) { return null; }
    public android.graphics.drawable.Drawable getApplicationIcon(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.graphics.drawable.Drawable getActivityBanner(android.content.ComponentName p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.graphics.drawable.Drawable getActivityBanner(android.content.Intent p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.graphics.drawable.Drawable getApplicationBanner(android.content.pm.ApplicationInfo p0) { return null; }
    public android.graphics.drawable.Drawable getApplicationBanner(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.graphics.drawable.Drawable getActivityLogo(android.content.ComponentName p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.graphics.drawable.Drawable getActivityLogo(android.content.Intent p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.graphics.drawable.Drawable getApplicationLogo(android.content.pm.ApplicationInfo p0) { return null; }
    public android.graphics.drawable.Drawable getApplicationLogo(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.graphics.drawable.Drawable getUserBadgedIcon(android.graphics.drawable.Drawable p0, android.os.UserHandle p1) { return null; }
    public android.graphics.drawable.Drawable getUserBadgedDrawableForDensity(android.graphics.drawable.Drawable p0, android.os.UserHandle p1, android.graphics.Rect p2, int p3) { return null; }
    private int getUserBadgeColor(android.os.UserHandle p0, boolean p1) { return 0; }
    public android.graphics.drawable.Drawable getUserBadgeForDensity(android.os.UserHandle p0, int p1) { return null; }
    public android.graphics.drawable.Drawable getUserBadgeForDensityNoBackground(android.os.UserHandle p0, int p1) { return null; }
    private android.graphics.drawable.Drawable getDrawableForDensity(int p0, int p1) { return null; }
    private android.graphics.drawable.Drawable getProfileIconForDensity(android.os.UserHandle p0, int p1, int p2) { return null; }
    public java.lang.CharSequence getUserBadgedLabel(java.lang.CharSequence p0, android.os.UserHandle p1) { return null; }
    public android.content.res.Resources getResourcesForActivity(android.content.ComponentName p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.res.Resources getResourcesForApplication(android.content.pm.ApplicationInfo p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.res.Resources getResourcesForApplication(android.content.pm.ApplicationInfo p0, android.content.res.Configuration p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.res.Resources getResourcesForApplication(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.res.Resources getResourcesForApplicationAsUser(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public boolean isSafeMode() { return false; }
    public void addOnPermissionsChangeListener(android.content.pm.PackageManager.OnPermissionsChangedListener p0) {}
    public void removeOnPermissionsChangeListener(android.content.pm.PackageManager.OnPermissionsChangedListener p0) {}
    static void configurationChanged() {}
    protected ApplicationPackageManager(android.app.ContextImpl p0, android.content.pm.IPackageManager p1) { super(); }
    private int updateFlagsForPackage(int p0, int p1) { return 0; }
    private int updateFlagsForApplication(int p0, int p1) { return 0; }
    private int updateFlagsForComponent(int p0, int p1, android.content.Intent p2) { return 0; }
    private void onImplicitDirectBoot(int p0) {}
    private android.graphics.drawable.Drawable getCachedIcon(android.app.ApplicationPackageManager.ResourceName p0) { return null; }
    private void putCachedIcon(android.app.ApplicationPackageManager.ResourceName p0, android.graphics.drawable.Drawable p1) {}
    static void handlePackageBroadcast(int p0, java.lang.String[] p1, boolean p2) {}
    private java.lang.CharSequence getCachedString(android.app.ApplicationPackageManager.ResourceName p0) { return null; }
    private void putCachedString(android.app.ApplicationPackageManager.ResourceName p0, java.lang.CharSequence p1) {}
    public java.lang.CharSequence getText(java.lang.String p0, int p1, android.content.pm.ApplicationInfo p2) { return null; }
    public android.content.res.XmlResourceParser getXml(java.lang.String p0, int p1, android.content.pm.ApplicationInfo p2) { return null; }
    public java.lang.CharSequence getApplicationLabel(android.content.pm.ApplicationInfo p0) { return null; }
    public android.content.pm.PackageInfo getPackageArchiveInfo(java.lang.String p0, int p1) { return null; }
    public int installExistingPackage(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    public int installExistingPackage(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    public int installExistingPackageAsUser(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    private int installExistingPackageAsUser(java.lang.String p0, int p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    public void verifyPendingInstall(int p0, int p1) {}
    public void extendVerificationTimeout(int p0, int p1, long p2) {}
    public void verifyIntentFilter(int p0, int p1, java.util.List<java.lang.String> p2) {}
    public int getIntentVerificationStatusAsUser(java.lang.String p0, int p1) { return 0; }
    public boolean updateIntentVerificationStatusAsUser(java.lang.String p0, int p1, int p2) { return false; }
    public java.util.List<android.content.pm.IntentFilterVerificationInfo> getIntentFilterVerifications(java.lang.String p0) { return null; }
    public java.util.List<android.content.IntentFilter> getAllIntentFilters(java.lang.String p0) { return null; }
    public java.lang.String getDefaultBrowserPackageNameAsUser(int p0) { return null; }
    public boolean setDefaultBrowserPackageNameAsUser(java.lang.String p0, int p1) { return false; }
    public void setInstallerPackageName(java.lang.String p0, java.lang.String p1) {}
    public void setUpdateAvailable(java.lang.String p0, boolean p1) {}
    public java.lang.String getInstallerPackageName(java.lang.String p0) { return null; }
    public android.content.pm.InstallSourceInfo getInstallSourceInfo(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public int getMoveStatus(int p0) { return 0; }
    public void registerMoveCallback(android.content.pm.PackageManager.MoveCallback p0, android.os.Handler p1) {}
    public void unregisterMoveCallback(android.content.pm.PackageManager.MoveCallback p0) {}
    public int movePackage(java.lang.String p0, android.os.storage.VolumeInfo p1) { return 0; }
    public android.os.storage.VolumeInfo getPackageCurrentVolume(android.content.pm.ApplicationInfo p0) { return null; }
    protected android.os.storage.VolumeInfo getPackageCurrentVolume(android.content.pm.ApplicationInfo p0, android.os.storage.StorageManager p1) { return null; }
    public java.util.List<android.os.storage.VolumeInfo> getPackageCandidateVolumes(android.content.pm.ApplicationInfo p0) { return null; }
    protected java.util.List<android.os.storage.VolumeInfo> getPackageCandidateVolumes(android.content.pm.ApplicationInfo p0, android.os.storage.StorageManager p1, android.content.pm.IPackageManager p2) { return null; }
    protected boolean isForceAllowOnExternal(android.content.Context p0) { return false; }
    protected boolean isAllow3rdPartyOnInternal(android.content.Context p0) { return false; }
    private boolean isPackageCandidateVolume(android.app.ContextImpl p0, android.content.pm.ApplicationInfo p1, android.os.storage.VolumeInfo p2, android.content.pm.IPackageManager p3) { return false; }
    public int movePrimaryStorage(android.os.storage.VolumeInfo p0) { return 0; }
    public android.os.storage.VolumeInfo getPrimaryStorageCurrentVolume() { return null; }
    public java.util.List<android.os.storage.VolumeInfo> getPrimaryStorageCandidateVolumes() { return null; }
    private static boolean isPrimaryStorageCandidateVolume(android.os.storage.VolumeInfo p0) { return false; }
    public void deletePackage(java.lang.String p0, android.content.pm.IPackageDeleteObserver p1, int p2) {}
    public void deletePackageAsUser(java.lang.String p0, android.content.pm.IPackageDeleteObserver p1, int p2, int p3) {}
    public void clearApplicationUserData(java.lang.String p0, android.content.pm.IPackageDataObserver p1) {}
    public void deleteApplicationCacheFiles(java.lang.String p0, android.content.pm.IPackageDataObserver p1) {}
    public void deleteApplicationCacheFilesAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDataObserver p2) {}
    public void freeStorageAndNotify(java.lang.String p0, long p1, android.content.pm.IPackageDataObserver p2) {}
    public void freeStorage(java.lang.String p0, long p1, android.content.IntentSender p2) {}
    public java.lang.String[] setDistractingPackageRestrictions(java.lang.String[] p0, int p1) { return null; }
    public java.lang.String[] setPackagesSuspended(java.lang.String[] p0, boolean p1, android.os.PersistableBundle p2, android.os.PersistableBundle p3, java.lang.String p4) { return null; }
    public java.lang.String[] setPackagesSuspended(java.lang.String[] p0, boolean p1, android.os.PersistableBundle p2, android.os.PersistableBundle p3, android.content.pm.SuspendDialogInfo p4) { return null; }
    public java.lang.String[] getUnsuspendablePackages(java.lang.String[] p0) { return null; }
    public android.os.Bundle getSuspendedPackageAppExtras() { return null; }
    public boolean isPackageSuspendedForUser(java.lang.String p0, int p1) { return false; }
    public boolean isPackageSuspended(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return false; }
    public boolean isPackageSuspended() { return false; }
    public void setApplicationCategoryHint(java.lang.String p0, int p1) {}
    public void getPackageSizeInfoAsUser(java.lang.String p0, int p1, android.content.pm.IPackageStatsObserver p2) {}
    public void addPackageToPreferred(java.lang.String p0) {}
    public void removePackageFromPreferred(java.lang.String p0) {}
    public java.util.List<android.content.pm.PackageInfo> getPreferredPackages(int p0) { return null; }
    public void addPreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3) {}
    public void addPreferredActivityAsUser(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) {}
    public void replacePreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3) {}
    public void replacePreferredActivityAsUser(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) {}
    public void clearPackagePreferredActivities(java.lang.String p0) {}
    public void addUniquePreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3) {}
    public int getPreferredActivities(java.util.List<android.content.IntentFilter> p0, java.util.List<android.content.ComponentName> p1, java.lang.String p2) { return 0; }
    public android.content.ComponentName getHomeActivities(java.util.List<android.content.pm.ResolveInfo> p0) { return null; }
    public void setSyntheticAppDetailsActivityEnabled(java.lang.String p0, boolean p1) {}
    public boolean getSyntheticAppDetailsActivityEnabled(java.lang.String p0) { return false; }
    public void setComponentEnabledSetting(android.content.ComponentName p0, int p1, int p2) {}
    public int getComponentEnabledSetting(android.content.ComponentName p0) { return 0; }
    public void setApplicationEnabledSetting(java.lang.String p0, int p1, int p2) {}
    public int getApplicationEnabledSetting(java.lang.String p0) { return 0; }
    public void flushPackageRestrictionsAsUser(int p0) {}
    public boolean setApplicationHiddenSettingAsUser(java.lang.String p0, boolean p1, android.os.UserHandle p2) { return false; }
    public boolean getApplicationHiddenSettingAsUser(java.lang.String p0, android.os.UserHandle p1) { return false; }
    public void setSystemAppState(java.lang.String p0, int p1) {}
    public android.content.pm.KeySet getKeySetByAlias(java.lang.String p0, java.lang.String p1) { return null; }
    public android.content.pm.KeySet getSigningKeySet(java.lang.String p0) { return null; }
    public boolean isSignedBy(java.lang.String p0, android.content.pm.KeySet p1) { return false; }
    public boolean isSignedByExactly(java.lang.String p0, android.content.pm.KeySet p1) { return false; }
    public android.content.pm.VerifierDeviceIdentity getVerifierDeviceIdentity() { return null; }
    public boolean isUpgrade() { return false; }
    public boolean isDeviceUpgrading() { return false; }
    public android.content.pm.PackageInstaller getPackageInstaller() { return null; }
    public boolean isPackageAvailable(java.lang.String p0) { return false; }
    public void addCrossProfileIntentFilter(android.content.IntentFilter p0, int p1, int p2, int p3) {}
    public void clearCrossProfileIntentFilters(int p0) {}
    public android.graphics.drawable.Drawable loadItemIcon(android.content.pm.PackageItemInfo p0, android.content.pm.ApplicationInfo p1) { return null; }
    public android.graphics.drawable.Drawable loadUnbadgedItemIcon(android.content.pm.PackageItemInfo p0, android.content.pm.ApplicationInfo p1) { return null; }
    private android.graphics.drawable.Drawable getBadgedDrawable(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, android.graphics.Rect p2, boolean p3) { return null; }
    private boolean hasUserBadge(int p0) { return false; }
    public int getInstallReason(java.lang.String p0, android.os.UserHandle p1) { return 0; }
    public boolean canRequestPackageInstalls() { return false; }
    public android.content.ComponentName getInstantAppResolverSettingsComponent() { return null; }
    public android.content.ComponentName getInstantAppInstallerComponent() { return null; }
    public java.lang.String getInstantAppAndroidId(java.lang.String p0, android.os.UserHandle p1) { return null; }
    public void registerDexModule(java.lang.String p0, android.content.pm.PackageManager.DexModuleRegisterCallback p1) {}
    public java.lang.CharSequence getHarmfulAppWarning(java.lang.String p0) { return null; }
    public void setHarmfulAppWarning(java.lang.String p0, java.lang.CharSequence p1) {}
    public android.content.pm.dex.ArtManager getArtManager() { return null; }
    public java.lang.String getDefaultTextClassifierPackageName() { return null; }
    public java.lang.String getSystemTextClassifierPackageName() { return null; }
    public java.lang.String getAttentionServicePackageName() { return null; }
    public java.lang.String getRotationResolverPackageName() { return null; }
    public java.lang.String getWellbeingPackageName() { return null; }
    public java.lang.String getAppPredictionServicePackageName() { return null; }
    public java.lang.String getSystemCaptionsServicePackageName() { return null; }
    public java.lang.String getSetupWizardPackageName() { return null; }
    public java.lang.String getIncidentReportApproverPackageName() { return null; }
    public java.lang.String getContentCaptureServicePackageName() { return null; }
    public boolean isPackageStateProtected(java.lang.String p0, int p1) { return false; }
    public void sendDeviceCustomizationReadyBroadcast() {}
    public boolean isAutoRevokeWhitelisted() { return false; }
    public void setMimeGroup(java.lang.String p0, java.util.Set<java.lang.String> p1) {}
    public java.util.Set<java.lang.String> getMimeGroup(java.lang.String p0) { return null; }
    public android.content.pm.PackageManager.Property getProperty(java.lang.String p0, java.lang.String p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.pm.PackageManager.Property getProperty(java.lang.String p0, android.content.ComponentName p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public java.util.List<android.content.pm.PackageManager.Property> queryApplicationProperty(java.lang.String p0) { return null; }
    public java.util.List<android.content.pm.PackageManager.Property> queryActivityProperty(java.lang.String p0) { return null; }
    public java.util.List<android.content.pm.PackageManager.Property> queryProviderProperty(java.lang.String p0) { return null; }
    public java.util.List<android.content.pm.PackageManager.Property> queryReceiverProperty(java.lang.String p0) { return null; }
    public java.util.List<android.content.pm.PackageManager.Property> queryServiceProperty(java.lang.String p0) { return null; }

    private static class DexModuleRegisterCallbackDelegate extends android.content.pm.IDexModuleRegisterCallback.Stub implements android.os.Handler.Callback {
        private static final int MSG_DEX_MODULE_REGISTERED = 1;
        private final android.content.pm.PackageManager.DexModuleRegisterCallback callback = null;
        private final android.os.Handler mHandler = null;
        DexModuleRegisterCallbackDelegate(android.content.pm.PackageManager.DexModuleRegisterCallback p0) { super(); }
        public void onDexModuleRegistered(java.lang.String p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
        public boolean handleMessage(android.os.Message p0) { return false; }
    }

    private static class DexModuleRegisterResult {
        final java.lang.String dexModulePath = null;
        final boolean success = false;
        final java.lang.String message = null;
        private DexModuleRegisterResult(java.lang.String p0, boolean p1, java.lang.String p2) {}
    }

    private static class GetPackagesForUidResult {
        private final java.lang.String[] mValue = null;
        GetPackagesForUidResult(java.lang.String[] p0) {}
        public java.lang.String[] value() { return null; }
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    private static final class HasSystemFeatureQuery {
        public final java.lang.String name = null;
        public final int version = 0;
        public HasSystemFeatureQuery(java.lang.String p0, int p1) {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static class MoveCallbackDelegate extends android.content.pm.IPackageMoveObserver.Stub implements android.os.Handler.Callback {
        private static final int MSG_CREATED = 1;
        private static final int MSG_STATUS_CHANGED = 2;
        final android.content.pm.PackageManager.MoveCallback mCallback = null;
        final android.os.Handler mHandler = null;
        public MoveCallbackDelegate(android.content.pm.PackageManager.MoveCallback p0, android.os.Looper p1) { super(); }
        public boolean handleMessage(android.os.Message p0) { return false; }
        public void onCreated(int p0, android.os.Bundle p1) {}
        public void onStatusChanged(int p0, int p1, long p2) {}
    }

    private static final class ResourceName {
        final java.lang.String packageName = null;
        final int iconId = 0;
        ResourceName(java.lang.String p0, int p1) {}
        ResourceName(android.content.pm.ApplicationInfo p0, int p1) {}
        ResourceName(android.content.pm.ComponentInfo p0, int p1) {}
        ResourceName(android.content.pm.ResolveInfo p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
