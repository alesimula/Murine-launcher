package android.app.admin;

public abstract class DevicePolicyCache {
    protected DevicePolicyCache() {}
    public static android.app.admin.DevicePolicyCache getInstance() { return null; }
    public abstract boolean getScreenCaptureDisabled(int p0);
    public abstract int getPasswordQuality(int p0);

    private static class EmptyDevicePolicyCache extends android.app.admin.DevicePolicyCache {
        private static final android.app.admin.DevicePolicyCache.EmptyDevicePolicyCache INSTANCE = null;
        private EmptyDevicePolicyCache() { super(); }
        public boolean getScreenCaptureDisabled(int p0) { return false; }
        public int getPasswordQuality(int p0) { return 0; }
    }
}
