package com.android.internal.org.bouncycastle.crypto.signers;

public interface DSAEncoding {
    public java.math.BigInteger[] decode(java.math.BigInteger p0, byte[] p1) throws java.io.IOException;
    public byte[] encode(java.math.BigInteger p0, java.math.BigInteger p1, java.math.BigInteger p2) throws java.io.IOException;
}
