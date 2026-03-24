package com.android.internal.org.bouncycastle.asn1;

public interface ASN1TaggedObjectParser extends com.android.internal.org.bouncycastle.asn1.ASN1Encodable, com.android.internal.org.bouncycastle.asn1.InMemoryRepresentable {
    public int getTagNo();
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getObjectParser(int p0, boolean p1) throws java.io.IOException;
}
