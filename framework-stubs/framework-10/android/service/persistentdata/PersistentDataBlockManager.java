package android.service.persistentdata;

@android.annotation.SystemApi
public class PersistentDataBlockManager {
    private static final java.lang.String TAG = null;
    private android.service.persistentdata.IPersistentDataBlockService sService;
    public static final int FLASH_LOCK_UNKNOWN = -1;
    public static final int FLASH_LOCK_UNLOCKED = 0;
    public static final int FLASH_LOCK_LOCKED = 1;
    public PersistentDataBlockManager(android.service.persistentdata.IPersistentDataBlockService p0) {}
    @android.annotation.SuppressLint("Doclava125")
    public int write(byte[] p0) { return 0; }
    @android.annotation.SuppressLint("Doclava125")
    public byte[] read() { return null; }
    public int getDataBlockSize() { return 0; }
    @android.annotation.SuppressLint("Doclava125")
    public long getMaximumDataBlockSize() { return 0L; }
    public void wipe() {}
    public void setOemUnlockEnabled(boolean p0) {}
    public boolean getOemUnlockEnabled() { return false; }
    public int getFlashLockState() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FlashLockState {
    }
}
