package com.android.internal.org.bouncycastle.asn1;

public class ASN1Integer extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive {
    static final int SIGN_EXT_SIGNED = -1;
    static final int SIGN_EXT_UNSIGNED = 255;
    private final byte[] bytes = null;
    private final int start = 0;
    public static com.android.internal.org.bouncycastle.asn1.ASN1Integer getInstance(java.lang.Object p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1Integer getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public ASN1Integer(long p0) { super(); }
    public ASN1Integer(java.math.BigInteger p0) { super(); }
    public ASN1Integer(byte[] p0) { super(); }
    ASN1Integer(byte[] p0, boolean p1) { super(); }
    public java.math.BigInteger getPositiveValue() { return null; }
    public java.math.BigInteger getValue() { return null; }
    public boolean hasValue(java.math.BigInteger p0) { return false; }
    public int intPositiveValueExact() { return 0; }
    public int intValueExact() { return 0; }
    public long longValueExact() { return 0L; }
    boolean isConstructed() { return false; }
    int encodedLength() { return 0; }
    void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException {}
    public int hashCode() { return 0; }
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    public java.lang.String toString() { return null; }
    static int intValue(byte[] p0, int p1, int p2) { return 0; }
    static long longValue(byte[] p0, int p1, int p2) { return 0L; }
    static boolean isMalformed(byte[] p0) { return false; }
    static int signBytesToSkip(byte[] p0) { return 0; }
}
