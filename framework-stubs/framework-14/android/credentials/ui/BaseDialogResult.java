package android.credentials.ui;

public class BaseDialogResult implements android.os.Parcelable {
    public static final int RESULT_CODE_DIALOG_USER_CANCELED = 0;
    public static final int RESULT_CODE_CANCELED_AND_LAUNCHED_SETTINGS = 1;
    public static final int RESULT_CODE_DIALOG_COMPLETE_WITH_SELECTION = 2;
    public static final int RESULT_CODE_DATA_PARSING_FAILURE = 3;
    public static final android.os.Parcelable.Creator<android.credentials.ui.BaseDialogResult> CREATOR = null;
    public static android.credentials.ui.BaseDialogResult fromResultData(android.os.Bundle p0) { return null; }
    public static void addToBundle(android.credentials.ui.BaseDialogResult p0, android.os.Bundle p1) {}
    public BaseDialogResult(android.os.IBinder p0) {}
    public android.os.IBinder getRequestToken() { return null; }
    protected BaseDialogResult(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
