package android.util.apk;

public class ApkSignatureSchemeV4Verifier {
    public ApkSignatureSchemeV4Verifier() {}
    public static android.util.apk.ApkSignatureSchemeV4Verifier.VerifiedSigner extractCertificates(java.lang.String p0) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException { return null; }
    private static android.util.Pair<java.security.cert.Certificate, byte[]> verifySigner(android.os.incremental.V4Signature.SigningInfo p0, byte[] p1) throws java.lang.SecurityException { return null; }
    private static int convertToContentDigestType(int p0) throws java.lang.SecurityException { return 0; }

    public static class VerifiedSigner {
        public final java.security.cert.Certificate[] certs = null;
        public final byte[] apkDigest = null;
        public final java.util.Map<java.lang.Integer, byte[]> contentDigests = null;
        public VerifiedSigner(java.security.cert.Certificate[] p0, byte[] p1, java.util.Map<java.lang.Integer, byte[]> p2) {}
    }
}
