package com.android.internal.org.bouncycastle.crypto;

public interface MultiBlockCipher extends com.android.internal.org.bouncycastle.crypto.BlockCipher {
    public int getMultiBlockSize();
    public int processBlocks(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException;
}
