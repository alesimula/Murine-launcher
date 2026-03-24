package android.service.credentials;

public final class BeginGetCredentialRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.credentials.BeginGetCredentialRequest> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.service.credentials.CallingAppInfo getCallingAppInfo() { return null; }
    public java.util.List<android.service.credentials.BeginGetCredentialOption> getBeginGetCredentialOptions() { return null; }

    public static final class Builder {
        public Builder() {}
        public android.service.credentials.BeginGetCredentialRequest.Builder setCallingAppInfo(android.service.credentials.CallingAppInfo p0) { return null; }
        public android.service.credentials.BeginGetCredentialRequest.Builder setBeginGetCredentialOptions(java.util.List<android.service.credentials.BeginGetCredentialOption> p0) { return null; }
        public android.service.credentials.BeginGetCredentialRequest.Builder addBeginGetCredentialOption(android.service.credentials.BeginGetCredentialOption p0) { return null; }
        public android.service.credentials.BeginGetCredentialRequest build() { return null; }
    }
}
