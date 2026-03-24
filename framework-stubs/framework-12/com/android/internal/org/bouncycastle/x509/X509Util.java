package com.android.internal.org.bouncycastle.x509;

class X509Util {
    private static java.util.Hashtable algorithms;
    private static java.util.Hashtable params;
    private static java.util.Set noParams;
    X509Util() {}
    private static com.android.internal.org.bouncycastle.asn1.pkcs.RSASSAPSSparams creatPSSParams(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, int p1) { return null; }
    static com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getAlgorithmOID(java.lang.String p0) { return null; }
    static com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSigAlgID(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1) { return null; }
    static java.util.Iterator getAlgNames() { return null; }
    static java.security.Signature getSignatureInstance(java.lang.String p0) throws java.security.NoSuchAlgorithmException { return null; }
    static java.security.Signature getSignatureInstance(java.lang.String p0, java.lang.String p1) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException { return null; }
    static byte[] calculateSignature(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1, java.security.PrivateKey p2, java.security.SecureRandom p3, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p4) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException { return null; }
    static byte[] calculateSignature(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1, java.lang.String p2, java.security.PrivateKey p3, java.security.SecureRandom p4, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p5) throws java.io.IOException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException { return null; }
    static com.android.internal.org.bouncycastle.jce.X509Principal convertPrincipal(javax.security.auth.x500.X500Principal p0) { return null; }
    static com.android.internal.org.bouncycastle.x509.X509Util.Implementation getImplementation(java.lang.String p0, java.lang.String p1, java.security.Provider p2) throws java.security.NoSuchAlgorithmException { return null; }
    static com.android.internal.org.bouncycastle.x509.X509Util.Implementation getImplementation(java.lang.String p0, java.lang.String p1) throws java.security.NoSuchAlgorithmException { return null; }
    static java.security.Provider getProvider(java.lang.String p0) throws java.security.NoSuchProviderException { return null; }

    static class Implementation {
        java.lang.Object engine;
        java.security.Provider provider;
        Implementation(java.lang.Object p0, java.security.Provider p1) {}
        java.lang.Object getEngine() { return null; }
        java.security.Provider getProvider() { return null; }
    }
}
