package android.security;

public class NetworkSecurityPolicy {
    public static android.security.NetworkSecurityPolicy getInstance() { return null; }
    public boolean isCleartextTrafficPermitted() { return false; }
    public boolean isCleartextTrafficPermitted(java.lang.String p0) { return false; }
    public void setCleartextTrafficPermitted(boolean p0) {}
    public void handleTrustStorageUpdate() {}
    public static android.security.net.config.ApplicationConfig getApplicationConfigForPackage(android.content.Context p0, java.lang.String p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
}
