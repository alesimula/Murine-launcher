package android.os;

@java.lang.Deprecated
public abstract class AsyncTask<Params extends java.lang.Object, Progress extends java.lang.Object, Result extends java.lang.Object> {
    @java.lang.Deprecated
    public static final java.util.concurrent.Executor THREAD_POOL_EXECUTOR = null;
    @java.lang.Deprecated
    public static final java.util.concurrent.Executor SERIAL_EXECUTOR = null;
    public static void setDefaultExecutor(java.util.concurrent.Executor p0) {}
    public AsyncTask() {}
    public AsyncTask(android.os.Handler p0) {}
    public AsyncTask(android.os.Looper p0) {}
    public final android.os.AsyncTask.Status getStatus() { return null; }
    protected abstract Result doInBackground(Params... p0);
    protected void onPreExecute() {}
    protected void onPostExecute(Result p0) {}
    protected void onProgressUpdate(Progress... p0) {}
    protected void onCancelled(Result p0) {}
    protected void onCancelled() {}
    public final boolean isCancelled() { return false; }
    public final boolean cancel(boolean p0) { return false; }
    public final Result get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException { return null; }
    public final Result get(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException { return null; }
    public final android.os.AsyncTask<Params, Progress, Result> execute(Params... p0) { return null; }
    public final android.os.AsyncTask<Params, Progress, Result> executeOnExecutor(java.util.concurrent.Executor p0, Params... p1) { return null; }
    public static void execute(java.lang.Runnable p0) {}
    protected final void publishProgress(Progress... p0) {}

    public static enum Status {
        PENDING,
        RUNNING,
        FINISHED;
    }

    private static class AsyncTaskResult<Data extends java.lang.Object> {
        final android.os.AsyncTask mTask = null;
        AsyncTaskResult(android.os.AsyncTask p0, Data... p1) {}
    }

    private static class InternalHandler extends android.os.Handler {
        public InternalHandler(android.os.Looper p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private static class SerialExecutor implements java.util.concurrent.Executor {
        final java.util.ArrayDeque<java.lang.Runnable> mTasks = null;
        java.lang.Runnable mActive;
        public synchronized void execute(java.lang.Runnable p0) {}
        protected synchronized void scheduleNext() {}
    }

    private static abstract class WorkerRunnable<Params extends java.lang.Object, Result extends java.lang.Object> implements java.util.concurrent.Callable<Result> {
    }
}
