package android.security;

public class AndroidProtectedConfirmation {
    private static final java.lang.String TAG = "AndroidProtectedConfirmation";
    public static final int ERROR_OK = 0;
    public static final int ERROR_CANCELED = 1;
    public static final int ERROR_ABORTED = 2;
    public static final int ERROR_OPERATION_PENDING = 3;
    public static final int ERROR_IGNORED = 4;
    public static final int ERROR_SYSTEM_ERROR = 5;
    public static final int ERROR_UNIMPLEMENTED = 6;
    public static final int FLAG_UI_OPTION_INVERTED = 1;
    public static final int FLAG_UI_OPTION_MAGNIFIED = 2;
    private android.security.apc.IProtectedConfirmation mProtectedConfirmation;
    public AndroidProtectedConfirmation() {}
    private synchronized android.security.apc.IProtectedConfirmation getService() { return null; }
    public int presentConfirmationPrompt(android.security.apc.IConfirmationCallback p0, java.lang.String p1, byte[] p2, java.lang.String p3, int p4) { return 0; }
    public int cancelConfirmationPrompt(android.security.apc.IConfirmationCallback p0) { return 0; }
    public boolean isConfirmationPromptSupported() { return false; }
}
