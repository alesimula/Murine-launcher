package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1External extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive {
    protected com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier directReference;
    protected com.android.internal.org.bouncycastle.asn1.ASN1Integer indirectReference;
    protected com.android.internal.org.bouncycastle.asn1.ASN1Primitive dataValueDescriptor;
    protected int encoding;
    protected com.android.internal.org.bouncycastle.asn1.ASN1Primitive externalContent;
    public ASN1External(com.android.internal.org.bouncycastle.asn1.ASN1EncodableVector p0) { super(); }
    public ASN1External(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Integer p1, com.android.internal.org.bouncycastle.asn1.ASN1Primitive p2, com.android.internal.org.bouncycastle.asn1.DERTaggedObject p3) { super(); }
    public ASN1External(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Integer p1, com.android.internal.org.bouncycastle.asn1.ASN1Primitive p2, int p3, com.android.internal.org.bouncycastle.asn1.ASN1Primitive p4) { super(); }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
    public int hashCode() { return 0; }
    boolean isConstructed() { return false; }
    int encodedLength() throws java.io.IOException { return 0; }
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getDataValueDescriptor() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getDirectReference() { return null; }
    public int getEncoding() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getExternalContent() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getIndirectReference() { return null; }
}
