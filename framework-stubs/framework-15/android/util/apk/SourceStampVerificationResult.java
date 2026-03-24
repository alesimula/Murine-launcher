package android.util.apk;

public final class SourceStampVerificationResult {
    public boolean isPresent() { return false; }
    public boolean isVerified() { return false; }
    public java.security.cert.Certificate getCertificate() { return null; }
    public java.util.List<? extends java.security.cert.Certificate> getCertificateLineage() { return null; }
    public static android.util.apk.SourceStampVerificationResult notPresent() { return null; }
    public static android.util.apk.SourceStampVerificationResult verified(java.security.cert.Certificate p0, java.util.List<? extends java.security.cert.Certificate> p1) { return null; }
    public static android.util.apk.SourceStampVerificationResult notVerified() { return null; }
}
