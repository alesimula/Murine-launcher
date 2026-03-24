package android.credentials;

public final class GetCredentialRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.GetCredentialRequest> CREATOR = null;
    public java.util.List<android.credentials.CredentialOption> getCredentialOptions() { return null; }
    public android.os.Bundle getData() { return null; }
    public java.lang.String getOrigin() { return null; }
    public boolean alwaysSendAppInfoToProvider() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(android.os.Bundle p0) {}
        public android.credentials.GetCredentialRequest.Builder addCredentialOption(android.credentials.CredentialOption p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.credentials.GetCredentialRequest.Builder setAlwaysSendAppInfoToProvider(boolean p0) { return null; }
        public android.credentials.GetCredentialRequest.Builder setCredentialOptions(java.util.List<android.credentials.CredentialOption> p0) { return null; }
        @android.annotation.SuppressLint({"MissingGetterMatchingBuilder", "AndroidFrameworkRequiresPermission"})
        @android.annotation.RequiresPermission("android.permission.CREDENTIAL_MANAGER_SET_ORIGIN")
        public android.credentials.GetCredentialRequest.Builder setOrigin(java.lang.String p0) { return null; }
        public android.credentials.GetCredentialRequest build() { return null; }
    }
}
