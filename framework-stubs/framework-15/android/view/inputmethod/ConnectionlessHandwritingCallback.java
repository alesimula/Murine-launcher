package android.view.inputmethod;

@android.annotation.FlaggedApi("android.view.inputmethod.connectionless_handwriting")
public interface ConnectionlessHandwritingCallback {
    public static final int CONNECTIONLESS_HANDWRITING_ERROR_NO_TEXT_RECOGNIZED = 0;
    public static final int CONNECTIONLESS_HANDWRITING_ERROR_UNSUPPORTED = 1;
    public static final int CONNECTIONLESS_HANDWRITING_ERROR_OTHER = 2;
    public void onResult(java.lang.CharSequence p0);
    public void onError(int p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionlessHandwritingError {
    }
}
