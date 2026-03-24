package com.android.internal.org.bouncycastle.asn1.cms;

public class SignerInfo extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    public static com.android.internal.org.bouncycastle.asn1.cms.SignerInfo getInstance(java.lang.Object p0) throws java.lang.IllegalArgumentException { return null; }
    public SignerInfo(com.android.internal.org.bouncycastle.asn1.cms.SignerIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, com.android.internal.org.bouncycastle.asn1.ASN1Set p2, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p3, com.android.internal.org.bouncycastle.asn1.ASN1OctetString p4, com.android.internal.org.bouncycastle.asn1.ASN1Set p5) { super(); }
    public SignerInfo(com.android.internal.org.bouncycastle.asn1.cms.SignerIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, com.android.internal.org.bouncycastle.asn1.cms.Attributes p2, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p3, com.android.internal.org.bouncycastle.asn1.ASN1OctetString p4, com.android.internal.org.bouncycastle.asn1.cms.Attributes p5) { super(); }
    public SignerInfo(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getVersion() { return null; }
    public com.android.internal.org.bouncycastle.asn1.cms.SignerIdentifier getSID() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Set getAuthenticatedAttributes() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1OctetString getEncryptedDigest() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestEncryptionAlgorithm() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Set getUnauthenticatedAttributes() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
