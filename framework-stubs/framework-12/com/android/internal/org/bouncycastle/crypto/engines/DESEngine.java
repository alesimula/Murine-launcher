package com.android.internal.org.bouncycastle.crypto.engines;

public class DESEngine implements com.android.internal.org.bouncycastle.crypto.BlockCipher {
    protected static final int BLOCK_SIZE = 8;
    private int[] workingKey;
    private static final short[] bytebit = null;
    private static final int[] bigbyte = null;
    private static final byte[] pc1 = null;
    private static final byte[] totrot = null;
    private static final byte[] pc2 = null;
    private static final int[] SP1 = null;
    private static final int[] SP2 = null;
    private static final int[] SP3 = null;
    private static final int[] SP4 = null;
    private static final int[] SP5 = null;
    private static final int[] SP6 = null;
    private static final int[] SP7 = null;
    private static final int[] SP8 = null;
    public DESEngine() {}
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public java.lang.String getAlgorithmName() { return null; }
    public int getBlockSize() { return 0; }
    public int processBlock(byte[] p0, int p1, byte[] p2, int p3) { return 0; }
    public void reset() {}
    protected int[] generateWorkingKey(boolean p0, byte[] p1) { return null; }
    protected void desFunc(int[] p0, byte[] p1, int p2, byte[] p3, int p4) {}
}
