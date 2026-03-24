package com.android.org.conscrypt;

public final class TrustedCertificateKeyStoreSpi extends java.security.KeyStoreSpi {
    public TrustedCertificateKeyStoreSpi() { super(); }
    public java.security.Key engineGetKey(java.lang.String p0, char[] p1) { return null; }
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String p0) { return null; }
    public java.security.cert.Certificate engineGetCertificate(java.lang.String p0) { return null; }
    public java.util.Date engineGetCreationDate(java.lang.String p0) { return null; }
    public void engineSetKeyEntry(java.lang.String p0, java.security.Key p1, char[] p2, java.security.cert.Certificate[] p3) {}
    public void engineSetKeyEntry(java.lang.String p0, byte[] p1, java.security.cert.Certificate[] p2) {}
    public void engineSetCertificateEntry(java.lang.String p0, java.security.cert.Certificate p1) {}
    public void engineDeleteEntry(java.lang.String p0) {}
    public java.util.Enumeration<java.lang.String> engineAliases() { return null; }
    public boolean engineContainsAlias(java.lang.String p0) { return false; }
    public int engineSize() { return 0; }
    public boolean engineIsKeyEntry(java.lang.String p0) { return false; }
    public boolean engineIsCertificateEntry(java.lang.String p0) { return false; }
    public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate p0) { return null; }
    public void engineStore(java.io.OutputStream p0, char[] p1) {}
    public void engineLoad(java.io.InputStream p0, char[] p1) {}
}
