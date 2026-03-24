package android.os.storage;

public class VolumeRecord implements android.os.Parcelable {
    public static final java.lang.String EXTRA_FS_UUID = "android.os.storage.extra.FS_UUID";
    public static final int USER_FLAG_INITED = 1;
    public static final int USER_FLAG_SNOOZED = 2;
    public final int type = 0;
    public final java.lang.String fsUuid = null;
    public java.lang.String partGuid;
    public java.lang.String nickname;
    public int userFlags;
    public long createdMillis;
    public long lastSeenMillis;
    public long lastTrimMillis;
    public long lastBenchMillis;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.os.storage.VolumeRecord> CREATOR = null;
    public VolumeRecord(int p0, java.lang.String p1) {}
    @android.annotation.UnsupportedAppUsage
    public VolumeRecord(android.os.Parcel p0) {}
    public int getType() { return 0; }
    public java.lang.String getFsUuid() { return null; }
    public java.lang.String getNormalizedFsUuid() { return null; }
    public java.lang.String getNickname() { return null; }
    public boolean isInited() { return false; }
    public boolean isSnoozed() { return false; }
    public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
    public android.os.storage.VolumeRecord clone() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
