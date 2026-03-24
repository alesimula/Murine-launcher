package com.android.internal.org.bouncycastle.crypto.engines;

public class DESedeEngine extends com.android.internal.org.bouncycastle.crypto.engines.DESEngine {
    protected static final int BLOCK_SIZE = 8;
    private int[] workingKey1;
    private int[] workingKey2;
    private int[] workingKey3;
    private boolean forEncryption;
    public DESedeEngine() { super(); }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public java.lang.String getAlgorithmName() { return null; }
    public int getBlockSize() { return 0; }
    public int processBlock(byte[] p0, int p1, byte[] p2, int p3) { return 0; }
    public void reset() {}
}
