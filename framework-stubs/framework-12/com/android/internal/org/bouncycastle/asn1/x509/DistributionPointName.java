package com.android.internal.org.bouncycastle.asn1.x509;

public class DistributionPointName extends com.android.internal.org.bouncycastle.asn1.ASN1Object implements com.android.internal.org.bouncycastle.asn1.ASN1Choice {
    com.android.internal.org.bouncycastle.asn1.ASN1Encodable name;
    int type;
    public static final int FULL_NAME = 0;
    public static final int NAME_RELATIVE_TO_CRL_ISSUER = 1;
    public static com.android.internal.org.bouncycastle.asn1.x509.DistributionPointName getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.DistributionPointName getInstance(java.lang.Object p0) { return null; }
    public DistributionPointName(int p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p1) { super(); }
    public DistributionPointName(com.android.internal.org.bouncycastle.asn1.x509.GeneralNames p0) { super(); }
    public int getType() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getName() { return null; }
    public DistributionPointName(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0) { super(); }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
    public java.lang.String toString() { return null; }
    private void appendObject(java.lang.StringBuffer p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
}
