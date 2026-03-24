package com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util;

public class BaseMac extends javax.crypto.MacSpi implements com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBE {
    private static final java.lang.Class gcmSpecClass = null;
    private com.android.internal.org.bouncycastle.crypto.Mac macEngine;
    private int scheme;
    private int pbeHash;
    private int keySize;
    protected BaseMac(com.android.internal.org.bouncycastle.crypto.Mac p0) { super(); }
    protected BaseMac(com.android.internal.org.bouncycastle.crypto.Mac p0, int p1, int p2, int p3) { super(); }
    protected void engineInit(java.security.Key p0, java.security.spec.AlgorithmParameterSpec p1) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected int engineGetMacLength() { return 0; }
    protected void engineReset() {}
    protected void engineUpdate(byte p0) {}
    protected void engineUpdate(byte[] p0, int p1, int p2) {}
    protected byte[] engineDoFinal() { return null; }
    private static java.util.Hashtable copyMap(java.util.Map p0) { return null; }
}
