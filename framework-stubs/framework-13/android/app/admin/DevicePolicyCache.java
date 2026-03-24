package android.app.admin;

public abstract class DevicePolicyCache {
    protected DevicePolicyCache() {}
    public static android.app.admin.DevicePolicyCache getInstance() { return null; }
    public abstract boolean isScreenCaptureAllowed(int p0);
    public abstract int getPasswordQuality(int p0);
    public abstract int getPermissionPolicy(int p0);
    public abstract boolean canAdminGrantSensorsPermissionsForUser(int p0);

    private static class EmptyDevicePolicyCache extends android.app.admin.DevicePolicyCache {
        public boolean isScreenCaptureAllowed(int p0) { return false; }
        public int getPasswordQuality(int p0) { return 0; }
        public int getPermissionPolicy(int p0) { return 0; }
        public boolean canAdminGrantSensorsPermissionsForUser(int p0) { return false; }
    }
}
