package android.util.apk;

public abstract class SourceStampVerifier {
    private static final java.lang.String TAG = "SourceStampVerifier";
    private static final int APK_SIGNATURE_SCHEME_V2_BLOCK_ID = 1896449818;
    private static final int APK_SIGNATURE_SCHEME_V3_BLOCK_ID = -262969152;
    private static final int SOURCE_STAMP_BLOCK_ID = 1845461005;
    private static final int PROOF_OF_ROTATION_ATTR_ID = -1654455305;
    private static final int VERSION_JAR_SIGNATURE_SCHEME = 1;
    private static final int VERSION_APK_SIGNATURE_SCHEME_V2 = 2;
    private static final int VERSION_APK_SIGNATURE_SCHEME_V3 = 3;
    private static final java.lang.String SOURCE_STAMP_CERTIFICATE_HASH_ZIP_ENTRY_NAME = "stamp-cert-sha256";
    private SourceStampVerifier() {}
    public static android.util.apk.SourceStampVerificationResult verify(java.util.List<java.lang.String> p0) { return null; }
    public static android.util.apk.SourceStampVerificationResult verify(java.lang.String p0) { return null; }
    private static android.util.apk.SourceStampVerificationResult verify(java.io.RandomAccessFile p0, byte[] p1, byte[] p2) { return null; }
    private static android.util.apk.SourceStampVerificationResult verify(android.util.apk.SignatureInfo p0, java.util.Map<java.lang.Integer, byte[]> p1, byte[] p2) throws java.lang.SecurityException, java.io.IOException { return null; }
    private static java.security.cert.X509Certificate verifySourceStampCertificate(java.nio.ByteBuffer p0, byte[] p1) throws java.io.IOException { return null; }
    private static void verifySourceStampSignature(byte[] p0, java.security.cert.X509Certificate p1, java.nio.ByteBuffer p2) throws java.io.IOException {}
    private static java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, byte[]>> getSignatureSchemeApkContentDigests(java.io.RandomAccessFile p0, byte[] p1) throws java.io.IOException { return null; }
    private static java.util.Map<java.lang.Integer, byte[]> getApkContentDigestsFromSignatureBlock(java.nio.ByteBuffer p0) throws java.io.IOException { return null; }
    private static java.util.Map<java.lang.Integer, byte[]> getSignatureSchemeDigests(java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, byte[]>> p0) { return null; }
    private static java.util.List<android.util.Pair<java.lang.Integer, byte[]>> getApkDigests(java.util.Map<java.lang.Integer, byte[]> p0) { return null; }
    private static byte[] getSourceStampCertificateDigest(android.util.jar.StrictJarFile p0) throws java.io.IOException { return null; }
    private static byte[] getManifestBytes(android.util.jar.StrictJarFile p0) throws java.io.IOException { return null; }
    private static byte[] encodeApkContentDigests(java.util.List<android.util.Pair<java.lang.Integer, byte[]>> p0) { return null; }
    private static android.util.apk.ApkSigningBlockUtils.VerifiedProofOfRotation verifySourceStampAttributes(java.nio.ByteBuffer p0, java.security.cert.X509Certificate p1) throws java.io.IOException { return null; }
    private static byte[] computeSha256Digest(byte[] p0) { return null; }
    private static void closeApkJar(android.util.jar.StrictJarFile p0) {}
}
