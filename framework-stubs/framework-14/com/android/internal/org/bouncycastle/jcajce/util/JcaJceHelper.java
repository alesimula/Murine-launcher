package com.android.internal.org.bouncycastle.jcajce.util;

public interface JcaJceHelper {
    public javax.crypto.Cipher createCipher(java.lang.String p0) throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.NoSuchProviderException;
    public javax.crypto.Mac createMac(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public javax.crypto.KeyAgreement createKeyAgreement(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public java.security.AlgorithmParameterGenerator createAlgorithmParameterGenerator(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public java.security.AlgorithmParameters createAlgorithmParameters(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public javax.crypto.KeyGenerator createKeyGenerator(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public java.security.KeyFactory createKeyFactory(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public javax.crypto.SecretKeyFactory createSecretKeyFactory(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public java.security.KeyPairGenerator createKeyPairGenerator(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public java.security.MessageDigest createDigest(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public java.security.MessageDigest createMessageDigest(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public java.security.Signature createSignature(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public java.security.cert.CertificateFactory createCertificateFactory(java.lang.String p0) throws java.security.NoSuchProviderException, java.security.cert.CertificateException;
    public java.security.SecureRandom createSecureRandom(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public java.security.cert.CertPathBuilder createCertPathBuilder(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public java.security.cert.CertPathValidator createCertPathValidator(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public java.security.cert.CertStore createCertStore(java.lang.String p0, java.security.cert.CertStoreParameters p1) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.NoSuchProviderException;
    public javax.crypto.ExemptionMechanism createExemptionMechanism(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException;
    public java.security.KeyStore createKeyStore(java.lang.String p0) throws java.security.KeyStoreException, java.security.NoSuchProviderException;
}
