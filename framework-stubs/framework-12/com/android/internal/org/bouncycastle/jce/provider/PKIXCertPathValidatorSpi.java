package com.android.internal.org.bouncycastle.jce.provider;

public class PKIXCertPathValidatorSpi extends java.security.cert.CertPathValidatorSpi {
    private final com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper helper = null;
    private final boolean isForCRLCheck = false;
    public PKIXCertPathValidatorSpi() { super(); }
    public PKIXCertPathValidatorSpi(boolean p0) { super(); }
    public java.security.cert.CertPathValidatorResult engineValidate(java.security.cert.CertPath p0, java.security.cert.CertPathParameters p1) throws java.security.cert.CertPathValidatorException, java.security.InvalidAlgorithmParameterException { return null; }
    static void checkCertificate(java.security.cert.X509Certificate p0) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException {}

    private static class NoPreloadHolder {
        private static final com.android.internal.org.bouncycastle.jce.provider.CertBlocklist blocklist = null;
        private NoPreloadHolder() {}
    }
}
