package android.credentials.selection;

@android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
public final class GetCredentialProviderData extends android.credentials.selection.ProviderData implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.credentials.selection.GetCredentialProviderData> CREATOR = null;
    public GetCredentialProviderData(java.lang.String p0, java.util.List<android.credentials.selection.Entry> p1, java.util.List<android.credentials.selection.Entry> p2, java.util.List<android.credentials.selection.AuthenticationEntry> p3, android.credentials.selection.Entry p4) { super((java.lang.String)null); }
    @android.annotation.NonNull
    public android.credentials.selection.GetCredentialProviderInfo toGetCredentialProviderInfo() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.credentials.selection.Entry> getCredentialEntries() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.credentials.selection.Entry> getActionChips() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.credentials.selection.AuthenticationEntry> getAuthenticationEntries() { return null; }
    @android.annotation.Nullable
    public android.credentials.selection.Entry getRemoteEntry() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.credentials.selection.GetCredentialProviderData.Builder setCredentialEntries(java.util.List<android.credentials.selection.Entry> p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.GetCredentialProviderData.Builder setActionChips(java.util.List<android.credentials.selection.Entry> p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.GetCredentialProviderData.Builder setAuthenticationEntries(java.util.List<android.credentials.selection.AuthenticationEntry> p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.GetCredentialProviderData.Builder setRemoteEntry(android.credentials.selection.Entry p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.GetCredentialProviderData build() { return null; }
    }
}
