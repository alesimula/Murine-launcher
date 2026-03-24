package android.os;

public interface IVold extends android.os.IInterface {
    public static final int FSTRIM_FLAG_DEEP_TRIM = 1;
    public static final int MOUNT_FLAG_PRIMARY = 1;
    public static final int MOUNT_FLAG_VISIBLE_FOR_READ = 2;
    public static final int MOUNT_FLAG_VISIBLE_FOR_WRITE = 4;
    public static final int PARTITION_TYPE_PUBLIC = 0;
    public static final int PARTITION_TYPE_PRIVATE = 1;
    public static final int PARTITION_TYPE_MIXED = 2;
    public static final int STORAGE_FLAG_DE = 1;
    public static final int STORAGE_FLAG_CE = 2;
    public static final int REMOUNT_MODE_NONE = 0;
    public static final int REMOUNT_MODE_DEFAULT = 1;
    public static final int REMOUNT_MODE_INSTALLER = 2;
    public static final int REMOUNT_MODE_PASS_THROUGH = 3;
    public static final int REMOUNT_MODE_ANDROID_WRITABLE = 4;
    public static final int VOLUME_STATE_UNMOUNTED = 0;
    public static final int VOLUME_STATE_CHECKING = 1;
    public static final int VOLUME_STATE_MOUNTED = 2;
    public static final int VOLUME_STATE_MOUNTED_READ_ONLY = 3;
    public static final int VOLUME_STATE_FORMATTING = 4;
    public static final int VOLUME_STATE_EJECTING = 5;
    public static final int VOLUME_STATE_UNMOUNTABLE = 6;
    public static final int VOLUME_STATE_REMOVED = 7;
    public static final int VOLUME_STATE_BAD_REMOVAL = 8;
    public static final int VOLUME_TYPE_PUBLIC = 0;
    public static final int VOLUME_TYPE_PRIVATE = 1;
    public static final int VOLUME_TYPE_EMULATED = 2;
    public static final int VOLUME_TYPE_ASEC = 3;
    public static final int VOLUME_TYPE_OBB = 4;
    public static final int VOLUME_TYPE_STUB = 5;
    public void setListener(android.os.IVoldListener p0) throws android.os.RemoteException;
    public void abortFuse() throws android.os.RemoteException;
    public void monitor() throws android.os.RemoteException;
    public void reset() throws android.os.RemoteException;
    public void shutdown() throws android.os.RemoteException;
    public void onUserAdded(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onUserRemoved(int p0) throws android.os.RemoteException;
    public void onUserStarted(int p0) throws android.os.RemoteException;
    public void onUserStopped(int p0) throws android.os.RemoteException;
    public void addAppIds(java.lang.String[] p0, int[] p1) throws android.os.RemoteException;
    public void addSandboxIds(int[] p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void onSecureKeyguardStateChanged(boolean p0) throws android.os.RemoteException;
    public void partition(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void forgetPartition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void mount(java.lang.String p0, int p1, int p2, android.os.IVoldMountCallback p3) throws android.os.RemoteException;
    public void unmount(java.lang.String p0) throws android.os.RemoteException;
    public void format(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void benchmark(java.lang.String p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException;
    public void moveStorage(java.lang.String p0, java.lang.String p1, android.os.IVoldTaskListener p2) throws android.os.RemoteException;
    public void remountUid(int p0, int p1) throws android.os.RemoteException;
    public void remountAppStorageDirs(int p0, int p1, java.lang.String[] p2) throws android.os.RemoteException;
    public void unmountAppStorageDirs(int p0, int p1, java.lang.String[] p2) throws android.os.RemoteException;
    public void setupAppDir(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void fixupAppDir(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void ensureAppDirsCreated(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public java.lang.String createObb(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void destroyObb(java.lang.String p0) throws android.os.RemoteException;
    public void fstrim(int p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException;
    public void runIdleMaint(boolean p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException;
    public void abortIdleMaint(android.os.IVoldTaskListener p0) throws android.os.RemoteException;
    public int getStorageLifeTime() throws android.os.RemoteException;
    public void setGCUrgentPace(int p0, int p1, float p2, float p3, int p4, int p5, int p6) throws android.os.RemoteException;
    public void refreshLatestWrite() throws android.os.RemoteException;
    public int getWriteAmount() throws android.os.RemoteException;
    public java.io.FileDescriptor mountAppFuse(int p0, int p1) throws android.os.RemoteException;
    public void unmountAppFuse(int p0, int p1) throws android.os.RemoteException;
    public void fbeEnable() throws android.os.RemoteException;
    public void initUser0() throws android.os.RemoteException;
    public void mountFstab(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String[] p3) throws android.os.RemoteException;
    public void encryptFstab(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String p3, boolean p4, java.lang.String[] p5, boolean[] p6, long p7) throws android.os.RemoteException;
    public void setStorageBindingSeed(byte[] p0) throws android.os.RemoteException;
    public void createUserStorageKeys(int p0, boolean p1) throws android.os.RemoteException;
    public void destroyUserStorageKeys(int p0) throws android.os.RemoteException;
    public void setCeStorageProtection(int p0, byte[] p1) throws android.os.RemoteException;
    public int[] getUnlockedUsers() throws android.os.RemoteException;
    public void unlockCeStorage(int p0, byte[] p1) throws android.os.RemoteException;
    public void lockCeStorage(int p0) throws android.os.RemoteException;
    public void prepareUserStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void destroyUserStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void prepareSandboxForApp(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void destroySandboxForApp(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void startCheckpoint(int p0) throws android.os.RemoteException;
    public boolean needsCheckpoint() throws android.os.RemoteException;
    public boolean needsRollback() throws android.os.RemoteException;
    public boolean isCheckpointing() throws android.os.RemoteException;
    public void abortChanges(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void commitChanges() throws android.os.RemoteException;
    public void prepareCheckpoint() throws android.os.RemoteException;
    public void restoreCheckpoint(java.lang.String p0) throws android.os.RemoteException;
    public void restoreCheckpointPart(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void markBootAttempt() throws android.os.RemoteException;
    public boolean supportsCheckpoint() throws android.os.RemoteException;
    public boolean supportsBlockCheckpoint() throws android.os.RemoteException;
    public boolean supportsFileCheckpoint() throws android.os.RemoteException;
    public void resetCheckpoint() throws android.os.RemoteException;
    public void earlyBootEnded() throws android.os.RemoteException;
    public java.lang.String createStubVolume(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5) throws android.os.RemoteException;
    public void destroyStubVolume(java.lang.String p0) throws android.os.RemoteException;
    public java.io.FileDescriptor openAppFuseFile(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public boolean incFsEnabled() throws android.os.RemoteException;
    public android.os.incremental.IncrementalFileSystemControlParcel mountIncFs(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void unmountIncFs(java.lang.String p0) throws android.os.RemoteException;
    public void setIncFsMountOptions(android.os.incremental.IncrementalFileSystemControlParcel p0, boolean p1, boolean p2, java.lang.String p3) throws android.os.RemoteException;
    public void bindMount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void destroyDsuMetadataKey(java.lang.String p0) throws android.os.RemoteException;
    public long getStorageSize() throws android.os.RemoteException;
    public int getStorageRemainingLifetime() throws android.os.RemoteException;
    public int getWriteBoosterBufferSize() throws android.os.RemoteException;
    public int getWriteBoosterBufferAvailablePercent() throws android.os.RemoteException;
    public boolean setWriteBoosterBufferFlush(boolean p0) throws android.os.RemoteException;
    public boolean setWriteBoosterBufferOn(boolean p0) throws android.os.RemoteException;
    public int getWriteBoosterLifeTimeEstimate() throws android.os.RemoteException;

    public static class Default implements android.os.IVold {
        public Default() {}
        public void setListener(android.os.IVoldListener p0) throws android.os.RemoteException {}
        public void abortFuse() throws android.os.RemoteException {}
        public void monitor() throws android.os.RemoteException {}
        public void reset() throws android.os.RemoteException {}
        public void shutdown() throws android.os.RemoteException {}
        public void onUserAdded(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onUserRemoved(int p0) throws android.os.RemoteException {}
        public void onUserStarted(int p0) throws android.os.RemoteException {}
        public void onUserStopped(int p0) throws android.os.RemoteException {}
        public void addAppIds(java.lang.String[] p0, int[] p1) throws android.os.RemoteException {}
        public void addSandboxIds(int[] p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void onSecureKeyguardStateChanged(boolean p0) throws android.os.RemoteException {}
        public void partition(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void forgetPartition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void mount(java.lang.String p0, int p1, int p2, android.os.IVoldMountCallback p3) throws android.os.RemoteException {}
        public void unmount(java.lang.String p0) throws android.os.RemoteException {}
        public void format(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void benchmark(java.lang.String p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
        public void moveStorage(java.lang.String p0, java.lang.String p1, android.os.IVoldTaskListener p2) throws android.os.RemoteException {}
        public void remountUid(int p0, int p1) throws android.os.RemoteException {}
        public void remountAppStorageDirs(int p0, int p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void unmountAppStorageDirs(int p0, int p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void setupAppDir(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void fixupAppDir(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void ensureAppDirsCreated(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
        public java.lang.String createObb(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void destroyObb(java.lang.String p0) throws android.os.RemoteException {}
        public void fstrim(int p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
        public void runIdleMaint(boolean p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
        public void abortIdleMaint(android.os.IVoldTaskListener p0) throws android.os.RemoteException {}
        public int getStorageLifeTime() throws android.os.RemoteException { return 0; }
        public void setGCUrgentPace(int p0, int p1, float p2, float p3, int p4, int p5, int p6) throws android.os.RemoteException {}
        public void refreshLatestWrite() throws android.os.RemoteException {}
        public int getWriteAmount() throws android.os.RemoteException { return 0; }
        public java.io.FileDescriptor mountAppFuse(int p0, int p1) throws android.os.RemoteException { return null; }
        public void unmountAppFuse(int p0, int p1) throws android.os.RemoteException {}
        public void fbeEnable() throws android.os.RemoteException {}
        public void initUser0() throws android.os.RemoteException {}
        public void mountFstab(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String[] p3) throws android.os.RemoteException {}
        public void encryptFstab(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String p3, boolean p4, java.lang.String[] p5, boolean[] p6, long p7) throws android.os.RemoteException {}
        public void setStorageBindingSeed(byte[] p0) throws android.os.RemoteException {}
        public void createUserStorageKeys(int p0, boolean p1) throws android.os.RemoteException {}
        public void destroyUserStorageKeys(int p0) throws android.os.RemoteException {}
        public void setCeStorageProtection(int p0, byte[] p1) throws android.os.RemoteException {}
        public int[] getUnlockedUsers() throws android.os.RemoteException { return null; }
        public void unlockCeStorage(int p0, byte[] p1) throws android.os.RemoteException {}
        public void lockCeStorage(int p0) throws android.os.RemoteException {}
        public void prepareUserStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void destroyUserStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void prepareSandboxForApp(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void destroySandboxForApp(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void startCheckpoint(int p0) throws android.os.RemoteException {}
        public boolean needsCheckpoint() throws android.os.RemoteException { return false; }
        public boolean needsRollback() throws android.os.RemoteException { return false; }
        public boolean isCheckpointing() throws android.os.RemoteException { return false; }
        public void abortChanges(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void commitChanges() throws android.os.RemoteException {}
        public void prepareCheckpoint() throws android.os.RemoteException {}
        public void restoreCheckpoint(java.lang.String p0) throws android.os.RemoteException {}
        public void restoreCheckpointPart(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void markBootAttempt() throws android.os.RemoteException {}
        public boolean supportsCheckpoint() throws android.os.RemoteException { return false; }
        public boolean supportsBlockCheckpoint() throws android.os.RemoteException { return false; }
        public boolean supportsFileCheckpoint() throws android.os.RemoteException { return false; }
        public void resetCheckpoint() throws android.os.RemoteException {}
        public void earlyBootEnded() throws android.os.RemoteException {}
        public java.lang.String createStubVolume(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5) throws android.os.RemoteException { return null; }
        public void destroyStubVolume(java.lang.String p0) throws android.os.RemoteException {}
        public java.io.FileDescriptor openAppFuseFile(int p0, int p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public boolean incFsEnabled() throws android.os.RemoteException { return false; }
        public android.os.incremental.IncrementalFileSystemControlParcel mountIncFs(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public void unmountIncFs(java.lang.String p0) throws android.os.RemoteException {}
        public void setIncFsMountOptions(android.os.incremental.IncrementalFileSystemControlParcel p0, boolean p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
        public void bindMount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void destroyDsuMetadataKey(java.lang.String p0) throws android.os.RemoteException {}
        public long getStorageSize() throws android.os.RemoteException { return 0L; }
        public int getStorageRemainingLifetime() throws android.os.RemoteException { return 0; }
        public int getWriteBoosterBufferSize() throws android.os.RemoteException { return 0; }
        public int getWriteBoosterBufferAvailablePercent() throws android.os.RemoteException { return 0; }
        public boolean setWriteBoosterBufferFlush(boolean p0) throws android.os.RemoteException { return false; }
        public boolean setWriteBoosterBufferOn(boolean p0) throws android.os.RemoteException { return false; }
        public int getWriteBoosterLifeTimeEstimate() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IVold {
        public static final java.lang.String DESCRIPTOR = "android.os.IVold";
        static final int TRANSACTION_setListener = 1;
        static final int TRANSACTION_abortFuse = 2;
        static final int TRANSACTION_monitor = 3;
        static final int TRANSACTION_reset = 4;
        static final int TRANSACTION_shutdown = 5;
        static final int TRANSACTION_onUserAdded = 6;
        static final int TRANSACTION_onUserRemoved = 7;
        static final int TRANSACTION_onUserStarted = 8;
        static final int TRANSACTION_onUserStopped = 9;
        static final int TRANSACTION_addAppIds = 10;
        static final int TRANSACTION_addSandboxIds = 11;
        static final int TRANSACTION_onSecureKeyguardStateChanged = 12;
        static final int TRANSACTION_partition = 13;
        static final int TRANSACTION_forgetPartition = 14;
        static final int TRANSACTION_mount = 15;
        static final int TRANSACTION_unmount = 16;
        static final int TRANSACTION_format = 17;
        static final int TRANSACTION_benchmark = 18;
        static final int TRANSACTION_moveStorage = 19;
        static final int TRANSACTION_remountUid = 20;
        static final int TRANSACTION_remountAppStorageDirs = 21;
        static final int TRANSACTION_unmountAppStorageDirs = 22;
        static final int TRANSACTION_setupAppDir = 23;
        static final int TRANSACTION_fixupAppDir = 24;
        static final int TRANSACTION_ensureAppDirsCreated = 25;
        static final int TRANSACTION_createObb = 26;
        static final int TRANSACTION_destroyObb = 27;
        static final int TRANSACTION_fstrim = 28;
        static final int TRANSACTION_runIdleMaint = 29;
        static final int TRANSACTION_abortIdleMaint = 30;
        static final int TRANSACTION_getStorageLifeTime = 31;
        static final int TRANSACTION_setGCUrgentPace = 32;
        static final int TRANSACTION_refreshLatestWrite = 33;
        static final int TRANSACTION_getWriteAmount = 34;
        static final int TRANSACTION_mountAppFuse = 35;
        static final int TRANSACTION_unmountAppFuse = 36;
        static final int TRANSACTION_fbeEnable = 37;
        static final int TRANSACTION_initUser0 = 38;
        static final int TRANSACTION_mountFstab = 39;
        static final int TRANSACTION_encryptFstab = 40;
        static final int TRANSACTION_setStorageBindingSeed = 41;
        static final int TRANSACTION_createUserStorageKeys = 42;
        static final int TRANSACTION_destroyUserStorageKeys = 43;
        static final int TRANSACTION_setCeStorageProtection = 44;
        static final int TRANSACTION_getUnlockedUsers = 45;
        static final int TRANSACTION_unlockCeStorage = 46;
        static final int TRANSACTION_lockCeStorage = 47;
        static final int TRANSACTION_prepareUserStorage = 48;
        static final int TRANSACTION_destroyUserStorage = 49;
        static final int TRANSACTION_prepareSandboxForApp = 50;
        static final int TRANSACTION_destroySandboxForApp = 51;
        static final int TRANSACTION_startCheckpoint = 52;
        static final int TRANSACTION_needsCheckpoint = 53;
        static final int TRANSACTION_needsRollback = 54;
        static final int TRANSACTION_isCheckpointing = 55;
        static final int TRANSACTION_abortChanges = 56;
        static final int TRANSACTION_commitChanges = 57;
        static final int TRANSACTION_prepareCheckpoint = 58;
        static final int TRANSACTION_restoreCheckpoint = 59;
        static final int TRANSACTION_restoreCheckpointPart = 60;
        static final int TRANSACTION_markBootAttempt = 61;
        static final int TRANSACTION_supportsCheckpoint = 62;
        static final int TRANSACTION_supportsBlockCheckpoint = 63;
        static final int TRANSACTION_supportsFileCheckpoint = 64;
        static final int TRANSACTION_resetCheckpoint = 65;
        static final int TRANSACTION_earlyBootEnded = 66;
        static final int TRANSACTION_createStubVolume = 67;
        static final int TRANSACTION_destroyStubVolume = 68;
        static final int TRANSACTION_openAppFuseFile = 69;
        static final int TRANSACTION_incFsEnabled = 70;
        static final int TRANSACTION_mountIncFs = 71;
        static final int TRANSACTION_unmountIncFs = 72;
        static final int TRANSACTION_setIncFsMountOptions = 73;
        static final int TRANSACTION_bindMount = 74;
        static final int TRANSACTION_destroyDsuMetadataKey = 75;
        static final int TRANSACTION_getStorageSize = 76;
        static final int TRANSACTION_getStorageRemainingLifetime = 77;
        static final int TRANSACTION_getWriteBoosterBufferSize = 78;
        static final int TRANSACTION_getWriteBoosterBufferAvailablePercent = 79;
        static final int TRANSACTION_setWriteBoosterBufferFlush = 80;
        static final int TRANSACTION_setWriteBoosterBufferOn = 81;
        static final int TRANSACTION_getWriteBoosterLifeTimeEstimate = 82;
        public Stub() { super(); }
        public static android.os.IVold asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IVold {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setListener(android.os.IVoldListener p0) throws android.os.RemoteException {}
            public void abortFuse() throws android.os.RemoteException {}
            public void monitor() throws android.os.RemoteException {}
            public void reset() throws android.os.RemoteException {}
            public void shutdown() throws android.os.RemoteException {}
            public void onUserAdded(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onUserRemoved(int p0) throws android.os.RemoteException {}
            public void onUserStarted(int p0) throws android.os.RemoteException {}
            public void onUserStopped(int p0) throws android.os.RemoteException {}
            public void addAppIds(java.lang.String[] p0, int[] p1) throws android.os.RemoteException {}
            public void addSandboxIds(int[] p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void onSecureKeyguardStateChanged(boolean p0) throws android.os.RemoteException {}
            public void partition(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void forgetPartition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void mount(java.lang.String p0, int p1, int p2, android.os.IVoldMountCallback p3) throws android.os.RemoteException {}
            public void unmount(java.lang.String p0) throws android.os.RemoteException {}
            public void format(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void benchmark(java.lang.String p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
            public void moveStorage(java.lang.String p0, java.lang.String p1, android.os.IVoldTaskListener p2) throws android.os.RemoteException {}
            public void remountUid(int p0, int p1) throws android.os.RemoteException {}
            public void remountAppStorageDirs(int p0, int p1, java.lang.String[] p2) throws android.os.RemoteException {}
            public void unmountAppStorageDirs(int p0, int p1, java.lang.String[] p2) throws android.os.RemoteException {}
            public void setupAppDir(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void fixupAppDir(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void ensureAppDirsCreated(java.lang.String[] p0, int p1) throws android.os.RemoteException {}
            public java.lang.String createObb(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void destroyObb(java.lang.String p0) throws android.os.RemoteException {}
            public void fstrim(int p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
            public void runIdleMaint(boolean p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
            public void abortIdleMaint(android.os.IVoldTaskListener p0) throws android.os.RemoteException {}
            public int getStorageLifeTime() throws android.os.RemoteException { return 0; }
            public void setGCUrgentPace(int p0, int p1, float p2, float p3, int p4, int p5, int p6) throws android.os.RemoteException {}
            public void refreshLatestWrite() throws android.os.RemoteException {}
            public int getWriteAmount() throws android.os.RemoteException { return 0; }
            public java.io.FileDescriptor mountAppFuse(int p0, int p1) throws android.os.RemoteException { return null; }
            public void unmountAppFuse(int p0, int p1) throws android.os.RemoteException {}
            public void fbeEnable() throws android.os.RemoteException {}
            public void initUser0() throws android.os.RemoteException {}
            public void mountFstab(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String[] p3) throws android.os.RemoteException {}
            public void encryptFstab(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String p3, boolean p4, java.lang.String[] p5, boolean[] p6, long p7) throws android.os.RemoteException {}
            public void setStorageBindingSeed(byte[] p0) throws android.os.RemoteException {}
            public void createUserStorageKeys(int p0, boolean p1) throws android.os.RemoteException {}
            public void destroyUserStorageKeys(int p0) throws android.os.RemoteException {}
            public void setCeStorageProtection(int p0, byte[] p1) throws android.os.RemoteException {}
            public int[] getUnlockedUsers() throws android.os.RemoteException { return null; }
            public void unlockCeStorage(int p0, byte[] p1) throws android.os.RemoteException {}
            public void lockCeStorage(int p0) throws android.os.RemoteException {}
            public void prepareUserStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void destroyUserStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void prepareSandboxForApp(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void destroySandboxForApp(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void startCheckpoint(int p0) throws android.os.RemoteException {}
            public boolean needsCheckpoint() throws android.os.RemoteException { return false; }
            public boolean needsRollback() throws android.os.RemoteException { return false; }
            public boolean isCheckpointing() throws android.os.RemoteException { return false; }
            public void abortChanges(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void commitChanges() throws android.os.RemoteException {}
            public void prepareCheckpoint() throws android.os.RemoteException {}
            public void restoreCheckpoint(java.lang.String p0) throws android.os.RemoteException {}
            public void restoreCheckpointPart(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void markBootAttempt() throws android.os.RemoteException {}
            public boolean supportsCheckpoint() throws android.os.RemoteException { return false; }
            public boolean supportsBlockCheckpoint() throws android.os.RemoteException { return false; }
            public boolean supportsFileCheckpoint() throws android.os.RemoteException { return false; }
            public void resetCheckpoint() throws android.os.RemoteException {}
            public void earlyBootEnded() throws android.os.RemoteException {}
            public java.lang.String createStubVolume(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5) throws android.os.RemoteException { return null; }
            public void destroyStubVolume(java.lang.String p0) throws android.os.RemoteException {}
            public java.io.FileDescriptor openAppFuseFile(int p0, int p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public boolean incFsEnabled() throws android.os.RemoteException { return false; }
            public android.os.incremental.IncrementalFileSystemControlParcel mountIncFs(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public void unmountIncFs(java.lang.String p0) throws android.os.RemoteException {}
            public void setIncFsMountOptions(android.os.incremental.IncrementalFileSystemControlParcel p0, boolean p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
            public void bindMount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void destroyDsuMetadataKey(java.lang.String p0) throws android.os.RemoteException {}
            public long getStorageSize() throws android.os.RemoteException { return 0L; }
            public int getStorageRemainingLifetime() throws android.os.RemoteException { return 0; }
            public int getWriteBoosterBufferSize() throws android.os.RemoteException { return 0; }
            public int getWriteBoosterBufferAvailablePercent() throws android.os.RemoteException { return 0; }
            public boolean setWriteBoosterBufferFlush(boolean p0) throws android.os.RemoteException { return false; }
            public boolean setWriteBoosterBufferOn(boolean p0) throws android.os.RemoteException { return false; }
            public int getWriteBoosterLifeTimeEstimate() throws android.os.RemoteException { return 0; }
        }
    }
}
