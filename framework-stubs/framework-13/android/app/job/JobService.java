package android.app.job;

public abstract class JobService extends android.app.Service {
    public static final java.lang.String PERMISSION_BIND = "android.permission.BIND_JOB_SERVICE";
    public JobService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final void jobFinished(android.app.job.JobParameters p0, boolean p1) {}
    public abstract boolean onStartJob(android.app.job.JobParameters p0);
    public abstract boolean onStopJob(android.app.job.JobParameters p0);
}
