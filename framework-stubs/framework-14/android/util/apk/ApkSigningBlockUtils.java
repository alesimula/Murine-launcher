package android.util.apk;

public final class ApkSigningBlockUtils {
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
    public static final int CONTENT_DIGEST_CHUNKED_SHA256 = 1;
    public static final int CONTENT_DIGEST_CHUNKED_SHA512 = 2;
    public static final int CONTENT_DIGEST_VERITY_CHUNKED_SHA256 = 3;
    public static final int CONTENT_DIGEST_SHA256 = 4;
    static android.util.apk.SignatureInfo findSignature(java.io.RandomAccessFile p0, int p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    static void verifyIntegrity(java.util.Map<java.lang.Integer, byte[]> p0, java.io.RandomAccessFile p1, android.util.apk.SignatureInfo p2) throws java.lang.SecurityException {}
    static boolean isSupportedSignatureAlgorithm(int p0) { return false; }
    public static byte[][] computeContentDigestsPer1MbChunk(int[] p0, java.io.FileDescriptor p1, android.util.apk.SignatureInfo p2) throws java.security.DigestException { return null; }
    static byte[] parseVerityDigestAndVerifySourceLength(byte[] p0, long p1, android.util.apk.SignatureInfo p2) throws java.lang.SecurityException { return null; }
    static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> getEocd(java.io.RandomAccessFile p0) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    static long getCentralDirOffset(java.nio.ByteBuffer p0, long p1) throws android.util.apk.SignatureNotFoundException { return 0L; }
    static int compareSignatureAlgorithm(int p0, int p1) { return 0; }
    static int getSignatureAlgorithmContentDigestAlgorithm(int p0) { return 0; }
    static java.lang.String getContentDigestAlgorithmJcaDigestAlgorithm(int p0) { return null; }
    static java.lang.String getSignatureAlgorithmJcaKeyAlgorithm(int p0) { return null; }
    static android.util.Pair<java.lang.String, ? extends java.security.spec.AlgorithmParameterSpec> getSignatureAlgorithmJcaSignatureAlgorithm(int p0) { return null; }
    static java.nio.ByteBuffer sliceFromTo(java.nio.ByteBuffer p0, int p1, int p2) { return null; }
    static java.nio.ByteBuffer getByteBuffer(java.nio.ByteBuffer p0, int p1) throws java.nio.BufferUnderflowException { return null; }
    static java.nio.ByteBuffer getLengthPrefixedSlice(java.nio.ByteBuffer p0) throws java.io.IOException { return null; }
    static byte[] readLengthPrefixedByteArray(java.nio.ByteBuffer p0) throws java.io.IOException { return null; }
    static void setUnsignedInt32LittleEndian(int p0, byte[] p1, int p2) {}
    static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> findApkSigningBlock(java.io.RandomAccessFile p0, long p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    static java.nio.ByteBuffer findApkSignatureSchemeBlock(java.nio.ByteBuffer p0, int p1) throws android.util.apk.SignatureNotFoundException { return null; }
    static android.util.apk.ApkSigningBlockUtils.VerifiedProofOfRotation verifyProofOfRotationStruct(java.nio.ByteBuffer p0, java.security.cert.CertificateFactory p1) throws java.lang.SecurityException, java.io.IOException { return null; }

    private static class MultipleDigestDataDigester implements android.util.apk.DataDigester {
        MultipleDigestDataDigester(java.security.MessageDigest[] p0) {}
        public void consume(java.nio.ByteBuffer p0) {}
    }

    public static class VerifiedProofOfRotation {
        public final java.util.List<java.security.cert.X509Certificate> certs = null;
        public final java.util.List<java.lang.Integer> flagsList = null;
        public VerifiedProofOfRotation(java.util.List<java.security.cert.X509Certificate> p0, java.util.List<java.lang.Integer> p1) {}
    }
}
