package com.android.internal.org.bouncycastle.crypto.signers;

public class DSASigner implements com.android.internal.org.bouncycastle.crypto.DSAExt {
    public DSASigner() {}
    public DSASigner(com.android.internal.org.bouncycastle.crypto.signers.DSAKCalculator p0) {}
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public java.math.BigInteger getOrder() { return null; }
    public java.math.BigInteger[] generateSignature(byte[] p0) { return null; }
    public boolean verifySignature(byte[] p0, java.math.BigInteger p1, java.math.BigInteger p2) { return false; }
    protected java.security.SecureRandom initSecureRandom(boolean p0, java.security.SecureRandom p1) { return null; }
}
