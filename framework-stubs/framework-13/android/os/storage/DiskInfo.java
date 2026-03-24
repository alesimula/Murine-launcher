package android.os.storage;

public class DiskInfo implements android.os.Parcelable {
    public static final java.lang.String ACTION_DISK_SCANNED = "android.os.storage.action.DISK_SCANNED";
    public static final java.lang.String EXTRA_DISK_ID = "android.os.storage.extra.DISK_ID";
    public static final java.lang.String EXTRA_VOLUME_COUNT = "android.os.storage.extra.VOLUME_COUNT";
    public static final int FLAG_ADOPTABLE = 1;
    public static final int FLAG_DEFAULT_PRIMARY = 2;
    public static final int FLAG_SD = 4;
    public static final int FLAG_USB = 8;
    public static final int FLAG_STUB_VISIBLE = 64;
    public final java.lang.String id = null;
    public final int flags = 0;
    public long size;
    public java.lang.String label;
    public int volumeCount;
    public java.lang.String sysPath;
    public static final android.os.Parcelable.Creator<android.os.storage.DiskInfo> CREATOR = null;
    public DiskInfo(java.lang.String p0, int p1) {}
    public DiskInfo(android.os.Parcel p0) {}
    public java.lang.String getId() { return null; }
    public java.lang.String getDescription() { return null; }
    public java.lang.String getShortDescription() { return null; }
    public boolean isAdoptable() { return false; }
    public boolean isDefaultPrimary() { return false; }
    public boolean isSd() { return false; }
    public boolean isUsb() { return false; }
    public boolean isStubVisible() { return false; }
    public java.lang.String toString() { return null; }
    public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
    public android.os.storage.DiskInfo clone() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
