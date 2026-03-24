package android.credentials.selection;

@android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
public final class CreateCredentialProviderData extends android.credentials.selection.ProviderData implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.credentials.selection.CreateCredentialProviderData> CREATOR = null;
    public CreateCredentialProviderData(java.lang.String p0, java.util.List<android.credentials.selection.Entry> p1, android.credentials.selection.Entry p2) { super((java.lang.String)null); }
    @android.annotation.NonNull
    public android.credentials.selection.CreateCredentialProviderInfo toCreateCredentialProviderInfo() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.credentials.selection.Entry> getSaveEntries() { return null; }
    @android.annotation.Nullable
    public android.credentials.selection.Entry getRemoteEntry() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.credentials.selection.CreateCredentialProviderData.Builder setSaveEntries(java.util.List<android.credentials.selection.Entry> p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.CreateCredentialProviderData.Builder setRemoteEntry(android.credentials.selection.Entry p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.CreateCredentialProviderData build() { return null; }
    }
}
