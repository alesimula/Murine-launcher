package com.android.internal.org.bouncycastle.x509;

public class X509V3CertificateGenerator {
    private final com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper bcHelper = null;
    private final com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory certificateFactory = null;
    private com.android.internal.org.bouncycastle.asn1.x509.V3TBSCertificateGenerator tbsGen;
    private com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier sigOID;
    private com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier sigAlgId;
    private java.lang.String signatureAlgorithm;
    private com.android.internal.org.bouncycastle.asn1.x509.X509ExtensionsGenerator extGenerator;
    public X509V3CertificateGenerator() {}
    public void reset() {}
    public void setSerialNumber(java.math.BigInteger p0) {}
    public void setIssuerDN(javax.security.auth.x500.X500Principal p0) {}
    public void setIssuerDN(com.android.internal.org.bouncycastle.asn1.x509.X509Name p0) {}
    public void setNotBefore(java.util.Date p0) {}
    public void setNotAfter(java.util.Date p0) {}
    public void setSubjectDN(javax.security.auth.x500.X500Principal p0) {}
    public void setSubjectDN(com.android.internal.org.bouncycastle.asn1.x509.X509Name p0) {}
    public void setPublicKey(java.security.PublicKey p0) throws java.lang.IllegalArgumentException {}
    public void setSignatureAlgorithm(java.lang.String p0) {}
    public void setSubjectUniqueID(boolean[] p0) {}
    public void setIssuerUniqueID(boolean[] p0) {}
    private com.android.internal.org.bouncycastle.asn1.DERBitString booleanToBitString(boolean[] p0) { return null; }
    public void addExtension(java.lang.String p0, boolean p1, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p2) {}
    public void addExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, boolean p1, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p2) {}
    public void addExtension(java.lang.String p0, boolean p1, byte[] p2) {}
    public void addExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, boolean p1, byte[] p2) {}
    public void copyAndAddExtension(java.lang.String p0, boolean p1, java.security.cert.X509Certificate p2) throws java.security.cert.CertificateParsingException {}
    public void copyAndAddExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, boolean p1, java.security.cert.X509Certificate p2) throws java.security.cert.CertificateParsingException {}
    public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey p0) throws java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey p0, java.security.SecureRandom p1) throws java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey p0, java.lang.String p1) throws java.security.NoSuchProviderException, java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey p0, java.lang.String p1, java.security.SecureRandom p2) throws java.security.NoSuchProviderException, java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generate(java.security.PrivateKey p0) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generate(java.security.PrivateKey p0, java.security.SecureRandom p1) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generate(java.security.PrivateKey p0, java.lang.String p1) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generate(java.security.PrivateKey p0, java.lang.String p1, java.security.SecureRandom p2) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    private com.android.internal.org.bouncycastle.asn1.x509.TBSCertificate generateTbsCert() { return null; }
    private java.security.cert.X509Certificate generateJcaObject(com.android.internal.org.bouncycastle.asn1.x509.TBSCertificate p0, byte[] p1) throws java.lang.Exception { return null; }
    public java.util.Iterator getSignatureAlgNames() { return null; }
}
