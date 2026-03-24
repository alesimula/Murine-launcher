package android.security.identity;

public class CredentialDataRequest {
    java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> mDeviceSignedEntriesToRequest;
    java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> mIssuerSignedEntriesToRequest;
    boolean mAllowUsingExhaustedKeys;
    boolean mAllowUsingExpiredKeys;
    boolean mIncrementUseCount;
    byte[] mRequestMessage;
    byte[] mReaderSignature;
    CredentialDataRequest() {}
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> getDeviceSignedEntriesToRequest() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> getIssuerSignedEntriesToRequest() { return null; }
    public boolean isAllowUsingExhaustedKeys() { return false; }
    public boolean isAllowUsingExpiredKeys() { return false; }
    public boolean isIncrementUseCount() { return false; }
    @android.annotation.Nullable
    public byte[] getRequestMessage() { return null; }
    @android.annotation.Nullable
    public byte[] getReaderSignature() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.security.identity.CredentialDataRequest.Builder setDeviceSignedEntriesToRequest(java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> p0) { return null; }
        @android.annotation.NonNull
        public android.security.identity.CredentialDataRequest.Builder setIssuerSignedEntriesToRequest(java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> p0) { return null; }
        @android.annotation.NonNull
        public android.security.identity.CredentialDataRequest.Builder setAllowUsingExhaustedKeys(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.security.identity.CredentialDataRequest.Builder setAllowUsingExpiredKeys(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.security.identity.CredentialDataRequest.Builder setIncrementUseCount(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.security.identity.CredentialDataRequest.Builder setRequestMessage(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.security.identity.CredentialDataRequest.Builder setReaderSignature(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.security.identity.CredentialDataRequest build() { return null; }
    }
}
