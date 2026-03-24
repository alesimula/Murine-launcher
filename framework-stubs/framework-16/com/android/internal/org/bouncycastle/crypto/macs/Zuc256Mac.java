package com.android.internal.org.bouncycastle.crypto.macs;

public final class Zuc256Mac implements com.android.internal.org.bouncycastle.crypto.Mac {
    public Zuc256Mac(int p0) {}
    public java.lang.String getAlgorithmName() { return null; }
    public int getMacSize() { return 0; }
    public void init(com.android.internal.org.bouncycastle.crypto.CipherParameters p0) {}
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public void reset() {}

    private static class InternalZuc256Engine extends com.android.internal.org.bouncycastle.crypto.engines.Zuc256CoreEngine {
        public InternalZuc256Engine(int p0) { super(); }
        int createKeyStreamWord() { return 0; }
    }
}
