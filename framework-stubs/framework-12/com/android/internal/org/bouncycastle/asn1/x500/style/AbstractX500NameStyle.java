package com.android.internal.org.bouncycastle.asn1.x500.style;

public abstract class AbstractX500NameStyle implements com.android.internal.org.bouncycastle.asn1.x500.X500NameStyle {
    public AbstractX500NameStyle() {}
    public static java.util.Hashtable copyHashTable(java.util.Hashtable p0) { return null; }
    private int calcHashCode(com.android.internal.org.bouncycastle.asn1.ASN1Encodable p0) { return 0; }
    public int calculateHashCode(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0) { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable stringToValue(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1) { return null; }
    protected com.android.internal.org.bouncycastle.asn1.ASN1Encodable encodeStringValue(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1) { return null; }
    public boolean areEqual(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0, com.android.internal.org.bouncycastle.asn1.x500.X500Name p1) { return false; }
    private boolean foundMatch(boolean p0, com.android.internal.org.bouncycastle.asn1.x500.RDN p1, com.android.internal.org.bouncycastle.asn1.x500.RDN[] p2) { return false; }
    protected boolean rdnAreEqual(com.android.internal.org.bouncycastle.asn1.x500.RDN p0, com.android.internal.org.bouncycastle.asn1.x500.RDN p1) { return false; }
}
