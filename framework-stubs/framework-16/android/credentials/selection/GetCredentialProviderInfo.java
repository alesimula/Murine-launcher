package android.credentials.selection;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
public final class GetCredentialProviderInfo {
    GetCredentialProviderInfo(java.lang.String p0, java.util.List<android.credentials.selection.Entry> p1, java.util.List<android.credentials.selection.Entry> p2, java.util.List<android.credentials.selection.AuthenticationEntry> p3, android.credentials.selection.Entry p4) {}
    @android.annotation.NonNull
    public java.lang.String getProviderName() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.credentials.selection.Entry> getCredentialEntries() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.credentials.selection.Entry> getActionChips() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.credentials.selection.AuthenticationEntry> getAuthenticationEntries() { return null; }
    @android.annotation.Nullable
    public android.credentials.selection.Entry getRemoteEntry() { return null; }

    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.credentials.selection.GetCredentialProviderInfo.Builder setCredentialEntries(java.util.List<android.credentials.selection.Entry> p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.GetCredentialProviderInfo.Builder setActionChips(java.util.List<android.credentials.selection.Entry> p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.GetCredentialProviderInfo.Builder setAuthenticationEntries(java.util.List<android.credentials.selection.AuthenticationEntry> p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.GetCredentialProviderInfo.Builder setRemoteEntry(android.credentials.selection.Entry p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.GetCredentialProviderInfo build() { return null; }
    }
}
