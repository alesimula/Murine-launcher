package com.android.internal.org.bouncycastle.cert;

public class X509CRLHolder implements com.android.internal.org.bouncycastle.util.Encodable, java.io.Serializable {
    public X509CRLHolder(byte[] p0) throws java.io.IOException {}
    public X509CRLHolder(java.io.InputStream p0) throws java.io.IOException {}
    public X509CRLHolder(com.android.internal.org.bouncycastle.asn1.x509.CertificateList p0) {}
    public byte[] getEncoded() throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getIssuer() { return null; }
    public java.util.Date getThisUpdate() { return null; }
    public java.util.Date getNextUpdate() { return null; }
    public com.android.internal.org.bouncycastle.cert.X509CRLEntryHolder getRevokedCertificate(java.math.BigInteger p0) { return null; }
    public java.util.Collection getRevokedCertificates() { return null; }
    public boolean hasExtensions() { return false; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extension getExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extensions getExtensions() { return null; }
    public java.util.List getExtensionOIDs() { return null; }
    public java.util.Set getCriticalExtensionOIDs() { return null; }
    public java.util.Set getNonCriticalExtensionOIDs() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.CertificateList toASN1Structure() { return null; }
    public boolean isSignatureValid(com.android.internal.org.bouncycastle.operator.ContentVerifierProvider p0) throws com.android.internal.org.bouncycastle.cert.CertException { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
