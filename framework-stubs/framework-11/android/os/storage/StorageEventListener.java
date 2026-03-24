package android.os.storage;

public class StorageEventListener {
    public StorageEventListener() {}
    public void onUsbMassStorageConnectionChanged(boolean p0) {}
    public void onStorageStateChanged(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void onVolumeStateChanged(android.os.storage.VolumeInfo p0, int p1, int p2) {}
    public void onVolumeRecordChanged(android.os.storage.VolumeRecord p0) {}
    public void onVolumeForgotten(java.lang.String p0) {}
    public void onDiskScanned(android.os.storage.DiskInfo p0, int p1) {}
    public void onDiskDestroyed(android.os.storage.DiskInfo p0) {}
}
