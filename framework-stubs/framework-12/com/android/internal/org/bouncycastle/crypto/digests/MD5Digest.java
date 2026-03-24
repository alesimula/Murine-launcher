package com.android.internal.org.bouncycastle.crypto.digests;

public class MD5Digest extends com.android.internal.org.bouncycastle.crypto.digests.GeneralDigest implements com.android.internal.org.bouncycastle.crypto.digests.EncodableDigest {
    private static final int DIGEST_LENGTH = 16;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int[] X;
    private int xOff;
    private static final int S11 = 7;
    private static final int S12 = 12;
    private static final int S13 = 17;
    private static final int S14 = 22;
    private static final int S21 = 5;
    private static final int S22 = 9;
    private static final int S23 = 14;
    private static final int S24 = 20;
    private static final int S31 = 4;
    private static final int S32 = 11;
    private static final int S33 = 16;
    private static final int S34 = 23;
    private static final int S41 = 6;
    private static final int S42 = 10;
    private static final int S43 = 15;
    private static final int S44 = 21;
    public MD5Digest() { super(); }
    public MD5Digest(byte[] p0) { super(); }
    public MD5Digest(com.android.internal.org.bouncycastle.crypto.digests.MD5Digest p0) { super(); }
    private void copyIn(com.android.internal.org.bouncycastle.crypto.digests.MD5Digest p0) {}
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
    private int K(int p0, int p1, int p2) { return 0; }
    protected void processBlock() {}
    public com.android.internal.org.bouncycastle.util.Memoable copy() { return null; }
    public void reset(com.android.internal.org.bouncycastle.util.Memoable p0) {}
    public byte[] getEncodedState() { return null; }
}
