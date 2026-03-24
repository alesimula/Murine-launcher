package android.app.appfunctions;

public class SafeOneTimeExecuteAppFunctionCallback {
    public SafeOneTimeExecuteAppFunctionCallback(android.app.appfunctions.IExecuteAppFunctionCallback p0) {}
    public SafeOneTimeExecuteAppFunctionCallback(android.app.appfunctions.IExecuteAppFunctionCallback p0, android.app.appfunctions.SafeOneTimeExecuteAppFunctionCallback.CompletionCallback p1) {}
    public void onResult(android.app.appfunctions.ExecuteAppFunctionResponse p0) {}
    public void onError(android.app.appfunctions.AppFunctionException p0) {}
    public void disable() {}
    public void setExecutionStartTimeAfterBindMillis(long p0) {}

    public static interface CompletionCallback {
        public void finalizeOnSuccess(android.app.appfunctions.ExecuteAppFunctionResponse p0, long p1);
        public void finalizeOnError(android.app.appfunctions.AppFunctionException p0, long p1);
    }
}
