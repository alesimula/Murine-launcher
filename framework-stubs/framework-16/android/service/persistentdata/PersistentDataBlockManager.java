package android.service.persistentdata;

@android.annotation.FlaggedApi("android.security.frp_enforcement")
public class PersistentDataBlockManager {
    @android.annotation.SystemApi
    public static final int FLASH_LOCK_UNKNOWN = -1;
    @android.annotation.SystemApi
    public static final int FLASH_LOCK_UNLOCKED = 0;
    @android.annotation.SystemApi
    public static final int FLASH_LOCK_LOCKED = 1;
    public PersistentDataBlockManager(android.service.persistentdata.IPersistentDataBlockService p0) {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public int write(byte[] p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.Nullable
    public byte[] read() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_PDB_STATE")
    public int getDataBlockSize() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public long getMaximumDataBlockSize() { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OEM_UNLOCK_STATE")
    public void wipe() {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.OEM_UNLOCK_STATE")
    public void setOemUnlockEnabled(boolean p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_OEM_UNLOCK_STATE", "android.permission.OEM_UNLOCK_STATE"})
    public boolean getOemUnlockEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_OEM_UNLOCK_STATE", "android.permission.OEM_UNLOCK_STATE"})
    public int getFlashLockState() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    @android.annotation.RequiresPermission("android.permission.ACCESS_PDB_STATE")
    public java.lang.String getPersistentDataPackageName() { return null; }
    @android.annotation.FlaggedApi("android.security.frp_enforcement")
    public boolean isFactoryResetProtectionActive() { return false; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.frp_enforcement")
    @android.annotation.RequiresPermission("android.permission.CONFIGURE_FACTORY_RESET_PROTECTION")
    public boolean deactivateFactoryResetProtection(byte[] p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.frp_enforcement")
    @android.annotation.SuppressLint("RequiresPermission")
    public boolean setFactoryResetProtectionSecret(byte[] p0) { return false; }

    @android.annotation.SystemApi
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FlashLockState {
    }
}
