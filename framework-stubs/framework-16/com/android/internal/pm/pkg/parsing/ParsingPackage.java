package com.android.internal.pm.pkg.parsing;

public interface ParsingPackage {
    public com.android.internal.pm.pkg.parsing.ParsingPackage addActivity(com.android.internal.pm.pkg.component.ParsedActivity p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addAdoptPermission(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addApexSystemService(com.android.internal.pm.pkg.component.ParsedApexSystemService p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addConfigPreference(android.content.pm.ConfigurationInfo p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addFeatureGroup(android.content.pm.FeatureGroupInfo p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addImplicitPermission(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addInstrumentation(com.android.internal.pm.pkg.component.ParsedInstrumentation p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addKeySet(java.lang.String p0, java.security.PublicKey p1);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addLibraryName(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addOriginalPackage(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addOverlayable(java.lang.String p0, java.lang.String p1);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addPermission(com.android.internal.pm.pkg.component.ParsedPermission p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addPermissionGroup(com.android.internal.pm.pkg.component.ParsedPermissionGroup p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addPreferredActivityFilter(java.lang.String p0, com.android.internal.pm.pkg.component.ParsedIntentInfo p1);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addProperty(android.content.pm.PackageManager.Property p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addProtectedBroadcast(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addProvider(com.android.internal.pm.pkg.component.ParsedProvider p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addAttribution(com.android.internal.pm.pkg.component.ParsedAttribution p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addReceiver(com.android.internal.pm.pkg.component.ParsedActivity p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addReqFeature(android.content.pm.FeatureInfo p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addUsesPermission(com.android.internal.pm.pkg.component.ParsedUsesPermission p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addService(com.android.internal.pm.pkg.component.ParsedService p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addUsesLibrary(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addUsesOptionalLibrary(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addUsesNativeLibrary(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addUsesOptionalNativeLibrary(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addUsesSdkLibrary(java.lang.String p0, long p1, java.lang.String[] p2, boolean p3);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addUsesStaticLibrary(java.lang.String p0, long p1, java.lang.String[] p2);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addQueriesIntent(android.content.Intent p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addQueriesPackage(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addQueriesProvider(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage addFeatureFlag(java.lang.String p0, java.lang.Boolean p1);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setProcesses(java.util.Map<java.lang.String, com.android.internal.pm.pkg.component.ParsedProcess> p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage asSplit(java.lang.String[] p0, java.lang.String[] p1, int[] p2, android.util.SparseArray<int[]> p3);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setMetaData(android.os.Bundle p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setForceQueryable(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setMaxAspectRatio(float p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setMinAspectRatio(float p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setPermission(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setProcessName(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setSharedUserId(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setStaticSharedLibraryName(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setTaskAffinity(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setTargetSdkVersion(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setUiOptions(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setHardwareAccelerated(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setResizeableActivity(java.lang.Boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setResizeableActivityViaSdkVersion(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setAllowAudioPlaybackCapture(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setBackupAllowed(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setClearUserDataAllowed(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setClearUserDataOnFailedRestoreAllowed(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setTaskReparentingAllowed(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setResourceOverlay(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setBackupInForeground(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setSaveStateDisallowed(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setDebuggable(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setDefaultToDeviceProtectedStorage(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setDirectBootAware(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setExternalStorage(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setExtractNativeLibrariesRequested(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setFullBackupOnly(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setDeclaredHavingCode(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setUserDataFragile(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setGame(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setIsolatedSplitLoading(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setKillAfterRestoreAllowed(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setLargeHeap(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setMultiArch(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setPartiallyDirectBootAware(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setPersistent(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setProfileableByShell(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setProfileable(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setRequestLegacyExternalStorage(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setAllowNativeHeapPointerTagging(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setAutoRevokePermissions(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setPreserveLegacyExternalStorage(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setRestoreAnyVersion(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setSdkLibraryName(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setSdkLibVersionMajor(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setSdkLibrary(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setSplitHasCode(int p0, boolean p1);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setStaticSharedLibrary(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setRtlSupported(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setTestOnly(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setUseEmbeddedDex(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setCleartextTrafficAllowed(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setNonSdkApiRequested(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setVisibleToInstantApps(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setVmSafeMode(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage removeUsesOptionalLibrary(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage removeUsesOptionalNativeLibrary(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setAnyDensity(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setAppComponentFactory(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setBackupAgentName(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setBannerResourceId(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setCategory(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setClassLoaderName(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setApplicationClassName(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setCompatibleWidthLimitDp(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setDescriptionResourceId(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setEnabled(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setGwpAsanMode(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setMemtagMode(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setNativeHeapZeroInitialized(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setPageSizeAppCompatFlags(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setRequestRawExternalStorageAccess(java.lang.Boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setCrossProfile(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setFullBackupContentResourceId(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setDataExtractionRulesResourceId(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setHasDomainUrls(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setIconResourceId(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setInstallLocation(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setLeavingSharedUser(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setLabelResourceId(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setLargestWidthLimitDp(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setLogoResourceId(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setManageSpaceActivityName(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setMinExtensionVersions(android.util.SparseIntArray p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setMinSdkVersion(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setMaxSdkVersion(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setNetworkSecurityConfigResourceId(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setNonLocalizedLabel(java.lang.CharSequence p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setOverlayCategory(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setOverlayIsStatic(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setOverlayPriority(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setOverlayTarget(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setOverlayTargetOverlayableName(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setRequiredAccountType(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setRequiredForAllUsers(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setRequiresSmallestWidthDp(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setResizeable(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setRestrictUpdateHash(byte[] p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setRestrictedAccountType(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setRoundIconResourceId(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setSharedUserLabelResourceId(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setSigningDetails(android.content.pm.SigningDetails p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setSplitClassLoaderName(int p0, java.lang.String p1);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setStaticSharedLibraryVersion(long p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setUpdatableSystem(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setEmergencyInstaller(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setLargeScreensSupported(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setNormalScreensSupported(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setSmallScreensSupported(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setExtraLargeScreensSupported(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setTargetSandboxVersion(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setThemeResourceId(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setRequestForegroundServiceExemption(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setUpgradeKeySets(java.util.Set<java.lang.String> p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage set32BitAbiPreferred(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setVolumeUuid(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setZygotePreloadName(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setAllowCrossUidActivitySwitchFromBelow(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage sortActivities();
    public com.android.internal.pm.pkg.parsing.ParsingPackage sortReceivers();
    public com.android.internal.pm.pkg.parsing.ParsingPackage sortServices();
    public com.android.internal.pm.pkg.parsing.ParsingPackage setBaseRevisionCode(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setVersionCode(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setVersionCodeMajor(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setVersionName(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setCompileSdkVersion(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setCompileSdkVersionCodeName(java.lang.String p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setAttributionsAreUserVisible(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setResetEnabledSettingsOnAppDataCleared(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setLocaleConfigResourceId(int p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setKnownActivityEmbeddingCerts(java.util.Set<java.lang.String> p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setOnBackInvokedCallbackEnabled(boolean p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setAlternateLauncherIconResIds(int[] p0);
    public com.android.internal.pm.pkg.parsing.ParsingPackage setAlternateLauncherLabelResIds(int[] p0);
    public com.android.internal.pm.parsing.pkg.ParsedPackage hideAsParsed();
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedActivity> getActivities();
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedAttribution> getAttributions();
    @android.annotation.NonNull
    public java.lang.String getBaseApkPath();
    @android.annotation.Nullable
    public java.lang.String getClassLoaderName();
    @android.annotation.NonNull
    public java.util.List<android.content.pm.ConfigurationInfo> getConfigPreferences();
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedInstrumentation> getInstrumentations();
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.util.ArraySet<java.security.PublicKey>> getKeySetMapping();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getLibraryNames();
    public float getMaxAspectRatio();
    public int getMaxSdkVersion();
    @android.annotation.Nullable
    public android.os.Bundle getMetaData();
    public float getMinAspectRatio();
    public int getMinSdkVersion();
    public java.lang.String getPackageName();
    @android.annotation.Nullable
    public java.lang.String getPermission();
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedPermission> getPermissions();
    @android.annotation.NonNull
    public java.lang.String getProcessName();
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedProvider> getProviders();
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedActivity> getReceivers();
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getRequestedPermissions();
    @android.annotation.Nullable
    public java.lang.Boolean getResizeableActivity();
    @android.annotation.Nullable
    public java.lang.String getSdkLibraryName();
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedService> getServices();
    @android.annotation.Nullable
    public java.lang.String getSharedUserId();
    @android.annotation.NonNull
    public java.lang.String[] getSplitCodePaths();
    @android.annotation.NonNull
    public java.lang.String[] getSplitNames();
    @android.annotation.Nullable
    public java.lang.String getStaticSharedLibraryName();
    public int getTargetSdkVersion();
    @android.annotation.Nullable
    public java.lang.String getTaskAffinity();
    public int getUiOptions();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesLibraries();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesNativeLibraries();
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedUsesPermission> getUsesPermissions();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesSdkLibraries();
    @android.annotation.Nullable
    public long[] getUsesSdkLibrariesVersionsMajor();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesStaticLibraries();
    @android.annotation.Nullable
    public java.lang.String getZygotePreloadName();
    public boolean isAllowCrossUidActivitySwitchFromBelow();
    public boolean isBackupAllowed();
    public boolean isTaskReparentingAllowed();
    public boolean isAnyDensity();
    public boolean isHardwareAccelerated();
    public boolean isSaveStateDisallowed();
    public boolean isProfileable();
    public boolean isProfileableByShell();
    public boolean isResizeable();
    public boolean isResizeableActivityViaSdkVersion();
    public boolean isStaticSharedLibrary();
    public boolean isExtraLargeScreensSupported();
    public boolean isLargeScreensSupported();
    public boolean isNormalScreensSupported();
    public boolean isSmallScreensSupported();
    public com.android.internal.pm.pkg.parsing.ParsingPackage setIntentMatchingFlags(int p0);
    public int getIntentMatchingFlags();
}
