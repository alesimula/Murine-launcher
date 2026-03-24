package com.android.org.conscrypt;

final class OpenSSLECPrivateKey implements java.security.interfaces.ECPrivateKey, com.android.org.conscrypt.OpenSSLKeyHolder {
    OpenSSLECPrivateKey(com.android.org.conscrypt.OpenSSLECGroupContext p0, com.android.org.conscrypt.OpenSSLKey p1) {}
    OpenSSLECPrivateKey(com.android.org.conscrypt.OpenSSLKey p0) {}
    OpenSSLECPrivateKey(java.security.spec.ECPrivateKeySpec p0) throws java.security.spec.InvalidKeySpecException {}
    static com.android.org.conscrypt.OpenSSLKey wrapPlatformKey(java.security.interfaces.ECPrivateKey p0) throws java.security.InvalidKeyException { return null; }
    static com.android.org.conscrypt.OpenSSLKey wrapJCAPrivateKeyForTLSStackOnly(java.security.PrivateKey p0, java.security.PublicKey p1) throws java.security.InvalidKeyException { return null; }
    static com.android.org.conscrypt.OpenSSLKey wrapJCAPrivateKeyForTLSStackOnly(java.security.PrivateKey p0, java.security.spec.ECParameterSpec p1) throws java.security.InvalidKeyException { return null; }
    static com.android.org.conscrypt.OpenSSLKey getInstance(java.security.interfaces.ECPrivateKey p0) throws java.security.InvalidKeyException { return null; }
    public java.lang.String getAlgorithm() { return null; }
    public java.lang.String getFormat() { return null; }
    public byte[] getEncoded() { return null; }
    public java.security.spec.ECParameterSpec getParams() { return null; }
    public java.math.BigInteger getS() { return null; }
    public com.android.org.conscrypt.OpenSSLKey getOpenSSLKey() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
