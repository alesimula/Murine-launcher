package android.drm;

public class DrmUtils {
    public DrmUtils() {}
    static byte[] readBytes(java.lang.String p0) throws java.io.IOException { return null; }
    static byte[] readBytes(java.io.File p0) throws java.io.IOException { return null; }
    static void writeToFile(java.lang.String p0, byte[] p1) throws java.io.IOException {}
    static void removeFile(java.lang.String p0) throws java.io.IOException {}
    private static void quietlyDispose(java.io.Closeable p0) {}
    public static android.drm.DrmUtils.ExtendedMetadataParser getExtendedMetadataParser(byte[] p0) { return null; }

    public static class ExtendedMetadataParser {
        java.util.HashMap<java.lang.String, java.lang.String> mMap;
        private int readByte(byte[] p0, int p1) { return 0; }
        private java.lang.String readMultipleBytes(byte[] p0, int p1, int p2) { return null; }
        private ExtendedMetadataParser(byte[] p0) {}
        public java.util.Iterator<java.lang.String> iterator() { return null; }
        public java.util.Iterator<java.lang.String> keyIterator() { return null; }
        public java.lang.String get(java.lang.String p0) { return null; }
    }
}
