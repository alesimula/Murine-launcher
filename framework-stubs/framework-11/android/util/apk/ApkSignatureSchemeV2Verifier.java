package android.util.apk;

public class ApkSignatureSchemeV2Verifier {
    public static final int SF_ATTRIBUTE_ANDROID_APK_SIGNED_ID = 2;
    private static final int APK_SIGNATURE_SCHEME_V2_BLOCK_ID = 1896449818;
    private static final int STRIPPING_PROTECTION_ATTR_ID = -1091571699;
    public ApkSignatureSchemeV2Verifier() {}
    public static boolean hasSignature(java.lang.String p0) throws java.io.IOException { return false; }
    public static java.security.cert.X509Certificate[][] verify(java.lang.String p0) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    public static java.security.cert.X509Certificate[][] unsafeGetCertsWithoutVerification(java.lang.String p0) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    public static android.util.apk.ApkSignatureSchemeV2Verifier.VerifiedSigner verify(java.lang.String p0, boolean p1) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    private static android.util.apk.ApkSignatureSchemeV2Verifier.VerifiedSigner verify(java.io.RandomAccessFile p0, boolean p1) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    private static android.util.apk.SignatureInfo findSignature(java.io.RandomAccessFile p0) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    private static android.util.apk.ApkSignatureSchemeV2Verifier.VerifiedSigner verify(java.io.RandomAccessFile p0, android.util.apk.SignatureInfo p1, boolean p2) throws java.lang.SecurityException, java.io.IOException { return null; }
    private static java.security.cert.X509Certificate[] verifySigner(java.nio.ByteBuffer p0, java.util.Map<java.lang.Integer, byte[]> p1, java.security.cert.CertificateFactory p2) throws java.lang.SecurityException, java.io.IOException { return null; }
    private static void verifyAdditionalAttributes(java.nio.ByteBuffer p0) throws java.lang.SecurityException, java.io.IOException {}
    static byte[] getVerityRootHash(java.lang.String p0) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException { return null; }
    static byte[] generateApkVerity(java.lang.String p0, android.util.apk.ByteBufferFactory p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.security.DigestException, java.security.NoSuchAlgorithmException { return null; }
    static byte[] generateApkVerityRootHash(java.lang.String p0) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.security.DigestException, java.security.NoSuchAlgorithmException { return null; }

    public static class VerifiedSigner {
        public final java.security.cert.X509Certificate[][] certs = null;
        public final byte[] verityRootHash = null;
        public final byte[] digest = null;
        public VerifiedSigner(java.security.cert.X509Certificate[][] p0, byte[] p1, byte[] p2) {}
    }
}
