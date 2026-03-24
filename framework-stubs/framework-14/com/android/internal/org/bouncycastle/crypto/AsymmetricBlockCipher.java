package com.android.internal.org.bouncycastle.crypto;

public interface AsymmetricBlockCipher {
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1);
    public int getInputBlockSize();
    public int getOutputBlockSize();
    public byte[] processBlock(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException;
}
