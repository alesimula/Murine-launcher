package com.android.internal.org.bouncycastle.jcajce.provider.keystore.pkcs12;

public class PKCS12KeyStoreSpi extends java.security.KeyStoreSpi implements com.android.internal.org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, com.android.internal.org.bouncycastle.asn1.x509.X509ObjectIdentifiers, com.android.internal.org.bouncycastle.jce.interfaces.BCKeyStore {
    static final java.lang.String PKCS12_MAX_IT_COUNT_PROPERTY = "com.android.internal.org.bouncycastle.pkcs12.max_it_count";
    private final com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper helper = null;
    private static final int SALT_SIZE = 20;
    private static final int MIN_ITERATIONS = 51200;
    private static final com.android.internal.org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.DefaultSecretKeyProvider keySizeProvider = null;
    private com.android.internal.org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable keys;
    private java.util.Hashtable localIds;
    private com.android.internal.org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable certs;
    private java.util.Hashtable chainCerts;
    private java.util.Hashtable keyCerts;
    static final int NULL = 0;
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    static final int SECRET = 3;
    static final int SEALED = 4;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    protected java.security.SecureRandom random;
    private java.security.cert.CertificateFactory certFact;
    private com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier keyAlgorithm;
    private com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier certAlgorithm;
    private com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier macAlgorithm;
    private int itCount;
    private int saltLength;
    public PKCS12KeyStoreSpi(com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p2) { super(); }
    private com.android.internal.org.bouncycastle.asn1.x509.SubjectKeyIdentifier createSubjectKeyId(java.security.PublicKey p0) { return null; }
    private static byte[] getDigest(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) { return null; }
    public void setRandom(java.security.SecureRandom p0) {}
    public java.util.Enumeration engineAliases() { return null; }
    public boolean engineContainsAlias(java.lang.String p0) { return false; }
    public void engineDeleteEntry(java.lang.String p0) throws java.security.KeyStoreException {}
    public java.security.cert.Certificate engineGetCertificate(java.lang.String p0) { return null; }
    public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate p0) { return null; }
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String p0) { return null; }
    public java.util.Date engineGetCreationDate(java.lang.String p0) { return null; }
    public java.security.Key engineGetKey(java.lang.String p0, char[] p1) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException { return null; }
    public boolean engineIsCertificateEntry(java.lang.String p0) { return false; }
    public boolean engineIsKeyEntry(java.lang.String p0) { return false; }
    public void engineSetCertificateEntry(java.lang.String p0, java.security.cert.Certificate p1) throws java.security.KeyStoreException {}
    public void engineSetKeyEntry(java.lang.String p0, byte[] p1, java.security.cert.Certificate[] p2) throws java.security.KeyStoreException {}
    public void engineSetKeyEntry(java.lang.String p0, java.security.Key p1, char[] p2, java.security.cert.Certificate[] p3) throws java.security.KeyStoreException {}
    public int engineSize() { return 0; }
    protected java.security.PrivateKey unwrapKey(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, byte[] p1, char[] p2, boolean p3) throws java.io.IOException { return null; }
    protected byte[] wrapKey(java.lang.String p0, java.security.Key p1, com.android.internal.org.bouncycastle.asn1.pkcs.PKCS12PBEParams p2, char[] p3) throws java.io.IOException { return null; }
    protected byte[] cryptData(boolean p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, char[] p2, boolean p3, byte[] p4) throws java.io.IOException { return null; }
    private javax.crypto.Cipher createCipher(int p0, char[] p1, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p2) throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException, java.security.NoSuchProviderException { return null; }
    public void engineLoad(java.io.InputStream p0, char[] p1) throws java.io.IOException {}
    private int validateIterationCount(java.math.BigInteger p0) { return 0; }
    public void engineStore(java.security.KeyStore.LoadStoreParameter p0) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}
    public void engineStore(java.io.OutputStream p0, char[] p1) throws java.io.IOException {}
    private void doStore(java.io.OutputStream p0, char[] p1, boolean p2) throws java.io.IOException {}
    private com.android.internal.org.bouncycastle.asn1.pkcs.SafeBag createSafeBag(java.lang.String p0, java.security.cert.Certificate p1) throws java.security.cert.CertificateEncodingException { return null; }
    private java.util.Set getUsedCertificateSet() { return null; }
    private byte[] calculatePbeMac(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, byte[] p1, int p2, char[] p3, boolean p4, byte[] p5) throws java.lang.Exception { return null; }

    public static class BCPKCS12KeyStore extends com.android.internal.org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi {
        public BCPKCS12KeyStore() { super(null, null, null); }
    }

    private class CertId {
        byte[] id;
        CertId(com.android.internal.org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi p0, java.security.PublicKey p1) {}
        CertId(com.android.internal.org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi p0, byte[] p1) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    private static class DefaultSecretKeyProvider {
        private final java.util.Map KEY_SIZES = null;
        DefaultSecretKeyProvider() {}
        public int getKeySize(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) { return 0; }
    }

    private static class IgnoresCaseHashtable {
        private java.util.Hashtable orig;
        private java.util.Hashtable keys;
        private IgnoresCaseHashtable() {}
        public void put(java.lang.String p0, java.lang.Object p1) {}
        public java.util.Enumeration keys() { return null; }
        public java.lang.Object remove(java.lang.String p0) { return null; }
        public java.lang.Object get(java.lang.String p0) { return null; }
        public java.util.Enumeration elements() { return null; }
        public int size() { return 0; }
    }
}
