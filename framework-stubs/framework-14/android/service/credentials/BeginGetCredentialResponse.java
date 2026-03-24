package android.service.credentials;

public final class BeginGetCredentialResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.credentials.BeginGetCredentialResponse> CREATOR = null;
    public BeginGetCredentialResponse() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.util.List<android.service.credentials.CredentialEntry> getCredentialEntries() { return null; }
    public java.util.List<android.service.credentials.Action> getAuthenticationActions() { return null; }
    public java.util.List<android.service.credentials.Action> getActions() { return null; }
    public android.service.credentials.RemoteEntry getRemoteCredentialEntry() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.RequiresPermission("android.permission.PROVIDE_REMOTE_CREDENTIALS")
        public android.service.credentials.BeginGetCredentialResponse.Builder setRemoteCredentialEntry(android.service.credentials.RemoteEntry p0) { return null; }
        public android.service.credentials.BeginGetCredentialResponse.Builder addCredentialEntry(android.service.credentials.CredentialEntry p0) { return null; }
        public android.service.credentials.BeginGetCredentialResponse.Builder addAuthenticationAction(android.service.credentials.Action p0) { return null; }
        public android.service.credentials.BeginGetCredentialResponse.Builder addAction(android.service.credentials.Action p0) { return null; }
        public android.service.credentials.BeginGetCredentialResponse.Builder setActions(java.util.List<android.service.credentials.Action> p0) { return null; }
        public android.service.credentials.BeginGetCredentialResponse.Builder setCredentialEntries(java.util.List<android.service.credentials.CredentialEntry> p0) { return null; }
        public android.service.credentials.BeginGetCredentialResponse.Builder setAuthenticationActions(java.util.List<android.service.credentials.Action> p0) { return null; }
        public android.service.credentials.BeginGetCredentialResponse build() { return null; }
    }
}
