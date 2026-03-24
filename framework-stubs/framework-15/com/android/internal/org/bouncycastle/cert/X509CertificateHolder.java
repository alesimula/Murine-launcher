package com.android.internal.org.bouncycastle.cert;

public class X509CertificateHolder implements com.android.internal.org.bouncycastle.util.Encodable, java.io.Serializable {
    public X509CertificateHolder(byte[] p0) throws java.io.IOException {}
    public X509CertificateHolder(com.android.internal.org.bouncycastle.asn1.x509.Certificate p0) {}
    public int getVersionNumber() { return 0; }
    public int getVersion() { return 0; }
    public boolean hasExtensions() { return false; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extension getExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extensions getExtensions() { return null; }
    public java.util.List getExtensionOIDs() { return null; }
    public java.util.Set getCriticalExtensionOIDs() { return null; }
    public java.util.Set getNonCriticalExtensionOIDs() { return null; }
    public java.math.BigInteger getSerialNumber() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getIssuer() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getSubject() { return null; }
    public java.util.Date getNotBefore() { return null; }
    public java.util.Date getNotAfter() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Certificate toASN1Structure() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() { return null; }
    public byte[] getSignature() { return null; }
    public boolean isValidOn(java.util.Date p0) { return false; }
    public boolean isSignatureValid(com.android.internal.org.bouncycastle.operator.ContentVerifierProvider p0) throws com.android.internal.org.bouncycastle.cert.CertException { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public byte[] getEncoded() throws java.io.IOException { return null; }
}
