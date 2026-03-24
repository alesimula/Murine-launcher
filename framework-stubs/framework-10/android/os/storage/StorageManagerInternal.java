package android.os.storage;

public abstract class StorageManagerInternal {
    public StorageManagerInternal() {}
    public abstract void addExternalStoragePolicy(android.os.storage.StorageManagerInternal.ExternalStorageMountPolicy p0);
    public abstract void onExternalStoragePolicyChanged(int p0, java.lang.String p1);
    public abstract int getExternalStorageMountMode(int p0, java.lang.String p1);
    public abstract void addResetListener(android.os.storage.StorageManagerInternal.ResetListener p0);
    public abstract void onAppOpsChanged(int p0, int p1, java.lang.String p2, int p3);

    public static interface ResetListener {
        public void onReset(android.os.IVold p0);
    }

    public static interface ExternalStorageMountPolicy {
        public int getMountMode(int p0, java.lang.String p1);
        public boolean hasExternalStorage(int p0, java.lang.String p1);
    }
}
