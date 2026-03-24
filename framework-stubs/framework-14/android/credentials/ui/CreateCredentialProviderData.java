package android.credentials.ui;

public final class CreateCredentialProviderData extends android.credentials.ui.ProviderData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.ui.CreateCredentialProviderData> CREATOR = null;
    public CreateCredentialProviderData(java.lang.String p0, java.util.List<android.credentials.ui.Entry> p1, android.credentials.ui.Entry p2) { super((java.lang.String)null); }
    public java.util.List<android.credentials.ui.Entry> getSaveEntries() { return null; }
    public android.credentials.ui.Entry getRemoteEntry() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        public android.credentials.ui.CreateCredentialProviderData.Builder setSaveEntries(java.util.List<android.credentials.ui.Entry> p0) { return null; }
        public android.credentials.ui.CreateCredentialProviderData.Builder setRemoteEntry(android.credentials.ui.Entry p0) { return null; }
        public android.credentials.ui.CreateCredentialProviderData build() { return null; }
    }
}
