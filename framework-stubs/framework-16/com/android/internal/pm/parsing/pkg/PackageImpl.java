package com.android.internal.pm.parsing.pkg;

public class PackageImpl implements com.android.internal.pm.parsing.pkg.ParsedPackage, com.android.internal.pm.parsing.pkg.AndroidPackageInternal, com.android.internal.pm.parsing.pkg.AndroidPackageHidden, com.android.internal.pm.pkg.parsing.ParsingPackage, com.android.internal.pm.pkg.parsing.ParsingPackageHidden, android.os.Parcelable {
    public static final com.android.internal.util.Parcelling.BuiltIn.ForBoolean sForBoolean = null;
    public static final com.android.internal.util.Parcelling.BuiltIn.ForInternedString sForInternedString = null;
    public static final com.android.internal.util.Parcelling.BuiltIn.ForInternedStringArray sForInternedStringArray = null;
    public static final com.android.internal.util.Parcelling.BuiltIn.ForInternedStringList sForInternedStringList = null;
    public static final com.android.internal.util.Parcelling.BuiltIn.ForInternedStringValueMap sForInternedStringValueMap = null;
    public static final com.android.internal.util.Parcelling.BuiltIn.ForStringSet sForStringSet = null;
    public static final com.android.internal.util.Parcelling.BuiltIn.ForInternedStringSet sForInternedStringSet = null;
    protected static final com.android.internal.pm.pkg.parsing.ParsingUtils.StringPairListParceler sForIntentInfoPairs = null;
    protected int versionCode;
    protected int versionCodeMajor;
    @android.annotation.NonNull
    protected java.lang.String packageName;
    @android.annotation.NonNull
    protected java.lang.String mBaseApkPath;
    @android.annotation.NonNull
    protected java.util.List<java.lang.String> usesLibraries;
    @android.annotation.NonNull
    protected java.util.List<java.lang.String> usesOptionalLibraries;
    @android.annotation.NonNull
    protected java.util.List<java.lang.String> usesNativeLibraries;
    @android.annotation.NonNull
    protected java.util.List<java.lang.String> usesOptionalNativeLibraries;
    @android.annotation.NonNull
    protected java.util.List<java.lang.String> originalPackages;
    @android.annotation.NonNull
    protected java.util.List<java.lang.String> adoptPermissions;
    @java.lang.Deprecated
    @android.annotation.NonNull
    protected java.util.Set<java.lang.String> requestedPermissions;
    @android.annotation.NonNull
    protected java.util.List<java.lang.String> protectedBroadcasts;
    @android.annotation.NonNull
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedActivity> activities;
    @android.annotation.NonNull
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedApexSystemService> apexSystemServices;
    @android.annotation.NonNull
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedActivity> receivers;
    @android.annotation.NonNull
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedService> services;
    @android.annotation.NonNull
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedProvider> providers;
    @android.annotation.NonNull
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedPermission> permissions;
    @android.annotation.NonNull
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedPermissionGroup> permissionGroups;
    @android.annotation.NonNull
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedInstrumentation> instrumentations;
    @android.annotation.Nullable
    protected java.lang.String volumeUuid;
    @android.annotation.NonNull
    protected java.lang.String mPath;
    @android.annotation.Nullable
    protected java.lang.String[] splitCodePaths;
    @android.annotation.NonNull
    protected java.util.UUID mStorageUuid;
    @android.annotation.Nullable
    protected java.lang.String nativeLibraryDir;
    @android.annotation.Nullable
    protected java.lang.String nativeLibraryRootDir;
    @android.annotation.Nullable
    protected java.lang.String primaryCpuAbi;
    @android.annotation.Nullable
    protected java.lang.String secondaryCpuAbi;
    @android.annotation.Nullable
    protected java.lang.String secondaryNativeLibraryDir;
    com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback mCallback;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.android.internal.pm.parsing.pkg.PackageImpl> CREATOR = null;
    @android.annotation.NonNull
    public static com.android.internal.pm.parsing.pkg.PackageImpl forParsing(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.content.res.TypedArray p3, boolean p4, com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback p5) { return null; }
    @android.annotation.NonNull
    public static com.android.server.pm.pkg.AndroidPackage buildFakeForDeletion(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.NonNull
    public static com.android.internal.pm.pkg.parsing.ParsingPackage forTesting(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static com.android.internal.pm.pkg.parsing.ParsingPackage forTesting(java.lang.String p0, java.lang.String p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addActivity(com.android.internal.pm.pkg.component.ParsedActivity p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addAdoptPermission(java.lang.String p0) { return null; }
    public final com.android.internal.pm.parsing.pkg.PackageImpl addApexSystemService(com.android.internal.pm.pkg.component.ParsedApexSystemService p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addAttribution(com.android.internal.pm.pkg.component.ParsedAttribution p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addConfigPreference(android.content.pm.ConfigurationInfo p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addFeatureGroup(android.content.pm.FeatureGroupInfo p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addImplicitPermission(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addInstrumentation(com.android.internal.pm.pkg.component.ParsedInstrumentation p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addKeySet(java.lang.String p0, java.security.PublicKey p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addLibraryName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addOriginalPackage(java.lang.String p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage addOverlayable(java.lang.String p0, java.lang.String p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addPermission(com.android.internal.pm.pkg.component.ParsedPermission p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addPermissionGroup(com.android.internal.pm.pkg.component.ParsedPermissionGroup p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addPreferredActivityFilter(java.lang.String p0, com.android.internal.pm.pkg.component.ParsedIntentInfo p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addProperty(android.content.pm.PackageManager.Property p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addProtectedBroadcast(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addProvider(com.android.internal.pm.pkg.component.ParsedProvider p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addQueriesIntent(android.content.Intent p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addQueriesPackage(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addQueriesProvider(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addReceiver(com.android.internal.pm.pkg.component.ParsedActivity p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addReqFeature(android.content.pm.FeatureInfo p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addService(com.android.internal.pm.pkg.component.ParsedService p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesLibrary(java.lang.String p0) { return null; }
    public final com.android.internal.pm.parsing.pkg.PackageImpl addUsesNativeLibrary(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesOptionalLibrary(java.lang.String p0) { return null; }
    public final com.android.internal.pm.parsing.pkg.PackageImpl addUsesOptionalNativeLibrary(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesPermission(com.android.internal.pm.pkg.component.ParsedUsesPermission p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesSdkLibrary(java.lang.String p0, long p1, java.lang.String[] p2, boolean p3) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesStaticLibrary(java.lang.String p0, long p1, java.lang.String[] p2) { return null; }
    public boolean isAttributionsUserVisible() { return false; }
    public com.android.internal.pm.parsing.pkg.PackageImpl asSplit(java.lang.String[] p0, java.lang.String[] p1, int[] p2, android.util.SparseArray<int[]> p3) { return null; }
    protected void assignDerivedFields() {}
    public java.util.List<com.android.server.pm.pkg.AndroidPackageSplit> getSplits() { return null; }
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedActivity> getActivities() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAdoptPermissions() { return null; }
    @android.annotation.Nullable
    public int[] getAlternateLauncherIconResIds() { return null; }
    @android.annotation.Nullable
    public int[] getAlternateLauncherLabelResIds() { return null; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedApexSystemService> getApexSystemServices() { return null; }
    @android.annotation.Nullable
    public java.lang.String getAppComponentFactory() { return null; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedAttribution> getAttributions() { return null; }
    public int getAutoRevokePermissions() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getBackupAgentName() { return null; }
    public int getBannerResourceId() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getBaseApkPath() { return null; }
    public int getBaseRevisionCode() { return 0; }
    public int getCategory() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getClassLoaderName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getApplicationClassName() { return null; }
    public int getCompatibleWidthLimitDp() { return 0; }
    public int getCompileSdkVersion() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getCompileSdkVersionCodeName() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.content.pm.ConfigurationInfo> getConfigPreferences() { return null; }
    public int getDataExtractionRulesResourceId() { return 0; }
    public int getDescriptionResourceId() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.content.pm.FeatureGroupInfo> getFeatureGroups() { return null; }
    public int getFullBackupContentResourceId() { return 0; }
    public int getGwpAsanMode() { return 0; }
    public int getIconResourceId() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getImplicitPermissions() { return null; }
    public int getInstallLocation() { return 0; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedInstrumentation> getInstrumentations() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.util.ArraySet<java.security.PublicKey>> getKeySetMapping() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getKnownActivityEmbeddingCerts() { return null; }
    public int getLabelResourceId() { return 0; }
    public int getLargestWidthLimitDp() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getLibraryNames() { return null; }
    public int getLocaleConfigResourceId() { return 0; }
    public int getLogoResourceId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getManageSpaceActivityName() { return null; }
    public float getMaxAspectRatio() { return 0.0f; }
    public int getMaxSdkVersion() { return 0; }
    public int getMemtagMode() { return 0; }
    @android.annotation.Nullable
    public android.os.Bundle getMetaData() { return null; }
    @android.annotation.Nullable
    public java.util.Set<java.lang.String> getMimeGroups() { return null; }
    public float getMinAspectRatio() { return 0.0f; }
    @android.annotation.Nullable
    public android.util.SparseIntArray getMinExtensionVersions() { return null; }
    public int getMinSdkVersion() { return 0; }
    public int getNativeHeapZeroInitialized() { return 0; }
    public int getPageSizeAppCompatFlags() { return 0; }
    public int getNetworkSecurityConfigResourceId() { return 0; }
    @android.annotation.Nullable
    public java.lang.CharSequence getNonLocalizedLabel() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getOriginalPackages() { return null; }
    @android.annotation.Nullable
    public java.lang.String getOverlayCategory() { return null; }
    public int getOverlayPriority() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getOverlayTarget() { return null; }
    @android.annotation.Nullable
    public java.lang.String getOverlayTargetOverlayableName() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.lang.String> getOverlayables() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPath() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPermission() { return null; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedPermissionGroup> getPermissionGroups() { return null; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedPermission> getPermissions() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.util.Pair<java.lang.String, com.android.internal.pm.pkg.component.ParsedIntentInfo>> getPreferredActivityFilters() { return null; }
    @android.annotation.NonNull
    public java.lang.String getProcessName() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, com.android.internal.pm.pkg.component.ParsedProcess> getProcesses() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.content.pm.PackageManager.Property> getProperties() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getProtectedBroadcasts() { return null; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedProvider> getProviders() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.content.Intent> getQueriesIntents() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getQueriesPackages() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getQueriesProviders() { return null; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedActivity> getReceivers() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.content.pm.FeatureInfo> getRequestedFeatures() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getRequestedPermissions() { return null; }
    @android.annotation.Nullable
    public java.lang.String getRequiredAccountType() { return null; }
    public int getRequiresSmallestWidthDp() { return 0; }
    @android.annotation.Nullable
    public java.lang.Boolean getResizeableActivity() { return null; }
    @android.annotation.Nullable
    public byte[] getRestrictUpdateHash() { return null; }
    @android.annotation.Nullable
    public java.lang.String getRestrictedAccountType() { return null; }
    @android.annotation.Nullable
    public java.lang.String getEmergencyInstaller() { return null; }
    public int getRoundIconResourceId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getSdkLibraryName() { return null; }
    public int getSdkLibVersionMajor() { return 0; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedService> getServices() { return null; }
    @android.annotation.Nullable
    public java.lang.String getSharedUserId() { return null; }
    public int getSharedUserLabelResourceId() { return 0; }
    @android.annotation.NonNull
    public android.content.pm.SigningDetails getSigningDetails() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getSplitClassLoaderNames() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getSplitCodePaths() { return null; }
    @android.annotation.Nullable
    public android.util.SparseArray<int[]> getSplitDependencies() { return null; }
    @android.annotation.Nullable
    public int[] getSplitFlags() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getSplitNames() { return null; }
    @android.annotation.NonNull
    public int[] getSplitRevisionCodes() { return null; }
    @android.annotation.Nullable
    public java.lang.String getStaticSharedLibraryName() { return null; }
    public long getStaticSharedLibraryVersion() { return 0L; }
    public java.util.UUID getStorageUuid() { return null; }
    public int getTargetSandboxVersion() { return 0; }
    public int getTargetSdkVersion() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getTaskAffinity() { return null; }
    public int getThemeResourceId() { return 0; }
    public int getUiOptions() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getUpgradeKeySets() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesLibraries() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getUsesLibrariesSorted() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesNativeLibraries() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesOptionalLibraries() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getUsesOptionalLibrariesSorted() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesOptionalNativeLibraries() { return null; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedUsesPermission> getUsesPermissions() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, com.android.internal.pm.pkg.component.ParsedUsesPermission> getUsesPermissionMapping() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesSdkLibraries() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getUsesSdkLibrariesSorted() { return null; }
    @android.annotation.Nullable
    public java.lang.String[][] getUsesSdkLibrariesCertDigests() { return null; }
    @android.annotation.Nullable
    public long[] getUsesSdkLibrariesVersionsMajor() { return null; }
    @android.annotation.Nullable
    public boolean[] getUsesSdkLibrariesOptional() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getUsesStaticLibraries() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getUsesStaticLibrariesSorted() { return null; }
    @android.annotation.Nullable
    public java.lang.String[][] getUsesStaticLibrariesCertDigests() { return null; }
    @android.annotation.Nullable
    public long[] getUsesStaticLibrariesVersions() { return null; }
    public int getVersionCode() { return 0; }
    public int getVersionCodeMajor() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getVersionName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getVolumeUuid() { return null; }
    @android.annotation.Nullable
    public java.lang.String getZygotePreloadName() { return null; }
    public boolean isAllowCrossUidActivitySwitchFromBelow() { return false; }
    public boolean hasPreserveLegacyExternalStorage() { return false; }
    public boolean hasRequestForegroundServiceExemption() { return false; }
    @android.annotation.Nullable
    public java.lang.Boolean hasRequestRawExternalStorageAccess() { return null; }
    public boolean isAllowAudioPlaybackCapture() { return false; }
    public boolean isBackupAllowed() { return false; }
    public boolean isClearUserDataAllowed() { return false; }
    public boolean isClearUserDataOnFailedRestoreAllowed() { return false; }
    public boolean isAllowNativeHeapPointerTagging() { return false; }
    public boolean isTaskReparentingAllowed() { return false; }
    public boolean isAnyDensity() { return false; }
    public boolean isBackupInForeground() { return false; }
    public boolean isHardwareAccelerated() { return false; }
    public boolean isSaveStateDisallowed() { return false; }
    public boolean isCrossProfile() { return false; }
    public boolean isDebuggable() { return false; }
    public boolean isDefaultToDeviceProtectedStorage() { return false; }
    public boolean isDirectBootAware() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isExternalStorage() { return false; }
    public boolean isExtractNativeLibrariesRequested() { return false; }
    public boolean isForceQueryable() { return false; }
    public boolean isFullBackupOnly() { return false; }
    public boolean isGame() { return false; }
    public boolean isDeclaredHavingCode() { return false; }
    public boolean isHasDomainUrls() { return false; }
    public boolean isUserDataFragile() { return false; }
    public boolean isIsolatedSplitLoading() { return false; }
    public boolean isKillAfterRestoreAllowed() { return false; }
    public boolean isLargeHeap() { return false; }
    public boolean isLeavingSharedUser() { return false; }
    public boolean isMultiArch() { return false; }
    public boolean isOnBackInvokedCallbackEnabled() { return false; }
    public boolean isResourceOverlay() { return false; }
    public boolean isOverlayIsStatic() { return false; }
    public boolean isPartiallyDirectBootAware() { return false; }
    public boolean isPersistent() { return false; }
    public boolean isProfileable() { return false; }
    public boolean isProfileableByShell() { return false; }
    public boolean isRequestLegacyExternalStorage() { return false; }
    public boolean isRequiredForAllUsers() { return false; }
    public boolean isResetEnabledSettingsOnAppDataCleared() { return false; }
    public boolean isResizeable() { return false; }
    public boolean isResizeableActivityViaSdkVersion() { return false; }
    public boolean isRestoreAnyVersion() { return false; }
    public boolean isSdkLibrary() { return false; }
    public boolean isStaticSharedLibrary() { return false; }
    public boolean isExtraLargeScreensSupported() { return false; }
    public boolean isLargeScreensSupported() { return false; }
    public boolean isNormalScreensSupported() { return false; }
    public boolean isRtlSupported() { return false; }
    public boolean isSmallScreensSupported() { return false; }
    public boolean isTestOnly() { return false; }
    public boolean is32BitAbiPreferred() { return false; }
    public boolean isUseEmbeddedDex() { return false; }
    public boolean isCleartextTrafficAllowed() { return false; }
    public boolean isNonSdkApiRequested() { return false; }
    public boolean isVisibleToInstantApps() { return false; }
    public boolean isVmSafeMode() { return false; }
    public com.android.internal.pm.parsing.pkg.PackageImpl removeUsesOptionalNativeLibrary(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAllowAudioPlaybackCapture(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setBackupAllowed(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setClearUserDataAllowed(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setClearUserDataOnFailedRestoreAllowed(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAllowNativeHeapPointerTagging(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAlternateLauncherIconResIds(int[] p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAlternateLauncherLabelResIds(int[] p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setTaskReparentingAllowed(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAnyDensity(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAppComponentFactory(java.lang.String p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setAttributionsAreUserVisible(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAutoRevokePermissions(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setBackupAgentName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setBackupInForeground(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setBannerResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setHardwareAccelerated(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setBaseRevisionCode(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSaveStateDisallowed(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setCategory(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setClassLoaderName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setApplicationClassName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setCompatibleWidthLimitDp(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setCompileSdkVersion(int p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setCompileSdkVersionCodeName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setCrossProfile(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setDataExtractionRulesResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setDebuggable(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setDescriptionResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setEnabled(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setExternalStorage(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setExtractNativeLibrariesRequested(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setForceQueryable(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setFullBackupContentResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setFullBackupOnly(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setGame(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setGwpAsanMode(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setDeclaredHavingCode(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setHasDomainUrls(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setUserDataFragile(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setIconResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setInstallLocation(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setIsolatedSplitLoading(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setKillAfterRestoreAllowed(boolean p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setKnownActivityEmbeddingCerts(java.util.Set<java.lang.String> p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLabelResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLargeHeap(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLargestWidthLimitDp(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLeavingSharedUser(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLocaleConfigResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLogoResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setManageSpaceActivityName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMaxAspectRatio(float p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMaxSdkVersion(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMemtagMode(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMetaData(android.os.Bundle p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMinAspectRatio(float p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMinExtensionVersions(android.util.SparseIntArray p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMinSdkVersion(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMultiArch(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNativeHeapZeroInitialized(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPageSizeAppCompatFlags(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNetworkSecurityConfigResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNonLocalizedLabel(java.lang.CharSequence p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setOnBackInvokedCallbackEnabled(boolean p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setAllowCrossUidActivitySwitchFromBelow(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setResourceOverlay(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOverlayCategory(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOverlayIsStatic(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOverlayPriority(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOverlayTarget(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOverlayTargetOverlayableName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPartiallyDirectBootAware(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPermission(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPreserveLegacyExternalStorage(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setProcessName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setProcesses(java.util.Map<java.lang.String, com.android.internal.pm.pkg.component.ParsedProcess> p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setProfileable(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setProfileableByShell(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRequestForegroundServiceExemption(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRequestLegacyExternalStorage(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRequestRawExternalStorageAccess(java.lang.Boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRequiredAccountType(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRequiredForAllUsers(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRequiresSmallestWidthDp(int p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setResetEnabledSettingsOnAppDataCleared(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setResizeable(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setResizeableActivity(java.lang.Boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setResizeableActivityViaSdkVersion(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRestoreAnyVersion(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRestrictedAccountType(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setEmergencyInstaller(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRoundIconResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSdkLibraryName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSdkLibVersionMajor(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSdkLibrary(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSharedUserId(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSharedUserLabelResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSplitClassLoaderName(int p0, java.lang.String p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSplitHasCode(int p0, boolean p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setStaticSharedLibraryName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setStaticSharedLibraryVersion(long p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setStaticSharedLibrary(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setExtraLargeScreensSupported(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLargeScreensSupported(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNormalScreensSupported(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRtlSupported(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSmallScreensSupported(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setTargetSandboxVersion(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setTargetSdkVersion(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setTaskAffinity(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setTestOnly(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setThemeResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setUiOptions(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setUpgradeKeySets(java.util.Set<java.lang.String> p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl set32BitAbiPreferred(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setUseEmbeddedDex(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setCleartextTrafficAllowed(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNonSdkApiRequested(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVersionName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVisibleToInstantApps(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVmSafeMode(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVolumeUuid(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setZygotePreloadName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl sortActivities() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl sortReceivers() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl sortServices() { return null; }
    public android.content.pm.ApplicationInfo toAppInfoWithoutStateWithoutFlags() { return null; }
    public PackageImpl(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.content.res.TypedArray p3, boolean p4, com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback p5) {}
    public com.android.internal.pm.parsing.pkg.PackageImpl hideAsParsed() { return null; }
    public com.android.internal.pm.parsing.pkg.AndroidPackageInternal hideAsFinal() { return null; }
    public long getLongVersionCode() { return 0L; }
    public com.android.internal.pm.parsing.pkg.PackageImpl removePermission(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesOptionalLibrary(int p0, java.lang.String p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesLibrary(int p0, java.lang.String p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl removeUsesLibrary(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl removeUsesOptionalLibrary(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSigningDetails(android.content.pm.SigningDetails p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRestrictUpdateHash(byte... p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPersistent(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setDefaultToDeviceProtectedStorage(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setDirectBootAware(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl clearProtectedBroadcasts() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl clearOriginalPackages() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl clearAdoptPermissions() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPath(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPackageName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAllComponentsDirectBootAware(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setBaseApkPath(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNativeLibraryDir(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNativeLibraryRootDir(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPrimaryCpuAbi(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSecondaryCpuAbi(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSecondaryNativeLibraryDir(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSplitCodePaths(java.lang.String[] p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl capPermissionPriorities() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl markNotActivitiesAsNotExportedIfSingleUser() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setCoreApp(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVersionCode(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVersionCodeMajor(int p0) { return null; }
    public android.content.pm.ApplicationInfo toAppInfoWithoutState() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public PackageImpl(android.os.Parcel p0) {}
    public PackageImpl(android.os.Parcel p0, com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback p1) {}
    @android.annotation.NonNull
    public java.lang.String getManifestPackageName() { return null; }
    public boolean isStub() { return false; }
    @android.annotation.Nullable
    public java.lang.String getNativeLibraryDir() { return null; }
    @android.annotation.Nullable
    public java.lang.String getNativeLibraryRootDir() { return null; }
    public boolean isNativeLibraryRootRequiresIsa() { return false; }
    @android.annotation.Nullable
    public java.lang.String getPrimaryCpuAbi() { return null; }
    @android.annotation.Nullable
    public java.lang.String getSecondaryCpuAbi() { return null; }
    @android.annotation.Nullable
    public java.lang.String getSecondaryNativeLibraryDir() { return null; }
    public boolean isCoreApp() { return false; }
    public boolean isSystem() { return false; }
    public boolean isUpdatableSystem() { return false; }
    public boolean isFactoryTest() { return false; }
    public boolean isApex() { return false; }
    public boolean isSystemExt() { return false; }
    public boolean isPrivileged() { return false; }
    public boolean isOem() { return false; }
    public boolean isVendor() { return false; }
    public boolean isProduct() { return false; }
    public boolean isOdm() { return false; }
    public boolean isSignedWithPlatformKey() { return false; }
    public int getUid() { return 0; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setStub(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNativeLibraryRootRequiresIsa(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSystem(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setUpdatableSystem(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setFactoryTest(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setApex(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSystemExt(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPrivileged(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOem(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVendor(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setProduct(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOdm(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSignedWithPlatformKey(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setUid(int p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setIntentMatchingFlags(int p0) { return null; }
    public int getIntentMatchingFlags() { return 0; }
    public java.lang.String getBaseAppDataCredentialProtectedDirForSystemUser() { return null; }
    public java.lang.String getBaseAppDataDeviceProtectedDirForSystemUser() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addFeatureFlag(java.lang.String p0, java.lang.Boolean p1) { return null; }
    public java.util.Map<java.lang.String, java.lang.Boolean> getFeatureFlagState() { return null; }

    private static class Booleans {

        public static @interface Flags {
        }
    }

    private static class Booleans2 {

        public static @interface Flags {
        }
    }
}
