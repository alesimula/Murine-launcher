package android.credentials;

public final class GetCredentialRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.credentials.GetCredentialRequest> CREATOR = null;
    @android.annotation.NonNull
    public java.util.List<android.credentials.CredentialOption> getCredentialOptions() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getData() { return null; }
    @android.annotation.Nullable
    public java.lang.String getOrigin() { return null; }
    public boolean alwaysSendAppInfoToProvider() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(android.os.Bundle p0) {}
        @android.annotation.NonNull
        public android.credentials.GetCredentialRequest.Builder addCredentialOption(android.credentials.CredentialOption p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.NonNull
        public android.credentials.GetCredentialRequest.Builder setAlwaysSendAppInfoToProvider(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.GetCredentialRequest.Builder setCredentialOptions(java.util.List<android.credentials.CredentialOption> p0) { return null; }
        @android.annotation.SuppressLint({"MissingGetterMatchingBuilder", "AndroidFrameworkRequiresPermission"})
        @android.annotation.RequiresPermission("android.permission.CREDENTIAL_MANAGER_SET_ORIGIN")
        @android.annotation.NonNull
        public android.credentials.GetCredentialRequest.Builder setOrigin(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.GetCredentialRequest build() { return null; }
    }
}
