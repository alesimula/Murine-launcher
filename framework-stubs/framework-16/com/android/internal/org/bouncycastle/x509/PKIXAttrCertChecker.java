package com.android.internal.org.bouncycastle.x509;

public abstract class PKIXAttrCertChecker implements java.lang.Cloneable {
    public PKIXAttrCertChecker() {}
    public abstract java.util.Set getSupportedExtensions();
    public abstract void check(com.android.internal.org.bouncycastle.x509.X509AttributeCertificate p0, java.security.cert.CertPath p1, java.security.cert.CertPath p2, java.util.Collection p3) throws java.security.cert.CertPathValidatorException;
    public abstract java.lang.Object clone();
}
