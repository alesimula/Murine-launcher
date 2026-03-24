package com.android.org.conscrypt;

@java.lang.Deprecated
public interface PSKKeyManager extends javax.net.ssl.KeyManager {
    public static final int MAX_IDENTITY_HINT_LENGTH_BYTES = 128;
    public static final int MAX_IDENTITY_LENGTH_BYTES = 128;
    public static final int MAX_KEY_LENGTH_BYTES = 256;
    public java.lang.String chooseServerKeyIdentityHint(java.net.Socket p0);
    public java.lang.String chooseServerKeyIdentityHint(javax.net.ssl.SSLEngine p0);
    public java.lang.String chooseClientKeyIdentity(java.lang.String p0, java.net.Socket p1);
    public java.lang.String chooseClientKeyIdentity(java.lang.String p0, javax.net.ssl.SSLEngine p1);
    public javax.crypto.SecretKey getKey(java.lang.String p0, java.lang.String p1, java.net.Socket p2);
    public javax.crypto.SecretKey getKey(java.lang.String p0, java.lang.String p1, javax.net.ssl.SSLEngine p2);
}
