package android.internal.aconfig.storage;

public class FlagTable {
    public FlagTable() {}
    public static android.internal.aconfig.storage.FlagTable fromBytes(java.nio.ByteBuffer p0) { return null; }
    public android.internal.aconfig.storage.FlagTable.Node get(int p0, java.lang.String p1) { return null; }
    public android.internal.aconfig.storage.FlagTable.Header getHeader() { return null; }

    public static class Header {
        public Header() {}
        public static android.internal.aconfig.storage.FlagTable.Header fromBytes(android.internal.aconfig.storage.ByteBufferReader p0) { return null; }
        public int getVersion() { return 0; }
        public java.lang.String getContainer() { return null; }
        public android.internal.aconfig.storage.FileType getFileType() { return null; }
        public int getFileSize() { return 0; }
        public int getNumFlags() { return 0; }
        public int getBucketOffset() { return 0; }
        public int getNodeOffset() { return 0; }
    }

    public static class Node {
        public Node() {}
        public static android.internal.aconfig.storage.FlagTable.Node fromBytes(android.internal.aconfig.storage.ByteBufferReader p0) { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getFlagName() { return null; }
        public android.internal.aconfig.storage.FlagType getFlagType() { return null; }
        public int getPackageId() { return 0; }
        public int getFlagIndex() { return 0; }
        public int getNextOffset() { return 0; }
    }
}
