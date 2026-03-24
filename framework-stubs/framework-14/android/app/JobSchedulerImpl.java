package android.app;

public class JobSchedulerImpl extends android.app.job.JobScheduler {
    android.app.job.IJobScheduler mBinder;
    public JobSchedulerImpl(android.content.Context p0, android.app.job.IJobScheduler p1) { super(); }
    public android.app.job.JobScheduler forNamespace(java.lang.String p0) { return null; }
    public java.lang.String getNamespace() { return null; }
    public int schedule(android.app.job.JobInfo p0) { return 0; }
    public int enqueue(android.app.job.JobInfo p0, android.app.job.JobWorkItem p1) { return 0; }
    public int scheduleAsPackage(android.app.job.JobInfo p0, java.lang.String p1, int p2, java.lang.String p3) { return 0; }
    public void cancel(int p0) {}
    public void cancelAll() {}
    public void cancelInAllNamespaces() {}
    public java.util.List<android.app.job.JobInfo> getAllPendingJobs() { return null; }
    public java.util.Map<java.lang.String, java.util.List<android.app.job.JobInfo>> getPendingJobsInAllNamespaces() { return null; }
    public android.app.job.JobInfo getPendingJob(int p0) { return null; }
    public int getPendingJobReason(int p0) { return 0; }
    public boolean canRunUserInitiatedJobs() { return false; }
    public boolean hasRunUserInitiatedJobsPermission(java.lang.String p0, int p1) { return false; }
    public java.util.List<android.app.job.JobInfo> getStartedJobs() { return null; }
    public java.util.List<android.app.job.JobSnapshot> getAllJobSnapshots() { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.MANAGE_ACTIVITY_TASKS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void registerUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.MANAGE_ACTIVITY_TASKS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void unregisterUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.MANAGE_ACTIVITY_TASKS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void notePendingUserRequestedAppStop(java.lang.String p0, int p1, java.lang.String p2) {}
}
