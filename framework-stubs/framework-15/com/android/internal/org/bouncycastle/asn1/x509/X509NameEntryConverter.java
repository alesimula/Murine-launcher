package com.android.internal.org.bouncycastle.asn1.x509;

public abstract class X509NameEntryConverter {
    public X509NameEntryConverter() {}
    protected com.android.internal.org.bouncycastle.asn1.ASN1Primitive convertHexEncoded(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    protected boolean canBePrintable(java.lang.String p0) { return false; }
    public abstract com.android.internal.org.bouncycastle.asn1.ASN1Primitive getConvertedValue(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1);
}
