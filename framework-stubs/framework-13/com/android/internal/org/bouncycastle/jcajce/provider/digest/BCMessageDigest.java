package com.android.internal.org.bouncycastle.jcajce.provider.digest;

public class BCMessageDigest extends java.security.MessageDigest {
    protected com.android.internal.org.bouncycastle.crypto.Digest digest;
    protected int digestSize;
    protected BCMessageDigest(com.android.internal.org.bouncycastle.crypto.Digest p0) { super(null); }
    public void engineReset() {}
    public void engineUpdate(byte p0) {}
    public void engineUpdate(byte[] p0, int p1, int p2) {}
    public int engineGetDigestLength() { return 0; }
    public byte[] engineDigest() { return null; }
}
