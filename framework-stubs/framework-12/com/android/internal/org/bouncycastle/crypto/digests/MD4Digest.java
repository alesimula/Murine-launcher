package com.android.internal.org.bouncycastle.crypto.digests;

public class MD4Digest extends com.android.internal.org.bouncycastle.crypto.digests.GeneralDigest {
    private static final int DIGEST_LENGTH = 16;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int[] X;
    private int xOff;
    private static final int S11 = 3;
    private static final int S12 = 7;
    private static final int S13 = 11;
    private static final int S14 = 19;
    private static final int S21 = 3;
    private static final int S22 = 5;
    private static final int S23 = 9;
    private static final int S24 = 13;
    private static final int S31 = 3;
    private static final int S32 = 9;
    private static final int S33 = 11;
    private static final int S34 = 15;
    public MD4Digest() { super(); }
    public MD4Digest(com.android.internal.org.bouncycastle.crypto.digests.MD4Digest p0) { super(); }
    private void copyIn(com.android.internal.org.bouncycastle.crypto.digests.MD4Digest p0) {}
    public java.lang.String getAlgorithmName() { return null; }
    public int getDigestSize() { return 0; }
    protected void processWord(byte[] p0, int p1) {}
    protected void processLength(long p0) {}
    private void unpackWord(int p0, byte[] p1, int p2) {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public void reset() {}
    private int rotateLeft(int p0, int p1) { return 0; }
    private int F(int p0, int p1, int p2) { return 0; }
    private int G(int p0, int p1, int p2) { return 0; }
    private int H(int p0, int p1, int p2) { return 0; }
    protected void processBlock() {}
    public com.android.internal.org.bouncycastle.util.Memoable copy() { return null; }
    public void reset(com.android.internal.org.bouncycastle.util.Memoable p0) {}
}
