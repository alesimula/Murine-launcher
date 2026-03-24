package com.android.internal.org.bouncycastle.crypto.digests;

public class XoodyakDigest implements com.android.internal.org.bouncycastle.crypto.Digest {
    public XoodyakDigest() {}
    public java.lang.String getAlgorithmName() { return null; }
    public int getDigestSize() { return 0; }
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public void reset() {}
    void Down(byte[] p0, int p1, int p2, int p3) {}

    static enum MODE {
        ModeHash,
        ModeKeyed;
    }
}
