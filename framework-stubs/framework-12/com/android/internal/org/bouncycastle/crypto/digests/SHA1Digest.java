package com.android.internal.org.bouncycastle.crypto.digests;

public class SHA1Digest extends com.android.internal.org.bouncycastle.crypto.digests.GeneralDigest implements com.android.internal.org.bouncycastle.crypto.digests.EncodableDigest {
    private static final int DIGEST_LENGTH = 20;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int[] X;
    private int xOff;
    private static final int Y1 = 1518500249;
    private static final int Y2 = 1859775393;
    private static final int Y3 = -1894007588;
    private static final int Y4 = -899497514;
    public SHA1Digest() { super(); }
    public SHA1Digest(com.android.internal.org.bouncycastle.crypto.digests.SHA1Digest p0) { super(); }
    public SHA1Digest(byte[] p0) { super(); }
    private void copyIn(com.android.internal.org.bouncycastle.crypto.digests.SHA1Digest p0) {}
    public java.lang.String getAlgorithmName() { return null; }
    public int getDigestSize() { return 0; }
    protected void processWord(byte[] p0, int p1) {}
    protected void processLength(long p0) {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public void reset() {}
    private int f(int p0, int p1, int p2) { return 0; }
    private int h(int p0, int p1, int p2) { return 0; }
    private int g(int p0, int p1, int p2) { return 0; }
    protected void processBlock() {}
    public com.android.internal.org.bouncycastle.util.Memoable copy() { return null; }
    public void reset(com.android.internal.org.bouncycastle.util.Memoable p0) {}
    public byte[] getEncodedState() { return null; }
}
