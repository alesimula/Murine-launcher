package com.android.internal.org.bouncycastle.crypto.modes;

public class CBCBlockCipher implements com.android.internal.org.bouncycastle.crypto.BlockCipher {
    private byte[] IV;
    private byte[] cbcV;
    private byte[] cbcNextV;
    private int blockSize;
    private com.android.internal.org.bouncycastle.crypto.BlockCipher cipher;
    private boolean encrypting;
    public CBCBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) {}
    public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public java.lang.String getAlgorithmName() { return null; }
    public int getBlockSize() { return 0; }
    public int processBlock(byte[] p0, int p1, byte[] p2, int p3) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public void reset() {}
    private int encryptBlock(byte[] p0, int p1, byte[] p2, int p3) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    private int decryptBlock(byte[] p0, int p1, byte[] p2, int p3) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
}
