package android.util.apk;

public final class SourceStampVerificationResult {
    private final boolean mPresent = false;
    private final boolean mVerified = false;
    private final java.security.cert.Certificate mCertificate = null;
    private SourceStampVerificationResult(boolean p0, boolean p1, java.security.cert.Certificate p2) {}
    public boolean isPresent() { return false; }
    public boolean isVerified() { return false; }
    public java.security.cert.Certificate getCertificate() { return null; }
    public static android.util.apk.SourceStampVerificationResult notPresent() { return null; }
    public static android.util.apk.SourceStampVerificationResult verified(java.security.cert.Certificate p0) { return null; }
    public static android.util.apk.SourceStampVerificationResult notVerified() { return null; }
}
