package com.android.internal.org.bouncycastle.asn1.x509;

public class IssuingDistributionPoint extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    private com.android.internal.org.bouncycastle.asn1.x509.DistributionPointName distributionPoint;
    private boolean onlyContainsUserCerts;
    private boolean onlyContainsCACerts;
    private com.android.internal.org.bouncycastle.asn1.x509.ReasonFlags onlySomeReasons;
    private boolean indirectCRL;
    private boolean onlyContainsAttributeCerts;
    private com.android.internal.org.bouncycastle.asn1.ASN1Sequence seq;
    public static com.android.internal.org.bouncycastle.asn1.x509.IssuingDistributionPoint getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.IssuingDistributionPoint getInstance(java.lang.Object p0) { return null; }
    public IssuingDistributionPoint(com.android.internal.org.bouncycastle.asn1.x509.DistributionPointName p0, boolean p1, boolean p2, com.android.internal.org.bouncycastle.asn1.x509.ReasonFlags p3, boolean p4, boolean p5) { super(); }
    public IssuingDistributionPoint(com.android.internal.org.bouncycastle.asn1.x509.DistributionPointName p0, boolean p1, boolean p2) { super(); }
    private IssuingDistributionPoint(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public boolean onlyContainsUserCerts() { return false; }
    public boolean onlyContainsCACerts() { return false; }
    public boolean isIndirectCRL() { return false; }
    public boolean onlyContainsAttributeCerts() { return false; }
    public com.android.internal.org.bouncycastle.asn1.x509.DistributionPointName getDistributionPoint() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.ReasonFlags getOnlySomeReasons() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
    public java.lang.String toString() { return null; }
    private void appendObject(java.lang.StringBuffer p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    private java.lang.String booleanToString(boolean p0) { return null; }
}
