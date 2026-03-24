package android.app.appsearch;

public final class StorageInfo implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.StorageInfo> CREATOR = null;
    StorageInfo() {}
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public final int describeContents() { return 0; }
    public int getAliveDocumentsCount() { return 0; }
    public int getAliveNamespacesCount() { return 0; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_blob_store")
    public int getBlobsCount() { return 0; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_blob_store")
    public long getBlobsSizeBytes() { return 0L; }
    public long getSizeBytes() { return 0L; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo.Builder setAliveDocumentsCount(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo.Builder setAliveNamespacesCount(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_blob_store")
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo.Builder setBlobsCount(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_blob_store")
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo.Builder setBlobsSizeBytes(long p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo.Builder setSizeBytes(long p0) { return null; }
    }
}
