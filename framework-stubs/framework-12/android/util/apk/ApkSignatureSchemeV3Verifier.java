package android.util.apk;

public class ApkSignatureSchemeV3Verifier {
    public static final int SF_ATTRIBUTE_ANDROID_APK_SIGNED_ID = 3;
    private static final int APK_SIGNATURE_SCHEME_V3_BLOCK_ID = -262969152;
    private static final int PROOF_OF_ROTATION_ATTR_ID = 1000370060;
    public ApkSignatureSchemeV3Verifier() {}
    public static boolean hasSignature(java.lang.String p0) throws java.io.IOException { return false; }
    public static android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner verify(java.lang.String p0) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    public static android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner unsafeGetCertsWithoutVerification(java.lang.String p0) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    private static android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner verify(java.lang.String p0, boolean p1) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    private static android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner verify(java.io.RandomAccessFile p0, boolean p1) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    public static android.util.apk.SignatureInfo findSignature(java.io.RandomAccessFile p0) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    private static android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner verify(java.io.RandomAccessFile p0, android.util.apk.SignatureInfo p1, boolean p2) throws java.lang.SecurityException, java.io.IOException { return null; }
    private static android.util.Pair<java.security.cert.X509Certificate[], android.util.apk.ApkSigningBlockUtils.VerifiedProofOfRotation> verifySigner(java.nio.ByteBuffer p0, java.util.Map<java.lang.Integer, byte[]> p1, java.security.cert.CertificateFactory p2) throws java.lang.SecurityException, java.io.IOException, android.util.apk.ApkSignatureSchemeV3Verifier.PlatformNotSupportedException { return null; }
    private static android.util.Pair<java.security.cert.X509Certificate[], android.util.apk.ApkSigningBlockUtils.VerifiedProofOfRotation> verifyAdditionalAttributes(java.nio.ByteBuffer p0, java.util.List<java.security.cert.X509Certificate> p1, java.security.cert.CertificateFactory p2) throws java.io.IOException { return null; }
    static byte[] getVerityRootHash(java.lang.String p0) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException { return null; }
    static byte[] generateApkVerity(java.lang.String p0, android.util.apk.ByteBufferFactory p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.security.DigestException, java.security.NoSuchAlgorithmException { return null; }
    static byte[] generateApkVerityRootHash(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.DigestException, java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }

    private static class PlatformNotSupportedException extends java.lang.Exception {
        PlatformNotSupportedException(java.lang.String p0) { super(); }
    }

    public static class VerifiedSigner {
        public final java.security.cert.X509Certificate[] certs = null;
        public final android.util.apk.ApkSigningBlockUtils.VerifiedProofOfRotation por = null;
        public final byte[] verityRootHash = null;
        public final java.util.Map<java.lang.Integer, byte[]> contentDigests = null;
        public VerifiedSigner(java.security.cert.X509Certificate[] p0, android.util.apk.ApkSigningBlockUtils.VerifiedProofOfRotation p1, byte[] p2, java.util.Map<java.lang.Integer, byte[]> p3) {}
    }
}
