package com.android.org.conscrypt;

final class OpenSSLKey {
    OpenSSLKey(long p0) {}
    OpenSSLKey(long p0, boolean p1) {}
    OpenSSLKey(long p0, boolean p1, boolean p2) {}
    com.android.org.conscrypt.NativeRef.EVP_PKEY getNativeRef() { return null; }
    boolean isWrapped() { return false; }
    boolean isHardwareBacked() { return false; }
    static com.android.org.conscrypt.OpenSSLKey fromPrivateKey(java.security.PrivateKey p0) throws java.security.InvalidKeyException { return null; }
    static com.android.org.conscrypt.OpenSSLKey fromPrivateKeyPemInputStream(java.io.InputStream p0) throws java.security.InvalidKeyException { return null; }
    static com.android.org.conscrypt.OpenSSLKey fromPrivateKeyForTLSStackOnly(java.security.PrivateKey p0, java.security.PublicKey p1) throws java.security.InvalidKeyException { return null; }
    static com.android.org.conscrypt.OpenSSLKey fromECPrivateKeyForTLSStackOnly(java.security.PrivateKey p0, java.security.spec.ECParameterSpec p1) throws java.security.InvalidKeyException { return null; }
    static com.android.org.conscrypt.OpenSSLKey fromPublicKey(java.security.PublicKey p0) throws java.security.InvalidKeyException { return null; }
    static com.android.org.conscrypt.OpenSSLKey fromPublicKeyPemInputStream(java.io.InputStream p0) throws java.security.InvalidKeyException { return null; }
    java.security.PublicKey getPublicKey() throws java.security.NoSuchAlgorithmException { return null; }
    static java.security.PublicKey getPublicKey(java.security.spec.X509EncodedKeySpec p0, int p1) throws java.security.spec.InvalidKeySpecException { return null; }
    java.security.PrivateKey getPrivateKey() throws java.security.NoSuchAlgorithmException { return null; }
    static java.security.PrivateKey getPrivateKey(java.security.spec.PKCS8EncodedKeySpec p0, int p1) throws java.security.spec.InvalidKeySpecException { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
