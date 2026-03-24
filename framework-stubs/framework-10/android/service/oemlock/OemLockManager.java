package android.service.oemlock;

@android.annotation.SystemApi
public class OemLockManager {
    private android.service.oemlock.IOemLockService mService;
    public OemLockManager(android.service.oemlock.IOemLockService p0) {}
    public java.lang.String getLockName() { return null; }
    public void setOemUnlockAllowedByCarrier(boolean p0, byte[] p1) {}
    public boolean isOemUnlockAllowedByCarrier() { return false; }
    public void setOemUnlockAllowedByUser(boolean p0) {}
    public boolean isOemUnlockAllowedByUser() { return false; }
    public boolean isOemUnlockAllowed() { return false; }
    public boolean isDeviceOemUnlocked() { return false; }
}
