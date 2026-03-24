package com.android.internal.org.bouncycastle.jce.provider;

class WrappedRevocationChecker implements com.android.internal.org.bouncycastle.jcajce.PKIXCertRevocationChecker {
    private final java.security.cert.PKIXCertPathChecker checker = null;
    public WrappedRevocationChecker(java.security.cert.PKIXCertPathChecker p0) {}
    public void setParameter(java.lang.String p0, java.lang.Object p1) {}
    public void initialize(com.android.internal.org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters p0) throws java.security.cert.CertPathValidatorException {}
    public void check(java.security.cert.Certificate p0) throws java.security.cert.CertPathValidatorException {}
}
