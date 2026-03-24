package com.android.internal.org.bouncycastle.asn1.x509;

public class Holder extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    public static final int V1_CERTIFICATE_HOLDER = 0;
    public static final int V2_CERTIFICATE_HOLDER = 1;
    com.android.internal.org.bouncycastle.asn1.x509.IssuerSerial baseCertificateID;
    com.android.internal.org.bouncycastle.asn1.x509.GeneralNames entityName;
    com.android.internal.org.bouncycastle.asn1.x509.ObjectDigestInfo objectDigestInfo;
    private int version;
    public static com.android.internal.org.bouncycastle.asn1.x509.Holder getInstance(java.lang.Object p0) { return null; }
    private Holder(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0) { super(); }
    private Holder(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public Holder(com.android.internal.org.bouncycastle.asn1.x509.IssuerSerial p0) { super(); }
    public Holder(com.android.internal.org.bouncycastle.asn1.x509.IssuerSerial p0, int p1) { super(); }
    public int getVersion() { return 0; }
    public Holder(com.android.internal.org.bouncycastle.asn1.x509.GeneralNames p0) { super(); }
    public Holder(com.android.internal.org.bouncycastle.asn1.x509.GeneralNames p0, int p1) { super(); }
    public Holder(com.android.internal.org.bouncycastle.asn1.x509.ObjectDigestInfo p0) { super(); }
    public com.android.internal.org.bouncycastle.asn1.x509.IssuerSerial getBaseCertificateID() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.GeneralNames getEntityName() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.ObjectDigestInfo getObjectDigestInfo() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
