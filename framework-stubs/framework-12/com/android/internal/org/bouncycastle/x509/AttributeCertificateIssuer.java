package com.android.internal.org.bouncycastle.x509;

public class AttributeCertificateIssuer implements java.security.cert.CertSelector, com.android.internal.org.bouncycastle.util.Selector {
    final com.android.internal.org.bouncycastle.asn1.ASN1Encodable form = null;
    public AttributeCertificateIssuer(com.android.internal.org.bouncycastle.asn1.x509.AttCertIssuer p0) {}
    public AttributeCertificateIssuer(javax.security.auth.x500.X500Principal p0) throws java.io.IOException {}
    public AttributeCertificateIssuer(com.android.internal.org.bouncycastle.jce.X509Principal p0) {}
    private java.lang.Object[] getNames() { return null; }
    public java.security.Principal[] getPrincipals() { return null; }
    private boolean matchesDN(javax.security.auth.x500.X500Principal p0, com.android.internal.org.bouncycastle.asn1.x509.GeneralNames p1) { return false; }
    public java.lang.Object clone() { return null; }
    public boolean match(java.security.cert.Certificate p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean match(java.lang.Object p0) { return false; }
}
