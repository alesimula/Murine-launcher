package com.android.internal.pm.pkg.parsing;

public class ParsingPackageUtils {
    public static final boolean DEBUG_JAR = false;
    public static final boolean DEBUG_BACKUP = false;
    public static final float DEFAULT_PRE_O_MAX_ASPECT_RATIO = 1.8600000143051147f;
    public static final float ASPECT_RATIO_NOT_SET = -1.0f;
    public static final java.lang.String ANDROID_MANIFEST_FILENAME = "AndroidManifest.xml";
    public static final java.lang.String MNT_EXPAND = "/mnt/expand/";
    public static final java.lang.String TAG_ADOPT_PERMISSIONS = "adopt-permissions";
    public static final java.lang.String TAG_APPLICATION = "application";
    public static final java.lang.String TAG_ATTRIBUTION = "attribution";
    public static final java.lang.String TAG_COMPATIBLE_SCREENS = "compatible-screens";
    public static final java.lang.String TAG_EAT_COMMENT = "eat-comment";
    public static final java.lang.String TAG_FEATURE_GROUP = "feature-group";
    public static final java.lang.String TAG_INSTALL_CONSTRAINTS = "install-constraints";
    public static final java.lang.String TAG_INSTRUMENTATION = "instrumentation";
    public static final java.lang.String TAG_KEY_SETS = "key-sets";
    public static final java.lang.String TAG_MANIFEST = "manifest";
    public static final java.lang.String TAG_ORIGINAL_PACKAGE = "original-package";
    public static final java.lang.String TAG_OVERLAY = "overlay";
    public static final java.lang.String TAG_PACKAGE = "package";
    public static final java.lang.String TAG_PACKAGE_VERIFIER = "package-verifier";
    public static final java.lang.String TAG_PERMISSION = "permission";
    public static final java.lang.String TAG_PERMISSION_GROUP = "permission-group";
    public static final java.lang.String TAG_PERMISSION_TREE = "permission-tree";
    public static final java.lang.String TAG_PROFILEABLE = "profileable";
    public static final java.lang.String TAG_PROTECTED_BROADCAST = "protected-broadcast";
    public static final java.lang.String TAG_QUERIES = "queries";
    public static final java.lang.String TAG_RECEIVER = "receiver";
    public static final java.lang.String TAG_RESTRICT_UPDATE = "restrict-update";
    public static final java.lang.String TAG_SUPPORTS_INPUT = "supports-input";
    public static final java.lang.String TAG_SUPPORT_SCREENS = "supports-screens";
    public static final java.lang.String TAG_USES_CONFIGURATION = "uses-configuration";
    public static final java.lang.String TAG_USES_FEATURE = "uses-feature";
    public static final java.lang.String TAG_USES_GL_TEXTURE = "uses-gl-texture";
    public static final java.lang.String TAG_USES_PERMISSION = "uses-permission";
    public static final java.lang.String TAG_USES_PERMISSION_SDK_23 = "uses-permission-sdk-23";
    public static final java.lang.String TAG_USES_PERMISSION_SDK_M = "uses-permission-sdk-m";
    public static final java.lang.String TAG_USES_SDK = "uses-sdk";
    public static final java.lang.String TAG_USES_SPLIT = "uses-split";
    public static final java.lang.String METADATA_MAX_ASPECT_RATIO = "android.max_aspect";
    public static final java.lang.String METADATA_SUPPORTS_SIZE_CHANGES = "android.supports_size_changes";
    public static final java.lang.String METADATA_CAN_DISPLAY_ON_REMOTE_DEVICES = "android.can_display_on_remote_devices";
    public static final java.lang.String METADATA_ACTIVITY_WINDOW_LAYOUT_AFFINITY = "android.activity_window_layout_affinity";
    public static final java.lang.String METADATA_ACTIVITY_LAUNCH_MODE = "android.activity.launch_mode";
    public static final int SDK_VERSION = Integer.valueOf(0);
    public static final java.lang.String[] SDK_CODENAMES = null;
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
    public static final int PARSE_IGNORE_OVERLAY_REQUIRED_SYSTEM_PROPERTY = 128;
    public static final int PARSE_APK_IN_APEX = 512;
    public static final int PARSE_APEX = 1024;
    public static final int PARSE_CHATTY = -2147483648;
    @android.annotation.NonNull
    public static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.parsing.pkg.ParsedPackage> parseDefault(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2, java.util.List<android.permission.PermissionManager.SplitPermissionInfo> p3, boolean p4, com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback p5) { return null; }
    public ParsingPackageUtils(java.lang.String[] p0, android.util.DisplayMetrics p1, java.util.List<android.permission.PermissionManager.SplitPermissionInfo> p2, com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback p3) {}
    public android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parsePackage(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2) { return null; }
    public android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parsePackageFromPackageLite(android.content.pm.parsing.result.ParseInput p0, android.content.pm.parsing.PackageLite p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.PackageManager.Property> parseMetaData(com.android.internal.pm.pkg.parsing.ParsingPackage p0, com.android.internal.pm.pkg.component.ParsedComponent p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3, java.lang.String p4, android.content.pm.parsing.result.ParseInput p5) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> getSigningDetails(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.parsing.pkg.ParsedPackage p1, boolean p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> getSigningDetails(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, boolean p2, int p3, java.lang.String[] p4, boolean p5) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> getSigningDetails(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, boolean p2, boolean p3, android.content.pm.SigningDetails p4, int p5) { return null; }
    public static void setCompatibilityModeEnabled(boolean p0) {}
    public static void readConfigUseRoundIcon(android.content.res.Resources p0) {}
    public static void writeKeySetMapping(android.os.Parcel p0, java.util.Map<java.lang.String, android.util.ArraySet<java.security.PublicKey>> p1) {}
    @android.annotation.NonNull
    public static android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.security.PublicKey>> readKeySetMapping(android.os.Parcel p0) { return null; }
    public static com.android.internal.pm.pkg.component.AconfigFlags getAconfigFlags() { return null; }

    public static interface Callback {
        public boolean hasFeature(java.lang.String p0);
        public com.android.internal.pm.pkg.parsing.ParsingPackage startParsingPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.content.res.TypedArray p3, boolean p4);
        @android.annotation.NonNull
        public java.util.Set<java.lang.String> getHiddenApiWhitelistedApps();
        @android.annotation.NonNull
        public java.util.Set<java.lang.String> getInstallConstraintsAllowlist();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ParseFlags {
    }
}
