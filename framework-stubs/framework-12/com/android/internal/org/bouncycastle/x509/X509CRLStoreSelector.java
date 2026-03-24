package com.android.internal.org.bouncycastle.x509;

public class X509CRLStoreSelector extends java.security.cert.X509CRLSelector implements com.android.internal.org.bouncycastle.util.Selector {
    private boolean deltaCRLIndicator;
    private boolean completeCRLEnabled;
    private java.math.BigInteger maxBaseCRLNumber;
    private byte[] issuingDistributionPoint;
    private boolean issuingDistributionPointEnabled;
    private com.android.internal.org.bouncycastle.x509.X509AttributeCertificate attrCertChecking;
    public X509CRLStoreSelector() { super(); }
    public boolean isIssuingDistributionPointEnabled() { return false; }
    public void setIssuingDistributionPointEnabled(boolean p0) {}
    public void setAttrCertificateChecking(com.android.internal.org.bouncycastle.x509.X509AttributeCertificate p0) {}
    public com.android.internal.org.bouncycastle.x509.X509AttributeCertificate getAttrCertificateChecking() { return null; }
    public boolean match(java.lang.Object p0) { return false; }
    public boolean match(java.security.cert.CRL p0) { return false; }
    public boolean isDeltaCRLIndicatorEnabled() { return false; }
    public void setDeltaCRLIndicatorEnabled(boolean p0) {}
    public static com.android.internal.org.bouncycastle.x509.X509CRLStoreSelector getInstance(java.security.cert.X509CRLSelector p0) { return null; }
    public java.lang.Object clone() { return null; }
    public boolean isCompleteCRLEnabled() { return false; }
    public void setCompleteCRLEnabled(boolean p0) {}
    public java.math.BigInteger getMaxBaseCRLNumber() { return null; }
    public void setMaxBaseCRLNumber(java.math.BigInteger p0) {}
    public byte[] getIssuingDistributionPoint() { return null; }
    public void setIssuingDistributionPoint(byte[] p0) {}
}
