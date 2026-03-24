package com.android.internal.org.bouncycastle.crypto.digests;

public abstract class GeneralDigest implements com.android.internal.org.bouncycastle.crypto.ExtendedDigest, com.android.internal.org.bouncycastle.util.Memoable {
    protected GeneralDigest() {}
    protected GeneralDigest(com.android.internal.org.bouncycastle.crypto.digests.GeneralDigest p0) {}
    protected GeneralDigest(byte[] p0) {}
    protected void copyIn(com.android.internal.org.bouncycastle.crypto.digests.GeneralDigest p0) {}
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}
    public void finish() {}
    public void reset() {}
    protected void populateState(byte[] p0) {}
    public int getByteLength() { return 0; }
    protected abstract void processWord(byte[] p0, int p1);
    protected abstract void processLength(long p0);
    protected abstract void processBlock();
}
