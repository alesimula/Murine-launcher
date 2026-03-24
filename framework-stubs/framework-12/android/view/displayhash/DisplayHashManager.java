package android.view.displayhash;

public final class DisplayHashManager {
    private static final java.lang.String TAG = "DisplayHashManager";
    private final java.lang.Object mSupportedHashingAlgorithmLock = null;
    private static java.util.Set<java.lang.String> sSupportedHashAlgorithms;
    public DisplayHashManager() {}
    public java.util.Set<java.lang.String> getSupportedHashAlgorithms() { return null; }
    public android.view.displayhash.VerifiedDisplayHash verifyDisplayHash(android.view.displayhash.DisplayHash p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_FRAME_BUFFER")
    public void setDisplayHashThrottlingEnabled(boolean p0) {}
}
