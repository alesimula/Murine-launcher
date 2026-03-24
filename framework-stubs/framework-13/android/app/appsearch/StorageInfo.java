package android.app.appsearch;

public class StorageInfo {
    StorageInfo() {}
    public long getSizeBytes() { return 0L; }
    public int getAliveDocumentsCount() { return 0; }
    public int getAliveNamespacesCount() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo.Builder setSizeBytes(long p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo.Builder setAliveDocumentsCount(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo.Builder setAliveNamespacesCount(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.StorageInfo build() { return null; }
    }
}
