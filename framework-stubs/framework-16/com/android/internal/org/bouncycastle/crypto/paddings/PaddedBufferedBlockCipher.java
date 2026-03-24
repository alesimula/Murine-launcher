package com.android.internal.org.bouncycastle.crypto.paddings;

public class PaddedBufferedBlockCipher extends com.android.internal.org.bouncycastle.crypto.DefaultBufferedBlockCipher {
    com.android.internal.org.bouncycastle.crypto.paddings.BlockCipherPadding padding;
    public PaddedBufferedBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, com.android.internal.org.bouncycastle.crypto.paddings.BlockCipherPadding p1) { super(); }
    public PaddedBufferedBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) { super(); }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public int getOutputSize(int p0) { return 0; }
    public int getUpdateOutputSize(int p0) { return 0; }
    public int processByte(byte p0, byte[] p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public int doFinal(byte[] p0, int p1) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException, com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return 0; }
}
