package com.android.internal.org.bouncycastle.cert.ocsp;

public class BasicOCSPResp implements com.android.internal.org.bouncycastle.util.Encodable {
    public BasicOCSPResp(com.android.internal.org.bouncycastle.asn1.ocsp.BasicOCSPResponse p0) {}
    public byte[] getTBSResponseData() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithmID() { return null; }
    public int getVersion() { return 0; }
    public com.android.internal.org.bouncycastle.cert.ocsp.RespID getResponderId() { return null; }
    public java.util.Date getProducedAt() { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.SingleResp[] getResponses() { return null; }
    public boolean hasExtensions() { return false; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extension getExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.util.List getExtensionOIDs() { return null; }
    public java.util.Set getCriticalExtensionOIDs() { return null; }
    public java.util.Set getNonCriticalExtensionOIDs() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getSignatureAlgOID() { return null; }
    public byte[] getSignature() { return null; }
    public com.android.internal.org.bouncycastle.cert.X509CertificateHolder[] getCerts() { return null; }
    public boolean isSignatureValid(com.android.internal.org.bouncycastle.operator.ContentVerifierProvider p0) throws com.android.internal.org.bouncycastle.cert.ocsp.OCSPException { return false; }
    public byte[] getEncoded() throws java.io.IOException { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
