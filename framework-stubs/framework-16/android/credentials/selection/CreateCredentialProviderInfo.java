package android.credentials.selection;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
public final class CreateCredentialProviderInfo {
    CreateCredentialProviderInfo(java.lang.String p0, java.util.List<android.credentials.selection.Entry> p1, android.credentials.selection.Entry p2) {}
    @android.annotation.NonNull
    public java.lang.String getProviderName() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.credentials.selection.Entry> getSaveEntries() { return null; }
    @android.annotation.Nullable
    public android.credentials.selection.Entry getRemoteEntry() { return null; }

    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.credentials.selection.CreateCredentialProviderInfo.Builder setSaveEntries(java.util.List<android.credentials.selection.Entry> p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.CreateCredentialProviderInfo.Builder setRemoteEntry(android.credentials.selection.Entry p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.CreateCredentialProviderInfo build() { return null; }
    }
}
