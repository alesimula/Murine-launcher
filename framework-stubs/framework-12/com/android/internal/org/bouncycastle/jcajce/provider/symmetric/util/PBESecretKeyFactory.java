package com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util;

public class PBESecretKeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory implements com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBE {
    private boolean forCipher;
    private int scheme;
    private int digest;
    private int keySize;
    private int ivSize;
    public PBESecretKeyFactory(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, boolean p2, int p3, int p4, int p5, int p6) { super(null, null); }
    protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec p0) throws java.security.spec.InvalidKeySpecException { return null; }
}
