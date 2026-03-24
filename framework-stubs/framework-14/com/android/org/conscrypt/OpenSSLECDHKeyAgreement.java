package com.android.org.conscrypt;

public final class OpenSSLECDHKeyAgreement extends com.android.org.conscrypt.OpenSSLBaseDHKeyAgreement<com.android.org.conscrypt.OpenSSLKey> {
    public OpenSSLECDHKeyAgreement() { super(); }
    protected com.android.org.conscrypt.OpenSSLKey convertPublicKey(java.security.PublicKey p0) throws java.security.InvalidKeyException { return null; }
    protected com.android.org.conscrypt.OpenSSLKey convertPrivateKey(java.security.PrivateKey p0) throws java.security.InvalidKeyException { return null; }
    protected int computeKey(byte[] p0, com.android.org.conscrypt.OpenSSLKey p1, com.android.org.conscrypt.OpenSSLKey p2) throws java.security.InvalidKeyException { return 0; }
    protected int getOutputSize(com.android.org.conscrypt.OpenSSLKey p0) { return 0; }
}
