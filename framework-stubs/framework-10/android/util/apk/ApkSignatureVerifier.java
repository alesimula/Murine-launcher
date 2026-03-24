package android.util.apk;

public class ApkSignatureVerifier {
    private static final java.util.concurrent.atomic.AtomicReference<byte[]> sBuffer = null;
    public ApkSignatureVerifier() {}
    public static android.content.pm.PackageParser.SigningDetails verify(java.lang.String p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private static android.content.pm.PackageParser.SigningDetails verifyV1Signature(java.lang.String p0, boolean p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private static java.security.cert.Certificate[][] loadCertificates(android.util.jar.StrictJarFile p0, java.util.zip.ZipEntry p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    private static void readFullyIgnoringContents(java.io.InputStream p0) throws java.io.IOException {}
    public static android.content.pm.Signature[] convertToSignatures(java.security.cert.Certificate[][] p0) throws java.security.cert.CertificateEncodingException { return null; }
    private static void closeQuietly(android.util.jar.StrictJarFile p0) {}
    public static android.content.pm.PackageParser.SigningDetails unsafeGetCertsWithoutVerification(java.lang.String p0, int p1) throws android.content.pm.PackageParser.PackageParserException { return null; }
    public static byte[] getVerityRootHash(java.lang.String p0) throws java.io.IOException, java.lang.SecurityException { return null; }
    public static byte[] generateApkVerity(java.lang.String p0, android.util.apk.ByteBufferFactory p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.security.DigestException, java.security.NoSuchAlgorithmException { return null; }
    public static byte[] generateApkVerityRootHash(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.DigestException, java.io.IOException { return null; }

    public static class Result {
        public final java.security.cert.Certificate[][] certs = null;
        public final android.content.pm.Signature[] sigs = null;
        public final int signatureSchemeVersion = 0;
        public Result(java.security.cert.Certificate[][] p0, android.content.pm.Signature[] p1, int p2) {}
    }
}
