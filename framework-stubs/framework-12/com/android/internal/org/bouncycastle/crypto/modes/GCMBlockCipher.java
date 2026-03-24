package com.android.internal.org.bouncycastle.crypto.modes;

public class GCMBlockCipher implements com.android.internal.org.bouncycastle.crypto.modes.AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final long MAX_INPUT_SIZE = 68719476704L;
    private com.android.internal.org.bouncycastle.crypto.BlockCipher cipher;
    private com.android.internal.org.bouncycastle.crypto.modes.gcm.GCMMultiplier multiplier;
    private com.android.internal.org.bouncycastle.crypto.modes.gcm.GCMExponentiator exp;
    private boolean forEncryption;
    private boolean initialised;
    private int macSize;
    private byte[] lastKey;
    private byte[] nonce;
    private byte[] initialAssociatedText;
    private byte[] H;
    private byte[] J0;
    private byte[] bufBlock;
    private byte[] macBlock;
    private byte[] S;
    private byte[] S_at;
    private byte[] S_atPre;
    private byte[] counter;
    private int blocksRemaining;
    private int bufOff;
    private long totalLength;
    private byte[] atBlock;
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    public GCMBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) {}
    public GCMBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, com.android.internal.org.bouncycastle.crypto.modes.gcm.GCMMultiplier p1) {}
    public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() { return null; }
    public java.lang.String getAlgorithmName() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public byte[] getMac() { return null; }
    public int getOutputSize(int p0) { return 0; }
    private long getTotalInputSizeAfterNewInput(int p0) { return 0L; }
    public int getUpdateOutputSize(int p0) { return 0; }
    public void processAADByte(byte p0) {}
    public void processAADBytes(byte[] p0, int p1, int p2) {}
    private void initCipher() {}
    public int processByte(byte p0, byte[] p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public int doFinal(byte[] p0, int p1) throws java.lang.IllegalStateException, com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return 0; }
    public void reset() {}
    private void reset(boolean p0) {}
    private void processBlock(byte[] p0, int p1, byte[] p2, int p3) {}
    private void processPartial(byte[] p0, int p1, int p2, byte[] p3, int p4) {}
    private void gHASH(byte[] p0, byte[] p1, int p2) {}
    private void gHASHBlock(byte[] p0, byte[] p1) {}
    private void gHASHBlock(byte[] p0, byte[] p1, int p2) {}
    private void gHASHPartial(byte[] p0, byte[] p1, int p2, int p3) {}
    private void getNextCTRBlock(byte[] p0) {}
    private void checkStatus() {}
}
