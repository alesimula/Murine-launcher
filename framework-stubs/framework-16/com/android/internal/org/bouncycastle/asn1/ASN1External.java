package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1External extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive {
    static final com.android.internal.org.bouncycastle.asn1.ASN1UniversalType TYPE = null;
    com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier directReference;
    com.android.internal.org.bouncycastle.asn1.ASN1Integer indirectReference;
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive dataValueDescriptor;
    int encoding;
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive externalContent;
    public static com.android.internal.org.bouncycastle.asn1.ASN1External getInstance(java.lang.Object p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1External getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    ASN1External(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    ASN1External(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Integer p1, com.android.internal.org.bouncycastle.asn1.ASN1Primitive p2, com.android.internal.org.bouncycastle.asn1.DERTaggedObject p3) { super(); }
    ASN1External(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Integer p1, com.android.internal.org.bouncycastle.asn1.ASN1Primitive p2, int p3, com.android.internal.org.bouncycastle.asn1.ASN1Primitive p4) { super(); }
    abstract com.android.internal.org.bouncycastle.asn1.ASN1Sequence buildSequence();
    int encodedLength(boolean p0) throws java.io.IOException { return 0; }
    void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException {}
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
    public int hashCode() { return 0; }
    boolean encodeConstructed() { return false; }
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getDataValueDescriptor() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getDirectReference() { return null; }
    public int getEncoding() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getExternalContent() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getIndirectReference() { return null; }
}
