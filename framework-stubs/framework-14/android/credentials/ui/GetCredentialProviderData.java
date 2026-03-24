package android.credentials.ui;

public final class GetCredentialProviderData extends android.credentials.ui.ProviderData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.ui.GetCredentialProviderData> CREATOR = null;
    public GetCredentialProviderData(java.lang.String p0, java.util.List<android.credentials.ui.Entry> p1, java.util.List<android.credentials.ui.Entry> p2, java.util.List<android.credentials.ui.AuthenticationEntry> p3, android.credentials.ui.Entry p4) { super((java.lang.String)null); }
    public java.util.List<android.credentials.ui.Entry> getCredentialEntries() { return null; }
    public java.util.List<android.credentials.ui.Entry> getActionChips() { return null; }
    public java.util.List<android.credentials.ui.AuthenticationEntry> getAuthenticationEntries() { return null; }
    public android.credentials.ui.Entry getRemoteEntry() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        public android.credentials.ui.GetCredentialProviderData.Builder setCredentialEntries(java.util.List<android.credentials.ui.Entry> p0) { return null; }
        public android.credentials.ui.GetCredentialProviderData.Builder setActionChips(java.util.List<android.credentials.ui.Entry> p0) { return null; }
        public android.credentials.ui.GetCredentialProviderData.Builder setAuthenticationEntries(java.util.List<android.credentials.ui.AuthenticationEntry> p0) { return null; }
        public android.credentials.ui.GetCredentialProviderData.Builder setRemoteEntry(android.credentials.ui.Entry p0) { return null; }
        public android.credentials.ui.GetCredentialProviderData build() { return null; }
    }
}
