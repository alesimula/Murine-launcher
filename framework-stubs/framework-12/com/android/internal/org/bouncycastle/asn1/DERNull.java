package com.android.internal.org.bouncycastle.asn1;

public class DERNull extends com.android.internal.org.bouncycastle.asn1.ASN1Null {
    public static final com.android.internal.org.bouncycastle.asn1.DERNull INSTANCE = null;
    private static final byte[] zeroBytes = null;
    private DERNull() { super(); }
    boolean isConstructed() { return false; }
    int encodedLength() { return 0; }
    void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException {}
}
