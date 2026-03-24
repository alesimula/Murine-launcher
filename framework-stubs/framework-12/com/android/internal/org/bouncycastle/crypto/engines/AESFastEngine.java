package com.android.internal.org.bouncycastle.crypto.engines;

public class AESFastEngine implements com.android.internal.org.bouncycastle.crypto.BlockCipher {
    private static final byte[] S = null;
    private static final byte[] Si = null;
    private static final int[] rcon = null;
    private static final int[] T = null;
    private static final int[] Tinv = null;
    private static final int m1 = -2139062144;
    private static final int m2 = 2139062143;
    private static final int m3 = 27;
    private static final int m4 = -1061109568;
    private static final int m5 = 1061109567;
    private int ROUNDS;
    private int[][] WorkingKey;
    private int C0;
    private int C1;
    private int C2;
    private int C3;
    private boolean forEncryption;
    private static final int BLOCK_SIZE = 16;
    private static int shift(int p0, int p1) { return 0; }
    private static int FFmulX(int p0) { return 0; }
    private static int FFmulX2(int p0) { return 0; }
    private static int inv_mcol(int p0) { return 0; }
    private static int subWord(int p0) { return 0; }
    private int[][] generateWorkingKey(byte[] p0, boolean p1) { return null; }
    public AESFastEngine() {}
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public java.lang.String getAlgorithmName() { return null; }
    public int getBlockSize() { return 0; }
    public int processBlock(byte[] p0, int p1, byte[] p2, int p3) { return 0; }
    public void reset() {}
    private void unpackBlock(byte[] p0, int p1) {}
    private void packBlock(byte[] p0, int p1) {}
    private void encryptBlock(int[][] p0) {}
    private void decryptBlock(int[][] p0) {}
}
