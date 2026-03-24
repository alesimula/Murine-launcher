package android.os.storage;

public final class StorageVolume implements android.os.Parcelable {
    private final java.lang.String mId = null;
    private final java.io.File mPath = null;
    private final java.io.File mInternalPath = null;
    private final java.lang.String mDescription = null;
    private final boolean mPrimary = false;
    private final boolean mRemovable = false;
    private final boolean mEmulated = false;
    private final boolean mAllowMassStorage = false;
    private final long mMaxFileSize = 0L;
    private final android.os.UserHandle mOwner = null;
    private final java.util.UUID mUuid = null;
    private final java.lang.String mFsUuid = null;
    private final java.lang.String mState = null;
    public static final java.lang.String EXTRA_STORAGE_VOLUME = "android.os.storage.extra.STORAGE_VOLUME";
    public static final java.lang.String EXTRA_DIRECTORY_NAME = "android.os.storage.extra.DIRECTORY_NAME";
    private static final java.lang.String ACTION_OPEN_EXTERNAL_DIRECTORY = "android.os.storage.action.OPEN_EXTERNAL_DIRECTORY";
    public static final int STORAGE_ID_INVALID = 0;
    public static final int STORAGE_ID_PRIMARY = 65537;
    public static final android.os.Parcelable.Creator<android.os.storage.StorageVolume> CREATOR = null;
    public StorageVolume(java.lang.String p0, java.io.File p1, java.io.File p2, java.lang.String p3, boolean p4, boolean p5, boolean p6, boolean p7, long p8, android.os.UserHandle p9, java.util.UUID p10, java.lang.String p11, java.lang.String p12) {}
    private StorageVolume(android.os.Parcel p0) {}
    @android.annotation.SystemApi
    public java.lang.String getId() { return null; }
    public java.lang.String getPath() { return null; }
    public java.lang.String getInternalPath() { return null; }
    public java.io.File getPathFile() { return null; }
    public java.io.File getDirectory() { return null; }
    public java.lang.String getDescription(android.content.Context p0) { return null; }
    public boolean isPrimary() { return false; }
    public boolean isRemovable() { return false; }
    public boolean isEmulated() { return false; }
    public boolean allowMassStorage() { return false; }
    public long getMaxFileSize() { return 0L; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public android.os.UserHandle getOwner() { return null; }
    public java.util.UUID getStorageUuid() { return null; }
    public java.lang.String getUuid() { return null; }
    public java.lang.String getMediaStoreVolumeName() { return null; }
    public static java.lang.String normalizeUuid(java.lang.String p0) { return null; }
    public java.lang.String getNormalizedUuid() { return null; }
    public int getFatVolumeId() { return 0; }
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

    public static final class Builder {
        private java.lang.String mId;
        private java.io.File mPath;
        private java.lang.String mDescription;
        private boolean mPrimary;
        private boolean mRemovable;
        private boolean mEmulated;
        private android.os.UserHandle mOwner;
        private java.util.UUID mStorageUuid;
        private java.lang.String mUuid;
        private java.lang.String mState;
        @android.annotation.SuppressLint("StreamFiles")
        public Builder(java.lang.String p0, java.io.File p1, java.lang.String p2, android.os.UserHandle p3, java.lang.String p4) {}
        public android.os.storage.StorageVolume.Builder setStorageUuid(java.util.UUID p0) { return null; }
        public android.os.storage.StorageVolume.Builder setUuid(java.lang.String p0) { return null; }
        public android.os.storage.StorageVolume.Builder setPrimary(boolean p0) { return null; }
        public android.os.storage.StorageVolume.Builder setRemovable(boolean p0) { return null; }
        public android.os.storage.StorageVolume.Builder setEmulated(boolean p0) { return null; }
        public android.os.storage.StorageVolume build() { return null; }
    }
}
