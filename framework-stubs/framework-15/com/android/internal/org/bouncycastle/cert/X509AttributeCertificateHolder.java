package com.android.internal.org.bouncycastle.cert;

public class X509AttributeCertificateHolder implements com.android.internal.org.bouncycastle.util.Encodable, java.io.Serializable {
    public X509AttributeCertificateHolder(byte[] p0) throws java.io.IOException {}
    public X509AttributeCertificateHolder(com.android.internal.org.bouncycastle.asn1.x509.AttributeCertificate p0) {}
    public byte[] getEncoded() throws java.io.IOException { return null; }
    public int getVersion() { return 0; }
    public java.math.BigInteger getSerialNumber() { return null; }
    public com.android.internal.org.bouncycastle.cert.AttributeCertificateHolder getHolder() { return null; }
    public com.android.internal.org.bouncycastle.cert.AttributeCertificateIssuer getIssuer() { return null; }
    public java.util.Date getNotBefore() { return null; }
    public java.util.Date getNotAfter() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Attribute[] getAttributes() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Attribute[] getAttributes(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public boolean hasExtensions() { return false; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extension getExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extensions getExtensions() { return null; }
    public java.util.List getExtensionOIDs() { return null; }
    public java.util.Set getCriticalExtensionOIDs() { return null; }
    public java.util.Set getNonCriticalExtensionOIDs() { return null; }
    public boolean[] getIssuerUniqueID() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() { return null; }
    public byte[] getSignature() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AttributeCertificate toASN1Structure() { return null; }
    public boolean isValidOn(java.util.Date p0) { return false; }
    public boolean isSignatureValid(com.android.internal.org.bouncycastle.operator.ContentVerifierProvider p0) throws com.android.internal.org.bouncycastle.cert.CertException { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
