package com.android.internal.org.bouncycastle.crypto.signers;

public class RandomDSAKCalculator implements com.android.internal.org.bouncycastle.crypto.signers.DSAKCalculator {
    private static final java.math.BigInteger ZERO = null;
    private java.math.BigInteger q;
    private java.security.SecureRandom random;
    public RandomDSAKCalculator() {}
    public boolean isDeterministic() { return false; }
    public void init(java.math.BigInteger p0, java.security.SecureRandom p1) {}
    public void init(java.math.BigInteger p0, java.math.BigInteger p1, byte[] p2) {}
    public java.math.BigInteger nextK() { return null; }
}
