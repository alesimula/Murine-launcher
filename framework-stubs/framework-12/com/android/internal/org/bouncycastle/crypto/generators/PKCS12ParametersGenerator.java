package com.android.internal.org.bouncycastle.crypto.generators;

public class PKCS12ParametersGenerator extends com.android.internal.org.bouncycastle.crypto.PBEParametersGenerator {
    public static final int KEY_MATERIAL = 1;
    public static final int IV_MATERIAL = 2;
    public static final int MAC_MATERIAL = 3;
    private com.android.internal.org.bouncycastle.crypto.Digest digest;
    private int u;
    private int v;
    public PKCS12ParametersGenerator(com.android.internal.org.bouncycastle.crypto.Digest p0) { super(); }
    private void adjust(byte[] p0, int p1, byte[] p2) {}
    private byte[] generateDerivedKey(int p0, int p1) { return null; }
    public com.android.internal.org.bouncycastle.crypto.CipherParameters generateDerivedParameters(int p0) { return null; }
    public com.android.internal.org.bouncycastle.crypto.CipherParameters generateDerivedParameters(int p0, int p1) { return null; }
    public com.android.internal.org.bouncycastle.crypto.CipherParameters generateDerivedMacParameters(int p0) { return null; }
}
