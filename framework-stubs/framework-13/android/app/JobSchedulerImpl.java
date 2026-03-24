package android.app;

public class JobSchedulerImpl extends android.app.job.JobScheduler {
    android.app.job.IJobScheduler mBinder;
    public JobSchedulerImpl(android.app.job.IJobScheduler p0) { super(); }
    public int schedule(android.app.job.JobInfo p0) { return 0; }
    public int enqueue(android.app.job.JobInfo p0, android.app.job.JobWorkItem p1) { return 0; }
    public int scheduleAsPackage(android.app.job.JobInfo p0, java.lang.String p1, int p2, java.lang.String p3) { return 0; }
    public void cancel(int p0) {}
    public void cancelAll() {}
    public java.util.List<android.app.job.JobInfo> getAllPendingJobs() { return null; }
    public android.app.job.JobInfo getPendingJob(int p0) { return null; }
    public java.util.List<android.app.job.JobInfo> getStartedJobs() { return null; }
    public java.util.List<android.app.job.JobSnapshot> getAllJobSnapshots() { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.MANAGE_ACTIVITY_TASKS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void registerUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.MANAGE_ACTIVITY_TASKS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void unregisterUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.MANAGE_ACTIVITY_TASKS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void stopUserVisibleJobsForUser(java.lang.String p0, int p1) {}
}
