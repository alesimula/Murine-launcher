package com.android.internal.org.bouncycastle.pkcs;

public class PKCS10CertificationRequest {
    public PKCS10CertificationRequest(com.android.internal.org.bouncycastle.asn1.pkcs.CertificationRequest p0) {}
    public PKCS10CertificationRequest(byte[] p0) throws java.io.IOException {}
    public com.android.internal.org.bouncycastle.asn1.pkcs.CertificationRequest toASN1Structure() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getSubject() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() { return null; }
    public byte[] getSignature() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() { return null; }
    public com.android.internal.org.bouncycastle.asn1.pkcs.Attribute[] getAttributes() { return null; }
    public com.android.internal.org.bouncycastle.asn1.pkcs.Attribute[] getAttributes(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public byte[] getEncoded() throws java.io.IOException { return null; }
    public boolean isSignatureValid(com.android.internal.org.bouncycastle.operator.ContentVerifierProvider p0) throws com.android.internal.org.bouncycastle.pkcs.PKCSException { return false; }
    public boolean hasAltPublicKey() { return false; }
    public boolean isAltSignatureValid(com.android.internal.org.bouncycastle.operator.ContentVerifierProvider p0) throws com.android.internal.org.bouncycastle.pkcs.PKCSException { return false; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extensions getRequestedExtensions() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
