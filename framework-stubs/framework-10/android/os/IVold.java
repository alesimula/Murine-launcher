package android.os;

public interface IVold extends android.os.IInterface {
    public static final int ENCRYPTION_FLAG_NO_UI = 4;
    public static final int ENCRYPTION_STATE_NONE = 1;
    public static final int ENCRYPTION_STATE_OK = 0;
    public static final int ENCRYPTION_STATE_ERROR_UNKNOWN = -1;
    public static final int ENCRYPTION_STATE_ERROR_INCOMPLETE = -2;
    public static final int ENCRYPTION_STATE_ERROR_INCONSISTENT = -3;
    public static final int ENCRYPTION_STATE_ERROR_CORRUPT = -4;
    public static final int FSTRIM_FLAG_DEEP_TRIM = 1;
    public static final int MOUNT_FLAG_PRIMARY = 1;
    public static final int MOUNT_FLAG_VISIBLE = 2;
    public static final int PARTITION_TYPE_PUBLIC = 0;
    public static final int PARTITION_TYPE_PRIVATE = 1;
    public static final int PARTITION_TYPE_MIXED = 2;
    public static final int PASSWORD_TYPE_PASSWORD = 0;
    public static final int PASSWORD_TYPE_DEFAULT = 1;
    public static final int PASSWORD_TYPE_PATTERN = 2;
    public static final int PASSWORD_TYPE_PIN = 3;
    public static final int STORAGE_FLAG_DE = 1;
    public static final int STORAGE_FLAG_CE = 2;
    public static final int REMOUNT_MODE_NONE = 0;
    public static final int REMOUNT_MODE_DEFAULT = 1;
    public static final int REMOUNT_MODE_READ = 2;
    public static final int REMOUNT_MODE_WRITE = 3;
    public static final int REMOUNT_MODE_LEGACY = 4;
    public static final int REMOUNT_MODE_INSTALLER = 5;
    public static final int REMOUNT_MODE_FULL = 6;
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
    public void monitor() throws android.os.RemoteException;
    public void reset() throws android.os.RemoteException;
    public void shutdown() throws android.os.RemoteException;
    public void onUserAdded(int p0, int p1) throws android.os.RemoteException;
    public void onUserRemoved(int p0) throws android.os.RemoteException;
    public void onUserStarted(int p0) throws android.os.RemoteException;
    public void onUserStopped(int p0) throws android.os.RemoteException;
    public void addAppIds(java.lang.String[] p0, int[] p1) throws android.os.RemoteException;
    public void addSandboxIds(int[] p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void onSecureKeyguardStateChanged(boolean p0) throws android.os.RemoteException;
    public void partition(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void forgetPartition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void mount(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void unmount(java.lang.String p0) throws android.os.RemoteException;
    public void format(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void benchmark(java.lang.String p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException;
    public void checkEncryption(java.lang.String p0) throws android.os.RemoteException;
    public void moveStorage(java.lang.String p0, java.lang.String p1, android.os.IVoldTaskListener p2) throws android.os.RemoteException;
    public void remountUid(int p0, int p1) throws android.os.RemoteException;
    public void mkdirs(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String createObb(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void destroyObb(java.lang.String p0) throws android.os.RemoteException;
    public void fstrim(int p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException;
    public void runIdleMaint(android.os.IVoldTaskListener p0) throws android.os.RemoteException;
    public void abortIdleMaint(android.os.IVoldTaskListener p0) throws android.os.RemoteException;
    public java.io.FileDescriptor mountAppFuse(int p0, int p1) throws android.os.RemoteException;
    public void unmountAppFuse(int p0, int p1) throws android.os.RemoteException;
    public void fdeCheckPassword(java.lang.String p0) throws android.os.RemoteException;
    public void fdeRestart() throws android.os.RemoteException;
    public int fdeComplete() throws android.os.RemoteException;
    public void fdeEnable(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void fdeChangePassword(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void fdeVerifyPassword(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String fdeGetField(java.lang.String p0) throws android.os.RemoteException;
    public void fdeSetField(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int fdeGetPasswordType() throws android.os.RemoteException;
    public java.lang.String fdeGetPassword() throws android.os.RemoteException;
    public void fdeClearPassword() throws android.os.RemoteException;
    public void fbeEnable() throws android.os.RemoteException;
    public void mountDefaultEncrypted() throws android.os.RemoteException;
    public void initUser0() throws android.os.RemoteException;
    public boolean isConvertibleToFbe() throws android.os.RemoteException;
    public void mountFstab(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void encryptFstab(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void createUserKey(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void destroyUserKey(int p0) throws android.os.RemoteException;
    public void addUserKeyAuth(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void fixateNewestUserKeyAuth(int p0) throws android.os.RemoteException;
    public void unlockUserKey(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void lockUserKey(int p0) throws android.os.RemoteException;
    public void prepareUserStorage(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void destroyUserStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void prepareSandboxForApp(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void destroySandboxForApp(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void startCheckpoint(int p0) throws android.os.RemoteException;
    public boolean needsCheckpoint() throws android.os.RemoteException;
    public boolean needsRollback() throws android.os.RemoteException;
    public void abortChanges(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void commitChanges() throws android.os.RemoteException;
    public void prepareCheckpoint() throws android.os.RemoteException;
    public void restoreCheckpoint(java.lang.String p0) throws android.os.RemoteException;
    public void restoreCheckpointPart(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void markBootAttempt() throws android.os.RemoteException;
    public boolean supportsCheckpoint() throws android.os.RemoteException;
    public boolean supportsBlockCheckpoint() throws android.os.RemoteException;
    public boolean supportsFileCheckpoint() throws android.os.RemoteException;
    public java.lang.String createStubVolume(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void destroyStubVolume(java.lang.String p0) throws android.os.RemoteException;
    public java.io.FileDescriptor openAppFuseFile(int p0, int p1, int p2, int p3) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IVold {
        private static final java.lang.String DESCRIPTOR = "android.os.IVold";
        static final int TRANSACTION_setListener = 1;
        static final int TRANSACTION_monitor = 2;
        static final int TRANSACTION_reset = 3;
        static final int TRANSACTION_shutdown = 4;
        static final int TRANSACTION_onUserAdded = 5;
        static final int TRANSACTION_onUserRemoved = 6;
        static final int TRANSACTION_onUserStarted = 7;
        static final int TRANSACTION_onUserStopped = 8;
        static final int TRANSACTION_addAppIds = 9;
        static final int TRANSACTION_addSandboxIds = 10;
        static final int TRANSACTION_onSecureKeyguardStateChanged = 11;
        static final int TRANSACTION_partition = 12;
        static final int TRANSACTION_forgetPartition = 13;
        static final int TRANSACTION_mount = 14;
        static final int TRANSACTION_unmount = 15;
        static final int TRANSACTION_format = 16;
        static final int TRANSACTION_benchmark = 17;
        static final int TRANSACTION_checkEncryption = 18;
        static final int TRANSACTION_moveStorage = 19;
        static final int TRANSACTION_remountUid = 20;
        static final int TRANSACTION_mkdirs = 21;
        static final int TRANSACTION_createObb = 22;
        static final int TRANSACTION_destroyObb = 23;
        static final int TRANSACTION_fstrim = 24;
        static final int TRANSACTION_runIdleMaint = 25;
        static final int TRANSACTION_abortIdleMaint = 26;
        static final int TRANSACTION_mountAppFuse = 27;
        static final int TRANSACTION_unmountAppFuse = 28;
        static final int TRANSACTION_fdeCheckPassword = 29;
        static final int TRANSACTION_fdeRestart = 30;
        static final int TRANSACTION_fdeComplete = 31;
        static final int TRANSACTION_fdeEnable = 32;
        static final int TRANSACTION_fdeChangePassword = 33;
        static final int TRANSACTION_fdeVerifyPassword = 34;
        static final int TRANSACTION_fdeGetField = 35;
        static final int TRANSACTION_fdeSetField = 36;
        static final int TRANSACTION_fdeGetPasswordType = 37;
        static final int TRANSACTION_fdeGetPassword = 38;
        static final int TRANSACTION_fdeClearPassword = 39;
        static final int TRANSACTION_fbeEnable = 40;
        static final int TRANSACTION_mountDefaultEncrypted = 41;
        static final int TRANSACTION_initUser0 = 42;
        static final int TRANSACTION_isConvertibleToFbe = 43;
        static final int TRANSACTION_mountFstab = 44;
        static final int TRANSACTION_encryptFstab = 45;
        static final int TRANSACTION_createUserKey = 46;
        static final int TRANSACTION_destroyUserKey = 47;
        static final int TRANSACTION_addUserKeyAuth = 48;
        static final int TRANSACTION_fixateNewestUserKeyAuth = 49;
        static final int TRANSACTION_unlockUserKey = 50;
        static final int TRANSACTION_lockUserKey = 51;
        static final int TRANSACTION_prepareUserStorage = 52;
        static final int TRANSACTION_destroyUserStorage = 53;
        static final int TRANSACTION_prepareSandboxForApp = 54;
        static final int TRANSACTION_destroySandboxForApp = 55;
        static final int TRANSACTION_startCheckpoint = 56;
        static final int TRANSACTION_needsCheckpoint = 57;
        static final int TRANSACTION_needsRollback = 58;
        static final int TRANSACTION_abortChanges = 59;
        static final int TRANSACTION_commitChanges = 60;
        static final int TRANSACTION_prepareCheckpoint = 61;
        static final int TRANSACTION_restoreCheckpoint = 62;
        static final int TRANSACTION_restoreCheckpointPart = 63;
        static final int TRANSACTION_markBootAttempt = 64;
        static final int TRANSACTION_supportsCheckpoint = 65;
        static final int TRANSACTION_supportsBlockCheckpoint = 66;
        static final int TRANSACTION_supportsFileCheckpoint = 67;
        static final int TRANSACTION_createStubVolume = 68;
        static final int TRANSACTION_destroyStubVolume = 69;
        static final int TRANSACTION_openAppFuseFile = 70;
        public Stub() { super(); }
        public static android.os.IVold asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IVold p0) { return false; }
        public static android.os.IVold getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IVold {
            private android.os.IBinder mRemote;
            public static android.os.IVold sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setListener(android.os.IVoldListener p0) throws android.os.RemoteException {}
            public void monitor() throws android.os.RemoteException {}
            public void reset() throws android.os.RemoteException {}
            public void shutdown() throws android.os.RemoteException {}
            public void onUserAdded(int p0, int p1) throws android.os.RemoteException {}
            public void onUserRemoved(int p0) throws android.os.RemoteException {}
            public void onUserStarted(int p0) throws android.os.RemoteException {}
            public void onUserStopped(int p0) throws android.os.RemoteException {}
            public void addAppIds(java.lang.String[] p0, int[] p1) throws android.os.RemoteException {}
            public void addSandboxIds(int[] p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void onSecureKeyguardStateChanged(boolean p0) throws android.os.RemoteException {}
            public void partition(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void forgetPartition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void mount(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void unmount(java.lang.String p0) throws android.os.RemoteException {}
            public void format(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void benchmark(java.lang.String p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
            public void checkEncryption(java.lang.String p0) throws android.os.RemoteException {}
            public void moveStorage(java.lang.String p0, java.lang.String p1, android.os.IVoldTaskListener p2) throws android.os.RemoteException {}
            public void remountUid(int p0, int p1) throws android.os.RemoteException {}
            public void mkdirs(java.lang.String p0) throws android.os.RemoteException {}
            public java.lang.String createObb(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public void destroyObb(java.lang.String p0) throws android.os.RemoteException {}
            public void fstrim(int p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
            public void runIdleMaint(android.os.IVoldTaskListener p0) throws android.os.RemoteException {}
            public void abortIdleMaint(android.os.IVoldTaskListener p0) throws android.os.RemoteException {}
            public java.io.FileDescriptor mountAppFuse(int p0, int p1) throws android.os.RemoteException { return null; }
            public void unmountAppFuse(int p0, int p1) throws android.os.RemoteException {}
            public void fdeCheckPassword(java.lang.String p0) throws android.os.RemoteException {}
            public void fdeRestart() throws android.os.RemoteException {}
            public int fdeComplete() throws android.os.RemoteException { return 0; }
            public void fdeEnable(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void fdeChangePassword(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void fdeVerifyPassword(java.lang.String p0) throws android.os.RemoteException {}
            public java.lang.String fdeGetField(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void fdeSetField(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public int fdeGetPasswordType() throws android.os.RemoteException { return 0; }
            public java.lang.String fdeGetPassword() throws android.os.RemoteException { return null; }
            public void fdeClearPassword() throws android.os.RemoteException {}
            public void fbeEnable() throws android.os.RemoteException {}
            public void mountDefaultEncrypted() throws android.os.RemoteException {}
            public void initUser0() throws android.os.RemoteException {}
            public boolean isConvertibleToFbe() throws android.os.RemoteException { return false; }
            public void mountFstab(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void encryptFstab(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void createUserKey(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void destroyUserKey(int p0) throws android.os.RemoteException {}
            public void addUserKeyAuth(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void fixateNewestUserKeyAuth(int p0) throws android.os.RemoteException {}
            public void unlockUserKey(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void lockUserKey(int p0) throws android.os.RemoteException {}
            public void prepareUserStorage(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void destroyUserStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void prepareSandboxForApp(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void destroySandboxForApp(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void startCheckpoint(int p0) throws android.os.RemoteException {}
            public boolean needsCheckpoint() throws android.os.RemoteException { return false; }
            public boolean needsRollback() throws android.os.RemoteException { return false; }
            public void abortChanges(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void commitChanges() throws android.os.RemoteException {}
            public void prepareCheckpoint() throws android.os.RemoteException {}
            public void restoreCheckpoint(java.lang.String p0) throws android.os.RemoteException {}
            public void restoreCheckpointPart(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void markBootAttempt() throws android.os.RemoteException {}
            public boolean supportsCheckpoint() throws android.os.RemoteException { return false; }
            public boolean supportsBlockCheckpoint() throws android.os.RemoteException { return false; }
            public boolean supportsFileCheckpoint() throws android.os.RemoteException { return false; }
            public java.lang.String createStubVolume(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
            public void destroyStubVolume(java.lang.String p0) throws android.os.RemoteException {}
            public java.io.FileDescriptor openAppFuseFile(int p0, int p1, int p2, int p3) throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.os.IVold {
        public Default() {}
        public void setListener(android.os.IVoldListener p0) throws android.os.RemoteException {}
        public void monitor() throws android.os.RemoteException {}
        public void reset() throws android.os.RemoteException {}
        public void shutdown() throws android.os.RemoteException {}
        public void onUserAdded(int p0, int p1) throws android.os.RemoteException {}
        public void onUserRemoved(int p0) throws android.os.RemoteException {}
        public void onUserStarted(int p0) throws android.os.RemoteException {}
        public void onUserStopped(int p0) throws android.os.RemoteException {}
        public void addAppIds(java.lang.String[] p0, int[] p1) throws android.os.RemoteException {}
        public void addSandboxIds(int[] p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void onSecureKeyguardStateChanged(boolean p0) throws android.os.RemoteException {}
        public void partition(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void forgetPartition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void mount(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void unmount(java.lang.String p0) throws android.os.RemoteException {}
        public void format(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void benchmark(java.lang.String p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
        public void checkEncryption(java.lang.String p0) throws android.os.RemoteException {}
        public void moveStorage(java.lang.String p0, java.lang.String p1, android.os.IVoldTaskListener p2) throws android.os.RemoteException {}
        public void remountUid(int p0, int p1) throws android.os.RemoteException {}
        public void mkdirs(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String createObb(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public void destroyObb(java.lang.String p0) throws android.os.RemoteException {}
        public void fstrim(int p0, android.os.IVoldTaskListener p1) throws android.os.RemoteException {}
        public void runIdleMaint(android.os.IVoldTaskListener p0) throws android.os.RemoteException {}
        public void abortIdleMaint(android.os.IVoldTaskListener p0) throws android.os.RemoteException {}
        public java.io.FileDescriptor mountAppFuse(int p0, int p1) throws android.os.RemoteException { return null; }
        public void unmountAppFuse(int p0, int p1) throws android.os.RemoteException {}
        public void fdeCheckPassword(java.lang.String p0) throws android.os.RemoteException {}
        public void fdeRestart() throws android.os.RemoteException {}
        public int fdeComplete() throws android.os.RemoteException { return 0; }
        public void fdeEnable(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void fdeChangePassword(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void fdeVerifyPassword(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String fdeGetField(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void fdeSetField(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public int fdeGetPasswordType() throws android.os.RemoteException { return 0; }
        public java.lang.String fdeGetPassword() throws android.os.RemoteException { return null; }
        public void fdeClearPassword() throws android.os.RemoteException {}
        public void fbeEnable() throws android.os.RemoteException {}
        public void mountDefaultEncrypted() throws android.os.RemoteException {}
        public void initUser0() throws android.os.RemoteException {}
        public boolean isConvertibleToFbe() throws android.os.RemoteException { return false; }
        public void mountFstab(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void encryptFstab(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void createUserKey(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void destroyUserKey(int p0) throws android.os.RemoteException {}
        public void addUserKeyAuth(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void fixateNewestUserKeyAuth(int p0) throws android.os.RemoteException {}
        public void unlockUserKey(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void lockUserKey(int p0) throws android.os.RemoteException {}
        public void prepareUserStorage(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void destroyUserStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void prepareSandboxForApp(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void destroySandboxForApp(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void startCheckpoint(int p0) throws android.os.RemoteException {}
        public boolean needsCheckpoint() throws android.os.RemoteException { return false; }
        public boolean needsRollback() throws android.os.RemoteException { return false; }
        public void abortChanges(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void commitChanges() throws android.os.RemoteException {}
        public void prepareCheckpoint() throws android.os.RemoteException {}
        public void restoreCheckpoint(java.lang.String p0) throws android.os.RemoteException {}
        public void restoreCheckpointPart(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void markBootAttempt() throws android.os.RemoteException {}
        public boolean supportsCheckpoint() throws android.os.RemoteException { return false; }
        public boolean supportsBlockCheckpoint() throws android.os.RemoteException { return false; }
        public boolean supportsFileCheckpoint() throws android.os.RemoteException { return false; }
        public java.lang.String createStubVolume(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
        public void destroyStubVolume(java.lang.String p0) throws android.os.RemoteException {}
        public java.io.FileDescriptor openAppFuseFile(int p0, int p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
