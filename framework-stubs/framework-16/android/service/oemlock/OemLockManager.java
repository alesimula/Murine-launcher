package android.service.oemlock;

@android.annotation.SystemApi
public class OemLockManager {
    public OemLockManager(android.service.oemlock.IOemLockService p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_CARRIER_OEM_UNLOCK_STATE")
    @android.annotation.Nullable
    public java.lang.String getLockName() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_CARRIER_OEM_UNLOCK_STATE")
    public void setOemUnlockAllowedByCarrier(boolean p0, byte[] p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_CARRIER_OEM_UNLOCK_STATE")
    public boolean isOemUnlockAllowedByCarrier() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_USER_OEM_UNLOCK_STATE")
    public void setOemUnlockAllowedByUser(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_USER_OEM_UNLOCK_STATE")
    public boolean isOemUnlockAllowedByUser() { return false; }
    public boolean isOemUnlockAllowed() { return false; }
    public boolean isDeviceOemUnlocked() { return false; }
}
