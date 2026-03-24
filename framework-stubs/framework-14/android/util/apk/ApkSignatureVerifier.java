package android.util.apk;

public class ApkSignatureVerifier {
    public ApkSignatureVerifier() {}
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> verify(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> unsafeGetCertsWithoutVerification(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests> verifySignaturesInternal(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, int p2, boolean p3) { return null; }
    public static int getMinimumSignatureSchemeVersionForTargetSdk(int p0) { return 0; }
    public static byte[] getVerityRootHash(java.lang.String p0) throws java.io.IOException, java.lang.SecurityException { return null; }
    public static byte[] generateApkVerity(java.lang.String p0, android.util.apk.ByteBufferFactory p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.security.DigestException, java.security.NoSuchAlgorithmException { return null; }

    public static class Result {
        public final java.security.cert.Certificate[][] certs = null;
        public final android.content.pm.Signature[] sigs = null;
        public final int signatureSchemeVersion = 0;
        public Result(java.security.cert.Certificate[][] p0, android.content.pm.Signature[] p1, int p2) {}
    }

    public static class SigningDetailsWithDigests {
        public final android.content.pm.SigningDetails signingDetails = null;
        public final java.util.Map<java.lang.Integer, byte[]> contentDigests = null;
        SigningDetailsWithDigests(android.content.pm.SigningDetails p0, java.util.Map<java.lang.Integer, byte[]> p1) {}
    }
}
