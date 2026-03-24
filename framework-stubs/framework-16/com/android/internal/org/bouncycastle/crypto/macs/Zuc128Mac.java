package com.android.internal.org.bouncycastle.crypto.macs;

public final class Zuc128Mac implements com.android.internal.org.bouncycastle.crypto.Mac {
    public Zuc128Mac() {}
    public java.lang.String getAlgorithmName() { return null; }
    public int getMacSize() { return 0; }
    public void init(com.android.internal.org.bouncycastle.crypto.CipherParameters p0) {}
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public void reset() {}

    private static class InternalZuc128Engine extends com.android.internal.org.bouncycastle.crypto.engines.Zuc128CoreEngine {
        int createKeyStreamWord() { return 0; }
    }
}
