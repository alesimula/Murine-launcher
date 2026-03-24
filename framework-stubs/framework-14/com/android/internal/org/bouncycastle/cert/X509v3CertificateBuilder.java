package com.android.internal.org.bouncycastle.cert;

public class X509v3CertificateBuilder {
    public X509v3CertificateBuilder(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0, java.math.BigInteger p1, java.util.Date p2, java.util.Date p3, com.android.internal.org.bouncycastle.asn1.x500.X500Name p4, com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p5) {}
    public X509v3CertificateBuilder(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0, java.math.BigInteger p1, java.util.Date p2, java.util.Date p3, java.util.Locale p4, com.android.internal.org.bouncycastle.asn1.x500.X500Name p5, com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p6) {}
    public X509v3CertificateBuilder(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0, java.math.BigInteger p1, com.android.internal.org.bouncycastle.asn1.x509.Time p2, com.android.internal.org.bouncycastle.asn1.x509.Time p3, com.android.internal.org.bouncycastle.asn1.x500.X500Name p4, com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p5) {}
    public X509v3CertificateBuilder(com.android.internal.org.bouncycastle.cert.X509CertificateHolder p0) {}
    public boolean hasExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return false; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extension getExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public com.android.internal.org.bouncycastle.cert.X509v3CertificateBuilder setSubjectUniqueID(boolean[] p0) { return null; }
    public com.android.internal.org.bouncycastle.cert.X509v3CertificateBuilder setIssuerUniqueID(boolean[] p0) { return null; }
    public com.android.internal.org.bouncycastle.cert.X509v3CertificateBuilder addExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, boolean p1, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p2) throws com.android.internal.org.bouncycastle.cert.CertIOException { return null; }
    public com.android.internal.org.bouncycastle.cert.X509v3CertificateBuilder addExtension(com.android.internal.org.bouncycastle.asn1.x509.Extension p0) throws com.android.internal.org.bouncycastle.cert.CertIOException { return null; }
    public com.android.internal.org.bouncycastle.cert.X509v3CertificateBuilder addExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, boolean p1, byte[] p2) throws com.android.internal.org.bouncycastle.cert.CertIOException { return null; }
    public com.android.internal.org.bouncycastle.cert.X509v3CertificateBuilder replaceExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, boolean p1, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p2) throws com.android.internal.org.bouncycastle.cert.CertIOException { return null; }
    public com.android.internal.org.bouncycastle.cert.X509v3CertificateBuilder replaceExtension(com.android.internal.org.bouncycastle.asn1.x509.Extension p0) throws com.android.internal.org.bouncycastle.cert.CertIOException { return null; }
    public com.android.internal.org.bouncycastle.cert.X509v3CertificateBuilder replaceExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, boolean p1, byte[] p2) throws com.android.internal.org.bouncycastle.cert.CertIOException { return null; }
    public com.android.internal.org.bouncycastle.cert.X509v3CertificateBuilder removeExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public com.android.internal.org.bouncycastle.cert.X509v3CertificateBuilder copyAndAddExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, boolean p1, com.android.internal.org.bouncycastle.cert.X509CertificateHolder p2) { return null; }
    public com.android.internal.org.bouncycastle.cert.X509CertificateHolder build(com.android.internal.org.bouncycastle.operator.ContentSigner p0) { return null; }
    static com.android.internal.org.bouncycastle.asn1.DERBitString booleanToBitString(boolean[] p0) { return null; }
}
