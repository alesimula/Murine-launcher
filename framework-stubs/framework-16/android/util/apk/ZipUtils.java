package android.util.apk;

abstract class ZipUtils {
    static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> findZipEndOfCentralDirectoryRecord(java.io.RandomAccessFile p0) throws java.io.IOException { return null; }
    public static final boolean isZip64EndOfCentralDirectoryLocatorPresent(java.io.RandomAccessFile p0, long p1) throws java.io.IOException { return false; }
    public static long getZipEocdCentralDirectoryOffset(java.nio.ByteBuffer p0) { return 0L; }
    public static void setZipEocdCentralDirectoryOffset(java.nio.ByteBuffer p0, long p1) {}
    public static long getZipEocdCentralDirectorySizeBytes(java.nio.ByteBuffer p0) { return 0L; }
}
