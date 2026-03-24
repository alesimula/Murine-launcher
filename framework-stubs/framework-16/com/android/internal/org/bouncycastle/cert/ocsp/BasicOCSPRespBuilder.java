package com.android.internal.org.bouncycastle.cert.ocsp;

public class BasicOCSPRespBuilder {
    public BasicOCSPRespBuilder(com.android.internal.org.bouncycastle.cert.ocsp.RespID p0) {}
    public BasicOCSPRespBuilder(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0, com.android.internal.org.bouncycastle.operator.DigestCalculator p1) throws com.android.internal.org.bouncycastle.cert.ocsp.OCSPException {}
    public com.android.internal.org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder addResponse(com.android.internal.org.bouncycastle.cert.ocsp.CertificateID p0, com.android.internal.org.bouncycastle.cert.ocsp.CertificateStatus p1) { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder addResponse(com.android.internal.org.bouncycastle.cert.ocsp.CertificateID p0, com.android.internal.org.bouncycastle.cert.ocsp.CertificateStatus p1, com.android.internal.org.bouncycastle.asn1.x509.Extensions p2) { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder addResponse(com.android.internal.org.bouncycastle.cert.ocsp.CertificateID p0, com.android.internal.org.bouncycastle.cert.ocsp.CertificateStatus p1, java.util.Date p2, com.android.internal.org.bouncycastle.asn1.x509.Extensions p3) { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder addResponse(com.android.internal.org.bouncycastle.cert.ocsp.CertificateID p0, com.android.internal.org.bouncycastle.cert.ocsp.CertificateStatus p1, java.util.Date p2, java.util.Date p3) { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder addResponse(com.android.internal.org.bouncycastle.cert.ocsp.CertificateID p0, com.android.internal.org.bouncycastle.cert.ocsp.CertificateStatus p1, java.util.Date p2, java.util.Date p3, com.android.internal.org.bouncycastle.asn1.x509.Extensions p4) { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder setResponseExtensions(com.android.internal.org.bouncycastle.asn1.x509.Extensions p0) { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.BasicOCSPResp build(com.android.internal.org.bouncycastle.operator.ContentSigner p0, com.android.internal.org.bouncycastle.cert.X509CertificateHolder[] p1, java.util.Date p2) throws com.android.internal.org.bouncycastle.cert.ocsp.OCSPException { return null; }

    private static class ResponseObject {
        com.android.internal.org.bouncycastle.cert.ocsp.CertificateID certId;
        com.android.internal.org.bouncycastle.asn1.ocsp.CertStatus certStatus;
        com.android.internal.org.bouncycastle.asn1.ASN1GeneralizedTime thisUpdate;
        com.android.internal.org.bouncycastle.asn1.ASN1GeneralizedTime nextUpdate;
        com.android.internal.org.bouncycastle.asn1.x509.Extensions extensions;
        public ResponseObject(com.android.internal.org.bouncycastle.cert.ocsp.CertificateID p0, com.android.internal.org.bouncycastle.cert.ocsp.CertificateStatus p1, java.util.Date p2, java.util.Date p3, com.android.internal.org.bouncycastle.asn1.x509.Extensions p4) {}
        public com.android.internal.org.bouncycastle.asn1.ocsp.SingleResponse toResponse() throws java.lang.Exception { return null; }
    }
}
