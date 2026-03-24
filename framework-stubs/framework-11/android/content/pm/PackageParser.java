package android.content.pm;

public class PackageParser {
    public static final boolean DEBUG_JAR = false;
    public static final boolean DEBUG_PARSER = false;
    public static final boolean DEBUG_BACKUP = false;
    public static final boolean LOG_PARSE_TIMINGS = Boolean.valueOf(false);
    public static final int LOG_PARSE_TIMINGS_THRESHOLD_MS = 100;
    private static final java.lang.String PROPERTY_CHILD_PACKAGES_ENABLED = "persist.sys.child_packages_enabled";
    public static final boolean MULTI_PACKAGE_APK_ENABLED = Boolean.valueOf(false);
    public static final float DEFAULT_PRE_O_MAX_ASPECT_RATIO = 1.8600000143051147f;
    public static final float DEFAULT_PRE_Q_MIN_ASPECT_RATIO = 1.3329999446868896f;
    public static final float DEFAULT_PRE_Q_MIN_ASPECT_RATIO_WATCH = 1.0f;
    private static final int DEFAULT_MIN_SDK_VERSION = 1;
    private static final int DEFAULT_TARGET_SDK_VERSION = 0;
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
    private static final int RECREATE_ON_CONFIG_CHANGES_MASK = 3;
    public static final java.util.Set<java.lang.String> CHILD_PACKAGE_TAGS = null;
    public static final boolean LOG_UNSAFE_BROADCASTS = false;
    public static final java.util.Set<java.lang.String> SAFE_BROADCASTS = null;
    public static final java.lang.String APK_FILE_EXTENSION = ".apk";
    public static final java.lang.String APEX_FILE_EXTENSION = ".apex";
    public static final android.content.pm.PackageParser.NewPermissionInfo[] NEW_PERMISSIONS = null;
    @java.lang.Deprecated
    public java.lang.String mArchiveSourcePath;
    public java.lang.String[] mSeparateProcesses;
    private boolean mOnlyCoreApps;
    private android.util.DisplayMetrics mMetrics;
    public android.content.pm.PackageParser.Callback mCallback;
    private java.io.File mCacheDir;
    public static final int SDK_VERSION = Integer.valueOf(0);
    public static final java.lang.String[] SDK_CODENAMES = null;
    public int mParseError;
    public static boolean sCompatibilityModeEnabled;
    public static boolean sUseRoundIcon;
    public static final int PARSE_DEFAULT_INSTALL_LOCATION = -1;
    public static final int PARSE_DEFAULT_TARGET_SANDBOX = 1;
    private android.content.pm.PackageParser.ParsePackageItemArgs mParseInstrumentationArgs;
    public static final boolean RIGID_PARSER = false;
    private static final java.lang.String TAG = "PackageParser";
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
    private static boolean checkUseInstalledOrHidden(int p0, android.content.pm.PackageUserState p1, android.content.pm.ApplicationInfo p2) { return false; }
    public static boolean isAvailable(android.content.pm.PackageUserState p0) { return false; }
    public static android.content.pm.PackageInfo generatePackageInfo(android.content.pm.PackageParser.Package p0, int[] p1, int p2, long p3, long p4, java.util.Set<java.lang.String> p5, android.content.pm.PackageUserState p6) { return null; }
    public static android.content.pm.PackageInfo generatePackageInfo(android.content.pm.PackageParser.Package p0, int[] p1, int p2, long p3, long p4, java.util.Set<java.lang.String> p5, android.content.pm.PackageUserState p6, int p7) { return null; }
    public static android.content.pm.PackageInfo generatePackageInfo(android.content.pm.PackageParser.Package p0, android.apex.ApexInfo p1, int p2) { return null; }
    private static android.content.pm.PackageInfo generatePackageInfo(android.content.pm.PackageParser.Package p0, android.apex.ApexInfo p1, int[] p2, int p3, long p4, long p5, java.util.Set<java.lang.String> p6, android.content.pm.PackageUserState p7, int p8) { return null; }
    public static android.content.pm.PackageParser.PackageLite parsePackageLite(java.io.File p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private static android.content.pm.PackageParser.PackageLite parseMonolithicPackageLite(java.io.File p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    static android.content.pm.PackageParser.PackageLite parseClusterPackageLite(java.io.File p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public android.content.pm.PackageParser.Package parsePackage(java.io.File p0, int p1, boolean p2) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public android.content.pm.PackageParser.Package parsePackage(java.io.File p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private android.content.pm.PackageParser.Package parseClusterPackage(java.io.File p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public android.content.pm.PackageParser.Package parseMonolithicPackage(java.io.File p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private android.content.pm.PackageParser.Package parseBaseApk(java.io.File p0, android.content.res.AssetManager p1, int p2) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private void parseSplitApk(android.content.pm.PackageParser.Package p0, int p1, android.content.res.AssetManager p2, int p3) throws android.content.pm.PackageParser.PackageParserException {}
    private android.content.pm.PackageParser.Package parseSplitApk(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, int p3, int p4, java.lang.String[] p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, android.content.pm.PackageParser.PackageParserException { return null; }
    public static android.util.ArraySet<java.security.PublicKey> toSigningKeys(android.content.pm.Signature[] p0) throws java.security.cert.CertificateException { return null; }
    public static void collectCertificates(android.content.pm.PackageParser.Package p0, boolean p1) throws android.content.pm.PackageParser.PackageParserException {}
    private static void collectCertificatesInternal(android.content.pm.PackageParser.Package p0, boolean p1) throws android.content.pm.PackageParser.PackageParserException {}
    private static void collectCertificates(android.content.pm.PackageParser.Package p0, java.io.File p1, boolean p2) throws android.content.pm.PackageParser.PackageParserException {}
    private static android.content.res.AssetManager newConfiguredAssetManager() { return null; }
    public static android.content.pm.PackageParser.ApkLite parseApkLite(java.io.File p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public static android.content.pm.PackageParser.ApkLite parseApkLite(java.io.FileDescriptor p0, java.lang.String p1, int p2) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private static android.content.pm.PackageParser.ApkLite parseApkLiteInner(java.io.File p0, java.io.FileDescriptor p1, java.lang.String p2, int p3) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public static java.lang.String validateName(java.lang.String p0, boolean p1, boolean p2) { return null; }
    @java.lang.Deprecated
    public static android.util.Pair<java.lang.String, java.lang.String> parsePackageSplitNames(org.xmlpull.v1.XmlPullParser p0, android.util.AttributeSet p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException, android.content.pm.PackageParser.PackageParserException { return null; }
    private static android.content.pm.PackageParser.ApkLite parseApkLite(java.lang.String p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.pm.PackageParser.SigningDetails p3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException, android.content.pm.PackageParser.PackageParserException { return null; }
    private boolean parseBaseApkChild(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, int p3, java.lang.String[] p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    private android.content.pm.PackageParser.Package parseBaseApk(java.lang.String p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, int p3, java.lang.String[] p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private android.content.pm.PackageParser.Package parseBaseApkCommon(android.content.pm.PackageParser.Package p0, java.util.Set<java.lang.String> p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3, int p4, java.lang.String[] p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static boolean checkRequiredSystemProperties(java.lang.String p0, java.lang.String p1) { return false; }
    private void adjustPackageToBeUnresizeableAndUnpipable(android.content.pm.PackageParser.Package p0) {}
    private static boolean matchTargetCode(java.lang.String[] p0, java.lang.String p1) { return false; }
    public static int computeTargetSdkVersion(int p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3) { return 0; }
    public static int computeMinSdkVersion(int p0, java.lang.String p1, int p2, java.lang.String[] p3, java.lang.String[] p4) { return 0; }
    private android.content.pm.FeatureInfo parseUsesFeature(android.content.res.Resources p0, android.util.AttributeSet p1) { return null; }
    private boolean parseUsesStaticLibrary(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, java.lang.String[] p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    private java.lang.String[] parseAdditionalCertificates(android.content.res.Resources p0, android.content.res.XmlResourceParser p1, java.lang.String[] p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private boolean parseUsesPermission(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    public static java.lang.String buildClassName(java.lang.String p0, java.lang.CharSequence p1, java.lang.String[] p2) { return null; }
    private static java.lang.String buildCompoundName(java.lang.String p0, java.lang.CharSequence p1, java.lang.String p2, java.lang.String[] p3) { return null; }
    public static java.lang.String buildProcessName(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, int p3, java.lang.String[] p4, java.lang.String[] p5) { return null; }
    public static java.lang.String buildTaskAffinityName(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, java.lang.String[] p3) { return null; }
    private boolean parseKeySets(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, java.lang.String[] p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    private boolean parsePermissionGroup(android.content.pm.PackageParser.Package p0, int p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3, java.lang.String[] p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    private boolean parsePermission(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, java.lang.String[] p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    private boolean parsePermissionTree(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, java.lang.String[] p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    private android.content.pm.PackageParser.Instrumentation parseInstrumentation(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, java.lang.String[] p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private boolean parseBaseApplication(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, int p3, java.lang.String[] p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    private static boolean hasDomainURLs(android.content.pm.PackageParser.Package p0) { return false; }
    private boolean parseSplitApplication(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, int p3, int p4, java.lang.String[] p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    private static boolean parsePackageItemInfo(android.content.pm.PackageParser.Package p0, android.content.pm.PackageItemInfo p1, java.lang.String[] p2, java.lang.String p3, android.content.res.TypedArray p4, boolean p5, int p6, int p7, int p8, int p9, int p10, int p11) { return false; }
    private android.content.pm.PackageParser.Activity generateAppDetailsHiddenActivity(android.content.pm.PackageParser.Package p0, int p1, java.lang.String[] p2, boolean p3) { return null; }
    private android.content.pm.PackageParser.Activity parseActivity(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, int p3, java.lang.String[] p4, android.content.pm.PackageParser.CachedComponentArgs p5, boolean p6, boolean p7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private void setActivityResizeMode(android.content.pm.ActivityInfo p0, android.content.res.TypedArray p1, android.content.pm.PackageParser.Package p2) {}
    private void setMaxAspectRatio(android.content.pm.PackageParser.Package p0) {}
    private void setMinAspectRatio(android.content.pm.PackageParser.Package p0) {}
    private void setSupportsSizeChanges(android.content.pm.PackageParser.Package p0) {}
    public static int getActivityConfigChanges(int p0, int p1) { return 0; }
    private void parseLayout(android.content.res.Resources p0, android.util.AttributeSet p1, android.content.pm.PackageParser.Activity p2) {}
    private void resolveWindowLayout(android.content.pm.PackageParser.Activity p0) {}
    private android.content.pm.PackageParser.Activity parseActivityAlias(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, int p3, java.lang.String[] p4, android.content.pm.PackageParser.CachedComponentArgs p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private android.content.pm.PackageParser.Provider parseProvider(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, int p3, java.lang.String[] p4, android.content.pm.PackageParser.CachedComponentArgs p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private boolean parseProviderTags(android.content.res.Resources p0, android.content.res.XmlResourceParser p1, boolean p2, android.content.pm.PackageParser.Provider p3, java.lang.String[] p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    private android.content.pm.PackageParser.Service parseService(android.content.pm.PackageParser.Package p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, int p3, java.lang.String[] p4, android.content.pm.PackageParser.CachedComponentArgs p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private boolean isImplicitlyExposedIntent(android.content.pm.PackageParser.IntentInfo p0) { return false; }
    private boolean parseAllMetaData(android.content.res.Resources p0, android.content.res.XmlResourceParser p1, java.lang.String p2, android.content.pm.PackageParser.Component<?> p3, java.lang.String[] p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    private android.os.Bundle parseMetaData(android.content.res.Resources p0, android.content.res.XmlResourceParser p1, android.os.Bundle p2, java.lang.String[] p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.content.pm.VerifierInfo parseVerifier(android.util.AttributeSet p0) { return null; }
    public static final java.security.PublicKey parsePublicKey(java.lang.String p0) { return null; }
    private boolean parseIntent(android.content.res.Resources p0, android.content.res.XmlResourceParser p1, boolean p2, boolean p3, android.content.pm.PackageParser.IntentInfo p4, java.lang.String[] p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    private static boolean copyNeeded(int p0, android.content.pm.PackageParser.Package p1, android.content.pm.PackageUserState p2, android.os.Bundle p3, int p4) { return false; }
    public static android.content.pm.ApplicationInfo generateApplicationInfo(android.content.pm.PackageParser.Package p0, int p1, android.content.pm.PackageUserState p2) { return null; }
    private static void updateApplicationInfo(android.content.pm.ApplicationInfo p0, int p1, android.content.pm.PackageUserState p2) {}
    public static android.content.pm.ApplicationInfo generateApplicationInfo(android.content.pm.PackageParser.Package p0, int p1, android.content.pm.PackageUserState p2, int p3) { return null; }
    public static android.content.pm.ApplicationInfo generateApplicationInfo(android.content.pm.ApplicationInfo p0, int p1, android.content.pm.PackageUserState p2, int p3) { return null; }
    public static final android.content.pm.PermissionInfo generatePermissionInfo(android.content.pm.PackageParser.Permission p0, int p1) { return null; }
    public static final android.content.pm.PermissionGroupInfo generatePermissionGroupInfo(android.content.pm.PackageParser.PermissionGroup p0, int p1) { return null; }
    public static final android.content.pm.ActivityInfo generateActivityInfo(android.content.pm.PackageParser.Activity p0, int p1, android.content.pm.PackageUserState p2, int p3) { return null; }
    public static final android.content.pm.ActivityInfo generateActivityInfo(android.content.pm.ActivityInfo p0, int p1, android.content.pm.PackageUserState p2, int p3) { return null; }
    public static final android.content.pm.ServiceInfo generateServiceInfo(android.content.pm.PackageParser.Service p0, int p1, android.content.pm.PackageUserState p2, int p3) { return null; }
    public static final android.content.pm.ProviderInfo generateProviderInfo(android.content.pm.PackageParser.Provider p0, int p1, android.content.pm.PackageUserState p2, int p3) { return null; }
    public static final android.content.pm.InstrumentationInfo generateInstrumentationInfo(android.content.pm.PackageParser.Instrumentation p0, int p1) { return null; }
    public static void setCompatibilityModeEnabled(boolean p0) {}
    public static void readConfigUseRoundIcon(android.content.res.Resources p0) {}

    public static final class Activity extends android.content.pm.PackageParser.Component<android.content.pm.PackageParser.ActivityIntentInfo> implements android.os.Parcelable {
        public final android.content.pm.ActivityInfo info = null;
        private boolean mHasMaxAspectRatio;
        private boolean mHasMinAspectRatio;
        public static final android.os.Parcelable.Creator CREATOR = null;
        private boolean hasMaxAspectRatio() { return false; }
        private boolean hasMinAspectRatio() { return false; }
        Activity(android.content.pm.PackageParser.Package p0, java.lang.String p1, android.content.pm.ActivityInfo p2) { super((android.content.pm.PackageParser.Package)null); }
        public Activity(android.content.pm.PackageParser.ParseComponentArgs p0, android.content.pm.ActivityInfo p1) { super((android.content.pm.PackageParser.Package)null); }
        public void setPackageName(java.lang.String p0) {}
        private void setMaxAspectRatio(float p0) {}
        private void setMinAspectRatio(float p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private Activity(android.os.Parcel p0) { super((android.content.pm.PackageParser.Package)null); }
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
        public ApkLite(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, java.lang.String p4, java.lang.String p5, boolean p6, int p7, int p8, int p9, int p10, java.util.List<android.content.pm.VerifierInfo> p11, android.content.pm.PackageParser.SigningDetails p12, boolean p13, boolean p14, boolean p15, boolean p16, boolean p17, boolean p18, boolean p19, boolean p20, java.lang.String p21, boolean p22, int p23, int p24, int p25) {}
        public long getLongVersionCode() { return 0L; }
    }

    private static class CachedComponentArgs {
        android.content.pm.PackageParser.ParseComponentArgs mActivityArgs;
        android.content.pm.PackageParser.ParseComponentArgs mActivityAliasArgs;
        android.content.pm.PackageParser.ParseComponentArgs mServiceArgs;
        android.content.pm.PackageParser.ParseComponentArgs mProviderArgs;
        private CachedComponentArgs() {}
    }

    public static interface Callback {
        public boolean hasFeature(java.lang.String p0);
    }

    public static final class CallbackImpl implements android.content.pm.PackageParser.Callback {
        private final android.content.pm.PackageManager mPm = null;
        public CallbackImpl(android.content.pm.PackageManager p0) {}
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
        private static void writeIntentsList(java.util.ArrayList<? extends android.content.pm.PackageParser.IntentInfo> p0, android.os.Parcel p1, int p2) {}
        private static <T extends android.content.pm.PackageParser.IntentInfo> java.util.ArrayList<T> createIntentsList(android.os.Parcel p0) { return null; }
        public void appendComponentShortName(java.lang.StringBuilder p0) {}
        public void printComponentShortName(java.io.PrintWriter p0) {}
        public void setPackageName(java.lang.String p0) {}
    }

    public static final class Instrumentation extends android.content.pm.PackageParser.Component<android.content.pm.PackageParser.IntentInfo> implements android.os.Parcelable {
        public final android.content.pm.InstrumentationInfo info = null;
        public static final android.os.Parcelable.Creator CREATOR = null;
        public Instrumentation(android.content.pm.PackageParser.ParsePackageItemArgs p0, android.content.pm.InstrumentationInfo p1) { super((android.content.pm.PackageParser.Package)null); }
        public void setPackageName(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private Instrumentation(android.os.Parcel p0) { super((android.content.pm.PackageParser.Package)null); }
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
        private static void internStringArrayList(java.util.List<java.lang.String> p0) {}
        public void fixupOwner(java.util.List<? extends android.content.pm.PackageParser.Component<?>> p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private static void writeKeySetMapping(android.os.Parcel p0, android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.security.PublicKey>> p1) {}
        private static android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.security.PublicKey>> readKeySetMapping(android.os.Parcel p0) { return null; }
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
        public PackageLite(java.lang.String p0, android.content.pm.PackageParser.ApkLite p1, java.lang.String[] p2, boolean[] p3, java.lang.String[] p4, java.lang.String[] p5, java.lang.String[] p6, int[] p7) {}
        public java.util.List<java.lang.String> getAllCodePaths() { return null; }
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
        private Permission(android.os.Parcel p0) { super((android.content.pm.PackageParser.Package)null); }
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
        private PermissionGroup(android.os.Parcel p0) { super((android.content.pm.PackageParser.Package)null); }
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
        private Provider(android.os.Parcel p0) { super((android.content.pm.PackageParser.Package)null); }
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
        private Service(android.os.Parcel p0) { super((android.content.pm.PackageParser.Package)null); }
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
        private static final int PAST_CERT_EXISTS = 0;
        public static final android.content.pm.PackageParser.SigningDetails UNKNOWN = null;
        public static final android.os.Parcelable.Creator<android.content.pm.PackageParser.SigningDetails> CREATOR = null;
        public SigningDetails(android.content.pm.Signature[] p0, int p1, android.util.ArraySet<java.security.PublicKey> p2, android.content.pm.Signature[] p3) {}
        public SigningDetails(android.content.pm.Signature[] p0, int p1, android.content.pm.Signature[] p2) throws java.security.cert.CertificateException {}
        public SigningDetails(android.content.pm.Signature[] p0, int p1) throws java.security.cert.CertificateException {}
        public SigningDetails(android.content.pm.PackageParser.SigningDetails p0) {}
        public android.content.pm.PackageParser.SigningDetails mergeLineageWith(android.content.pm.PackageParser.SigningDetails p0) { return null; }
        private android.content.pm.PackageParser.SigningDetails mergeLineageWithAncestorOrSelf(android.content.pm.PackageParser.SigningDetails p0) { return null; }
        public boolean hasCommonAncestor(android.content.pm.PackageParser.SigningDetails p0) { return false; }
        private android.content.pm.PackageParser.SigningDetails getDescendantOrSelf(android.content.pm.PackageParser.SigningDetails p0) { return null; }
        public boolean hasSignatures() { return false; }
        public boolean hasPastSigningCertificates() { return false; }
        public boolean hasAncestorOrSelf(android.content.pm.PackageParser.SigningDetails p0) { return false; }
        public boolean hasAncestor(android.content.pm.PackageParser.SigningDetails p0) { return false; }
        public boolean checkCapability(android.content.pm.PackageParser.SigningDetails p0, int p1) { return false; }
        public boolean checkCapabilityRecover(android.content.pm.PackageParser.SigningDetails p0, int p1) throws java.security.cert.CertificateException { return false; }
        public boolean hasCertificate(android.content.pm.Signature p0) { return false; }
        public boolean hasCertificate(android.content.pm.Signature p0, int p1) { return false; }
        public boolean hasCertificate(byte[] p0) { return false; }
        private boolean hasCertificateInternal(android.content.pm.Signature p0, int p1) { return false; }
        public boolean checkCapability(java.lang.String p0, int p1) { return false; }
        public boolean hasSha256Certificate(byte[] p0) { return false; }
        public boolean hasSha256Certificate(byte[] p0, int p1) { return false; }
        private boolean hasSha256CertificateInternal(byte[] p0, int p1) { return false; }
        public boolean signaturesMatchExactly(android.content.pm.PackageParser.SigningDetails p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        protected SigningDetails(android.os.Parcel p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }

        public static class Builder {
            private android.content.pm.Signature[] mSignatures;
            private int mSignatureSchemeVersion;
            private android.content.pm.Signature[] mPastSigningCertificates;
            public Builder() {}
            public android.content.pm.PackageParser.SigningDetails.Builder setSignatures(android.content.pm.Signature[] p0) { return null; }
            public android.content.pm.PackageParser.SigningDetails.Builder setSignatureSchemeVersion(int p0) { return null; }
            public android.content.pm.PackageParser.SigningDetails.Builder setPastSigningCertificates(android.content.pm.Signature[] p0) { return null; }
            private void checkInvariants() {}
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

    private static class SplitNameComparator implements java.util.Comparator<java.lang.String> {
        private SplitNameComparator() {}
        public int compare(java.lang.String p0, java.lang.String p1) { return 0; }
    }
}
