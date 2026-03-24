package android.os;

public class Environment {
    private static final java.lang.String TAG = "Environment";
    private static final java.lang.String ENV_EXTERNAL_STORAGE = "EXTERNAL_STORAGE";
    private static final java.lang.String ENV_ANDROID_ROOT = "ANDROID_ROOT";
    private static final java.lang.String ENV_ANDROID_DATA = "ANDROID_DATA";
    private static final java.lang.String ENV_ANDROID_EXPAND = "ANDROID_EXPAND";
    private static final java.lang.String ENV_ANDROID_STORAGE = "ANDROID_STORAGE";
    private static final java.lang.String ENV_DOWNLOAD_CACHE = "DOWNLOAD_CACHE";
    private static final java.lang.String ENV_OEM_ROOT = "OEM_ROOT";
    private static final java.lang.String ENV_ODM_ROOT = "ODM_ROOT";
    private static final java.lang.String ENV_VENDOR_ROOT = "VENDOR_ROOT";
    private static final java.lang.String ENV_PRODUCT_ROOT = "PRODUCT_ROOT";
    private static final java.lang.String ENV_SYSTEM_EXT_ROOT = "SYSTEM_EXT_ROOT";
    private static final java.lang.String ENV_APEX_ROOT = "APEX_ROOT";
    public static final java.lang.String DIR_ANDROID = "Android";
    private static final java.lang.String DIR_DATA = "data";
    private static final java.lang.String DIR_MEDIA = "media";
    private static final java.lang.String DIR_OBB = "obb";
    private static final java.lang.String DIR_FILES = "files";
    private static final java.lang.String DIR_CACHE = "cache";
    @java.lang.Deprecated
    public static final java.lang.String DIRECTORY_ANDROID = "Android";
    private static final java.io.File DIR_ANDROID_ROOT = null;
    private static final java.io.File DIR_ANDROID_DATA = null;
    private static final java.io.File DIR_ANDROID_EXPAND = null;
    private static final java.io.File DIR_ANDROID_STORAGE = null;
    private static final java.io.File DIR_DOWNLOAD_CACHE = null;
    private static final java.io.File DIR_OEM_ROOT = null;
    private static final java.io.File DIR_ODM_ROOT = null;
    private static final java.io.File DIR_VENDOR_ROOT = null;
    private static final java.io.File DIR_PRODUCT_ROOT = null;
    private static final java.io.File DIR_SYSTEM_EXT_ROOT = null;
    private static final java.io.File DIR_APEX_ROOT = null;
    private static final long DEFAULT_SCOPED_STORAGE = 149924527L;
    private static final long FORCE_ENABLE_SCOPED_STORAGE = 132649864L;
    private static android.os.Environment.UserEnvironment sCurrentUser;
    private static boolean sUserRequired;
    public static java.lang.String DIRECTORY_MUSIC;
    public static java.lang.String DIRECTORY_PODCASTS;
    public static java.lang.String DIRECTORY_RINGTONES;
    public static java.lang.String DIRECTORY_ALARMS;
    public static java.lang.String DIRECTORY_NOTIFICATIONS;
    public static java.lang.String DIRECTORY_PICTURES;
    public static java.lang.String DIRECTORY_MOVIES;
    public static java.lang.String DIRECTORY_DOWNLOADS;
    public static java.lang.String DIRECTORY_DCIM;
    public static java.lang.String DIRECTORY_DOCUMENTS;
    public static java.lang.String DIRECTORY_SCREENSHOTS;
    public static java.lang.String DIRECTORY_AUDIOBOOKS;
    public static final java.lang.String[] STANDARD_DIRECTORIES = null;
    public static final int HAS_MUSIC = 1;
    public static final int HAS_PODCASTS = 2;
    public static final int HAS_RINGTONES = 4;
    public static final int HAS_ALARMS = 8;
    public static final int HAS_NOTIFICATIONS = 16;
    public static final int HAS_PICTURES = 32;
    public static final int HAS_MOVIES = 64;
    public static final int HAS_DOWNLOADS = 128;
    public static final int HAS_DCIM = 256;
    public static final int HAS_DOCUMENTS = 512;
    public static final int HAS_AUDIOBOOKS = 1024;
    public static final int HAS_ANDROID = 65536;
    public static final int HAS_OTHER = 131072;
    public static final java.lang.String MEDIA_UNKNOWN = "unknown";
    public static final java.lang.String MEDIA_REMOVED = "removed";
    public static final java.lang.String MEDIA_UNMOUNTED = "unmounted";
    public static final java.lang.String MEDIA_CHECKING = "checking";
    public static final java.lang.String MEDIA_NOFS = "nofs";
    public static final java.lang.String MEDIA_MOUNTED = "mounted";
    public static final java.lang.String MEDIA_MOUNTED_READ_ONLY = "mounted_ro";
    public static final java.lang.String MEDIA_SHARED = "shared";
    public static final java.lang.String MEDIA_BAD_REMOVAL = "bad_removal";
    public static final java.lang.String MEDIA_UNMOUNTABLE = "unmountable";
    public static final java.lang.String MEDIA_EJECTING = "ejecting";
    public Environment() {}
    public static void initForCurrentUser() {}
    public static java.io.File getRootDirectory() { return null; }
    public static java.io.File getStorageDirectory() { return null; }
    @android.annotation.SystemApi
    public static java.io.File getOemDirectory() { return null; }
    @android.annotation.SystemApi
    public static java.io.File getOdmDirectory() { return null; }
    @android.annotation.SystemApi
    public static java.io.File getVendorDirectory() { return null; }
    @android.annotation.SystemApi
    public static java.io.File getProductDirectory() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static java.io.File getProductServicesDirectory() { return null; }
    @android.annotation.SystemApi
    public static java.io.File getSystemExtDirectory() { return null; }
    public static java.io.File getApexDirectory() { return null; }
    @java.lang.Deprecated
    public static java.io.File getUserSystemDirectory(int p0) { return null; }
    @java.lang.Deprecated
    public static java.io.File getUserConfigDirectory(int p0) { return null; }
    public static java.io.File getDataDirectory() { return null; }
    public static java.io.File getDataDirectory(java.lang.String p0) { return null; }
    public static java.io.File getExpandDirectory() { return null; }
    public static java.io.File getDataSystemDirectory() { return null; }
    public static java.io.File getDataSystemDeDirectory() { return null; }
    public static java.io.File getDataSystemCeDirectory() { return null; }
    public static java.io.File getDataSystemCeDirectory(int p0) { return null; }
    public static java.io.File getDataSystemDeDirectory(int p0) { return null; }
    public static java.io.File getDataMiscDirectory() { return null; }
    public static java.io.File getDataMiscCeDirectory() { return null; }
    public static java.io.File getDataMiscCeDirectory(int p0) { return null; }
    public static java.io.File getDataMiscDeDirectory(int p0) { return null; }
    private static java.io.File getDataProfilesDeDirectory(int p0) { return null; }
    public static java.io.File getDataVendorCeDirectory(int p0) { return null; }
    public static java.io.File getDataVendorDeDirectory(int p0) { return null; }
    public static java.io.File getDataRefProfilesDePackageDirectory(java.lang.String p0) { return null; }
    public static java.io.File getDataProfilesDePackageDirectory(int p0, java.lang.String p1) { return null; }
    public static java.io.File getDataAppDirectory(java.lang.String p0) { return null; }
    public static java.io.File getDataStagingDirectory(java.lang.String p0) { return null; }
    public static java.io.File getDataUserCeDirectory(java.lang.String p0) { return null; }
    public static java.io.File getDataUserCeDirectory(java.lang.String p0, int p1) { return null; }
    public static java.io.File getDataUserCePackageDirectory(java.lang.String p0, int p1, java.lang.String p2) { return null; }
    public static java.io.File getDataUserDeDirectory(java.lang.String p0) { return null; }
    public static java.io.File getDataUserDeDirectory(java.lang.String p0, int p1) { return null; }
    public static java.io.File getDataUserDePackageDirectory(java.lang.String p0, int p1, java.lang.String p2) { return null; }
    public static java.io.File getDataPreloadsDirectory() { return null; }
    public static java.io.File getDataPreloadsDemoDirectory() { return null; }
    public static java.io.File getDataPreloadsAppsDirectory() { return null; }
    public static java.io.File getDataPreloadsMediaDirectory() { return null; }
    public static java.io.File getDataPreloadsFileCacheDirectory(java.lang.String p0) { return null; }
    public static java.io.File getDataPreloadsFileCacheDirectory() { return null; }
    public static java.io.File getPackageCacheDirectory() { return null; }
    @android.annotation.SystemApi
    public static java.util.Collection<java.io.File> getInternalMediaDirectories() { return null; }
    private static void addCanonicalFile(java.util.List<java.io.File> p0, java.io.File p1) {}
    @java.lang.Deprecated
    public static java.io.File getExternalStorageDirectory() { return null; }
    public static java.io.File getLegacyExternalStorageDirectory() { return null; }
    public static java.io.File getLegacyExternalStorageObbDirectory() { return null; }
    public static boolean isStandardDirectory(java.lang.String p0) { return false; }
    public static int classifyExternalStorageDirectory(java.io.File p0) { return 0; }
    private static boolean hasInterestingFiles(java.io.File p0) { return false; }
    private static boolean isInterestingFile(java.io.File p0) { return false; }
    @java.lang.Deprecated
    public static java.io.File getExternalStoragePublicDirectory(java.lang.String p0) { return null; }
    public static java.io.File[] buildExternalStorageAndroidDataDirs() { return null; }
    public static java.io.File[] buildExternalStorageAndroidObbDirs() { return null; }
    public static java.io.File[] buildExternalStorageAppDataDirs(java.lang.String p0) { return null; }
    public static java.io.File[] buildExternalStorageAppMediaDirs(java.lang.String p0) { return null; }
    public static java.io.File[] buildExternalStorageAppObbDirs(java.lang.String p0) { return null; }
    public static java.io.File[] buildExternalStorageAppFilesDirs(java.lang.String p0) { return null; }
    public static java.io.File[] buildExternalStorageAppCacheDirs(java.lang.String p0) { return null; }
    public static java.io.File[] buildExternalStoragePublicDirs(java.lang.String p0) { return null; }
    public static java.io.File getDownloadCacheDirectory() { return null; }
    public static java.lang.String getExternalStorageState() { return null; }
    @java.lang.Deprecated
    public static java.lang.String getStorageState(java.io.File p0) { return null; }
    public static java.lang.String getExternalStorageState(java.io.File p0) { return null; }
    public static boolean isExternalStorageRemovable() { return false; }
    public static boolean isExternalStorageRemovable(java.io.File p0) { return false; }
    public static boolean isExternalStorageEmulated() { return false; }
    public static boolean isExternalStorageEmulated(java.io.File p0) { return false; }
    public static boolean isExternalStorageLegacy() { return false; }
    public static boolean isExternalStorageLegacy(java.io.File p0) { return false; }
    public static boolean isExternalStorageManager() { return false; }
    public static boolean isExternalStorageManager(java.io.File p0) { return false; }
    private static boolean isScopedStorageEnforced(boolean p0, boolean p1) { return false; }
    private static boolean isScopedStorageDisabled(boolean p0, boolean p1) { return false; }
    static java.io.File getDirectory(java.lang.String p0, java.lang.String p1) { return null; }
    public static void setUserRequired(boolean p0) {}
    private static void throwIfUserRequired() {}
    public static java.io.File[] buildPaths(java.io.File[] p0, java.lang.String... p1) { return null; }
    public static java.io.File buildPath(java.io.File p0, java.lang.String... p1) { return null; }
    @java.lang.Deprecated
    public static java.io.File maybeTranslateEmulatedPathToInternal(java.io.File p0) { return null; }

    public static class UserEnvironment {
        private final int mUserId = 0;
        public UserEnvironment(int p0) {}
        public java.io.File[] getExternalDirs() { return null; }
        @java.lang.Deprecated
        public java.io.File getExternalStorageDirectory() { return null; }
        @java.lang.Deprecated
        public java.io.File getExternalStoragePublicDirectory(java.lang.String p0) { return null; }
        public java.io.File[] buildExternalStoragePublicDirs(java.lang.String p0) { return null; }
        public java.io.File[] buildExternalStorageAndroidDataDirs() { return null; }
        public java.io.File[] buildExternalStorageAndroidObbDirs() { return null; }
        public java.io.File[] buildExternalStorageAppDataDirs(java.lang.String p0) { return null; }
        public java.io.File[] buildExternalStorageAppMediaDirs(java.lang.String p0) { return null; }
        public java.io.File[] buildExternalStorageAppObbDirs(java.lang.String p0) { return null; }
        public java.io.File[] buildExternalStorageAppFilesDirs(java.lang.String p0) { return null; }
        public java.io.File[] buildExternalStorageAppCacheDirs(java.lang.String p0) { return null; }
    }
}
