package android.util.apk;

final class ApkSigningBlockUtils {
    private static final int CHUNK_SIZE_BYTES = 1048576;
    static final int SIGNATURE_RSA_PSS_WITH_SHA256 = 257;
    static final int SIGNATURE_RSA_PSS_WITH_SHA512 = 258;
    static final int SIGNATURE_RSA_PKCS1_V1_5_WITH_SHA256 = 259;
    static final int SIGNATURE_RSA_PKCS1_V1_5_WITH_SHA512 = 260;
    static final int SIGNATURE_ECDSA_WITH_SHA256 = 513;
    static final int SIGNATURE_ECDSA_WITH_SHA512 = 514;
    static final int SIGNATURE_DSA_WITH_SHA256 = 769;
    static final int SIGNATURE_VERITY_RSA_PKCS1_V1_5_WITH_SHA256 = 1057;
    static final int SIGNATURE_VERITY_ECDSA_WITH_SHA256 = 1059;
    static final int SIGNATURE_VERITY_DSA_WITH_SHA256 = 1061;
    static final int CONTENT_DIGEST_CHUNKED_SHA256 = 1;
    static final int CONTENT_DIGEST_CHUNKED_SHA512 = 2;
    static final int CONTENT_DIGEST_VERITY_CHUNKED_SHA256 = 3;
    private static final long APK_SIG_BLOCK_MAGIC_HI = 3617552046287187010L;
    private static final long APK_SIG_BLOCK_MAGIC_LO = 2334950737559900225L;
    private static final int APK_SIG_BLOCK_MIN_SIZE = 32;
    private ApkSigningBlockUtils() {}
    static android.util.apk.SignatureInfo findSignature(java.io.RandomAccessFile p0, int p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    static void verifyIntegrity(java.util.Map<java.lang.Integer, byte[]> p0, java.io.RandomAccessFile p1, android.util.apk.SignatureInfo p2) throws java.lang.SecurityException {}
    private static void verifyIntegrityFor1MbChunkBasedAlgorithm(java.util.Map<java.lang.Integer, byte[]> p0, java.io.FileDescriptor p1, android.util.apk.SignatureInfo p2) throws java.lang.SecurityException {}
    private static byte[][] computeContentDigestsPer1MbChunk(int[] p0, android.util.apk.DataSource[] p1) throws java.security.DigestException { return null; }
    static byte[] parseVerityDigestAndVerifySourceLength(byte[] p0, long p1, android.util.apk.SignatureInfo p2) throws java.lang.SecurityException { return null; }
    private static void verifyIntegrityForVerityBasedAlgorithm(byte[] p0, java.io.RandomAccessFile p1, android.util.apk.SignatureInfo p2) throws java.lang.SecurityException {}
    static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> getEocd(java.io.RandomAccessFile p0) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    static long getCentralDirOffset(java.nio.ByteBuffer p0, long p1) throws android.util.apk.SignatureNotFoundException { return 0L; }
    private static long getChunkCount(long p0) { return 0L; }
    static int compareSignatureAlgorithm(int p0, int p1) { return 0; }
    private static int compareContentDigestAlgorithm(int p0, int p1) { return 0; }
    static int getSignatureAlgorithmContentDigestAlgorithm(int p0) { return 0; }
    static java.lang.String getContentDigestAlgorithmJcaDigestAlgorithm(int p0) { return null; }
    private static int getContentDigestAlgorithmOutputSizeBytes(int p0) { return 0; }
    static java.lang.String getSignatureAlgorithmJcaKeyAlgorithm(int p0) { return null; }
    static android.util.Pair<java.lang.String, ? extends java.security.spec.AlgorithmParameterSpec> getSignatureAlgorithmJcaSignatureAlgorithm(int p0) { return null; }
    static java.nio.ByteBuffer sliceFromTo(java.nio.ByteBuffer p0, int p1, int p2) { return null; }
    static java.nio.ByteBuffer getByteBuffer(java.nio.ByteBuffer p0, int p1) throws java.nio.BufferUnderflowException { return null; }
    static java.nio.ByteBuffer getLengthPrefixedSlice(java.nio.ByteBuffer p0) throws java.io.IOException { return null; }
    static byte[] readLengthPrefixedByteArray(java.nio.ByteBuffer p0) throws java.io.IOException { return null; }
    static void setUnsignedInt32LittleEndian(int p0, byte[] p1, int p2) {}
    static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> findApkSigningBlock(java.io.RandomAccessFile p0, long p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    static java.nio.ByteBuffer findApkSignatureSchemeBlock(java.nio.ByteBuffer p0, int p1) throws android.util.apk.SignatureNotFoundException { return null; }
    private static void checkByteOrderLittleEndian(java.nio.ByteBuffer p0) {}

    private static class MultipleDigestDataDigester implements android.util.apk.DataDigester {
        private final java.security.MessageDigest[] mMds = null;
        MultipleDigestDataDigester(java.security.MessageDigest[] p0) {}
        public void consume(java.nio.ByteBuffer p0) {}
    }
}
