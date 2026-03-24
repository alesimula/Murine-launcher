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
    public java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> getDeviceSignedEntriesToRequest() { return null; }
    public java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> getIssuerSignedEntriesToRequest() { return null; }
    public boolean isAllowUsingExhaustedKeys() { return false; }
    public boolean isAllowUsingExpiredKeys() { return false; }
    public boolean isIncrementUseCount() { return false; }
    public byte[] getRequestMessage() { return null; }
    public byte[] getReaderSignature() { return null; }

    public static final class Builder {
        public Builder() {}
        public android.security.identity.CredentialDataRequest.Builder setDeviceSignedEntriesToRequest(java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> p0) { return null; }
        public android.security.identity.CredentialDataRequest.Builder setIssuerSignedEntriesToRequest(java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> p0) { return null; }
        public android.security.identity.CredentialDataRequest.Builder setAllowUsingExhaustedKeys(boolean p0) { return null; }
        public android.security.identity.CredentialDataRequest.Builder setAllowUsingExpiredKeys(boolean p0) { return null; }
        public android.security.identity.CredentialDataRequest.Builder setIncrementUseCount(boolean p0) { return null; }
        public android.security.identity.CredentialDataRequest.Builder setRequestMessage(byte[] p0) { return null; }
        public android.security.identity.CredentialDataRequest.Builder setReaderSignature(byte[] p0) { return null; }
        public android.security.identity.CredentialDataRequest build() { return null; }
    }
}
