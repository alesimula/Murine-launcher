package com.android.org.conscrypt;

class OpenSSLRSAPrivateKey implements java.security.interfaces.RSAPrivateKey, com.android.org.conscrypt.OpenSSLKeyHolder {
    transient com.android.org.conscrypt.OpenSSLKey key;
    transient boolean fetchedParams;
    java.math.BigInteger modulus;
    java.math.BigInteger privateExponent;
    OpenSSLRSAPrivateKey(com.android.org.conscrypt.OpenSSLKey p0) {}
    OpenSSLRSAPrivateKey(com.android.org.conscrypt.OpenSSLKey p0, byte[][] p1) {}
    public com.android.org.conscrypt.OpenSSLKey getOpenSSLKey() { return null; }
    public OpenSSLRSAPrivateKey(java.security.spec.RSAPrivateKeySpec p0) throws java.security.spec.InvalidKeySpecException {}
    static com.android.org.conscrypt.OpenSSLRSAPrivateKey getInstance(com.android.org.conscrypt.OpenSSLKey p0) { return null; }
    static com.android.org.conscrypt.OpenSSLKey wrapPlatformKey(java.security.interfaces.RSAPrivateKey p0) throws java.security.InvalidKeyException { return null; }
    static com.android.org.conscrypt.OpenSSLKey wrapJCAPrivateKeyForTLSStackOnly(java.security.PrivateKey p0, java.security.PublicKey p1) throws java.security.InvalidKeyException { return null; }
    static com.android.org.conscrypt.OpenSSLKey getInstance(java.security.interfaces.RSAPrivateKey p0) throws java.security.InvalidKeyException { return null; }
    final synchronized void ensureReadParams() {}
    void readParams(byte[][] p0) {}
    public final java.math.BigInteger getPrivateExponent() { return null; }
    public final java.math.BigInteger getModulus() { return null; }
    public final byte[] getEncoded() { return null; }
    public final java.lang.String getFormat() { return null; }
    public final java.lang.String getAlgorithm() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
