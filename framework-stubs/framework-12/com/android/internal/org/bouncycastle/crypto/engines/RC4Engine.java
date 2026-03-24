package com.android.internal.org.bouncycastle.crypto.engines;

public class RC4Engine implements com.android.internal.org.bouncycastle.crypto.StreamCipher {
    private static final int STATE_LENGTH = 256;
    private byte[] engineState;
    private int x;
    private int y;
    private byte[] workingKey;
    public RC4Engine() {}
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public java.lang.String getAlgorithmName() { return null; }
    public byte returnByte(byte p0) { return 0; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) { return 0; }
    public void reset() {}
    private void setKey(byte[] p0) {}
}
