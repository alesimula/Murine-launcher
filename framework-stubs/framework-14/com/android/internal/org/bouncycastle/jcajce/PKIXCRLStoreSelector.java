package com.android.internal.org.bouncycastle.jcajce;

public class PKIXCRLStoreSelector<T extends java.security.cert.CRL> implements com.android.internal.org.bouncycastle.util.Selector<T> {
    public boolean isIssuingDistributionPointEnabled() { return false; }
    public boolean match(java.security.cert.CRL p0) { return false; }
    public boolean isDeltaCRLIndicatorEnabled() { return false; }
    public java.lang.Object clone() { return null; }
    public boolean isCompleteCRLEnabled() { return false; }
    public java.math.BigInteger getMaxBaseCRLNumber() { return null; }
    public byte[] getIssuingDistributionPoint() { return null; }
    public java.security.cert.X509Certificate getCertificateChecking() { return null; }
    public static java.util.Collection<? extends java.security.cert.CRL> getCRLs(com.android.internal.org.bouncycastle.jcajce.PKIXCRLStoreSelector p0, java.security.cert.CertStore p1) throws java.security.cert.CertStoreException { return null; }

    public static class Builder {
        public Builder(java.security.cert.CRLSelector p0) {}
        public com.android.internal.org.bouncycastle.jcajce.PKIXCRLStoreSelector.Builder setCompleteCRLEnabled(boolean p0) { return null; }
        public com.android.internal.org.bouncycastle.jcajce.PKIXCRLStoreSelector.Builder setDeltaCRLIndicatorEnabled(boolean p0) { return null; }
        public void setMaxBaseCRLNumber(java.math.BigInteger p0) {}
        public void setIssuingDistributionPointEnabled(boolean p0) {}
        public void setIssuingDistributionPoint(byte[] p0) {}
        public com.android.internal.org.bouncycastle.jcajce.PKIXCRLStoreSelector<? extends java.security.cert.CRL> build() { return null; }
    }

    private static class SelectorClone extends java.security.cert.X509CRLSelector {
        SelectorClone(com.android.internal.org.bouncycastle.jcajce.PKIXCRLStoreSelector p0) { super(); }
        public boolean match(java.security.cert.CRL p0) { return false; }
    }
}
