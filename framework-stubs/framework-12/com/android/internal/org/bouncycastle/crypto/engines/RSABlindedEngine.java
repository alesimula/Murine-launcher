package com.android.internal.org.bouncycastle.crypto.engines;

public class RSABlindedEngine implements com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher {
    private static final java.math.BigInteger ONE = null;
    private com.android.internal.org.bouncycastle.crypto.engines.RSACoreEngine core;
    private com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters key;
    private java.security.SecureRandom random;
    public RSABlindedEngine() {}
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public int getInputBlockSize() { return 0; }
    public int getOutputBlockSize() { return 0; }
    public byte[] processBlock(byte[] p0, int p1, int p2) { return null; }
}
