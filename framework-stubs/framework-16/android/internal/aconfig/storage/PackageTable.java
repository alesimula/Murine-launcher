package android.internal.aconfig.storage;

public class PackageTable {
    public PackageTable() {}
    public static android.internal.aconfig.storage.PackageTable fromBytes(java.nio.ByteBuffer p0) { return null; }
    public android.internal.aconfig.storage.PackageTable.Node get(java.lang.String p0) { return null; }
    public java.util.List<java.lang.String> getPackageList() { return null; }
    public android.internal.aconfig.storage.PackageTable.Header getHeader() { return null; }

    public static class Header {
        public Header() {}
        public int getVersion() { return 0; }
        public java.lang.String getContainer() { return null; }
        public android.internal.aconfig.storage.FileType getFileType() { return null; }
        public int getFileSize() { return 0; }
        public int getNumPackages() { return 0; }
        public int getBucketOffset() { return 0; }
        public int getNodeOffset() { return 0; }
    }

    public static class Node {
        public Node() {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getPackageName() { return null; }
        public int getPackageId() { return 0; }
        public long getPackageFingerprint() { return 0L; }
        public boolean getRedactExportedReads() { return false; }
        public int getBooleanStartIndex() { return 0; }
        public int getNextOffset() { return 0; }
        public boolean hasPackageFingerprint() { return false; }
        public boolean hasRedactExportedReads() { return false; }
    }
}
