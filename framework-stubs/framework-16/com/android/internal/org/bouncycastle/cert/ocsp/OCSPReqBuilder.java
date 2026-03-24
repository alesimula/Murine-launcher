package com.android.internal.org.bouncycastle.cert.ocsp;

public class OCSPReqBuilder {
    public OCSPReqBuilder() {}
    public com.android.internal.org.bouncycastle.cert.ocsp.OCSPReqBuilder addRequest(com.android.internal.org.bouncycastle.cert.ocsp.CertificateID p0) { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.OCSPReqBuilder addRequest(com.android.internal.org.bouncycastle.cert.ocsp.CertificateID p0, com.android.internal.org.bouncycastle.asn1.x509.Extensions p1) { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.OCSPReqBuilder setRequestorName(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0) { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.OCSPReqBuilder setRequestorName(com.android.internal.org.bouncycastle.asn1.x509.GeneralName p0) { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.OCSPReqBuilder setRequestExtensions(com.android.internal.org.bouncycastle.asn1.x509.Extensions p0) { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.OCSPReq build() throws com.android.internal.org.bouncycastle.cert.ocsp.OCSPException { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.OCSPReq build(com.android.internal.org.bouncycastle.operator.ContentSigner p0, com.android.internal.org.bouncycastle.cert.X509CertificateHolder[] p1) throws com.android.internal.org.bouncycastle.cert.ocsp.OCSPException, java.lang.IllegalArgumentException { return null; }

    private static class RequestObject {
        com.android.internal.org.bouncycastle.cert.ocsp.CertificateID certId;
        com.android.internal.org.bouncycastle.asn1.x509.Extensions extensions;
        public RequestObject(com.android.internal.org.bouncycastle.cert.ocsp.CertificateID p0, com.android.internal.org.bouncycastle.asn1.x509.Extensions p1) {}
        public com.android.internal.org.bouncycastle.asn1.ocsp.Request toRequest() throws java.lang.Exception { return null; }
    }
}
