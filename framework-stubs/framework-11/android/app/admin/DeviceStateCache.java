package android.app.admin;

public abstract class DeviceStateCache {
    protected DeviceStateCache() {}
    public static android.app.admin.DeviceStateCache getInstance() { return null; }
    public abstract boolean isDeviceProvisioned();

    private static class EmptyDeviceStateCache extends android.app.admin.DeviceStateCache {
        private static final android.app.admin.DeviceStateCache.EmptyDeviceStateCache INSTANCE = null;
        private EmptyDeviceStateCache() { super(); }
        public boolean isDeviceProvisioned() { return false; }
    }
}
