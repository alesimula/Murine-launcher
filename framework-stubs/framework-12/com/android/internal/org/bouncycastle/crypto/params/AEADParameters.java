package com.android.internal.org.bouncycastle.crypto.params;

public class AEADParameters implements com.android.internal.org.bouncycastle.crypto.CipherParameters {
    private byte[] associatedText;
    private byte[] nonce;
    private com.android.internal.org.bouncycastle.crypto.params.KeyParameter key;
    private int macSize;
    public AEADParameters(com.android.internal.org.bouncycastle.crypto.params.KeyParameter p0, int p1, byte[] p2) {}
    public AEADParameters(com.android.internal.org.bouncycastle.crypto.params.KeyParameter p0, int p1, byte[] p2, byte[] p3) {}
    public com.android.internal.org.bouncycastle.crypto.params.KeyParameter getKey() { return null; }
    public int getMacSize() { return 0; }
    public byte[] getAssociatedText() { return null; }
    public byte[] getNonce() { return null; }
}
