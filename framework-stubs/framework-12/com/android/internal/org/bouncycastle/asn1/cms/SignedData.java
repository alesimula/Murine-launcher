package com.android.internal.org.bouncycastle.asn1.cms;

public class SignedData extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    private static final com.android.internal.org.bouncycastle.asn1.ASN1Integer VERSION_1 = null;
    private static final com.android.internal.org.bouncycastle.asn1.ASN1Integer VERSION_3 = null;
    private static final com.android.internal.org.bouncycastle.asn1.ASN1Integer VERSION_4 = null;
    private static final com.android.internal.org.bouncycastle.asn1.ASN1Integer VERSION_5 = null;
    private com.android.internal.org.bouncycastle.asn1.ASN1Integer version;
    private com.android.internal.org.bouncycastle.asn1.ASN1Set digestAlgorithms;
    private com.android.internal.org.bouncycastle.asn1.cms.ContentInfo contentInfo;
    private com.android.internal.org.bouncycastle.asn1.ASN1Set certificates;
    private com.android.internal.org.bouncycastle.asn1.ASN1Set crls;
    private com.android.internal.org.bouncycastle.asn1.ASN1Set signerInfos;
    private boolean certsBer;
    private boolean crlsBer;
    public static com.android.internal.org.bouncycastle.asn1.cms.SignedData getInstance(java.lang.Object p0) { return null; }
    public SignedData(com.android.internal.org.bouncycastle.asn1.ASN1Set p0, com.android.internal.org.bouncycastle.asn1.cms.ContentInfo p1, com.android.internal.org.bouncycastle.asn1.ASN1Set p2, com.android.internal.org.bouncycastle.asn1.ASN1Set p3, com.android.internal.org.bouncycastle.asn1.ASN1Set p4) { super(); }
    private com.android.internal.org.bouncycastle.asn1.ASN1Integer calculateVersion(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Set p1, com.android.internal.org.bouncycastle.asn1.ASN1Set p2, com.android.internal.org.bouncycastle.asn1.ASN1Set p3) { return null; }
    private boolean checkForVersion3(com.android.internal.org.bouncycastle.asn1.ASN1Set p0) { return false; }
    private SignedData(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getVersion() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Set getDigestAlgorithms() { return null; }
    public com.android.internal.org.bouncycastle.asn1.cms.ContentInfo getEncapContentInfo() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Set getCertificates() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Set getCRLs() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Set getSignerInfos() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
