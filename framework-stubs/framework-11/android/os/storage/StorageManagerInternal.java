package android.os.storage;

public abstract class StorageManagerInternal {
    public StorageManagerInternal() {}
    public abstract void addExternalStoragePolicy(android.os.storage.StorageManagerInternal.ExternalStorageMountPolicy p0);
    public abstract void onExternalStoragePolicyChanged(int p0, java.lang.String p1);
    public abstract int getExternalStorageMountMode(int p0, java.lang.String p1);
    public abstract boolean prepareStorageDirs(int p0, java.util.Set<java.lang.String> p1, java.lang.String p2);
    public abstract void addResetListener(android.os.storage.StorageManagerInternal.ResetListener p0);
    public abstract void onAppOpsChanged(int p0, int p1, java.lang.String p2, int p3, int p4);
    public abstract void resetUser(int p0);
    public abstract boolean hasLegacyExternalStorage(int p0);
    public abstract void prepareAppDataAfterInstall(java.lang.String p0, int p1);
    public abstract boolean isExternalStorageService(int p0);

    public static interface ExternalStorageMountPolicy {
        public int getMountMode(int p0, java.lang.String p1);
        public boolean hasExternalStorage(int p0, java.lang.String p1);
    }

    public static interface ResetListener {
        public void onReset(android.os.IVold p0);
    }
}
