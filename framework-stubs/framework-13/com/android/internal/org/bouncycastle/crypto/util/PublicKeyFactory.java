package com.android.internal.org.bouncycastle.crypto.util;

public class PublicKeyFactory {
    public PublicKeyFactory() {}
    public static com.android.internal.org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(byte[] p0) throws java.io.IOException { return null; }
    public static com.android.internal.org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(java.io.InputStream p0) throws java.io.IOException { return null; }
    public static com.android.internal.org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) throws java.io.IOException { return null; }
    public static com.android.internal.org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0, java.lang.Object p1) throws java.io.IOException { return null; }

    private static class DHAgreementConverter extends com.android.internal.org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        com.android.internal.org.bouncycastle.crypto.params.AsymmetricKeyParameter getPublicKeyParameters(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0, java.lang.Object p1) throws java.io.IOException { return null; }
    }

    private static class DHPublicNumberConverter extends com.android.internal.org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        com.android.internal.org.bouncycastle.crypto.params.AsymmetricKeyParameter getPublicKeyParameters(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0, java.lang.Object p1) throws java.io.IOException { return null; }
    }

    private static class DSAConverter extends com.android.internal.org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        com.android.internal.org.bouncycastle.crypto.params.AsymmetricKeyParameter getPublicKeyParameters(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0, java.lang.Object p1) throws java.io.IOException { return null; }
    }

    private static class ECConverter extends com.android.internal.org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        com.android.internal.org.bouncycastle.crypto.params.AsymmetricKeyParameter getPublicKeyParameters(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0, java.lang.Object p1) { return null; }
    }

    private static class RSAConverter extends com.android.internal.org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        com.android.internal.org.bouncycastle.crypto.params.AsymmetricKeyParameter getPublicKeyParameters(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0, java.lang.Object p1) throws java.io.IOException { return null; }
    }

    private static abstract class SubjectPublicKeyInfoConverter {
        abstract com.android.internal.org.bouncycastle.crypto.params.AsymmetricKeyParameter getPublicKeyParameters(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0, java.lang.Object p1) throws java.io.IOException;
    }
}
