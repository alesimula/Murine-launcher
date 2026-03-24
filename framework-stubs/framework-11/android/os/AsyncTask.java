package android.os;

@java.lang.Deprecated
public abstract class AsyncTask<Params extends java.lang.Object, Progress extends java.lang.Object, Result extends java.lang.Object> {
    private static final java.lang.String LOG_TAG = "AsyncTask";
    private static final int CORE_POOL_SIZE = 1;
    private static final int MAXIMUM_POOL_SIZE = 20;
    private static final int BACKUP_POOL_SIZE = 5;
    private static final int KEEP_ALIVE_SECONDS = 3;
    private static final java.util.concurrent.ThreadFactory sThreadFactory = null;
    private static java.util.concurrent.ThreadPoolExecutor sBackupExecutor;
    private static java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> sBackupExecutorQueue;
    private static final java.util.concurrent.RejectedExecutionHandler sRunOnSerialPolicy = null;
    @java.lang.Deprecated
    public static final java.util.concurrent.Executor THREAD_POOL_EXECUTOR = null;
    @java.lang.Deprecated
    public static final java.util.concurrent.Executor SERIAL_EXECUTOR = null;
    private static final int MESSAGE_POST_RESULT = 1;
    private static final int MESSAGE_POST_PROGRESS = 2;
    private static volatile java.util.concurrent.Executor sDefaultExecutor;
    private static android.os.AsyncTask.InternalHandler sHandler;
    private final android.os.AsyncTask.WorkerRunnable<Params, Result> mWorker = null;
    private final java.util.concurrent.FutureTask<Result> mFuture = null;
    private volatile android.os.AsyncTask.Status mStatus;
    private final java.util.concurrent.atomic.AtomicBoolean mCancelled = null;
    private final java.util.concurrent.atomic.AtomicBoolean mTaskInvoked = null;
    private final android.os.Handler mHandler = null;
    private static android.os.Handler getMainHandler() { return null; }
    private android.os.Handler getHandler() { return null; }
    public static void setDefaultExecutor(java.util.concurrent.Executor p0) {}
    public AsyncTask() {}
    public AsyncTask(android.os.Handler p0) {}
    public AsyncTask(android.os.Looper p0) {}
    private void postResultIfNotInvoked(Result p0) {}
    private Result postResult(Result p0) { return null; }
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
    private void finish(Result p0) {}

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
        private SerialExecutor() {}
        public synchronized void execute(java.lang.Runnable p0) {}
        protected synchronized void scheduleNext() {}
    }

    public static enum Status {
        PENDING,
        RUNNING,
        FINISHED;
        private Status() {}
    }

    private static abstract class WorkerRunnable<Params extends java.lang.Object, Result extends java.lang.Object> implements java.util.concurrent.Callable<Result> {
        private WorkerRunnable() {}
    }
}
