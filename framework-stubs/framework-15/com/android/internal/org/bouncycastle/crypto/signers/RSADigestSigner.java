package com.android.internal.org.bouncycastle.crypto.signers;

public class RSADigestSigner implements com.android.internal.org.bouncycastle.crypto.Signer {
    public RSADigestSigner(com.android.internal.org.bouncycastle.crypto.Digest p0) {}
    public RSADigestSigner(com.android.internal.org.bouncycastle.crypto.Digest p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1) {}
    public java.lang.String getAlgorithmName() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}
    public byte[] generateSignature() throws com.android.internal.org.bouncycastle.crypto.CryptoException, com.android.internal.org.bouncycastle.crypto.DataLengthException { return null; }
    public boolean verifySignature(byte[] p0) { return false; }
    public void reset() {}
}
