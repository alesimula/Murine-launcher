package com.android.internal.org.bouncycastle.asn1;

public interface ASN1BitStringParser extends com.android.internal.org.bouncycastle.asn1.ASN1Encodable, com.android.internal.org.bouncycastle.asn1.InMemoryRepresentable {
    public java.io.InputStream getBitStream() throws java.io.IOException;
    public java.io.InputStream getOctetStream() throws java.io.IOException;
    public int getPadBits();
}
