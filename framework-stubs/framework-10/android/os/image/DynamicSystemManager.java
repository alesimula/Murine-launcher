package android.os.image;

public class DynamicSystemManager {
    private static final java.lang.String TAG = "DynamicSystemManager";
    private final android.os.image.IDynamicSystemService mService = null;
    public DynamicSystemManager(android.os.image.IDynamicSystemService p0) {}
    public android.os.image.DynamicSystemManager.Session startInstallation(long p0, long p1) { return null; }
    public android.gsi.GsiProgress getInstallationProgress() { return null; }
    public boolean abort() { return false; }
    public boolean isInUse() { return false; }
    public boolean isInstalled() { return false; }
    public boolean isEnabled() { return false; }
    public boolean remove() { return false; }
    public boolean setEnable(boolean p0) { return false; }

    public class Session {
        private Session(android.os.image.DynamicSystemManager p0) {}
        public boolean write(byte[] p0) { return false; }
        public boolean commit() { return false; }
    }
}
