package com.android.internal.org.bouncycastle.jcajce.provider.util;

public interface AsymmetricKeyInfoConverter {
    public java.security.PrivateKey generatePrivate(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException;
    public java.security.PublicKey generatePublic(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) throws java.io.IOException;
}
