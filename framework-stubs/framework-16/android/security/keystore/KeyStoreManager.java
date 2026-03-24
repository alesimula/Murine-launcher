package android.security.keystore;

@android.annotation.FlaggedApi("android.security.keystore_grant_api")
public final class KeyStoreManager {
    public static final int MODULE_HASH = -1879047468;
    public static android.security.keystore.KeyStoreManager getInstance() { return null; }
    public long grantKeyAccess(java.lang.String p0, int p1) throws android.security.KeyStoreException, java.security.UnrecoverableKeyException { return 0L; }
    public void revokeKeyAccess(java.lang.String p0, int p1) throws android.security.KeyStoreException, java.security.UnrecoverableKeyException {}
    @android.annotation.NonNull
    public java.security.Key getGrantedKeyFromId(long p0) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    @android.annotation.NonNull
    public java.security.KeyPair getGrantedKeyPairFromId(long p0) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    @android.annotation.NonNull
    public java.util.List<java.security.cert.X509Certificate> getGrantedCertificateChainFromId(long p0) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    @android.annotation.FlaggedApi("android.security.keystore2.attest_modules")
    @android.annotation.NonNull
    public byte[] getSupplementaryAttestationInfo(int p0) throws android.security.KeyStoreException { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SupplementaryAttestationInfoTagEnum {
    }
}
