package android.content.pm;

public interface IPackageManager extends android.os.IInterface {
    public void checkPackageStartable(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isPackageAvailable(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.PackageInfo getPackageInfo(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public android.content.pm.PackageInfo getPackageInfoVersioned(android.content.pm.VersionedPackage p0, int p1, int p2) throws android.os.RemoteException;
    public int getPackageUid(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public int[] getPackageGids(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public java.lang.String[] currentToCanonicalPackageNames(java.lang.String[] p0) throws android.os.RemoteException;
    public java.lang.String[] canonicalToCurrentPackageNames(java.lang.String[] p0) throws android.os.RemoteException;
    public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException;
    public boolean activitySupportsIntent(android.content.ComponentName p0, android.content.Intent p1, java.lang.String p2) throws android.os.RemoteException;
    public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isProtectedBroadcast(java.lang.String p0) throws android.os.RemoteException;
    public int checkSignatures(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int checkUidSignatures(int p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllPackages() throws android.os.RemoteException;
    public java.lang.String[] getPackagesForUid(int p0) throws android.os.RemoteException;
    public java.lang.String getNameForUid(int p0) throws android.os.RemoteException;
    public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException;
    public int getUidForSharedUser(java.lang.String p0) throws android.os.RemoteException;
    public int getFlagsForUid(int p0) throws android.os.RemoteException;
    public int getPrivateFlagsForUid(int p0) throws android.os.RemoteException;
    public boolean isUidPrivileged(int p0) throws android.os.RemoteException;
    public android.content.pm.ResolveInfo resolveIntent(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ResolveInfo findPersistentPreferredActivity(android.content.Intent p0, int p1) throws android.os.RemoteException;
    public boolean canForwardTo(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentActivities(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentActivityOptions(android.content.ComponentName p0, android.content.Intent[] p1, java.lang.String[] p2, android.content.Intent p3, java.lang.String p4, int p5, int p6) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentReceivers(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ResolveInfo resolveService(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentServices(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentContentProviders(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getInstalledPackages(int p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getPackagesHoldingPermissions(java.lang.String[] p0, int p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getInstalledApplications(int p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getPersistentApplications(int p0) throws android.os.RemoteException;
    public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void querySyncProviders(java.util.List<java.lang.String> p0, java.util.List<android.content.pm.ProviderInfo> p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryContentProviders(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public android.content.pm.InstrumentationInfo getInstrumentationInfo(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryInstrumentation(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void finishPackageInstall(int p0, boolean p1) throws android.os.RemoteException;
    public void setInstallerPackageName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setApplicationCategoryHint(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void deletePackageAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDeleteObserver p2, int p3, int p4) throws android.os.RemoteException;
    public void deletePackageVersioned(android.content.pm.VersionedPackage p0, android.content.pm.IPackageDeleteObserver2 p1, int p2, int p3) throws android.os.RemoteException;
    public void deleteExistingPackageAsUser(android.content.pm.VersionedPackage p0, android.content.pm.IPackageDeleteObserver2 p1, int p2) throws android.os.RemoteException;
    public java.lang.String getInstallerPackageName(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.InstallSourceInfo getInstallSourceInfo(java.lang.String p0) throws android.os.RemoteException;
    public void resetApplicationPreferences(int p0) throws android.os.RemoteException;
    public android.content.pm.ResolveInfo getLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2, android.content.IntentFilter p3, int p4, android.content.ComponentName p5) throws android.os.RemoteException;
    public void addPreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) throws android.os.RemoteException;
    public void replacePreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) throws android.os.RemoteException;
    public void clearPackagePreferredActivities(java.lang.String p0) throws android.os.RemoteException;
    public int getPreferredActivities(java.util.List<android.content.IntentFilter> p0, java.util.List<android.content.ComponentName> p1, java.lang.String p2) throws android.os.RemoteException;
    public void addPersistentPreferredActivity(android.content.IntentFilter p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException;
    public void clearPackagePersistentPreferredActivities(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void addCrossProfileIntentFilter(android.content.IntentFilter p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void clearCrossProfileIntentFilters(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String[] setDistractingPackageRestrictionsAsUser(java.lang.String[] p0, int p1, int p2) throws android.os.RemoteException;
    public java.lang.String[] setPackagesSuspendedAsUser(java.lang.String[] p0, boolean p1, android.os.PersistableBundle p2, android.os.PersistableBundle p3, android.content.pm.SuspendDialogInfo p4, java.lang.String p5, int p6) throws android.os.RemoteException;
    public java.lang.String[] getUnsuspendablePackagesForUser(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public boolean isPackageSuspendedForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.os.Bundle getSuspendedPackageAppExtras(java.lang.String p0, int p1) throws android.os.RemoteException;
    public byte[] getPreferredActivityBackup(int p0) throws android.os.RemoteException;
    public void restorePreferredActivities(byte[] p0, int p1) throws android.os.RemoteException;
    public byte[] getDefaultAppsBackup(int p0) throws android.os.RemoteException;
    public void restoreDefaultApps(byte[] p0, int p1) throws android.os.RemoteException;
    public byte[] getIntentFilterVerificationBackup(int p0) throws android.os.RemoteException;
    public void restoreIntentFilterVerification(byte[] p0, int p1) throws android.os.RemoteException;
    public android.content.ComponentName getHomeActivities(java.util.List<android.content.pm.ResolveInfo> p0) throws android.os.RemoteException;
    public void setHomeActivity(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void overrideLabelAndIcon(android.content.ComponentName p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public void restoreLabelAndIcon(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setComponentEnabledSetting(android.content.ComponentName p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public int getComponentEnabledSetting(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setApplicationEnabledSetting(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public int getApplicationEnabledSetting(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void logAppProcessStartIfNeeded(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public void flushPackageRestrictionsAsUser(int p0) throws android.os.RemoteException;
    public void setPackageStoppedState(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public void freeStorageAndNotify(java.lang.String p0, long p1, int p2, android.content.pm.IPackageDataObserver p3) throws android.os.RemoteException;
    public void freeStorage(java.lang.String p0, long p1, int p2, android.content.IntentSender p3) throws android.os.RemoteException;
    public void deleteApplicationCacheFiles(java.lang.String p0, android.content.pm.IPackageDataObserver p1) throws android.os.RemoteException;
    public void deleteApplicationCacheFilesAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDataObserver p2) throws android.os.RemoteException;
    public void clearApplicationUserData(java.lang.String p0, android.content.pm.IPackageDataObserver p1, int p2) throws android.os.RemoteException;
    public void clearApplicationProfileData(java.lang.String p0) throws android.os.RemoteException;
    public void getPackageSizeInfo(java.lang.String p0, int p1, android.content.pm.IPackageStatsObserver p2) throws android.os.RemoteException;
    public java.lang.String[] getSystemSharedLibraryNames() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getSystemAvailableFeatures() throws android.os.RemoteException;
    public boolean hasSystemFeature(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void enterSafeMode() throws android.os.RemoteException;
    public boolean isSafeMode() throws android.os.RemoteException;
    public void systemReady() throws android.os.RemoteException;
    public boolean hasSystemUidErrors() throws android.os.RemoteException;
    public void performFstrimIfNeeded() throws android.os.RemoteException;
    public void updatePackagesIfNeeded() throws android.os.RemoteException;
    public void notifyPackageUse(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void notifyDexLoad(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1, java.lang.String p2) throws android.os.RemoteException;
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
    public boolean setInstallLocation(int p0) throws android.os.RemoteException;
    public int getInstallLocation() throws android.os.RemoteException;
    public int installExistingPackageAsUser(java.lang.String p0, int p1, int p2, int p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException;
    public void verifyPendingInstall(int p0, int p1) throws android.os.RemoteException;
    public void extendVerificationTimeout(int p0, int p1, long p2) throws android.os.RemoteException;
    public void verifyIntentFilter(int p0, int p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public int getIntentVerificationStatus(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean updateIntentVerificationStatus(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getIntentFilterVerifications(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAllIntentFilters(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.VerifierDeviceIdentity getVerifierDeviceIdentity() throws android.os.RemoteException;
    public boolean isFirstBoot() throws android.os.RemoteException;
    public boolean isOnlyCoreApps() throws android.os.RemoteException;
    public boolean isDeviceUpgrading() throws android.os.RemoteException;
    public boolean isStorageLow() throws android.os.RemoteException;
    public boolean setApplicationHiddenSettingAsUser(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean getApplicationHiddenSettingAsUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setSystemAppHiddenUntilInstalled(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean setSystemAppInstallState(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public android.content.pm.IPackageInstaller getPackageInstaller() throws android.os.RemoteException;
    public boolean setBlockUninstallForUser(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean getBlockUninstallForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.KeySet getKeySetByAlias(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.KeySet getSigningKeySet(java.lang.String p0) throws android.os.RemoteException;
    public boolean isPackageSignedByKeySet(java.lang.String p0, android.content.pm.KeySet p1) throws android.os.RemoteException;
    public boolean isPackageSignedByKeySetExactly(java.lang.String p0, android.content.pm.KeySet p1) throws android.os.RemoteException;
    public java.lang.String getPermissionControllerPackageName() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getInstantApps(int p0) throws android.os.RemoteException;
    public byte[] getInstantAppCookie(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setInstantAppCookie(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException;
    public android.graphics.Bitmap getInstantAppIcon(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isInstantApp(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setRequiredForSystemUser(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setUpdateAvailable(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public java.lang.String getServicesSystemSharedLibraryPackageName() throws android.os.RemoteException;
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
    public java.lang.String getDefaultTextClassifierPackageName() throws android.os.RemoteException;
    public java.lang.String getSystemTextClassifierPackageName() throws android.os.RemoteException;
    public java.lang.String getAttentionServicePackageName() throws android.os.RemoteException;
    public java.lang.String getWellbeingPackageName() throws android.os.RemoteException;
    public java.lang.String getAppPredictionServicePackageName() throws android.os.RemoteException;
    public java.lang.String getSystemCaptionsServicePackageName() throws android.os.RemoteException;
    public java.lang.String getSetupWizardPackageName() throws android.os.RemoteException;
    public java.lang.String getIncidentReportApproverPackageName() throws android.os.RemoteException;
    public java.lang.String getContentCaptureServicePackageName() throws android.os.RemoteException;
    public boolean isPackageStateProtected(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void sendDeviceCustomizationReadyBroadcast() throws android.os.RemoteException;
    public java.util.List<android.content.pm.ModuleInfo> getInstalledModules(int p0) throws android.os.RemoteException;
    public android.content.pm.ModuleInfo getModuleInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getRuntimePermissionsVersion(int p0) throws android.os.RemoteException;
    public void setRuntimePermissionsVersion(int p0, int p1) throws android.os.RemoteException;
    public void notifyPackagesReplacedReceived(java.lang.String[] p0) throws android.os.RemoteException;
    public java.lang.String[] getAppOpPermissionPackages(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean addPermission(android.content.pm.PermissionInfo p0) throws android.os.RemoteException;
    public boolean addPermissionAsync(android.content.pm.PermissionInfo p0) throws android.os.RemoteException;
    public void removePermission(java.lang.String p0) throws android.os.RemoteException;
    public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int checkUidPermission(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setMimeGroup(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getMimeGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isAutoRevokeWhitelisted(java.lang.String p0) throws android.os.RemoteException;
    public void grantImplicitAccess(int p0, java.lang.String p1) throws android.os.RemoteException;

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
        public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public boolean activitySupportsIntent(android.content.ComponentName p0, android.content.Intent p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
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
        public void deleteExistingPackageAsUser(android.content.pm.VersionedPackage p0, android.content.pm.IPackageDeleteObserver2 p1, int p2) throws android.os.RemoteException {}
        public java.lang.String getInstallerPackageName(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.InstallSourceInfo getInstallSourceInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
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
        public android.os.Bundle getSuspendedPackageAppExtras(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public byte[] getPreferredActivityBackup(int p0) throws android.os.RemoteException { return null; }
        public void restorePreferredActivities(byte[] p0, int p1) throws android.os.RemoteException {}
        public byte[] getDefaultAppsBackup(int p0) throws android.os.RemoteException { return null; }
        public void restoreDefaultApps(byte[] p0, int p1) throws android.os.RemoteException {}
        public byte[] getIntentFilterVerificationBackup(int p0) throws android.os.RemoteException { return null; }
        public void restoreIntentFilterVerification(byte[] p0, int p1) throws android.os.RemoteException {}
        public android.content.ComponentName getHomeActivities(java.util.List<android.content.pm.ResolveInfo> p0) throws android.os.RemoteException { return null; }
        public void setHomeActivity(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void overrideLabelAndIcon(android.content.ComponentName p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
        public void restoreLabelAndIcon(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
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
        public void notifyDexLoad(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1, java.lang.String p2) throws android.os.RemoteException {}
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
        public android.content.pm.VerifierDeviceIdentity getVerifierDeviceIdentity() throws android.os.RemoteException { return null; }
        public boolean isFirstBoot() throws android.os.RemoteException { return false; }
        public boolean isOnlyCoreApps() throws android.os.RemoteException { return false; }
        public boolean isDeviceUpgrading() throws android.os.RemoteException { return false; }
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
        public java.lang.String getDefaultTextClassifierPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getSystemTextClassifierPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getAttentionServicePackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getWellbeingPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getAppPredictionServicePackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getSystemCaptionsServicePackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getSetupWizardPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getIncidentReportApproverPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getContentCaptureServicePackageName() throws android.os.RemoteException { return null; }
        public boolean isPackageStateProtected(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void sendDeviceCustomizationReadyBroadcast() throws android.os.RemoteException {}
        public java.util.List<android.content.pm.ModuleInfo> getInstalledModules(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ModuleInfo getModuleInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public int getRuntimePermissionsVersion(int p0) throws android.os.RemoteException { return 0; }
        public void setRuntimePermissionsVersion(int p0, int p1) throws android.os.RemoteException {}
        public void notifyPackagesReplacedReceived(java.lang.String[] p0) throws android.os.RemoteException {}
        public java.lang.String[] getAppOpPermissionPackages(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean addPermission(android.content.pm.PermissionInfo p0) throws android.os.RemoteException { return false; }
        public boolean addPermissionAsync(android.content.pm.PermissionInfo p0) throws android.os.RemoteException { return false; }
        public void removePermission(java.lang.String p0) throws android.os.RemoteException {}
        public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public int checkUidPermission(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void setMimeGroup(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getMimeGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isAutoRevokeWhitelisted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void grantImplicitAccess(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

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
        static final int TRANSACTION_getApplicationInfo = 9;
        static final int TRANSACTION_getActivityInfo = 10;
        static final int TRANSACTION_activitySupportsIntent = 11;
        static final int TRANSACTION_getReceiverInfo = 12;
        static final int TRANSACTION_getServiceInfo = 13;
        static final int TRANSACTION_getProviderInfo = 14;
        static final int TRANSACTION_isProtectedBroadcast = 15;
        static final int TRANSACTION_checkSignatures = 16;
        static final int TRANSACTION_checkUidSignatures = 17;
        static final int TRANSACTION_getAllPackages = 18;
        static final int TRANSACTION_getPackagesForUid = 19;
        static final int TRANSACTION_getNameForUid = 20;
        static final int TRANSACTION_getNamesForUids = 21;
        static final int TRANSACTION_getUidForSharedUser = 22;
        static final int TRANSACTION_getFlagsForUid = 23;
        static final int TRANSACTION_getPrivateFlagsForUid = 24;
        static final int TRANSACTION_isUidPrivileged = 25;
        static final int TRANSACTION_resolveIntent = 26;
        static final int TRANSACTION_findPersistentPreferredActivity = 27;
        static final int TRANSACTION_canForwardTo = 28;
        static final int TRANSACTION_queryIntentActivities = 29;
        static final int TRANSACTION_queryIntentActivityOptions = 30;
        static final int TRANSACTION_queryIntentReceivers = 31;
        static final int TRANSACTION_resolveService = 32;
        static final int TRANSACTION_queryIntentServices = 33;
        static final int TRANSACTION_queryIntentContentProviders = 34;
        static final int TRANSACTION_getInstalledPackages = 35;
        static final int TRANSACTION_getPackagesHoldingPermissions = 36;
        static final int TRANSACTION_getInstalledApplications = 37;
        static final int TRANSACTION_getPersistentApplications = 38;
        static final int TRANSACTION_resolveContentProvider = 39;
        static final int TRANSACTION_querySyncProviders = 40;
        static final int TRANSACTION_queryContentProviders = 41;
        static final int TRANSACTION_getInstrumentationInfo = 42;
        static final int TRANSACTION_queryInstrumentation = 43;
        static final int TRANSACTION_finishPackageInstall = 44;
        static final int TRANSACTION_setInstallerPackageName = 45;
        static final int TRANSACTION_setApplicationCategoryHint = 46;
        static final int TRANSACTION_deletePackageAsUser = 47;
        static final int TRANSACTION_deletePackageVersioned = 48;
        static final int TRANSACTION_deleteExistingPackageAsUser = 49;
        static final int TRANSACTION_getInstallerPackageName = 50;
        static final int TRANSACTION_getInstallSourceInfo = 51;
        static final int TRANSACTION_resetApplicationPreferences = 52;
        static final int TRANSACTION_getLastChosenActivity = 53;
        static final int TRANSACTION_setLastChosenActivity = 54;
        static final int TRANSACTION_addPreferredActivity = 55;
        static final int TRANSACTION_replacePreferredActivity = 56;
        static final int TRANSACTION_clearPackagePreferredActivities = 57;
        static final int TRANSACTION_getPreferredActivities = 58;
        static final int TRANSACTION_addPersistentPreferredActivity = 59;
        static final int TRANSACTION_clearPackagePersistentPreferredActivities = 60;
        static final int TRANSACTION_addCrossProfileIntentFilter = 61;
        static final int TRANSACTION_clearCrossProfileIntentFilters = 62;
        static final int TRANSACTION_setDistractingPackageRestrictionsAsUser = 63;
        static final int TRANSACTION_setPackagesSuspendedAsUser = 64;
        static final int TRANSACTION_getUnsuspendablePackagesForUser = 65;
        static final int TRANSACTION_isPackageSuspendedForUser = 66;
        static final int TRANSACTION_getSuspendedPackageAppExtras = 67;
        static final int TRANSACTION_getPreferredActivityBackup = 68;
        static final int TRANSACTION_restorePreferredActivities = 69;
        static final int TRANSACTION_getDefaultAppsBackup = 70;
        static final int TRANSACTION_restoreDefaultApps = 71;
        static final int TRANSACTION_getIntentFilterVerificationBackup = 72;
        static final int TRANSACTION_restoreIntentFilterVerification = 73;
        static final int TRANSACTION_getHomeActivities = 74;
        static final int TRANSACTION_setHomeActivity = 75;
        static final int TRANSACTION_overrideLabelAndIcon = 76;
        static final int TRANSACTION_restoreLabelAndIcon = 77;
        static final int TRANSACTION_setComponentEnabledSetting = 78;
        static final int TRANSACTION_getComponentEnabledSetting = 79;
        static final int TRANSACTION_setApplicationEnabledSetting = 80;
        static final int TRANSACTION_getApplicationEnabledSetting = 81;
        static final int TRANSACTION_logAppProcessStartIfNeeded = 82;
        static final int TRANSACTION_flushPackageRestrictionsAsUser = 83;
        static final int TRANSACTION_setPackageStoppedState = 84;
        static final int TRANSACTION_freeStorageAndNotify = 85;
        static final int TRANSACTION_freeStorage = 86;
        static final int TRANSACTION_deleteApplicationCacheFiles = 87;
        static final int TRANSACTION_deleteApplicationCacheFilesAsUser = 88;
        static final int TRANSACTION_clearApplicationUserData = 89;
        static final int TRANSACTION_clearApplicationProfileData = 90;
        static final int TRANSACTION_getPackageSizeInfo = 91;
        static final int TRANSACTION_getSystemSharedLibraryNames = 92;
        static final int TRANSACTION_getSystemAvailableFeatures = 93;
        static final int TRANSACTION_hasSystemFeature = 94;
        static final int TRANSACTION_enterSafeMode = 95;
        static final int TRANSACTION_isSafeMode = 96;
        static final int TRANSACTION_systemReady = 97;
        static final int TRANSACTION_hasSystemUidErrors = 98;
        static final int TRANSACTION_performFstrimIfNeeded = 99;
        static final int TRANSACTION_updatePackagesIfNeeded = 100;
        static final int TRANSACTION_notifyPackageUse = 101;
        static final int TRANSACTION_notifyDexLoad = 102;
        static final int TRANSACTION_registerDexModule = 103;
        static final int TRANSACTION_performDexOptMode = 104;
        static final int TRANSACTION_performDexOptSecondary = 105;
        static final int TRANSACTION_compileLayouts = 106;
        static final int TRANSACTION_dumpProfiles = 107;
        static final int TRANSACTION_forceDexOpt = 108;
        static final int TRANSACTION_runBackgroundDexoptJob = 109;
        static final int TRANSACTION_reconcileSecondaryDexFiles = 110;
        static final int TRANSACTION_getMoveStatus = 111;
        static final int TRANSACTION_registerMoveCallback = 112;
        static final int TRANSACTION_unregisterMoveCallback = 113;
        static final int TRANSACTION_movePackage = 114;
        static final int TRANSACTION_movePrimaryStorage = 115;
        static final int TRANSACTION_setInstallLocation = 116;
        static final int TRANSACTION_getInstallLocation = 117;
        static final int TRANSACTION_installExistingPackageAsUser = 118;
        static final int TRANSACTION_verifyPendingInstall = 119;
        static final int TRANSACTION_extendVerificationTimeout = 120;
        static final int TRANSACTION_verifyIntentFilter = 121;
        static final int TRANSACTION_getIntentVerificationStatus = 122;
        static final int TRANSACTION_updateIntentVerificationStatus = 123;
        static final int TRANSACTION_getIntentFilterVerifications = 124;
        static final int TRANSACTION_getAllIntentFilters = 125;
        static final int TRANSACTION_getVerifierDeviceIdentity = 126;
        static final int TRANSACTION_isFirstBoot = 127;
        static final int TRANSACTION_isOnlyCoreApps = 128;
        static final int TRANSACTION_isDeviceUpgrading = 129;
        static final int TRANSACTION_isStorageLow = 130;
        static final int TRANSACTION_setApplicationHiddenSettingAsUser = 131;
        static final int TRANSACTION_getApplicationHiddenSettingAsUser = 132;
        static final int TRANSACTION_setSystemAppHiddenUntilInstalled = 133;
        static final int TRANSACTION_setSystemAppInstallState = 134;
        static final int TRANSACTION_getPackageInstaller = 135;
        static final int TRANSACTION_setBlockUninstallForUser = 136;
        static final int TRANSACTION_getBlockUninstallForUser = 137;
        static final int TRANSACTION_getKeySetByAlias = 138;
        static final int TRANSACTION_getSigningKeySet = 139;
        static final int TRANSACTION_isPackageSignedByKeySet = 140;
        static final int TRANSACTION_isPackageSignedByKeySetExactly = 141;
        static final int TRANSACTION_getPermissionControllerPackageName = 142;
        static final int TRANSACTION_getInstantApps = 143;
        static final int TRANSACTION_getInstantAppCookie = 144;
        static final int TRANSACTION_setInstantAppCookie = 145;
        static final int TRANSACTION_getInstantAppIcon = 146;
        static final int TRANSACTION_isInstantApp = 147;
        static final int TRANSACTION_setRequiredForSystemUser = 148;
        static final int TRANSACTION_setUpdateAvailable = 149;
        static final int TRANSACTION_getServicesSystemSharedLibraryPackageName = 150;
        static final int TRANSACTION_getSharedSystemSharedLibraryPackageName = 151;
        static final int TRANSACTION_getChangedPackages = 152;
        static final int TRANSACTION_isPackageDeviceAdminOnAnyUser = 153;
        static final int TRANSACTION_getInstallReason = 154;
        static final int TRANSACTION_getSharedLibraries = 155;
        static final int TRANSACTION_getDeclaredSharedLibraries = 156;
        static final int TRANSACTION_canRequestPackageInstalls = 157;
        static final int TRANSACTION_deletePreloadsFileCache = 158;
        static final int TRANSACTION_getInstantAppResolverComponent = 159;
        static final int TRANSACTION_getInstantAppResolverSettingsComponent = 160;
        static final int TRANSACTION_getInstantAppInstallerComponent = 161;
        static final int TRANSACTION_getInstantAppAndroidId = 162;
        static final int TRANSACTION_getArtManager = 163;
        static final int TRANSACTION_setHarmfulAppWarning = 164;
        static final int TRANSACTION_getHarmfulAppWarning = 165;
        static final int TRANSACTION_hasSigningCertificate = 166;
        static final int TRANSACTION_hasUidSigningCertificate = 167;
        static final int TRANSACTION_getDefaultTextClassifierPackageName = 168;
        static final int TRANSACTION_getSystemTextClassifierPackageName = 169;
        static final int TRANSACTION_getAttentionServicePackageName = 170;
        static final int TRANSACTION_getWellbeingPackageName = 171;
        static final int TRANSACTION_getAppPredictionServicePackageName = 172;
        static final int TRANSACTION_getSystemCaptionsServicePackageName = 173;
        static final int TRANSACTION_getSetupWizardPackageName = 174;
        static final int TRANSACTION_getIncidentReportApproverPackageName = 175;
        static final int TRANSACTION_getContentCaptureServicePackageName = 176;
        static final int TRANSACTION_isPackageStateProtected = 177;
        static final int TRANSACTION_sendDeviceCustomizationReadyBroadcast = 178;
        static final int TRANSACTION_getInstalledModules = 179;
        static final int TRANSACTION_getModuleInfo = 180;
        static final int TRANSACTION_getRuntimePermissionsVersion = 181;
        static final int TRANSACTION_setRuntimePermissionsVersion = 182;
        static final int TRANSACTION_notifyPackagesReplacedReceived = 183;
        static final int TRANSACTION_getAppOpPermissionPackages = 184;
        static final int TRANSACTION_getPermissionGroupInfo = 185;
        static final int TRANSACTION_addPermission = 186;
        static final int TRANSACTION_addPermissionAsync = 187;
        static final int TRANSACTION_removePermission = 188;
        static final int TRANSACTION_checkPermission = 189;
        static final int TRANSACTION_grantRuntimePermission = 190;
        static final int TRANSACTION_checkUidPermission = 191;
        static final int TRANSACTION_setMimeGroup = 192;
        static final int TRANSACTION_getMimeGroup = 193;
        static final int TRANSACTION_isAutoRevokeWhitelisted = 194;
        static final int TRANSACTION_grantImplicitAccess = 195;
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
            public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public boolean activitySupportsIntent(android.content.ComponentName p0, android.content.Intent p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
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
            public void deleteExistingPackageAsUser(android.content.pm.VersionedPackage p0, android.content.pm.IPackageDeleteObserver2 p1, int p2) throws android.os.RemoteException {}
            public java.lang.String getInstallerPackageName(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.InstallSourceInfo getInstallSourceInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
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
            public android.os.Bundle getSuspendedPackageAppExtras(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public byte[] getPreferredActivityBackup(int p0) throws android.os.RemoteException { return null; }
            public void restorePreferredActivities(byte[] p0, int p1) throws android.os.RemoteException {}
            public byte[] getDefaultAppsBackup(int p0) throws android.os.RemoteException { return null; }
            public void restoreDefaultApps(byte[] p0, int p1) throws android.os.RemoteException {}
            public byte[] getIntentFilterVerificationBackup(int p0) throws android.os.RemoteException { return null; }
            public void restoreIntentFilterVerification(byte[] p0, int p1) throws android.os.RemoteException {}
            public android.content.ComponentName getHomeActivities(java.util.List<android.content.pm.ResolveInfo> p0) throws android.os.RemoteException { return null; }
            public void setHomeActivity(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void overrideLabelAndIcon(android.content.ComponentName p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
            public void restoreLabelAndIcon(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
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
            public void notifyDexLoad(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1, java.lang.String p2) throws android.os.RemoteException {}
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
            public android.content.pm.VerifierDeviceIdentity getVerifierDeviceIdentity() throws android.os.RemoteException { return null; }
            public boolean isFirstBoot() throws android.os.RemoteException { return false; }
            public boolean isOnlyCoreApps() throws android.os.RemoteException { return false; }
            public boolean isDeviceUpgrading() throws android.os.RemoteException { return false; }
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
            public java.lang.String getDefaultTextClassifierPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getSystemTextClassifierPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getAttentionServicePackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getWellbeingPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getAppPredictionServicePackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getSystemCaptionsServicePackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getSetupWizardPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getIncidentReportApproverPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getContentCaptureServicePackageName() throws android.os.RemoteException { return null; }
            public boolean isPackageStateProtected(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void sendDeviceCustomizationReadyBroadcast() throws android.os.RemoteException {}
            public java.util.List<android.content.pm.ModuleInfo> getInstalledModules(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ModuleInfo getModuleInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public int getRuntimePermissionsVersion(int p0) throws android.os.RemoteException { return 0; }
            public void setRuntimePermissionsVersion(int p0, int p1) throws android.os.RemoteException {}
            public void notifyPackagesReplacedReceived(java.lang.String[] p0) throws android.os.RemoteException {}
            public java.lang.String[] getAppOpPermissionPackages(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public boolean addPermission(android.content.pm.PermissionInfo p0) throws android.os.RemoteException { return false; }
            public boolean addPermissionAsync(android.content.pm.PermissionInfo p0) throws android.os.RemoteException { return false; }
            public void removePermission(java.lang.String p0) throws android.os.RemoteException {}
            public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public int checkUidPermission(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void setMimeGroup(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getMimeGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isAutoRevokeWhitelisted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void grantImplicitAccess(int p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
