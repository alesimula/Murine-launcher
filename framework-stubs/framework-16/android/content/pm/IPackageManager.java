package android.content.pm;

public interface IPackageManager extends android.os.IInterface {
    public void checkPackageStartable(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isPackageAvailable(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.PackageInfo getPackageInfo(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    public android.content.pm.PackageInfo getPackageInfoVersioned(android.content.pm.VersionedPackage p0, long p1, int p2) throws android.os.RemoteException;
    public int getPackageUid(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    public int[] getPackageGids(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    public java.lang.String[] currentToCanonicalPackageNames(java.lang.String[] p0) throws android.os.RemoteException;
    public java.lang.String[] canonicalToCurrentPackageNames(java.lang.String[] p0) throws android.os.RemoteException;
    public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    public int getTargetSdkVersion(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName p0, long p1, int p2) throws android.os.RemoteException;
    public boolean activitySupportsIntentAsUser(android.content.ComponentName p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName p0, long p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName p0, long p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName p0, long p1, int p2) throws android.os.RemoteException;
    public boolean isProtectedBroadcast(java.lang.String p0) throws android.os.RemoteException;
    public int checkSignatures(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int checkUidSignatures(int p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllPackages() throws android.os.RemoteException;
    public java.lang.String[] getPackagesForUid(int p0) throws android.os.RemoteException;
    public java.lang.String getNameForUid(int p0) throws android.os.RemoteException;
    public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException;
    public int getUidForSharedUser(java.lang.String p0) throws android.os.RemoteException;
    public int getFlagsForUid(int p0) throws android.os.RemoteException;
    public int getPrivateFlagsForUid(int p0) throws android.os.RemoteException;
    public boolean isUidPrivileged(int p0) throws android.os.RemoteException;
    public android.content.pm.ResolveInfo resolveIntent(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ResolveInfo findPersistentPreferredActivity(android.content.Intent p0, int p1) throws android.os.RemoteException;
    public boolean canForwardTo(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentActivities(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentActivityOptions(android.content.ComponentName p0, android.content.Intent[] p1, java.lang.String[] p2, android.content.Intent p3, java.lang.String p4, long p5, int p6) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentReceivers(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ResolveInfo resolveService(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentServices(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentContentProviders(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getInstalledPackages(long p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.GET_APP_METADATA")
    public android.os.ParcelFileDescriptor getAppMetadataFd(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getPackagesHoldingPermissions(java.lang.String[] p0, long p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getInstalledApplications(long p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getPersistentApplications(int p0) throws android.os.RemoteException;
    public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ProviderInfo resolveContentProviderForUid(java.lang.String p0, long p1, int p2, int p3) throws android.os.RemoteException;
    public void querySyncProviders(java.util.List<java.lang.String> p0, java.util.List<android.content.pm.ProviderInfo> p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryContentProviders(java.lang.String p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public android.content.pm.InstrumentationInfo getInstrumentationInfoAsUser(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryInstrumentationAsUser(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void finishPackageInstall(int p0, boolean p1) throws android.os.RemoteException;
    public void setInstallerPackageName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void relinquishUpdateOwnership(java.lang.String p0) throws android.os.RemoteException;
    public void setApplicationCategoryHint(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void deletePackageAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDeleteObserver p2, int p3, int p4) throws android.os.RemoteException;
    public void deletePackageVersioned(android.content.pm.VersionedPackage p0, android.content.pm.IPackageDeleteObserver2 p1, int p2, int p3) throws android.os.RemoteException;
    public void deleteExistingPackageAsUser(android.content.pm.VersionedPackage p0, android.content.pm.IPackageDeleteObserver2 p1, int p2) throws android.os.RemoteException;
    public java.lang.String getInstallerPackageName(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.InstallSourceInfo getInstallSourceInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void resetApplicationPreferences(int p0) throws android.os.RemoteException;
    public android.content.pm.ResolveInfo getLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2, android.content.IntentFilter p3, int p4, android.content.ComponentName p5) throws android.os.RemoteException;
    public void addPreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4, boolean p5) throws android.os.RemoteException;
    public void replacePreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) throws android.os.RemoteException;
    public void clearPackagePreferredActivities(java.lang.String p0) throws android.os.RemoteException;
    public int getPreferredActivities(java.util.List<android.content.IntentFilter> p0, java.util.List<android.content.ComponentName> p1, java.lang.String p2) throws android.os.RemoteException;
    public void addPersistentPreferredActivity(android.content.IntentFilter p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException;
    public void clearPackagePersistentPreferredActivities(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void clearPersistentPreferredActivity(android.content.IntentFilter p0, int p1) throws android.os.RemoteException;
    public void addCrossProfileIntentFilter(android.content.IntentFilter p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public boolean removeCrossProfileIntentFilter(android.content.IntentFilter p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public void clearCrossProfileIntentFilters(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String[] setDistractingPackageRestrictionsAsUser(java.lang.String[] p0, int p1, int p2) throws android.os.RemoteException;
    public java.lang.String[] setPackagesSuspendedAsUser(java.lang.String[] p0, boolean p1, android.os.PersistableBundle p2, android.os.PersistableBundle p3, android.content.pm.SuspendDialogInfo p4, int p5, java.lang.String p6, int p7, int p8) throws android.os.RemoteException;
    public java.lang.String[] getUnsuspendablePackagesForUser(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public boolean isPackageSuspendedForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isPackageQuarantinedForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isPackageStoppedForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.os.Bundle getSuspendedPackageAppExtras(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.lang.String getSuspendingPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public byte[] getPreferredActivityBackup(int p0) throws android.os.RemoteException;
    public void restorePreferredActivities(byte[] p0, int p1) throws android.os.RemoteException;
    public byte[] getDefaultAppsBackup(int p0) throws android.os.RemoteException;
    public void restoreDefaultApps(byte[] p0, int p1) throws android.os.RemoteException;
    public byte[] getDomainVerificationBackup(int p0) throws android.os.RemoteException;
    public void restoreDomainVerification(byte[] p0, int p1) throws android.os.RemoteException;
    public android.content.ComponentName getHomeActivities(java.util.List<android.content.pm.ResolveInfo> p0) throws android.os.RemoteException;
    public void setHomeActivity(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void overrideLabelAndIcon(android.content.ComponentName p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public void restoreLabelAndIcon(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setComponentEnabledSetting(android.content.ComponentName p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public void setComponentEnabledSettings(java.util.List<android.content.pm.PackageManager.ComponentEnabledSetting> p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int getComponentEnabledSetting(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setApplicationEnabledSetting(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public int getApplicationEnabledSetting(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void logAppProcessStartIfNeeded(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, java.lang.String p4, int p5) throws android.os.RemoteException;
    public void flushPackageRestrictionsAsUser(int p0) throws android.os.RemoteException;
    public void setPackageStoppedState(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CLEAR_APP_CACHE")
    public void freeStorageAndNotify(java.lang.String p0, long p1, int p2, android.content.pm.IPackageDataObserver p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CLEAR_APP_CACHE")
    public void freeStorage(java.lang.String p0, long p1, int p2, android.content.IntentSender p3) throws android.os.RemoteException;
    public void deleteApplicationCacheFiles(java.lang.String p0, android.content.pm.IPackageDataObserver p1) throws android.os.RemoteException;
    public void deleteApplicationCacheFilesAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDataObserver p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CLEAR_APP_USER_DATA")
    public void clearApplicationUserData(java.lang.String p0, android.content.pm.IPackageDataObserver p1, int p2) throws android.os.RemoteException;
    public void clearApplicationProfileData(java.lang.String p0) throws android.os.RemoteException;
    public void getPackageSizeInfo(java.lang.String p0, int p1, android.content.pm.IPackageStatsObserver p2) throws android.os.RemoteException;
    @java.lang.Deprecated
    public java.lang.String[] getSystemSharedLibraryNames() throws android.os.RemoteException;
    public java.util.Map<java.lang.String, java.lang.String> getSystemSharedLibraryNamesAndPaths() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getSystemAvailableFeatures() throws android.os.RemoteException;
    public boolean hasSystemFeature(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getInitialNonStoppedSystemPackages() throws android.os.RemoteException;
    public void enterSafeMode() throws android.os.RemoteException;
    public boolean isSafeMode() throws android.os.RemoteException;
    public boolean hasSystemUidErrors() throws android.os.RemoteException;
    public void notifyPackageUse(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void notifyDexLoad(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1, java.lang.String p2) throws android.os.RemoteException;
    public void registerDexModule(java.lang.String p0, java.lang.String p1, boolean p2, android.content.pm.IDexModuleRegisterCallback p3) throws android.os.RemoteException;
    public boolean performDexOptMode(java.lang.String p0, boolean p1, java.lang.String p2, boolean p3, boolean p4, java.lang.String p5) throws android.os.RemoteException;
    public boolean performDexOptSecondary(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MOUNT_UNMOUNT_FILESYSTEMS")
    public int getMoveStatus(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MOUNT_UNMOUNT_FILESYSTEMS")
    public void registerMoveCallback(android.content.pm.IPackageMoveObserver p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MOUNT_UNMOUNT_FILESYSTEMS")
    public void unregisterMoveCallback(android.content.pm.IPackageMoveObserver p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MOVE_PACKAGE")
    public int movePackage(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MOVE_PACKAGE")
    public int movePrimaryStorage(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.WRITE_SECURE_SETTINGS")
    public boolean setInstallLocation(int p0) throws android.os.RemoteException;
    public int getInstallLocation() throws android.os.RemoteException;
    public int installExistingPackageAsUser(java.lang.String p0, int p1, int p2, int p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException;
    public void verifyPendingInstall(int p0, int p1) throws android.os.RemoteException;
    public void extendVerificationTimeout(int p0, int p1, long p2) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void verifyIntentFilter(int p0, int p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    @java.lang.Deprecated
    public int getIntentVerificationStatus(java.lang.String p0, int p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean updateIntentVerificationStatus(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    @java.lang.Deprecated
    public android.content.pm.ParceledListSlice getIntentFilterVerifications(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAllIntentFilters(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.PACKAGE_VERIFICATION_AGENT")
    public android.content.pm.VerifierDeviceIdentity getVerifierDeviceIdentity() throws android.os.RemoteException;
    public boolean isFirstBoot() throws android.os.RemoteException;
    public boolean isDeviceUpgrading() throws android.os.RemoteException;
    public boolean isStorageLow() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_USERS")
    public boolean setApplicationHiddenSettingAsUser(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean getApplicationHiddenSettingAsUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setSystemAppHiddenUntilInstalled(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean setSystemAppInstallState(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public android.content.pm.IPackageInstaller getPackageInstaller() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.DELETE_PACKAGES")
    public boolean setBlockUninstallForUser(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean getBlockUninstallForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.KeySet getKeySetByAlias(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.KeySet getSigningKeySet(java.lang.String p0) throws android.os.RemoteException;
    public boolean isPackageSignedByKeySet(java.lang.String p0, android.content.pm.KeySet p1) throws android.os.RemoteException;
    public boolean isPackageSignedByKeySetExactly(java.lang.String p0, android.content.pm.KeySet p1) throws android.os.RemoteException;
    public java.lang.String getPermissionControllerPackageName() throws android.os.RemoteException;
    public java.lang.String getSdkSandboxPackageName() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getInstantApps(int p0) throws android.os.RemoteException;
    public byte[] getInstantAppCookie(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setInstantAppCookie(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException;
    public android.graphics.Bitmap getInstantAppIcon(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isInstantApp(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setRequiredForSystemUser(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.INSTALL_PACKAGES")
    public void setUpdateAvailable(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public java.lang.String getServicesSystemSharedLibraryPackageName() throws android.os.RemoteException;
    public java.lang.String getSharedSystemSharedLibraryPackageName() throws android.os.RemoteException;
    public android.content.pm.ChangedPackages getChangedPackages(int p0, int p1) throws android.os.RemoteException;
    public boolean isPackageDeviceAdminOnAnyUser(java.lang.String p0) throws android.os.RemoteException;
    public int getInstallReason(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getSharedLibraries(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getDeclaredSharedLibraries(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    public boolean canRequestPackageInstalls(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void deletePreloadsFileCache() throws android.os.RemoteException;
    public android.content.ComponentName getInstantAppResolverComponent() throws android.os.RemoteException;
    public android.content.ComponentName getInstantAppResolverSettingsComponent() throws android.os.RemoteException;
    public android.content.ComponentName getInstantAppInstallerComponent() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_INSTANT_APPS")
    public java.lang.String getInstantAppAndroidId(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.dex.IArtManager getArtManager() throws android.os.RemoteException;
    public void setHarmfulAppWarning(java.lang.String p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException;
    public java.lang.CharSequence getHarmfulAppWarning(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasSigningCertificate(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException;
    public boolean hasUidSigningCertificate(int p0, byte[] p1, int p2) throws android.os.RemoteException;
    public java.lang.String getDefaultTextClassifierPackageName() throws android.os.RemoteException;
    public java.lang.String getSystemTextClassifierPackageName() throws android.os.RemoteException;
    public java.lang.String getAttentionServicePackageName() throws android.os.RemoteException;
    public java.lang.String getRotationResolverPackageName() throws android.os.RemoteException;
    public java.lang.String getWellbeingPackageName() throws android.os.RemoteException;
    public java.lang.String getAppPredictionServicePackageName() throws android.os.RemoteException;
    public java.lang.String getSystemCaptionsServicePackageName() throws android.os.RemoteException;
    public java.lang.String getSetupWizardPackageName() throws android.os.RemoteException;
    public java.lang.String getIncidentReportApproverPackageName() throws android.os.RemoteException;
    public boolean isPackageStateProtected(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void sendDeviceCustomizationReadyBroadcast() throws android.os.RemoteException;
    public java.util.List<android.content.pm.ModuleInfo> getInstalledModules(int p0) throws android.os.RemoteException;
    public android.content.pm.ModuleInfo getModuleInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getRuntimePermissionsVersion(int p0) throws android.os.RemoteException;
    public void setRuntimePermissionsVersion(int p0, int p1) throws android.os.RemoteException;
    public void notifyPackagesReplacedReceived(java.lang.String[] p0) throws android.os.RemoteException;
    public void requestPackageChecksums(java.lang.String p0, boolean p1, int p2, int p3, java.util.List p4, android.content.pm.IOnChecksumsReadyListener p5, int p6) throws android.os.RemoteException;
    public android.content.IntentSender getLaunchIntentSenderForPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public java.lang.String[] getAppOpPermissionPackages(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean addPermission(android.content.pm.PermissionInfo p0) throws android.os.RemoteException;
    public boolean addPermissionAsync(android.content.pm.PermissionInfo p0) throws android.os.RemoteException;
    public void removePermission(java.lang.String p0) throws android.os.RemoteException;
    public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int checkUidPermission(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setMimeGroup(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public java.lang.String getSplashScreenTheme(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setSplashScreenTheme(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int getUserMinAspectRatio(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.INSTALL_PACKAGES")
    public void setUserMinAspectRatio(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getMimeGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isAutoRevokeWhitelisted(java.lang.String p0) throws android.os.RemoteException;
    public void makeProviderVisible(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MAKE_UID_VISIBLE")
    @android.annotation.EnforcePermission("android.permission.MAKE_UID_VISIBLE")
    public void makeUidVisible(int p0, int p1) throws android.os.RemoteException;
    public android.os.IBinder getHoldLockToken() throws android.os.RemoteException;
    public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public android.content.pm.PackageManager.Property getPropertyAsUser(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryProperty(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setKeepUninstalledPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public boolean[] canPackageQuery(java.lang.String p0, java.lang.String[] p1, int p2) throws android.os.RemoteException;
    public boolean waitForHandler(long p0, boolean p1) throws android.os.RemoteException;
    public void registerPackageMonitorCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException;
    public void unregisterPackageMonitorCallback(android.os.IRemoteCallback p0) throws android.os.RemoteException;
    public android.content.pm.ArchivedPackageParcel getArchivedPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.graphics.Bitmap getArchivedAppIcon(java.lang.String p0, android.os.UserHandle p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isAppArchivable(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.GET_APP_METADATA")
    public int getAppMetadataSource(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.ComponentName getDomainVerificationAgent(int p0) throws android.os.RemoteException;
    public void setPageSizeAppCompatFlagsSettingsOverride(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean isPageSizeCompatEnabled(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getPageSizeCompatWarningMessage(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllApexDirectories() throws android.os.RemoteException;

    public static class Default implements android.content.pm.IPackageManager {
        public Default() {}
        public void checkPackageStartable(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean isPackageAvailable(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.content.pm.PackageInfo getPackageInfo(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.PackageInfo getPackageInfoVersioned(android.content.pm.VersionedPackage p0, long p1, int p2) throws android.os.RemoteException { return null; }
        public int getPackageUid(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return 0; }
        public int[] getPackageGids(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return null; }
        public java.lang.String[] currentToCanonicalPackageNames(java.lang.String[] p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] canonicalToCurrentPackageNames(java.lang.String[] p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return null; }
        public int getTargetSdkVersion(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName p0, long p1, int p2) throws android.os.RemoteException { return null; }
        public boolean activitySupportsIntentAsUser(android.content.ComponentName p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException { return false; }
        public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName p0, long p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName p0, long p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName p0, long p1, int p2) throws android.os.RemoteException { return null; }
        public boolean isProtectedBroadcast(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int checkSignatures(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public int checkUidSignatures(int p0, int p1) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getAllPackages() throws android.os.RemoteException { return null; }
        public java.lang.String[] getPackagesForUid(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getNameForUid(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException { return null; }
        public int getUidForSharedUser(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getFlagsForUid(int p0) throws android.os.RemoteException { return 0; }
        public int getPrivateFlagsForUid(int p0) throws android.os.RemoteException { return 0; }
        public boolean isUidPrivileged(int p0) throws android.os.RemoteException { return false; }
        public android.content.pm.ResolveInfo resolveIntent(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ResolveInfo findPersistentPreferredActivity(android.content.Intent p0, int p1) throws android.os.RemoteException { return null; }
        public boolean canForwardTo(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public android.content.pm.ParceledListSlice queryIntentActivities(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryIntentActivityOptions(android.content.ComponentName p0, android.content.Intent[] p1, java.lang.String[] p2, android.content.Intent p3, java.lang.String p4, long p5, int p6) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryIntentReceivers(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ResolveInfo resolveService(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryIntentServices(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryIntentContentProviders(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getInstalledPackages(long p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor getAppMetadataFd(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getPackagesHoldingPermissions(java.lang.String[] p0, long p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getInstalledApplications(long p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getPersistentApplications(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ProviderInfo resolveContentProviderForUid(java.lang.String p0, long p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public void querySyncProviders(java.util.List<java.lang.String> p0, java.util.List<android.content.pm.ProviderInfo> p1) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice queryContentProviders(java.lang.String p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.content.pm.InstrumentationInfo getInstrumentationInfoAsUser(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryInstrumentationAsUser(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public void finishPackageInstall(int p0, boolean p1) throws android.os.RemoteException {}
        public void setInstallerPackageName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void relinquishUpdateOwnership(java.lang.String p0) throws android.os.RemoteException {}
        public void setApplicationCategoryHint(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void deletePackageAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDeleteObserver p2, int p3, int p4) throws android.os.RemoteException {}
        public void deletePackageVersioned(android.content.pm.VersionedPackage p0, android.content.pm.IPackageDeleteObserver2 p1, int p2, int p3) throws android.os.RemoteException {}
        public void deleteExistingPackageAsUser(android.content.pm.VersionedPackage p0, android.content.pm.IPackageDeleteObserver2 p1, int p2) throws android.os.RemoteException {}
        public java.lang.String getInstallerPackageName(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.InstallSourceInfo getInstallSourceInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void resetApplicationPreferences(int p0) throws android.os.RemoteException {}
        public android.content.pm.ResolveInfo getLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public void setLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2, android.content.IntentFilter p3, int p4, android.content.ComponentName p5) throws android.os.RemoteException {}
        public void addPreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4, boolean p5) throws android.os.RemoteException {}
        public void replacePreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) throws android.os.RemoteException {}
        public void clearPackagePreferredActivities(java.lang.String p0) throws android.os.RemoteException {}
        public int getPreferredActivities(java.util.List<android.content.IntentFilter> p0, java.util.List<android.content.ComponentName> p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void addPersistentPreferredActivity(android.content.IntentFilter p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
        public void clearPackagePersistentPreferredActivities(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void clearPersistentPreferredActivity(android.content.IntentFilter p0, int p1) throws android.os.RemoteException {}
        public void addCrossProfileIntentFilter(android.content.IntentFilter p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public boolean removeCrossProfileIntentFilter(android.content.IntentFilter p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException { return false; }
        public void clearCrossProfileIntentFilters(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String[] setDistractingPackageRestrictionsAsUser(java.lang.String[] p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public java.lang.String[] setPackagesSuspendedAsUser(java.lang.String[] p0, boolean p1, android.os.PersistableBundle p2, android.os.PersistableBundle p3, android.content.pm.SuspendDialogInfo p4, int p5, java.lang.String p6, int p7, int p8) throws android.os.RemoteException { return null; }
        public java.lang.String[] getUnsuspendablePackagesForUser(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
        public boolean isPackageSuspendedForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isPackageQuarantinedForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isPackageStoppedForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.os.Bundle getSuspendedPackageAppExtras(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public java.lang.String getSuspendingPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public byte[] getPreferredActivityBackup(int p0) throws android.os.RemoteException { return null; }
        public void restorePreferredActivities(byte[] p0, int p1) throws android.os.RemoteException {}
        public byte[] getDefaultAppsBackup(int p0) throws android.os.RemoteException { return null; }
        public void restoreDefaultApps(byte[] p0, int p1) throws android.os.RemoteException {}
        public byte[] getDomainVerificationBackup(int p0) throws android.os.RemoteException { return null; }
        public void restoreDomainVerification(byte[] p0, int p1) throws android.os.RemoteException {}
        public android.content.ComponentName getHomeActivities(java.util.List<android.content.pm.ResolveInfo> p0) throws android.os.RemoteException { return null; }
        public void setHomeActivity(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void overrideLabelAndIcon(android.content.ComponentName p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
        public void restoreLabelAndIcon(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void setComponentEnabledSetting(android.content.ComponentName p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
        public void setComponentEnabledSettings(java.util.List<android.content.pm.PackageManager.ComponentEnabledSetting> p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public int getComponentEnabledSetting(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return 0; }
        public void setApplicationEnabledSetting(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
        public int getApplicationEnabledSetting(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void logAppProcessStartIfNeeded(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, java.lang.String p4, int p5) throws android.os.RemoteException {}
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
        public java.util.Map<java.lang.String, java.lang.String> getSystemSharedLibraryNamesAndPaths() throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getSystemAvailableFeatures() throws android.os.RemoteException { return null; }
        public boolean hasSystemFeature(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getInitialNonStoppedSystemPackages() throws android.os.RemoteException { return null; }
        public void enterSafeMode() throws android.os.RemoteException {}
        public boolean isSafeMode() throws android.os.RemoteException { return false; }
        public boolean hasSystemUidErrors() throws android.os.RemoteException { return false; }
        public void notifyPackageUse(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void notifyDexLoad(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1, java.lang.String p2) throws android.os.RemoteException {}
        public void registerDexModule(java.lang.String p0, java.lang.String p1, boolean p2, android.content.pm.IDexModuleRegisterCallback p3) throws android.os.RemoteException {}
        public boolean performDexOptMode(java.lang.String p0, boolean p1, java.lang.String p2, boolean p3, boolean p4, java.lang.String p5) throws android.os.RemoteException { return false; }
        public boolean performDexOptSecondary(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
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
        public java.lang.String getSdkSandboxPackageName() throws android.os.RemoteException { return null; }
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
        public android.content.pm.ParceledListSlice getSharedLibraries(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getDeclaredSharedLibraries(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return null; }
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
        public java.lang.String getRotationResolverPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getWellbeingPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getAppPredictionServicePackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getSystemCaptionsServicePackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getSetupWizardPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getIncidentReportApproverPackageName() throws android.os.RemoteException { return null; }
        public boolean isPackageStateProtected(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void sendDeviceCustomizationReadyBroadcast() throws android.os.RemoteException {}
        public java.util.List<android.content.pm.ModuleInfo> getInstalledModules(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ModuleInfo getModuleInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public int getRuntimePermissionsVersion(int p0) throws android.os.RemoteException { return 0; }
        public void setRuntimePermissionsVersion(int p0, int p1) throws android.os.RemoteException {}
        public void notifyPackagesReplacedReceived(java.lang.String[] p0) throws android.os.RemoteException {}
        public void requestPackageChecksums(java.lang.String p0, boolean p1, int p2, int p3, java.util.List p4, android.content.pm.IOnChecksumsReadyListener p5, int p6) throws android.os.RemoteException {}
        public android.content.IntentSender getLaunchIntentSenderForPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return null; }
        public java.lang.String[] getAppOpPermissionPackages(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean addPermission(android.content.pm.PermissionInfo p0) throws android.os.RemoteException { return false; }
        public boolean addPermissionAsync(android.content.pm.PermissionInfo p0) throws android.os.RemoteException { return false; }
        public void removePermission(java.lang.String p0) throws android.os.RemoteException {}
        public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public int checkUidPermission(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void setMimeGroup(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public java.lang.String getSplashScreenTheme(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setSplashScreenTheme(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public int getUserMinAspectRatio(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void setUserMinAspectRatio(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getMimeGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isAutoRevokeWhitelisted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void makeProviderVisible(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void makeUidVisible(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder getHoldLockToken() throws android.os.RemoteException { return null; }
        public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public android.content.pm.PackageManager.Property getPropertyAsUser(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryProperty(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setKeepUninstalledPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public boolean[] canPackageQuery(java.lang.String p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return null; }
        public boolean waitForHandler(long p0, boolean p1) throws android.os.RemoteException { return false; }
        public void registerPackageMonitorCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException {}
        public void unregisterPackageMonitorCallback(android.os.IRemoteCallback p0) throws android.os.RemoteException {}
        public android.content.pm.ArchivedPackageParcel getArchivedPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.graphics.Bitmap getArchivedAppIcon(java.lang.String p0, android.os.UserHandle p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean isAppArchivable(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
        public int getAppMetadataSource(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public android.content.ComponentName getDomainVerificationAgent(int p0) throws android.os.RemoteException { return null; }
        public void setPageSizeAppCompatFlagsSettingsOverride(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public boolean isPageSizeCompatEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public java.lang.String getPageSizeCompatWarningMessage(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getAllApexDirectories() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageManager {
        public static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageManager";
        static final int TRANSACTION_checkPackageStartable = 1;
        static final int TRANSACTION_isPackageAvailable = 2;
        static final int TRANSACTION_getPackageInfo = 3;
        static final int TRANSACTION_getPackageInfoVersioned = 4;
        static final int TRANSACTION_getPackageUid = 5;
        static final int TRANSACTION_getPackageGids = 6;
        static final int TRANSACTION_currentToCanonicalPackageNames = 7;
        static final int TRANSACTION_canonicalToCurrentPackageNames = 8;
        static final int TRANSACTION_getApplicationInfo = 9;
        static final int TRANSACTION_getTargetSdkVersion = 10;
        static final int TRANSACTION_getActivityInfo = 11;
        static final int TRANSACTION_activitySupportsIntentAsUser = 12;
        static final int TRANSACTION_getReceiverInfo = 13;
        static final int TRANSACTION_getServiceInfo = 14;
        static final int TRANSACTION_getProviderInfo = 15;
        static final int TRANSACTION_isProtectedBroadcast = 16;
        static final int TRANSACTION_checkSignatures = 17;
        static final int TRANSACTION_checkUidSignatures = 18;
        static final int TRANSACTION_getAllPackages = 19;
        static final int TRANSACTION_getPackagesForUid = 20;
        static final int TRANSACTION_getNameForUid = 21;
        static final int TRANSACTION_getNamesForUids = 22;
        static final int TRANSACTION_getUidForSharedUser = 23;
        static final int TRANSACTION_getFlagsForUid = 24;
        static final int TRANSACTION_getPrivateFlagsForUid = 25;
        static final int TRANSACTION_isUidPrivileged = 26;
        static final int TRANSACTION_resolveIntent = 27;
        static final int TRANSACTION_findPersistentPreferredActivity = 28;
        static final int TRANSACTION_canForwardTo = 29;
        static final int TRANSACTION_queryIntentActivities = 30;
        static final int TRANSACTION_queryIntentActivityOptions = 31;
        static final int TRANSACTION_queryIntentReceivers = 32;
        static final int TRANSACTION_resolveService = 33;
        static final int TRANSACTION_queryIntentServices = 34;
        static final int TRANSACTION_queryIntentContentProviders = 35;
        static final int TRANSACTION_getInstalledPackages = 36;
        static final int TRANSACTION_getAppMetadataFd = 37;
        static final int TRANSACTION_getPackagesHoldingPermissions = 38;
        static final int TRANSACTION_getInstalledApplications = 39;
        static final int TRANSACTION_getPersistentApplications = 40;
        static final int TRANSACTION_resolveContentProvider = 41;
        static final int TRANSACTION_resolveContentProviderForUid = 42;
        static final int TRANSACTION_querySyncProviders = 43;
        static final int TRANSACTION_queryContentProviders = 44;
        static final int TRANSACTION_getInstrumentationInfoAsUser = 45;
        static final int TRANSACTION_queryInstrumentationAsUser = 46;
        static final int TRANSACTION_finishPackageInstall = 47;
        static final int TRANSACTION_setInstallerPackageName = 48;
        static final int TRANSACTION_relinquishUpdateOwnership = 49;
        static final int TRANSACTION_setApplicationCategoryHint = 50;
        static final int TRANSACTION_deletePackageAsUser = 51;
        static final int TRANSACTION_deletePackageVersioned = 52;
        static final int TRANSACTION_deleteExistingPackageAsUser = 53;
        static final int TRANSACTION_getInstallerPackageName = 54;
        static final int TRANSACTION_getInstallSourceInfo = 55;
        static final int TRANSACTION_resetApplicationPreferences = 56;
        static final int TRANSACTION_getLastChosenActivity = 57;
        static final int TRANSACTION_setLastChosenActivity = 58;
        static final int TRANSACTION_addPreferredActivity = 59;
        static final int TRANSACTION_replacePreferredActivity = 60;
        static final int TRANSACTION_clearPackagePreferredActivities = 61;
        static final int TRANSACTION_getPreferredActivities = 62;
        static final int TRANSACTION_addPersistentPreferredActivity = 63;
        static final int TRANSACTION_clearPackagePersistentPreferredActivities = 64;
        static final int TRANSACTION_clearPersistentPreferredActivity = 65;
        static final int TRANSACTION_addCrossProfileIntentFilter = 66;
        static final int TRANSACTION_removeCrossProfileIntentFilter = 67;
        static final int TRANSACTION_clearCrossProfileIntentFilters = 68;
        static final int TRANSACTION_setDistractingPackageRestrictionsAsUser = 69;
        static final int TRANSACTION_setPackagesSuspendedAsUser = 70;
        static final int TRANSACTION_getUnsuspendablePackagesForUser = 71;
        static final int TRANSACTION_isPackageSuspendedForUser = 72;
        static final int TRANSACTION_isPackageQuarantinedForUser = 73;
        static final int TRANSACTION_isPackageStoppedForUser = 74;
        static final int TRANSACTION_getSuspendedPackageAppExtras = 75;
        static final int TRANSACTION_getSuspendingPackage = 76;
        static final int TRANSACTION_getPreferredActivityBackup = 77;
        static final int TRANSACTION_restorePreferredActivities = 78;
        static final int TRANSACTION_getDefaultAppsBackup = 79;
        static final int TRANSACTION_restoreDefaultApps = 80;
        static final int TRANSACTION_getDomainVerificationBackup = 81;
        static final int TRANSACTION_restoreDomainVerification = 82;
        static final int TRANSACTION_getHomeActivities = 83;
        static final int TRANSACTION_setHomeActivity = 84;
        static final int TRANSACTION_overrideLabelAndIcon = 85;
        static final int TRANSACTION_restoreLabelAndIcon = 86;
        static final int TRANSACTION_setComponentEnabledSetting = 87;
        static final int TRANSACTION_setComponentEnabledSettings = 88;
        static final int TRANSACTION_getComponentEnabledSetting = 89;
        static final int TRANSACTION_setApplicationEnabledSetting = 90;
        static final int TRANSACTION_getApplicationEnabledSetting = 91;
        static final int TRANSACTION_logAppProcessStartIfNeeded = 92;
        static final int TRANSACTION_flushPackageRestrictionsAsUser = 93;
        static final int TRANSACTION_setPackageStoppedState = 94;
        static final int TRANSACTION_freeStorageAndNotify = 95;
        static final int TRANSACTION_freeStorage = 96;
        static final int TRANSACTION_deleteApplicationCacheFiles = 97;
        static final int TRANSACTION_deleteApplicationCacheFilesAsUser = 98;
        static final int TRANSACTION_clearApplicationUserData = 99;
        static final int TRANSACTION_clearApplicationProfileData = 100;
        static final int TRANSACTION_getPackageSizeInfo = 101;
        static final int TRANSACTION_getSystemSharedLibraryNames = 102;
        static final int TRANSACTION_getSystemSharedLibraryNamesAndPaths = 103;
        static final int TRANSACTION_getSystemAvailableFeatures = 104;
        static final int TRANSACTION_hasSystemFeature = 105;
        static final int TRANSACTION_getInitialNonStoppedSystemPackages = 106;
        static final int TRANSACTION_enterSafeMode = 107;
        static final int TRANSACTION_isSafeMode = 108;
        static final int TRANSACTION_hasSystemUidErrors = 109;
        static final int TRANSACTION_notifyPackageUse = 110;
        static final int TRANSACTION_notifyDexLoad = 111;
        static final int TRANSACTION_registerDexModule = 112;
        static final int TRANSACTION_performDexOptMode = 113;
        static final int TRANSACTION_performDexOptSecondary = 114;
        static final int TRANSACTION_getMoveStatus = 115;
        static final int TRANSACTION_registerMoveCallback = 116;
        static final int TRANSACTION_unregisterMoveCallback = 117;
        static final int TRANSACTION_movePackage = 118;
        static final int TRANSACTION_movePrimaryStorage = 119;
        static final int TRANSACTION_setInstallLocation = 120;
        static final int TRANSACTION_getInstallLocation = 121;
        static final int TRANSACTION_installExistingPackageAsUser = 122;
        static final int TRANSACTION_verifyPendingInstall = 123;
        static final int TRANSACTION_extendVerificationTimeout = 124;
        static final int TRANSACTION_verifyIntentFilter = 125;
        static final int TRANSACTION_getIntentVerificationStatus = 126;
        static final int TRANSACTION_updateIntentVerificationStatus = 127;
        static final int TRANSACTION_getIntentFilterVerifications = 128;
        static final int TRANSACTION_getAllIntentFilters = 129;
        static final int TRANSACTION_getVerifierDeviceIdentity = 130;
        static final int TRANSACTION_isFirstBoot = 131;
        static final int TRANSACTION_isDeviceUpgrading = 132;
        static final int TRANSACTION_isStorageLow = 133;
        static final int TRANSACTION_setApplicationHiddenSettingAsUser = 134;
        static final int TRANSACTION_getApplicationHiddenSettingAsUser = 135;
        static final int TRANSACTION_setSystemAppHiddenUntilInstalled = 136;
        static final int TRANSACTION_setSystemAppInstallState = 137;
        static final int TRANSACTION_getPackageInstaller = 138;
        static final int TRANSACTION_setBlockUninstallForUser = 139;
        static final int TRANSACTION_getBlockUninstallForUser = 140;
        static final int TRANSACTION_getKeySetByAlias = 141;
        static final int TRANSACTION_getSigningKeySet = 142;
        static final int TRANSACTION_isPackageSignedByKeySet = 143;
        static final int TRANSACTION_isPackageSignedByKeySetExactly = 144;
        static final int TRANSACTION_getPermissionControllerPackageName = 145;
        static final int TRANSACTION_getSdkSandboxPackageName = 146;
        static final int TRANSACTION_getInstantApps = 147;
        static final int TRANSACTION_getInstantAppCookie = 148;
        static final int TRANSACTION_setInstantAppCookie = 149;
        static final int TRANSACTION_getInstantAppIcon = 150;
        static final int TRANSACTION_isInstantApp = 151;
        static final int TRANSACTION_setRequiredForSystemUser = 152;
        static final int TRANSACTION_setUpdateAvailable = 153;
        static final int TRANSACTION_getServicesSystemSharedLibraryPackageName = 154;
        static final int TRANSACTION_getSharedSystemSharedLibraryPackageName = 155;
        static final int TRANSACTION_getChangedPackages = 156;
        static final int TRANSACTION_isPackageDeviceAdminOnAnyUser = 157;
        static final int TRANSACTION_getInstallReason = 158;
        static final int TRANSACTION_getSharedLibraries = 159;
        static final int TRANSACTION_getDeclaredSharedLibraries = 160;
        static final int TRANSACTION_canRequestPackageInstalls = 161;
        static final int TRANSACTION_deletePreloadsFileCache = 162;
        static final int TRANSACTION_getInstantAppResolverComponent = 163;
        static final int TRANSACTION_getInstantAppResolverSettingsComponent = 164;
        static final int TRANSACTION_getInstantAppInstallerComponent = 165;
        static final int TRANSACTION_getInstantAppAndroidId = 166;
        static final int TRANSACTION_getArtManager = 167;
        static final int TRANSACTION_setHarmfulAppWarning = 168;
        static final int TRANSACTION_getHarmfulAppWarning = 169;
        static final int TRANSACTION_hasSigningCertificate = 170;
        static final int TRANSACTION_hasUidSigningCertificate = 171;
        static final int TRANSACTION_getDefaultTextClassifierPackageName = 172;
        static final int TRANSACTION_getSystemTextClassifierPackageName = 173;
        static final int TRANSACTION_getAttentionServicePackageName = 174;
        static final int TRANSACTION_getRotationResolverPackageName = 175;
        static final int TRANSACTION_getWellbeingPackageName = 176;
        static final int TRANSACTION_getAppPredictionServicePackageName = 177;
        static final int TRANSACTION_getSystemCaptionsServicePackageName = 178;
        static final int TRANSACTION_getSetupWizardPackageName = 179;
        static final int TRANSACTION_getIncidentReportApproverPackageName = 180;
        static final int TRANSACTION_isPackageStateProtected = 181;
        static final int TRANSACTION_sendDeviceCustomizationReadyBroadcast = 182;
        static final int TRANSACTION_getInstalledModules = 183;
        static final int TRANSACTION_getModuleInfo = 184;
        static final int TRANSACTION_getRuntimePermissionsVersion = 185;
        static final int TRANSACTION_setRuntimePermissionsVersion = 186;
        static final int TRANSACTION_notifyPackagesReplacedReceived = 187;
        static final int TRANSACTION_requestPackageChecksums = 188;
        static final int TRANSACTION_getLaunchIntentSenderForPackage = 189;
        static final int TRANSACTION_getAppOpPermissionPackages = 190;
        static final int TRANSACTION_getPermissionGroupInfo = 191;
        static final int TRANSACTION_addPermission = 192;
        static final int TRANSACTION_addPermissionAsync = 193;
        static final int TRANSACTION_removePermission = 194;
        static final int TRANSACTION_checkPermission = 195;
        static final int TRANSACTION_grantRuntimePermission = 196;
        static final int TRANSACTION_checkUidPermission = 197;
        static final int TRANSACTION_setMimeGroup = 198;
        static final int TRANSACTION_getSplashScreenTheme = 199;
        static final int TRANSACTION_setSplashScreenTheme = 200;
        static final int TRANSACTION_getUserMinAspectRatio = 201;
        static final int TRANSACTION_setUserMinAspectRatio = 202;
        static final int TRANSACTION_getMimeGroup = 203;
        static final int TRANSACTION_isAutoRevokeWhitelisted = 204;
        static final int TRANSACTION_makeProviderVisible = 205;
        static final int TRANSACTION_makeUidVisible = 206;
        static final int TRANSACTION_getHoldLockToken = 207;
        static final int TRANSACTION_holdLock = 208;
        static final int TRANSACTION_getPropertyAsUser = 209;
        static final int TRANSACTION_queryProperty = 210;
        static final int TRANSACTION_setKeepUninstalledPackages = 211;
        static final int TRANSACTION_canPackageQuery = 212;
        static final int TRANSACTION_waitForHandler = 213;
        static final int TRANSACTION_registerPackageMonitorCallback = 214;
        static final int TRANSACTION_unregisterPackageMonitorCallback = 215;
        static final int TRANSACTION_getArchivedPackage = 216;
        static final int TRANSACTION_getArchivedAppIcon = 217;
        static final int TRANSACTION_isAppArchivable = 218;
        static final int TRANSACTION_getAppMetadataSource = 219;
        static final int TRANSACTION_getDomainVerificationAgent = 220;
        static final int TRANSACTION_setPageSizeAppCompatFlagsSettingsOverride = 221;
        static final int TRANSACTION_isPageSizeCompatEnabled = 222;
        static final int TRANSACTION_getPageSizeCompatWarningMessage = 223;
        static final int TRANSACTION_getAllApexDirectories = 224;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.content.pm.IPackageManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void getAppMetadataFd_enforcePermission() throws java.lang.SecurityException {}
        protected void removeCrossProfileIntentFilter_enforcePermission() throws java.lang.SecurityException {}
        protected void clearCrossProfileIntentFilters_enforcePermission() throws java.lang.SecurityException {}
        protected void freeStorageAndNotify_enforcePermission() throws java.lang.SecurityException {}
        protected void freeStorage_enforcePermission() throws java.lang.SecurityException {}
        protected void clearApplicationUserData_enforcePermission() throws java.lang.SecurityException {}
        protected void getMoveStatus_enforcePermission() throws java.lang.SecurityException {}
        protected void registerMoveCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterMoveCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void movePackage_enforcePermission() throws java.lang.SecurityException {}
        protected void movePrimaryStorage_enforcePermission() throws java.lang.SecurityException {}
        protected void setInstallLocation_enforcePermission() throws java.lang.SecurityException {}
        protected void getVerifierDeviceIdentity_enforcePermission() throws java.lang.SecurityException {}
        protected void setApplicationHiddenSettingAsUser_enforcePermission() throws java.lang.SecurityException {}
        protected void setBlockUninstallForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void setUpdateAvailable_enforcePermission() throws java.lang.SecurityException {}
        protected void getInstantAppAndroidId_enforcePermission() throws java.lang.SecurityException {}
        protected void setUserMinAspectRatio_enforcePermission() throws java.lang.SecurityException {}
        protected void makeUidVisible_enforcePermission() throws java.lang.SecurityException {}
        protected void getAppMetadataSource_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.content.pm.IPackageManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void checkPackageStartable(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean isPackageAvailable(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.content.pm.PackageInfo getPackageInfo(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.PackageInfo getPackageInfoVersioned(android.content.pm.VersionedPackage p0, long p1, int p2) throws android.os.RemoteException { return null; }
            public int getPackageUid(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return 0; }
            public int[] getPackageGids(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return null; }
            public java.lang.String[] currentToCanonicalPackageNames(java.lang.String[] p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] canonicalToCurrentPackageNames(java.lang.String[] p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return null; }
            public int getTargetSdkVersion(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName p0, long p1, int p2) throws android.os.RemoteException { return null; }
            public boolean activitySupportsIntentAsUser(android.content.ComponentName p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException { return false; }
            public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName p0, long p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName p0, long p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName p0, long p1, int p2) throws android.os.RemoteException { return null; }
            public boolean isProtectedBroadcast(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int checkSignatures(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public int checkUidSignatures(int p0, int p1) throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getAllPackages() throws android.os.RemoteException { return null; }
            public java.lang.String[] getPackagesForUid(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getNameForUid(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException { return null; }
            public int getUidForSharedUser(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getFlagsForUid(int p0) throws android.os.RemoteException { return 0; }
            public int getPrivateFlagsForUid(int p0) throws android.os.RemoteException { return 0; }
            public boolean isUidPrivileged(int p0) throws android.os.RemoteException { return false; }
            public android.content.pm.ResolveInfo resolveIntent(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ResolveInfo findPersistentPreferredActivity(android.content.Intent p0, int p1) throws android.os.RemoteException { return null; }
            public boolean canForwardTo(android.content.Intent p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public android.content.pm.ParceledListSlice queryIntentActivities(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryIntentActivityOptions(android.content.ComponentName p0, android.content.Intent[] p1, java.lang.String[] p2, android.content.Intent p3, java.lang.String p4, long p5, int p6) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryIntentReceivers(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ResolveInfo resolveService(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryIntentServices(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryIntentContentProviders(android.content.Intent p0, java.lang.String p1, long p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getInstalledPackages(long p0, int p1) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor getAppMetadataFd(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getPackagesHoldingPermissions(java.lang.String[] p0, long p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getInstalledApplications(long p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getPersistentApplications(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ProviderInfo resolveContentProviderForUid(java.lang.String p0, long p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public void querySyncProviders(java.util.List<java.lang.String> p0, java.util.List<android.content.pm.ProviderInfo> p1) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice queryContentProviders(java.lang.String p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.content.pm.InstrumentationInfo getInstrumentationInfoAsUser(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryInstrumentationAsUser(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public void finishPackageInstall(int p0, boolean p1) throws android.os.RemoteException {}
            public void setInstallerPackageName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void relinquishUpdateOwnership(java.lang.String p0) throws android.os.RemoteException {}
            public void setApplicationCategoryHint(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void deletePackageAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDeleteObserver p2, int p3, int p4) throws android.os.RemoteException {}
            public void deletePackageVersioned(android.content.pm.VersionedPackage p0, android.content.pm.IPackageDeleteObserver2 p1, int p2, int p3) throws android.os.RemoteException {}
            public void deleteExistingPackageAsUser(android.content.pm.VersionedPackage p0, android.content.pm.IPackageDeleteObserver2 p1, int p2) throws android.os.RemoteException {}
            public java.lang.String getInstallerPackageName(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.InstallSourceInfo getInstallSourceInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void resetApplicationPreferences(int p0) throws android.os.RemoteException {}
            public android.content.pm.ResolveInfo getLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public void setLastChosenActivity(android.content.Intent p0, java.lang.String p1, int p2, android.content.IntentFilter p3, int p4, android.content.ComponentName p5) throws android.os.RemoteException {}
            public void addPreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4, boolean p5) throws android.os.RemoteException {}
            public void replacePreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) throws android.os.RemoteException {}
            public void clearPackagePreferredActivities(java.lang.String p0) throws android.os.RemoteException {}
            public int getPreferredActivities(java.util.List<android.content.IntentFilter> p0, java.util.List<android.content.ComponentName> p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void addPersistentPreferredActivity(android.content.IntentFilter p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
            public void clearPackagePersistentPreferredActivities(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void clearPersistentPreferredActivity(android.content.IntentFilter p0, int p1) throws android.os.RemoteException {}
            public void addCrossProfileIntentFilter(android.content.IntentFilter p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public boolean removeCrossProfileIntentFilter(android.content.IntentFilter p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException { return false; }
            public void clearCrossProfileIntentFilters(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.lang.String[] setDistractingPackageRestrictionsAsUser(java.lang.String[] p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public java.lang.String[] setPackagesSuspendedAsUser(java.lang.String[] p0, boolean p1, android.os.PersistableBundle p2, android.os.PersistableBundle p3, android.content.pm.SuspendDialogInfo p4, int p5, java.lang.String p6, int p7, int p8) throws android.os.RemoteException { return null; }
            public java.lang.String[] getUnsuspendablePackagesForUser(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
            public boolean isPackageSuspendedForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isPackageQuarantinedForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isPackageStoppedForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.os.Bundle getSuspendedPackageAppExtras(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public java.lang.String getSuspendingPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public byte[] getPreferredActivityBackup(int p0) throws android.os.RemoteException { return null; }
            public void restorePreferredActivities(byte[] p0, int p1) throws android.os.RemoteException {}
            public byte[] getDefaultAppsBackup(int p0) throws android.os.RemoteException { return null; }
            public void restoreDefaultApps(byte[] p0, int p1) throws android.os.RemoteException {}
            public byte[] getDomainVerificationBackup(int p0) throws android.os.RemoteException { return null; }
            public void restoreDomainVerification(byte[] p0, int p1) throws android.os.RemoteException {}
            public android.content.ComponentName getHomeActivities(java.util.List<android.content.pm.ResolveInfo> p0) throws android.os.RemoteException { return null; }
            public void setHomeActivity(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void overrideLabelAndIcon(android.content.ComponentName p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
            public void restoreLabelAndIcon(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void setComponentEnabledSetting(android.content.ComponentName p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
            public void setComponentEnabledSettings(java.util.List<android.content.pm.PackageManager.ComponentEnabledSetting> p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public int getComponentEnabledSetting(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return 0; }
            public void setApplicationEnabledSetting(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
            public int getApplicationEnabledSetting(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void logAppProcessStartIfNeeded(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, java.lang.String p4, int p5) throws android.os.RemoteException {}
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
            public java.util.Map<java.lang.String, java.lang.String> getSystemSharedLibraryNamesAndPaths() throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getSystemAvailableFeatures() throws android.os.RemoteException { return null; }
            public boolean hasSystemFeature(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getInitialNonStoppedSystemPackages() throws android.os.RemoteException { return null; }
            public void enterSafeMode() throws android.os.RemoteException {}
            public boolean isSafeMode() throws android.os.RemoteException { return false; }
            public boolean hasSystemUidErrors() throws android.os.RemoteException { return false; }
            public void notifyPackageUse(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void notifyDexLoad(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1, java.lang.String p2) throws android.os.RemoteException {}
            public void registerDexModule(java.lang.String p0, java.lang.String p1, boolean p2, android.content.pm.IDexModuleRegisterCallback p3) throws android.os.RemoteException {}
            public boolean performDexOptMode(java.lang.String p0, boolean p1, java.lang.String p2, boolean p3, boolean p4, java.lang.String p5) throws android.os.RemoteException { return false; }
            public boolean performDexOptSecondary(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
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
            public java.lang.String getSdkSandboxPackageName() throws android.os.RemoteException { return null; }
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
            public android.content.pm.ParceledListSlice getSharedLibraries(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getDeclaredSharedLibraries(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return null; }
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
            public java.lang.String getRotationResolverPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getWellbeingPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getAppPredictionServicePackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getSystemCaptionsServicePackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getSetupWizardPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getIncidentReportApproverPackageName() throws android.os.RemoteException { return null; }
            public boolean isPackageStateProtected(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void sendDeviceCustomizationReadyBroadcast() throws android.os.RemoteException {}
            public java.util.List<android.content.pm.ModuleInfo> getInstalledModules(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ModuleInfo getModuleInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public int getRuntimePermissionsVersion(int p0) throws android.os.RemoteException { return 0; }
            public void setRuntimePermissionsVersion(int p0, int p1) throws android.os.RemoteException {}
            public void notifyPackagesReplacedReceived(java.lang.String[] p0) throws android.os.RemoteException {}
            public void requestPackageChecksums(java.lang.String p0, boolean p1, int p2, int p3, java.util.List p4, android.content.pm.IOnChecksumsReadyListener p5, int p6) throws android.os.RemoteException {}
            public android.content.IntentSender getLaunchIntentSenderForPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return null; }
            public java.lang.String[] getAppOpPermissionPackages(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public boolean addPermission(android.content.pm.PermissionInfo p0) throws android.os.RemoteException { return false; }
            public boolean addPermissionAsync(android.content.pm.PermissionInfo p0) throws android.os.RemoteException { return false; }
            public void removePermission(java.lang.String p0) throws android.os.RemoteException {}
            public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public int checkUidPermission(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void setMimeGroup(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
            public java.lang.String getSplashScreenTheme(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setSplashScreenTheme(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public int getUserMinAspectRatio(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void setUserMinAspectRatio(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getMimeGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isAutoRevokeWhitelisted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void makeProviderVisible(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void makeUidVisible(int p0, int p1) throws android.os.RemoteException {}
            public android.os.IBinder getHoldLockToken() throws android.os.RemoteException { return null; }
            public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public android.content.pm.PackageManager.Property getPropertyAsUser(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryProperty(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setKeepUninstalledPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public boolean[] canPackageQuery(java.lang.String p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return null; }
            public boolean waitForHandler(long p0, boolean p1) throws android.os.RemoteException { return false; }
            public void registerPackageMonitorCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException {}
            public void unregisterPackageMonitorCallback(android.os.IRemoteCallback p0) throws android.os.RemoteException {}
            public android.content.pm.ArchivedPackageParcel getArchivedPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.graphics.Bitmap getArchivedAppIcon(java.lang.String p0, android.os.UserHandle p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean isAppArchivable(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
            public int getAppMetadataSource(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public android.content.ComponentName getDomainVerificationAgent(int p0) throws android.os.RemoteException { return null; }
            public void setPageSizeAppCompatFlagsSettingsOverride(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public boolean isPageSizeCompatEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public java.lang.String getPageSizeCompatWarningMessage(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getAllApexDirectories() throws android.os.RemoteException { return null; }
        }
    }
}
