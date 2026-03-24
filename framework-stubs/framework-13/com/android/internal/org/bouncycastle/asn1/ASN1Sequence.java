package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1Sequence extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive implements com.android.internal.org.bouncycastle.util.Iterable<com.android.internal.org.bouncycastle.asn1.ASN1Encodable> {
    com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] elements;
    public static com.android.internal.org.bouncycastle.asn1.ASN1Sequence getInstance(java.lang.Object p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1Sequence getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    protected ASN1Sequence() { super(); }
    protected ASN1Sequence(com.android.internal.org.bouncycastle.asn1.ASN1Encodable p0) { super(); }
    protected ASN1Sequence(com.android.internal.org.bouncycastle.asn1.ASN1EncodableVector p0) { super(); }
    protected ASN1Sequence(com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] p0) { super(); }
    ASN1Sequence(com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] p0, boolean p1) { super(); }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] toArray() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] toArrayInternal() { return null; }
    public java.util.Enumeration getObjects() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1SequenceParser parser() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getObjectAt(int p0) { return null; }
    public int size() { return 0; }
    public int hashCode() { return 0; }
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
    boolean isConstructed() { return false; }
    abstract void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException;
    public java.lang.String toString() { return null; }
    public java.util.Iterator<com.android.internal.org.bouncycastle.asn1.ASN1Encodable> iterator() { return null; }
}
