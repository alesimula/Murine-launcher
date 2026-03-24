package com.android.org.conscrypt.ct;

public final class VerifiedSCT {
    public final com.android.org.conscrypt.ct.SignedCertificateTimestamp sct = null;
    public final com.android.org.conscrypt.ct.VerifiedSCT.Status status = null;
    public VerifiedSCT(com.android.org.conscrypt.ct.SignedCertificateTimestamp p0, com.android.org.conscrypt.ct.VerifiedSCT.Status p1) {}

    public static enum Status {
        VALID,
        INVALID_SIGNATURE,
        UNKNOWN_LOG,
        INVALID_SCT;
    }
}
