package android.os.storage;

public final class StorageVolume implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage
    private final java.lang.String mId = null;
    @android.annotation.UnsupportedAppUsage
    private final java.io.File mPath = null;
    private final java.io.File mInternalPath = null;
    @android.annotation.UnsupportedAppUsage
    private final java.lang.String mDescription = null;
    @android.annotation.UnsupportedAppUsage
    private final boolean mPrimary = false;
    @android.annotation.UnsupportedAppUsage
    private final boolean mRemovable = false;
    private final boolean mEmulated = false;
    private final boolean mAllowMassStorage = false;
    private final long mMaxFileSize = 0L;
    private final android.os.UserHandle mOwner = null;
    private final java.lang.String mFsUuid = null;
    private final java.lang.String mState = null;
    public static final java.lang.String EXTRA_STORAGE_VOLUME = "android.os.storage.extra.STORAGE_VOLUME";
    public static final java.lang.String EXTRA_DIRECTORY_NAME = "android.os.storage.extra.DIRECTORY_NAME";
    private static final java.lang.String ACTION_OPEN_EXTERNAL_DIRECTORY = "android.os.storage.action.OPEN_EXTERNAL_DIRECTORY";
    public static final int STORAGE_ID_INVALID = 0;
    public static final int STORAGE_ID_PRIMARY = 65537;
    public static final android.os.Parcelable.Creator<android.os.storage.StorageVolume> CREATOR = null;
    public StorageVolume(java.lang.String p0, java.io.File p1, java.io.File p2, java.lang.String p3, boolean p4, boolean p5, boolean p6, boolean p7, long p8, android.os.UserHandle p9, java.lang.String p10, java.lang.String p11) {}
    private StorageVolume(android.os.Parcel p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getId() { return null; }
    public java.lang.String getPath() { return null; }
    public java.lang.String getInternalPath() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.io.File getPathFile() { return null; }
    public java.lang.String getDescription(android.content.Context p0) { return null; }
    public boolean isPrimary() { return false; }
    public boolean isRemovable() { return false; }
    public boolean isEmulated() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean allowMassStorage() { return false; }
    @android.annotation.UnsupportedAppUsage
    public long getMaxFileSize() { return 0L; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public android.os.UserHandle getOwner() { return null; }
    public java.lang.String getUuid() { return null; }
    public static java.lang.String normalizeUuid(java.lang.String p0) { return null; }
    public java.lang.String getNormalizedUuid() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getFatVolumeId() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getUserLabel() { return null; }
    public java.lang.String getState() { return null; }
    @java.lang.Deprecated
    public android.content.Intent createAccessIntent(java.lang.String p0) { return null; }
    public android.content.Intent createOpenDocumentTreeIntent() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public java.lang.String dump() { return null; }
    public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
