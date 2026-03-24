package android.app.appsearch;

public final class StorageInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.StorageInfo> CREATOR = null;
    StorageInfo() {}
    public final int describeContents() { return 0; }
    public int getAliveDocumentsCount() { return 0; }
    public int getAliveNamespacesCount() { return 0; }
    public long getSizeBytes() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo.Builder setAliveDocumentsCount(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo.Builder setAliveNamespacesCount(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo.Builder setSizeBytes(long p0) { return null; }
    }
}
