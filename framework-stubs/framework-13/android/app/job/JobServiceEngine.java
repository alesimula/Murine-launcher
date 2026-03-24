package android.app.job;

public abstract class JobServiceEngine {
    android.app.job.JobServiceEngine.JobHandler mHandler;
    public JobServiceEngine(android.app.Service p0) {}
    public final android.os.IBinder getBinder() { return null; }
    public abstract boolean onStartJob(android.app.job.JobParameters p0);
    public abstract boolean onStopJob(android.app.job.JobParameters p0);
    public void jobFinished(android.app.job.JobParameters p0, boolean p1) {}

    class JobHandler extends android.os.Handler {
        JobHandler(android.app.job.JobServiceEngine p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    static final class JobInterface extends android.app.job.IJobService.Stub {
        final java.lang.ref.WeakReference<android.app.job.JobServiceEngine> mService = null;
        JobInterface(android.app.job.JobServiceEngine p0) { super(); }
        public void startJob(android.app.job.JobParameters p0) throws android.os.RemoteException {}
        public void stopJob(android.app.job.JobParameters p0) throws android.os.RemoteException {}
    }
}
