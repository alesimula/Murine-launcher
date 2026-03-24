package android.util.apk;

abstract class ZipUtils {
    private static final int ZIP_EOCD_REC_MIN_SIZE = 22;
    private static final int ZIP_EOCD_REC_SIG = 101010256;
    private static final int ZIP_EOCD_CENTRAL_DIR_SIZE_FIELD_OFFSET = 12;
    private static final int ZIP_EOCD_CENTRAL_DIR_OFFSET_FIELD_OFFSET = 16;
    private static final int ZIP_EOCD_COMMENT_LENGTH_FIELD_OFFSET = 20;
    private static final int ZIP64_EOCD_LOCATOR_SIZE = 20;
    private static final int ZIP64_EOCD_LOCATOR_SIG_REVERSE_BYTE_ORDER = 1347094023;
    private static final int UINT16_MAX_VALUE = 65535;
    private ZipUtils() {}
    static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> findZipEndOfCentralDirectoryRecord(java.io.RandomAccessFile p0) throws java.io.IOException { return null; }
    private static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> findZipEndOfCentralDirectoryRecord(java.io.RandomAccessFile p0, int p1) throws java.io.IOException { return null; }
    private static int findZipEndOfCentralDirectoryRecord(java.nio.ByteBuffer p0) { return 0; }
    public static final boolean isZip64EndOfCentralDirectoryLocatorPresent(java.io.RandomAccessFile p0, long p1) throws java.io.IOException { return false; }
    public static long getZipEocdCentralDirectoryOffset(java.nio.ByteBuffer p0) { return 0L; }
    public static void setZipEocdCentralDirectoryOffset(java.nio.ByteBuffer p0, long p1) {}
    public static long getZipEocdCentralDirectorySizeBytes(java.nio.ByteBuffer p0) { return 0L; }
    private static void assertByteOrderLittleEndian(java.nio.ByteBuffer p0) {}
    private static int getUnsignedInt16(java.nio.ByteBuffer p0, int p1) { return 0; }
    private static long getUnsignedInt32(java.nio.ByteBuffer p0, int p1) { return 0L; }
    private static void setUnsignedInt32(java.nio.ByteBuffer p0, int p1, long p2) {}
}
