package android.os.storage;

public class StorageManager {
    private static final java.lang.String TAG = "StorageManager";
    private static final boolean LOCAL_LOGV = Boolean.valueOf(false);
    public static final java.lang.String PROP_PRIMARY_PHYSICAL = "ro.vold.primary_physical";
    public static final java.lang.String PROP_HAS_ADOPTABLE = "vold.has_adoptable";
    public static final java.lang.String PROP_HAS_RESERVED = "vold.has_reserved";
    public static final java.lang.String PROP_ADOPTABLE = "persist.sys.adoptable";
    public static final java.lang.String PROP_EMULATE_FBE = "persist.sys.emulate_fbe";
    public static final java.lang.String PROP_SDCARDFS = "persist.sys.sdcardfs";
    public static final java.lang.String PROP_VIRTUAL_DISK = "persist.sys.virtual_disk";
    public static final java.lang.String PROP_ISOLATED_STORAGE = "persist.sys.isolated_storage";
    public static final java.lang.String PROP_ISOLATED_STORAGE_SNAPSHOT = "sys.isolated_storage_snapshot";
    public static final java.lang.String UUID_PRIVATE_INTERNAL = null;
    public static final java.lang.String UUID_PRIMARY_PHYSICAL = "primary_physical";
    public static final java.lang.String UUID_SYSTEM = "system";
    public static final java.util.UUID UUID_DEFAULT = null;
    public static final java.util.UUID UUID_PRIMARY_PHYSICAL_ = null;
    public static final java.util.UUID UUID_SYSTEM_ = null;
    public static final java.lang.String ACTION_MANAGE_STORAGE = "android.os.storage.action.MANAGE_STORAGE";
    public static final java.lang.String EXTRA_UUID = "android.os.storage.extra.UUID";
    public static final java.lang.String EXTRA_REQUESTED_BYTES = "android.os.storage.extra.REQUESTED_BYTES";
    public static final int DEBUG_ADOPTABLE_FORCE_ON = 1;
    public static final int DEBUG_ADOPTABLE_FORCE_OFF = 2;
    public static final int DEBUG_EMULATE_FBE = 4;
    public static final int DEBUG_SDCARDFS_FORCE_ON = 8;
    public static final int DEBUG_SDCARDFS_FORCE_OFF = 16;
    public static final int DEBUG_VIRTUAL_DISK = 32;
    public static final int DEBUG_ISOLATED_STORAGE_FORCE_ON = 64;
    public static final int DEBUG_ISOLATED_STORAGE_FORCE_OFF = 128;
    public static final int FLAG_STORAGE_DE = 1;
    public static final int FLAG_STORAGE_CE = 2;
    public static final int FLAG_STORAGE_EXTERNAL = 4;
    public static final int FLAG_FOR_WRITE = 256;
    public static final int FLAG_REAL_STATE = 512;
    public static final int FLAG_INCLUDE_INVISIBLE = 1024;
    public static final int FSTRIM_FLAG_DEEP = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int ENCRYPTION_STATE_NONE = 1;
    public static final int ENCRYPTION_STATE_OK = 0;
    public static final int ENCRYPTION_STATE_ERROR_UNKNOWN = -1;
    public static final int ENCRYPTION_STATE_ERROR_INCOMPLETE = -2;
    public static final int ENCRYPTION_STATE_ERROR_INCONSISTENT = -3;
    public static final int ENCRYPTION_STATE_ERROR_CORRUPT = -4;
    private static volatile android.os.storage.IStorageManager sStorageManager;
    private final android.content.Context mContext = null;
    private final android.content.ContentResolver mResolver = null;
    private final android.os.storage.IStorageManager mStorageManager = null;
    private final android.app.AppOpsManager mAppOps = null;
    private final android.os.Looper mLooper = null;
    private final java.util.concurrent.atomic.AtomicInteger mNextNonce = null;
    private final java.util.ArrayList<android.os.storage.StorageManager.StorageEventListenerDelegate> mDelegates = null;
    private final android.os.storage.StorageManager.ObbActionListener mObbActionListener = null;
    private static final int DEFAULT_THRESHOLD_PERCENTAGE = 5;
    private static final long DEFAULT_THRESHOLD_MAX_BYTES = Long.valueOf(0L);
    private static final int DEFAULT_CACHE_PERCENTAGE = 10;
    private static final long DEFAULT_CACHE_MAX_BYTES = Long.valueOf(0L);
    private static final long DEFAULT_FULL_THRESHOLD_BYTES = Long.valueOf(0L);
    @android.annotation.SystemApi
    public static final int FLAG_ALLOCATE_AGGRESSIVE = 1;
    public static final int FLAG_ALLOCATE_DEFY_ALL_RESERVED = 2;
    public static final int FLAG_ALLOCATE_DEFY_HALF_RESERVED = 4;
    private static final java.lang.String XATTR_CACHE_GROUP = "user.cache_group";
    private static final java.lang.String XATTR_CACHE_TOMBSTONE = "user.cache_tombstone";
    private final java.lang.Object mFuseAppLoopLock = null;
    private com.android.internal.os.FuseAppLoop mFuseAppLoop;
    @android.annotation.UnsupportedAppUsage
    public static final int CRYPT_TYPE_PASSWORD = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int CRYPT_TYPE_DEFAULT = 1;
    public static final int CRYPT_TYPE_PATTERN = 2;
    public static final int CRYPT_TYPE_PIN = 3;
    public static final java.lang.String SYSTEM_LOCALE_KEY = "SystemLocale";
    public static final java.lang.String OWNER_INFO_KEY = "OwnerInfo";
    public static final java.lang.String PATTERN_VISIBLE_KEY = "PatternVisible";
    public static final java.lang.String PASSWORD_VISIBLE_KEY = "PasswordVisible";
    private int getNextNonce() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static android.os.storage.StorageManager from(android.content.Context p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public StorageManager(android.content.Context p0, android.os.Looper p1) throws android.os.ServiceManager.ServiceNotFoundException {}
    @android.annotation.UnsupportedAppUsage
    public void registerListener(android.os.storage.StorageEventListener p0) {}
    @android.annotation.UnsupportedAppUsage
    public void unregisterListener(android.os.storage.StorageEventListener p0) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void enableUsbMassStorage() {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void disableUsbMassStorage() {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public boolean isUsbMassStorageConnected() { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public boolean isUsbMassStorageEnabled() { return false; }
    public boolean mountObb(java.lang.String p0, java.lang.String p1, android.os.storage.OnObbStateChangeListener p2) { return false; }
    private android.content.res.ObbInfo getObbInfo(java.lang.String p0) { return null; }
    public boolean unmountObb(java.lang.String p0, boolean p1, android.os.storage.OnObbStateChangeListener p2) { return false; }
    public boolean isObbMounted(java.lang.String p0) { return false; }
    public java.lang.String getMountedObbPath(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.os.storage.DiskInfo> getDisks() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.os.storage.DiskInfo findDiskById(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.os.storage.VolumeInfo findVolumeById(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.os.storage.VolumeInfo findVolumeByUuid(java.lang.String p0) { return null; }
    public android.os.storage.VolumeRecord findRecordByUuid(java.lang.String p0) { return null; }
    public android.os.storage.VolumeInfo findPrivateForEmulated(android.os.storage.VolumeInfo p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.os.storage.VolumeInfo findEmulatedForPrivate(android.os.storage.VolumeInfo p0) { return null; }
    public android.os.storage.VolumeInfo findVolumeByQualifiedUuid(java.lang.String p0) { return null; }
    public java.util.UUID getUuidForPath(java.io.File p0) throws java.io.IOException { return null; }
    public java.io.File findPathForUuid(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    public boolean isAllocationSupported(java.io.FileDescriptor p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.os.storage.VolumeInfo> getVolumes() { return null; }
    public java.util.List<android.os.storage.VolumeInfo> getWritablePrivateVolumes() { return null; }
    public java.util.List<android.os.storage.VolumeRecord> getVolumeRecords() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getBestVolumeDescription(android.os.storage.VolumeInfo p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.os.storage.VolumeInfo getPrimaryPhysicalVolume() { return null; }
    public void mount(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public void unmount(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public void format(java.lang.String p0) {}
    @java.lang.Deprecated
    public long benchmark(java.lang.String p0) { return 0L; }
    public void benchmark(java.lang.String p0, android.os.IVoldTaskListener p1) {}
    @android.annotation.UnsupportedAppUsage
    public void partitionPublic(java.lang.String p0) {}
    public void partitionPrivate(java.lang.String p0) {}
    public void partitionMixed(java.lang.String p0, int p1) {}
    public void wipeAdoptableDisks() {}
    public void setVolumeNickname(java.lang.String p0, java.lang.String p1) {}
    public void setVolumeInited(java.lang.String p0, boolean p1) {}
    public void setVolumeSnoozed(java.lang.String p0, boolean p1) {}
    public void forgetVolume(java.lang.String p0) {}
    public java.lang.String getPrimaryStorageUuid() { return null; }
    public void setPrimaryStorageUuid(java.lang.String p0, android.content.pm.IPackageMoveObserver p1) {}
    public android.os.storage.StorageVolume getStorageVolume(java.io.File p0) { return null; }
    public android.os.storage.StorageVolume getStorageVolume(android.net.Uri p0) { return null; }
    public static android.os.storage.StorageVolume getStorageVolume(java.io.File p0, int p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    private static android.os.storage.StorageVolume getStorageVolume(android.os.storage.StorageVolume[] p0, java.io.File p1) { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getVolumeState(java.lang.String p0) { return null; }
    public java.util.List<android.os.storage.StorageVolume> getStorageVolumes() { return null; }
    public android.os.storage.StorageVolume getPrimaryStorageVolume() { return null; }
    public static android.util.Pair<java.lang.String, java.lang.Long> getPrimaryStoragePathAndSize() { return null; }
    public long getPrimaryStorageSize() { return 0L; }
    public void mkdirs(java.io.File p0) {}
    public android.os.storage.StorageVolume[] getVolumeList() { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.os.storage.StorageVolume[] getVolumeList(int p0, int p1) { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getVolumePaths() { return null; }
    public android.os.storage.StorageVolume getPrimaryVolume() { return null; }
    public static android.os.storage.StorageVolume getPrimaryVolume(android.os.storage.StorageVolume[] p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public long getStorageBytesUntilLow(java.io.File p0) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getStorageLowBytes(java.io.File p0) { return 0L; }
    public long getStorageCacheBytes(java.io.File p0, int p1) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getStorageFullBytes(java.io.File p0) { return 0L; }
    public void createUserKey(int p0, int p1, boolean p2) {}
    public void destroyUserKey(int p0) {}
    public void unlockUserKey(int p0, int p1, byte[] p2, byte[] p3) {}
    public void lockUserKey(int p0) {}
    public void prepareUserStorage(java.lang.String p0, int p1, int p2, int p3) {}
    public void destroyUserStorage(java.lang.String p0, int p1, int p2) {}
    public static boolean isUserKeyUnlocked(int p0) { return false; }
    public boolean isEncrypted(java.io.File p0) { return false; }
    public static boolean isEncryptable() { return false; }
    public static boolean isEncrypted() { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isFileEncryptedNativeOnly() { return false; }
    public static boolean isBlockEncrypted() { return false; }
    public static boolean isNonDefaultBlockEncrypted() { return false; }
    public static boolean isBlockEncrypting() { return false; }
    public static boolean inCryptKeeperBounce() { return false; }
    public static boolean isFileEncryptedEmulatedOnly() { return false; }
    public static boolean isFileEncryptedNativeOrEmulated() { return false; }
    public static boolean hasAdoptable() { return false; }
    @android.annotation.SystemApi
    public static boolean hasIsolatedStorage() { return false; }
    @java.lang.Deprecated
    public static java.io.File maybeTranslateEmulatedPathToInternal(java.io.File p0) { return null; }
    public java.io.File translateAppToSystem(java.io.File p0, int p1, int p2) { return null; }
    public java.io.File translateSystemToApp(java.io.File p0, int p1, int p2) { return null; }
    public static boolean checkPermissionAndAppOp(android.content.Context p0, boolean p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6) { return false; }
    public static boolean checkPermissionAndCheckOp(android.content.Context p0, boolean p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6) { return false; }
    private static boolean checkPermissionAndAppOp(android.content.Context p0, boolean p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6, boolean p7) { return false; }
    private boolean checkPermissionAndAppOp(boolean p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5) { return false; }
    private boolean noteAppOpAllowingLegacy(boolean p0, int p1, int p2, java.lang.String p3, int p4) { return false; }
    public boolean checkPermissionReadAudio(boolean p0, int p1, int p2, java.lang.String p3) { return false; }
    public boolean checkPermissionWriteAudio(boolean p0, int p1, int p2, java.lang.String p3) { return false; }
    public boolean checkPermissionReadVideo(boolean p0, int p1, int p2, java.lang.String p3) { return false; }
    public boolean checkPermissionWriteVideo(boolean p0, int p1, int p2, java.lang.String p3) { return false; }
    public boolean checkPermissionReadImages(boolean p0, int p1, int p2, java.lang.String p3) { return false; }
    public boolean checkPermissionWriteImages(boolean p0, int p1, int p2, java.lang.String p3) { return false; }
    public android.os.ParcelFileDescriptor openProxyFileDescriptor(int p0, android.os.ProxyFileDescriptorCallback p1, android.os.Handler p2, java.util.concurrent.ThreadFactory p3) throws java.io.IOException { return null; }
    public android.os.ParcelFileDescriptor openProxyFileDescriptor(int p0, android.os.ProxyFileDescriptorCallback p1) throws java.io.IOException { return null; }
    public android.os.ParcelFileDescriptor openProxyFileDescriptor(int p0, android.os.ProxyFileDescriptorCallback p1, android.os.Handler p2) throws java.io.IOException { return null; }
    public int getProxyFileDescriptorMountPointId() { return 0; }
    public long getCacheQuotaBytes(java.util.UUID p0) throws java.io.IOException { return 0L; }
    public long getCacheSizeBytes(java.util.UUID p0) throws java.io.IOException { return 0L; }
    public long getAllocatableBytes(java.util.UUID p0) throws java.io.IOException { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public long getAllocatableBytes(java.util.UUID p0, int p1) throws java.io.IOException { return 0L; }
    public void allocateBytes(java.util.UUID p0, long p1) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public void allocateBytes(java.util.UUID p0, long p1, int p2) throws java.io.IOException {}
    public void allocateBytes(java.io.FileDescriptor p0, long p1) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public void allocateBytes(java.io.FileDescriptor p0, long p1, int p2) throws java.io.IOException {}
    private static void setCacheBehavior(java.io.File p0, java.lang.String p1, boolean p2) throws java.io.IOException {}
    private static boolean isCacheBehavior(java.io.File p0, java.lang.String p1) throws java.io.IOException { return false; }
    public void setCacheBehaviorGroup(java.io.File p0, boolean p1) throws java.io.IOException {}
    public boolean isCacheBehaviorGroup(java.io.File p0) throws java.io.IOException { return false; }
    public void setCacheBehaviorTombstone(java.io.File p0, boolean p1) throws java.io.IOException {}
    public boolean isCacheBehaviorTombstone(java.io.File p0) throws java.io.IOException { return false; }
    public static java.util.UUID convert(java.lang.String p0) { return null; }
    public static java.lang.String convert(java.util.UUID p0) { return null; }

    private static class StorageEventListenerDelegate extends android.os.storage.IStorageEventListener.Stub implements android.os.Handler.Callback {
        private static final int MSG_STORAGE_STATE_CHANGED = 1;
        private static final int MSG_VOLUME_STATE_CHANGED = 2;
        private static final int MSG_VOLUME_RECORD_CHANGED = 3;
        private static final int MSG_VOLUME_FORGOTTEN = 4;
        private static final int MSG_DISK_SCANNED = 5;
        private static final int MSG_DISK_DESTROYED = 6;
        final android.os.storage.StorageEventListener mCallback = null;
        final android.os.Handler mHandler = null;
        public StorageEventListenerDelegate(android.os.storage.StorageEventListener p0, android.os.Looper p1) { super(); }
        public boolean handleMessage(android.os.Message p0) { return false; }
        public void onUsbMassStorageConnectionChanged(boolean p0) throws android.os.RemoteException {}
        public void onStorageStateChanged(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        public void onVolumeStateChanged(android.os.storage.VolumeInfo p0, int p1, int p2) {}
        public void onVolumeRecordChanged(android.os.storage.VolumeRecord p0) {}
        public void onVolumeForgotten(java.lang.String p0) {}
        public void onDiskScanned(android.os.storage.DiskInfo p0, int p1) {}
        public void onDiskDestroyed(android.os.storage.DiskInfo p0) throws android.os.RemoteException {}
    }

    private class ObbListenerDelegate {
        private final java.lang.ref.WeakReference<android.os.storage.OnObbStateChangeListener> mObbEventListenerRef = null;
        private final android.os.Handler mHandler = null;
        private final int nonce = 0;
        ObbListenerDelegate(android.os.storage.StorageManager p0, android.os.storage.OnObbStateChangeListener p1) {}
        android.os.storage.OnObbStateChangeListener getListener() { return null; }
        void sendObbStateChanged(java.lang.String p0, int p1) {}
    }

    private class ObbActionListener extends android.os.storage.IObbActionListener.Stub {
        private android.util.SparseArray<android.os.storage.StorageManager.ObbListenerDelegate> mListeners;
        private ObbActionListener(android.os.storage.StorageManager p0) { super(); }
        public void onObbResult(java.lang.String p0, int p1, int p2) {}
        public int addListener(android.os.storage.OnObbStateChangeListener p0) { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AllocateFlags {
    }
}
