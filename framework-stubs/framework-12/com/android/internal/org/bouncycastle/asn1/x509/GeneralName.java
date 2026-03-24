package com.android.internal.org.bouncycastle.asn1.x509;

public class GeneralName extends com.android.internal.org.bouncycastle.asn1.ASN1Object implements com.android.internal.org.bouncycastle.asn1.ASN1Choice {
    public static final int otherName = 0;
    public static final int rfc822Name = 1;
    public static final int dNSName = 2;
    public static final int x400Address = 3;
    public static final int directoryName = 4;
    public static final int ediPartyName = 5;
    public static final int uniformResourceIdentifier = 6;
    public static final int iPAddress = 7;
    public static final int registeredID = 8;
    private com.android.internal.org.bouncycastle.asn1.ASN1Encodable obj;
    private int tag;
    public GeneralName(com.android.internal.org.bouncycastle.asn1.x509.X509Name p0) { super(); }
    public GeneralName(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0) { super(); }
    public GeneralName(int p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p1) { super(); }
    public GeneralName(int p0, java.lang.String p1) { super(); }
    public static com.android.internal.org.bouncycastle.asn1.x509.GeneralName getInstance(java.lang.Object p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.GeneralName getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public int getTagNo() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getName() { return null; }
    public java.lang.String toString() { return null; }
    private byte[] toGeneralNameEncoding(java.lang.String p0) { return null; }
    private void parseIPv4Mask(java.lang.String p0, byte[] p1, int p2) {}
    private void parseIPv4(java.lang.String p0, byte[] p1, int p2) {}
    private int[] parseMask(java.lang.String p0) { return null; }
    private void copyInts(int[] p0, byte[] p1, int p2) {}
    private int[] parseIPv6(java.lang.String p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
