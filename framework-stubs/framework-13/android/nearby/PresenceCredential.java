package android.nearby;

public abstract class PresenceCredential {
    public static final int CREDENTIAL_TYPE_PRIVATE = 0;
    public static final int CREDENTIAL_TYPE_PUBLIC = 1;
    public static final int IDENTITY_TYPE_PRIVATE = 1;
    public static final int IDENTITY_TYPE_PROVISIONED = 2;
    public static final int IDENTITY_TYPE_TRUSTED = 3;
    public static final int IDENTITY_TYPE_UNKNOWN = 0;
    PresenceCredential() {}
    public int getType() { return 0; }
    public int getIdentityType() { return 0; }
    @android.annotation.NonNull
    public byte[] getSecretId() { return null; }
    @android.annotation.NonNull
    public byte[] getAuthenticityKey() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.nearby.CredentialElement> getCredentialElements() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
