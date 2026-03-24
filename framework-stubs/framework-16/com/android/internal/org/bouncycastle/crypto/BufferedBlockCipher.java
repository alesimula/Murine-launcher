package com.android.internal.org.bouncycastle.crypto;

public class BufferedBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    protected boolean forEncryption;
    protected com.android.internal.org.bouncycastle.crypto.BlockCipher cipher;
    protected com.android.internal.org.bouncycastle.crypto.MultiBlockCipher mbCipher;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;
    BufferedBlockCipher() {}
    public BufferedBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) {}
    public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public int getBlockSize() { return 0; }
    public int getUpdateOutputSize(int p0) { return 0; }
    public int getOutputSize(int p0) { return 0; }
    public int processByte(byte p0, byte[] p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public int doFinal(byte[] p0, int p1) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException, com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return 0; }
    public void reset() {}
}
