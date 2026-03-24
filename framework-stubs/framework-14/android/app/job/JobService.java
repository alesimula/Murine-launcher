package android.app.job;

public abstract class JobService extends android.app.Service {
    public static final java.lang.String PERMISSION_BIND = "android.permission.BIND_JOB_SERVICE";
    public static final int JOB_END_NOTIFICATION_POLICY_DETACH = 0;
    public static final int JOB_END_NOTIFICATION_POLICY_REMOVE = 1;
    public JobService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final void jobFinished(android.app.job.JobParameters p0, boolean p1) {}
    public abstract boolean onStartJob(android.app.job.JobParameters p0);
    public abstract boolean onStopJob(android.app.job.JobParameters p0);
    public void onNetworkChanged(android.app.job.JobParameters p0) {}
    public final void updateEstimatedNetworkBytes(android.app.job.JobParameters p0, long p1, long p2) {}
    public final void updateEstimatedNetworkBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1, long p2, long p3) {}
    public final void updateTransferredNetworkBytes(android.app.job.JobParameters p0, long p1, long p2) {}
    public final void updateTransferredNetworkBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1, long p2, long p3) {}
    public long getTransferredDownloadBytes(android.app.job.JobParameters p0) { return 0L; }
    public long getTransferredUploadBytes(android.app.job.JobParameters p0) { return 0L; }
    public long getTransferredDownloadBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1) { return 0L; }
    public long getTransferredUploadBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1) { return 0L; }
    public final void setNotification(android.app.job.JobParameters p0, int p1, android.app.Notification p2, int p3) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface JobEndNotificationPolicy {
    }
}
