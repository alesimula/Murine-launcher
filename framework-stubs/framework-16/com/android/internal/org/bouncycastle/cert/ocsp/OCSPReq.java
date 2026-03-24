package com.android.internal.org.bouncycastle.cert.ocsp;

public class OCSPReq {
    public OCSPReq(com.android.internal.org.bouncycastle.asn1.ocsp.OCSPRequest p0) {}
    public OCSPReq(byte[] p0) throws java.io.IOException {}
    public int getVersionNumber() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.x509.GeneralName getRequestorName() { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.Req[] getRequestList() { return null; }
    public boolean hasExtensions() { return false; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extension getExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.util.List getExtensionOIDs() { return null; }
    public java.util.Set getCriticalExtensionOIDs() { return null; }
    public java.util.Set getNonCriticalExtensionOIDs() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getSignatureAlgOID() { return null; }
    public byte[] getSignature() { return null; }
    public com.android.internal.org.bouncycastle.cert.X509CertificateHolder[] getCerts() { return null; }
    public boolean isSigned() { return false; }
    public boolean isSignatureValid(com.android.internal.org.bouncycastle.operator.ContentVerifierProvider p0) throws com.android.internal.org.bouncycastle.cert.ocsp.OCSPException { return false; }
    public byte[] getEncoded() throws java.io.IOException { return null; }
}
