package android.credentials.selection;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
public final class FailureResult {
    public static final int ERROR_CODE_UI_FAILURE = 0;
    public static final int ERROR_CODE_DIALOG_CANCELED_BY_USER = 1;
    public static final int ERROR_CODE_CANCELED_AND_LAUNCHED_SETTINGS = 2;
    public static void sendFailureResult(android.os.ResultReceiver p0, android.credentials.selection.FailureResult p1) {}
    public FailureResult(int p0, java.lang.String p1) {}
    public int getErrorCode() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getErrorMessage() { return null; }
    android.credentials.selection.FailureDialogResult toFailureDialogResult() { return null; }
    int errorCodeToResultCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }
}
