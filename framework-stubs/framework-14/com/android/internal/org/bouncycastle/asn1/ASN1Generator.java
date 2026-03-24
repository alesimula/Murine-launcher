package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1Generator {
    protected java.io.OutputStream _out;
    public ASN1Generator(java.io.OutputStream p0) {}
    public abstract java.io.OutputStream getRawOutputStream();
}
