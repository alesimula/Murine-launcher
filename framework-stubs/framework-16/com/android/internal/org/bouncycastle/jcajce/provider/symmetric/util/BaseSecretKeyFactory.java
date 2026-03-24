package com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util;

public class BaseSecretKeyFactory extends javax.crypto.SecretKeyFactorySpi implements com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBE {
    protected java.lang.String algName;
    protected com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier algOid;
    protected BaseSecretKeyFactory(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1) { super(); }
    protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec p0) throws java.security.spec.InvalidKeySpecException { return null; }
    protected java.security.spec.KeySpec engineGetKeySpec(javax.crypto.SecretKey p0, java.lang.Class p1) throws java.security.spec.InvalidKeySpecException { return null; }
    protected javax.crypto.SecretKey engineTranslateKey(javax.crypto.SecretKey p0) throws java.security.InvalidKeyException { return null; }
}
