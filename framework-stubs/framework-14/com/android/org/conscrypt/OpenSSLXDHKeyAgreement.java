package com.android.org.conscrypt;

public final class OpenSSLXDHKeyAgreement extends com.android.org.conscrypt.OpenSSLBaseDHKeyAgreement<byte[]> {
    public OpenSSLXDHKeyAgreement() { super(); }
    protected byte[] convertPublicKey(java.security.PublicKey p0) throws java.security.InvalidKeyException { return null; }
    protected byte[] convertPrivateKey(java.security.PrivateKey p0) throws java.security.InvalidKeyException { return null; }
    protected int computeKey(byte[] p0, byte[] p1, byte[] p2) throws java.security.InvalidKeyException { return 0; }
    protected int getOutputSize(byte[] p0) { return 0; }
}
