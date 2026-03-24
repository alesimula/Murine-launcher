package com.android.internal.org.bouncycastle.cert.ocsp;

public class RevokedStatus implements com.android.internal.org.bouncycastle.cert.ocsp.CertificateStatus {
    com.android.internal.org.bouncycastle.asn1.ocsp.RevokedInfo info;
    public RevokedStatus(com.android.internal.org.bouncycastle.asn1.ocsp.RevokedInfo p0) {}
    public RevokedStatus(java.util.Date p0) {}
    public RevokedStatus(java.util.Date p0, int p1) {}
    public java.util.Date getRevocationTime() { return null; }
    public boolean hasRevocationReason() { return false; }
    public int getRevocationReason() { return 0; }
}
