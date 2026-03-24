package android.os.image;

public class DynamicSystemManager {
    public DynamicSystemManager(android.os.image.IDynamicSystemService p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean startInstallation(java.lang.String p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public android.util.Pair<java.lang.Integer, android.os.image.DynamicSystemManager.Session> createPartition(java.lang.String p0, long p1, boolean p2) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean closePartition() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean finishInstallation() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public android.gsi.GsiProgress getInstallationProgress() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean abort() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean isInUse() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean isInstalled() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean isEnabled() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean remove() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean setEnable(boolean p0, boolean p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public long suggestScratchSize() { return 0L; }

    public class Session {
        @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
        public boolean setAshmem(android.os.ParcelFileDescriptor p0, long p1) { return false; }
        @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
        public boolean submitFromAshmem(int p0) { return false; }
        @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
        public boolean getAvbPublicKey(android.gsi.AvbPublicKey p0) { return false; }
        @android.annotation.RequiresPermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
        public boolean commit() { return false; }
    }
}
