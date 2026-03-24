package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509;

class X509CRLObject extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl {
    private final java.lang.Object cacheLock = null;
    private com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal internalCRLValue;
    private volatile boolean hashValueSet;
    private volatile int hashValue;
    X509CRLObject(com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p0, com.android.internal.org.bouncycastle.asn1.x509.CertificateList p1) throws java.security.cert.CRLException { super(null, null, null, null, false); }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal getInternalCRL() { return null; }
    private static java.lang.String createSigAlgName(com.android.internal.org.bouncycastle.asn1.x509.CertificateList p0) throws java.security.cert.CRLException { return null; }
    private static byte[] createSigAlgParams(com.android.internal.org.bouncycastle.asn1.x509.CertificateList p0) throws java.security.cert.CRLException { return null; }
    private static boolean isIndirectCRL(com.android.internal.org.bouncycastle.asn1.x509.CertificateList p0) throws java.security.cert.CRLException { return false; }
}
