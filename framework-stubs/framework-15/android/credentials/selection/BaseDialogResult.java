package android.credentials.selection;

@android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
@android.annotation.SuppressLint("ParcelNotFinal")
public class BaseDialogResult implements android.os.Parcelable {
    public static final int RESULT_CODE_DIALOG_USER_CANCELED = 0;
    public static final int RESULT_CODE_CANCELED_AND_LAUNCHED_SETTINGS = 1;
    public static final int RESULT_CODE_DIALOG_COMPLETE_WITH_SELECTION = 2;
    public static final int RESULT_CODE_DATA_PARSING_FAILURE = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.credentials.selection.BaseDialogResult> CREATOR = null;
    @android.annotation.Nullable
    public static android.credentials.selection.BaseDialogResult fromResultData(android.os.Bundle p0) { return null; }
    public static void addToBundle(android.credentials.selection.BaseDialogResult p0, android.os.Bundle p1) {}
    public BaseDialogResult(android.os.IBinder p0) {}
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.os.IBinder getRequestToken() { return null; }
    @android.annotation.SuppressLint("ParcelConstructor")
    protected BaseDialogResult(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
