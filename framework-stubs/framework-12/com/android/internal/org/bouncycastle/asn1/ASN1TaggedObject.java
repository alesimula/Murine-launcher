package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1TaggedObject extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive implements com.android.internal.org.bouncycastle.asn1.ASN1TaggedObjectParser {
    final int tagNo = 0;
    final boolean explicit = false;
    final com.android.internal.org.bouncycastle.asn1.ASN1Encodable obj = null;
    public static com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject getInstance(java.lang.Object p0) { return null; }
    public ASN1TaggedObject(boolean p0, int p1, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p2) { super(); }
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    public int hashCode() { return 0; }
    public int getTagNo() { return 0; }
    public boolean isExplicit() { return false; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getObject() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getObjectParser(int p0, boolean p1) throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getLoadedObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
    abstract void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException;
    public java.lang.String toString() { return null; }
}
