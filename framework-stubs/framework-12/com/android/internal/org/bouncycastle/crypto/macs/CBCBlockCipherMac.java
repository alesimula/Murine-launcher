package com.android.internal.org.bouncycastle.crypto.macs;

public class CBCBlockCipherMac implements com.android.internal.org.bouncycastle.crypto.Mac {
    private byte[] mac;
    private byte[] buf;
    private int bufOff;
    private com.android.internal.org.bouncycastle.crypto.BlockCipher cipher;
    private com.android.internal.org.bouncycastle.crypto.paddings.BlockCipherPadding padding;
    private int macSize;
    public CBCBlockCipherMac(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) {}
    public CBCBlockCipherMac(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, com.android.internal.org.bouncycastle.crypto.paddings.BlockCipherPadding p1) {}
    public CBCBlockCipherMac(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, int p1) {}
    public CBCBlockCipherMac(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, int p1, com.android.internal.org.bouncycastle.crypto.paddings.BlockCipherPadding p2) {}
    public java.lang.String getAlgorithmName() { return null; }
    public void init(com.android.internal.org.bouncycastle.crypto.CipherParameters p0) {}
    public int getMacSize() { return 0; }
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public void reset() {}
}
