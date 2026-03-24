package com.android.internal.org.bouncycastle.crypto.macs;

public class HMac implements com.android.internal.org.bouncycastle.crypto.Mac {
    private static final byte IPAD = 54;
    private static final byte OPAD = 92;
    private com.android.internal.org.bouncycastle.crypto.Digest digest;
    private int digestSize;
    private int blockLength;
    private com.android.internal.org.bouncycastle.util.Memoable ipadState;
    private com.android.internal.org.bouncycastle.util.Memoable opadState;
    private byte[] inputPad;
    private byte[] outputBuf;
    private static java.util.Hashtable blockLengths;
    private static int getByteLength(com.android.internal.org.bouncycastle.crypto.Digest p0) { return 0; }
    public HMac(com.android.internal.org.bouncycastle.crypto.Digest p0) {}
    private HMac(com.android.internal.org.bouncycastle.crypto.Digest p0, int p1) {}
    public java.lang.String getAlgorithmName() { return null; }
    public com.android.internal.org.bouncycastle.crypto.Digest getUnderlyingDigest() { return null; }
    public void init(com.android.internal.org.bouncycastle.crypto.CipherParameters p0) {}
    public int getMacSize() { return 0; }
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public void reset() {}
    private static void xorPad(byte[] p0, int p1, byte p2) {}
}
