package android.credentials.selection;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
public final class CancelSelectionRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final java.lang.String EXTRA_CANCEL_UI_REQUEST = "android.credentials.selection.extra.CANCEL_UI_REQUEST";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.credentials.selection.CancelSelectionRequest> CREATOR = null;
    @android.annotation.NonNull
    public android.os.IBinder getToken() { return null; }
    @android.annotation.NonNull
    public android.credentials.selection.RequestToken getRequestToken() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    public boolean shouldShowCancellationExplanation() { return false; }
    public CancelSelectionRequest(android.credentials.selection.RequestToken p0, boolean p1, java.lang.String p2) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
