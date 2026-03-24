package android.credentials.selection;

@android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
public final class UserSelectionDialogResult extends android.credentials.selection.BaseDialogResult implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.credentials.selection.UserSelectionDialogResult> CREATOR = null;
    @android.annotation.Nullable
    public static android.credentials.selection.UserSelectionDialogResult fromResultData(android.os.Bundle p0) { return null; }
    public static void addToBundle(android.credentials.selection.UserSelectionDialogResult p0, android.os.Bundle p1) {}
    public UserSelectionDialogResult(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { super((android.os.IBinder)null); }
    public UserSelectionDialogResult(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.credentials.selection.ProviderPendingIntentResponse p4) { super((android.os.IBinder)null); }
    @android.annotation.NonNull
    public java.lang.String getProviderId() { return null; }
    @android.annotation.NonNull
    public java.lang.String getEntryKey() { return null; }
    @android.annotation.NonNull
    public java.lang.String getEntrySubkey() { return null; }
    @android.annotation.Nullable
    public android.credentials.selection.ProviderPendingIntentResponse getPendingIntentProviderResponse() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
