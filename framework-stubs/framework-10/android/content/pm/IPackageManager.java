package android.content.pm;

public interface IPackageManager extends android.os.IInterface {
    public void checkPackageStartable(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean isPackageAvailable(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.PackageInfo getPackageInfo(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public android.content.pm.PackageInfo getPackageInfoVersioned(android.content.pm.VersionedPackage p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getPackageUid(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public int[] getPackageGids(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] currentToCanonicalPackageNames(java.lang.String[] p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] canonicalToCurrentPackageNames(java.lang.String[] p0) throws android.os.RemoteException;
    public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryPermissionsByGroup(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAllPermissionGroups(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException;
    public boolean activitySupportsIntent(android.content.ComponentName p0, android.content.Intent p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int checkUidPermission(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean addPermission(android.content.pm.PermissionInfo p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void removePermission(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void resetRuntimePermissions() throws android.os.RemoteException;
    public int getPermissionFlags(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, boolean p4, int p5) throws android.os.RemoteException;
    public void updatePermissionFlagsForAllApps(int p0, int p1, int p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getWhitelistedRestrictedPermissions(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean addWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public boolean removeWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public boolean shouldShowRequestPermissionRationale(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean isProtectedBroadcast(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int checkSignatures(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int checkUidSignatures(int p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllPackages() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getPackagesForUid(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getNameForUid(int p0) throws android.os.RemoteException;
    public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getUidForSharedUser(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getFlagsForUid(int p0) throws android.os.RemoteException;
    public int getPrivateFlagsForUid(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean isUidPrivileged(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getAppOpPermissionPackages(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ResolveInfo resolveIntent(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ResolveInfo findPersistentPreferredActivity(android.content.Intent p0, int p1) throws android.os.RemoteException;
    public boolean canForwardTo(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ParceledListSlice queryIntentActivities(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentActivityOptions(android.content.ComponentName p0, android.content.Intent[] p1, java.lang.String[] p2, android.content.Intent p3, java.lang.String p4, int p5, int p6) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentReceivers(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ResolveInfo resolveService(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentServices(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentContentProviders(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ParceledListSlice getInstalledPackages(int p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getPackagesHoldingPermissions(java.lang.String[] p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ParceledListSlice getInstalledApplications(int p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getPersistentApplications(int p0) throws android.os.RemoteException;
    public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void querySyncProviders(java.util.List<java.lang.String> p0, java.util.List<android.content.pm.ProviderInfo> p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryContentProviders(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.InstrumentationInfo getInstrumentationInfo(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ParceledListSlice queryInstrumentation(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void finishPackageInstall(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setInstallerPackageName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setApplicationCategoryHint(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void deletePackageAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDeleteObserver p2, int p3, int p4) throws android.os.RemoteException;
    public void deletePackageVersioned(android.content.pm.VersionedPackage p0, android.content.pm.IPackageDeleteObserver2 p1, int p2, int p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getInstallerPackageName(java.lang.String p0) throws android.os.RemoteException;
    public void resetApplicationPreferences(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ResolveInfo getLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2, android.content.IntentFilter p3, int p4, android.content.ComponentName p5) throws android.os.RemoteException;
    public void addPreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void replacePreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void clearPackagePreferredActivities(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getPreferredActivities(java.util.List<android.content.IntentFilter> p0, java.util.List<android.content.ComponentName> p1, java.lang.String p2) throws android.os.RemoteException;
    public void addPersistentPreferredActivity(android.content.IntentFilter p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException;
    public void clearPackagePersistentPreferredActivities(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void addCrossProfileIntentFilter(android.content.IntentFilter p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void clearCrossProfileIntentFilters(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String[] setDistractingPackageRestrictionsAsUser(java.lang.String[] p0, int p1, int p2) throws android.os.RemoteException;
    public java.lang.String[] setPackagesSuspendedAsUser(java.lang.String[] p0, boolean p1, android.os.PersistableBundle p2, android.os.PersistableBundle p3, android.content.pm.SuspendDialogInfo p4, java.lang.String p5, int p6) throws android.os.RemoteException;
    public java.lang.String[] getUnsuspendablePackagesForUser(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public boolean isPackageSuspendedForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.os.PersistableBundle getSuspendedPackageAppExtras(java.lang.String p0, int p1) throws android.os.RemoteException;
    public byte[] getPreferredActivityBackup(int p0) throws android.os.RemoteException;
    public void restorePreferredActivities(byte[] p0, int p1) throws android.os.RemoteException;
    public byte[] getDefaultAppsBackup(int p0) throws android.os.RemoteException;
    public void restoreDefaultApps(byte[] p0, int p1) throws android.os.RemoteException;
    public byte[] getIntentFilterVerificationBackup(int p0) throws android.os.RemoteException;
    public void restoreIntentFilterVerification(byte[] p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.ComponentName getHomeActivities(java.util.List<android.content.pm.ResolveInfo> p0) throws android.os.RemoteException;
    public void setHomeActivity(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setComponentEnabledSetting(android.content.ComponentName p0, int p1, int p2, int p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getComponentEnabledSetting(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setApplicationEnabledSetting(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getApplicationEnabledSetting(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void logAppProcessStartIfNeeded(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public void flushPackageRestrictionsAsUser(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setPackageStoppedState(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public void freeStorageAndNotify(java.lang.String p0, long p1, int p2, android.content.pm.IPackageDataObserver p3) throws android.os.RemoteException;
    public void freeStorage(java.lang.String p0, long p1, int p2, android.content.IntentSender p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void deleteApplicationCacheFiles(java.lang.String p0, android.content.pm.IPackageDataObserver p1) throws android.os.RemoteException;
    public void deleteApplicationCacheFilesAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDataObserver p2) throws android.os.RemoteException;
    public void clearApplicationUserData(java.lang.String p0, android.content.pm.IPackageDataObserver p1, int p2) throws android.os.RemoteException;
    public void clearApplicationProfileData(java.lang.String p0) throws android.os.RemoteException;
    public void getPackageSizeInfo(java.lang.String p0, int p1, android.content.pm.IPackageStatsObserver p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getSystemSharedLibraryNames() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getSystemAvailableFeatures() throws android.os.RemoteException;
    public boolean hasSystemFeature(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void enterSafeMode() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean isSafeMode() throws android.os.RemoteException;
    public void systemReady() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean hasSystemUidErrors() throws android.os.RemoteException;
    public void performFstrimIfNeeded() throws android.os.RemoteException;
    public void updatePackagesIfNeeded() throws android.os.RemoteException;
    public void notifyPackageUse(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void notifyDexLoad(java.lang.String p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.lang.String p3) throws android.os.RemoteException;
    public void registerDexModule(java.lang.String p0, java.lang.String p1, boolean p2, android.content.pm.IDexModuleRegisterCallback p3) throws android.os.RemoteException;
    public boolean performDexOptMode(java.lang.String p0, boolean p1, java.lang.String p2, boolean p3, boolean p4, java.lang.String p5) throws android.os.RemoteException;
    public boolean performDexOptSecondary(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public boolean compileLayouts(java.lang.String p0) throws android.os.RemoteException;
    public void dumpProfiles(java.lang.String p0) throws android.os.RemoteException;
    public void forceDexOpt(java.lang.String p0) throws android.os.RemoteException;
    public boolean runBackgroundDexoptJob(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void reconcileSecondaryDexFiles(java.lang.String p0) throws android.os.RemoteException;
    public int getMoveStatus(int p0) throws android.os.RemoteException;
    public void registerMoveCallback(android.content.pm.IPackageMoveObserver p0) throws android.os.RemoteException;
    public void unregisterMoveCallback(android.content.pm.IPackageMoveObserver p0) throws android.os.RemoteException;
    public int movePackage(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int movePrimaryStorage(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean addPermissionAsync(android.content.pm.PermissionInfo p0) throws android.os.RemoteException;
    public boolean setInstallLocation(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getInstallLocation() throws android.os.RemoteException;
    public int installExistingPackageAsUser(java.lang.String p0, int p1, int p2, int p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException;
    public void verifyPendingInstall(int p0, int p1) throws android.os.RemoteException;
    public void extendVerificationTimeout(int p0, int p1, long p2) throws android.os.RemoteException;
    public void verifyIntentFilter(int p0, int p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public int getIntentVerificationStatus(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean updateIntentVerificationStatus(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getIntentFilterVerifications(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAllIntentFilters(java.lang.String p0) throws android.os.RemoteException;
    public boolean setDefaultBrowserPackageName(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.lang.String getDefaultBrowserPackageName(int p0) throws android.os.RemoteException;
    public android.content.pm.VerifierDeviceIdentity getVerifierDeviceIdentity() throws android.os.RemoteException;
    public boolean isFirstBoot() throws android.os.RemoteException;
    public boolean isOnlyCoreApps() throws android.os.RemoteException;
    public boolean isDeviceUpgrading() throws android.os.RemoteException;
    public void setPermissionEnforced(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean isPermissionEnforced(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean isStorageLow() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean setApplicationHiddenSettingAsUser(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean getApplicationHiddenSettingAsUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setSystemAppHiddenUntilInstalled(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean setSystemAppInstallState(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.IPackageInstaller getPackageInstaller() throws android.os.RemoteException;
    public boolean setBlockUninstallForUser(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean getBlockUninstallForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.KeySet getKeySetByAlias(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.KeySet getSigningKeySet(java.lang.String p0) throws android.os.RemoteException;
    public boolean isPackageSignedByKeySet(java.lang.String p0, android.content.pm.KeySet p1) throws android.os.RemoteException;
    public boolean isPackageSignedByKeySetExactly(java.lang.String p0, android.content.pm.KeySet p1) throws android.os.RemoteException;
    public void addOnPermissionsChangeListener(android.content.pm.IOnPermissionsChangeListener p0) throws android.os.RemoteException;
    public void removeOnPermissionsChangeListener(android.content.pm.IOnPermissionsChangeListener p0) throws android.os.RemoteException;
    public void grantDefaultPermissionsToEnabledCarrierApps(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void grantDefaultPermissionsToEnabledImsServices(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void grantDefaultPermissionsToEnabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void revokeDefaultPermissionsFromDisabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void grantDefaultPermissionsToActiveLuiApp(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void revokeDefaultPermissionsFromLuiApps(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getPermissionControllerPackageName() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getInstantApps(int p0) throws android.os.RemoteException;
    public byte[] getInstantAppCookie(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setInstantAppCookie(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException;
    public android.graphics.Bitmap getInstantAppIcon(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isInstantApp(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setRequiredForSystemUser(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setUpdateAvailable(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getServicesSystemSharedLibraryPackageName() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getSharedSystemSharedLibraryPackageName() throws android.os.RemoteException;
    public android.content.pm.ChangedPackages getChangedPackages(int p0, int p1) throws android.os.RemoteException;
    public boolean isPackageDeviceAdminOnAnyUser(java.lang.String p0) throws android.os.RemoteException;
    public int getInstallReason(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getSharedLibraries(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getDeclaredSharedLibraries(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean canRequestPackageInstalls(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void deletePreloadsFileCache() throws android.os.RemoteException;
    public android.content.ComponentName getInstantAppResolverComponent() throws android.os.RemoteException;
    public android.content.ComponentName getInstantAppResolverSettingsComponent() throws android.os.RemoteException;
    public android.content.ComponentName getInstantAppInstallerComponent() throws android.os.RemoteException;
    public java.lang.String getInstantAppAndroidId(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.dex.IArtManager getArtManager() throws android.os.RemoteException;
    public void setHarmfulAppWarning(java.lang.String p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException;
    public java.lang.CharSequence getHarmfulAppWarning(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasSigningCertificate(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException;
    public boolean hasUidSigningCertificate(int p0, byte[] p1, int p2) throws android.os.RemoteException;
    public java.lang.String getSystemTextClassifierPackageName() throws android.os.RemoteException;
    public java.lang.String getAttentionServicePackageName() throws android.os.RemoteException;
    public java.lang.String getWellbeingPackageName() throws android.os.RemoteException;
    public java.lang.String getAppPredictionServicePackageName() throws android.os.RemoteException;
    public java.lang.String getSystemCaptionsServicePackageName() throws android.os.RemoteException;
    public java.lang.String getIncidentReportApproverPackageName() throws android.os.RemoteException;
    public boolean isPackageStateProtected(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void sendDeviceCustomizationReadyBroadcast() throws android.os.RemoteException;
    public java.util.List<android.content.pm.ModuleInfo> getInstalledModules(int p0) throws android.os.RemoteException;
    public android.content.pm.ModuleInfo getModuleInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getRuntimePermissionsVersion(int p0) throws android.os.RemoteException;
    public void setRuntimePermissionsVersion(int p0, int p1) throws android.os.RemoteException;
    public void notifyPackagesReplacedReceived(java.lang.String[] p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageManager {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageManager";
        static final int TRANSACTION_checkPackageStartable = 1;
        static final int TRANSACTION_isPackageAvailable = 2;
        static final int TRANSACTION_getPackageInfo = 3;
        static final int TRANSACTION_getPackageInfoVersioned = 4;
        static final int TRANSACTION_getPackageUid = 5;
        static final int TRANSACTION_getPackageGids = 6;
        static final int TRANSACTION_currentToCanonicalPackageNames = 7;
        static final int TRANSACTION_canonicalToCurrentPackageNames = 8;
        static final int TRANSACTION_getPermissionInfo = 9;
        static final int TRANSACTION_queryPermissionsByGroup = 10;
        static final int TRANSACTION_getPermissionGroupInfo = 11;
        static final int TRANSACTION_getAllPermissionGroups = 12;
        static final int TRANSACTION_getApplicationInfo = 13;
        static final int TRANSACTION_getActivityInfo = 14;
        static final int TRANSACTION_activitySupportsIntent = 15;
        static final int TRANSACTION_getReceiverInfo = 16;
        static final int TRANSACTION_getServiceInfo = 17;
        static final int TRANSACTION_getProviderInfo = 18;
        static final int TRANSACTION_checkPermission = 19;
        static final int TRANSACTION_checkUidPermission = 20;
        static final int TRANSACTION_addPermission = 21;
        static final int TRANSACTION_removePermission = 22;
        static final int TRANSACTION_grantRuntimePermission = 23;
        static final int TRANSACTION_revokeRuntimePermission = 24;
        static final int TRANSACTION_resetRuntimePermissions = 25;
        static final int TRANSACTION_getPermissionFlags = 26;
        static final int TRANSACTION_updatePermissionFlags = 27;
        static final int TRANSACTION_updatePermissionFlagsForAllApps = 28;
        static final int TRANSACTION_getWhitelistedRestrictedPermissions = 29;
        static final int TRANSACTION_addWhitelistedRestrictedPermission = 30;
        static final int TRANSACTION_removeWhitelistedRestrictedPermission = 31;
        static final int TRANSACTION_shouldShowRequestPermissionRationale = 32;
        static final int TRANSACTION_isProtectedBroadcast = 33;
        static final int TRANSACTION_checkSignatures = 34;
        static final int TRANSACTION_checkUidSignatures = 35;
        static final int TRANSACTION_getAllPackages = 36;
        static final int TRANSACTION_getPackagesForUid = 37;
        static final int TRANSACTION_getNameForUid = 38;
        static final int TRANSACTION_getNamesForUids = 39;
        static final int TRANSACTION_getUidForSharedUser = 40;
        static final int TRANSACTION_getFlagsForUid = 41;
        static final int TRANSACTION_getPrivateFlagsForUid = 42;
        static final int TRANSACTION_isUidPrivileged = 43;
        static final int TRANSACTION_getAppOpPermissionPackages = 44;
        static final int TRANSACTION_resolveIntent = 45;
        static final int TRANSACTION_findPersistentPreferredActivity = 46;
        static final int TRANSACTION_canForwardTo = 47;
        static final int TRANSACTION_queryIntentActivities = 48;
        static final int TRANSACTION_queryIntentActivityOptions = 49;
        static final int TRANSACTION_queryIntentReceivers = 50;
        static final int TRANSACTION_resolveService = 51;
        static final int TRANSACTION_queryIntentServices = 52;
        static final int TRANSACTION_queryIntentContentProviders = 53;
        static final int TRANSACTION_getInstalledPackages = 54;
        static final int TRANSACTION_getPackagesHoldingPermissions = 55;
        static final int TRANSACTION_getInstalledApplications = 56;
        static final int TRANSACTION_getPersistentApplications = 57;
        static final int TRANSACTION_resolveContentProvider = 58;
        static final int TRANSACTION_querySyncProviders = 59;
        static final int TRANSACTION_queryContentProviders = 60;
        static final int TRANSACTION_getInstrumentationInfo = 61;
        static final int TRANSACTION_queryInstrumentation = 62;
        static final int TRANSACTION_finishPackageInstall = 63;
        static final int TRANSACTION_setInstallerPackageName = 64;
        static final int TRANSACTION_setApplicationCategoryHint = 65;
        static final int TRANSACTION_deletePackageAsUser = 66;
        static final int TRANSACTION_deletePackageVersioned = 67;
        static final int TRANSACTION_getInstallerPackageName = 68;
        static final int TRANSACTION_resetApplicationPreferences = 69;
        static final int TRANSACTION_getLastChosenActivity = 70;
        static final int TRANSACTION_setLastChosenActivity = 71;
        static final int TRANSACTION_addPreferredActivity = 72;
        static final int TRANSACTION_replacePreferredActivity = 73;
        static final int TRANSACTION_clearPackagePreferredActivities = 74;
        static final int TRANSACTION_getPreferredActivities = 75;
        static final int TRANSACTION_addPersistentPreferredActivity = 76;
        static final int TRANSACTION_clearPackagePersistentPreferredActivities = 77;
        static final int TRANSACTION_addCrossProfileIntentFilter = 78;
        static final int TRANSACTION_clearCrossProfileIntentFilters = 79;
        static final int TRANSACTION_setDistractingPackageRestrictionsAsUser = 80;
        static final int TRANSACTION_setPackagesSuspendedAsUser = 81;
        static final int TRANSACTION_getUnsuspendablePackagesForUser = 82;
        static final int TRANSACTION_isPackageSuspendedForUser = 83;
        static final int TRANSACTION_getSuspendedPackageAppExtras = 84;
        static final int TRANSACTION_getPreferredActivityBackup = 85;
        static final int TRANSACTION_restorePreferredActivities = 86;
        static final int TRANSACTION_getDefaultAppsBackup = 87;
        static final int TRANSACTION_restoreDefaultApps = 88;
        static final int TRANSACTION_getIntentFilterVerificationBackup = 89;
        static final int TRANSACTION_restoreIntentFilterVerification = 90;
        static final int TRANSACTION_getHomeActivities = 91;
        static final int TRANSACTION_setHomeActivity = 92;
        static final int TRANSACTION_setComponentEnabledSetting = 93;
        static final int TRANSACTION_getComponentEnabledSetting = 94;
        static final int TRANSACTION_setApplicationEnabledSetting = 95;
        static final int TRANSACTION_getApplicationEnabledSetting = 96;
        static final int TRANSACTION_logAppProcessStartIfNeeded = 97;
        static final int TRANSACTION_flushPackageRestrictionsAsUser = 98;
        static final int TRANSACTION_setPackageStoppedState = 99;
        static final int TRANSACTION_freeStorageAndNotify = 100;
        static final int TRANSACTION_freeStorage = 101;
        static final int TRANSACTION_deleteApplicationCacheFiles = 102;
        static final int TRANSACTION_deleteApplicationCacheFilesAsUser = 103;
        static final int TRANSACTION_clearApplicationUserData = 104;
        static final int TRANSACTION_clearApplicationProfileData = 105;
        static final int TRANSACTION_getPackageSizeInfo = 106;
        static final int TRANSACTION_getSystemSharedLibraryNames = 107;
        static final int TRANSACTION_getSystemAvailableFeatures = 108;
        static final int TRANSACTION_hasSystemFeature = 109;
        static final int TRANSACTION_enterSafeMode = 110;
        static final int TRANSACTION_isSafeMode = 111;
        static final int TRANSACTION_systemReady = 112;
        static final int TRANSACTION_hasSystemUidErrors = 113;
        static final int TRANSACTION_performFstrimIfNeeded = 114;
        static final int TRANSACTION_updatePackagesIfNeeded = 115;
        static final int TRANSACTION_notifyPackageUse = 116;
        static final int TRANSACTION_notifyDexLoad = 117;
        static final int TRANSACTION_registerDexModule = 118;
        static final int TRANSACTION_performDexOptMode = 119;
        static final int TRANSACTION_performDexOptSecondary = 120;
        static final int TRANSACTION_compileLayouts = 121;
        static final int TRANSACTION_dumpProfiles = 122;
        static final int TRANSACTION_forceDexOpt = 123;
        static final int TRANSACTION_runBackgroundDexoptJob = 124;
        static final int TRANSACTION_reconcileSecondaryDexFiles = 125;
        static final int TRANSACTION_getMoveStatus = 126;
        static final int TRANSACTION_registerMoveCallback = 127;
        static final int TRANSACTION_unregisterMoveCallback = 128;
        static final int TRANSACTION_movePackage = 129;
        static final int TRANSACTION_movePrimaryStorage = 130;
        static final int TRANSACTION_addPermissionAsync = 131;
        static final int TRANSACTION_setInstallLocation = 132;
        static final int TRANSACTION_getInstallLocation = 133;
        static final int TRANSACTION_installExistingPackageAsUser = 134;
        static final int TRANSACTION_verifyPendingInstall = 135;
        static final int TRANSACTION_extendVerificationTimeout = 136;
        static final int TRANSACTION_verifyIntentFilter = 137;
        static final int TRANSACTION_getIntentVerificationStatus = 138;
        static final int TRANSACTION_updateIntentVerificationStatus = 139;
        static final int TRANSACTION_getIntentFilterVerifications = 140;
        static final int TRANSACTION_getAllIntentFilters = 141;
        static final int TRANSACTION_setDefaultBrowserPackageName = 142;
        static final int TRANSACTION_getDefaultBrowserPackageName = 143;
        static final int TRANSACTION_getVerifierDeviceIdentity = 144;
        static final int TRANSACTION_isFirstBoot = 145;
        static final int TRANSACTION_isOnlyCoreApps = 146;
        static final int TRANSACTION_isDeviceUpgrading = 147;
        static final int TRANSACTION_setPermissionEnforced = 148;
        static final int TRANSACTION_isPermissionEnforced = 149;
        static final int TRANSACTION_isStorageLow = 150;
        static final int TRANSACTION_setApplicationHiddenSettingAsUser = 151;
        static final int TRANSACTION_getApplicationHiddenSettingAsUser = 152;
        static final int TRANSACTION_setSystemAppHiddenUntilInstalled = 153;
        static final int TRANSACTION_setSystemAppInstallState = 154;
        static final int TRANSACTION_getPackageInstaller = 155;
        static final int TRANSACTION_setBlockUninstallForUser = 156;
        static final int TRANSACTION_getBlockUninstallForUser = 157;
        static final int TRANSACTION_getKeySetByAlias = 158;
        static final int TRANSACTION_getSigningKeySet = 159;
        static final int TRANSACTION_isPackageSignedByKeySet = 160;
        static final int TRANSACTION_isPackageSignedByKeySetExactly = 161;
        static final int TRANSACTION_addOnPermissionsChangeListener = 162;
        static final int TRANSACTION_removeOnPermissionsChangeListener = 163;
        static final int TRANSACTION_grantDefaultPermissionsToEnabledCarrierApps = 164;
        static final int TRANSACTION_grantDefaultPermissionsToEnabledImsServices = 165;
        static final int TRANSACTION_grantDefaultPermissionsToEnabledTelephonyDataServices = 166;
        static final int TRANSACTION_revokeDefaultPermissionsFromDisabledTelephonyDataServices = 167;
        static final int TRANSACTION_grantDefaultPermissionsToActiveLuiApp = 168;
        static final int TRANSACTION_revokeDefaultPermissionsFromLuiApps = 169;
        static final int TRANSACTION_isPermissionRevokedByPolicy = 170;
        static final int TRANSACTION_getPermissionControllerPackageName = 171;
        static final int TRANSACTION_getInstantApps = 172;
        static final int TRANSACTION_getInstantAppCookie = 173;
        static final int TRANSACTION_setInstantAppCookie = 174;
        static final int TRANSACTION_getInstantAppIcon = 175;
        static final int TRANSACTION_isInstantApp = 176;
        static final int TRANSACTION_setRequiredForSystemUser = 177;
        static final int TRANSACTION_setUpdateAvailable = 178;
        static final int TRANSACTION_getServicesSystemSharedLibraryPackageName = 179;
        static final int TRANSACTION_getSharedSystemSharedLibraryPackageName = 180;
        static final int TRANSACTION_getChangedPackages = 181;
        static final int TRANSACTION_isPackageDeviceAdminOnAnyUser = 182;
        static final int TRANSACTION_getInstallReason = 183;
        static final int TRANSACTION_getSharedLibraries = 184;
        static final int TRANSACTION_getDeclaredSharedLibraries = 185;
        static final int TRANSACTION_canRequestPackageInstalls = 186;
        static final int TRANSACTION_deletePreloadsFileCache = 187;
        static final int TRANSACTION_getInstantAppResolverComponent = 188;
        static final int TRANSACTION_getInstantAppResolverSettingsComponent = 189;
        static final int TRANSACTION_getInstantAppInstallerComponent = 190;
        static final int TRANSACTION_getInstantAppAndroidId = 191;
        static final int TRANSACTION_getArtManager = 192;
        static final int TRANSACTION_setHarmfulAppWarning = 193;
        static final int TRANSACTION_getHarmfulAppWarning = 194;
        static final int TRANSACTION_hasSigningCertificate = 195;
        static final int TRANSACTION_hasUidSigningCertificate = 196;
        static final int TRANSACTION_getSystemTextClassifierPackageName = 197;
        static final int TRANSACTION_getAttentionServicePackageName = 198;
        static final int TRANSACTION_getWellbeingPackageName = 199;
        static final int TRANSACTION_getAppPredictionServicePackageName = 200;
        static final int TRANSACTION_getSystemCaptionsServicePackageName = 201;
        static final int TRANSACTION_getIncidentReportApproverPackageName = 202;
        static final int TRANSACTION_isPackageStateProtected = 203;
        static final int TRANSACTION_sendDeviceCustomizationReadyBroadcast = 204;
        static final int TRANSACTION_getInstalledModules = 205;
        static final int TRANSACTION_getModuleInfo = 206;
        static final int TRANSACTION_getRuntimePermissionsVersion = 207;
        static final int TRANSACTION_setRuntimePermissionsVersion = 208;
        static final int TRANSACTION_notifyPackagesReplacedReceived = 209;
        public Stub() { super(); }
        public static android.content.pm.IPackageManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IPackageManager p0) { return false; }
        public static android.content.pm.IPackageManager getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IPackageManager {
            private android.os.IBinder mRemote;
            public static android.content.pm.IPackageManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void checkPackageStartable(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean isPackageAvailable(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.content.pm.PackageInfo getPackageInfo(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.PackageInfo getPackageInfoVersioned(android.content.pm.VersionedPackage p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public int getPackageUid(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public int[] getPackageGids(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public java.lang.String[] currentToCanonicalPackageNames(java.lang.String[] p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] canonicalToCurrentPackageNames(java.lang.String[] p0) throws android.os.RemoteException { return null; }
            public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryPermissionsByGroup(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getAllPermissionGroups(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public boolean activitySupportsIntent(android.content.ComponentName p0, android.content.Intent p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public int checkUidPermission(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public boolean addPermission(android.content.pm.PermissionInfo p0) throws android.os.RemoteException { return false; }
            public void removePermission(java.lang.String p0) throws android.os.RemoteException {}
            public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void resetRuntimePermissions() throws android.os.RemoteException {}
            public int getPermissionFlags(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, boolean p4, int p5) throws android.os.RemoteException {}
            public void updatePermissionFlagsForAllApps(int p0, int p1, int p2) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getWhitelistedRestrictedPermissions(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public boolean addWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public boolean removeWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public boolean shouldShowRequestPermissionRationale(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isProtectedBroadcast(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int checkSignatures(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int checkUidSignatures(int p0, int p1) throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getAllPackages() throws android.os.RemoteException { return null; }
            public java.lang.String[] getPackagesForUid(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getNameForUid(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException { return null; }
            public int getUidForSharedUser(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getFlagsForUid(int p0) throws android.os.RemoteException { return 0; }
            public int getPrivateFlagsForUid(int p0) throws android.os.RemoteException { return 0; }
            public boolean isUidPrivileged(int p0) throws android.os.RemoteException { return false; }
            public java.lang.String[] getAppOpPermissionPackages(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ResolveInfo resolveIntent(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ResolveInfo findPersistentPreferredActivity(android.content.Intent p0, int p1) throws android.os.RemoteException { return null; }
            public boolean canForwardTo(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public android.content.pm.ParceledListSlice queryIntentActivities(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryIntentActivityOptions(android.content.ComponentName p0, android.content.Intent[] p1, java.lang.String[] p2, android.content.Intent p3, java.lang.String p4, int p5, int p6) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryIntentReceivers(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ResolveInfo resolveService(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryIntentServices(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryIntentContentProviders(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getInstalledPackages(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getPackagesHoldingPermissions(java.lang.String[] p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getInstalledApplications(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getPersistentApplications(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public void querySyncProviders(java.util.List<java.lang.String> p0, java.util.List<android.content.pm.ProviderInfo> p1) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice queryContentProviders(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.content.pm.InstrumentationInfo getInstrumentationInfo(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryInstrumentation(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void finishPackageInstall(int p0, boolean p1) throws android.os.RemoteException {}
            public void setInstallerPackageName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setApplicationCategoryHint(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void deletePackageAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDeleteObserver p2, int p3, int p4) throws android.os.RemoteException {}
            public void deletePackageVersioned(android.content.pm.VersionedPackage p0, android.content.pm.IPackageDeleteObserver2 p1, int p2, int p3) throws android.os.RemoteException {}
            public java.lang.String getInstallerPackageName(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void resetApplicationPreferences(int p0) throws android.os.RemoteException {}
            public android.content.pm.ResolveInfo getLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public void setLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2, android.content.IntentFilter p3, int p4, android.content.ComponentName p5) throws android.os.RemoteException {}
            public void addPreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) throws android.os.RemoteException {}
            public void replacePreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) throws android.os.RemoteException {}
            public void clearPackagePreferredActivities(java.lang.String p0) throws android.os.RemoteException {}
            public int getPreferredActivities(java.util.List<android.content.IntentFilter> p0, java.util.List<android.content.ComponentName> p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void addPersistentPreferredActivity(android.content.IntentFilter p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
            public void clearPackagePersistentPreferredActivities(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void addCrossProfileIntentFilter(android.content.IntentFilter p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void clearCrossProfileIntentFilters(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.lang.String[] setDistractingPackageRestrictionsAsUser(java.lang.String[] p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public java.lang.String[] setPackagesSuspendedAsUser(java.lang.String[] p0, boolean p1, android.os.PersistableBundle p2, android.os.PersistableBundle p3, android.content.pm.SuspendDialogInfo p4, java.lang.String p5, int p6) throws android.os.RemoteException { return null; }
            public java.lang.String[] getUnsuspendablePackagesForUser(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
            public boolean isPackageSuspendedForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.os.PersistableBundle getSuspendedPackageAppExtras(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public byte[] getPreferredActivityBackup(int p0) throws android.os.RemoteException { return null; }
            public void restorePreferredActivities(byte[] p0, int p1) throws android.os.RemoteException {}
            public byte[] getDefaultAppsBackup(int p0) throws android.os.RemoteException { return null; }
            public void restoreDefaultApps(byte[] p0, int p1) throws android.os.RemoteException {}
            public byte[] getIntentFilterVerificationBackup(int p0) throws android.os.RemoteException { return null; }
            public void restoreIntentFilterVerification(byte[] p0, int p1) throws android.os.RemoteException {}
            public android.content.ComponentName getHomeActivities(java.util.List<android.content.pm.ResolveInfo> p0) throws android.os.RemoteException { return null; }
            public void setHomeActivity(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void setComponentEnabledSetting(android.content.ComponentName p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public int getComponentEnabledSetting(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return 0; }
            public void setApplicationEnabledSetting(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
            public int getApplicationEnabledSetting(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void logAppProcessStartIfNeeded(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
            public void flushPackageRestrictionsAsUser(int p0) throws android.os.RemoteException {}
            public void setPackageStoppedState(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void freeStorageAndNotify(java.lang.String p0, long p1, int p2, android.content.pm.IPackageDataObserver p3) throws android.os.RemoteException {}
            public void freeStorage(java.lang.String p0, long p1, int p2, android.content.IntentSender p3) throws android.os.RemoteException {}
            public void deleteApplicationCacheFiles(java.lang.String p0, android.content.pm.IPackageDataObserver p1) throws android.os.RemoteException {}
            public void deleteApplicationCacheFilesAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDataObserver p2) throws android.os.RemoteException {}
            public void clearApplicationUserData(java.lang.String p0, android.content.pm.IPackageDataObserver p1, int p2) throws android.os.RemoteException {}
            public void clearApplicationProfileData(java.lang.String p0) throws android.os.RemoteException {}
            public void getPackageSizeInfo(java.lang.String p0, int p1, android.content.pm.IPackageStatsObserver p2) throws android.os.RemoteException {}
            public java.lang.String[] getSystemSharedLibraryNames() throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getSystemAvailableFeatures() throws android.os.RemoteException { return null; }
            public boolean hasSystemFeature(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void enterSafeMode() throws android.os.RemoteException {}
            public boolean isSafeMode() throws android.os.RemoteException { return false; }
            public void systemReady() throws android.os.RemoteException {}
            public boolean hasSystemUidErrors() throws android.os.RemoteException { return false; }
            public void performFstrimIfNeeded() throws android.os.RemoteException {}
            public void updatePackagesIfNeeded() throws android.os.RemoteException {}
            public void notifyPackageUse(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void notifyDexLoad(java.lang.String p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.lang.String p3) throws android.os.RemoteException {}
            public void registerDexModule(java.lang.String p0, java.lang.String p1, boolean p2, android.content.pm.IDexModuleRegisterCallback p3) throws android.os.RemoteException {}
            public boolean performDexOptMode(java.lang.String p0, boolean p1, java.lang.String p2, boolean p3, boolean p4, java.lang.String p5) throws android.os.RemoteException { return false; }
            public boolean performDexOptSecondary(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean compileLayouts(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void dumpProfiles(java.lang.String p0) throws android.os.RemoteException {}
            public void forceDexOpt(java.lang.String p0) throws android.os.RemoteException {}
            public boolean runBackgroundDexoptJob(java.util.List<java.lang.String> p0) throws android.os.RemoteException { return false; }
            public void reconcileSecondaryDexFiles(java.lang.String p0) throws android.os.RemoteException {}
            public int getMoveStatus(int p0) throws android.os.RemoteException { return 0; }
            public void registerMoveCallback(android.content.pm.IPackageMoveObserver p0) throws android.os.RemoteException {}
            public void unregisterMoveCallback(android.content.pm.IPackageMoveObserver p0) throws android.os.RemoteException {}
            public int movePackage(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int movePrimaryStorage(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public boolean addPermissionAsync(android.content.pm.PermissionInfo p0) throws android.os.RemoteException { return false; }
            public boolean setInstallLocation(int p0) throws android.os.RemoteException { return false; }
            public int getInstallLocation() throws android.os.RemoteException { return 0; }
            public int installExistingPackageAsUser(java.lang.String p0, int p1, int p2, int p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException { return 0; }
            public void verifyPendingInstall(int p0, int p1) throws android.os.RemoteException {}
            public void extendVerificationTimeout(int p0, int p1, long p2) throws android.os.RemoteException {}
            public void verifyIntentFilter(int p0, int p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
            public int getIntentVerificationStatus(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public boolean updateIntentVerificationStatus(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public android.content.pm.ParceledListSlice getIntentFilterVerifications(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getAllIntentFilters(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean setDefaultBrowserPackageName(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public java.lang.String getDefaultBrowserPackageName(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.VerifierDeviceIdentity getVerifierDeviceIdentity() throws android.os.RemoteException { return null; }
            public boolean isFirstBoot() throws android.os.RemoteException { return false; }
            public boolean isOnlyCoreApps() throws android.os.RemoteException { return false; }
            public boolean isDeviceUpgrading() throws android.os.RemoteException { return false; }
            public void setPermissionEnforced(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public boolean isPermissionEnforced(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isStorageLow() throws android.os.RemoteException { return false; }
            public boolean setApplicationHiddenSettingAsUser(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
            public boolean getApplicationHiddenSettingAsUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void setSystemAppHiddenUntilInstalled(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public boolean setSystemAppInstallState(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
            public android.content.pm.IPackageInstaller getPackageInstaller() throws android.os.RemoteException { return null; }
            public boolean setBlockUninstallForUser(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
            public boolean getBlockUninstallForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.content.pm.KeySet getKeySetByAlias(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.pm.KeySet getSigningKeySet(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean isPackageSignedByKeySet(java.lang.String p0, android.content.pm.KeySet p1) throws android.os.RemoteException { return false; }
            public boolean isPackageSignedByKeySetExactly(java.lang.String p0, android.content.pm.KeySet p1) throws android.os.RemoteException { return false; }
            public void addOnPermissionsChangeListener(android.content.pm.IOnPermissionsChangeListener p0) throws android.os.RemoteException {}
            public void removeOnPermissionsChangeListener(android.content.pm.IOnPermissionsChangeListener p0) throws android.os.RemoteException {}
            public void grantDefaultPermissionsToEnabledCarrierApps(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public void grantDefaultPermissionsToEnabledImsServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public void grantDefaultPermissionsToEnabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public void revokeDefaultPermissionsFromDisabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public void grantDefaultPermissionsToActiveLuiApp(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void revokeDefaultPermissionsFromLuiApps(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public java.lang.String getPermissionControllerPackageName() throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getInstantApps(int p0) throws android.os.RemoteException { return null; }
            public byte[] getInstantAppCookie(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public boolean setInstantAppCookie(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException { return false; }
            public android.graphics.Bitmap getInstantAppIcon(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public boolean isInstantApp(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean setRequiredForSystemUser(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
            public void setUpdateAvailable(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public java.lang.String getServicesSystemSharedLibraryPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getSharedSystemSharedLibraryPackageName() throws android.os.RemoteException { return null; }
            public android.content.pm.ChangedPackages getChangedPackages(int p0, int p1) throws android.os.RemoteException { return null; }
            public boolean isPackageDeviceAdminOnAnyUser(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int getInstallReason(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public android.content.pm.ParceledListSlice getSharedLibraries(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getDeclaredSharedLibraries(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public boolean canRequestPackageInstalls(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void deletePreloadsFileCache() throws android.os.RemoteException {}
            public android.content.ComponentName getInstantAppResolverComponent() throws android.os.RemoteException { return null; }
            public android.content.ComponentName getInstantAppResolverSettingsComponent() throws android.os.RemoteException { return null; }
            public android.content.ComponentName getInstantAppInstallerComponent() throws android.os.RemoteException { return null; }
            public java.lang.String getInstantAppAndroidId(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.dex.IArtManager getArtManager() throws android.os.RemoteException { return null; }
            public void setHarmfulAppWarning(java.lang.String p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException {}
            public java.lang.CharSequence getHarmfulAppWarning(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public boolean hasSigningCertificate(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException { return false; }
            public boolean hasUidSigningCertificate(int p0, byte[] p1, int p2) throws android.os.RemoteException { return false; }
            public java.lang.String getSystemTextClassifierPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getAttentionServicePackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getWellbeingPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getAppPredictionServicePackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getSystemCaptionsServicePackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getIncidentReportApproverPackageName() throws android.os.RemoteException { return null; }
            public boolean isPackageStateProtected(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void sendDeviceCustomizationReadyBroadcast() throws android.os.RemoteException {}
            public java.util.List<android.content.pm.ModuleInfo> getInstalledModules(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ModuleInfo getModuleInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public int getRuntimePermissionsVersion(int p0) throws android.os.RemoteException { return 0; }
            public void setRuntimePermissionsVersion(int p0, int p1) throws android.os.RemoteException {}
            public void notifyPackagesReplacedReceived(java.lang.String[] p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.content.pm.IPackageManager {
        public Default() {}
        public void checkPackageStartable(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean isPackageAvailable(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.content.pm.PackageInfo getPackageInfo(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.PackageInfo getPackageInfoVersioned(android.content.pm.VersionedPackage p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public int getPackageUid(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public int[] getPackageGids(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public java.lang.String[] currentToCanonicalPackageNames(java.lang.String[] p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] canonicalToCurrentPackageNames(java.lang.String[] p0) throws android.os.RemoteException { return null; }
        public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryPermissionsByGroup(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getAllPermissionGroups(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public boolean activitySupportsIntent(android.content.ComponentName p0, android.content.Intent p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public int checkUidPermission(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public boolean addPermission(android.content.pm.PermissionInfo p0) throws android.os.RemoteException { return false; }
        public void removePermission(java.lang.String p0) throws android.os.RemoteException {}
        public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void resetRuntimePermissions() throws android.os.RemoteException {}
        public int getPermissionFlags(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, boolean p4, int p5) throws android.os.RemoteException {}
        public void updatePermissionFlagsForAllApps(int p0, int p1, int p2) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getWhitelistedRestrictedPermissions(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public boolean addWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public boolean removeWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public boolean shouldShowRequestPermissionRationale(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isProtectedBroadcast(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int checkSignatures(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int checkUidSignatures(int p0, int p1) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getAllPackages() throws android.os.RemoteException { return null; }
        public java.lang.String[] getPackagesForUid(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getNameForUid(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException { return null; }
        public int getUidForSharedUser(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getFlagsForUid(int p0) throws android.os.RemoteException { return 0; }
        public int getPrivateFlagsForUid(int p0) throws android.os.RemoteException { return 0; }
        public boolean isUidPrivileged(int p0) throws android.os.RemoteException { return false; }
        public java.lang.String[] getAppOpPermissionPackages(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ResolveInfo resolveIntent(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ResolveInfo findPersistentPreferredActivity(android.content.Intent p0, int p1) throws android.os.RemoteException { return null; }
        public boolean canForwardTo(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public android.content.pm.ParceledListSlice queryIntentActivities(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryIntentActivityOptions(android.content.ComponentName p0, android.content.Intent[] p1, java.lang.String[] p2, android.content.Intent p3, java.lang.String p4, int p5, int p6) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryIntentReceivers(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ResolveInfo resolveService(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryIntentServices(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryIntentContentProviders(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getInstalledPackages(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getPackagesHoldingPermissions(java.lang.String[] p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getInstalledApplications(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getPersistentApplications(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public void querySyncProviders(java.util.List<java.lang.String> p0, java.util.List<android.content.pm.ProviderInfo> p1) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice queryContentProviders(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.content.pm.InstrumentationInfo getInstrumentationInfo(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryInstrumentation(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void finishPackageInstall(int p0, boolean p1) throws android.os.RemoteException {}
        public void setInstallerPackageName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setApplicationCategoryHint(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void deletePackageAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDeleteObserver p2, int p3, int p4) throws android.os.RemoteException {}
        public void deletePackageVersioned(android.content.pm.VersionedPackage p0, android.content.pm.IPackageDeleteObserver2 p1, int p2, int p3) throws android.os.RemoteException {}
        public java.lang.String getInstallerPackageName(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void resetApplicationPreferences(int p0) throws android.os.RemoteException {}
        public android.content.pm.ResolveInfo getLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public void setLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2, android.content.IntentFilter p3, int p4, android.content.ComponentName p5) throws android.os.RemoteException {}
        public void addPreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) throws android.os.RemoteException {}
        public void replacePreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) throws android.os.RemoteException {}
        public void clearPackagePreferredActivities(java.lang.String p0) throws android.os.RemoteException {}
        public int getPreferredActivities(java.util.List<android.content.IntentFilter> p0, java.util.List<android.content.ComponentName> p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void addPersistentPreferredActivity(android.content.IntentFilter p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
        public void clearPackagePersistentPreferredActivities(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void addCrossProfileIntentFilter(android.content.IntentFilter p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void clearCrossProfileIntentFilters(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String[] setDistractingPackageRestrictionsAsUser(java.lang.String[] p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public java.lang.String[] setPackagesSuspendedAsUser(java.lang.String[] p0, boolean p1, android.os.PersistableBundle p2, android.os.PersistableBundle p3, android.content.pm.SuspendDialogInfo p4, java.lang.String p5, int p6) throws android.os.RemoteException { return null; }
        public java.lang.String[] getUnsuspendablePackagesForUser(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
        public boolean isPackageSuspendedForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.os.PersistableBundle getSuspendedPackageAppExtras(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public byte[] getPreferredActivityBackup(int p0) throws android.os.RemoteException { return null; }
        public void restorePreferredActivities(byte[] p0, int p1) throws android.os.RemoteException {}
        public byte[] getDefaultAppsBackup(int p0) throws android.os.RemoteException { return null; }
        public void restoreDefaultApps(byte[] p0, int p1) throws android.os.RemoteException {}
        public byte[] getIntentFilterVerificationBackup(int p0) throws android.os.RemoteException { return null; }
        public void restoreIntentFilterVerification(byte[] p0, int p1) throws android.os.RemoteException {}
        public android.content.ComponentName getHomeActivities(java.util.List<android.content.pm.ResolveInfo> p0) throws android.os.RemoteException { return null; }
        public void setHomeActivity(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void setComponentEnabledSetting(android.content.ComponentName p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public int getComponentEnabledSetting(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return 0; }
        public void setApplicationEnabledSetting(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
        public int getApplicationEnabledSetting(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void logAppProcessStartIfNeeded(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
        public void flushPackageRestrictionsAsUser(int p0) throws android.os.RemoteException {}
        public void setPackageStoppedState(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void freeStorageAndNotify(java.lang.String p0, long p1, int p2, android.content.pm.IPackageDataObserver p3) throws android.os.RemoteException {}
        public void freeStorage(java.lang.String p0, long p1, int p2, android.content.IntentSender p3) throws android.os.RemoteException {}
        public void deleteApplicationCacheFiles(java.lang.String p0, android.content.pm.IPackageDataObserver p1) throws android.os.RemoteException {}
        public void deleteApplicationCacheFilesAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDataObserver p2) throws android.os.RemoteException {}
        public void clearApplicationUserData(java.lang.String p0, android.content.pm.IPackageDataObserver p1, int p2) throws android.os.RemoteException {}
        public void clearApplicationProfileData(java.lang.String p0) throws android.os.RemoteException {}
        public void getPackageSizeInfo(java.lang.String p0, int p1, android.content.pm.IPackageStatsObserver p2) throws android.os.RemoteException {}
        public java.lang.String[] getSystemSharedLibraryNames() throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getSystemAvailableFeatures() throws android.os.RemoteException { return null; }
        public boolean hasSystemFeature(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void enterSafeMode() throws android.os.RemoteException {}
        public boolean isSafeMode() throws android.os.RemoteException { return false; }
        public void systemReady() throws android.os.RemoteException {}
        public boolean hasSystemUidErrors() throws android.os.RemoteException { return false; }
        public void performFstrimIfNeeded() throws android.os.RemoteException {}
        public void updatePackagesIfNeeded() throws android.os.RemoteException {}
        public void notifyPackageUse(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void notifyDexLoad(java.lang.String p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.lang.String p3) throws android.os.RemoteException {}
        public void registerDexModule(java.lang.String p0, java.lang.String p1, boolean p2, android.content.pm.IDexModuleRegisterCallback p3) throws android.os.RemoteException {}
        public boolean performDexOptMode(java.lang.String p0, boolean p1, java.lang.String p2, boolean p3, boolean p4, java.lang.String p5) throws android.os.RemoteException { return false; }
        public boolean performDexOptSecondary(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean compileLayouts(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void dumpProfiles(java.lang.String p0) throws android.os.RemoteException {}
        public void forceDexOpt(java.lang.String p0) throws android.os.RemoteException {}
        public boolean runBackgroundDexoptJob(java.util.List<java.lang.String> p0) throws android.os.RemoteException { return false; }
        public void reconcileSecondaryDexFiles(java.lang.String p0) throws android.os.RemoteException {}
        public int getMoveStatus(int p0) throws android.os.RemoteException { return 0; }
        public void registerMoveCallback(android.content.pm.IPackageMoveObserver p0) throws android.os.RemoteException {}
        public void unregisterMoveCallback(android.content.pm.IPackageMoveObserver p0) throws android.os.RemoteException {}
        public int movePackage(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int movePrimaryStorage(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public boolean addPermissionAsync(android.content.pm.PermissionInfo p0) throws android.os.RemoteException { return false; }
        public boolean setInstallLocation(int p0) throws android.os.RemoteException { return false; }
        public int getInstallLocation() throws android.os.RemoteException { return 0; }
        public int installExistingPackageAsUser(java.lang.String p0, int p1, int p2, int p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException { return 0; }
        public void verifyPendingInstall(int p0, int p1) throws android.os.RemoteException {}
        public void extendVerificationTimeout(int p0, int p1, long p2) throws android.os.RemoteException {}
        public void verifyIntentFilter(int p0, int p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public int getIntentVerificationStatus(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public boolean updateIntentVerificationStatus(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public android.content.pm.ParceledListSlice getIntentFilterVerifications(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getAllIntentFilters(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean setDefaultBrowserPackageName(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public java.lang.String getDefaultBrowserPackageName(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.VerifierDeviceIdentity getVerifierDeviceIdentity() throws android.os.RemoteException { return null; }
        public boolean isFirstBoot() throws android.os.RemoteException { return false; }
        public boolean isOnlyCoreApps() throws android.os.RemoteException { return false; }
        public boolean isDeviceUpgrading() throws android.os.RemoteException { return false; }
        public void setPermissionEnforced(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public boolean isPermissionEnforced(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isStorageLow() throws android.os.RemoteException { return false; }
        public boolean setApplicationHiddenSettingAsUser(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
        public boolean getApplicationHiddenSettingAsUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void setSystemAppHiddenUntilInstalled(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public boolean setSystemAppInstallState(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
        public android.content.pm.IPackageInstaller getPackageInstaller() throws android.os.RemoteException { return null; }
        public boolean setBlockUninstallForUser(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
        public boolean getBlockUninstallForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.content.pm.KeySet getKeySetByAlias(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.pm.KeySet getSigningKeySet(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean isPackageSignedByKeySet(java.lang.String p0, android.content.pm.KeySet p1) throws android.os.RemoteException { return false; }
        public boolean isPackageSignedByKeySetExactly(java.lang.String p0, android.content.pm.KeySet p1) throws android.os.RemoteException { return false; }
        public void addOnPermissionsChangeListener(android.content.pm.IOnPermissionsChangeListener p0) throws android.os.RemoteException {}
        public void removeOnPermissionsChangeListener(android.content.pm.IOnPermissionsChangeListener p0) throws android.os.RemoteException {}
        public void grantDefaultPermissionsToEnabledCarrierApps(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public void grantDefaultPermissionsToEnabledImsServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public void grantDefaultPermissionsToEnabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public void revokeDefaultPermissionsFromDisabledTelephonyDataServices(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public void grantDefaultPermissionsToActiveLuiApp(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void revokeDefaultPermissionsFromLuiApps(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public java.lang.String getPermissionControllerPackageName() throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getInstantApps(int p0) throws android.os.RemoteException { return null; }
        public byte[] getInstantAppCookie(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean setInstantAppCookie(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException { return false; }
        public android.graphics.Bitmap getInstantAppIcon(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean isInstantApp(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean setRequiredForSystemUser(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
        public void setUpdateAvailable(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public java.lang.String getServicesSystemSharedLibraryPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getSharedSystemSharedLibraryPackageName() throws android.os.RemoteException { return null; }
        public android.content.pm.ChangedPackages getChangedPackages(int p0, int p1) throws android.os.RemoteException { return null; }
        public boolean isPackageDeviceAdminOnAnyUser(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int getInstallReason(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public android.content.pm.ParceledListSlice getSharedLibraries(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getDeclaredSharedLibraries(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public boolean canRequestPackageInstalls(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void deletePreloadsFileCache() throws android.os.RemoteException {}
        public android.content.ComponentName getInstantAppResolverComponent() throws android.os.RemoteException { return null; }
        public android.content.ComponentName getInstantAppResolverSettingsComponent() throws android.os.RemoteException { return null; }
        public android.content.ComponentName getInstantAppInstallerComponent() throws android.os.RemoteException { return null; }
        public java.lang.String getInstantAppAndroidId(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.dex.IArtManager getArtManager() throws android.os.RemoteException { return null; }
        public void setHarmfulAppWarning(java.lang.String p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException {}
        public java.lang.CharSequence getHarmfulAppWarning(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean hasSigningCertificate(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException { return false; }
        public boolean hasUidSigningCertificate(int p0, byte[] p1, int p2) throws android.os.RemoteException { return false; }
        public java.lang.String getSystemTextClassifierPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getAttentionServicePackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getWellbeingPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getAppPredictionServicePackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getSystemCaptionsServicePackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getIncidentReportApproverPackageName() throws android.os.RemoteException { return null; }
        public boolean isPackageStateProtected(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void sendDeviceCustomizationReadyBroadcast() throws android.os.RemoteException {}
        public java.util.List<android.content.pm.ModuleInfo> getInstalledModules(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ModuleInfo getModuleInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public int getRuntimePermissionsVersion(int p0) throws android.os.RemoteException { return 0; }
        public void setRuntimePermissionsVersion(int p0, int p1) throws android.os.RemoteException {}
        public void notifyPackagesReplacedReceived(java.lang.String[] p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
