package com.android.internal.org.bouncycastle.asn1.x509;

public class KeyUsage extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    public static final int digitalSignature = 128;
    public static final int nonRepudiation = 64;
    public static final int keyEncipherment = 32;
    public static final int dataEncipherment = 16;
    public static final int keyAgreement = 8;
    public static final int keyCertSign = 4;
    public static final int cRLSign = 2;
    public static final int encipherOnly = 1;
    public static final int decipherOnly = 32768;
    public static com.android.internal.org.bouncycastle.asn1.x509.KeyUsage getInstance(java.lang.Object p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.KeyUsage fromExtensions(com.android.internal.org.bouncycastle.asn1.x509.Extensions p0) { return null; }
    public KeyUsage(int p0) { super(); }
    public boolean hasUsages(int p0) { return false; }
    public byte[] getBytes() { return null; }
    public int getPadBits() { return 0; }
    public java.lang.String toString() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
