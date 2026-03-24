package com.android.internal.org.bouncycastle.crypto.modes;

public class CCMBlockCipher implements com.android.internal.org.bouncycastle.crypto.modes.AEADBlockCipher {
    private com.android.internal.org.bouncycastle.crypto.BlockCipher cipher;
    private int blockSize;
    private boolean forEncryption;
    private byte[] nonce;
    private byte[] initialAssociatedText;
    private int macSize;
    private com.android.internal.org.bouncycastle.crypto.CipherParameters keyParam;
    private byte[] macBlock;
    private com.android.internal.org.bouncycastle.crypto.modes.CCMBlockCipher.ExposedByteArrayOutputStream associatedText;
    private com.android.internal.org.bouncycastle.crypto.modes.CCMBlockCipher.ExposedByteArrayOutputStream data;
    public CCMBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) {}
    public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public java.lang.String getAlgorithmName() { return null; }
    public void processAADByte(byte p0) {}
    public void processAADBytes(byte[] p0, int p1, int p2) {}
    public int processByte(byte p0, byte[] p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public int doFinal(byte[] p0, int p1) throws java.lang.IllegalStateException, com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return 0; }
    public void reset() {}
    public byte[] getMac() { return null; }
    public int getUpdateOutputSize(int p0) { return 0; }
    public int getOutputSize(int p0) { return 0; }
    public byte[] processPacket(byte[] p0, int p1, int p2) throws java.lang.IllegalStateException, com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
    public int processPacket(byte[] p0, int p1, int p2, byte[] p3, int p4) throws java.lang.IllegalStateException, com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException, com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    private int calculateMac(byte[] p0, int p1, int p2, byte[] p3) { return 0; }
    private int getMacSize(boolean p0, int p1) { return 0; }
    private int getAssociatedTextLength() { return 0; }
    private boolean hasAssociatedText() { return false; }

    private class ExposedByteArrayOutputStream extends java.io.ByteArrayOutputStream {
        public ExposedByteArrayOutputStream(com.android.internal.org.bouncycastle.crypto.modes.CCMBlockCipher p0) { super(); }
        public byte[] getBuffer() { return null; }
    }
}
