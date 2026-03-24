package android.credentials.selection;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
public final class Entry implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.credentials.selection.Entry> CREATOR = null;
    public Entry(java.lang.String p0, java.lang.String p1, android.app.slice.Slice p2, android.content.Intent p3) {}
    @android.annotation.NonNull
    public java.lang.String getKey() { return null; }
    @android.annotation.NonNull
    public java.lang.String getSubkey() { return null; }
    @android.annotation.NonNull
    public android.app.slice.Slice getSlice() { return null; }
    @android.annotation.Nullable
    @android.annotation.SuppressLint("IntentBuilderName")
    public android.content.Intent getFrameworkExtrasIntent() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
