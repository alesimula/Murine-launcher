package com.android.internal.org.bouncycastle.crypto;

public interface Digest {
    public java.lang.String getAlgorithmName();
    public int getDigestSize();
    public void update(byte p0);
    public void update(byte[] p0, int p1, int p2);
    public int doFinal(byte[] p0, int p1);
    public void reset();
}
