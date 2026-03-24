package android.os.storage;

public interface IStorageManager extends android.os.IInterface {
    public void registerListener(android.os.storage.IStorageEventListener p0) throws android.os.RemoteException;
    public void unregisterListener(android.os.storage.IStorageEventListener p0) throws android.os.RemoteException;
    public void shutdown(android.os.storage.IStorageShutdownObserver p0) throws android.os.RemoteException;
    public void mountObb(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.storage.IObbActionListener p3, int p4, android.content.res.ObbInfo p5) throws android.os.RemoteException;
    public void unmountObb(java.lang.String p0, boolean p1, android.os.storage.IObbActionListener p2, int p3) throws android.os.RemoteException;
    public boolean isObbMounted(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getMountedObbPath(java.lang.String p0) throws android.os.RemoteException;
    public int decryptStorage(java.lang.String p0) throws android.os.RemoteException;
    public int encryptStorage(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int changeEncryptionPassword(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.storage.StorageVolume[] getVolumeList(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int getEncryptionState() throws android.os.RemoteException;
    public int verifyEncryptionPassword(java.lang.String p0) throws android.os.RemoteException;
    public void mkdirs(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getPasswordType() throws android.os.RemoteException;
    public java.lang.String getPassword() throws android.os.RemoteException;
    public void clearPassword() throws android.os.RemoteException;
    public void setField(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getField(java.lang.String p0) throws android.os.RemoteException;
    public long lastMaintenance() throws android.os.RemoteException;
    public void runMaintenance() throws android.os.RemoteException;
    public android.os.storage.DiskInfo[] getDisks() throws android.os.RemoteException;
    public android.os.storage.VolumeInfo[] getVolumes(int p0) throws android.os.RemoteException;
    public android.os.storage.VolumeRecord[] getVolumeRecords(int p0) throws android.os.RemoteException;
    public void mount(java.lang.String p0) throws android.os.RemoteException;
    public void unmount(java.lang.String p0) throws android.os.RemoteException;
    public void format(java.lang.String p0) throws android.os.RemoteException;
    public void partitionPublic(java.lang.String p0) throws android.os.RemoteException;
    public void partitionPrivate(java.lang.String p0) throws android.os.RemoteException;
    public void partitionMixed(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setVolumeNickname(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setVolumeUserFlags(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void forgetVolume(java.lang.String p0) throws android.os.RemoteException;
    public void forgetAllVolumes() throws android.os.RemoteException;
    public java.lang.String getPrimaryStorageUuid() throws android.os.RemoteException;
    public void setPrimaryStorageUuid(java.lang.String p0, android.content.pm.IPackageMoveObserver p1) throws android.os.RemoteException;
    public void benchmark(java.lang.String p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException;
    public void setDebugFlags(int p0, int p1) throws android.os.RemoteException;
    public void createUserKey(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void destroyUserKey(int p0) throws android.os.RemoteException;
    public void unlockUserKey(int p0, int p1, byte[] p2, byte[] p3) throws android.os.RemoteException;
    public void lockUserKey(int p0) throws android.os.RemoteException;
    public boolean isUserKeyUnlocked(int p0) throws android.os.RemoteException;
    public void prepareUserStorage(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void destroyUserStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isConvertibleToFBE() throws android.os.RemoteException;
    public void addUserKeyAuth(int p0, int p1, byte[] p2, byte[] p3) throws android.os.RemoteException;
    public void fixateNewestUserKeyAuth(int p0) throws android.os.RemoteException;
    public void fstrim(int p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException;
    public com.android.internal.os.AppFuseMount mountProxyFileDescriptorBridge() throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openProxyFileDescriptor(int p0, int p1, int p2) throws android.os.RemoteException;
    public long getCacheQuotaBytes(java.lang.String p0, int p1) throws android.os.RemoteException;
    public long getCacheSizeBytes(java.lang.String p0, int p1) throws android.os.RemoteException;
    public long getAllocatableBytes(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void allocateBytes(java.lang.String p0, long p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void runIdleMaintenance() throws android.os.RemoteException;
    public void abortIdleMaintenance() throws android.os.RemoteException;
    public void commitChanges() throws android.os.RemoteException;
    public boolean supportsCheckpoint() throws android.os.RemoteException;
    public void startCheckpoint(int p0) throws android.os.RemoteException;
    public boolean needsCheckpoint() throws android.os.RemoteException;
    public void abortChanges(java.lang.String p0, boolean p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.storage.IStorageManager {
        private static final java.lang.String DESCRIPTOR = "android.os.storage.IStorageManager";
        static final int TRANSACTION_registerListener = 1;
        static final int TRANSACTION_unregisterListener = 2;
        static final int TRANSACTION_shutdown = 20;
        static final int TRANSACTION_mountObb = 22;
        static final int TRANSACTION_unmountObb = 23;
        static final int TRANSACTION_isObbMounted = 24;
        static final int TRANSACTION_getMountedObbPath = 25;
        static final int TRANSACTION_decryptStorage = 27;
        static final int TRANSACTION_encryptStorage = 28;
        static final int TRANSACTION_changeEncryptionPassword = 29;
        static final int TRANSACTION_getVolumeList = 30;
        static final int TRANSACTION_getEncryptionState = 32;
        static final int TRANSACTION_verifyEncryptionPassword = 33;
        static final int TRANSACTION_mkdirs = 35;
        static final int TRANSACTION_getPasswordType = 36;
        static final int TRANSACTION_getPassword = 37;
        static final int TRANSACTION_clearPassword = 38;
        static final int TRANSACTION_setField = 39;
        static final int TRANSACTION_getField = 40;
        static final int TRANSACTION_lastMaintenance = 42;
        static final int TRANSACTION_runMaintenance = 43;
        static final int TRANSACTION_getDisks = 45;
        static final int TRANSACTION_getVolumes = 46;
        static final int TRANSACTION_getVolumeRecords = 47;
        static final int TRANSACTION_mount = 48;
        static final int TRANSACTION_unmount = 49;
        static final int TRANSACTION_format = 50;
        static final int TRANSACTION_partitionPublic = 51;
        static final int TRANSACTION_partitionPrivate = 52;
        static final int TRANSACTION_partitionMixed = 53;
        static final int TRANSACTION_setVolumeNickname = 54;
        static final int TRANSACTION_setVolumeUserFlags = 55;
        static final int TRANSACTION_forgetVolume = 56;
        static final int TRANSACTION_forgetAllVolumes = 57;
        static final int TRANSACTION_getPrimaryStorageUuid = 58;
        static final int TRANSACTION_setPrimaryStorageUuid = 59;
        static final int TRANSACTION_benchmark = 60;
        static final int TRANSACTION_setDebugFlags = 61;
        static final int TRANSACTION_createUserKey = 62;
        static final int TRANSACTION_destroyUserKey = 63;
        static final int TRANSACTION_unlockUserKey = 64;
        static final int TRANSACTION_lockUserKey = 65;
        static final int TRANSACTION_isUserKeyUnlocked = 66;
        static final int TRANSACTION_prepareUserStorage = 67;
        static final int TRANSACTION_destroyUserStorage = 68;
        static final int TRANSACTION_isConvertibleToFBE = 69;
        static final int TRANSACTION_addUserKeyAuth = 71;
        static final int TRANSACTION_fixateNewestUserKeyAuth = 72;
        static final int TRANSACTION_fstrim = 73;
        static final int TRANSACTION_mountProxyFileDescriptorBridge = 74;
        static final int TRANSACTION_openProxyFileDescriptor = 75;
        static final int TRANSACTION_getCacheQuotaBytes = 76;
        static final int TRANSACTION_getCacheSizeBytes = 77;
        static final int TRANSACTION_getAllocatableBytes = 78;
        static final int TRANSACTION_allocateBytes = 79;
        static final int TRANSACTION_runIdleMaintenance = 80;
        static final int TRANSACTION_abortIdleMaintenance = 81;
        static final int TRANSACTION_commitChanges = 84;
        static final int TRANSACTION_supportsCheckpoint = 85;
        static final int TRANSACTION_startCheckpoint = 86;
        static final int TRANSACTION_needsCheckpoint = 87;
        static final int TRANSACTION_abortChanges = 88;
        public Stub() { super(); }
        public static android.os.storage.IStorageManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.storage.IStorageManager p0) { return false; }
        public static android.os.storage.IStorageManager getDefaultImpl() { return null; }

        private static class Proxy implements android.os.storage.IStorageManager {
            private android.os.IBinder mRemote;
            public static android.os.storage.IStorageManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerListener(android.os.storage.IStorageEventListener p0) throws android.os.RemoteException {}
            public void unregisterListener(android.os.storage.IStorageEventListener p0) throws android.os.RemoteException {}
            public void shutdown(android.os.storage.IStorageShutdownObserver p0) throws android.os.RemoteException {}
            public void mountObb(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.storage.IObbActionListener p3, int p4, android.content.res.ObbInfo p5) throws android.os.RemoteException {}
            public void unmountObb(java.lang.String p0, boolean p1, android.os.storage.IObbActionListener p2, int p3) throws android.os.RemoteException {}
            public boolean isObbMounted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public java.lang.String getMountedObbPath(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int decryptStorage(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int encryptStorage(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int changeEncryptionPassword(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public android.os.storage.StorageVolume[] getVolumeList(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public int getEncryptionState() throws android.os.RemoteException { return 0; }
            public int verifyEncryptionPassword(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void mkdirs(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public int getPasswordType() throws android.os.RemoteException { return 0; }
            public java.lang.String getPassword() throws android.os.RemoteException { return null; }
            public void clearPassword() throws android.os.RemoteException {}
            public void setField(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.lang.String getField(java.lang.String p0) throws android.os.RemoteException { return null; }
            public long lastMaintenance() throws android.os.RemoteException { return 0L; }
            public void runMaintenance() throws android.os.RemoteException {}
            public android.os.storage.DiskInfo[] getDisks() throws android.os.RemoteException { return null; }
            public android.os.storage.VolumeInfo[] getVolumes(int p0) throws android.os.RemoteException { return null; }
            public android.os.storage.VolumeRecord[] getVolumeRecords(int p0) throws android.os.RemoteException { return null; }
            public void mount(java.lang.String p0) throws android.os.RemoteException {}
            public void unmount(java.lang.String p0) throws android.os.RemoteException {}
            public void format(java.lang.String p0) throws android.os.RemoteException {}
            public void partitionPublic(java.lang.String p0) throws android.os.RemoteException {}
            public void partitionPrivate(java.lang.String p0) throws android.os.RemoteException {}
            public void partitionMixed(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setVolumeNickname(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setVolumeUserFlags(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void forgetVolume(java.lang.String p0) throws android.os.RemoteException {}
            public void forgetAllVolumes() throws android.os.RemoteException {}
            public java.lang.String getPrimaryStorageUuid() throws android.os.RemoteException { return null; }
            public void setPrimaryStorageUuid(java.lang.String p0, android.content.pm.IPackageMoveObserver p1) throws android.os.RemoteException {}
            public void benchmark(java.lang.String p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
            public void setDebugFlags(int p0, int p1) throws android.os.RemoteException {}
            public void createUserKey(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void destroyUserKey(int p0) throws android.os.RemoteException {}
            public void unlockUserKey(int p0, int p1, byte[] p2, byte[] p3) throws android.os.RemoteException {}
            public void lockUserKey(int p0) throws android.os.RemoteException {}
            public boolean isUserKeyUnlocked(int p0) throws android.os.RemoteException { return false; }
            public void prepareUserStorage(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void destroyUserStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public boolean isConvertibleToFBE() throws android.os.RemoteException { return false; }
            public void addUserKeyAuth(int p0, int p1, byte[] p2, byte[] p3) throws android.os.RemoteException {}
            public void fixateNewestUserKeyAuth(int p0) throws android.os.RemoteException {}
            public void fstrim(int p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
            public com.android.internal.os.AppFuseMount mountProxyFileDescriptorBridge() throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openProxyFileDescriptor(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public long getCacheQuotaBytes(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
            public long getCacheSizeBytes(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
            public long getAllocatableBytes(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
            public void allocateBytes(java.lang.String p0, long p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void runIdleMaintenance() throws android.os.RemoteException {}
            public void abortIdleMaintenance() throws android.os.RemoteException {}
            public void commitChanges() throws android.os.RemoteException {}
            public boolean supportsCheckpoint() throws android.os.RemoteException { return false; }
            public void startCheckpoint(int p0) throws android.os.RemoteException {}
            public boolean needsCheckpoint() throws android.os.RemoteException { return false; }
            public void abortChanges(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.os.storage.IStorageManager {
        public Default() {}
        public void registerListener(android.os.storage.IStorageEventListener p0) throws android.os.RemoteException {}
        public void unregisterListener(android.os.storage.IStorageEventListener p0) throws android.os.RemoteException {}
        public void shutdown(android.os.storage.IStorageShutdownObserver p0) throws android.os.RemoteException {}
        public void mountObb(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.storage.IObbActionListener p3, int p4, android.content.res.ObbInfo p5) throws android.os.RemoteException {}
        public void unmountObb(java.lang.String p0, boolean p1, android.os.storage.IObbActionListener p2, int p3) throws android.os.RemoteException {}
        public boolean isObbMounted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public java.lang.String getMountedObbPath(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int decryptStorage(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int encryptStorage(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int changeEncryptionPassword(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public android.os.storage.StorageVolume[] getVolumeList(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public int getEncryptionState() throws android.os.RemoteException { return 0; }
        public int verifyEncryptionPassword(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void mkdirs(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public int getPasswordType() throws android.os.RemoteException { return 0; }
        public java.lang.String getPassword() throws android.os.RemoteException { return null; }
        public void clearPassword() throws android.os.RemoteException {}
        public void setField(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String getField(java.lang.String p0) throws android.os.RemoteException { return null; }
        public long lastMaintenance() throws android.os.RemoteException { return 0L; }
        public void runMaintenance() throws android.os.RemoteException {}
        public android.os.storage.DiskInfo[] getDisks() throws android.os.RemoteException { return null; }
        public android.os.storage.VolumeInfo[] getVolumes(int p0) throws android.os.RemoteException { return null; }
        public android.os.storage.VolumeRecord[] getVolumeRecords(int p0) throws android.os.RemoteException { return null; }
        public void mount(java.lang.String p0) throws android.os.RemoteException {}
        public void unmount(java.lang.String p0) throws android.os.RemoteException {}
        public void format(java.lang.String p0) throws android.os.RemoteException {}
        public void partitionPublic(java.lang.String p0) throws android.os.RemoteException {}
        public void partitionPrivate(java.lang.String p0) throws android.os.RemoteException {}
        public void partitionMixed(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setVolumeNickname(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setVolumeUserFlags(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void forgetVolume(java.lang.String p0) throws android.os.RemoteException {}
        public void forgetAllVolumes() throws android.os.RemoteException {}
        public java.lang.String getPrimaryStorageUuid() throws android.os.RemoteException { return null; }
        public void setPrimaryStorageUuid(java.lang.String p0, android.content.pm.IPackageMoveObserver p1) throws android.os.RemoteException {}
        public void benchmark(java.lang.String p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
        public void setDebugFlags(int p0, int p1) throws android.os.RemoteException {}
        public void createUserKey(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void destroyUserKey(int p0) throws android.os.RemoteException {}
        public void unlockUserKey(int p0, int p1, byte[] p2, byte[] p3) throws android.os.RemoteException {}
        public void lockUserKey(int p0) throws android.os.RemoteException {}
        public boolean isUserKeyUnlocked(int p0) throws android.os.RemoteException { return false; }
        public void prepareUserStorage(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void destroyUserStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public boolean isConvertibleToFBE() throws android.os.RemoteException { return false; }
        public void addUserKeyAuth(int p0, int p1, byte[] p2, byte[] p3) throws android.os.RemoteException {}
        public void fixateNewestUserKeyAuth(int p0) throws android.os.RemoteException {}
        public void fstrim(int p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
        public com.android.internal.os.AppFuseMount mountProxyFileDescriptorBridge() throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openProxyFileDescriptor(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public long getCacheQuotaBytes(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
        public long getCacheSizeBytes(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
        public long getAllocatableBytes(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
        public void allocateBytes(java.lang.String p0, long p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void runIdleMaintenance() throws android.os.RemoteException {}
        public void abortIdleMaintenance() throws android.os.RemoteException {}
        public void commitChanges() throws android.os.RemoteException {}
        public boolean supportsCheckpoint() throws android.os.RemoteException { return false; }
        public void startCheckpoint(int p0) throws android.os.RemoteException {}
        public boolean needsCheckpoint() throws android.os.RemoteException { return false; }
        public void abortChanges(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
