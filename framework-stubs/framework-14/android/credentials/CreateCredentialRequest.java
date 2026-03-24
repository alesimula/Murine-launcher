package android.credentials;

public final class CreateCredentialRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.CreateCredentialRequest> CREATOR = null;
    public java.lang.String getType() { return null; }
    public android.os.Bundle getCredentialData() { return null; }
    public android.os.Bundle getCandidateQueryData() { return null; }
    public boolean isSystemProviderRequired() { return false; }
    public boolean alwaysSendAppInfoToProvider() { return false; }
    public java.lang.String getOrigin() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(java.lang.String p0, android.os.Bundle p1, android.os.Bundle p2) {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.credentials.CreateCredentialRequest.Builder setAlwaysSendAppInfoToProvider(boolean p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.credentials.CreateCredentialRequest.Builder setIsSystemProviderRequired(boolean p0) { return null; }
        @android.annotation.SuppressLint({"MissingGetterMatchingBuilder", "AndroidFrameworkRequiresPermission"})
        @android.annotation.RequiresPermission("android.permission.CREDENTIAL_MANAGER_SET_ORIGIN")
        public android.credentials.CreateCredentialRequest.Builder setOrigin(java.lang.String p0) { return null; }
        public android.credentials.CreateCredentialRequest build() { return null; }
    }
}
