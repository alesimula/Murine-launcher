package com.android.org.conscrypt;

class KeyManagerImpl extends javax.net.ssl.X509ExtendedKeyManager {
    KeyManagerImpl(java.security.KeyStore p0, char[] p1) { super(); }
    public java.lang.String chooseClientAlias(java.lang.String[] p0, java.security.Principal[] p1, java.net.Socket p2) { return null; }
    public java.lang.String chooseServerAlias(java.lang.String p0, java.security.Principal[] p1, java.net.Socket p2) { return null; }
    public java.security.cert.X509Certificate[] getCertificateChain(java.lang.String p0) { return null; }
    public java.lang.String[] getClientAliases(java.lang.String p0, java.security.Principal[] p1) { return null; }
    public java.lang.String[] getServerAliases(java.lang.String p0, java.security.Principal[] p1) { return null; }
    public java.security.PrivateKey getPrivateKey(java.lang.String p0) { return null; }
    public java.lang.String chooseEngineClientAlias(java.lang.String[] p0, java.security.Principal[] p1, javax.net.ssl.SSLEngine p2) { return null; }
    public java.lang.String chooseEngineServerAlias(java.lang.String p0, java.security.Principal[] p1, javax.net.ssl.SSLEngine p2) { return null; }
}
