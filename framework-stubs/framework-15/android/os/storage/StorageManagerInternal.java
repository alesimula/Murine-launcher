package android.os.storage;

public abstract class StorageManagerInternal {
    public StorageManagerInternal() {}
    public abstract int getExternalStorageMountMode(int p0, java.lang.String p1);
    public abstract boolean hasExternalStorageAccess(int p0, java.lang.String p1);
    public abstract boolean isFuseMounted(int p0);
    public abstract boolean prepareStorageDirs(int p0, java.util.Set<java.lang.String> p1, java.lang.String p2);
    public abstract void addResetListener(android.os.storage.StorageManagerInternal.ResetListener p0);
    public abstract void onAppOpsChanged(int p0, int p1, java.lang.String p2, int p3, int p4);
    public abstract void resetUser(int p0);
    public abstract boolean hasLegacyExternalStorage(int p0);
    public abstract void prepareAppDataAfterInstall(java.lang.String p0, int p1);
    public abstract boolean isExternalStorageService(int p0);
    public abstract void freeCache(java.lang.String p0, long p1);
    public abstract java.util.List<java.lang.String> getPrimaryVolumeIds();
    public abstract void markCeStoragePrepared(int p0);
    public abstract boolean isCeStoragePrepared(int p0);
    public abstract void registerCloudProviderChangeListener(android.os.storage.StorageManagerInternal.CloudProviderChangeListener p0);
    public abstract void prepareUserStorageForMove(java.lang.String p0, java.lang.String p1, java.util.List<android.content.pm.UserInfo> p2);
    public abstract android.os.IInstalld.IFsveritySetupAuthToken createFsveritySetupAuthToken(android.os.ParcelFileDescriptor p0, int p1) throws java.io.IOException;
    public abstract int enableFsverity(android.os.IInstalld.IFsveritySetupAuthToken p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException;
    @android.annotation.FlaggedApi("android.multiuser.enable_biometrics_to_unlock_private_space")
    public abstract void registerStorageLockEventListener(android.os.storage.ICeStorageLockEventListener p0);
    @android.annotation.FlaggedApi("android.multiuser.enable_biometrics_to_unlock_private_space")
    public abstract void unregisterStorageLockEventListener(android.os.storage.ICeStorageLockEventListener p0);

    public static interface CloudProviderChangeListener {
        public void onCloudProviderChanged(int p0, java.lang.String p1);
    }

    public static interface ResetListener {
        public void onReset(android.os.IVold p0);
    }
}
