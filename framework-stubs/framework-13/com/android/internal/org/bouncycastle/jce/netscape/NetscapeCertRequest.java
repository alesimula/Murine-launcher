package com.android.internal.org.bouncycastle.jce.netscape;

public class NetscapeCertRequest extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier sigAlg;
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier keyAlg;
    byte[] sigBits;
    java.lang.String challenge;
    com.android.internal.org.bouncycastle.asn1.DERBitString content;
    java.security.PublicKey pubkey;
    public NetscapeCertRequest(byte[] p0) throws java.io.IOException { super(); }
    public NetscapeCertRequest(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public NetscapeCertRequest(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, java.security.PublicKey p2) throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException, java.security.NoSuchProviderException { super(); }
    public java.lang.String getChallenge() { return null; }
    public void setChallenge(java.lang.String p0) {}
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSigningAlgorithm() { return null; }
    public void setSigningAlgorithm(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) {}
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyAlgorithm() { return null; }
    public void setKeyAlgorithm(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) {}
    public java.security.PublicKey getPublicKey() { return null; }
    public void setPublicKey(java.security.PublicKey p0) {}
    public boolean verify(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException { return false; }
    public void sign(java.security.PrivateKey p0) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException, java.security.spec.InvalidKeySpecException {}
    public void sign(java.security.PrivateKey p0, java.security.SecureRandom p1) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException, java.security.spec.InvalidKeySpecException {}
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
