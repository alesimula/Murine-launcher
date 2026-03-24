package com.android.internal.org.bouncycastle.jcajce.provider.keystore.bc;

public class BcKeyStoreSpi extends java.security.KeyStoreSpi implements com.android.internal.org.bouncycastle.jce.interfaces.BCKeyStore {
    static final int NULL = 0;
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    static final int SECRET = 3;
    static final int SEALED = 4;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    protected java.util.Hashtable table;
    protected java.security.SecureRandom random;
    protected int version;
    public BcKeyStoreSpi(int p0) { super(); }
    protected javax.crypto.Cipher makePBECipher(java.lang.String p0, int p1, char[] p2, byte[] p3, int p4) throws java.io.IOException { return null; }
    public void setRandom(java.security.SecureRandom p0) {}
    public java.util.Enumeration engineAliases() { return null; }
    public boolean engineContainsAlias(java.lang.String p0) { return false; }
    public void engineDeleteEntry(java.lang.String p0) throws java.security.KeyStoreException {}
    public java.security.cert.Certificate engineGetCertificate(java.lang.String p0) { return null; }
    public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate p0) { return null; }
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String p0) { return null; }
    public java.util.Date engineGetCreationDate(java.lang.String p0) { return null; }
    public java.security.Key engineGetKey(java.lang.String p0, char[] p1) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException { return null; }
    public boolean engineIsCertificateEntry(java.lang.String p0) { return false; }
    public boolean engineIsKeyEntry(java.lang.String p0) { return false; }
    public void engineSetCertificateEntry(java.lang.String p0, java.security.cert.Certificate p1) throws java.security.KeyStoreException {}
    public void engineSetKeyEntry(java.lang.String p0, byte[] p1, java.security.cert.Certificate[] p2) throws java.security.KeyStoreException {}
    public void engineSetKeyEntry(java.lang.String p0, java.security.Key p1, char[] p2, java.security.cert.Certificate[] p3) throws java.security.KeyStoreException {}
    public int engineSize() { return 0; }
    protected void loadStore(java.io.InputStream p0) throws java.io.IOException {}
    protected void saveStore(java.io.OutputStream p0) throws java.io.IOException {}
    public void engineLoad(java.io.InputStream p0, char[] p1) throws java.io.IOException {}
    public void engineStore(java.io.OutputStream p0, char[] p1) throws java.io.IOException {}
    public boolean engineProbe(java.io.InputStream p0) throws java.io.IOException { return false; }

    private static class BCKeyStoreException extends java.security.KeyStoreException {
        public BCKeyStoreException(java.lang.String p0, java.lang.Exception p1) { super(); }
        public java.lang.Throwable getCause() { return null; }
    }

    public static class BouncyCastleStore extends com.android.internal.org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi {
        public BouncyCastleStore() { super(0); }
        public void engineLoad(java.io.InputStream p0, char[] p1) throws java.io.IOException {}
        public void engineStore(java.io.OutputStream p0, char[] p1) throws java.io.IOException {}
        public boolean engineProbe(java.io.InputStream p0) throws java.io.IOException { return false; }
    }

    public static class Std extends com.android.internal.org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi {
        public Std() { super(0); }
    }

    private class StoreEntry {
        int type;
        java.lang.String alias;
        java.lang.Object obj;
        java.security.cert.Certificate[] certChain;
        java.util.Date date;
        StoreEntry(com.android.internal.org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi p0, java.lang.String p1, java.security.cert.Certificate p2) {}
        StoreEntry(com.android.internal.org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi p0, java.lang.String p1, byte[] p2, java.security.cert.Certificate[] p3) {}
        StoreEntry(com.android.internal.org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi p0, java.lang.String p1, java.security.Key p2, char[] p3, java.security.cert.Certificate[] p4) throws java.lang.Exception {}
        StoreEntry(com.android.internal.org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi p0, java.lang.String p1, java.util.Date p2, int p3, java.lang.Object p4) {}
        StoreEntry(com.android.internal.org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi p0, java.lang.String p1, java.util.Date p2, int p3, java.lang.Object p4, java.security.cert.Certificate[] p5) {}
        int getType() { return 0; }
        java.lang.String getAlias() { return null; }
        java.lang.Object getObject() { return null; }
        java.lang.Object getObject(char[] p0) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException { return null; }
        java.security.cert.Certificate[] getCertificateChain() { return null; }
        java.util.Date getDate() { return null; }
    }

    public static class Version1 extends com.android.internal.org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi {
        public Version1() { super(0); }
    }
}
