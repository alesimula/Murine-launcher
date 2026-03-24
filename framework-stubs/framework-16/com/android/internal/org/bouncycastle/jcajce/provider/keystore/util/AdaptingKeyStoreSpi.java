package com.android.internal.org.bouncycastle.jcajce.provider.keystore.util;

public class AdaptingKeyStoreSpi extends java.security.KeyStoreSpi {
    public static final java.lang.String COMPAT_OVERRIDE = "keystore.type.compat";
    public AdaptingKeyStoreSpi(com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p0, java.security.KeyStoreSpi p1) { super(); }
    public boolean engineProbe(java.io.InputStream p0) throws java.io.IOException { return false; }
    public java.security.Key engineGetKey(java.lang.String p0, char[] p1) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException { return null; }
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String p0) { return null; }
    public java.security.cert.Certificate engineGetCertificate(java.lang.String p0) { return null; }
    public java.util.Date engineGetCreationDate(java.lang.String p0) { return null; }
    public void engineSetKeyEntry(java.lang.String p0, java.security.Key p1, char[] p2, java.security.cert.Certificate[] p3) throws java.security.KeyStoreException {}
    public void engineSetKeyEntry(java.lang.String p0, byte[] p1, java.security.cert.Certificate[] p2) throws java.security.KeyStoreException {}
    public void engineSetCertificateEntry(java.lang.String p0, java.security.cert.Certificate p1) throws java.security.KeyStoreException {}
    public void engineDeleteEntry(java.lang.String p0) throws java.security.KeyStoreException {}
    public java.util.Enumeration<java.lang.String> engineAliases() { return null; }
    public boolean engineContainsAlias(java.lang.String p0) { return false; }
    public int engineSize() { return 0; }
    public boolean engineIsKeyEntry(java.lang.String p0) { return false; }
    public boolean engineIsCertificateEntry(java.lang.String p0) { return false; }
    public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate p0) { return null; }
    public void engineStore(java.io.OutputStream p0, char[] p1) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}
    public void engineStore(java.security.KeyStore.LoadStoreParameter p0) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}
    public void engineLoad(java.io.InputStream p0, char[] p1) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}
    public void engineLoad(java.security.KeyStore.LoadStoreParameter p0) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}
}
