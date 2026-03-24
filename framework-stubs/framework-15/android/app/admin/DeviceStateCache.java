package android.app.admin;

public abstract class DeviceStateCache {
    protected DeviceStateCache() {}
    public static android.app.admin.DeviceStateCache getInstance() { return null; }
    public abstract boolean isDeviceProvisioned();
    public abstract boolean isUserOrganizationManaged(int p0);
    public boolean hasAffiliationWithDevice(int p0) { return false; }

    private static class EmptyDeviceStateCache extends android.app.admin.DeviceStateCache {
        public boolean isDeviceProvisioned() { return false; }
        public boolean isUserOrganizationManaged(int p0) { return false; }
    }
}
