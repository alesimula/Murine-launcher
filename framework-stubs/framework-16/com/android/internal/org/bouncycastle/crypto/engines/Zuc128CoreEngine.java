package com.android.internal.org.bouncycastle.crypto.engines;

public class Zuc128CoreEngine implements com.android.internal.org.bouncycastle.crypto.StreamCipher, com.android.internal.org.bouncycastle.util.Memoable {
    protected Zuc128CoreEngine() {}
    protected Zuc128CoreEngine(com.android.internal.org.bouncycastle.crypto.engines.Zuc128CoreEngine p0) {}
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    protected int getMaxIterations() { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) { return 0; }
    public void reset() {}
    public byte returnByte(byte p0) { return 0; }
    public static void encode32be(int p0, byte[] p1, int p2) {}
    static int ROT(int p0, int p1) { return 0; }
    int F() { return 0; }
    protected void setKeyAndIV(int[] p0, byte[] p1, byte[] p2) {}
    protected int makeKeyStreamWord() { return 0; }
    public com.android.internal.org.bouncycastle.util.Memoable copy() { return null; }
    public void reset(com.android.internal.org.bouncycastle.util.Memoable p0) {}
}
