package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util;

public abstract class BaseAgreementSpi extends javax.crypto.KeyAgreementSpi {
    private static final java.util.Map<java.lang.String, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier> defaultOids = null;
    private static final java.util.Map<java.lang.String, java.lang.Integer> keySizes = null;
    private static final java.util.Map<java.lang.String, java.lang.String> nameTable = null;
    private static final java.util.Hashtable oids = null;
    private static final java.util.Hashtable des = null;
    protected final java.lang.String kaAlgorithm = null;
    protected final com.android.internal.org.bouncycastle.crypto.DerivationFunction kdf = null;
    protected byte[] ukmParameters;
    public BaseAgreementSpi(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.DerivationFunction p1) { super(); }
    protected static java.lang.String getAlgorithm(java.lang.String p0) { return null; }
    protected static int getKeySize(java.lang.String p0) { return 0; }
    protected static byte[] trimZeroes(byte[] p0) { return null; }
    protected byte[] engineGenerateSecret() throws java.lang.IllegalStateException { return null; }
    protected int engineGenerateSecret(byte[] p0, int p1) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException { return 0; }
    protected javax.crypto.SecretKey engineGenerateSecret(java.lang.String p0) throws java.security.NoSuchAlgorithmException { return null; }
    private byte[] getSharedSecretBytes(byte[] p0, java.lang.String p1, int p2) throws java.security.NoSuchAlgorithmException { return null; }
    protected abstract byte[] calcSecret();
}
