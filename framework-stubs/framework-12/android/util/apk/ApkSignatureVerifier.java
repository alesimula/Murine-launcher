package android.util.apk;

public class ApkSignatureVerifier {
    private static final java.util.concurrent.atomic.AtomicReference<byte[]> sBuffer = null;
    public ApkSignatureVerifier() {}
    public static android.content.pm.PackageParser.SigningDetails verify(java.lang.String p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public static android.content.pm.PackageParser.SigningDetails unsafeGetCertsWithoutVerification(java.lang.String p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private static android.content.pm.PackageParser.SigningDetails verifySignatures(java.lang.String p0, int p1, boolean p2) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public static android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests verifySignaturesInternal(java.lang.String p0, int p1, boolean p2) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private static android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests verifyV3AndBelowSignatures(java.lang.String p0, int p1, boolean p2) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private static android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests verifyV4Signature(java.lang.String p0, int p1, boolean p2) throws android.util.apk.SignatureNotFoundException, android.content.pm.PackageParser.PackageParserException { return null; }
    private static android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests verifyV3Signature(java.lang.String p0, boolean p1) throws android.util.apk.SignatureNotFoundException, android.content.pm.PackageParser.PackageParserException { return null; }
    private static android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests verifyV2Signature(java.lang.String p0, boolean p1) throws android.util.apk.SignatureNotFoundException, android.content.pm.PackageParser.PackageParserException { return null; }
    private static android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests verifyV1Signature(java.lang.String p0, boolean p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private static java.security.cert.Certificate[][] loadCertificates(android.util.jar.StrictJarFile p0, java.util.zip.ZipEntry p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private static void readFullyIgnoringContents(java.io.InputStream p0) throws java.io.IOException {}
    private static android.content.pm.Signature[] convertToSignatures(java.security.cert.Certificate[][] p0) throws java.security.cert.CertificateEncodingException { return null; }
    private static void closeQuietly(android.util.jar.StrictJarFile p0) {}
    public static int getMinimumSignatureSchemeVersionForTargetSdk(int p0) { return 0; }
    public static byte[] getVerityRootHash(java.lang.String p0) throws java.io.IOException, java.lang.SecurityException { return null; }
    public static byte[] generateApkVerity(java.lang.String p0, android.util.apk.ByteBufferFactory p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.security.DigestException, java.security.NoSuchAlgorithmException { return null; }
    public static byte[] generateApkVerityRootHash(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.DigestException, java.io.IOException { return null; }

    public static class Result {
        public final java.security.cert.Certificate[][] certs = null;
        public final android.content.pm.Signature[] sigs = null;
        public final int signatureSchemeVersion = 0;
        public Result(java.security.cert.Certificate[][] p0, android.content.pm.Signature[] p1, int p2) {}
    }

    public static class SigningDetailsWithDigests {
        public final android.content.pm.PackageParser.SigningDetails signingDetails = null;
        public final java.util.Map<java.lang.Integer, byte[]> contentDigests = null;
        SigningDetailsWithDigests(android.content.pm.PackageParser.SigningDetails p0, java.util.Map<java.lang.Integer, byte[]> p1) {}
    }
}
