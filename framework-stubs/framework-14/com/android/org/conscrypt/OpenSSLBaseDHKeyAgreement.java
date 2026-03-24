package com.android.org.conscrypt;

public abstract class OpenSSLBaseDHKeyAgreement<T extends java.lang.Object> extends javax.crypto.KeyAgreementSpi {
    protected OpenSSLBaseDHKeyAgreement() { super(); }
    public java.security.Key engineDoPhase(java.security.Key p0, boolean p1) throws java.security.InvalidKeyException { return null; }
    protected abstract T convertPublicKey(java.security.PublicKey p0) throws java.security.InvalidKeyException;
    protected abstract T convertPrivateKey(java.security.PrivateKey p0) throws java.security.InvalidKeyException;
    protected abstract int computeKey(byte[] p0, T p1, T p2) throws java.security.InvalidKeyException;
    protected int engineGenerateSecret(byte[] p0, int p1) throws javax.crypto.ShortBufferException { return 0; }
    protected byte[] engineGenerateSecret() { return null; }
    protected javax.crypto.SecretKey engineGenerateSecret(java.lang.String p0) { return null; }
    protected void engineInit(java.security.Key p0, java.security.SecureRandom p1) throws java.security.InvalidKeyException {}
    protected abstract int getOutputSize(T p0);
    protected void engineInit(java.security.Key p0, java.security.spec.AlgorithmParameterSpec p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
}
