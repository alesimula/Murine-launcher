package android.content.pm;

@java.lang.Deprecated
public class PackageParser {
    public static final boolean DEBUG_JAR = false;
    public static final boolean DEBUG_PARSER = false;
    public static final boolean DEBUG_BACKUP = false;
    public static final boolean LOG_PARSE_TIMINGS = Boolean.valueOf(false);
    public static final int LOG_PARSE_TIMINGS_THRESHOLD_MS = 100;
    public static final boolean MULTI_PACKAGE_APK_ENABLED = Boolean.valueOf(false);
    public static final float DEFAULT_PRE_O_MAX_ASPECT_RATIO = 1.8600000143051147f;
    public static final java.lang.String ANDROID_MANIFEST_FILENAME = "AndroidManifest.xml";
    public static final java.lang.String MNT_EXPAND = "/mnt/expand/";
    public static final java.lang.String TAG_ADOPT_PERMISSIONS = "adopt-permissions";
    public static final java.lang.String TAG_APPLICATION = "application";
    public static final java.lang.String TAG_COMPATIBLE_SCREENS = "compatible-screens";
    public static final java.lang.String TAG_EAT_COMMENT = "eat-comment";
    public static final java.lang.String TAG_FEATURE_GROUP = "feature-group";
    public static final java.lang.String TAG_INSTRUMENTATION = "instrumentation";
    public static final java.lang.String TAG_KEY_SETS = "key-sets";
    public static final java.lang.String TAG_MANIFEST = "manifest";
    public static final java.lang.String TAG_ORIGINAL_PACKAGE = "original-package";
    public static final java.lang.String TAG_OVERLAY = "overlay";
    public static final java.lang.String TAG_PACKAGE = "package";
    public static final java.lang.String TAG_PACKAGE_VERIFIER = "package-verifier";
    public static final java.lang.String TAG_ATTRIBUTION = "attribution";
    public static final java.lang.String TAG_PERMISSION = "permission";
    public static final java.lang.String TAG_PERMISSION_GROUP = "permission-group";
    public static final java.lang.String TAG_PERMISSION_TREE = "permission-tree";
    public static final java.lang.String TAG_PROTECTED_BROADCAST = "protected-broadcast";
    public static final java.lang.String TAG_QUERIES = "queries";
    public static final java.lang.String TAG_RESTRICT_UPDATE = "restrict-update";
    public static final java.lang.String TAG_SUPPORT_SCREENS = "supports-screens";
    public static final java.lang.String TAG_SUPPORTS_INPUT = "supports-input";
    public static final java.lang.String TAG_USES_CONFIGURATION = "uses-configuration";
    public static final java.lang.String TAG_USES_FEATURE = "uses-feature";
    public static final java.lang.String TAG_USES_GL_TEXTURE = "uses-gl-texture";
    public static final java.lang.String TAG_USES_PERMISSION = "uses-permission";
    public static final java.lang.String TAG_USES_PERMISSION_SDK_23 = "uses-permission-sdk-23";
    public static final java.lang.String TAG_USES_PERMISSION_SDK_M = "uses-permission-sdk-m";
    public static final java.lang.String TAG_USES_SDK = "uses-sdk";
    public static final java.lang.String TAG_USES_SPLIT = "uses-split";
    public static final java.lang.String TAG_PROFILEABLE = "profileable";
    public static final java.lang.String METADATA_MAX_ASPECT_RATIO = "android.max_aspect";
    public static final java.lang.String METADATA_SUPPORTS_SIZE_CHANGES = "android.supports_size_changes";
    public static final java.lang.String METADATA_ACTIVITY_WINDOW_LAYOUT_AFFINITY = "android.activity_window_layout_affinity";
    public static final java.util.Set<java.lang.String> CHILD_PACKAGE_TAGS = null;
    public static final boolean LOG_UNSAFE_BROADCASTS = false;
    public static final java.util.Set<java.lang.String> SAFE_BROADCASTS = null;
    public static final java.lang.String APK_FILE_EXTENSION = ".apk";
    public static final java.lang.String APEX_FILE_EXTENSION = ".apex";
    public static final android.content.pm.PackageParser.NewPermissionInfo[] NEW_PERMISSIONS = null;
    @java.lang.Deprecated
    public java.lang.String mArchiveSourcePath;
    public java.lang.String[] mSeparateProcesses;
    public android.content.pm.PackageParser.Callback mCallback;
    public static final int SDK_VERSION = Integer.valueOf(0);
    public static final java.lang.String[] SDK_CODENAMES = null;
    public int mParseError;
    public static boolean sCompatibilityModeEnabled;
    public static boolean sUseRoundIcon;
    public static final int PARSE_DEFAULT_INSTALL_LOCATION = -1;
    public static final int PARSE_DEFAULT_TARGET_SANDBOX = 1;
    public static final boolean RIGID_PARSER = false;
    public static final int PARSE_MUST_BE_APK = 1;
    public static final int PARSE_IGNORE_PROCESSES = 2;
    public static final int PARSE_EXTERNAL_STORAGE = 8;
    public static final int PARSE_IS_SYSTEM_DIR = 16;
    public static final int PARSE_COLLECT_CERTIFICATES = 32;
    public static final int PARSE_ENFORCE_CODE = 64;
    public static final int PARSE_CHATTY = -2147483648;
    public static final java.util.Comparator<java.lang.String> sSplitNameComparator = null;
    public static final java.lang.String ANDROID_RESOURCES = "http://schemas.android.com/apk/res/android";
    public PackageParser() {}
    public void setSeparateProcesses(java.lang.String[] p0) {}
    public void setOnlyCoreApps(boolean p0) {}
    public void setDisplayMetrics(android.util.DisplayMetrics p0) {}
    public void setCacheDir(java.io.File p0) {}
    public void setCallback(android.content.pm.PackageParser.Callback p0) {}
    public static final boolean isApkFile(java.io.File p0) { return false; }
    public static boolean isApkPath(java.lang.String p0) { return false; }
    public static boolean isAvailable(android.content.pm.pkg.FrameworkPackageUserState p0) { return false; }
    public static android.content.pm.PackageInfo generatePackageInfo(android.content.pm.PackageParser.Package p0, int[] p1, int p2, long p3, long p4, java.util.Set<java.lang.String> p5, android.content.pm.pkg.FrameworkPackageUserState p6) { return null; }
    public static android.content.pm.PackageInfo generatePackageInfo(android.content.pm.PackageParser.Package p0, int[] p1, int p2, long p3, long p4, java.util.Set<java.lang.String> p5, android.content.pm.pkg.FrameworkPackageUserState p6, int p7) { return null; }
    public static android.content.pm.PackageInfo generatePackageInfo(android.content.pm.PackageParser.Package p0, android.apex.ApexInfo p1, int p2) { return null; }
    public static android.content.pm.PackageParser.PackageLite parsePackageLite(java.io.File p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    static android.content.pm.PackageParser.PackageLite parseClusterPackageLite(java.io.File p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public android.content.pm.PackageParser.Package parsePackage(java.io.File p0, int p1, boolean p2) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public android.content.pm.PackageParser.Package parsePackage(java.io.File p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public android.content.pm.PackageParser.Package parseMonolithicPackage(java.io.File p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public static android.util.ArraySet<java.security.PublicKey> toSigningKeys(android.content.pm.Signature[] p0) throws java.security.cert.CertificateException { return null; }
    public static void collectCertificates(android.content.pm.PackageParser.Package p0, boolean p1) throws android.content.pm.PackageParser.PackageParserException {}
    public static android.content.pm.PackageParser.ApkLite parseApkLite(java.io.File p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public static android.content.pm.PackageParser.ApkLite parseApkLite(java.io.FileDescriptor p0, java.lang.String p1, int p2) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public static java.lang.String validateName(java.lang.String p0, boolean p1, boolean p2) { return null; }
    @java.lang.Deprecated
    public static android.util.Pair<java.lang.String, java.lang.String> parsePackageSplitNames(org.xmlpull.v1.XmlPullParser p0, android.util.AttributeSet p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException, android.content.pm.PackageParser.PackageParserException { return null; }
    public static boolean checkRequiredSystemProperties(java.lang.String p0, java.lang.String p1) { return false; }
    public static int computeTargetSdkVersion(int p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3) { return 0; }
    public static int computeMinSdkVersion(int p0, java.lang.String p1, int p2, java.lang.String[] p3, java.lang.String[] p4) { return 0; }
    public static java.lang.String buildClassName(java.lang.String p0, java.lang.CharSequence p1, java.lang.String[] p2) { return null; }
    public static java.lang.String buildProcessName(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, int p3, java.lang.String[] p4, java.lang.String[] p5) { return null; }
    public static java.lang.String buildTaskAffinityName(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, java.lang.String[] p3) { return null; }
    public static int getActivityConfigChanges(int p0, int p1) { return 0; }
    public static final java.security.PublicKey parsePublicKey(java.lang.String p0) { return null; }
    public static final java.security.PublicKey parsePublicKey(byte[] p0) { return null; }
    public static android.content.pm.ApplicationInfo generateApplicationInfo(android.content.pm.PackageParser.Package p0, int p1, android.content.pm.pkg.FrameworkPackageUserState p2) { return null; }
    public static android.content.pm.ApplicationInfo generateApplicationInfo(android.content.pm.PackageParser.Package p0, int p1, android.content.pm.pkg.FrameworkPackageUserState p2, int p3) { return null; }
    public static android.content.pm.ApplicationInfo generateApplicationInfo(android.content.pm.ApplicationInfo p0, int p1, android.content.pm.pkg.FrameworkPackageUserState p2, int p3) { return null; }
    public static final android.content.pm.PermissionInfo generatePermissionInfo(android.content.pm.PackageParser.Permission p0, int p1) { return null; }
    public static final android.content.pm.PermissionGroupInfo generatePermissionGroupInfo(android.content.pm.PackageParser.PermissionGroup p0, int p1) { return null; }
    public static final android.content.pm.ActivityInfo generateActivityInfo(android.content.pm.PackageParser.Activity p0, int p1, android.content.pm.pkg.FrameworkPackageUserState p2, int p3) { return null; }
    public static final android.content.pm.ActivityInfo generateActivityInfo(android.content.pm.ActivityInfo p0, int p1, android.content.pm.pkg.FrameworkPackageUserState p2, int p3) { return null; }
    public static final android.content.pm.ServiceInfo generateServiceInfo(android.content.pm.PackageParser.Service p0, int p1, android.content.pm.pkg.FrameworkPackageUserState p2, int p3) { return null; }
    public static final android.content.pm.ProviderInfo generateProviderInfo(android.content.pm.PackageParser.Provider p0, int p1, android.content.pm.pkg.FrameworkPackageUserState p2, int p3) { return null; }
    public static final android.content.pm.InstrumentationInfo generateInstrumentationInfo(android.content.pm.PackageParser.Instrumentation p0, int p1) { return null; }
    public static void setCompatibilityModeEnabled(boolean p0) {}
    public static void readConfigUseRoundIcon(android.content.res.Resources p0) {}
    public static boolean isMatch(android.content.pm.pkg.FrameworkPackageUserState p0, android.content.pm.ComponentInfo p1, long p2) { return false; }
    public static boolean isMatch(android.content.pm.pkg.FrameworkPackageUserState p0, boolean p1, boolean p2, android.content.pm.ComponentInfo p3, long p4) { return false; }
    public static boolean isMatch(android.content.pm.pkg.FrameworkPackageUserState p0, boolean p1, boolean p2, boolean p3, boolean p4, java.lang.String p5, long p6) { return false; }
    public static boolean isAvailable(android.content.pm.pkg.FrameworkPackageUserState p0, long p1) { return false; }
    public static boolean reportIfDebug(boolean p0, long p1) { return false; }
    public static boolean isEnabled(android.content.pm.pkg.FrameworkPackageUserState p0, android.content.pm.ComponentInfo p1, long p2) { return false; }
    public static boolean isEnabled(android.content.pm.pkg.FrameworkPackageUserState p0, boolean p1, android.content.pm.ComponentInfo p2, long p3) { return false; }
    public static boolean isEnabled(android.content.pm.pkg.FrameworkPackageUserState p0, boolean p1, boolean p2, java.lang.String p3, long p4) { return false; }
    public static void writeKeySetMapping(android.os.Parcel p0, java.util.Map<java.lang.String, android.util.ArraySet<java.security.PublicKey>> p1) {}
    public static android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.security.PublicKey>> readKeySetMapping(android.os.Parcel p0) { return null; }
    public static java.lang.String getSeinfoUser(android.content.pm.pkg.FrameworkPackageUserState p0) { return null; }

    public static final class Activity extends android.content.pm.PackageParser.Component<android.content.pm.PackageParser.ActivityIntentInfo> implements android.os.Parcelable {
        public final android.content.pm.ActivityInfo info = null;
        public static final android.os.Parcelable.Creator CREATOR = null;
        Activity(android.content.pm.PackageParser.Package p0, java.lang.String p1, android.content.pm.ActivityInfo p2) { super((android.content.pm.PackageParser.Package)null); }
        public Activity(android.content.pm.PackageParser.ParseComponentArgs p0, android.content.pm.ActivityInfo p1) { super((android.content.pm.PackageParser.Package)null); }
        public void setPackageName(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class ActivityIntentInfo extends android.content.pm.PackageParser.IntentInfo {
        public android.content.pm.PackageParser.Activity activity;
        public ActivityIntentInfo(android.content.pm.PackageParser.Activity p0) { super(); }
        public java.lang.String toString() { return null; }
        public ActivityIntentInfo(android.os.Parcel p0) { super(); }
    }

    public static class ApkLite {
        public final java.lang.String codePath = null;
        public final java.lang.String packageName = null;
        public final java.lang.String splitName = null;
        public boolean isFeatureSplit;
        public final java.lang.String configForSplit = null;
        public final java.lang.String usesSplitName = null;
        public final int versionCode = 0;
        public final int versionCodeMajor = 0;
        public final int revisionCode = 0;
        public final int installLocation = 0;
        public final int minSdkVersion = 0;
        public final int targetSdkVersion = 0;
        public final android.content.pm.VerifierInfo[] verifiers = null;
        public final android.content.pm.PackageParser.SigningDetails signingDetails = null;
        public final boolean coreApp = false;
        public final boolean debuggable = false;
        public final boolean profilableByShell = false;
        public final boolean multiArch = false;
        public final boolean use32bitAbi = false;
        public final boolean extractNativeLibs = false;
        public final boolean isolatedSplits = false;
        public final boolean isSplitRequired = false;
        public final boolean useEmbeddedDex = false;
        public final java.lang.String targetPackageName = null;
        public final boolean overlayIsStatic = false;
        public final int overlayPriority = 0;
        public final int rollbackDataPolicy = 0;
        public ApkLite(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, java.lang.String p4, java.lang.String p5, boolean p6, int p7, int p8, int p9, int p10, java.util.List<android.content.pm.VerifierInfo> p11, android.content.pm.PackageParser.SigningDetails p12, boolean p13, boolean p14, boolean p15, boolean p16, boolean p17, boolean p18, boolean p19, boolean p20, java.lang.String p21, boolean p22, int p23, int p24, int p25, int p26) {}
        public long getLongVersionCode() { return 0L; }
    }

    private static class CachedComponentArgs {
        android.content.pm.PackageParser.ParseComponentArgs mActivityArgs;
        android.content.pm.PackageParser.ParseComponentArgs mActivityAliasArgs;
        android.content.pm.PackageParser.ParseComponentArgs mServiceArgs;
        android.content.pm.PackageParser.ParseComponentArgs mProviderArgs;
    }

    public static interface Callback {
        default public com.nvidia.NvAppProfileService getAppProfileService() { return null; }
        public boolean hasFeature(java.lang.String p0);
    }

    public static final class CallbackImpl implements android.content.pm.PackageParser.Callback {
        public CallbackImpl(android.content.pm.PackageManager p0) {}
        public com.nvidia.NvAppProfileService getAppProfileService() { return null; }
        public boolean hasFeature(java.lang.String p0) { return false; }
    }

    public static abstract class Component<II extends android.content.pm.PackageParser.IntentInfo> {
        public final java.util.ArrayList<II> intents = null;
        public final java.lang.String className = null;
        public android.os.Bundle metaData;
        public android.content.pm.PackageParser.Package owner;
        public int order;
        android.content.ComponentName componentName;
        java.lang.String componentShortName;
        public Component(android.content.pm.PackageParser.Package p0, java.util.ArrayList<II> p1, java.lang.String p2) {}
        public Component(android.content.pm.PackageParser.Package p0) {}
        public Component(android.content.pm.PackageParser.ParsePackageItemArgs p0, android.content.pm.PackageItemInfo p1) {}
        public Component(android.content.pm.PackageParser.ParseComponentArgs p0, android.content.pm.ComponentInfo p1) {}
        public Component(android.content.pm.PackageParser.Component<II> p0) {}
        public android.content.ComponentName getComponentName() { return null; }
        protected Component(android.os.Parcel p0) {}
        protected void writeToParcel(android.os.Parcel p0, int p1) {}
        public void appendComponentShortName(java.lang.StringBuilder p0) {}
        public void printComponentShortName(java.io.PrintWriter p0) {}
        public void setPackageName(java.lang.String p0) {}
    }

    @java.lang.Deprecated
    private static class DefaultSplitAssetLoader implements android.content.pm.PackageParser.SplitAssetLoader {
        DefaultSplitAssetLoader(android.content.pm.PackageParser.PackageLite p0, int p1) {}
        public android.content.res.AssetManager getBaseAssetManager() throws android.content.pm.PackageParser.PackageParserException { return null; }
        public android.content.res.AssetManager getSplitAssetManager(int p0) throws android.content.pm.PackageParser.PackageParserException { return null; }
        public void close() throws java.lang.Exception {}
        public android.content.res.ApkAssets getBaseApkAssets() { return null; }
    }

    public static final class Instrumentation extends android.content.pm.PackageParser.Component<android.content.pm.PackageParser.IntentInfo> implements android.os.Parcelable {
        public final android.content.pm.InstrumentationInfo info = null;
        public static final android.os.Parcelable.Creator CREATOR = null;
        public Instrumentation(android.content.pm.PackageParser.ParsePackageItemArgs p0, android.content.pm.InstrumentationInfo p1) { super((android.content.pm.PackageParser.Package)null); }
        public void setPackageName(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static abstract class IntentInfo extends android.content.IntentFilter {
        public boolean hasDefault;
        public int labelRes;
        public java.lang.CharSequence nonLocalizedLabel;
        public int icon;
        public int logo;
        public int banner;
        public int preferred;
        protected IntentInfo() { super(); }
        protected IntentInfo(android.os.Parcel p0) { super(); }
        public void writeIntentInfoToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class NewPermissionInfo {
        public final java.lang.String name = null;
        public final int sdkVersion = 0;
        public final int fileVersion = 0;
        public NewPermissionInfo(java.lang.String p0, int p1, int p2) {}
    }

    public static final class Package implements android.os.Parcelable {
        public java.lang.String packageName;
        public java.lang.String manifestPackageName;
        public java.lang.String[] splitNames;
        public java.lang.String volumeUuid;
        public java.lang.String codePath;
        public java.lang.String baseCodePath;
        public java.lang.String[] splitCodePaths;
        public int baseRevisionCode;
        public int[] splitRevisionCodes;
        public int[] splitFlags;
        public int[] splitPrivateFlags;
        public boolean baseHardwareAccelerated;
        public android.content.pm.ApplicationInfo applicationInfo;
        public final java.util.ArrayList<android.content.pm.PackageParser.Permission> permissions = null;
        public final java.util.ArrayList<android.content.pm.PackageParser.PermissionGroup> permissionGroups = null;
        public final java.util.ArrayList<android.content.pm.PackageParser.Activity> activities = null;
        public final java.util.ArrayList<android.content.pm.PackageParser.Activity> receivers = null;
        public final java.util.ArrayList<android.content.pm.PackageParser.Provider> providers = null;
        public final java.util.ArrayList<android.content.pm.PackageParser.Service> services = null;
        public final java.util.ArrayList<android.content.pm.PackageParser.Instrumentation> instrumentation = null;
        public final java.util.ArrayList<java.lang.String> requestedPermissions = null;
        public final java.util.ArrayList<java.lang.String> implicitPermissions = null;
        public java.util.ArrayList<java.lang.String> protectedBroadcasts;
        public android.content.pm.PackageParser.Package parentPackage;
        public java.util.ArrayList<android.content.pm.PackageParser.Package> childPackages;
        public java.lang.String staticSharedLibName;
        public long staticSharedLibVersion;
        public java.util.ArrayList<java.lang.String> libraryNames;
        public java.util.ArrayList<java.lang.String> usesLibraries;
        public java.util.ArrayList<java.lang.String> usesStaticLibraries;
        public long[] usesStaticLibrariesVersions;
        public java.lang.String[][] usesStaticLibrariesCertDigests;
        public java.util.ArrayList<java.lang.String> usesOptionalLibraries;
        public java.lang.String[] usesLibraryFiles;
        public java.util.ArrayList<android.content.pm.SharedLibraryInfo> usesLibraryInfos;
        public java.util.ArrayList<android.content.pm.PackageParser.ActivityIntentInfo> preferredActivityFilters;
        public java.util.ArrayList<java.lang.String> mOriginalPackages;
        public java.lang.String mRealPackage;
        public java.util.ArrayList<java.lang.String> mAdoptPermissions;
        public android.os.Bundle mAppMetaData;
        public int mVersionCode;
        public int mVersionCodeMajor;
        public java.lang.String mVersionName;
        public java.lang.String mSharedUserId;
        public int mSharedUserLabel;
        public android.content.pm.PackageParser.SigningDetails mSigningDetails;
        public int mPreferredOrder;
        public long[] mLastPackageUsageTimeInMills;
        public java.lang.Object mExtras;
        public java.util.ArrayList<android.content.pm.ConfigurationInfo> configPreferences;
        public java.util.ArrayList<android.content.pm.FeatureInfo> reqFeatures;
        public java.util.ArrayList<android.content.pm.FeatureGroupInfo> featureGroups;
        public int installLocation;
        public boolean coreApp;
        public boolean mRequiredForAllUsers;
        public java.lang.String mRestrictedAccountType;
        public java.lang.String mRequiredAccountType;
        public java.lang.String mOverlayTarget;
        public java.lang.String mOverlayTargetName;
        public java.lang.String mOverlayCategory;
        public int mOverlayPriority;
        public boolean mOverlayIsStatic;
        public int mCompileSdkVersion;
        public java.lang.String mCompileSdkVersionCodename;
        public android.util.ArraySet<java.lang.String> mUpgradeKeySets;
        public android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.security.PublicKey>> mKeySetMapping;
        public java.lang.String cpuAbiOverride;
        public boolean use32bitAbi;
        public byte[] restrictUpdateHash;
        public boolean visibleToInstantApps;
        public boolean isStub;
        public static final android.os.Parcelable.Creator CREATOR = null;
        public long getLongVersionCode() { return 0L; }
        public Package(java.lang.String p0) {}
        public void setApplicationVolumeUuid(java.lang.String p0) {}
        public void setApplicationInfoCodePath(java.lang.String p0) {}
        @java.lang.Deprecated
        public void setApplicationInfoResourcePath(java.lang.String p0) {}
        @java.lang.Deprecated
        public void setApplicationInfoBaseResourcePath(java.lang.String p0) {}
        public void setApplicationInfoBaseCodePath(java.lang.String p0) {}
        public java.util.List<java.lang.String> getChildPackageNames() { return null; }
        public boolean hasChildPackage(java.lang.String p0) { return false; }
        public void setApplicationInfoSplitCodePaths(java.lang.String[] p0) {}
        @java.lang.Deprecated
        public void setApplicationInfoSplitResourcePaths(java.lang.String[] p0) {}
        public void setSplitCodePaths(java.lang.String[] p0) {}
        public void setCodePath(java.lang.String p0) {}
        public void setBaseCodePath(java.lang.String p0) {}
        public void setSigningDetails(android.content.pm.PackageParser.SigningDetails p0) {}
        public void setVolumeUuid(java.lang.String p0) {}
        public void setApplicationInfoFlags(int p0, int p1) {}
        public void setUse32bitAbi(boolean p0) {}
        public boolean isLibrary() { return false; }
        public java.util.List<java.lang.String> getAllCodePaths() { return null; }
        public java.util.List<java.lang.String> getAllCodePathsExcludingResourceOnly() { return null; }
        public void setPackageName(java.lang.String p0) {}
        public boolean hasComponentClassName(java.lang.String p0) { return false; }
        public boolean isExternal() { return false; }
        public boolean isForwardLocked() { return false; }
        public boolean isOem() { return false; }
        public boolean isVendor() { return false; }
        public boolean isProduct() { return false; }
        public boolean isSystemExt() { return false; }
        public boolean isOdm() { return false; }
        public boolean isPrivileged() { return false; }
        public boolean isSystem() { return false; }
        public boolean isUpdatedSystemApp() { return false; }
        public boolean canHaveOatDir() { return false; }
        public boolean isMatch(int p0) { return false; }
        public long getLatestPackageUseTimeInMills() { return 0L; }
        public long getLatestForegroundPackageUseTimeInMills() { return 0L; }
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public Package(android.os.Parcel p0) {}
        public void fixupOwner(java.util.List<? extends android.content.pm.PackageParser.Component<?>> p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class PackageLite {
        public final java.lang.String packageName = null;
        public final int versionCode = 0;
        public final int versionCodeMajor = 0;
        public final int installLocation = 0;
        public final android.content.pm.VerifierInfo[] verifiers = null;
        public final java.lang.String[] splitNames = null;
        public final boolean[] isFeatureSplits = null;
        public final java.lang.String[] usesSplitNames = null;
        public final java.lang.String[] configForSplit = null;
        public final java.lang.String codePath = null;
        public final java.lang.String baseCodePath = null;
        public final java.lang.String[] splitCodePaths = null;
        public final int baseRevisionCode = 0;
        public final int[] splitRevisionCodes = null;
        public final boolean coreApp = false;
        public final boolean debuggable = false;
        public final boolean multiArch = false;
        public final boolean use32bitAbi = false;
        public final boolean extractNativeLibs = false;
        public final boolean isolatedSplits = false;
        public final boolean profilableByShell = false;
        public final boolean isSplitRequired = false;
        public final boolean useEmbeddedDex = false;
        public PackageLite(java.lang.String p0, java.lang.String p1, android.content.pm.PackageParser.ApkLite p2, java.lang.String[] p3, boolean[] p4, java.lang.String[] p5, java.lang.String[] p6, java.lang.String[] p7, int[] p8) {}
        public java.util.List<java.lang.String> getAllCodePaths() { return null; }
        public long getLongVersionCode() { return 0L; }
    }

    public static class PackageParserException extends java.lang.Exception {
        public final int error = 0;
        public PackageParserException(int p0, java.lang.String p1) { super(); }
        public PackageParserException(int p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
    }

    public static class ParseComponentArgs extends android.content.pm.PackageParser.ParsePackageItemArgs {
        final java.lang.String[] sepProcesses = null;
        final int processRes = 0;
        final int descriptionRes = 0;
        final int enabledRes = 0;
        int flags;
        public ParseComponentArgs(android.content.pm.PackageParser.Package p0, java.lang.String[] p1, int p2, int p3, int p4, int p5, int p6, int p7, java.lang.String[] p8, int p9, int p10, int p11) { super(null, null, 0, 0, 0, 0, 0, 0); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ParseFlags {
    }

    static class ParsePackageItemArgs {
        final android.content.pm.PackageParser.Package owner = null;
        final java.lang.String[] outError = null;
        final int nameRes = 0;
        final int labelRes = 0;
        final int iconRes = 0;
        final int roundIconRes = 0;
        final int logoRes = 0;
        final int bannerRes = 0;
        java.lang.String tag;
        android.content.res.TypedArray sa;
        ParsePackageItemArgs(android.content.pm.PackageParser.Package p0, java.lang.String[] p1, int p2, int p3, int p4, int p5, int p6, int p7) {}
    }

    public static final class Permission extends android.content.pm.PackageParser.Component<android.content.pm.PackageParser.IntentInfo> implements android.os.Parcelable {
        public final android.content.pm.PermissionInfo info = null;
        public boolean tree;
        public android.content.pm.PackageParser.PermissionGroup group;
        public static final android.os.Parcelable.Creator CREATOR = null;
        public Permission(android.content.pm.PackageParser.Package p0, java.lang.String p1) { super((android.content.pm.PackageParser.Package)null); }
        public Permission(android.content.pm.PackageParser.Package p0, android.content.pm.PermissionInfo p1) { super((android.content.pm.PackageParser.Package)null); }
        public void setPackageName(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean isAppOp() { return false; }
    }

    public static final class PermissionGroup extends android.content.pm.PackageParser.Component<android.content.pm.PackageParser.IntentInfo> implements android.os.Parcelable {
        public final android.content.pm.PermissionGroupInfo info = null;
        public static final android.os.Parcelable.Creator CREATOR = null;
        public PermissionGroup(android.content.pm.PackageParser.Package p0, int p1, int p2, int p3) { super((android.content.pm.PackageParser.Package)null); }
        public PermissionGroup(android.content.pm.PackageParser.Package p0, android.content.pm.PermissionGroupInfo p1) { super((android.content.pm.PackageParser.Package)null); }
        public void setPackageName(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class Provider extends android.content.pm.PackageParser.Component<android.content.pm.PackageParser.ProviderIntentInfo> implements android.os.Parcelable {
        public final android.content.pm.ProviderInfo info = null;
        public boolean syncable;
        public static final android.os.Parcelable.Creator CREATOR = null;
        public Provider(android.content.pm.PackageParser.ParseComponentArgs p0, android.content.pm.ProviderInfo p1) { super((android.content.pm.PackageParser.Package)null); }
        public Provider(android.content.pm.PackageParser.Provider p0) { super((android.content.pm.PackageParser.Package)null); }
        public void setPackageName(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class ProviderIntentInfo extends android.content.pm.PackageParser.IntentInfo {
        public android.content.pm.PackageParser.Provider provider;
        public ProviderIntentInfo(android.content.pm.PackageParser.Provider p0) { super(); }
        public java.lang.String toString() { return null; }
        public ProviderIntentInfo(android.os.Parcel p0) { super(); }
    }

    public static final class Service extends android.content.pm.PackageParser.Component<android.content.pm.PackageParser.ServiceIntentInfo> implements android.os.Parcelable {
        public final android.content.pm.ServiceInfo info = null;
        public static final android.os.Parcelable.Creator CREATOR = null;
        public Service(android.content.pm.PackageParser.ParseComponentArgs p0, android.content.pm.ServiceInfo p1) { super((android.content.pm.PackageParser.Package)null); }
        public void setPackageName(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class ServiceIntentInfo extends android.content.pm.PackageParser.IntentInfo {
        public android.content.pm.PackageParser.Service service;
        public ServiceIntentInfo(android.content.pm.PackageParser.Service p0) { super(); }
        public java.lang.String toString() { return null; }
        public ServiceIntentInfo(android.os.Parcel p0) { super(); }
    }

    public static final class SigningDetails implements android.os.Parcelable {
        public final android.content.pm.Signature[] signatures = null;
        @android.content.pm.PackageParser.SigningDetails.SignatureSchemeVersion
        public final int signatureSchemeVersion = 0;
        public final android.util.ArraySet<java.security.PublicKey> publicKeys = null;
        public final android.content.pm.Signature[] pastSigningCertificates = null;
        public static final android.content.pm.PackageParser.SigningDetails UNKNOWN = null;
        public static final android.os.Parcelable.Creator<android.content.pm.PackageParser.SigningDetails> CREATOR = null;
        public SigningDetails(android.content.pm.Signature[] p0, int p1, android.util.ArraySet<java.security.PublicKey> p2, android.content.pm.Signature[] p3) {}
        public SigningDetails(android.content.pm.Signature[] p0, int p1, android.content.pm.Signature[] p2) throws java.security.cert.CertificateException {}
        public SigningDetails(android.content.pm.Signature[] p0, int p1) throws java.security.cert.CertificateException {}
        public SigningDetails(android.content.pm.PackageParser.SigningDetails p0) {}
        public android.content.pm.PackageParser.SigningDetails mergeLineageWith(android.content.pm.PackageParser.SigningDetails p0) { return null; }
        public boolean hasCommonAncestor(android.content.pm.PackageParser.SigningDetails p0) { return false; }
        public boolean hasAncestorOrSelfWithDigest(java.util.Set<java.lang.String> p0) { return false; }
        public boolean hasSignatures() { return false; }
        public boolean hasPastSigningCertificates() { return false; }
        public boolean hasAncestorOrSelf(android.content.pm.PackageParser.SigningDetails p0) { return false; }
        public boolean hasAncestor(android.content.pm.PackageParser.SigningDetails p0) { return false; }
        public boolean hasCommonSignerWithCapability(android.content.pm.PackageParser.SigningDetails p0, int p1) { return false; }
        public boolean checkCapability(android.content.pm.PackageParser.SigningDetails p0, int p1) { return false; }
        public boolean checkCapabilityRecover(android.content.pm.PackageParser.SigningDetails p0, int p1) throws java.security.cert.CertificateException { return false; }
        public boolean hasCertificate(android.content.pm.Signature p0) { return false; }
        public boolean hasCertificate(android.content.pm.Signature p0, int p1) { return false; }
        public boolean hasCertificate(byte[] p0) { return false; }
        public boolean checkCapability(java.lang.String p0, int p1) { return false; }
        public boolean hasSha256Certificate(byte[] p0) { return false; }
        public boolean hasSha256Certificate(byte[] p0, int p1) { return false; }
        public boolean signaturesMatchExactly(android.content.pm.PackageParser.SigningDetails p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        protected SigningDetails(android.os.Parcel p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }

        public static class Builder {
            public Builder() {}
            public android.content.pm.PackageParser.SigningDetails.Builder setSignatures(android.content.pm.Signature[] p0) { return null; }
            public android.content.pm.PackageParser.SigningDetails.Builder setSignatureSchemeVersion(int p0) { return null; }
            public android.content.pm.PackageParser.SigningDetails.Builder setPastSigningCertificates(android.content.pm.Signature[] p0) { return null; }
            public android.content.pm.PackageParser.SigningDetails build() throws java.security.cert.CertificateException { return null; }
        }

        public static @interface CertCapabilities {
            public static final int INSTALLED_DATA = 1;
            public static final int SHARED_USER_ID = 2;
            public static final int PERMISSION = 4;
            public static final int ROLLBACK = 8;
            public static final int AUTH = 16;
        }

        public static @interface SignatureSchemeVersion {
            public static final int UNKNOWN = 0;
            public static final int JAR = 1;
            public static final int SIGNING_BLOCK_V2 = 2;
            public static final int SIGNING_BLOCK_V3 = 3;
            public static final int SIGNING_BLOCK_V4 = 4;
        }
    }

    @java.lang.Deprecated
    private static class SplitAssetDependencyLoader extends android.content.pm.PackageParser.SplitDependencyLoader<android.content.pm.PackageParser.PackageParserException> implements android.content.pm.PackageParser.SplitAssetLoader {
        SplitAssetDependencyLoader(android.content.pm.PackageParser.PackageLite p0, android.util.SparseArray<int[]> p1, int p2) { super(null); }
        protected boolean isSplitCached(int p0) { return false; }
        protected void constructSplit(int p0, int[] p1, int p2) throws android.content.pm.PackageParser.PackageParserException {}
        public android.content.res.AssetManager getBaseAssetManager() throws android.content.pm.PackageParser.PackageParserException { return null; }
        public android.content.res.AssetManager getSplitAssetManager(int p0) throws android.content.pm.PackageParser.PackageParserException { return null; }
        public void close() throws java.lang.Exception {}
        public android.content.res.ApkAssets getBaseApkAssets() { return null; }
    }

    @java.lang.Deprecated
    private static interface SplitAssetLoader extends java.lang.AutoCloseable {
        public android.content.res.AssetManager getBaseAssetManager() throws android.content.pm.PackageParser.PackageParserException;
        public android.content.res.AssetManager getSplitAssetManager(int p0) throws android.content.pm.PackageParser.PackageParserException;
        public android.content.res.ApkAssets getBaseApkAssets();
    }

    @java.lang.Deprecated
    private static abstract class SplitDependencyLoader<E extends java.lang.Exception> {
        protected SplitDependencyLoader(android.util.SparseArray<int[]> p0) {}
        protected void loadDependenciesForSplit(int p0) throws E {}
        protected abstract boolean isSplitCached(int p0);
        protected abstract void constructSplit(int p0, int[] p1, int p2) throws E;
        public static android.util.SparseArray<int[]> createDependenciesFromPackage(android.content.pm.PackageParser.PackageLite p0) throws android.content.pm.PackageParser.SplitDependencyLoader.IllegalDependencyException { return null; }

        public static class IllegalDependencyException extends java.lang.Exception {
        }
    }

    private static abstract class SplitNameComparator implements java.util.Comparator<java.lang.String> {
        public int compare(java.lang.String p0, java.lang.String p1) { return 0; }
    }
}
