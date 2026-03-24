package com.android.internal.org.bouncycastle.crypto.modes;

public interface AEADCipher {
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException;
    public java.lang.String getAlgorithmName();
    public void processAADByte(byte p0);
    public void processAADBytes(byte[] p0, int p1, int p2);
    public int processByte(byte p0, byte[] p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException;
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException;
    public int doFinal(byte[] p0, int p1) throws java.lang.IllegalStateException, com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException;
    public byte[] getMac();
    public int getUpdateOutputSize(int p0);
    public int getOutputSize(int p0);
    public void reset();
}
