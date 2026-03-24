package com.android.internal.org.bouncycastle.crypto.digests;

public abstract class HarakaBase implements com.android.internal.org.bouncycastle.crypto.Digest {
    protected static final int DIGEST_SIZE = 32;
    static final byte[][] RC = null;
    public HarakaBase() {}
    static byte sBox(byte p0) { return 0; }
    static byte[] subBytes(byte[] p0) { return null; }
    static byte[] shiftRows(byte[] p0) { return null; }
    static byte[] aesEnc(byte[] p0, byte[] p1) { return null; }
    static byte mulX(byte p0) { return 0; }
    public int getDigestSize() { return 0; }
}
