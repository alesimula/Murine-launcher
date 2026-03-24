package android.app.job;

public abstract class JobScheduler {
    public static final int RESULT_FAILURE = 0;
    public static final int RESULT_SUCCESS = 1;
    public JobScheduler() {}
    public abstract int schedule(android.app.job.JobInfo p0);
    public abstract int enqueue(android.app.job.JobInfo p0, android.app.job.JobWorkItem p1);
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public abstract int scheduleAsPackage(android.app.job.JobInfo p0, java.lang.String p1, int p2, java.lang.String p3);
    public abstract void cancel(int p0);
    public abstract void cancelAll();
    public abstract java.util.List<android.app.job.JobInfo> getAllPendingJobs();
    public abstract android.app.job.JobInfo getPendingJob(int p0);
    public abstract java.util.List<android.app.job.JobInfo> getStartedJobs();
    public abstract java.util.List<android.app.job.JobSnapshot> getAllJobSnapshots();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Result {
    }
}
