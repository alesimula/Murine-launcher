package com.android.internal.org.bouncycastle.crypto;

public interface BlockCipher {
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException;
    public java.lang.String getAlgorithmName();
    public int getBlockSize();
    public int processBlock(byte[] p0, int p1, byte[] p2, int p3) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException;
    public void reset();
}
