package android.view.displayhash;

public final class DisplayHashManager {
    public DisplayHashManager() {}
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getSupportedHashAlgorithms() { return null; }
    @android.annotation.Nullable
    public android.view.displayhash.VerifiedDisplayHash verifyDisplayHash(android.view.displayhash.DisplayHash p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_FRAME_BUFFER")
    public void setDisplayHashThrottlingEnabled(boolean p0) {}
}
