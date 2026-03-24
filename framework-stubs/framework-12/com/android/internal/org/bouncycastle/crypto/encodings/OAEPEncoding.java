package com.android.internal.org.bouncycastle.crypto.encodings;

public class OAEPEncoding implements com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher {
    private byte[] defHash;
    private com.android.internal.org.bouncycastle.crypto.Digest mgf1Hash;
    private com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher engine;
    private java.security.SecureRandom random;
    private boolean forEncryption;
    public OAEPEncoding(com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher p0) {}
    public OAEPEncoding(com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher p0, com.android.internal.org.bouncycastle.crypto.Digest p1) {}
    public OAEPEncoding(com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher p0, com.android.internal.org.bouncycastle.crypto.Digest p1, byte[] p2) {}
    public OAEPEncoding(com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher p0, com.android.internal.org.bouncycastle.crypto.Digest p1, com.android.internal.org.bouncycastle.crypto.Digest p2, byte[] p3) {}
    public com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher getUnderlyingCipher() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public int getInputBlockSize() { return 0; }
    public int getOutputBlockSize() { return 0; }
    public byte[] processBlock(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
    public byte[] encodeBlock(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
    public byte[] decodeBlock(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
    private void ItoOSP(int p0, byte[] p1) {}
    private byte[] maskGeneratorFunction1(byte[] p0, int p1, int p2, int p3) { return null; }
}
