package com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util;

public class BaseStreamCipher extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher implements com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBE {
    private java.lang.Class[] availableSpecs;
    private com.android.internal.org.bouncycastle.crypto.StreamCipher cipher;
    private int keySizeInBits;
    private int digest;
    private com.android.internal.org.bouncycastle.crypto.params.ParametersWithIV ivParam;
    private int ivLength;
    private javax.crypto.spec.PBEParameterSpec pbeSpec;
    private java.lang.String pbeAlgorithm;
    protected BaseStreamCipher(com.android.internal.org.bouncycastle.crypto.StreamCipher p0, int p1) { super(); }
    protected BaseStreamCipher(com.android.internal.org.bouncycastle.crypto.StreamCipher p0, int p1, int p2) { super(); }
    protected BaseStreamCipher(com.android.internal.org.bouncycastle.crypto.StreamCipher p0, int p1, int p2, int p3) { super(); }
    protected int engineGetBlockSize() { return 0; }
    protected byte[] engineGetIV() { return null; }
    protected int engineGetKeySize(java.security.Key p0) { return 0; }
    protected int engineGetOutputSize(int p0) { return 0; }
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }
    protected void engineSetMode(java.lang.String p0) throws java.security.NoSuchAlgorithmException {}
    protected void engineSetPadding(java.lang.String p0) throws javax.crypto.NoSuchPaddingException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.spec.AlgorithmParameterSpec p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.AlgorithmParameters p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException {}
    protected byte[] engineUpdate(byte[] p0, int p1, int p2) { return null; }
    protected int engineUpdate(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.ShortBufferException { return 0; }
    protected byte[] engineDoFinal(byte[] p0, int p1, int p2) { return null; }
    protected int engineDoFinal(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.ShortBufferException { return 0; }
}
