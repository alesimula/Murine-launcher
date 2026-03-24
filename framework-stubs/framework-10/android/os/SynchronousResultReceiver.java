package android.os;

public class SynchronousResultReceiver extends android.os.ResultReceiver {
    private final java.util.concurrent.CompletableFuture<android.os.SynchronousResultReceiver.Result> mFuture = null;
    private final java.lang.String mName = null;
    public SynchronousResultReceiver() { super((android.os.Handler)null); }
    public SynchronousResultReceiver(java.lang.String p0) { super((android.os.Handler)null); }
    protected final void onReceiveResult(int p0, android.os.Bundle p1) {}
    public java.lang.String getName() { return null; }
    public android.os.SynchronousResultReceiver.Result awaitResult(long p0) throws java.util.concurrent.TimeoutException { return null; }

    public static class Result {
        public int resultCode;
        public android.os.Bundle bundle;
        public Result(int p0, android.os.Bundle p1) {}
    }
}
