package com.android.org.conscrypt;

public class KeyManagerFactoryImpl extends javax.net.ssl.KeyManagerFactorySpi {
    public KeyManagerFactoryImpl() { super(); }
    protected void engineInit(java.security.KeyStore p0, char[] p1) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {}
    protected void engineInit(javax.net.ssl.ManagerFactoryParameters p0) throws java.security.InvalidAlgorithmParameterException {}
    protected javax.net.ssl.KeyManager[] engineGetKeyManagers() { return null; }
}
