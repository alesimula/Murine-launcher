package android.security.identity;

class CredstoreWritableIdentityCredential extends android.security.identity.WritableIdentityCredential {
    private static final java.lang.String TAG = "CredstoreWritableIdentityCredential";
    private java.lang.String mDocType;
    private java.lang.String mCredentialName;
    private android.content.Context mContext;
    private android.security.identity.IWritableCredential mBinder;
    CredstoreWritableIdentityCredential(android.content.Context p0, java.lang.String p1, java.lang.String p2, android.security.identity.IWritableCredential p3) { super(); }
    public java.util.Collection<java.security.cert.X509Certificate> getCredentialKeyCertificateChain(byte[] p0) { return null; }
    public byte[] personalize(android.security.identity.PersonalizationData p0) { return null; }
    static byte[] personalize(android.security.identity.IWritableCredential p0, android.security.identity.PersonalizationData p1) { return null; }
    private static long getRootSid() { return 0L; }
}
