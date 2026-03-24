package android.app.appsearch;

public class StorageInfo {
    private static final java.lang.String SIZE_BYTES_FIELD = "sizeBytes";
    private static final java.lang.String ALIVE_DOCUMENTS_COUNT = "aliveDocumentsCount";
    private static final java.lang.String ALIVE_NAMESPACES_COUNT = "aliveNamespacesCount";
    private final android.os.Bundle mBundle = null;
    StorageInfo(android.os.Bundle p0) {}
    public android.os.Bundle getBundle() { return null; }
    public long getSizeBytes() { return 0L; }
    public int getAliveDocumentsCount() { return 0; }
    public int getAliveNamespacesCount() { return 0; }

    public static final class Builder {
        private long mSizeBytes;
        private int mAliveDocumentsCount;
        private int mAliveNamespacesCount;
        public Builder() {}
        public android.app.appsearch.StorageInfo.Builder setSizeBytes(long p0) { return null; }
        public android.app.appsearch.StorageInfo.Builder setAliveDocumentsCount(int p0) { return null; }
        public android.app.appsearch.StorageInfo.Builder setAliveNamespacesCount(int p0) { return null; }
        public android.app.appsearch.StorageInfo build() { return null; }
    }
}
