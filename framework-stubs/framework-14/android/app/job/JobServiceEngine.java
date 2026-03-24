package android.app.job;

public abstract class JobServiceEngine {
    android.app.job.JobServiceEngine.JobHandler mHandler;
    public JobServiceEngine(android.app.Service p0) {}
    public final android.os.IBinder getBinder() { return null; }
    public abstract boolean onStartJob(android.app.job.JobParameters p0);
    public abstract boolean onStopJob(android.app.job.JobParameters p0);
    public void jobFinished(android.app.job.JobParameters p0, boolean p1) {}
    public void onNetworkChanged(android.app.job.JobParameters p0) {}
    public long getTransferredDownloadBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1) { return 0L; }
    public long getTransferredUploadBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1) { return 0L; }
    public void updateTransferredNetworkBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1, long p2, long p3) {}
    public void updateEstimatedNetworkBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1, long p2, long p3) {}
    public void setNotification(android.app.job.JobParameters p0, int p1, android.app.Notification p2, int p3) {}

    class JobHandler extends android.os.Handler {
        JobHandler(android.app.job.JobServiceEngine p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    static final class JobInterface extends android.app.job.IJobService.Stub {
        final java.lang.ref.WeakReference<android.app.job.JobServiceEngine> mService = null;
        JobInterface(android.app.job.JobServiceEngine p0) { super(); }
        public void getTransferredDownloadBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1) throws android.os.RemoteException {}
        public void getTransferredUploadBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1) throws android.os.RemoteException {}
        public void startJob(android.app.job.JobParameters p0) throws android.os.RemoteException {}
        public void onNetworkChanged(android.app.job.JobParameters p0) throws android.os.RemoteException {}
        public void stopJob(android.app.job.JobParameters p0) throws android.os.RemoteException {}
    }
}
