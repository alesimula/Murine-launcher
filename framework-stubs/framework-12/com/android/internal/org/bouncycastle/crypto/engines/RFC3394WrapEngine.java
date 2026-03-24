package com.android.internal.org.bouncycastle.crypto.engines;

public class RFC3394WrapEngine implements com.android.internal.org.bouncycastle.crypto.Wrapper {
    private com.android.internal.org.bouncycastle.crypto.BlockCipher engine;
    private boolean wrapCipherMode;
    private com.android.internal.org.bouncycastle.crypto.params.KeyParameter param;
    private boolean forWrapping;
    private byte[] iv;
    public RFC3394WrapEngine(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) {}
    public RFC3394WrapEngine(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, boolean p1) {}
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public java.lang.String getAlgorithmName() { return null; }
    public byte[] wrap(byte[] p0, int p1, int p2) { return null; }
    public byte[] unwrap(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
}
