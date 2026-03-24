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

    public static interface ResetListener {
        public void onReset(android.os.IVold p0);
    }
}
