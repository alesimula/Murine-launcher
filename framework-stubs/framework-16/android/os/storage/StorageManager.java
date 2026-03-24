package android.os.storage;

public class StorageManager {
    public static final java.lang.String PROP_PRIMARY_PHYSICAL = "ro.vold.primary_physical";
    public static final java.lang.String PROP_HAS_ADOPTABLE = "vold.has_adoptable";
    public static final java.lang.String PROP_HAS_RESERVED = "vold.has_reserved";
    public static final java.lang.String PROP_ADOPTABLE = "persist.sys.adoptable";
    public static final java.lang.String PROP_SDCARDFS = "persist.sys.sdcardfs";
    public static final java.lang.String PROP_VIRTUAL_DISK = "persist.sys.virtual_disk";
    public static final java.lang.String PROP_FORCED_SCOPED_STORAGE_WHITELIST = "forced_scoped_storage_whitelist";
    public static final java.lang.String UUID_PRIVATE_INTERNAL = null;
    public static final java.lang.String UUID_PRIMARY_PHYSICAL = "primary_physical";
    public static final java.lang.String UUID_SYSTEM = "system";
    public static final java.util.UUID UUID_DEFAULT = null;
    public static final java.util.UUID UUID_PRIMARY_PHYSICAL_ = null;
    public static final java.util.UUID UUID_SYSTEM_ = null;
    public static final java.lang.String ACTION_MANAGE_STORAGE = "android.os.storage.action.MANAGE_STORAGE";
    @android.annotation.RequiresPermission("android.permission.MANAGE_EXTERNAL_STORAGE")
    public static final java.lang.String ACTION_CLEAR_APP_CACHE = "android.os.storage.action.CLEAR_APP_CACHE";
    public static final java.lang.String EXTRA_UUID = "android.os.storage.extra.UUID";
    public static final java.lang.String EXTRA_REQUESTED_BYTES = "android.os.storage.extra.REQUESTED_BYTES";
    public static final int DEBUG_ADOPTABLE_FORCE_ON = 1;
    public static final int DEBUG_ADOPTABLE_FORCE_OFF = 2;
    public static final int DEBUG_SDCARDFS_FORCE_ON = 4;
    public static final int DEBUG_SDCARDFS_FORCE_OFF = 8;
    public static final int DEBUG_VIRTUAL_DISK = 16;
    public static final int FLAG_STORAGE_DE = 1;
    public static final int FLAG_STORAGE_CE = 2;
    public static final int FLAG_STORAGE_EXTERNAL = 4;
    public static final int FLAG_STORAGE_SDK = 8;
    public static final int FLAG_FOR_WRITE = 256;
    public static final int FLAG_REAL_STATE = 512;
    public static final int FLAG_INCLUDE_INVISIBLE = 1024;
    public static final int FLAG_INCLUDE_RECENT = 2048;
    public static final int FLAG_INCLUDE_SHARED_PROFILE = 4096;
    public static final int FSTRIM_FLAG_DEEP = 1;
    public static final int ENCRYPTION_STATE_NONE = 1;
    public static final int DEFAULT_STORAGE_THRESHOLD_PERCENT_HIGH = 20;
    public static final java.lang.String STORAGE_THRESHOLD_PERCENT_HIGH_KEY = "storage_threshold_percent_high";
    public static final int DEFAULT_STORAGE_THRESHOLD_PERCENT_LOW = 5;
    public static final int DEFAULT_CACHE_RESERVE_PERCENT_HIGH = 10;
    public static final java.lang.String CACHE_RESERVE_PERCENT_HIGH_KEY = "cache_reserve_percent_high";
    public static final int DEFAULT_CACHE_RESERVE_PERCENT_LOW = 2;
    public static final java.lang.String CACHE_RESERVE_PERCENT_LOW_KEY = "cache_reserve_percent_low";
    @android.annotation.SystemApi
    public static final int MOUNT_MODE_EXTERNAL_NONE = 0;
    @android.annotation.SystemApi
    public static final int MOUNT_MODE_EXTERNAL_DEFAULT = 1;
    @android.annotation.SystemApi
    public static final int MOUNT_MODE_EXTERNAL_INSTALLER = 2;
    @android.annotation.SystemApi
    public static final int MOUNT_MODE_EXTERNAL_PASS_THROUGH = 3;
    @android.annotation.SystemApi
    public static final int MOUNT_MODE_EXTERNAL_ANDROID_WRITABLE = 4;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ALLOCATE_AGGRESSIVE")
    public static final int FLAG_ALLOCATE_AGGRESSIVE = 1;
    public static final int FLAG_ALLOCATE_DEFY_ALL_RESERVED = 2;
    public static final int FLAG_ALLOCATE_DEFY_HALF_RESERVED = 4;
    public static final int FLAG_ALLOCATE_NON_CACHE_ONLY = 8;
    public static final int FLAG_ALLOCATE_CACHE_ONLY = 16;
    public static final int PROJECT_ID_EXT_DEFAULT = 1000;
    public static final int PROJECT_ID_EXT_MEDIA_AUDIO = 1001;
    public static final int PROJECT_ID_EXT_MEDIA_VIDEO = 1002;
    public static final int PROJECT_ID_EXT_MEDIA_IMAGE = 1003;
    @android.annotation.SystemApi
    public static final int QUOTA_TYPE_MEDIA_NONE = 0;
    @android.annotation.SystemApi
    public static final int QUOTA_TYPE_MEDIA_IMAGE = 1;
    @android.annotation.SystemApi
    public static final int QUOTA_TYPE_MEDIA_AUDIO = 2;
    @android.annotation.SystemApi
    public static final int QUOTA_TYPE_MEDIA_VIDEO = 3;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int APP_IO_BLOCKED_REASON_UNKNOWN = 0;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int APP_IO_BLOCKED_REASON_TRANSCODING = 1;
    public static final int CRYPT_TYPE_PASSWORD = 0;
    public static final int CRYPT_TYPE_DEFAULT = 1;
    public static void invalidateVolumeListCache() {}
    @java.lang.Deprecated
    public static android.os.storage.StorageManager from(android.content.Context p0) { return null; }
    public StorageManager(android.content.Context p0, android.os.Looper p1) throws android.os.ServiceManager.ServiceNotFoundException {}
    public void registerListener(android.os.storage.StorageEventListener p0) {}
    public void unregisterListener(android.os.storage.StorageEventListener p0) {}
    public void registerStorageVolumeCallback(java.util.concurrent.Executor p0, android.os.storage.StorageManager.StorageVolumeCallback p1) {}
    public void unregisterStorageVolumeCallback(android.os.storage.StorageManager.StorageVolumeCallback p0) {}
    @java.lang.Deprecated
    public void enableUsbMassStorage() {}
    @java.lang.Deprecated
    public void disableUsbMassStorage() {}
    @java.lang.Deprecated
    public boolean isUsbMassStorageConnected() { return false; }
    @java.lang.Deprecated
    public boolean isUsbMassStorageEnabled() { return false; }
    public boolean mountObb(java.lang.String p0, java.lang.String p1, android.os.storage.OnObbStateChangeListener p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_EXTERNAL_STORAGE")
    @android.annotation.Nullable
    public android.app.PendingIntent getManageSpaceActivityIntent(java.lang.String p0, int p1) { return null; }
    public boolean unmountObb(java.lang.String p0, boolean p1, android.os.storage.OnObbStateChangeListener p2) { return false; }
    public boolean isObbMounted(java.lang.String p0) { return false; }
    public java.lang.String getMountedObbPath(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.os.storage.DiskInfo> getDisks() { return null; }
    @android.annotation.Nullable
    public android.os.storage.DiskInfo findDiskById(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public android.os.storage.VolumeInfo findVolumeById(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public android.os.storage.VolumeInfo findVolumeByUuid(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public android.os.storage.VolumeRecord findRecordByUuid(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public android.os.storage.VolumeInfo findPrivateForEmulated(android.os.storage.VolumeInfo p0) { return null; }
    @android.annotation.Nullable
    public android.os.storage.VolumeInfo findEmulatedForPrivate(android.os.storage.VolumeInfo p0) { return null; }
    @android.annotation.Nullable
    public android.os.storage.VolumeInfo findVolumeByQualifiedUuid(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.util.UUID getUuidForPath(java.io.File p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public java.io.File findPathForUuid(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    public boolean isAllocationSupported(java.io.FileDescriptor p0) { return false; }
    @android.annotation.NonNull
    public java.util.List<android.os.storage.VolumeInfo> getVolumes() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.os.storage.VolumeInfo> getWritablePrivateVolumes() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.os.storage.VolumeRecord> getVolumeRecords() { return null; }
    @android.annotation.Nullable
    public java.lang.String getBestVolumeDescription(android.os.storage.VolumeInfo p0) { return null; }
    @android.annotation.Nullable
    public android.os.storage.VolumeInfo getPrimaryPhysicalVolume() { return null; }
    public void mount(java.lang.String p0) {}
    public void unmount(java.lang.String p0) {}
    public void format(java.lang.String p0) {}
    @java.lang.Deprecated
    public long benchmark(java.lang.String p0) { return 0L; }
    public void benchmark(java.lang.String p0, android.os.IVoldTaskListener p1) {}
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
    @android.annotation.Nullable
    public android.os.storage.StorageVolume getStorageVolume(java.io.File p0) { return null; }
    @android.annotation.NonNull
    public android.os.storage.StorageVolume getStorageVolume(android.net.Uri p0) { return null; }
    @android.annotation.Nullable
    public static android.os.storage.StorageVolume getStorageVolume(java.io.File p0, int p1) { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.lang.String getVolumeState(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.os.storage.StorageVolume> getStorageVolumes() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_EXTERNAL_STORAGE")
    @android.annotation.NonNull
    public java.util.List<android.os.storage.StorageVolume> getStorageVolumesIncludingSharedProfiles() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.os.storage.StorageVolume> getRecentStorageVolumes() { return null; }
    @android.annotation.NonNull
    public android.os.storage.StorageVolume getPrimaryStorageVolume() { return null; }
    public static android.util.Pair<java.lang.String, java.lang.Long> getPrimaryStoragePathAndSize() { return null; }
    public long getPrimaryStorageSize() { return 0L; }
    public long getInternalStorageBlockDeviceSize() { return 0L; }
    public void mkdirs(java.io.File p0) {}
    @android.annotation.NonNull
    public android.os.storage.StorageVolume[] getVolumeList() { return null; }
    @android.annotation.NonNull
    public static android.os.storage.StorageVolume[] getVolumeList(int p0, int p1) { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.lang.String[] getVolumePaths() { return null; }
    @android.annotation.NonNull
    public android.os.storage.StorageVolume getPrimaryVolume() { return null; }
    @android.annotation.NonNull
    public static android.os.storage.StorageVolume getPrimaryVolume(android.os.storage.StorageVolume[] p0) { return null; }
    public long getStorageBytesUntilLow(java.io.File p0) { return 0L; }
    public long getStorageLowBytes(java.io.File p0) { return 0L; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.SuppressLint("StreamFiles")
    public long computeStorageCacheBytes(java.io.File p0) { return 0L; }
    public long getStorageCacheBytes(java.io.File p0, int p1) { return 0L; }
    public long getStorageFullBytes(java.io.File p0) { return 0L; }
    public void createUserStorageKeys(int p0, boolean p1) {}
    public void destroyUserStorageKeys(int p0) {}
    public void lockCeStorage(int p0) {}
    public void prepareUserStorage(java.lang.String p0, int p1, int p2) {}
    public void destroyUserStorage(java.lang.String p0, int p1, int p2) {}
    public static boolean isCeStorageUnlocked(int p0) { return false; }
    public boolean isEncrypted(java.io.File p0) { return false; }
    public static boolean isEncrypted() { return false; }
    public static boolean isFileEncrypted() { return false; }
    public static boolean hasAdoptable() { return false; }
    @android.annotation.SystemApi
    public static boolean hasIsolatedStorage() { return false; }
    @java.lang.Deprecated
    public static java.io.File maybeTranslateEmulatedPathToInternal(java.io.File p0) { return null; }
    public java.io.File translateAppToSystem(java.io.File p0, int p1, int p2) { return null; }
    public java.io.File translateSystemToApp(java.io.File p0, int p1, int p2) { return null; }
    public static boolean checkPermissionAndAppOp(android.content.Context p0, boolean p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, int p7) { return false; }
    public static boolean checkPermissionAndCheckOp(android.content.Context p0, boolean p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6) { return false; }
    @java.lang.Deprecated
    public boolean checkPermissionReadImages(boolean p0, int p1, int p2, java.lang.String p3, java.lang.String p4) { return false; }
    @android.annotation.NonNull
    public android.os.ParcelFileDescriptor openProxyFileDescriptor(int p0, android.os.ProxyFileDescriptorCallback p1, android.os.Handler p2, java.util.concurrent.ThreadFactory p3) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public android.os.ParcelFileDescriptor openProxyFileDescriptor(int p0, android.os.ProxyFileDescriptorCallback p1) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public android.os.ParcelFileDescriptor openProxyFileDescriptor(int p0, android.os.ProxyFileDescriptorCallback p1, android.os.Handler p2) throws java.io.IOException { return null; }
    public int getProxyFileDescriptorMountPointId() { return 0; }
    public long getCacheQuotaBytes(java.util.UUID p0) throws java.io.IOException { return 0L; }
    public long getCacheSizeBytes(java.util.UUID p0) throws java.io.IOException { return 0L; }
    public long getAllocatableBytes(java.util.UUID p0) throws java.io.IOException { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public long getAllocatableBytes(java.util.UUID p0, int p1) throws java.io.IOException { return 0L; }
    public void allocateBytes(java.util.UUID p0, long p1) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public void allocateBytes(java.util.UUID p0, long p1, int p2) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.WRITE_MEDIA_STORAGE")
    public int getExternalStorageMountMode(int p0, java.lang.String p1) { return 0; }
    public void allocateBytes(java.io.FileDescriptor p0, long p1) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public void allocateBytes(java.io.FileDescriptor p0, long p1, int p2) throws java.io.IOException {}
    @android.annotation.SystemApi
    public void updateExternalStorageFileQuotaType(java.io.File p0, int p1) throws java.io.IOException {}
    public void fixupAppDir(java.io.File p0) {}
    public void setCacheBehaviorGroup(java.io.File p0, boolean p1) throws java.io.IOException {}
    public boolean isCacheBehaviorGroup(java.io.File p0) throws java.io.IOException { return false; }
    public void setCacheBehaviorTombstone(java.io.File p0, boolean p1) throws java.io.IOException {}
    public boolean isCacheBehaviorTombstone(java.io.File p0) throws java.io.IOException { return false; }
    @android.annotation.NonNull
    public static java.util.UUID convert(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String convert(java.util.UUID p0) { return null; }
    public boolean isCheckpointSupported() { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void notifyAppIoBlocked(java.util.UUID p0, int p1, int p2, int p3) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void notifyAppIoResumed(java.util.UUID p0, int p1, int p2, int p3) {}
    public boolean isAppIoBlocked(java.util.UUID p0, int p1, int p2, int p3) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setCloudMediaProvider(java.lang.String p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.Nullable
    public java.lang.String getCloudMediaProvider() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getInternalStorageRemainingLifetime() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AllocateFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppIoBlockedReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MountMode {
    }

    private class ObbActionListener extends android.os.storage.IObbActionListener.Stub {
        public void onObbResult(java.lang.String p0, int p1, int p2) {}
        public int addListener(android.os.storage.OnObbStateChangeListener p0) { return 0; }
    }

    private class ObbListenerDelegate {
        ObbListenerDelegate(android.os.storage.StorageManager p0, android.os.storage.OnObbStateChangeListener p1) {}
        android.os.storage.OnObbStateChangeListener getListener() { return null; }
        void sendObbStateChanged(java.lang.String p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface QuotaType {
    }

    private class StorageEventListenerDelegate extends android.os.storage.IStorageEventListener.Stub {
        final java.util.concurrent.Executor mExecutor = null;
        final android.os.storage.StorageEventListener mListener = null;
        final android.os.storage.StorageManager.StorageVolumeCallback mCallback = null;
        public StorageEventListenerDelegate(android.os.storage.StorageManager p0, java.util.concurrent.Executor p1, android.os.storage.StorageEventListener p2, android.os.storage.StorageManager.StorageVolumeCallback p3) { super(); }
        public void onUsbMassStorageConnectionChanged(boolean p0) throws android.os.RemoteException {}
        public void onStorageStateChanged(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        public void onVolumeStateChanged(android.os.storage.VolumeInfo p0, int p1, int p2) {}
        public void onVolumeRecordChanged(android.os.storage.VolumeRecord p0) {}
        public void onVolumeForgotten(java.lang.String p0) {}
        public void onDiskScanned(android.os.storage.DiskInfo p0, int p1) {}
        public void onDiskDestroyed(android.os.storage.DiskInfo p0) throws android.os.RemoteException {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StorageFlags {
    }

    public static class StorageVolumeCallback {
        public StorageVolumeCallback() {}
        public void onStateChanged(android.os.storage.StorageVolume p0) {}
    }

    static final record VolumeListQuery(int mUserId, java.lang.String mPackageName, int mFlags) {
        VolumeListQuery(int mUserId, java.lang.String mPackageName, int mFlags) { this.mUserId = mUserId; this.mPackageName = mPackageName; this.mFlags = mFlags; }
        public final java.lang.String toString() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public int mUserId() { return 0; }
        public java.lang.String mPackageName() { return null; }
        public int mFlags() { return 0; }
    }
}
