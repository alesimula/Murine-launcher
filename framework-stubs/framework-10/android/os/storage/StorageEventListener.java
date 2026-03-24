package android.os.storage;

public class StorageEventListener {
    public StorageEventListener() {}
    @android.annotation.UnsupportedAppUsage
    public void onUsbMassStorageConnectionChanged(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public void onStorageStateChanged(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    @android.annotation.UnsupportedAppUsage
    public void onVolumeStateChanged(android.os.storage.VolumeInfo p0, int p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    public void onVolumeRecordChanged(android.os.storage.VolumeRecord p0) {}
    @android.annotation.UnsupportedAppUsage
    public void onVolumeForgotten(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public void onDiskScanned(android.os.storage.DiskInfo p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public void onDiskDestroyed(android.os.storage.DiskInfo p0) {}
}
