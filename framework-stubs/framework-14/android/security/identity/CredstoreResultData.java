package android.security.identity;

class CredstoreResultData extends android.security.identity.ResultData {
    int mFeatureVersion;
    byte[] mStaticAuthenticationData;
    byte[] mAuthenticatedData;
    byte[] mMessageAuthenticationCode;
    byte[] mSignature;
    CredstoreResultData() { super(); }
    public byte[] getAuthenticatedData() { return null; }
    public byte[] getMessageAuthenticationCode() { return null; }
    byte[] getSignature() { return null; }
    public byte[] getStaticAuthenticationData() { return null; }
    public java.util.Collection<java.lang.String> getNamespaces() { return null; }
    public java.util.Collection<java.lang.String> getEntryNames(java.lang.String p0) { return null; }
    public java.util.Collection<java.lang.String> getRetrievedEntryNames(java.lang.String p0) { return null; }
    public int getStatus(java.lang.String p0, java.lang.String p1) { return 0; }
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
