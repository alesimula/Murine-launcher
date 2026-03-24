package android.view.inputmethod;

public final class TextBoundsInfoResult {
    public static final int CODE_UNSUPPORTED = 0;
    public static final int CODE_SUCCESS = 1;
    public static final int CODE_FAILED = 2;
    public static final int CODE_CANCELLED = 3;
    public TextBoundsInfoResult(int p0) {}
    public TextBoundsInfoResult(int p0, android.view.inputmethod.TextBoundsInfo p1) {}
    public int getResultCode() { return 0; }
    @android.annotation.Nullable
    public android.view.inputmethod.TextBoundsInfo getTextBoundsInfo() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
