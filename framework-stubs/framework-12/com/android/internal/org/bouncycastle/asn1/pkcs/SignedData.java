package com.android.internal.org.bouncycastle.asn1.pkcs;

public class SignedData extends com.android.internal.org.bouncycastle.asn1.ASN1Object implements com.android.internal.org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers {
    private com.android.internal.org.bouncycastle.asn1.ASN1Integer version;
    private com.android.internal.org.bouncycastle.asn1.ASN1Set digestAlgorithms;
    private com.android.internal.org.bouncycastle.asn1.pkcs.ContentInfo contentInfo;
    private com.android.internal.org.bouncycastle.asn1.ASN1Set certificates;
    private com.android.internal.org.bouncycastle.asn1.ASN1Set crls;
    private com.android.internal.org.bouncycastle.asn1.ASN1Set signerInfos;
    public static com.android.internal.org.bouncycastle.asn1.pkcs.SignedData getInstance(java.lang.Object p0) { return null; }
    public SignedData(com.android.internal.org.bouncycastle.asn1.ASN1Integer p0, com.android.internal.org.bouncycastle.asn1.ASN1Set p1, com.android.internal.org.bouncycastle.asn1.pkcs.ContentInfo p2, com.android.internal.org.bouncycastle.asn1.ASN1Set p3, com.android.internal.org.bouncycastle.asn1.ASN1Set p4, com.android.internal.org.bouncycastle.asn1.ASN1Set p5) { super(); }
    public SignedData(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getVersion() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Set getDigestAlgorithms() { return null; }
    public com.android.internal.org.bouncycastle.asn1.pkcs.ContentInfo getContentInfo() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Set getCertificates() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Set getCRLs() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Set getSignerInfos() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
