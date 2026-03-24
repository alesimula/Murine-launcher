package com.android.internal.org.bouncycastle.crypto;

public interface Signer {
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1);
    public void update(byte p0);
    public void update(byte[] p0, int p1, int p2);
    public byte[] generateSignature() throws com.android.internal.org.bouncycastle.crypto.CryptoException, com.android.internal.org.bouncycastle.crypto.DataLengthException;
    public boolean verifySignature(byte[] p0);
    public void reset();
}
