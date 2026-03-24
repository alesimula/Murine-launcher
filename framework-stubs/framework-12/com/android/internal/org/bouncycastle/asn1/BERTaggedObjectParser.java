package com.android.internal.org.bouncycastle.asn1;

public class BERTaggedObjectParser implements com.android.internal.org.bouncycastle.asn1.ASN1TaggedObjectParser {
    private boolean _constructed;
    private int _tagNumber;
    private com.android.internal.org.bouncycastle.asn1.ASN1StreamParser _parser;
    BERTaggedObjectParser(boolean p0, int p1, com.android.internal.org.bouncycastle.asn1.ASN1StreamParser p2) {}
    public boolean isConstructed() { return false; }
    public int getTagNo() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getObjectParser(int p0, boolean p1) throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getLoadedObject() throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
