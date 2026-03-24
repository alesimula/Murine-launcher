package android.filterfw.core;

public class AsyncRunner extends android.filterfw.core.GraphRunner {
    private java.lang.Class mSchedulerClass;
    private android.filterfw.core.SyncRunner mRunner;
    private android.filterfw.core.AsyncRunner.AsyncRunnerTask mRunTask;
    private android.filterfw.core.GraphRunner.OnRunnerDoneListener mDoneListener;
    private boolean isProcessing;
    private java.lang.Exception mException;
    private boolean mLogVerbose;
    private static final java.lang.String TAG = "AsyncRunner";
    public AsyncRunner(android.filterfw.core.FilterContext p0, java.lang.Class p1) { super(null); }
    public AsyncRunner(android.filterfw.core.FilterContext p0) { super(null); }
    public void setDoneCallback(android.filterfw.core.GraphRunner.OnRunnerDoneListener p0) {}
    public synchronized void setGraph(android.filterfw.core.FilterGraph p0) {}
    public android.filterfw.core.FilterGraph getGraph() { return null; }
    public synchronized void run() {}
    public synchronized void stop() {}
    public synchronized void close() {}
    public synchronized boolean isRunning() { return false; }
    public synchronized java.lang.Exception getError() { return null; }
    private synchronized void setRunning(boolean p0) {}
    private synchronized void setException(java.lang.Exception p0) {}

    private class AsyncRunnerTask extends android.os.AsyncTask<android.filterfw.core.SyncRunner, java.lang.Void, android.filterfw.core.AsyncRunner.RunnerResult> {
        private static final java.lang.String TAG = "AsyncRunnerTask";
        private AsyncRunnerTask(android.filterfw.core.AsyncRunner p0) { super(); }
        protected android.filterfw.core.AsyncRunner.RunnerResult doInBackground(android.filterfw.core.SyncRunner... p0) { return null; }
        protected void onCancelled(android.filterfw.core.AsyncRunner.RunnerResult p0) {}
        protected void onPostExecute(android.filterfw.core.AsyncRunner.RunnerResult p0) {}
    }

    private class RunnerResult {
        public int status;
        public java.lang.Exception exception;
        private RunnerResult(android.filterfw.core.AsyncRunner p0) {}
    }
}
