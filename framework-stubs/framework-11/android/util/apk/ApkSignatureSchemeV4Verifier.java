package android.util.apk;

public class ApkSignatureSchemeV4Verifier {
    public ApkSignatureSchemeV4Verifier() {}
    public static android.util.apk.ApkSignatureSchemeV4Verifier.VerifiedSigner extractCertificates(java.lang.String p0) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException { return null; }
    private static android.util.apk.ApkSignatureSchemeV4Verifier.VerifiedSigner verifySigner(android.os.incremental.V4Signature.SigningInfo p0, byte[] p1) throws java.lang.SecurityException { return null; }

    public static class VerifiedSigner {
        public final java.security.cert.Certificate[] certs = null;
        public byte[] apkDigest;
        public VerifiedSigner(java.security.cert.Certificate[] p0, byte[] p1) {}
    }
}
