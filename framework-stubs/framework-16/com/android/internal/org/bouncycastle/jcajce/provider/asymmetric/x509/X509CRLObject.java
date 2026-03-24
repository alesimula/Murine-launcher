package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509;

class X509CRLObject extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl {
    X509CRLObject(com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p0, com.android.internal.org.bouncycastle.asn1.x509.CertificateList p1) throws java.security.cert.CRLException { super(null, null, null, null, false); }
    public byte[] getEncoded() throws java.security.cert.CRLException { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    private static class X509CRLException extends java.security.cert.CRLException {
        X509CRLException(java.lang.String p0, java.lang.Throwable p1) { super(); }
        X509CRLException(java.lang.Throwable p0) { super(); }
        public java.lang.Throwable getCause() { return null; }
    }
}
