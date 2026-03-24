package com.android.internal.org.bouncycastle.crypto.encodings;

public class PKCS1Encoding implements com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher {
    public static final java.lang.String STRICT_LENGTH_ENABLED_PROPERTY = "com.android.internal.org.bouncycastle.pkcs1.strict";
    public static final java.lang.String NOT_STRICT_LENGTH_ENABLED_PROPERTY = "com.android.internal.org.bouncycastle.pkcs1.not_strict";
    private static final int HEADER_LENGTH = 10;
    private java.security.SecureRandom random;
    private com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private boolean forPrivateKey;
    private boolean useStrictLength;
    private int pLen;
    private byte[] fallback;
    private byte[] blockBuffer;
    public PKCS1Encoding(com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher p0) {}
    public PKCS1Encoding(com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher p0, int p1) {}
    public PKCS1Encoding(com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher p0, byte[] p1) {}
    private boolean useStrict() { return false; }
    public com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher getUnderlyingCipher() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public int getInputBlockSize() { return 0; }
    public int getOutputBlockSize() { return 0; }
    public byte[] processBlock(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
    private byte[] encodeBlock(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
    private static int checkPkcs1Encoding(byte[] p0, int p1) { return 0; }
    private byte[] decodeBlockOrRandom(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
    private byte[] decodeBlock(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
    private int findStart(byte p0, byte[] p1) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return 0; }
}
