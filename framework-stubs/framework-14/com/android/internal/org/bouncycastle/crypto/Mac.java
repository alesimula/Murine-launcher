package com.android.internal.org.bouncycastle.crypto;

public interface Mac {
    public void init(com.android.internal.org.bouncycastle.crypto.CipherParameters p0) throws java.lang.IllegalArgumentException;
    public java.lang.String getAlgorithmName();
    public int getMacSize();
    public void update(byte p0) throws java.lang.IllegalStateException;
    public void update(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException;
    public int doFinal(byte[] p0, int p1) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException;
    public void reset();
}
