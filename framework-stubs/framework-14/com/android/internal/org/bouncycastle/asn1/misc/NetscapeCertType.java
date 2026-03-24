package com.android.internal.org.bouncycastle.asn1.misc;

public class NetscapeCertType extends com.android.internal.org.bouncycastle.asn1.DERBitString {
    public static final int sslClient = 128;
    public static final int sslServer = 64;
    public static final int smime = 32;
    public static final int objectSigning = 16;
    public static final int reserved = 8;
    public static final int sslCA = 4;
    public static final int smimeCA = 2;
    public static final int objectSigningCA = 1;
    public NetscapeCertType(int p0) { super((byte[])null); }
    public NetscapeCertType(com.android.internal.org.bouncycastle.asn1.DERBitString p0) { super((byte[])null); }
    public java.lang.String toString() { return null; }
}
