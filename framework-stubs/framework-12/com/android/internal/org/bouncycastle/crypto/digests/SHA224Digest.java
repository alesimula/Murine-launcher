package com.android.internal.org.bouncycastle.crypto.digests;

public class SHA224Digest extends com.android.internal.org.bouncycastle.crypto.digests.GeneralDigest implements com.android.internal.org.bouncycastle.crypto.digests.EncodableDigest {
    private static final int DIGEST_LENGTH = 28;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int H6;
    private int H7;
    private int H8;
    private int[] X;
    private int xOff;
    static final int[] K = null;
    public SHA224Digest() { super(); }
    public SHA224Digest(com.android.internal.org.bouncycastle.crypto.digests.SHA224Digest p0) { super(); }
    private void doCopy(com.android.internal.org.bouncycastle.crypto.digests.SHA224Digest p0) {}
    public SHA224Digest(byte[] p0) { super(); }
    public java.lang.String getAlgorithmName() { return null; }
    public int getDigestSize() { return 0; }
    protected void processWord(byte[] p0, int p1) {}
    protected void processLength(long p0) {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public void reset() {}
    protected void processBlock() {}
    private int Ch(int p0, int p1, int p2) { return 0; }
    private int Maj(int p0, int p1, int p2) { return 0; }
    private int Sum0(int p0) { return 0; }
    private int Sum1(int p0) { return 0; }
    private int Theta0(int p0) { return 0; }
    private int Theta1(int p0) { return 0; }
    public com.android.internal.org.bouncycastle.util.Memoable copy() { return null; }
    public void reset(com.android.internal.org.bouncycastle.util.Memoable p0) {}
    public byte[] getEncodedState() { return null; }
}
