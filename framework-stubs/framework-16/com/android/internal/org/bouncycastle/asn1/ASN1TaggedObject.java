package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1TaggedObject extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive implements com.android.internal.org.bouncycastle.asn1.ASN1TaggedObjectParser {
    final int explicitness = 0;
    final int tagClass = 0;
    final int tagNo = 0;
    final com.android.internal.org.bouncycastle.asn1.ASN1Encodable obj = null;
    public static com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject getInstance(java.lang.Object p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject getInstance(java.lang.Object p0, int p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject getInstance(java.lang.Object p0, int p1, int p2) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    protected ASN1TaggedObject(boolean p0, int p1, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p2) { super(); }
    protected ASN1TaggedObject(boolean p0, int p1, int p2, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p3) { super(); }
    ASN1TaggedObject(int p0, int p1, int p2, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p3) { super(); }
    final boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    public int hashCode() { return 0; }
    public int getTagClass() { return 0; }
    public int getTagNo() { return 0; }
    public boolean hasContextTag() { return false; }
    public boolean hasContextTag(int p0) { return false; }
    public boolean hasTag(int p0, int p1) { return false; }
    public boolean hasTagClass(int p0) { return false; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getObject() { return null; }
    public boolean isExplicit() { return false; }
    boolean isParsed() { return false; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Object getBaseObject() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Object getExplicitBaseObject() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject getExplicitBaseTagged() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject getImplicitBaseTagged(int p0, int p1) { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getBaseUniversal(boolean p0, int p1) { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive getBaseUniversal(boolean p0, com.android.internal.org.bouncycastle.asn1.ASN1UniversalType p1) { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable parseBaseUniversal(boolean p0, int p1) throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable parseExplicitBaseObject() throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1TaggedObjectParser parseExplicitBaseTagged() throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1TaggedObjectParser parseImplicitBaseTagged(int p0, int p1) throws java.io.IOException { return null; }
    public final com.android.internal.org.bouncycastle.asn1.ASN1Primitive getLoadedObject() { return null; }
    abstract com.android.internal.org.bouncycastle.asn1.ASN1Sequence rebuildConstructed(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0);
    abstract com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject replaceTag(int p0, int p1);
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
    public java.lang.String toString() { return null; }
    static com.android.internal.org.bouncycastle.asn1.ASN1Primitive createConstructedDL(int p0, int p1, com.android.internal.org.bouncycastle.asn1.ASN1EncodableVector p2) { return null; }
    static com.android.internal.org.bouncycastle.asn1.ASN1Primitive createConstructedIL(int p0, int p1, com.android.internal.org.bouncycastle.asn1.ASN1EncodableVector p2) { return null; }
    static com.android.internal.org.bouncycastle.asn1.ASN1Primitive createPrimitive(int p0, int p1, byte[] p2) { return null; }
}
