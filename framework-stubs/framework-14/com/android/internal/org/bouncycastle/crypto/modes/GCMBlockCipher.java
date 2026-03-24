package com.android.internal.org.bouncycastle.crypto.modes;

public class GCMBlockCipher implements com.android.internal.org.bouncycastle.crypto.modes.AEADBlockCipher {
    public GCMBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) {}
    public GCMBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, com.android.internal.org.bouncycastle.crypto.modes.gcm.GCMMultiplier p1) {}
    public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() { return null; }
    public java.lang.String getAlgorithmName() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public byte[] getMac() { return null; }
    public int getOutputSize(int p0) { return 0; }
    public int getUpdateOutputSize(int p0) { return 0; }
    public void processAADByte(byte p0) {}
    public void processAADBytes(byte[] p0, int p1, int p2) {}
    public int processByte(byte p0, byte[] p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public int doFinal(byte[] p0, int p1) throws java.lang.IllegalStateException, com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return 0; }
    public void reset() {}
}
