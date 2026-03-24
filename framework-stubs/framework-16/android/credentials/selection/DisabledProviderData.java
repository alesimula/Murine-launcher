package android.credentials.selection;

@android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
public final class DisabledProviderData extends android.credentials.selection.ProviderData implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.credentials.selection.DisabledProviderData> CREATOR = null;
    public DisabledProviderData(java.lang.String p0) { super((java.lang.String)null); }
    @android.annotation.NonNull
    public android.credentials.selection.DisabledProviderInfo toDisabledProviderInfo() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
