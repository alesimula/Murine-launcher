package android.content.pm;

public class ApplicationInfo extends android.content.pm.PackageItemInfo implements android.os.Parcelable {
    public java.lang.String taskAffinity;
    public java.lang.String permission;
    public java.lang.String processName;
    public java.lang.String className;
    public int descriptionRes;
    public int theme;
    public java.lang.String manageSpaceActivityName;
    public java.lang.String backupAgentName;
    public int fullBackupContent;
    public int dataExtractionRulesRes;
    public boolean crossProfile;
    public int uiOptions;
    public static final int FLAG_SYSTEM = 1;
    public static final int FLAG_DEBUGGABLE = 2;
    public static final int FLAG_HAS_CODE = 4;
    public static final int FLAG_PERSISTENT = 8;
    public static final int FLAG_FACTORY_TEST = 16;
    public static final int FLAG_ALLOW_TASK_REPARENTING = 32;
    public static final int FLAG_ALLOW_CLEAR_USER_DATA = 64;
    public static final int FLAG_UPDATED_SYSTEM_APP = 128;
    public static final int FLAG_TEST_ONLY = 256;
    public static final int FLAG_SUPPORTS_SMALL_SCREENS = 512;
    public static final int FLAG_SUPPORTS_NORMAL_SCREENS = 1024;
    public static final int FLAG_SUPPORTS_LARGE_SCREENS = 2048;
    public static final int FLAG_RESIZEABLE_FOR_SCREENS = 4096;
    @java.lang.Deprecated
    public static final int FLAG_SUPPORTS_SCREEN_DENSITIES = 8192;
    public static final int FLAG_VM_SAFE_MODE = 16384;
    public static final int FLAG_ALLOW_BACKUP = 32768;
    public static final int FLAG_KILL_AFTER_RESTORE = 65536;
    public static final int FLAG_RESTORE_ANY_VERSION = 131072;
    public static final int FLAG_EXTERNAL_STORAGE = 262144;
    public static final int FLAG_SUPPORTS_XLARGE_SCREENS = 524288;
    public static final int FLAG_LARGE_HEAP = 1048576;
    public static final int FLAG_STOPPED = 2097152;
    public static final int FLAG_SUPPORTS_RTL = 4194304;
    public static final int FLAG_INSTALLED = 8388608;
    public static final int FLAG_IS_DATA_ONLY = 16777216;
    @java.lang.Deprecated
    public static final int FLAG_IS_GAME = 33554432;
    public static final int FLAG_FULL_BACKUP_ONLY = 67108864;
    public static final int FLAG_USES_CLEARTEXT_TRAFFIC = 134217728;
    public static final int FLAG_EXTRACT_NATIVE_LIBS = 268435456;
    public static final int FLAG_HARDWARE_ACCELERATED = 536870912;
    public static final int FLAG_SUSPENDED = 1073741824;
    public static final int FLAG_MULTIARCH = -2147483648;
    public int flags;
    public static final int PRIVATE_FLAG_HIDDEN = 1;
    public static final int PRIVATE_FLAG_CANT_SAVE_STATE = 2;
    public static final int PRIVATE_FLAG_PRIVILEGED = 8;
    public static final int PRIVATE_FLAG_HAS_DOMAIN_URLS = 16;
    public static final int PRIVATE_FLAG_DEFAULT_TO_DEVICE_PROTECTED_STORAGE = 32;
    public static final int PRIVATE_FLAG_DIRECT_BOOT_AWARE = 64;
    public static final int PRIVATE_FLAG_INSTANT = 128;
    public static final int PRIVATE_FLAG_PARTIALLY_DIRECT_BOOT_AWARE = 256;
    public static final int PRIVATE_FLAG_REQUIRED_FOR_SYSTEM_USER = 512;
    public static final int PRIVATE_FLAG_ACTIVITIES_RESIZE_MODE_RESIZEABLE = 1024;
    public static final int PRIVATE_FLAG_ACTIVITIES_RESIZE_MODE_UNRESIZEABLE = 2048;
    public static final int PRIVATE_FLAG_ACTIVITIES_RESIZE_MODE_RESIZEABLE_VIA_SDK_VERSION = 4096;
    public static final int PRIVATE_FLAG_BACKUP_IN_FOREGROUND = 8192;
    public static final int PRIVATE_FLAG_STATIC_SHARED_LIBRARY = 16384;
    public static final int PRIVATE_FLAG_ISOLATED_SPLIT_LOADING = 32768;
    public static final int PRIVATE_FLAG_VIRTUAL_PRELOAD = 65536;
    public static final int PRIVATE_FLAG_OEM = 131072;
    public static final int PRIVATE_FLAG_VENDOR = 262144;
    public static final int PRIVATE_FLAG_PRODUCT = 524288;
    public static final int PRIVATE_FLAG_SIGNED_WITH_PLATFORM_KEY = 1048576;
    public static final int PRIVATE_FLAG_SYSTEM_EXT = 2097152;
    public static final int PRIVATE_FLAG_USES_NON_SDK_API = 4194304;
    public static final int PRIVATE_FLAG_PROFILEABLE_BY_SHELL = 8388608;
    public static final int PRIVATE_FLAG_HAS_FRAGILE_USER_DATA = 16777216;
    public static final int PRIVATE_FLAG_USE_EMBEDDED_DEX = 33554432;
    public static final int PRIVATE_FLAG_ALLOW_CLEAR_USER_DATA_ON_FAILED_RESTORE = 67108864;
    public static final int PRIVATE_FLAG_ALLOW_AUDIO_PLAYBACK_CAPTURE = 134217728;
    public static final int PRIVATE_FLAG_IS_RESOURCE_OVERLAY = 268435456;
    public static final int PRIVATE_FLAG_REQUEST_LEGACY_EXTERNAL_STORAGE = 536870912;
    public static final int PRIVATE_FLAG_ODM = 1073741824;
    public static final int PRIVATE_FLAG_ALLOW_NATIVE_HEAP_POINTER_TAGGING = -2147483648;
    public static final int PRIVATE_FLAG_EXT_PROFILEABLE = 1;
    public static final int PRIVATE_FLAG_EXT_REQUEST_FOREGROUND_SERVICE_EXEMPTION = 2;
    public static final int PRIVATE_FLAG_EXT_ATTRIBUTIONS_ARE_USER_VISIBLE = 4;
    public static final int PRIVATE_FLAG_EXT_ENABLE_ON_BACK_INVOKED_CALLBACK = 8;
    public static final int PRIVATE_FLAG_EXT_ALLOWLISTED_FOR_HIDDEN_APIS = 16;
    public static final int PRIVATE_FLAG_EXT_CPU_OVERRIDE = 32;
    public static final int AUTO_REVOKE_ALLOWED = 0;
    public static final int AUTO_REVOKE_DISCOURAGED = 1;
    public static final int AUTO_REVOKE_DISALLOWED = 2;
    public int privateFlags;
    public int privateFlagsExt;
    public static final java.lang.String METADATA_PRELOADED_FONTS = "preloaded_fonts";
    public int requiresSmallestWidthDp;
    public int compatibleWidthLimitDp;
    public int largestWidthLimitDp;
    public float maxAspectRatio;
    public float minAspectRatio;
    public java.lang.String volumeUuid;
    public java.util.UUID storageUuid;
    public java.lang.String scanSourceDir;
    public java.lang.String scanPublicSourceDir;
    public java.lang.String sourceDir;
    public java.lang.String publicSourceDir;
    @android.annotation.Nullable
    public java.lang.String[] splitNames;
    @android.annotation.Nullable
    public java.lang.String[] splitSourceDirs;
    @android.annotation.Nullable
    public java.lang.String[] splitPublicSourceDirs;
    public android.util.SparseArray<int[]> splitDependencies;
    public java.lang.String[] resourceDirs;
    public java.lang.String[] overlayPaths;
    public java.lang.String seInfo;
    public java.lang.String seInfoUser;
    public java.lang.String[] sharedLibraryFiles;
    @android.annotation.Nullable
    public java.util.List<android.content.pm.SharedLibraryInfo> sharedLibraryInfos;
    @android.annotation.Nullable
    public java.util.List<android.content.pm.SharedLibraryInfo> optionalSharedLibraryInfos;
    public java.lang.String dataDir;
    public java.lang.String deviceProtectedDataDir;
    @android.annotation.SystemApi
    public java.lang.String credentialProtectedDataDir;
    public java.lang.String nativeLibraryDir;
    public java.lang.String secondaryNativeLibraryDir;
    public java.lang.String nativeLibraryRootDir;
    public boolean nativeLibraryRootRequiresIsa;
    public java.lang.String primaryCpuAbi;
    public java.lang.String secondaryCpuAbi;
    public int uid;
    public int minSdkVersion;
    public int targetSdkVersion;
    public long longVersionCode;
    @java.lang.Deprecated
    public int versionCode;
    public long createTimestamp;
    public int compileSdkVersion;
    @android.annotation.Nullable
    public java.lang.String compileSdkVersionCodename;
    public boolean enabled;
    public int enabledSetting;
    public int installLocation;
    public int networkSecurityConfigRes;
    @android.annotation.SystemApi
    public int targetSandboxVersion;
    public java.lang.String appComponentFactory;
    public int iconRes;
    public int roundIconRes;
    public int category;
    public static final int CATEGORY_UNDEFINED = -1;
    public static final int CATEGORY_GAME = 0;
    public static final int CATEGORY_AUDIO = 1;
    public static final int CATEGORY_VIDEO = 2;
    public static final int CATEGORY_IMAGE = 3;
    public static final int CATEGORY_SOCIAL = 4;
    public static final int CATEGORY_NEWS = 5;
    public static final int CATEGORY_MAPS = 6;
    public static final int CATEGORY_PRODUCTIVITY = 7;
    public static final int CATEGORY_ACCESSIBILITY = 8;
    public java.lang.String classLoaderName;
    public java.lang.String[] splitClassLoaderNames;
    public boolean hiddenUntilInstalled;
    public java.lang.String zygotePreloadName;
    public static final int GWP_ASAN_DEFAULT = -1;
    public static final int GWP_ASAN_NEVER = 0;
    public static final int GWP_ASAN_ALWAYS = 1;
    public static final int MEMTAG_DEFAULT = -1;
    public static final int MEMTAG_OFF = 0;
    public static final int MEMTAG_ASYNC = 1;
    public static final int MEMTAG_SYNC = 2;
    public static final int ZEROINIT_DEFAULT = -1;
    public static final int ZEROINIT_DISABLED = 0;
    public static final int ZEROINIT_ENABLED = 1;
    public boolean allowCrossUidActivitySwitchFromBelow;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int HIDDEN_API_ENFORCEMENT_DEFAULT = -1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int HIDDEN_API_ENFORCEMENT_DISABLED = 0;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int HIDDEN_API_ENFORCEMENT_JUST_WARN = 1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int HIDDEN_API_ENFORCEMENT_ENABLED = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.ApplicationInfo> CREATOR = null;
    public static final int RAW_EXTERNAL_STORAGE_ACCESS_DEFAULT = 0;
    public static final int RAW_EXTERNAL_STORAGE_ACCESS_REQUESTED = 1;
    public static final int RAW_EXTERNAL_STORAGE_ACCESS_NOT_REQUESTED = 2;
    public static java.lang.CharSequence getCategoryTitle(android.content.Context p0, int p1) { return null; }
    public static boolean isValidHiddenApiEnforcementPolicy(int p0) { return false; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public void dump(android.util.Printer p0, java.lang.String p1, int p2) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, int p2) {}
    public boolean hasRtlSupport() { return false; }
    public boolean hasCode() { return false; }
    public ApplicationInfo() { super(); }
    public ApplicationInfo(android.content.pm.ApplicationInfo p0) { super(); }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.CharSequence loadDescription(android.content.pm.PackageManager p0) { return null; }
    public void disableCompatibilityMode() {}
    public boolean usesCompatibilityMode() { return false; }
    public void initForUser(int p0) {}
    public boolean usesNonSdkApi() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.DELETE_PACKAGES")
    public boolean hasFragileUserData() { return false; }
    public boolean isAudioPlaybackCaptureAllowed() { return false; }
    public boolean hasRequestedLegacyExternalStorage() { return false; }
    public int getRequestRawExternalStorageAccess() { return 0; }
    public boolean allowsNativeHeapPointerTagging() { return false; }
    public int getHiddenApiEnforcementPolicy() { return 0; }
    public void setHiddenApiEnforcementPolicy(int p0) {}
    public void maybeUpdateHiddenApiEnforcementPolicy(int p0) {}
    public void setVersionCode(long p0) {}
    public android.graphics.drawable.Drawable loadDefaultIcon(android.content.pm.PackageManager p0) { return null; }
    public boolean isDefaultToDeviceProtectedStorage() { return false; }
    public boolean isDirectBootAware() { return false; }
    @android.annotation.SystemApi
    public boolean isEncryptionAware() { return false; }
    public boolean isExternal() { return false; }
    @android.annotation.SystemApi
    public boolean isInstantApp() { return false; }
    public boolean isInternal() { return false; }
    @android.annotation.SystemApi
    public boolean isOem() { return false; }
    public boolean isOdm() { return false; }
    public boolean isPartiallyDirectBootAware() { return false; }
    public boolean isSignedWithPlatformKey() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INSTALL_PACKAGES")
    public boolean isPrivilegedApp() { return false; }
    public boolean isRequiredForSystemUser() { return false; }
    public boolean isStaticSharedLibrary() { return false; }
    public boolean isSystemApp() { return false; }
    public boolean isUpdatedSystemApp() { return false; }
    @android.annotation.SystemApi
    public boolean isVendor() { return false; }
    @android.annotation.SystemApi
    public boolean isProduct() { return false; }
    public boolean isSystemExt() { return false; }
    public boolean isEmbeddedDexUsed() { return false; }
    public boolean isVirtualPreload() { return false; }
    public boolean isProfileableByShell() { return false; }
    public boolean isProfileable() { return false; }
    public boolean areAttributionsUserVisible() { return false; }
    public boolean requestsIsolatedSplitLoading() { return false; }
    public boolean isResourceOverlay() { return false; }
    public boolean isChangeEnabled(long p0) { return false; }
    public boolean hasRequestForegroundServiceExemption() { return false; }
    public boolean isOnBackInvokedCallbackEnabled() { return false; }
    public android.content.pm.ApplicationInfo getApplicationInfo() { return null; }
    public java.lang.String[] getAllApkPaths() { return null; }
    public void setCodePath(java.lang.String p0) {}
    public void setBaseCodePath(java.lang.String p0) {}
    public void setSplitCodePaths(java.lang.String[] p0) {}
    public void setResourcePath(java.lang.String p0) {}
    public void setBaseResourcePath(java.lang.String p0) {}
    public void setSplitResourcePaths(java.lang.String[] p0) {}
    public void setGwpAsanMode(int p0) {}
    public void setMemtagMode(int p0) {}
    public void setNativeHeapZeroInitialized(int p0) {}
    public void setRequestRawExternalStorageAccess(java.lang.Boolean p0) {}
    public void setAppClassNamesByProcess(android.util.ArrayMap<java.lang.String, java.lang.String> p0) {}
    public java.lang.String getCodePath() { return null; }
    public java.lang.String getBaseCodePath() { return null; }
    public java.lang.String[] getSplitCodePaths() { return null; }
    public java.lang.String getResourcePath() { return null; }
    public java.lang.String getBaseResourcePath() { return null; }
    public java.lang.String[] getSplitResourcePaths() { return null; }
    public int getGwpAsanMode() { return 0; }
    public int getMemtagMode() { return 0; }
    public int getNativeHeapZeroInitialized() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getCustomApplicationClassNameForProcess(java.lang.String p0) { return null; }
    public void setLocaleConfigRes(int p0) {}
    public int getLocaleConfigRes() { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.NonNull
    public java.util.List<android.content.pm.SharedLibraryInfo> getSharedLibraryInfos() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("android.content.pm.sdk_lib_independence")
    public java.util.List<android.content.pm.SharedLibraryInfo> getOptionalSharedLibraryInfos() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getKnownActivityEmbeddingCerts() { return null; }
    public void setKnownActivityEmbeddingCerts(java.util.Set<java.lang.String> p0) {}
    public void setEnableOnBackInvokedCallback(boolean p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ApplicationInfoPrivateFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ApplicationInfoPrivateFlagsExt {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Category {
    }

    public static class DisplayNameComparator implements java.util.Comparator<android.content.pm.ApplicationInfo> {
        public DisplayNameComparator(android.content.pm.PackageManager p0) {}
        public final int compare(android.content.pm.ApplicationInfo p0, android.content.pm.ApplicationInfo p1) { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GwpAsanMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HiddenApiEnforcementPolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MemtagMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NativeHeapZeroInitialized {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RawExternalStorage {
    }
}
