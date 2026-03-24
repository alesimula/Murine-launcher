package com.android.internal.org.bouncycastle.crypto.modes;

public class GCMSIVBlockCipher implements com.android.internal.org.bouncycastle.crypto.modes.AEADBlockCipher {
    public GCMSIVBlockCipher() {}
    public GCMSIVBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) {}
    public GCMSIVBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, com.android.internal.org.bouncycastle.crypto.modes.gcm.GCMMultiplier p1) {}
    public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public java.lang.String getAlgorithmName() { return null; }
    public void processAADByte(byte p0) {}
    public void processAADBytes(byte[] p0, int p1, int p2) {}
    public int processByte(byte p0, byte[] p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public int doFinal(byte[] p0, int p1) throws java.lang.IllegalStateException, com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return 0; }
    public byte[] getMac() { return null; }
    public int getUpdateOutputSize(int p0) { return 0; }
    public int getOutputSize(int p0) { return 0; }
    public void reset() {}

    private static class GCMSIVCache extends java.io.ByteArrayOutputStream {
        GCMSIVCache() { super(); }
        byte[] getBuffer() { return null; }
        void clearBuffer() {}
    }

    private class GCMSIVHasher {
        long getBytesProcessed() { return 0L; }
        void reset() {}
        void updateHash(byte p0) {}
        void updateHash(byte[] p0, int p1, int p2) {}
        void completeHash() {}
    }
}
