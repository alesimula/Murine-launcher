package android.hardware.location;

@android.annotation.SystemApi
public class ContextHubTransaction<T extends java.lang.Object> {
    public static final int TYPE_LOAD_NANOAPP = 0;
    public static final int TYPE_UNLOAD_NANOAPP = 1;
    public static final int TYPE_ENABLE_NANOAPP = 2;
    public static final int TYPE_DISABLE_NANOAPP = 3;
    public static final int TYPE_QUERY_NANOAPPS = 4;
    @android.annotation.FlaggedApi("android.chre.flags.reliable_message")
    public static final int TYPE_RELIABLE_MESSAGE = 5;
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_FAILED_UNKNOWN = 1;
    public static final int RESULT_FAILED_BAD_PARAMS = 2;
    public static final int RESULT_FAILED_UNINITIALIZED = 3;
    public static final int RESULT_FAILED_BUSY = 4;
    public static final int RESULT_FAILED_AT_HUB = 5;
    public static final int RESULT_FAILED_TIMEOUT = 6;
    public static final int RESULT_FAILED_SERVICE_INTERNAL_FAILURE = 7;
    public static final int RESULT_FAILED_HAL_UNAVAILABLE = 8;
    @android.annotation.FlaggedApi("android.chre.flags.reliable_message")
    public static final int RESULT_FAILED_NOT_SUPPORTED = 9;
    ContextHubTransaction(int p0) {}
    public static java.lang.String typeToString(int p0, boolean p1) { return null; }
    public int getType() { return 0; }
    public android.hardware.location.ContextHubTransaction.Response<T> waitForResponse(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException { return null; }
    public void setOnCompleteListener(android.hardware.location.ContextHubTransaction.OnCompleteListener<T> p0, java.util.concurrent.Executor p1) {}
    public void setOnCompleteListener(android.hardware.location.ContextHubTransaction.OnCompleteListener<T> p0) {}
    void setResponse(android.hardware.location.ContextHubTransaction.Response<T> p0) {}

    @java.lang.FunctionalInterface
    public static interface OnCompleteListener<L extends java.lang.Object> {
        public void onComplete(android.hardware.location.ContextHubTransaction<L> p0, android.hardware.location.ContextHubTransaction.Response<L> p1);
    }

    public static class Response<R extends java.lang.Object> {
        Response(int p0, R p1) {}
        public int getResult() { return 0; }
        public R getContents() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Result {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
