package com.android.internal.org.bouncycastle.jcajce;

public class PKIXCertStoreSelector<T extends java.security.cert.Certificate> implements com.android.internal.org.bouncycastle.util.Selector<T> {
    public java.security.cert.Certificate getCertificate() { return null; }
    public boolean match(java.security.cert.Certificate p0) { return false; }
    public java.lang.Object clone() { return null; }
    public static java.util.Collection<? extends java.security.cert.Certificate> getCertificates(com.android.internal.org.bouncycastle.jcajce.PKIXCertStoreSelector p0, java.security.cert.CertStore p1) throws java.security.cert.CertStoreException { return null; }

    public static class Builder {
        public Builder(java.security.cert.CertSelector p0) {}
        public com.android.internal.org.bouncycastle.jcajce.PKIXCertStoreSelector<? extends java.security.cert.Certificate> build() { return null; }
    }

    private static class SelectorClone extends java.security.cert.X509CertSelector {
        SelectorClone(com.android.internal.org.bouncycastle.jcajce.PKIXCertStoreSelector p0) { super(); }
        public boolean match(java.security.cert.Certificate p0) { return false; }
    }
}
