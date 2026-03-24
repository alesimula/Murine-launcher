package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util;

public interface DSAEncoder {
    public byte[] encode(java.math.BigInteger p0, java.math.BigInteger p1) throws java.io.IOException;
    public java.math.BigInteger[] decode(byte[] p0) throws java.io.IOException;
}
