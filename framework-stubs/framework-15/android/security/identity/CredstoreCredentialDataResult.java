package android.security.identity;

class CredstoreCredentialDataResult extends android.security.identity.CredentialDataResult {
    android.security.identity.ResultData mDeviceSignedResult;
    android.security.identity.ResultData mIssuerSignedResult;
    android.security.identity.CredstoreCredentialDataResult.CredstoreEntries mDeviceSignedEntries;
    android.security.identity.CredstoreCredentialDataResult.CredstoreEntries mIssuerSignedEntries;
    CredstoreCredentialDataResult(android.security.identity.ResultData p0, android.security.identity.ResultData p1) { super(); }
    @android.annotation.NonNull
    public byte[] getDeviceNameSpaces() { return null; }
    @android.annotation.Nullable
    public byte[] getDeviceMac() { return null; }
    @android.annotation.Nullable
    public byte[] getDeviceSignature() { return null; }
    @android.annotation.NonNull
    public byte[] getStaticAuthenticationData() { return null; }
    @android.annotation.NonNull
    public android.security.identity.CredentialDataResult.Entries getDeviceSignedEntries() { return null; }
    @android.annotation.NonNull
    public android.security.identity.CredentialDataResult.Entries getIssuerSignedEntries() { return null; }

    static class CredstoreEntries implements android.security.identity.CredentialDataResult.Entries {
        android.security.identity.ResultData mResultData;
        CredstoreEntries(android.security.identity.ResultData p0) {}
        @android.annotation.NonNull
        public java.util.Collection<java.lang.String> getNamespaces() { return null; }
        @android.annotation.NonNull
        public java.util.Collection<java.lang.String> getEntryNames(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public java.util.Collection<java.lang.String> getRetrievedEntryNames(java.lang.String p0) { return null; }
        public int getStatus(java.lang.String p0, java.lang.String p1) { return 0; }
        @android.annotation.Nullable
        public byte[] getEntry(java.lang.String p0, java.lang.String p1) { return null; }
    }
}
