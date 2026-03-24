package android.security.identity;

class CredstoreResultData extends android.security.identity.ResultData {
    int mFeatureVersion;
    byte[] mStaticAuthenticationData;
    byte[] mAuthenticatedData;
    byte[] mMessageAuthenticationCode;
    byte[] mSignature;
    CredstoreResultData() { super(); }
    @android.annotation.NonNull
    public byte[] getAuthenticatedData() { return null; }
    @android.annotation.Nullable
    public byte[] getMessageAuthenticationCode() { return null; }
    @android.annotation.Nullable
    byte[] getSignature() { return null; }
    @android.annotation.NonNull
    public byte[] getStaticAuthenticationData() { return null; }
    @android.annotation.NonNull
    public java.util.Collection<java.lang.String> getNamespaces() { return null; }
    @android.annotation.Nullable
    public java.util.Collection<java.lang.String> getEntryNames(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public java.util.Collection<java.lang.String> getRetrievedEntryNames(java.lang.String p0) { return null; }
    public int getStatus(java.lang.String p0, java.lang.String p1) { return 0; }
    @android.annotation.Nullable
    public byte[] getEntry(java.lang.String p0, java.lang.String p1) { return null; }

    static class Builder {
        Builder(int p0, byte[] p1, byte[] p2, byte[] p3, byte[] p4) {}
        android.security.identity.CredstoreResultData.Builder addEntry(java.lang.String p0, java.lang.String p1, byte[] p2) { return null; }
        android.security.identity.CredstoreResultData.Builder addErrorStatus(java.lang.String p0, java.lang.String p1, int p2) { return null; }
        android.security.identity.CredstoreResultData build() { return null; }
    }

    private static class EntryData {
        int mStatus;
        byte[] mValue;
        EntryData(byte[] p0, int p1) {}
    }
}
