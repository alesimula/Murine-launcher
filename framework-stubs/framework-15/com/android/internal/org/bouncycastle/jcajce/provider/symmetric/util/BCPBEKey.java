package com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util;

public class BCPBEKey implements javax.crypto.interfaces.PBEKey, javax.security.auth.Destroyable {
    java.lang.String algorithm;
    com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier oid;
    int type;
    int digest;
    int keySize;
    int ivSize;
    boolean tryWrong;
    public BCPBEKey(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, int p2, int p3, int p4, int p5, javax.crypto.spec.PBEKeySpec p6, com.android.internal.org.bouncycastle.crypto.CipherParameters p7) {}
    public BCPBEKey(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public java.lang.String getAlgorithm() { return null; }
    public java.lang.String getFormat() { return null; }
    public byte[] getEncoded() { return null; }
    int getType() { return 0; }
    int getDigest() { return 0; }
    int getKeySize() { return 0; }
    public int getIvSize() { return 0; }
    public com.android.internal.org.bouncycastle.crypto.CipherParameters getParam() { return null; }
    public char[] getPassword() { return null; }
    public byte[] getSalt() { return null; }
    public int getIterationCount() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getOID() { return null; }
    public void setTryWrongPKCS12Zero(boolean p0) {}
    boolean shouldTryWrongPKCS12() { return false; }
    public void destroy() {}
    public boolean isDestroyed() { return false; }
    static void checkDestroyed(javax.security.auth.Destroyable p0) {}
}
