package android.security.identity;

public abstract class IdentityCredentialStore {
    public static final int CIPHERSUITE_ECDHE_HKDF_ECDSA_WITH_AES_256_GCM_SHA256 = 1;
    IdentityCredentialStore() {}
    @android.annotation.Nullable
    public static android.security.identity.IdentityCredentialStore getInstance(android.content.Context p0) { return null; }
    @android.annotation.Nullable
    public static android.security.identity.IdentityCredentialStore getDirectAccessInstance(android.content.Context p0) { return null; }
    @android.annotation.NonNull
    public abstract java.lang.String[] getSupportedDocTypes();
    @android.annotation.NonNull
    public abstract android.security.identity.WritableIdentityCredential createCredential(java.lang.String p0, java.lang.String p1) throws android.security.identity.AlreadyPersonalizedException, android.security.identity.DocTypeNotSupportedException;
    @android.annotation.Nullable
    public abstract android.security.identity.IdentityCredential getCredentialByName(java.lang.String p0, int p1) throws android.security.identity.CipherSuiteNotSupportedException;
    @java.lang.Deprecated
    @android.annotation.Nullable
    public abstract byte[] deleteCredentialByName(java.lang.String p0);
    @android.annotation.NonNull
    public android.security.identity.PresentationSession createPresentationSession(int p0) throws android.security.identity.CipherSuiteNotSupportedException { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Ciphersuite {
    }
}
