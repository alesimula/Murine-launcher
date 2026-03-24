package android.os.storage;

public class VolumeInfo implements android.os.Parcelable {
    public static final java.lang.String ACTION_VOLUME_STATE_CHANGED = "android.os.storage.action.VOLUME_STATE_CHANGED";
    public static final java.lang.String EXTRA_VOLUME_ID = "android.os.storage.extra.VOLUME_ID";
    public static final java.lang.String EXTRA_VOLUME_STATE = "android.os.storage.extra.VOLUME_STATE";
    public static final java.lang.String ID_PRIVATE_INTERNAL = "private";
    public static final java.lang.String ID_EMULATED_INTERNAL = "emulated";
    @android.annotation.UnsupportedAppUsage
    public static final int TYPE_PUBLIC = 0;
    public static final int TYPE_PRIVATE = 1;
    @android.annotation.UnsupportedAppUsage
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
    public static final int MOUNT_FLAG_VISIBLE = 2;
    private static android.util.SparseArray<java.lang.String> sStateToEnvironment;
    private static android.util.ArrayMap<java.lang.String, java.lang.String> sEnvironmentToBroadcast;
    private static android.util.SparseIntArray sStateToDescrip;
    private static final java.util.Comparator<android.os.storage.VolumeInfo> sDescriptionComparator = null;
    public final java.lang.String id = null;
    @android.annotation.UnsupportedAppUsage
    public final int type = 0;
    @android.annotation.UnsupportedAppUsage
    public final android.os.storage.DiskInfo disk = null;
    public final java.lang.String partGuid = null;
    public int mountFlags;
    public int mountUserId;
    @android.annotation.UnsupportedAppUsage
    public int state;
    public java.lang.String fsType;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String fsUuid;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String fsLabel;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String path;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String internalPath;
    private static final java.lang.String DOCUMENT_AUTHORITY = "com.android.externalstorage.documents";
    private static final java.lang.String DOCUMENT_ROOT_PRIMARY_EMULATED = "primary";
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.os.storage.VolumeInfo> CREATOR = null;
    public VolumeInfo(java.lang.String p0, int p1, android.os.storage.DiskInfo p2, java.lang.String p3) {}
    @android.annotation.UnsupportedAppUsage
    public VolumeInfo(android.os.Parcel p0) {}
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getEnvironmentForState(int p0) { return null; }
    public static java.lang.String getBroadcastForEnvironment(java.lang.String p0) { return null; }
    public static java.lang.String getBroadcastForState(int p0) { return null; }
    public static java.util.Comparator<android.os.storage.VolumeInfo> getDescriptionComparator() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getId() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.os.storage.DiskInfo getDisk() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getDiskId() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getType() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getState() { return 0; }
    public int getStateDescription() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getFsUuid() { return null; }
    public java.lang.String getNormalizedFsUuid() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getMountUserId() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getDescription() { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean isMountedReadable() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isMountedWritable() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isPrimary() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isPrimaryPhysical() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isVisible() { return false; }
    public boolean isVisibleForUser(int p0) { return false; }
    public boolean isVisibleForRead(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isVisibleForWrite(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public java.io.File getPath() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.io.File getInternalPath() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.io.File getPathForUser(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.io.File getInternalPathForUser(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.os.storage.StorageVolume buildStorageVolume(android.content.Context p0, int p1, boolean p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static int buildStableMtpStorageId(java.lang.String p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
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
