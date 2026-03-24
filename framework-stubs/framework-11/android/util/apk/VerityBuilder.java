package android.util.apk;

public abstract class VerityBuilder {
    private static final int CHUNK_SIZE_BYTES = 4096;
    private static final int DIGEST_SIZE_BYTES = 32;
    private static final int FSVERITY_HEADER_SIZE_BYTES = 64;
    private static final int ZIP_EOCD_CENTRAL_DIR_OFFSET_FIELD_SIZE = 4;
    private static final int ZIP_EOCD_CENTRAL_DIR_OFFSET_FIELD_OFFSET = 16;
    private static final java.lang.String JCA_DIGEST_ALGORITHM = "SHA-256";
    private static final byte[] DEFAULT_SALT = null;
    private static final int MMAP_REGION_SIZE_BYTES = 1048576;
    private VerityBuilder() {}
    public static android.util.apk.VerityBuilder.VerityResult generateApkVerityTree(java.io.RandomAccessFile p0, android.util.apk.SignatureInfo p1, android.util.apk.ByteBufferFactory p2) throws java.io.IOException, java.lang.SecurityException, java.security.NoSuchAlgorithmException, java.security.DigestException { return null; }
    private static android.util.apk.VerityBuilder.VerityResult generateVerityTreeInternal(java.io.RandomAccessFile p0, android.util.apk.ByteBufferFactory p1, android.util.apk.SignatureInfo p2) throws java.io.IOException, java.lang.SecurityException, java.security.NoSuchAlgorithmException, java.security.DigestException { return null; }
    static void generateApkVerityFooter(java.io.RandomAccessFile p0, android.util.apk.SignatureInfo p1, java.nio.ByteBuffer p2) throws java.io.IOException {}
    static byte[] generateApkVerityRootHash(java.io.RandomAccessFile p0, java.nio.ByteBuffer p1, android.util.apk.SignatureInfo p2) throws java.security.NoSuchAlgorithmException, java.security.DigestException, java.io.IOException { return null; }
    static byte[] generateApkVerity(java.lang.String p0, android.util.apk.ByteBufferFactory p1, android.util.apk.SignatureInfo p2) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.security.DigestException, java.security.NoSuchAlgorithmException { return null; }
    private static void consumeByChunk(android.util.apk.DataDigester p0, android.util.apk.DataSource p1, int p2) throws java.io.IOException, java.security.DigestException {}
    private static void generateFsVerityDigestAtLeafLevel(java.io.RandomAccessFile p0, java.nio.ByteBuffer p1) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.DigestException {}
    private static void generateApkVerityDigestAtLeafLevel(java.io.RandomAccessFile p0, android.util.apk.SignatureInfo p1, byte[] p2, java.nio.ByteBuffer p3) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.DigestException {}
    private static byte[] generateVerityTreeInternal(java.io.RandomAccessFile p0, android.util.apk.SignatureInfo p1, byte[] p2, int[] p3, java.nio.ByteBuffer p4) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.DigestException { return null; }
    private static java.nio.ByteBuffer generateApkVerityHeader(java.nio.ByteBuffer p0, long p1, byte[] p2) { return null; }
    private static java.nio.ByteBuffer generateApkVerityExtensions(java.nio.ByteBuffer p0, long p1, long p2, long p3) { return null; }
    private static int[] calculateVerityLevelOffset(long p0) { return null; }
    private static void assertSigningBlockAlignedAndHasFullPages(android.util.apk.SignatureInfo p0) {}
    private static java.nio.ByteBuffer slice(java.nio.ByteBuffer p0, int p1, int p2) { return null; }
    private static void skip(java.nio.ByteBuffer p0, int p1) {}
    private static long divideRoundup(long p0, long p1) { return 0L; }

    private static class BufferedDigester implements android.util.apk.DataDigester {
        private static final int BUFFER_SIZE = 4096;
        private int mBytesDigestedSinceReset;
        private final java.nio.ByteBuffer mOutput = null;
        private final java.security.MessageDigest mMd = null;
        private final byte[] mDigestBuffer = null;
        private final byte[] mSalt = null;
        private BufferedDigester(byte[] p0, java.nio.ByteBuffer p1) throws java.security.NoSuchAlgorithmException {}
        public void consume(java.nio.ByteBuffer p0) throws java.security.DigestException {}
        public void assertEmptyBuffer() throws java.security.DigestException {}
        private void fillUpLastOutputChunk() {}
    }

    public static class VerityResult {
        public final java.nio.ByteBuffer verityData = null;
        public final int merkleTreeSize = 0;
        public final byte[] rootHash = null;
        private VerityResult(java.nio.ByteBuffer p0, int p1, byte[] p2) {}
    }
}
