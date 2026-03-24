package com.android.internal.org.bouncycastle.crypto.digests;

public abstract class LongDigest implements com.android.internal.org.bouncycastle.crypto.ExtendedDigest, com.android.internal.org.bouncycastle.util.Memoable, com.android.internal.org.bouncycastle.crypto.digests.EncodableDigest {
    protected long H1;
    protected long H2;
    protected long H3;
    protected long H4;
    protected long H5;
    protected long H6;
    protected long H7;
    protected long H8;
    static final long[] K = null;
    protected LongDigest() {}
    protected LongDigest(com.android.internal.org.bouncycastle.crypto.digests.LongDigest p0) {}
    protected void copyIn(com.android.internal.org.bouncycastle.crypto.digests.LongDigest p0) {}
    protected void populateState(byte[] p0) {}
    protected void restoreState(byte[] p0) {}
    protected int getEncodedStateSize() { return 0; }
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}
    public void finish() {}
    public void reset() {}
    public int getByteLength() { return 0; }
    protected void processWord(byte[] p0, int p1) {}
    protected void processLength(long p0, long p1) {}
    protected void processBlock() {}
}
