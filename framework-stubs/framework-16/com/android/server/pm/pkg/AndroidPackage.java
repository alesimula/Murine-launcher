package com.android.server.pm.pkg;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.SYSTEM_SERVER)
@android.processor.immutability.Immutable
public interface AndroidPackage {
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.Nullable
    public int[] getAlternateLauncherIconResIds();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.Nullable
    public int[] getAlternateLauncherLabelResIds();
    @android.annotation.Nullable
    public java.lang.String getApplicationClassName();
    @android.annotation.Nullable
    public java.lang.String getAppComponentFactory();
    @android.annotation.Nullable
    public java.lang.String getBackupAgentName();
    public int getBannerResourceId();
    public int getBaseRevisionCode();
    public int getCategory();
    @android.annotation.Nullable
    public java.lang.String getClassLoaderName();
    public int getCompatibleWidthLimitDp();
    public int getDataExtractionRulesResourceId();
    public int getDescriptionResourceId();
    public int getFullBackupContentResourceId();
    public int getGwpAsanMode();
    public int getIconResourceId();
    public int getLabelResourceId();
    public int getLargestWidthLimitDp();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getLibraryNames();
    public int getLogoResourceId();
    public int getLocaleConfigResourceId();
    public long getLongVersionCode();
    public float getMaxAspectRatio();
    public float getMinAspectRatio();
    public int getNativeHeapZeroInitialized();
    public int getNetworkSecurityConfigResourceId();
    @android.annotation.Nullable
    public java.lang.String getRequiredAccountType();
    public int getRequiresSmallestWidthDp();
    @android.annotation.Nullable
    public java.lang.String getRestrictedAccountType();
    @android.annotation.Nullable
    public java.lang.String getEmergencyInstaller();
    public int getRoundIconResourceId();
    @android.annotation.Nullable
    public java.lang.String getSdkLibraryName();
    @android.annotation.Nullable
    public java.lang.String getSharedUserId();
    public int getSharedUserLabelResourceId();
    @android.annotation.NonNull
    public java.util.List<com.android.server.pm.pkg.AndroidPackageSplit> getSplits();
    @android.annotation.Nullable
    public java.lang.String getStaticSharedLibraryName();
    public long getStaticSharedLibraryVersion();
    @android.annotation.NonNull
    public java.util.UUID getStorageUuid();
    public int getTargetSdkVersion();
    public int getThemeResourceId();
    public int getUiOptions();
    @android.annotation.Nullable
    public java.lang.String getVersionName();
    @android.annotation.Nullable
    public java.lang.String getZygotePreloadName();
    public boolean isAllowAudioPlaybackCapture();
    public boolean isBackupAllowed();
    public boolean isClearUserDataAllowed();
    public boolean isClearUserDataOnFailedRestoreAllowed();
    public boolean isAllowNativeHeapPointerTagging();
    public boolean isTaskReparentingAllowed();
    public boolean isAnyDensity();
    public boolean isAttributionsUserVisible();
    public boolean isBackupInForeground();
    public boolean isHardwareAccelerated();
    public boolean isSaveStateDisallowed();
    public boolean isCoreApp();
    public boolean isCrossProfile();
    public boolean isDebuggable();
    public boolean isDefaultToDeviceProtectedStorage();
    public boolean isDirectBootAware();
    public boolean isExtractNativeLibrariesRequested();
    public boolean isFactoryTest();
    public boolean isForceQueryable();
    public boolean isFullBackupOnly();
    public boolean isDeclaredHavingCode();
    public boolean isUserDataFragile();
    public boolean isIsolatedSplitLoading();
    public boolean isKillAfterRestoreAllowed();
    public boolean isLargeHeap();
    public boolean isLeavingSharedUser();
    public boolean isMultiArch();
    public boolean isNativeLibraryRootRequiresIsa();
    public boolean isOnBackInvokedCallbackEnabled();
    public boolean isPersistent();
    public boolean isProfileable();
    public boolean isProfileableByShell();
    public boolean isRequestLegacyExternalStorage();
    public boolean isRequiredForAllUsers();
    public boolean isResetEnabledSettingsOnAppDataCleared();
    public boolean isResourceOverlay();
    public boolean isRestoreAnyVersion();
    public boolean isSignedWithPlatformKey();
    public boolean isExtraLargeScreensSupported();
    public boolean isLargeScreensSupported();
    public boolean isNormalScreensSupported();
    public boolean isRtlSupported();
    public boolean isSmallScreensSupported();
    public boolean isTestOnly();
    public boolean is32BitAbiPreferred();
    public boolean isCleartextTrafficAllowed();
    public boolean isUseEmbeddedDex();
    public boolean isNonSdkApiRequested();
    public boolean isVmSafeMode();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedActivity> getActivities();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAdoptPermissions();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedApexSystemService> getApexSystemServices();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedAttribution> getAttributions();
    public int getAutoRevokePermissions();
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.lang.String getBaseApkPath();
    public int getCompileSdkVersion();
    @android.annotation.Nullable
    public java.lang.String getCompileSdkVersionCodeName();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<android.content.pm.ConfigurationInfo> getConfigPreferences();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<android.content.pm.FeatureGroupInfo> getFeatureGroups();
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getImplicitPermissions();
    public int getInstallLocation();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedInstrumentation> getInstrumentations();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.util.ArraySet<java.security.PublicKey>> getKeySetMapping();
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getKnownActivityEmbeddingCerts();
    @android.annotation.Nullable
    public java.lang.String getManageSpaceActivityName();
    @android.annotation.NonNull
    public java.lang.String getManifestPackageName();
    public int getMaxSdkVersion();
    public int getMemtagMode();
    public int getPageSizeAppCompatFlags();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.Nullable
    public android.os.Bundle getMetaData();
    @android.annotation.Nullable
    public java.util.Set<java.lang.String> getMimeGroups();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.Nullable
    public android.util.SparseIntArray getMinExtensionVersions();
    public int getMinSdkVersion();
    @android.annotation.Nullable
    public java.lang.String getNativeLibraryDir();
    @android.annotation.Nullable
    public java.lang.String getNativeLibraryRootDir();
    @android.annotation.Nullable
    public java.lang.CharSequence getNonLocalizedLabel();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getOriginalPackages();
    @android.annotation.Nullable
    public java.lang.String getOverlayCategory();
    public int getOverlayPriority();
    @android.annotation.Nullable
    public java.lang.String getOverlayTarget();
    @android.annotation.Nullable
    public java.lang.String getOverlayTargetOverlayableName();
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.lang.String> getOverlayables();
    public java.lang.String getPackageName();
    @android.annotation.NonNull
    public java.lang.String getPath();
    @android.annotation.Nullable
    public java.lang.String getPermission();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedPermissionGroup> getPermissionGroups();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedPermission> getPermissions();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<android.util.Pair<java.lang.String, com.android.internal.pm.pkg.component.ParsedIntentInfo>> getPreferredActivityFilters();
    @android.annotation.NonNull
    public java.lang.String getProcessName();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, com.android.internal.pm.pkg.component.ParsedProcess> getProcesses();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.content.pm.PackageManager.Property> getProperties();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getProtectedBroadcasts();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedProvider> getProviders();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<android.content.Intent> getQueriesIntents();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getQueriesPackages();
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getQueriesProviders();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedActivity> getReceivers();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<android.content.pm.FeatureInfo> getRequestedFeatures();
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getRequestedPermissions();
    @android.annotation.Nullable
    public java.lang.Boolean getResizeableActivity();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.Nullable
    public byte[] getRestrictUpdateHash();
    public int getSdkLibVersionMajor();
    @android.annotation.Nullable
    public java.lang.String getSecondaryNativeLibraryDir();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedService> getServices();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public android.content.pm.SigningDetails getSigningDetails();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.Nullable
    public java.lang.String[] getSplitClassLoaderNames();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.lang.String[] getSplitCodePaths();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public android.util.SparseArray<int[]> getSplitDependencies();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.Nullable
    public int[] getSplitFlags();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.lang.String[] getSplitNames();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public int[] getSplitRevisionCodes();
    public int getTargetSandboxVersion();
    @android.annotation.Nullable
    public java.lang.String getTaskAffinity();
    @java.lang.Deprecated
    public int getUid();
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getUpgradeKeySets();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesLibraries();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesNativeLibraries();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesOptionalLibraries();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesOptionalNativeLibraries();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedUsesPermission> getUsesPermissions();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, com.android.internal.pm.pkg.component.ParsedUsesPermission> getUsesPermissionMapping();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesSdkLibraries();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.Nullable
    public java.lang.String[][] getUsesSdkLibrariesCertDigests();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.Nullable
    public long[] getUsesSdkLibrariesVersionsMajor();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.Nullable
    public boolean[] getUsesSdkLibrariesOptional();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesStaticLibraries();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.Nullable
    public java.lang.String[][] getUsesStaticLibrariesCertDigests();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.Nullable
    public long[] getUsesStaticLibrariesVersions();
    @android.annotation.Nullable
    public java.lang.String getVolumeUuid();
    public boolean hasPreserveLegacyExternalStorage();
    public boolean hasRequestForegroundServiceExemption();
    public java.lang.Boolean hasRequestRawExternalStorageAccess();
    public boolean isApex();
    public boolean isUpdatableSystem();
    public boolean isEnabled();
    public boolean isExternalStorage();
    @java.lang.Deprecated
    public boolean isGame();
    public boolean isHasDomainUrls();
    public boolean isOverlayIsStatic();
    public boolean isPartiallyDirectBootAware();
    public boolean isResizeable();
    public boolean isResizeableActivityViaSdkVersion();
    public boolean isSdkLibrary();
    public boolean isStaticSharedLibrary();
    public boolean isStub();
    public boolean isVisibleToInstantApps();
    public boolean isAllowCrossUidActivitySwitchFromBelow();
    public int getIntentMatchingFlags();
}
