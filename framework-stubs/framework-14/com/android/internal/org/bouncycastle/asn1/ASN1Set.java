package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1Set extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive implements com.android.internal.org.bouncycastle.util.Iterable<com.android.internal.org.bouncycastle.asn1.ASN1Encodable> {
    protected final com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] elements = null;
    protected final boolean isSorted = false;
    public static com.android.internal.org.bouncycastle.asn1.ASN1Set getInstance(java.lang.Object p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1Set getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    protected ASN1Set() { super(); }
    protected ASN1Set(com.android.internal.org.bouncycastle.asn1.ASN1Encodable p0) { super(); }
    protected ASN1Set(com.android.internal.org.bouncycastle.asn1.ASN1EncodableVector p0, boolean p1) { super(); }
    protected ASN1Set(com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] p0, boolean p1) { super(); }
    ASN1Set(boolean p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] p1) { super(); }
    public java.util.Enumeration getObjects() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getObjectAt(int p0) { return null; }
    public int size() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] toArray() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1SetParser parser() { return null; }
    public int hashCode() { return 0; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    boolean isConstructed() { return false; }
    abstract void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException;
    public java.lang.String toString() { return null; }
    public java.util.Iterator<com.android.internal.org.bouncycastle.asn1.ASN1Encodable> iterator() { return null; }
}
