package com.android.internal.org.bouncycastle.operator.jcajce;

class OperatorHelper {
    OperatorHelper(com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p0) {}
    java.lang.String getWrappingAlgorithmName(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    int getKeySizeInBits(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return 0; }
    java.security.KeyPairGenerator createKeyPairGenerator(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) throws com.android.internal.org.bouncycastle.cms.CMSException { return null; }
    javax.crypto.Cipher createCipher(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    javax.crypto.KeyAgreement createKeyAgreement(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    javax.crypto.Cipher createAsymmetricWrapper(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.util.Map p1) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    javax.crypto.Cipher createSymmetricWrapper(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    java.security.AlgorithmParameters createAlgorithmParameters(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    java.security.MessageDigest createDigest(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) throws java.security.GeneralSecurityException { return null; }
    java.security.Signature createSignature(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) throws java.security.GeneralSecurityException { return null; }
    java.security.Signature createRawSignature(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) { return null; }
    static java.lang.String getDigestName(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.security.cert.X509Certificate convertCertificate(com.android.internal.org.bouncycastle.cert.X509CertificateHolder p0) throws java.security.cert.CertificateException { return null; }
    public java.security.PublicKey convertPublicKey(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    java.lang.String getKeyAlgorithmName(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }

    private static class OpCertificateException extends java.security.cert.CertificateException {
        public OpCertificateException(java.lang.String p0, java.lang.Throwable p1) { super(); }
        public java.lang.Throwable getCause() { return null; }
    }
}
