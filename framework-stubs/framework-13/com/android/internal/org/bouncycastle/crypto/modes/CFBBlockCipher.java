package com.android.internal.org.bouncycastle.crypto.modes;

public class CFBBlockCipher extends com.android.internal.org.bouncycastle.crypto.StreamBlockCipher {
    public CFBBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, int p1) { super(null); }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public java.lang.String getAlgorithmName() { return null; }
    protected byte calculateByte(byte p0) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public int getBlockSize() { return 0; }
    public int processBlock(byte[] p0, int p1, byte[] p2, int p3) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public int encryptBlock(byte[] p0, int p1, byte[] p2, int p3) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public int decryptBlock(byte[] p0, int p1, byte[] p2, int p3) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public byte[] getCurrentIV() { return null; }
    public void reset() {}
}
