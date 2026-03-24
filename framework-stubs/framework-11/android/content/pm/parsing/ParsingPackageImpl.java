package android.content.pm.parsing;

public class ParsingPackageImpl implements android.content.pm.parsing.ParsingPackage, android.os.Parcelable {
    private static final java.lang.String TAG = "PackageImpl";
    public static com.android.internal.util.Parcelling.BuiltIn.ForBoolean sForBoolean;
    public static com.android.internal.util.Parcelling.BuiltIn.ForInternedString sForInternedString;
    public static com.android.internal.util.Parcelling.BuiltIn.ForInternedStringArray sForInternedStringArray;
    public static com.android.internal.util.Parcelling.BuiltIn.ForInternedStringList sForInternedStringList;
    public static com.android.internal.util.Parcelling.BuiltIn.ForInternedStringValueMap sForInternedStringValueMap;
    public static com.android.internal.util.Parcelling.BuiltIn.ForStringSet sForStringSet;
    protected static android.content.pm.parsing.component.ParsedIntentInfo.StringPairListParceler sForIntentInfoPairs;
    private static final java.util.Comparator<android.content.pm.parsing.component.ParsedMainComponent> ORDER_COMPARATOR = null;
    private java.lang.Boolean supportsSmallScreens;
    private java.lang.Boolean supportsNormalScreens;
    private java.lang.Boolean supportsLargeScreens;
    private java.lang.Boolean supportsExtraLargeScreens;
    private java.lang.Boolean resizeable;
    private java.lang.Boolean anyDensity;
    protected int versionCode;
    protected int versionCodeMajor;
    private int baseRevisionCode;
    private java.lang.String versionName;
    private int compileSdkVersion;
    private java.lang.String compileSdkVersionCodeName;
    protected java.lang.String packageName;
    private java.lang.String realPackage;
    protected java.lang.String baseCodePath;
    private boolean requiredForAllUsers;
    private java.lang.String restrictedAccountType;
    private java.lang.String requiredAccountType;
    private java.lang.String overlayTarget;
    private java.lang.String overlayTargetName;
    private java.lang.String overlayCategory;
    private int overlayPriority;
    private boolean overlayIsStatic;
    private java.util.Map<java.lang.String, java.lang.String> overlayables;
    private java.lang.String staticSharedLibName;
    private long staticSharedLibVersion;
    private java.util.List<java.lang.String> libraryNames;
    protected java.util.List<java.lang.String> usesLibraries;
    protected java.util.List<java.lang.String> usesOptionalLibraries;
    private java.util.List<java.lang.String> usesStaticLibraries;
    private long[] usesStaticLibrariesVersions;
    private java.lang.String[][] usesStaticLibrariesCertDigests;
    private java.lang.String sharedUserId;
    private int sharedUserLabel;
    private java.util.List<android.content.pm.ConfigurationInfo> configPreferences;
    private java.util.List<android.content.pm.FeatureInfo> reqFeatures;
    private java.util.List<android.content.pm.FeatureGroupInfo> featureGroups;
    private byte[] restrictUpdateHash;
    protected java.util.List<java.lang.String> originalPackages;
    protected java.util.List<java.lang.String> adoptPermissions;
    private java.util.List<java.lang.String> requestedPermissions;
    private java.util.List<java.lang.String> implicitPermissions;
    private java.util.Set<java.lang.String> upgradeKeySets;
    private java.util.Map<java.lang.String, android.util.ArraySet<java.security.PublicKey>> keySetMapping;
    protected java.util.List<java.lang.String> protectedBroadcasts;
    protected java.util.List<android.content.pm.parsing.component.ParsedActivity> activities;
    protected java.util.List<android.content.pm.parsing.component.ParsedActivity> receivers;
    protected java.util.List<android.content.pm.parsing.component.ParsedService> services;
    protected java.util.List<android.content.pm.parsing.component.ParsedProvider> providers;
    private java.util.List<android.content.pm.parsing.component.ParsedAttribution> attributions;
    protected java.util.List<android.content.pm.parsing.component.ParsedPermission> permissions;
    protected java.util.List<android.content.pm.parsing.component.ParsedPermissionGroup> permissionGroups;
    protected java.util.List<android.content.pm.parsing.component.ParsedInstrumentation> instrumentations;
    private java.util.List<android.util.Pair<java.lang.String, android.content.pm.parsing.component.ParsedIntentInfo>> preferredActivityFilters;
    private java.util.Map<java.lang.String, android.content.pm.parsing.component.ParsedProcess> processes;
    private android.os.Bundle metaData;
    protected java.lang.String volumeUuid;
    private android.content.pm.PackageParser.SigningDetails signingDetails;
    protected java.lang.String codePath;
    private boolean use32BitAbi;
    private boolean visibleToInstantApps;
    private boolean forceQueryable;
    private java.util.List<android.content.Intent> queriesIntents;
    private java.util.List<java.lang.String> queriesPackages;
    private java.util.Set<java.lang.String> queriesProviders;
    private java.lang.String[] splitClassLoaderNames;
    protected java.lang.String[] splitCodePaths;
    private android.util.SparseArray<int[]> splitDependencies;
    private int[] splitFlags;
    private java.lang.String[] splitNames;
    private int[] splitRevisionCodes;
    private java.lang.String appComponentFactory;
    private java.lang.String backupAgentName;
    private int banner;
    private int category;
    private java.lang.String classLoaderName;
    private java.lang.String className;
    private int compatibleWidthLimitDp;
    private int descriptionRes;
    private boolean enabled;
    private boolean crossProfile;
    private int fullBackupContent;
    private int iconRes;
    private int installLocation;
    private int labelRes;
    private int largestWidthLimitDp;
    private int logo;
    private java.lang.String manageSpaceActivityName;
    private float maxAspectRatio;
    private float minAspectRatio;
    private android.util.SparseIntArray minExtensionVersions;
    private int minSdkVersion;
    private int networkSecurityConfigRes;
    private java.lang.CharSequence nonLocalizedLabel;
    private java.lang.String permission;
    private java.lang.String processName;
    private int requiresSmallestWidthDp;
    private int roundIconRes;
    private int targetSandboxVersion;
    private int targetSdkVersion;
    private java.lang.String taskAffinity;
    private int theme;
    private int uiOptions;
    private java.lang.String zygotePreloadName;
    private boolean externalStorage;
    private boolean baseHardwareAccelerated;
    private boolean allowBackup;
    private boolean killAfterRestore;
    private boolean restoreAnyVersion;
    private boolean fullBackupOnly;
    private boolean persistent;
    private boolean debuggable;
    private boolean vmSafeMode;
    private boolean hasCode;
    private boolean allowTaskReparenting;
    private boolean allowClearUserData;
    private boolean largeHeap;
    private boolean usesCleartextTraffic;
    private boolean supportsRtl;
    private boolean testOnly;
    private boolean multiArch;
    private boolean extractNativeLibs;
    private boolean game;
    private java.lang.Boolean resizeableActivity;
    private boolean staticSharedLibrary;
    private boolean overlay;
    private boolean isolatedSplitLoading;
    private boolean hasDomainUrls;
    private boolean profileableByShell;
    private boolean backupInForeground;
    private boolean useEmbeddedDex;
    private boolean defaultToDeviceProtectedStorage;
    private boolean directBootAware;
    private boolean partiallyDirectBootAware;
    private boolean resizeableActivityViaSdkVersion;
    private boolean allowClearUserDataOnFailedRestore;
    private boolean allowAudioPlaybackCapture;
    private boolean requestLegacyExternalStorage;
    private boolean usesNonSdkApi;
    private boolean hasFragileUserData;
    private boolean cantSaveState;
    private boolean allowNativeHeapPointerTagging;
    private int autoRevokePermissions;
    private boolean preserveLegacyExternalStorage;
    protected int gwpAsanMode;
    private android.util.ArraySet<java.lang.String> mimeGroups;
    public static final android.os.Parcelable.Creator<android.content.pm.parsing.ParsingPackageImpl> CREATOR = null;
    public ParsingPackageImpl(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.content.res.TypedArray p3) {}
    public boolean isSupportsSmallScreens() { return false; }
    public boolean isSupportsNormalScreens() { return false; }
    public boolean isSupportsLargeScreens() { return false; }
    public boolean isSupportsExtraLargeScreens() { return false; }
    public boolean isResizeable() { return false; }
    public boolean isAnyDensity() { return false; }
    public android.content.pm.parsing.ParsingPackageImpl sortActivities() { return null; }
    public android.content.pm.parsing.ParsingPackageImpl sortReceivers() { return null; }
    public android.content.pm.parsing.ParsingPackageImpl sortServices() { return null; }
    public java.lang.Object hideAsParsed() { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addConfigPreference(android.content.pm.ConfigurationInfo p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addReqFeature(android.content.pm.FeatureInfo p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addFeatureGroup(android.content.pm.FeatureGroupInfo p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addProtectedBroadcast(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addInstrumentation(android.content.pm.parsing.component.ParsedInstrumentation p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addOriginalPackage(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackage addOverlayable(java.lang.String p0, java.lang.String p1) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addAdoptPermission(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addPermission(android.content.pm.parsing.component.ParsedPermission p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addPermissionGroup(android.content.pm.parsing.component.ParsedPermissionGroup p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addRequestedPermission(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addImplicitPermission(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addKeySet(java.lang.String p0, java.security.PublicKey p1) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addActivity(android.content.pm.parsing.component.ParsedActivity p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addReceiver(android.content.pm.parsing.component.ParsedActivity p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addService(android.content.pm.parsing.component.ParsedService p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addProvider(android.content.pm.parsing.component.ParsedProvider p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addAttribution(android.content.pm.parsing.component.ParsedAttribution p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addLibraryName(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addUsesOptionalLibrary(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addUsesLibrary(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl removeUsesOptionalLibrary(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addUsesStaticLibrary(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addUsesStaticLibraryVersion(long p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addUsesStaticLibraryCertDigests(java.lang.String[] p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addPreferredActivityFilter(java.lang.String p0, android.content.pm.parsing.component.ParsedIntentInfo p1) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addQueriesIntent(android.content.Intent p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addQueriesPackage(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl addQueriesProvider(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setSupportsSmallScreens(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setSupportsNormalScreens(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setSupportsLargeScreens(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setSupportsExtraLargeScreens(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setResizeable(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setAnyDensity(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl asSplit(java.lang.String[] p0, java.lang.String[] p1, int[] p2, android.util.SparseArray<int[]> p3) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setSplitHasCode(int p0, boolean p1) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setSplitClassLoaderName(int p0, java.lang.String p1) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setRequiredAccountType(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setOverlayTarget(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setVolumeUuid(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setStaticSharedLibName(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setSharedUserId(java.lang.String p0) { return null; }
    public java.lang.String getProcessName() { return null; }
    public java.lang.String toString() { return null; }
    @java.lang.Deprecated
    public android.content.pm.ApplicationInfo toAppInfoWithoutState() { return null; }
    public android.content.pm.ApplicationInfo toAppInfoWithoutStateWithoutFlags() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public ParsingPackageImpl(android.os.Parcel p0) {}
    public int getVersionCode() { return 0; }
    public int getVersionCodeMajor() { return 0; }
    public int getBaseRevisionCode() { return 0; }
    public java.lang.String getVersionName() { return null; }
    public int getCompileSdkVersion() { return 0; }
    public java.lang.String getCompileSdkVersionCodeName() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getRealPackage() { return null; }
    public java.lang.String getBaseCodePath() { return null; }
    public boolean isRequiredForAllUsers() { return false; }
    public java.lang.String getRestrictedAccountType() { return null; }
    public java.lang.String getRequiredAccountType() { return null; }
    public java.lang.String getOverlayTarget() { return null; }
    public java.lang.String getOverlayTargetName() { return null; }
    public java.lang.String getOverlayCategory() { return null; }
    public int getOverlayPriority() { return 0; }
    public boolean isOverlayIsStatic() { return false; }
    public java.util.Map<java.lang.String, java.lang.String> getOverlayables() { return null; }
    public java.lang.String getStaticSharedLibName() { return null; }
    public long getStaticSharedLibVersion() { return 0L; }
    public java.util.List<java.lang.String> getLibraryNames() { return null; }
    public java.util.List<java.lang.String> getUsesLibraries() { return null; }
    public java.util.List<java.lang.String> getUsesOptionalLibraries() { return null; }
    public java.util.List<java.lang.String> getUsesStaticLibraries() { return null; }
    public long[] getUsesStaticLibrariesVersions() { return null; }
    public java.lang.String[][] getUsesStaticLibrariesCertDigests() { return null; }
    public java.lang.String getSharedUserId() { return null; }
    public int getSharedUserLabel() { return 0; }
    public java.util.List<android.content.pm.ConfigurationInfo> getConfigPreferences() { return null; }
    public java.util.List<android.content.pm.FeatureInfo> getReqFeatures() { return null; }
    public java.util.List<android.content.pm.FeatureGroupInfo> getFeatureGroups() { return null; }
    public byte[] getRestrictUpdateHash() { return null; }
    public java.util.List<java.lang.String> getOriginalPackages() { return null; }
    public java.util.List<java.lang.String> getAdoptPermissions() { return null; }
    public java.util.List<java.lang.String> getRequestedPermissions() { return null; }
    public java.util.List<java.lang.String> getImplicitPermissions() { return null; }
    public java.util.Set<java.lang.String> getUpgradeKeySets() { return null; }
    public java.util.Map<java.lang.String, android.util.ArraySet<java.security.PublicKey>> getKeySetMapping() { return null; }
    public java.util.List<java.lang.String> getProtectedBroadcasts() { return null; }
    public java.util.List<android.content.pm.parsing.component.ParsedActivity> getActivities() { return null; }
    public java.util.List<android.content.pm.parsing.component.ParsedActivity> getReceivers() { return null; }
    public java.util.List<android.content.pm.parsing.component.ParsedService> getServices() { return null; }
    public java.util.List<android.content.pm.parsing.component.ParsedProvider> getProviders() { return null; }
    public java.util.List<android.content.pm.parsing.component.ParsedAttribution> getAttributions() { return null; }
    public java.util.List<android.content.pm.parsing.component.ParsedPermission> getPermissions() { return null; }
    public java.util.List<android.content.pm.parsing.component.ParsedPermissionGroup> getPermissionGroups() { return null; }
    public java.util.List<android.content.pm.parsing.component.ParsedInstrumentation> getInstrumentations() { return null; }
    public java.util.List<android.util.Pair<java.lang.String, android.content.pm.parsing.component.ParsedIntentInfo>> getPreferredActivityFilters() { return null; }
    public java.util.Map<java.lang.String, android.content.pm.parsing.component.ParsedProcess> getProcesses() { return null; }
    public android.os.Bundle getMetaData() { return null; }
    private void addMimeGroupsFromComponent(android.content.pm.parsing.component.ParsedComponent p0) {}
    public java.util.Set<java.lang.String> getMimeGroups() { return null; }
    public java.lang.String getVolumeUuid() { return null; }
    public android.content.pm.PackageParser.SigningDetails getSigningDetails() { return null; }
    public java.lang.String getCodePath() { return null; }
    public boolean isUse32BitAbi() { return false; }
    public boolean isVisibleToInstantApps() { return false; }
    public boolean isForceQueryable() { return false; }
    public java.util.List<android.content.Intent> getQueriesIntents() { return null; }
    public java.util.List<java.lang.String> getQueriesPackages() { return null; }
    public java.util.Set<java.lang.String> getQueriesProviders() { return null; }
    public java.lang.String[] getSplitClassLoaderNames() { return null; }
    public java.lang.String[] getSplitCodePaths() { return null; }
    public android.util.SparseArray<int[]> getSplitDependencies() { return null; }
    public int[] getSplitFlags() { return null; }
    public java.lang.String[] getSplitNames() { return null; }
    public int[] getSplitRevisionCodes() { return null; }
    public java.lang.String getAppComponentFactory() { return null; }
    public java.lang.String getBackupAgentName() { return null; }
    public int getBanner() { return 0; }
    public int getCategory() { return 0; }
    public java.lang.String getClassLoaderName() { return null; }
    public java.lang.String getClassName() { return null; }
    public int getCompatibleWidthLimitDp() { return 0; }
    public int getDescriptionRes() { return 0; }
    public boolean isEnabled() { return false; }
    public boolean isCrossProfile() { return false; }
    public int getFullBackupContent() { return 0; }
    public int getIconRes() { return 0; }
    public int getInstallLocation() { return 0; }
    public int getLabelRes() { return 0; }
    public int getLargestWidthLimitDp() { return 0; }
    public int getLogo() { return 0; }
    public java.lang.String getManageSpaceActivityName() { return null; }
    public float getMaxAspectRatio() { return 0.0f; }
    public float getMinAspectRatio() { return 0.0f; }
    public android.util.SparseIntArray getMinExtensionVersions() { return null; }
    public int getMinSdkVersion() { return 0; }
    public int getNetworkSecurityConfigRes() { return 0; }
    public java.lang.CharSequence getNonLocalizedLabel() { return null; }
    public java.lang.String getPermission() { return null; }
    public int getRequiresSmallestWidthDp() { return 0; }
    public int getRoundIconRes() { return 0; }
    public int getTargetSandboxVersion() { return 0; }
    public int getTargetSdkVersion() { return 0; }
    public java.lang.String getTaskAffinity() { return null; }
    public int getTheme() { return 0; }
    public int getUiOptions() { return 0; }
    public java.lang.String getZygotePreloadName() { return null; }
    public boolean isExternalStorage() { return false; }
    public boolean isBaseHardwareAccelerated() { return false; }
    public boolean isAllowBackup() { return false; }
    public boolean isKillAfterRestore() { return false; }
    public boolean isRestoreAnyVersion() { return false; }
    public boolean isFullBackupOnly() { return false; }
    public boolean isPersistent() { return false; }
    public boolean isDebuggable() { return false; }
    public boolean isVmSafeMode() { return false; }
    public boolean isHasCode() { return false; }
    public boolean isAllowTaskReparenting() { return false; }
    public boolean isAllowClearUserData() { return false; }
    public boolean isLargeHeap() { return false; }
    public boolean isUsesCleartextTraffic() { return false; }
    public boolean isSupportsRtl() { return false; }
    public boolean isTestOnly() { return false; }
    public boolean isMultiArch() { return false; }
    public boolean isExtractNativeLibs() { return false; }
    public boolean isGame() { return false; }
    public java.lang.Boolean getResizeableActivity() { return null; }
    public boolean isStaticSharedLibrary() { return false; }
    public boolean isOverlay() { return false; }
    public boolean isIsolatedSplitLoading() { return false; }
    public boolean isHasDomainUrls() { return false; }
    public boolean isProfileableByShell() { return false; }
    public boolean isBackupInForeground() { return false; }
    public boolean isUseEmbeddedDex() { return false; }
    public boolean isDefaultToDeviceProtectedStorage() { return false; }
    public boolean isDirectBootAware() { return false; }
    public int getGwpAsanMode() { return 0; }
    public boolean isPartiallyDirectBootAware() { return false; }
    public boolean isResizeableActivityViaSdkVersion() { return false; }
    public boolean isAllowClearUserDataOnFailedRestore() { return false; }
    public boolean isAllowAudioPlaybackCapture() { return false; }
    public boolean isRequestLegacyExternalStorage() { return false; }
    public boolean isUsesNonSdkApi() { return false; }
    public boolean isHasFragileUserData() { return false; }
    public boolean isCantSaveState() { return false; }
    public boolean isAllowNativeHeapPointerTagging() { return false; }
    public int getAutoRevokePermissions() { return 0; }
    public boolean hasPreserveLegacyExternalStorage() { return false; }
    public android.content.pm.parsing.ParsingPackageImpl setBaseRevisionCode(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setCompileSdkVersion(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setRequiredForAllUsers(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setOverlayPriority(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setOverlayIsStatic(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setStaticSharedLibVersion(long p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setSharedUserLabel(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setRestrictUpdateHash(byte... p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setUpgradeKeySets(java.util.Set<java.lang.String> p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setProcesses(java.util.Map<java.lang.String, android.content.pm.parsing.component.ParsedProcess> p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setMetaData(android.os.Bundle p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setSigningDetails(android.content.pm.PackageParser.SigningDetails p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setUse32BitAbi(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setVisibleToInstantApps(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setForceQueryable(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setBanner(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setCategory(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setCompatibleWidthLimitDp(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setDescriptionRes(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setEnabled(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setCrossProfile(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setFullBackupContent(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setIconRes(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setInstallLocation(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setLabelRes(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setLargestWidthLimitDp(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setLogo(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setMaxAspectRatio(float p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setMinAspectRatio(float p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setMinExtensionVersions(android.util.SparseIntArray p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setMinSdkVersion(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setNetworkSecurityConfigRes(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setNonLocalizedLabel(java.lang.CharSequence p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setRequiresSmallestWidthDp(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setRoundIconRes(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setTargetSandboxVersion(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setTargetSdkVersion(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setTheme(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setUiOptions(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setExternalStorage(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setBaseHardwareAccelerated(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setAllowBackup(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setKillAfterRestore(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setRestoreAnyVersion(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setFullBackupOnly(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setPersistent(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setDebuggable(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setVmSafeMode(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setHasCode(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setAllowTaskReparenting(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setAllowClearUserData(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setLargeHeap(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setUsesCleartextTraffic(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setSupportsRtl(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setTestOnly(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setMultiArch(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setExtractNativeLibs(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setGame(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setResizeableActivity(java.lang.Boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setStaticSharedLibrary(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setOverlay(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setIsolatedSplitLoading(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setHasDomainUrls(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setProfileableByShell(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setBackupInForeground(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setUseEmbeddedDex(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setDefaultToDeviceProtectedStorage(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setDirectBootAware(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setGwpAsanMode(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setPartiallyDirectBootAware(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setResizeableActivityViaSdkVersion(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setAllowClearUserDataOnFailedRestore(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setAllowAudioPlaybackCapture(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setRequestLegacyExternalStorage(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setUsesNonSdkApi(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setHasFragileUserData(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setCantSaveState(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setAllowNativeHeapPointerTagging(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setAutoRevokePermissions(int p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setPreserveLegacyExternalStorage(boolean p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setVersionName(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackage setCompileSdkVersionCodename(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setProcessName(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setRealPackage(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setRestrictedAccountType(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setOverlayTargetName(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setOverlayCategory(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setAppComponentFactory(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setBackupAgentName(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setClassLoaderName(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setClassName(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setManageSpaceActivityName(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setPermission(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setTaskAffinity(java.lang.String p0) { return null; }
    public android.content.pm.parsing.ParsingPackageImpl setZygotePreloadName(java.lang.String p0) { return null; }
}
