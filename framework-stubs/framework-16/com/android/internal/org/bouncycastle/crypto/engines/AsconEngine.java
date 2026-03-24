package com.android.internal.org.bouncycastle.crypto.engines;

public class AsconEngine implements com.android.internal.org.bouncycastle.crypto.modes.AEADCipher {
    public AsconEngine(com.android.internal.org.bouncycastle.crypto.engines.AsconEngine.AsconParameters p0) {}
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public java.lang.String getAlgorithmName() { return null; }
    public java.lang.String getAlgorithmVersion() { return null; }
    public void processAADByte(byte p0) {}
    public void processAADBytes(byte[] p0, int p1, int p2) {}
    public int processByte(byte p0, byte[] p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public int doFinal(byte[] p0, int p1) throws java.lang.IllegalStateException, com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException, com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public byte[] getMac() { return null; }
    public int getUpdateOutputSize(int p0) { return 0; }
    public int getOutputSize(int p0) { return 0; }
    public void reset() {}
    public int getKeyBytesSize() { return 0; }
    public int getIVBytesSize() { return 0; }

    public static enum AsconParameters {
        ascon80pq,
        ascon128a,
        ascon128;
    }

    private static enum State {
        Uninitialized,
        EncInit,
        EncAad,
        EncData,
        EncFinal,
        DecInit,
        DecAad,
        DecData,
        DecFinal;
    }
}
