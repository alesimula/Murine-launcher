package com.android.internal.org.bouncycastle.crypto.signers;

public class DSASigner implements com.android.internal.org.bouncycastle.crypto.DSAExt {
    private final com.android.internal.org.bouncycastle.crypto.signers.DSAKCalculator kCalculator = null;
    private com.android.internal.org.bouncycastle.crypto.params.DSAKeyParameters key;
    private java.security.SecureRandom random;
    public DSASigner() {}
    public DSASigner(com.android.internal.org.bouncycastle.crypto.signers.DSAKCalculator p0) {}
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public java.math.BigInteger getOrder() { return null; }
    public java.math.BigInteger[] generateSignature(byte[] p0) { return null; }
    public boolean verifySignature(byte[] p0, java.math.BigInteger p1, java.math.BigInteger p2) { return false; }
    private java.math.BigInteger calculateE(java.math.BigInteger p0, byte[] p1) { return null; }
    protected java.security.SecureRandom initSecureRandom(boolean p0, java.security.SecureRandom p1) { return null; }
    private java.math.BigInteger getRandomizer(java.math.BigInteger p0, java.security.SecureRandom p1) { return null; }
}
