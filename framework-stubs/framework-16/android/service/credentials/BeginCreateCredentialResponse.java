package android.service.credentials;

public final class BeginCreateCredentialResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.credentials.BeginCreateCredentialResponse> CREATOR = null;
    public BeginCreateCredentialResponse() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    BeginCreateCredentialResponse(android.content.pm.ParceledListSlice<android.service.credentials.CreateEntry> p0, android.service.credentials.RemoteEntry p1) {}
    @android.annotation.NonNull
    public java.util.List<android.service.credentials.CreateEntry> getCreateEntries() { return null; }
    @android.annotation.Nullable
    public android.service.credentials.RemoteEntry getRemoteCreateEntry() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.service.credentials.BeginCreateCredentialResponse.Builder setCreateEntries(java.util.List<android.service.credentials.CreateEntry> p0) { return null; }
        @android.annotation.NonNull
        public android.service.credentials.BeginCreateCredentialResponse.Builder addCreateEntry(android.service.credentials.CreateEntry p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.PROVIDE_REMOTE_CREDENTIALS")
        @android.annotation.NonNull
        public android.service.credentials.BeginCreateCredentialResponse.Builder setRemoteCreateEntry(android.service.credentials.RemoteEntry p0) { return null; }
        @android.annotation.NonNull
        public android.service.credentials.BeginCreateCredentialResponse build() { return null; }
    }
}
