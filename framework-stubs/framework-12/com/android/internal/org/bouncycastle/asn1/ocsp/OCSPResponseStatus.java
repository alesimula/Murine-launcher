package com.android.internal.org.bouncycastle.asn1.ocsp;

public class OCSPResponseStatus extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    public static final int SUCCESSFUL = 0;
    public static final int MALFORMED_REQUEST = 1;
    public static final int INTERNAL_ERROR = 2;
    public static final int TRY_LATER = 3;
    public static final int SIG_REQUIRED = 5;
    public static final int UNAUTHORIZED = 6;
    private com.android.internal.org.bouncycastle.asn1.ASN1Enumerated value;
    public OCSPResponseStatus(int p0) { super(); }
    private OCSPResponseStatus(com.android.internal.org.bouncycastle.asn1.ASN1Enumerated p0) { super(); }
    public static com.android.internal.org.bouncycastle.asn1.ocsp.OCSPResponseStatus getInstance(java.lang.Object p0) { return null; }
    public int getIntValue() { return 0; }
    public java.math.BigInteger getValue() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
