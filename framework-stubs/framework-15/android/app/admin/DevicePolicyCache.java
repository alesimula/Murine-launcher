package android.app.admin;

public abstract class DevicePolicyCache {
    protected DevicePolicyCache() {}
    public static android.app.admin.DevicePolicyCache getInstance() { return null; }
    public abstract boolean isScreenCaptureAllowed(int p0);
    public abstract int getPasswordQuality(int p0);
    public abstract int getPermissionPolicy(int p0);
    public abstract int getContentProtectionPolicy(int p0);
    public abstract boolean canAdminGrantSensorsPermissions();
    public abstract java.util.Map<java.lang.String, java.lang.String> getLauncherShortcutOverrides();

    private static class EmptyDevicePolicyCache extends android.app.admin.DevicePolicyCache {
        public boolean isScreenCaptureAllowed(int p0) { return false; }
        public int getPasswordQuality(int p0) { return 0; }
        public int getPermissionPolicy(int p0) { return 0; }
        public int getContentProtectionPolicy(int p0) { return 0; }
        public boolean canAdminGrantSensorsPermissions() { return false; }
        public java.util.Map<java.lang.String, java.lang.String> getLauncherShortcutOverrides() { return null; }
    }
}
