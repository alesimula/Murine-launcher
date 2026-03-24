package android.app.appsearch;

public final class AppSearchResult<ValueType extends java.lang.Object> {
    private static final java.lang.String TAG = "AppSearchResult";
    public static final int RESULT_OK = 0;
    public static final int RESULT_UNKNOWN_ERROR = 1;
    public static final int RESULT_INTERNAL_ERROR = 2;
    public static final int RESULT_INVALID_ARGUMENT = 3;
    public static final int RESULT_IO_ERROR = 4;
    public static final int RESULT_OUT_OF_SPACE = 5;
    public static final int RESULT_NOT_FOUND = 6;
    public static final int RESULT_INVALID_SCHEMA = 7;
    public static final int RESULT_SECURITY_ERROR = 8;
    private final int mResultCode = 0;
    private final java.lang.String mErrorMessage = null;
    private AppSearchResult(int p0, ValueType p1, java.lang.String p2) {}
    public boolean isSuccess() { return false; }
    public int getResultCode() { return 0; }
    public ValueType getResultValue() { return null; }
    public java.lang.String getErrorMessage() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public static <ValueType extends java.lang.Object> android.app.appsearch.AppSearchResult<ValueType> newSuccessfulResult(ValueType p0) { return null; }
    public static <ValueType extends java.lang.Object> android.app.appsearch.AppSearchResult<ValueType> newFailedResult(int p0, java.lang.String p1) { return null; }
    public static <ValueType extends java.lang.Object> android.app.appsearch.AppSearchResult<ValueType> newFailedResult(android.app.appsearch.AppSearchResult<?> p0) { return null; }
    public static <ValueType extends java.lang.Object> android.app.appsearch.AppSearchResult<ValueType> throwableToFailedResult(java.lang.Throwable p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
