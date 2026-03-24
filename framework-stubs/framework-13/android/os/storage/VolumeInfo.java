package android.os.storage;

public class VolumeInfo implements android.os.Parcelable {
    public static final java.lang.String ACTION_VOLUME_STATE_CHANGED = "android.os.storage.action.VOLUME_STATE_CHANGED";
    public static final java.lang.String EXTRA_VOLUME_ID = "android.os.storage.extra.VOLUME_ID";
    public static final java.lang.String EXTRA_VOLUME_STATE = "android.os.storage.extra.VOLUME_STATE";
    public static final java.lang.String ID_PRIVATE_INTERNAL = "private";
    public static final java.lang.String ID_EMULATED_INTERNAL = "emulated";
    public static final int TYPE_PUBLIC = 0;
    public static final int TYPE_PRIVATE = 1;
    public static final int TYPE_EMULATED = 2;
    public static final int TYPE_ASEC = 3;
    public static final int TYPE_OBB = 4;
    public static final int TYPE_STUB = 5;
    public static final int STATE_UNMOUNTED = 0;
    public static final int STATE_CHECKING = 1;
    public static final int STATE_MOUNTED = 2;
    public static final int STATE_MOUNTED_READ_ONLY = 3;
    public static final int STATE_FORMATTING = 4;
    public static final int STATE_EJECTING = 5;
    public static final int STATE_UNMOUNTABLE = 6;
    public static final int STATE_REMOVED = 7;
    public static final int STATE_BAD_REMOVAL = 8;
    public static final int MOUNT_FLAG_PRIMARY = 1;
    public static final int MOUNT_FLAG_VISIBLE_FOR_READ = 2;
    public static final int MOUNT_FLAG_VISIBLE_FOR_WRITE = 4;
    public final java.lang.String id = null;
    public final int type = 0;
    public final android.os.storage.DiskInfo disk = null;
    public final java.lang.String partGuid = null;
    public int mountFlags;
    public int mountUserId;
    public int state;
    public java.lang.String fsType;
    public java.lang.String fsUuid;
    public java.lang.String fsLabel;
    public java.lang.String path;
    public java.lang.String internalPath;
    public static final android.os.Parcelable.Creator<android.os.storage.VolumeInfo> CREATOR = null;
    public VolumeInfo(java.lang.String p0, int p1, android.os.storage.DiskInfo p2, java.lang.String p3) {}
    public VolumeInfo(android.os.Parcel p0) {}
    public VolumeInfo(android.os.storage.VolumeInfo p0) {}
    public static java.lang.String getEnvironmentForState(int p0) { return null; }
    public static java.lang.String getBroadcastForEnvironment(java.lang.String p0) { return null; }
    public static java.lang.String getBroadcastForState(int p0) { return null; }
    public static java.util.Comparator<android.os.storage.VolumeInfo> getDescriptionComparator() { return null; }
    public java.lang.String getId() { return null; }
    public android.os.storage.DiskInfo getDisk() { return null; }
    public java.lang.String getDiskId() { return null; }
    public int getType() { return 0; }
    public int getState() { return 0; }
    public int getStateDescription() { return 0; }
    public java.lang.String getFsUuid() { return null; }
    public java.lang.String getNormalizedFsUuid() { return null; }
    public int getMountUserId() { return 0; }
    public java.lang.String getDescription() { return null; }
    public boolean isMountedReadable() { return false; }
    public boolean isMountedWritable() { return false; }
    public boolean isPrimary() { return false; }
    public boolean isPrimaryPhysical() { return false; }
    public boolean isVisible() { return false; }
    public boolean isVisibleForUser(int p0) { return false; }
    public boolean isPrimaryEmulatedForUser(int p0) { return false; }
    public boolean isVisibleForRead(int p0) { return false; }
    public boolean isVisibleForWrite(int p0) { return false; }
    public java.io.File getPath() { return null; }
    public java.io.File getInternalPath() { return null; }
    public java.io.File getPathForUser(int p0) { return null; }
    public java.io.File getInternalPathForUser(int p0) { return null; }
    public android.os.storage.StorageVolume buildStorageVolume(android.content.Context p0, int p1, boolean p2) { return null; }
    public static int buildStableMtpStorageId(java.lang.String p0) { return 0; }
    public android.content.Intent buildBrowseIntent() { return null; }
    public android.content.Intent buildBrowseIntentForUser(int p0) { return null; }
    public java.lang.String toString() { return null; }
    public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
    public android.os.storage.VolumeInfo clone() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
