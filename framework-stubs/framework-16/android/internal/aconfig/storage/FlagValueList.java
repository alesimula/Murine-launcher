package android.internal.aconfig.storage;

public class FlagValueList {
    public FlagValueList() {}
    public static android.internal.aconfig.storage.FlagValueList fromBytes(java.nio.ByteBuffer p0) { return null; }
    public boolean getBoolean(int p0) { return false; }
    public android.internal.aconfig.storage.FlagValueList.Header getHeader() { return null; }
    public int size() { return 0; }

    public static class Header {
        public Header() {}
        public static android.internal.aconfig.storage.FlagValueList.Header fromBytes(android.internal.aconfig.storage.ByteBufferReader p0) { return null; }
        public int getVersion() { return 0; }
        public java.lang.String getContainer() { return null; }
        public android.internal.aconfig.storage.FileType getFileType() { return null; }
        public int getFileSize() { return 0; }
        public int getNumFlags() { return 0; }
        public int getBooleanValueOffset() { return 0; }
    }
}
