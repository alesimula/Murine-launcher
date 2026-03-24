package com.android.internal.org.bouncycastle.jce;

public class PKCS10CertificationRequest extends com.android.internal.org.bouncycastle.asn1.pkcs.CertificationRequest {
    private static java.util.Hashtable algorithms;
    private static java.util.Hashtable params;
    private static java.util.Hashtable keyAlgorithms;
    private static java.util.Hashtable oids;
    private static java.util.Set noParams;
    private static com.android.internal.org.bouncycastle.asn1.pkcs.RSASSAPSSparams creatPSSParams(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, int p1) { return null; }
    private static com.android.internal.org.bouncycastle.asn1.ASN1Sequence toDERSequence(byte[] p0) { return null; }
    public PKCS10CertificationRequest(byte[] p0) { super(); }
    public PKCS10CertificationRequest(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public PKCS10CertificationRequest(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.x509.X509Name p1, java.security.PublicKey p2, com.android.internal.org.bouncycastle.asn1.ASN1Set p3, java.security.PrivateKey p4) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException { super(); }
    private static com.android.internal.org.bouncycastle.asn1.x509.X509Name convertName(javax.security.auth.x500.X500Principal p0) { return null; }
    public PKCS10CertificationRequest(java.lang.String p0, javax.security.auth.x500.X500Principal p1, java.security.PublicKey p2, com.android.internal.org.bouncycastle.asn1.ASN1Set p3, java.security.PrivateKey p4) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException { super(); }
    public PKCS10CertificationRequest(java.lang.String p0, javax.security.auth.x500.X500Principal p1, java.security.PublicKey p2, com.android.internal.org.bouncycastle.asn1.ASN1Set p3, java.security.PrivateKey p4, java.lang.String p5) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException { super(); }
    public PKCS10CertificationRequest(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.x509.X509Name p1, java.security.PublicKey p2, com.android.internal.org.bouncycastle.asn1.ASN1Set p3, java.security.PrivateKey p4, java.lang.String p5) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException { super(); }
    public java.security.PublicKey getPublicKey() throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException { return null; }
    public java.security.PublicKey getPublicKey(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException { return null; }
    public boolean verify() throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException { return false; }
    public boolean verify(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException { return false; }
    public boolean verify(java.security.PublicKey p0, java.lang.String p1) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException { return false; }
    public byte[] getEncoded() { return null; }
    private void setSignatureParameters(java.security.Signature p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p1) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {}
    static java.lang.String getSignatureName(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) { return null; }
    private static java.lang.String getDigestAlgName(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
}
