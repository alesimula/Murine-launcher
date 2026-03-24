package android.util.apk;

public class ApkSignatureSchemeV3Verifier {
    public static final int SF_ATTRIBUTE_ANDROID_APK_SIGNED_ID = 3;
    static final int APK_SIGNATURE_SCHEME_V3_BLOCK_ID = -262969152;
    static final int APK_SIGNATURE_SCHEME_V31_BLOCK_ID = 462663009;
    public static boolean hasSignature(java.lang.String p0) throws java.io.IOException { return false; }
    public static android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner verify(java.lang.String p0) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    public static android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner unsafeGetCertsWithoutVerification(java.lang.String p0) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    public static android.util.apk.SignatureInfo findSignature(java.io.RandomAccessFile p0) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    static byte[] getVerityRootHash(java.lang.String p0) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException { return null; }
    static byte[] generateApkVerity(java.lang.String p0, android.util.apk.ByteBufferFactory p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.security.DigestException, java.security.NoSuchAlgorithmException { return null; }

    private static class PlatformNotSupportedException extends java.lang.Exception {
        PlatformNotSupportedException(java.lang.String p0) { super(); }
    }

    public static class VerifiedSigner {
        public final java.security.cert.X509Certificate[] certs = null;
        public final android.util.apk.ApkSigningBlockUtils.VerifiedProofOfRotation por = null;
        public final byte[] verityRootHash = null;
        public final java.util.Map<java.lang.Integer, byte[]> contentDigests = null;
        public final int blockId = 0;
        public VerifiedSigner(java.security.cert.X509Certificate[] p0, android.util.apk.ApkSigningBlockUtils.VerifiedProofOfRotation p1, byte[] p2, java.util.Map<java.lang.Integer, byte[]> p3, int p4) {}
    }
}
