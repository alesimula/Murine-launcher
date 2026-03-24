package android.security.keystore;

public class AndroidKeyStoreSpi extends java.security.KeyStoreSpi {
    public static final java.lang.String NAME = "AndroidKeyStore";
    private android.security.KeyStore mKeyStore;
    private int mUid;
    public AndroidKeyStoreSpi() { super(); }
    public java.security.Key engineGetKey(java.lang.String p0, char[] p1) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException { return null; }
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String p0) { return null; }
    public java.security.cert.Certificate engineGetCertificate(java.lang.String p0) { return null; }
    private java.security.cert.Certificate getCertificateForTrustedCertificateEntry(byte[] p0) { return null; }
    private java.security.cert.Certificate getCertificateForPrivateKeyEntry(java.lang.String p0, byte[] p1) { return null; }
    private static android.security.keystore.AndroidKeyStoreSpi.KeyStoreX509Certificate wrapIntoKeyStoreCertificate(java.lang.String p0, int p1, java.security.cert.X509Certificate p2) { return null; }
    private static java.security.cert.X509Certificate toCertificate(byte[] p0) { return null; }
    private static java.util.Collection<java.security.cert.X509Certificate> toCertificates(byte[] p0) { return null; }
    private java.util.Date getModificationDate(java.lang.String p0) { return null; }
    public java.util.Date engineGetCreationDate(java.lang.String p0) { return null; }
    public void engineSetKeyEntry(java.lang.String p0, java.security.Key p1, char[] p2, java.security.cert.Certificate[] p3) throws java.security.KeyStoreException {}
    private static android.security.keystore.KeyProtection getLegacyKeyProtectionParameter(java.security.PrivateKey p0) throws java.security.KeyStoreException { return null; }
    private void setPrivateKeyEntry(java.lang.String p0, java.security.PrivateKey p1, java.security.cert.Certificate[] p2, java.security.KeyStore.ProtectionParameter p3) throws java.security.KeyStoreException {}
    private void setSecretKeyEntry(java.lang.String p0, javax.crypto.SecretKey p1, java.security.KeyStore.ProtectionParameter p2) throws java.security.KeyStoreException {}
    private void setWrappedKeyEntry(java.lang.String p0, android.security.keystore.WrappedKeyEntry p1, java.security.KeyStore.ProtectionParameter p2) throws java.security.KeyStoreException {}
    public void engineSetKeyEntry(java.lang.String p0, byte[] p1, java.security.cert.Certificate[] p2) throws java.security.KeyStoreException {}
    public void engineSetCertificateEntry(java.lang.String p0, java.security.cert.Certificate p1) throws java.security.KeyStoreException {}
    public void engineDeleteEntry(java.lang.String p0) throws java.security.KeyStoreException {}
    private java.util.Set<java.lang.String> getUniqueAliases() { return null; }
    public java.util.Enumeration<java.lang.String> engineAliases() { return null; }
    public boolean engineContainsAlias(java.lang.String p0) { return false; }
    public int engineSize() { return 0; }
    public boolean engineIsKeyEntry(java.lang.String p0) { return false; }
    private boolean isKeyEntry(java.lang.String p0) { return false; }
    private boolean isCertificateEntry(java.lang.String p0) { return false; }
    public boolean engineIsCertificateEntry(java.lang.String p0) { return false; }
    public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate p0) { return null; }
    public void engineStore(java.io.OutputStream p0, char[] p1) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}
    public void engineLoad(java.io.InputStream p0, char[] p1) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}
    public void engineLoad(java.security.KeyStore.LoadStoreParameter p0) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}
    public void engineSetEntry(java.lang.String p0, java.security.KeyStore.Entry p1, java.security.KeyStore.ProtectionParameter p2) throws java.security.KeyStoreException {}

    static class KeyStoreX509Certificate extends android.security.keystore.DelegatingX509Certificate {
        private final java.lang.String mPrivateKeyAlias = null;
        private final int mPrivateKeyUid = 0;
        KeyStoreX509Certificate(java.lang.String p0, int p1, java.security.cert.X509Certificate p2) { super(null); }
        public java.security.PublicKey getPublicKey() { return null; }
    }
}
