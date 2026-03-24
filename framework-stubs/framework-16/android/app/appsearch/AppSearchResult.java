package android.app.appsearch;

public final class AppSearchResult<ValueType extends java.lang.Object> {
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_result_aborted")
    public static final int RESULT_ABORTED = 13;
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_result_already_exists")
    public static final int RESULT_ALREADY_EXISTS = 12;
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_result_denied_and_result_rate_limited")
    public static final int RESULT_DENIED = 9;
    public static final int RESULT_INTERNAL_ERROR = 2;
    public static final int RESULT_INVALID_ARGUMENT = 3;
    public static final int RESULT_INVALID_SCHEMA = 7;
    public static final int RESULT_IO_ERROR = 4;
    public static final int RESULT_NOT_FOUND = 6;
    public static final int RESULT_OK = 0;
    public static final int RESULT_OUT_OF_SPACE = 5;
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_result_denied_and_result_rate_limited")
    public static final int RESULT_RATE_LIMITED = 10;
    public static final int RESULT_SECURITY_ERROR = 8;
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_result_unavailable")
    public static final int RESULT_UNAVAILABLE = 14;
    public static final int RESULT_UNKNOWN_ERROR = 1;
    AppSearchResult() {}
    @android.annotation.Nullable
    public java.lang.String getErrorMessage() { return null; }
    public int getResultCode() { return 0; }
    @android.annotation.Nullable
    public ValueType getResultValue() { return null; }
    public boolean isSuccess() { return false; }
    @android.annotation.NonNull
    public static <ValueType extends java.lang.Object> android.app.appsearch.AppSearchResult<ValueType> newFailedResult(int p0, java.lang.String p1) { return null; }
    @android.annotation.NonNull
    public static <ValueType extends java.lang.Object> android.app.appsearch.AppSearchResult<ValueType> newSuccessfulResult(ValueType p0) { return null; }
}
