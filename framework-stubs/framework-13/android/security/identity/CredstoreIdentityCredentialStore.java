package android.security.identity;

class CredstoreIdentityCredentialStore extends android.security.identity.IdentityCredentialStore {
    static android.security.identity.CredstoreIdentityCredentialStore getInstanceForType(android.content.Context p0, int p1) { return null; }
    public static android.security.identity.IdentityCredentialStore getInstance(android.content.Context p0) { return null; }
    public static android.security.identity.IdentityCredentialStore getDirectAccessInstance(android.content.Context p0) { return null; }
    public java.lang.String[] getSupportedDocTypes() { return null; }
    public android.security.identity.WritableIdentityCredential createCredential(java.lang.String p0, java.lang.String p1) throws android.security.identity.AlreadyPersonalizedException, android.security.identity.DocTypeNotSupportedException { return null; }
    public android.security.identity.IdentityCredential getCredentialByName(java.lang.String p0, int p1) throws android.security.identity.CipherSuiteNotSupportedException { return null; }
    public byte[] deleteCredentialByName(java.lang.String p0) { return null; }
    public android.security.identity.PresentationSession createPresentationSession(int p0) throws android.security.identity.CipherSuiteNotSupportedException { return null; }
}
