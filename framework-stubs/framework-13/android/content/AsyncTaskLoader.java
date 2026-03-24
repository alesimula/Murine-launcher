package android.content;

@java.lang.Deprecated
public abstract class AsyncTaskLoader<D extends java.lang.Object> extends android.content.Loader<D> {
    static final java.lang.String TAG = "AsyncTaskLoader";
    static final boolean DEBUG = false;
    volatile android.content.AsyncTaskLoader<D>.LoadTask mTask;
    volatile android.content.AsyncTaskLoader<D>.LoadTask mCancellingTask;
    long mUpdateThrottle;
    long mLastLoadCompleteTime;
    android.os.Handler mHandler;
    public AsyncTaskLoader(android.content.Context p0) { super(null); }
    public AsyncTaskLoader(android.content.Context p0, java.util.concurrent.Executor p1) { super(null); }
    public void setUpdateThrottle(long p0) {}
    protected void onForceLoad() {}
    protected boolean onCancelLoad() { return false; }
    public void onCanceled(D p0) {}
    void executePendingTask() {}
    void dispatchOnCancelled(android.content.AsyncTaskLoader<D>.LoadTask p0, D p1) {}
    void dispatchOnLoadComplete(android.content.AsyncTaskLoader<D>.LoadTask p0, D p1) {}
    public abstract D loadInBackground();
    protected D onLoadInBackground() { return null; }
    public void cancelLoadInBackground() {}
    public boolean isLoadInBackgroundCanceled() { return false; }
    public void waitForLoader() {}
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}

    final class LoadTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, D> implements java.lang.Runnable {
        boolean waiting;
        LoadTask(android.content.AsyncTaskLoader p0) { super(); }
        protected D doInBackground(java.lang.Void... p0) { return null; }
        protected void onPostExecute(D p0) {}
        protected void onCancelled(D p0) {}
        public void run() {}
        public void waitForLoader() {}
    }
}
