package com.android.internal.org.bouncycastle.jcajce.interfaces;

public interface BCX509Certificate {
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getIssuerX500Name();
    public com.android.internal.org.bouncycastle.asn1.x509.TBSCertificate getTBSCertificateNative();
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getSubjectX500Name();
}
