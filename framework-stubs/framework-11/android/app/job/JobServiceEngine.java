package android.app.job;

public abstract class JobServiceEngine {
    private static final java.lang.String TAG = "JobServiceEngine";
    private static final int MSG_EXECUTE_JOB = 0;
    private static final int MSG_STOP_JOB = 1;
    private static final int MSG_JOB_FINISHED = 2;
    private final android.app.job.IJobService mBinder = null;
    android.app.job.JobServiceEngine.JobHandler mHandler;
    public JobServiceEngine(android.app.Service p0) {}
    public final android.os.IBinder getBinder() { return null; }
    public abstract boolean onStartJob(android.app.job.JobParameters p0);
    public abstract boolean onStopJob(android.app.job.JobParameters p0);
    public void jobFinished(android.app.job.JobParameters p0, boolean p1) {}

    class JobHandler extends android.os.Handler {
        JobHandler(android.app.job.JobServiceEngine p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
        private void ackStartMessage(android.app.job.JobParameters p0, boolean p1) {}
        private void ackStopMessage(android.app.job.JobParameters p0, boolean p1) {}
    }

    static final class JobInterface extends android.app.job.IJobService.Stub {
        final java.lang.ref.WeakReference<android.app.job.JobServiceEngine> mService = null;
        JobInterface(android.app.job.JobServiceEngine p0) { super(); }
        public void startJob(android.app.job.JobParameters p0) throws android.os.RemoteException {}
        public void stopJob(android.app.job.JobParameters p0) throws android.os.RemoteException {}
    }
}
