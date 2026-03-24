package com.android.internal.org.bouncycastle.crypto.digests;

public class AsconDigest implements com.android.internal.org.bouncycastle.crypto.ExtendedDigest {
    com.android.internal.org.bouncycastle.crypto.digests.AsconDigest.AsconParameters asconParameters;
    public AsconDigest(com.android.internal.org.bouncycastle.crypto.digests.AsconDigest.AsconParameters p0) {}
    public java.lang.String getAlgorithmName() { return null; }
    public int getDigestSize() { return 0; }
    public int getByteLength() { return 0; }
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public void reset() {}

    public static enum AsconParameters {
        AsconHash,
        AsconHashA;
    }
}
