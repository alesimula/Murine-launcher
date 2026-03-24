package com.android.internal.org.bouncycastle.crypto.engines;

class RSACoreEngine {
    private com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters key;
    private boolean forEncryption;
    RSACoreEngine() {}
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public int getInputBlockSize() { return 0; }
    public int getOutputBlockSize() { return 0; }
    public java.math.BigInteger convertInput(byte[] p0, int p1, int p2) { return null; }
    public byte[] convertOutput(java.math.BigInteger p0) { return null; }
    public java.math.BigInteger processBlock(java.math.BigInteger p0) { return null; }
}
