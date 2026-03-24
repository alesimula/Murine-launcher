package android.security.identity;

public abstract class IdentityCredentialStore {
    public static final int CIPHERSUITE_ECDHE_HKDF_ECDSA_WITH_AES_256_GCM_SHA256 = 1;
    IdentityCredentialStore() {}
    public static android.security.identity.IdentityCredentialStore getInstance(android.content.Context p0) { return null; }
    public static android.security.identity.IdentityCredentialStore getDirectAccessInstance(android.content.Context p0) { return null; }
    public abstract java.lang.String[] getSupportedDocTypes();
    public abstract android.security.identity.WritableIdentityCredential createCredential(java.lang.String p0, java.lang.String p1) throws android.security.identity.AlreadyPersonalizedException, android.security.identity.DocTypeNotSupportedException;
    public abstract android.security.identity.IdentityCredential getCredentialByName(java.lang.String p0, int p1) throws android.security.identity.CipherSuiteNotSupportedException;
    public abstract byte[] deleteCredentialByName(java.lang.String p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Ciphersuite {
    }
}
