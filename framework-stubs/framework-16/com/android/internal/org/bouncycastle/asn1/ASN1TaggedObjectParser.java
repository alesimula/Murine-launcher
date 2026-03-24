package com.android.internal.org.bouncycastle.asn1;

public interface ASN1TaggedObjectParser extends com.android.internal.org.bouncycastle.asn1.ASN1Encodable, com.android.internal.org.bouncycastle.asn1.InMemoryRepresentable {
    public int getTagClass();
    public int getTagNo();
    public boolean hasContextTag();
    public boolean hasContextTag(int p0);
    public boolean hasTag(int p0, int p1);
    public boolean hasTagClass(int p0);
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable parseBaseUniversal(boolean p0, int p1) throws java.io.IOException;
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable parseExplicitBaseObject() throws java.io.IOException;
    public com.android.internal.org.bouncycastle.asn1.ASN1TaggedObjectParser parseExplicitBaseTagged() throws java.io.IOException;
    public com.android.internal.org.bouncycastle.asn1.ASN1TaggedObjectParser parseImplicitBaseTagged(int p0, int p1) throws java.io.IOException;
}
