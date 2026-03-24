package android.os.storage;

public final class StorageVolume implements android.os.Parcelable {
    public static final java.lang.String EXTRA_STORAGE_VOLUME = "android.os.storage.extra.STORAGE_VOLUME";
    public static final java.lang.String EXTRA_DIRECTORY_NAME = "android.os.storage.extra.DIRECTORY_NAME";
    public static final int STORAGE_ID_INVALID = 0;
    public static final int STORAGE_ID_PRIMARY = 65537;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.storage.StorageVolume> CREATOR = null;
    public StorageVolume(java.lang.String p0, java.io.File p1, java.io.File p2, java.lang.String p3, boolean p4, boolean p5, boolean p6, boolean p7, boolean p8, long p9, android.os.UserHandle p10, java.util.UUID p11, java.lang.String p12, java.lang.String p13) {}
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    public java.lang.String getPath() { return null; }
    public java.lang.String getInternalPath() { return null; }
    public java.io.File getPathFile() { return null; }
    @android.annotation.Nullable
    public java.io.File getDirectory() { return null; }
    public java.lang.String getDescription(android.content.Context p0) { return null; }
    public boolean isPrimary() { return false; }
    public boolean isRemovable() { return false; }
    public boolean isEmulated() { return false; }
    @android.annotation.SystemApi
    public boolean isExternallyManaged() { return false; }
    public boolean allowMassStorage() { return false; }
    public long getMaxFileSize() { return 0L; }
    @android.annotation.SuppressLint("NewApi")
    @android.annotation.NonNull
    public android.os.UserHandle getOwner() { return null; }
    @android.annotation.Nullable
    public java.util.UUID getStorageUuid() { return null; }
    @android.annotation.Nullable
    public java.lang.String getUuid() { return null; }
    @android.annotation.Nullable
    public java.lang.String getMediaStoreVolumeName() { return null; }
    @android.annotation.Nullable
    public static java.lang.String normalizeUuid(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String getNormalizedUuid() { return null; }
    public int getFatVolumeId() { return 0; }
    public java.lang.String getUserLabel() { return null; }
    public java.lang.String getState() { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.content.Intent createAccessIntent(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public android.content.Intent createOpenDocumentTreeIntent() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public java.lang.String dump() { return null; }
    public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        @android.annotation.SuppressLint("StreamFiles")
        public Builder(java.lang.String p0, java.io.File p1, java.lang.String p2, android.os.UserHandle p3, java.lang.String p4) {}
        @android.annotation.NonNull
        public android.os.storage.StorageVolume.Builder setStorageUuid(java.util.UUID p0) { return null; }
        @android.annotation.NonNull
        public android.os.storage.StorageVolume.Builder setUuid(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.os.storage.StorageVolume.Builder setPrimary(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.os.storage.StorageVolume.Builder setRemovable(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.os.storage.StorageVolume.Builder setEmulated(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.os.storage.StorageVolume build() { return null; }
    }
}
