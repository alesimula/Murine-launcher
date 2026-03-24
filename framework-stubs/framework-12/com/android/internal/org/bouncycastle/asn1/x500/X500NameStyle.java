package com.android.internal.org.bouncycastle.asn1.x500;

public interface X500NameStyle {
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable stringToValue(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1);
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier attrNameToOID(java.lang.String p0);
    public com.android.internal.org.bouncycastle.asn1.x500.RDN[] fromString(java.lang.String p0);
    public boolean areEqual(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0, com.android.internal.org.bouncycastle.asn1.x500.X500Name p1);
    public int calculateHashCode(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0);
    public java.lang.String toString(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0);
    public java.lang.String oidToDisplayName(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0);
    public java.lang.String[] oidToAttrNames(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0);
}
