package com.android.internal.org.bouncycastle.crypto;

public abstract class StreamBlockCipher extends com.android.internal.org.bouncycastle.crypto.DefaultMultiBlockCipher implements com.android.internal.org.bouncycastle.crypto.StreamCipher {
    protected StreamBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) { super(); }
    public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() { return null; }
    public final byte returnByte(byte p0) { return 0; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    protected abstract byte calculateByte(byte p0);
}
