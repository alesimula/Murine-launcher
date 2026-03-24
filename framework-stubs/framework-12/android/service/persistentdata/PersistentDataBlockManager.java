package android.service.persistentdata;

@android.annotation.SystemApi
public class PersistentDataBlockManager {
    private static final java.lang.String TAG = null;
    private android.service.persistentdata.IPersistentDataBlockService sService;
    public static final int FLASH_LOCK_UNKNOWN = -1;
    public static final int FLASH_LOCK_UNLOCKED = 0;
    public static final int FLASH_LOCK_LOCKED = 1;
    public PersistentDataBlockManager(android.service.persistentdata.IPersistentDataBlockService p0) {}
    @android.annotation.SuppressLint("RequiresPermission")
    public int write(byte[] p0) { return 0; }
    @android.annotation.SuppressLint("RequiresPermission")
    public byte[] read() { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_PDB_STATE")
    public int getDataBlockSize() { return 0; }
    @android.annotation.SuppressLint("RequiresPermission")
    public long getMaximumDataBlockSize() { return 0L; }
    @android.annotation.RequiresPermission("android.permission.OEM_UNLOCK_STATE")
    public void wipe() {}
    @android.annotation.RequiresPermission("android.permission.OEM_UNLOCK_STATE")
    public void setOemUnlockEnabled(boolean p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_OEM_UNLOCK_STATE", "android.permission.OEM_UNLOCK_STATE"})
    public boolean getOemUnlockEnabled() { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_OEM_UNLOCK_STATE", "android.permission.OEM_UNLOCK_STATE"})
    public int getFlashLockState() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FlashLockState {
    }
}
