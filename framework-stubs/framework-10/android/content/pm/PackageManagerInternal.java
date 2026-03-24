package android.content.pm;

public abstract class PackageManagerInternal {
    public static final int PACKAGE_SYSTEM = 0;
    public static final int PACKAGE_SETUP_WIZARD = 1;
    public static final int PACKAGE_INSTALLER = 2;
    public static final int PACKAGE_VERIFIER = 3;
    public static final int PACKAGE_BROWSER = 4;
    public static final int PACKAGE_SYSTEM_TEXT_CLASSIFIER = 5;
    public static final int PACKAGE_PERMISSION_CONTROLLER = 6;
    public static final int PACKAGE_WELLBEING = 7;
    public static final int PACKAGE_DOCUMENTER = 8;
    public static final int PACKAGE_CONFIGURATOR = 9;
    public static final int PACKAGE_INCIDENT_REPORT_APPROVER = 10;
    public static final int PACKAGE_APP_PREDICTOR = 11;
    public static final java.lang.String EXTRA_ENABLE_ROLLBACK_TOKEN = "android.content.pm.extra.ENABLE_ROLLBACK_TOKEN";
    public static final java.lang.String EXTRA_ENABLE_ROLLBACK_INSTALL_FLAGS = "android.content.pm.extra.ENABLE_ROLLBACK_INSTALL_FLAGS";
    public static final java.lang.String EXTRA_ENABLE_ROLLBACK_INSTALLED_USERS = "android.content.pm.extra.ENABLE_ROLLBACK_INSTALLED_USERS";
    public static final java.lang.String EXTRA_ENABLE_ROLLBACK_USER = "android.content.pm.extra.ENABLE_ROLLBACK_USER";
    public static final int ENABLE_ROLLBACK_SUCCEEDED = 1;
    public static final int ENABLE_ROLLBACK_FAILED = -1;
    public PackageManagerInternal() {}
    public abstract void setLocationPackagesProvider(android.content.pm.PackageManagerInternal.PackagesProvider p0);
    public abstract void setLocationExtraPackagesProvider(android.content.pm.PackageManagerInternal.PackagesProvider p0);
    public abstract void setVoiceInteractionPackagesProvider(android.content.pm.PackageManagerInternal.PackagesProvider p0);
    public abstract void setUseOpenWifiAppPackagesProvider(android.content.pm.PackageManagerInternal.PackagesProvider p0);
    public abstract void setSyncAdapterPackagesprovider(android.content.pm.PackageManagerInternal.SyncAdapterPackagesProvider p0);
    public void onDefaultSmsAppChanged(java.lang.String p0, int p1) {}
    public void onDefaultSimCallManagerAppChanged(java.lang.String p0, int p1) {}
    public abstract void grantDefaultPermissionsToDefaultUseOpenWifiApp(java.lang.String p0, int p1);
    public abstract void setKeepUninstalledPackages(java.util.List<java.lang.String> p0);
    public abstract boolean isPermissionsReviewRequired(java.lang.String p0, int p1);
    public abstract android.content.pm.PackageInfo getPackageInfo(java.lang.String p0, int p1, int p2, int p3);
    public abstract java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(int p0, int p1, int p2);
    public abstract android.os.Bundle getSuspendedPackageLauncherExtras(java.lang.String p0, int p1);
    public abstract boolean isPackageSuspended(java.lang.String p0, int p1);
    public abstract java.lang.String getSuspendingPackage(java.lang.String p0, int p1);
    public abstract android.content.pm.SuspendDialogInfo getSuspendedDialogInfo(java.lang.String p0, int p1);
    public abstract int getDistractingPackageRestrictions(java.lang.String p0, int p1);
    public abstract int getPackageUid(java.lang.String p0, int p1, int p2);
    public abstract android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, int p1, int p2, int p3);
    public abstract android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName p0, int p1, int p2, int p3);
    public abstract java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent p0, int p1, int p2, int p3);
    public abstract java.util.List<android.content.pm.ResolveInfo> queryIntentServices(android.content.Intent p0, int p1, int p2, int p3);
    public abstract android.content.ComponentName getHomeActivitiesAsUser(java.util.List<android.content.pm.ResolveInfo> p0, int p1);
    public abstract android.content.ComponentName getDefaultHomeActivity(int p0);
    public abstract void setDeviceAndProfileOwnerPackages(int p0, java.lang.String p1, android.util.SparseArray<java.lang.String> p2);
    public abstract boolean isPackageDataProtected(int p0, java.lang.String p1);
    public abstract boolean isPackageStateProtected(java.lang.String p0, int p1);
    public abstract boolean isPackageEphemeral(int p0, java.lang.String p1);
    public abstract boolean wasPackageEverLaunched(java.lang.String p0, int p1);
    public abstract void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2, boolean p3);
    public abstract void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, int p2, boolean p3);
    public abstract java.lang.String getNameForUid(int p0);
    public abstract void requestInstantAppResolutionPhaseTwo(android.content.pm.AuxiliaryResolveInfo p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3, android.os.Bundle p4, int p5);
    public abstract void grantEphemeralAccess(int p0, android.content.Intent p1, int p2, int p3);
    public abstract boolean isInstantAppInstallerComponent(android.content.ComponentName p0);
    public abstract void pruneInstantApps();
    public abstract java.lang.String getSetupWizardPackageName();
    public abstract void setExternalSourcesPolicy(android.content.pm.PackageManagerInternal.ExternalSourcesPolicy p0);
    public abstract boolean isPackagePersistent(java.lang.String p0);
    public abstract boolean isLegacySystemApp(android.content.pm.PackageParser.Package p0);
    public abstract java.util.List<android.content.pm.PackageInfo> getOverlayPackages(int p0);
    public abstract java.util.List<java.lang.String> getTargetPackageNames(int p0);
    public abstract boolean setEnabledOverlayPackages(int p0, java.lang.String p1, java.util.List<java.lang.String> p2);
    public abstract android.content.pm.ResolveInfo resolveIntent(android.content.Intent p0, java.lang.String p1, int p2, int p3, boolean p4, int p5);
    public abstract android.content.pm.ResolveInfo resolveService(android.content.Intent p0, java.lang.String p1, int p2, int p3, int p4);
    public abstract android.content.pm.ProviderInfo resolveContentProvider(java.lang.String p0, int p1, int p2);
    public abstract void addIsolatedUid(int p0, int p1);
    public abstract void removeIsolatedUid(int p0);
    public abstract int getUidTargetSdkVersion(int p0);
    public abstract int getPackageTargetSdkVersion(java.lang.String p0);
    public abstract boolean canAccessInstantApps(int p0, int p1);
    public abstract boolean canAccessComponent(int p0, android.content.ComponentName p1, int p2);
    public abstract boolean hasInstantApplicationMetadata(java.lang.String p0, int p1);
    public abstract void notifyPackageUse(java.lang.String p0, int p1);
    public abstract android.content.pm.PackageParser.Package getPackage(java.lang.String p0);
    public android.content.pm.PackageList getPackageList() { return null; }
    public abstract android.content.pm.PackageList getPackageList(android.content.pm.PackageManagerInternal.PackageListObserver p0);
    public abstract void removePackageListObserver(android.content.pm.PackageManagerInternal.PackageListObserver p0);
    public abstract android.content.pm.PackageParser.Package getDisabledSystemPackage(java.lang.String p0);
    public abstract java.lang.String getDisabledSystemPackageName(java.lang.String p0);
    public abstract boolean isResolveActivityComponent(android.content.pm.ComponentInfo p0);
    public abstract java.lang.String getKnownPackageName(int p0, int p1);
    public abstract boolean isInstantApp(java.lang.String p0, int p1);
    public abstract java.lang.String getInstantAppPackageName(int p0);
    public abstract boolean filterAppAccess(android.content.pm.PackageParser.Package p0, int p1, int p2);
    public abstract int getPermissionFlagsTEMP(java.lang.String p0, java.lang.String p1, int p2);
    public abstract void updatePermissionFlagsTEMP(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4);
    public abstract boolean isPlatformSigned(java.lang.String p0);
    public abstract boolean isDataRestoreSafe(byte[] p0, java.lang.String p1);
    public abstract boolean isDataRestoreSafe(android.content.pm.Signature p0, java.lang.String p1);
    public abstract boolean hasSignatureCapability(int p0, int p1, int p2);
    public abstract android.content.pm.PackageManagerInternal.CheckPermissionDelegate getCheckPermissionDelegate();
    public abstract void setCheckPermissionDelegate(android.content.pm.PackageManagerInternal.CheckPermissionDelegate p0);
    public abstract android.util.SparseArray<java.lang.String> getAppsWithSharedUserIds();
    public abstract java.lang.String getSharedUserIdForPackage(java.lang.String p0);
    public abstract java.lang.String[] getPackagesForSharedUserId(java.lang.String p0, int p1);
    public abstract boolean isOnlyCoreApps();
    public abstract void freeStorage(java.lang.String p0, long p1, int p2) throws java.io.IOException;
    public abstract boolean isEnabledAndMatches(android.content.pm.ComponentInfo p0, int p1, int p2);
    public abstract boolean userNeedsBadging(int p0);
    public abstract void forEachPackage(java.util.function.Consumer<android.content.pm.PackageParser.Package> p0);
    public abstract void forEachInstalledPackage(java.util.function.Consumer<android.content.pm.PackageParser.Package> p0, int p1);
    public abstract android.util.ArraySet<java.lang.String> getEnabledComponents(java.lang.String p0, int p1);
    public abstract android.util.ArraySet<java.lang.String> getDisabledComponents(java.lang.String p0, int p1);
    public abstract int getApplicationEnabledState(java.lang.String p0, int p1);
    public abstract void setEnableRollbackCode(int p0, int p1);
    public abstract boolean compileLayouts(java.lang.String p0);
    public abstract void finishPackageInstall(int p0, boolean p1);
    public abstract java.lang.String removeLegacyDefaultBrowserPackageName(int p0);
    public abstract void setDefaultBrowserProvider(android.content.pm.PackageManagerInternal.DefaultBrowserProvider p0);
    public abstract void setDefaultDialerProvider(android.content.pm.PackageManagerInternal.DefaultDialerProvider p0);
    public abstract void setDefaultHomeProvider(android.content.pm.PackageManagerInternal.DefaultHomeProvider p0);
    public abstract boolean isApexPackage(java.lang.String p0);
    public abstract void uninstallApex(java.lang.String p0, long p1, int p2, android.content.IntentSender p3);
    public abstract boolean wereDefaultPermissionsGrantedSinceBoot(int p0);
    public abstract void setRuntimePermissionsFingerPrint(java.lang.String p0, int p1);
    public abstract void migrateLegacyObbData();

    public static interface SyncAdapterPackagesProvider {
        public java.lang.String[] getPackages(java.lang.String p0, int p1);
    }

    public static interface PackagesProvider {
        public java.lang.String[] getPackages(int p0);
    }

    public static interface PackageListObserver {
        public void onPackageAdded(java.lang.String p0, int p1);
        default public void onPackageChanged(java.lang.String p0, int p1) {}
        public void onPackageRemoved(java.lang.String p0, int p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface KnownPackage {
    }

    public static interface ExternalSourcesPolicy {
        public static final int USER_TRUSTED = 0;
        public static final int USER_BLOCKED = 1;
        public static final int USER_DEFAULT = 2;
        public int getPackageTrustedToInstallApps(java.lang.String p0, int p1);
    }

    public static interface DefaultHomeProvider {
        public java.lang.String getDefaultHome(int p0);
        public void setDefaultHomeAsync(java.lang.String p0, int p1, java.util.function.Consumer<java.lang.Boolean> p2);
    }

    public static interface DefaultDialerProvider {
        public java.lang.String getDefaultDialer(int p0);
    }

    public static interface DefaultBrowserProvider {
        public java.lang.String getDefaultBrowser(int p0);
        public boolean setDefaultBrowser(java.lang.String p0, int p1);
        public void setDefaultBrowserAsync(java.lang.String p0, int p1);
    }

    public static interface CheckPermissionDelegate {
        public int checkPermission(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.util.function.TriFunction<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer> p3);
        public int checkUidPermission(java.lang.String p0, int p1, java.util.function.BiFunction<java.lang.String, java.lang.Integer, java.lang.Integer> p2);
    }
}
